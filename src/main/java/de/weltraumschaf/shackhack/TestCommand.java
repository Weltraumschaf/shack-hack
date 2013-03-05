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

import de.weltraumschaf.shackhack.antlr.TestLexer;
import de.weltraumschaf.shackhack.antlr.TestParser;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.List;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 *
 * @author Sven Strittmatter <weltraumschaf@googlemail.com>
 */
class TestCommand extends BaseCommand implements Runnable {

    public TestCommand(final List<String> args, final PrintStream out, final InputStream in) {
        super(args, out, in);
    }

    @Override
    public void run() {
        getOut().println("Test...");
        try {
            final CharStream input = new ANTLRInputStream(getIn());
            final Lexer lexer = new TestLexer(input);
            final TokenStream tokens = new CommonTokenStream(lexer);
            final TestParser parser = new TestParser(tokens);
            final ParseTree tree = parser.prog();
            final TestVisitor eval = new TestVisitor(getOut());
            eval.visit(tree);
        } catch (IOException ex) {
            throw new ShackHackException(ex.getMessage()); // NOPMD
        }
    }

}
