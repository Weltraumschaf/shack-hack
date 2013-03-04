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

public interface TestVisitor<T> extends ParseTreeVisitor<T> {
	T visitId(TestParser.IdContext ctx);

	T visitAssign(TestParser.AssignContext ctx);

	T visitProg(TestParser.ProgContext ctx);

	T visitBlank(TestParser.BlankContext ctx);

	T visitPrintExpr(TestParser.PrintExprContext ctx);

	T visitInt(TestParser.IntContext ctx);

	T visitMulDiv(TestParser.MulDivContext ctx);

	T visitAddSub(TestParser.AddSubContext ctx);

	T visitParens(TestParser.ParensContext ctx);
}