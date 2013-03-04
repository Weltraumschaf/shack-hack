// Generated from Test.g4 by ANTLR 4.0

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

public class TestBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements TestVisitor<T> {
	@Override public T visitId(TestParser.IdContext ctx) { return visitChildren(ctx); }

	@Override public T visitAssign(TestParser.AssignContext ctx) { return visitChildren(ctx); }

	@Override public T visitProg(TestParser.ProgContext ctx) { return visitChildren(ctx); }

	@Override public T visitBlank(TestParser.BlankContext ctx) { return visitChildren(ctx); }

	@Override public T visitPrintExpr(TestParser.PrintExprContext ctx) { return visitChildren(ctx); }

	@Override public T visitInt(TestParser.IntContext ctx) { return visitChildren(ctx); }

	@Override public T visitMulDiv(TestParser.MulDivContext ctx) { return visitChildren(ctx); }

	@Override public T visitAddSub(TestParser.AddSubContext ctx) { return visitChildren(ctx); }

	@Override public T visitParens(TestParser.ParensContext ctx) { return visitChildren(ctx); }
}