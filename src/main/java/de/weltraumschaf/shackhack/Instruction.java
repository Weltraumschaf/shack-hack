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
import java.util.List;

/**
 *
 * @author Sven Strittmatter <weltraumschaf@googlemail.com>
 */
class Instruction {

    private final ByteCode code;
    private final List<String> args = Lists.newArrayList();
    private String comment;

    private Instruction(final ByteCode code) {
        this.code = code;
    }

    public void addArgument(final String arg) {
        args.add(arg);
    }

    public void setComment(final String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        final StringBuilder buffer = new StringBuilder();
        buffer.append(code.mnemonic());

        for (final String arg : args) {
            buffer.append(" ").append(arg);
        }

        if (null != comment) {
            buffer.append(" ; ").append(comment);
        }

        return buffer.toString();
    }

    public static Instruction newInstance(final ByteCode code) {
        return new Instruction(code);
    }

    public static Instruction newInstance(final ByteCode code, String ... args) {
        final Instruction instruction = newInstance(code);
        for (final String arg : args) {
            instruction.addArgument(arg);
        }
        return instruction;
    }

}
