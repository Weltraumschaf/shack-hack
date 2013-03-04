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
import de.weltraumschaf.shackhack.antlr.ShackHackParser.BraceContext;
import de.weltraumschaf.shackhack.antlr.ShackHackParser.StartContext;

/**
 *
 * @author Sven Strittmatter <weltraumschaf@googlemail.com>
 */
final class ByteCodeVisitor extends ShackHackBaseVisitor<String> {

    @Override
    public String visitMulDiv(final ShackHackParser.MulDivContext ctx) {
        final String left = visit(ctx.left);
        final String right = visit(ctx.right);
        final String mnemonic = ctx.operator.getType() == ShackHackParser.OP_STAR
                ? ByteCodes.IMUL.mnemonic()
                : ByteCodes.IDIV.mnemonic();
        return String.format("%s%n%s%n%s", left, right, mnemonic);
    }

    @Override
    public String visitAddSub(final ShackHackParser.AddSubContext ctx) {
        final String left = visit(ctx.left);
        final String right = visit(ctx.right);
        final String mnemonic = ctx.operator.getType() == ShackHackParser.OP_PLUS
                ? ByteCodes.IADD.mnemonic()
                : ByteCodes.ISUB.mnemonic();
        return String.format("%s%n%s%n%s", left, right, mnemonic);
    }

    @Override
    public String visitBrace(final BraceContext ctx) {
        return visit(ctx.inBrace);
    }

    @Override
    public String visitNumber(final ShackHackParser.NumberContext ctx) {
        return String.format("%s %s", ByteCodes.LDC.mnemonic(), ctx.getText());
    }

    @Override
    public String visitStart(StartContext ctx) {
        return visit(ctx.getChild(0));
    }

}
