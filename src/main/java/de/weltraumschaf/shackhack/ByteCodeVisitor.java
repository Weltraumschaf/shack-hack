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

import de.weltraumschaf.shackhack.antlr.ShackHackBaseVisitor;
import de.weltraumschaf.shackhack.antlr.ShackHackParser;
import de.weltraumschaf.shackhack.antlr.ShackHackParser.AddContext;
import de.weltraumschaf.shackhack.antlr.ShackHackParser.BraceContext;
import de.weltraumschaf.shackhack.antlr.ShackHackParser.DivContext;
import de.weltraumschaf.shackhack.antlr.ShackHackParser.MultContext;
import de.weltraumschaf.shackhack.antlr.ShackHackParser.StartContext;
import de.weltraumschaf.shackhack.antlr.ShackHackParser.SubContext;

/**
 *
 * @author Sven Strittmatter <weltraumschaf@googlemail.com>
 */
final class ByteCodeVisitor extends ShackHackBaseVisitor<String> {

    @Override
    public String visitSub(final SubContext ctx) {
        return String.format("%s%n%s%n%s", visit(ctx.left), visit(ctx.right), ByteCodes.ISUB.cmd());
    }

    @Override
    public String visitAdd(final AddContext ctx) {
        return String.format("%s%n%s%n%s", visit(ctx.left), visit(ctx.right), ByteCodes.IADD.cmd());
    }

    @Override
    public String visitMult(final MultContext ctx) {
        return String.format("%s%n%s%n%s", visit(ctx.left), visit(ctx.right), ByteCodes.IMUL.cmd());
    }

    @Override
    public String visitDiv(final DivContext ctx) {
        return String.format("%s%n%s%n%s", visit(ctx.left), visit(ctx.right), ByteCodes.IDIV.cmd());
    }

    @Override
    public String visitBrace(final BraceContext ctx) {
        return visit(ctx.inBrace);
    }

    @Override
    public String visitNumber(final ShackHackParser.NumberContext ctx) {
        return String.format("%s %s", ByteCodes.LDC.cmd(), ctx.getText());
    }

    @Override
    public String visitStart(StartContext ctx) {
        return visit(ctx.getChild(0));
    }

}
