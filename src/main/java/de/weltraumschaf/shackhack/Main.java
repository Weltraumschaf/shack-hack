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

    private static final String PREAMBLE = ".class public ShackHack%n"
        + ".super java/lang/Object%n%n"
        + ".method public static main([Ljava/lang/String;)V%n"
        + "    .limit stack %d%n"
        + "    getstatic java/lang/System/out Ljava/io/PrintStream;%n";

    private static final String FOOTER = ""
            + "    invokevirtual java/io/PrintStream/println(I)V%n"
            + "    return%n.end method%n";

    public static void main(final String[] args) {
        if (args.length != 1) {
            System.out.println("Give source as one argument");
        }

        final String source = args[0];

        try {
            final CharStream input = new ANTLRFileStream(source, "UTF-8");
            final ShackHackLexer lexer = new ShackHackLexer(input);
            final TokenStream tokens = new CommonTokenStream(lexer);

            final ShackHackParser parser = new ShackHackParser(tokens);
            final String result = new Visitor().visit(parser.start());
            System.out.print(String.format(PREAMBLE, 10));
            System.out.println(result);
            System.out.println(String.format(FOOTER));
        } catch (IOException ex) {
            System.out.println(String.format("Can't read file '%s'!", source));
            System.exit(1);
        }

        System.exit(0);
    }
}
