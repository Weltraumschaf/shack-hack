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

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;

/**
 *
 * @author Sven Strittmatter <weltraumschaf@googlemail.com>
 */
public final class Main extends BaseCommand implements Runnable {

    public Main(final String[] args, final PrintStream out, final InputStream in) {
        super(Arrays.asList(args), out, in);
    }

    public static void main(final String[] args) {
        try {
            new Main(args, System.out, System.in).run();
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
                return new TestCommand(getArgs(), getOut(), getIn());
            }
        }

        return new ShackHackCommand(getArgs(), getOut(), getIn());
    }
}
