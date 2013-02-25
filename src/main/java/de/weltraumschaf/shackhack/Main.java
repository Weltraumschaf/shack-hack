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

import java.io.IOException;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.TokenStream;

/**
 *
 * @author Sven Strittmatter <weltraumschaf@googlemail.com>
 */
public class Main {

    private static final String PREAMBLE = ".class public %s%n"
            + ".super java/lang/Object%n%n"
            + ".method public static main([Ljava/lang/String;)V%n"
            + "    .limit stack %d%n"
            + "    getstatic java/lang/System/out Ljava/io/PrintStream;%n%n";
    private static final String FOOTER = ""
            + "    invokevirtual java/io/PrintStream/println(I)V%n"
            + "    return%n.end method%n";
    private static final String ENCODING = "UTF-8";
    private static final int STACK_SIZE = 10;

    public static void main(final String[] args) {
        if (args.length != 1) {
            System.out.println("Give source as one argument");
        }

        final String source = args[0];

        try {
            System.out.print(generatePreambel("ShackHack", STACK_SIZE));
            System.out.println(indent(parseSource(source)));
            System.out.println(generateFooter());
        } catch (IOException ex) {
            System.out.println(String.format("Can't read file '%s'!", source));
            System.exit(1);
        }

        System.exit(0);
    }

    static String generatePreambel(final String className, final int stacksize) {
        return String.format(PREAMBLE, className, stacksize);
    }

    static String generateFooter() {
        return String.format(FOOTER);
    }

    static String parseSource(final String filename) throws IOException {
        final CharStream input = new ANTLRFileStream(filename, ENCODING);
        final ShackHackLexer lexer = new ShackHackLexer(input);
        final TokenStream tokens = new CommonTokenStream(lexer);

        final ShackHackParser parser = new ShackHackParser(tokens);
        return new Visitor().visit(parser.start());
    }

    static String indent(final String in) {
        final StringBuilder buffer = new StringBuilder();

        for (final String line : in.split(String.format("%n"))) {
            buffer.append(String.format("    %s%n", line));
        }

        return buffer.toString();
    }
}
