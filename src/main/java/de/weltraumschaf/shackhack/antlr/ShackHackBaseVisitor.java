// Generated from ShackHack.g4 by ANTLR 4.0

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

package de.weltraumschaf.shackhack.antlr;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.ParserRuleContext;

public class ShackHackBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements ShackHackVisitor<T> {
	@Override public T visitValueExpression(ShackHackParser.ValueExpressionContext ctx) { return visitChildren(ctx); }

	@Override public T visitExpressionStatement(ShackHackParser.ExpressionStatementContext ctx) { return visitChildren(ctx); }

	@Override public T visitProgram(ShackHackParser.ProgramContext ctx) { return visitChildren(ctx); }

	@Override public T visitValue(ShackHackParser.ValueContext ctx) { return visitChildren(ctx); }

	@Override public T visitAssignStatement(ShackHackParser.AssignStatementContext ctx) { return visitChildren(ctx); }

	@Override public T visitParenExpression(ShackHackParser.ParenExpressionContext ctx) { return visitChildren(ctx); }

	@Override public T visitAddSubExpression(ShackHackParser.AddSubExpressionContext ctx) { return visitChildren(ctx); }

	@Override public T visitIdentiferExpression(ShackHackParser.IdentiferExpressionContext ctx) { return visitChildren(ctx); }

	@Override public T visitMulDivExpression(ShackHackParser.MulDivExpressionContext ctx) { return visitChildren(ctx); }
}