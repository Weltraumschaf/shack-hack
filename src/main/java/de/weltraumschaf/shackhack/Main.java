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

import java.io.PrintStream;

/**
 *
 * @author Sven Strittmatter <weltraumschaf@googlemail.com>
 */
public class Main {

    private static final PrintStream ERR = System.err;
    private static final PrintStream OUT = System.out;

    public static void main(final String[] args) {
        try {
            final Command cmd = new Command(args, OUT);
            cmd.run();
            System.exit(0);
        } catch (CommandException ex) {
            ERR.println(ex.getMessage());
            System.exit(ex.getReturnCode());
        }

    }

}
