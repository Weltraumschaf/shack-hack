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

public interface ShackHackVisitor<T> extends ParseTreeVisitor<T> {
	T visitValueExpression(ShackHackParser.ValueExpressionContext ctx);

	T visitExpressionStatement(ShackHackParser.ExpressionStatementContext ctx);

	T visitProgram(ShackHackParser.ProgramContext ctx);

	T visitValue(ShackHackParser.ValueContext ctx);

	T visitAssignStatement(ShackHackParser.AssignStatementContext ctx);

	T visitParenExpression(ShackHackParser.ParenExpressionContext ctx);

	T visitAddSubExpression(ShackHackParser.AddSubExpressionContext ctx);

	T visitIdentiferExpression(ShackHackParser.IdentiferExpressionContext ctx);

	T visitMulDivExpression(ShackHackParser.MulDivExpressionContext ctx);

	T visitEmptyStatement(ShackHackParser.EmptyStatementContext ctx);
}