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
class CommandException extends RuntimeException {

    enum Code {
        FATAL(-1),
        NO_FILES_TO_PARSE(-2),
        CANT_READ_FILE(-3),
        FOUND_ERRORS_IN_ASM(-4),
        EXCEPTION_DUROING_ASSEMBLY(-4),
        SYNTAX_ERROR(-5);

        private final int code;

        private Code(final int code) {
            this.code = code;
        }

        public int getCode() {
            return code;
        }
        
    }

    private final Code returnCode;

    public CommandException(final String message) {
        this(message, Code.FATAL);
    }

    public CommandException(final String message, final Code returnCode) {
        super(message);
        this.returnCode = returnCode;
    }

    public Code getReturnCode() {
        return returnCode;
    }
}
