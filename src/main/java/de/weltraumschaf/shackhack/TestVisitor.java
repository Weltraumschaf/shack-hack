package de.weltraumschaf.shackhack;

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

import com.google.common.collect.Maps;
import de.weltraumschaf.shackhack.antlr.TestBaseVisitor;
import de.weltraumschaf.shackhack.antlr.TestParser;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Sven Strittmatter <weltraumschaf@googlemail.com>
 */
public class TestVisitor extends TestBaseVisitor<Integer> {

    private final Map<String, Integer> memory = Maps.newHashMap();
    private final PrintStream out;

    public TestVisitor(PrintStream out) {
        this.out = out;
    }

    /** ID '=' expr NEWLINE */
    @Override
    public Integer visitAssign(final TestParser.AssignContext ctx) {
        final String id = ctx.ID().getText();
        final int value = visit(ctx.expr());
        memory.put(id, value);
        return value;
    }

    /** expr NEWLINE */
    @Override
    public Integer visitPrintExpr(final TestParser.PrintExprContext ctx) {
        final int value = visit(ctx.expr());
        out.println(value);
        return 0;
    }

    /** INT */
    @Override
    public Integer visitInt(final TestParser.IntContext ctx) {
        return Integer.valueOf(ctx.INT().getText());
    }

    /** ID */
    @Override
    public Integer visitId(final TestParser.IdContext ctx) {
        final String id = ctx.ID().getText();
        return memory.containsKey(id)
            ? memory.get(id)
            : 0;
    }

    /** expr op=('*'|'/') expr */
    @Override
    public Integer visitMulDiv(final TestParser.MulDivContext ctx) {
        final int left = visit(ctx.left);
        final int right = visit(ctx.right);

        return ctx.op.getType() == TestParser.MUL
            ? left * right
            : left / right;
    }

    /** expr op=('+'|'-') expr */
    @Override
    public Integer visitAddSub(final TestParser.AddSubContext ctx) {
        final int left = visit(ctx.left);
        final int right = visit(ctx.right);

        return ctx.op.getType() == TestParser.ADD
            ? left + right
            : left - right;
    }

    /** '(' expr ')' */
    @Override
    public Integer visitParens(final TestParser.ParensContext ctx) {
        return visit(ctx.expr());
    }

}
