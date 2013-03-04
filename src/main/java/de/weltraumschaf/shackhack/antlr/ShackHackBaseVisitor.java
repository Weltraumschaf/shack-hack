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
	@Override public T visitBrace(ShackHackParser.BraceContext ctx) { return visitChildren(ctx); }

	@Override public T visitInteger(ShackHackParser.IntegerContext ctx) { return visitChildren(ctx); }

	@Override public T visitStart(ShackHackParser.StartContext ctx) { return visitChildren(ctx); }

	@Override public T visitMulDiv(ShackHackParser.MulDivContext ctx) { return visitChildren(ctx); }

	@Override public T visitAddOps(ShackHackParser.AddOpsContext ctx) { return visitChildren(ctx); }

	@Override public T visitAddSub(ShackHackParser.AddSubContext ctx) { return visitChildren(ctx); }

	@Override public T visitMulOps(ShackHackParser.MulOpsContext ctx) { return visitChildren(ctx); }

	@Override public T visitIdentifer(ShackHackParser.IdentiferContext ctx) { return visitChildren(ctx); }
}