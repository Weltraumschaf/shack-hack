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

/**
 *
 * @author Sven Strittmatter <weltraumschaf@googlemail.com>
 */
class Generator {

    private static final String PREAMBLE = ".class public %s%n"
            + ".super java/lang/Object%n%n"
            + ".method public static main([Ljava/lang/String;)V%n"
            + "    .limit stack %d%n"
            + "    getstatic java/lang/System/out Ljava/io/PrintStream;%n%n";
    private static final String FOOTER = "%n"
            + "    invokevirtual java/io/PrintStream/println(I)V%n"
            + "    return%n.end method%n";
    private static final String ENCODING = "UTF-8";
    private static final int STACK_SIZE = 10;

    private final StringBuilder buffer = new StringBuilder();

    String generate(final String className, final String asm) {
        buffer.append(generatePreambel(className, STACK_SIZE));
        buffer.append(indent(asm));
        buffer.append(generateFooter());
        return buffer.toString();
    }

    static String generatePreambel(final String className, final int stacksize) {
        return String.format(PREAMBLE, className, stacksize);
    }

    static String generateFooter() {
        return String.format(FOOTER);
    }

    static String indent(final String in) {
        final StringBuilder buffer = new StringBuilder();

        for (final String line : in.split(String.format("%n"))) {
            buffer.append(String.format("    %s%n", line));
        }

        return buffer.toString();
    }

}
