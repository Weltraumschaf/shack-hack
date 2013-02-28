/*
 *  LICENSE
 *
 * "THE BEER-WARE LICENSE" (Revision 43):
 * "Sven Strittmatter" <weltraumschaf@googlemail.com> wrote this file.
 * As long as you retain this notice you can do whatever you want with
 * this stuff. If we meet some day, and you think this stuff is worth it,
 * you can buy me a non alcohol-free beer in return.
 *
 * Copyright (C) 2012 "Sven Strittmatter" <weltraumschaf@googlemail.com>
 */
package de.weltraumschaf.shackhack;

import com.google.common.collect.Lists;
import com.google.common.io.Files;
import de.weltraumschaf.shackhack.antlr.ShackHackLexer;
import de.weltraumschaf.shackhack.antlr.ShackHackParser;
import jasmin.ClassFile;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.StringReader;
import java.util.Arrays;
import java.util.List;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;

/**
 *
 * @author Sven Strittmatter <weltraumschaf@googlemail.com>
 */
class Command implements Runnable {

    private static final String ENCODING = "UTF-8";
    private static final int ERR_NO_FILES_TOPARSE = -1;
    private static final int ERR_CANT_READ_FILE = -2;
    private static final int ERR_FOUND_ERRORS_IN_ASM = -3;
    private static final int ERR_EXCEPTION_DUROING_ASSEMBLY = -4;
    private final PrintStream out;
    private final List<String> args;
    private final List<String> filesToParse = Lists.newArrayList();
    private boolean echoHelp;
    private boolean echoAssembly;

    public Command(final String[] args, final PrintStream out) {
        this(Arrays.asList(args), out);
    }

    public Command(final List<String> args, final PrintStream out) {
        super();
        this.args = args;
        this.out = out;
    }

    @Override
    public void run() {
        parseArguments();

        if (echoHelp) {
            printHelp();
            return;
        }

        if (filesToParse.isEmpty()) {
            throw new CommandException("Give at least one source file as argument!", ERR_NO_FILES_TOPARSE);
        }

        // TODO do it for all
        final String source = filesToParse.get(0);
        final String className = extractClassName(source);
        String asm = "";

        try {
            asm = new Generator().generate(className, parseSource(source));
        } catch (IOException ex) {
            throw new CommandException(String.format("Can't read file '%s'!", source), ERR_CANT_READ_FILE);
        }

        if (echoAssembly) {
            out.println(asm);
        }

        try {
            final ClassFile classFile = new ClassFile();
            classFile.readJasmin(new StringReader(asm), className, false);

            if (classFile.errorCount() > 0) {
                throw new CommandException("Found " + classFile.errorCount() + " errors in Jasmin ASM!",
                        ERR_FOUND_ERRORS_IN_ASM);
            }

            final File outFile = new File(className + ".class");
            final FileOutputStream outp = new FileOutputStream(outFile);
            classFile.write(outp);
            outp.close();
            out.println("Generated: " + outFile.getPath());
        } catch (IOException ex) {
            // No IO errors w/ string readers
        } catch (Exception ex) {
            throw new CommandException(ex.getMessage(), ERR_EXCEPTION_DUROING_ASSEMBLY);
        }
    }

    static String parseSource(final String filename) throws IOException {
        final CharStream input = new ANTLRFileStream(filename, ENCODING);
        final ShackHackLexer lexer = new ShackHackLexer(input);
        final TokenStream tokens = new CommonTokenStream(lexer);

        final ShackHackParser parser = new ShackHackParser(tokens);
        return new ByteCodeVisitor().visit(parser.start());
    }

    static String extractClassName(final String fileName) {
        return Files.getNameWithoutExtension(fileName);
    }

    private void parseArguments() {
        for (final String arg : args) {
            if (arg.charAt(0) == '-') {
                recognizeOption(arg);
            } else {
                filesToParse.add(arg);
            }
        }
    }

    private void printHelp() {
        out.println("Usage: hack [-h|-?|--help] [-a|--assembly] <file1> [<file2> ... <fileN>]");
        out.println();
        out.println("-h|-?|--help   Show this help.");
        out.println("-a|--assembly  Print assembly code to STDOUT.");
    }

    private void recognizeOption(final String option) {
        if ("-h".equals(option) || "--help".equals(option) || "-?".equals(option)) {
            echoHelp = true;
        } else if ("-a".equals(option) || "--assembly".equals(option)) {
            echoAssembly = true;
        }
    }
}
