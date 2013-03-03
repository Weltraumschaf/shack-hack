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

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Sven Strittmatter <weltraumschaf@googlemail.com>
 */
abstract class BaseCommand {

    private final List<String> args;
    private final PrintStream out;
    private final InputStream in;

    public BaseCommand(final List<String> args, final PrintStream out, final InputStream in) {
        super();
        this.args = args;
        this.out = out;
        this.in = in;
    }

    protected List<String> getArgs() {
        return args;
    }

    protected PrintStream getOut() {
        return out;
    }

    protected InputStream getIn() {
        return in;
    }  

}
