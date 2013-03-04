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
import de.weltraumschaf.shackhack.CommandException.Code;
import de.weltraumschaf.shackhack.antlr.ShackHackBaseVisitor;
import de.weltraumschaf.shackhack.antlr.ShackHackParser;
import de.weltraumschaf.shackhack.antlr.ShackHackParser.AddSubExpressionContext;
import de.weltraumschaf.shackhack.antlr.ShackHackParser.AssignStatementContext;
import de.weltraumschaf.shackhack.antlr.ShackHackParser.EmptyStatementContext;
import de.weltraumschaf.shackhack.antlr.ShackHackParser.ExpressionStatementContext;
import de.weltraumschaf.shackhack.antlr.ShackHackParser.IdentiferExpressionContext;
import de.weltraumschaf.shackhack.antlr.ShackHackParser.IntegerExpressionContext;
import de.weltraumschaf.shackhack.antlr.ShackHackParser.MulDivExpressionContext;
import de.weltraumschaf.shackhack.antlr.ShackHackParser.ParenExpressionContext;
import de.weltraumschaf.shackhack.antlr.ShackHackParser.StartContext;
import java.util.List;

/**
 *
 * @author Sven Strittmatter <weltraumschaf@googlemail.com>
 */
final class ByteCodeVisitor extends ShackHackBaseVisitor<List<Instruction>> {

    @Override
    public List<Instruction> visitStart(final StartContext ctx) {
        return visit(ctx.getChild(0));
    }

    @Override
    public List<Instruction> visitExpressionStatement(final ExpressionStatementContext ctx) {
        return visit(ctx.getChild(0));
    }

    @Override
    public List<Instruction> visitAssignStatement(final AssignStatementContext ctx) {
        // TODO Implement
        return Lists.newArrayList();
    }

    @Override
    public List<Instruction> visitEmptyStatement(final EmptyStatementContext ctx) {
        return Lists.newArrayList();
    }

    @Override
    public List<Instruction> visitMulDivExpression(final MulDivExpressionContext ctx) {
        final List<Instruction> instructions = Lists.newArrayList();
        instructions.addAll(visit(ctx.left));
        instructions.addAll(visit(ctx.right));

        if (ctx.operator.getType() == ShackHackParser.OP_STAR) {
            instructions.add(Instruction.newInstance(ByteCode.IMUL));
        } else if (ctx.operator.getType() == ShackHackParser.OP_SLASH) {
            instructions.add(Instruction.newInstance(ByteCode.IDIV));
        } else {
            throw new CommandException("Unexpected operator: " + ctx.operator, Code.SYNTAX_ERROR);
        }

        return instructions;
    }

    @Override
    public List<Instruction> visitAddSubExpression(final AddSubExpressionContext ctx) {
        final List<Instruction> instructions = Lists.newArrayList();
        instructions.addAll(visit(ctx.left));
        instructions.addAll(visit(ctx.right));

        if (ctx.operator.getType() == ShackHackParser.OP_PLUS) {
            instructions.add(Instruction.newInstance(ByteCode.IADD));
        } else if (ctx.operator.getType() == ShackHackParser.OP_MINUS) {
            instructions.add(Instruction.newInstance(ByteCode.ISUB));
        } else {
            throw new CommandException("Unexpected operator: " + ctx.operator, Code.SYNTAX_ERROR);
        }

        return instructions;
    }

    @Override
    public List<Instruction> visitIntegerExpression(final IntegerExpressionContext ctx) {
        return Lists.newArrayList(Instruction.newInstance(ByteCode.LDC, Integer.valueOf(ctx.getText())));
    }

    @Override
    public List<Instruction> visitIdentiferExpression(final IdentiferExpressionContext ctx) {
        // TODO Implement
        return Lists.newArrayList();
    }

    @Override
    public List<Instruction> visitParenExpression(final ParenExpressionContext ctx) {
        return visit(ctx.inBrace);
    }

}
