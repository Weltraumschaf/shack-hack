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
import java.util.Arrays;

/**
 *
 * @author Sven Strittmatter <weltraumschaf@googlemail.com>
 */
public final class Main extends BaseCommand implements Runnable {

    public Main(String[] args, PrintStream out) {
        super(Arrays.asList(args), out);
    }

    public static void main(final String[] args) {
        try {
            new Main(args, System.out).run();
            System.exit(0);
        } catch (CommandException ex) {
            System.err.println(ex.getMessage());
            System.exit(ex.getReturnCode());
        }

    }

    @Override
    public void run() {
        determineCommand().run();
    }

    private Runnable determineCommand() {
        for (final String arg : getArgs()) {
            if ("-t".equals(arg) || "--test".equals(arg)) {
                return new TestCommand(getArgs(), getOut());
            }
        }

        return new ShackHackCommand(getArgs(), getOut());
    }
}
