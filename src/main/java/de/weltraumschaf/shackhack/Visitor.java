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

import de.weltraumschaf.shackhack.ShackHackParser.AddContext;
import de.weltraumschaf.shackhack.ShackHackParser.DivContext;
import de.weltraumschaf.shackhack.ShackHackParser.StartContext;

/**
 *
 * @author Sven Strittmatter <weltraumschaf@googlemail.com>
 */
public class Visitor extends ShackHackBaseVisitor<String> {

    @Override
    public String visitSub(final ShackHackParser.SubContext ctx) {
        return String.format("%s%n%s%nisub", visit(ctx.left), visit(ctx.right));
    }

    @Override
    public String visitAdd(AddContext ctx) {
        return String.format("%s%n%s%niadd", visit(ctx.left), visit(ctx.right));
    }

    @Override
    public String visitMult(final ShackHackParser.MultContext ctx) {
        return String.format("%s%n%s%nimul", visit(ctx.left), visit(ctx.right));
    }

    @Override
    public String visitDiv(DivContext ctx) {
        return String.format("%s%n%s%nidiv", visit(ctx.left), visit(ctx.right));
    }

    @Override
    public String visitBrace(final ShackHackParser.BraceContext ctx) {
        return visit(ctx.inBrace);
    }

    @Override
    public String visitNumber(final ShackHackParser.NumberContext ctx) {
        return String.format("ldc %s", ctx.getText());
    }

    @Override
    public String visitStart(StartContext ctx) {
        return visit(ctx.getChild(0));
    }

}
