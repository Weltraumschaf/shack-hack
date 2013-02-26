/*
 * LICENSE
 *
 * "THE BEER-WARE LICENSE" (Revision 42):
 * "Sven Strittmatter" <weltraumschaf@googlemail.com> wrote this file.
 * As long as you retain this notice you can do whatever you want with
 * this stuff. If we meet some day, and you think this stuff is worth it,
 * you can buy me a beer in return.
 *
 */
package de.weltraumschaf.shackhack;

import com.google.common.io.Files;
import de.weltraumschaf.shackhack.antlr.ShackHackParser;
import de.weltraumschaf.shackhack.antlr.ShackHackLexer;
import jasmin.ClassFile;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.StringReader;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;

/**
 *
 * @author Sven Strittmatter <weltraumschaf@googlemail.com>
 */
public class Main {

    private static final String ENCODING = "UTF-8";
    private static final PrintStream ERR = System.err;
    private static final PrintStream OUT = System.out;

    public static void main(final String[] args) {
        System.exit(new Main().run(args));
    }

    public final int run(final String[] args) {
        if (args.length != 1) {
            ERR.println("Give source as one argument");
            return -1;
        }

        final String source = args[0];
        final String className = extractClassName(source);
        String asm = "";

        try {
            asm = new Generator().generate(className, parseSource(source));
        } catch (IOException ex) {
            ERR.println(String.format("Can't read file '%s'!", source));
            return -2;
        }

        try {
            final ClassFile classFile = new ClassFile();
            classFile.readJasmin(new StringReader(asm), className, false);

            if (classFile.errorCount() > 0) {
                ERR.println("Found " + classFile.errorCount() + " errors");
                return -3;
            }

            final File outFile = new File(className + ".class");
            final FileOutputStream outp = new FileOutputStream(outFile);
            classFile.write(outp);
            outp.close();
            OUT.println("Generated: " + outFile.getPath());
        } catch (IOException ex) {
            // No IO errors w/ string readers
        } catch (Exception ex) {
            ERR.println(ex.getMessage());
            return -4;
        }

        return 0;
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

}
