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

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ShackHackParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OP_EQUAL=1, OP_STAR=2, OP_SLASH=3, OP_MINUS=4, OP_PLUS=5, OP_LPAREN=6, 
		OP_RPAREN=7, OP_LCURLY=8, OP_RCURLY=9, NL=10, WS=11, IDENTIFIER=12, INTEGER=13, 
		FLOAT=14, COMMENT=15, SL_COMMENT=16;
	public static final String[] tokenNames = {
		"<INVALID>", "'='", "'*'", "'/'", "'-'", "'+'", "'('", "')'", "'{'", "'}'", 
		"NL", "WS", "IDENTIFIER", "INTEGER", "FLOAT", "COMMENT", "SL_COMMENT"
	};
	public static final int
		RULE_start = 0, RULE_statement = 1, RULE_expression = 2;
	public static final String[] ruleNames = {
		"start", "statement", "expression"
	};

	@Override
	public String getGrammarFileName() { return "ShackHack.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public ShackHackParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShackHackVisitor ) return ((ShackHackVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(7); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(6); statement();
				}
				}
				setState(9); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_LPAREN) | (1L << NL) | (1L << IDENTIFIER) | (1L << INTEGER))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode OP_EQUAL() { return getToken(ShackHackParser.OP_EQUAL, 0); }
		public TerminalNode NL() { return getToken(ShackHackParser.NL, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ShackHackParser.IDENTIFIER, 0); }
		public AssignContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShackHackVisitor ) return ((ShackHackVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintExprContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NL() { return getToken(ShackHackParser.NL, 0); }
		public PrintExprContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShackHackVisitor ) return ((ShackHackVisitor<? extends T>)visitor).visitPrintExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BlankContext extends StatementContext {
		public TerminalNode NL() { return getToken(ShackHackParser.NL, 0); }
		public BlankContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShackHackVisitor ) return ((ShackHackVisitor<? extends T>)visitor).visitBlank(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(20);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new PrintExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(11); expression(0);
				setState(12); match(NL);
				}
				break;

			case 2:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(14); match(IDENTIFIER);
				setState(15); match(OP_EQUAL);
				setState(16); expression(0);
				setState(17); match(NL);
				}
				break;

			case 3:
				_localctx = new BlankContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(19); match(NL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public int _p;
		public ExpressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExpressionContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
			this._p = ctx._p;
		}
	}
	public static class IntegerContext extends ExpressionContext {
		public TerminalNode INTEGER() { return getToken(ShackHackParser.INTEGER, 0); }
		public IntegerContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShackHackVisitor ) return ((ShackHackVisitor<? extends T>)visitor).visitInteger(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BraceContext extends ExpressionContext {
		public ExpressionContext inBrace;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode OP_LPAREN() { return getToken(ShackHackParser.OP_LPAREN, 0); }
		public TerminalNode OP_RPAREN() { return getToken(ShackHackParser.OP_RPAREN, 0); }
		public BraceContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShackHackVisitor ) return ((ShackHackVisitor<? extends T>)visitor).visitBrace(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulDivContext extends ExpressionContext {
		public ExpressionContext left;
		public Token operator;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode OP_SLASH() { return getToken(ShackHackParser.OP_SLASH, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OP_STAR() { return getToken(ShackHackParser.OP_STAR, 0); }
		public MulDivContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShackHackVisitor ) return ((ShackHackVisitor<? extends T>)visitor).visitMulDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddSubContext extends ExpressionContext {
		public ExpressionContext left;
		public Token operator;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OP_MINUS() { return getToken(ShackHackParser.OP_MINUS, 0); }
		public TerminalNode OP_PLUS() { return getToken(ShackHackParser.OP_PLUS, 0); }
		public AddSubContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShackHackVisitor ) return ((ShackHackVisitor<? extends T>)visitor).visitAddSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdentiferContext extends ExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(ShackHackParser.IDENTIFIER, 0); }
		public IdentiferContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShackHackVisitor ) return ((ShackHackVisitor<? extends T>)visitor).visitIdentifer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState, _p);
		ExpressionContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, RULE_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			switch (_input.LA(1)) {
			case INTEGER:
				{
				_localctx = new IntegerContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(23); match(INTEGER);
				}
				break;
			case IDENTIFIER:
				{
				_localctx = new IdentiferContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(24); match(IDENTIFIER);
				}
				break;
			case OP_LPAREN:
				{
				_localctx = new BraceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(25); match(OP_LPAREN);
				setState(26); ((BraceContext)_localctx).inBrace = expression(0);
				setState(27); match(OP_RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(39);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(37);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new ExpressionContext(_parentctx, _parentState, _p));
						((MulDivContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(31);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						setState(32);
						((MulDivContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==OP_STAR || _la==OP_SLASH) ) {
							((MulDivContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(33); ((MulDivContext)_localctx).right = expression(6);
						}
						break;

					case 2:
						{
						_localctx = new AddSubContext(new ExpressionContext(_parentctx, _parentState, _p));
						((AddSubContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(34);
						if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
						setState(35);
						((AddSubContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==OP_MINUS || _la==OP_PLUS) ) {
							((AddSubContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(36); ((AddSubContext)_localctx).right = expression(5);
						}
						break;
					}
					} 
				}
				setState(41);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 5 >= _localctx._p;

		case 1: return 4 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\2\3\22-\4\2\t\2\4\3\t\3\4\4\t\4\3\2\6\2\n\n\2\r\2\16\2\13\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\5\3\27\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4 \n"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4(\n\4\f\4\16\4+\13\4\3\4\2\5\2\4\6\2\4\3"+
		"\4\5\3\6\7\60\2\t\3\2\2\2\4\26\3\2\2\2\6\37\3\2\2\2\b\n\5\4\3\2\t\b\3"+
		"\2\2\2\n\13\3\2\2\2\13\t\3\2\2\2\13\f\3\2\2\2\f\3\3\2\2\2\r\16\5\6\4\2"+
		"\16\17\7\f\2\2\17\27\3\2\2\2\20\21\7\16\2\2\21\22\7\3\2\2\22\23\5\6\4"+
		"\2\23\24\7\f\2\2\24\27\3\2\2\2\25\27\7\f\2\2\26\r\3\2\2\2\26\20\3\2\2"+
		"\2\26\25\3\2\2\2\27\5\3\2\2\2\30\31\b\4\1\2\31 \7\17\2\2\32 \7\16\2\2"+
		"\33\34\7\b\2\2\34\35\5\6\4\2\35\36\7\t\2\2\36 \3\2\2\2\37\30\3\2\2\2\37"+
		"\32\3\2\2\2\37\33\3\2\2\2 )\3\2\2\2!\"\6\4\2\3\"#\t\2\2\2#(\5\6\4\2$%"+
		"\6\4\3\3%&\t\3\2\2&(\5\6\4\2\'!\3\2\2\2\'$\3\2\2\2(+\3\2\2\2)\'\3\2\2"+
		"\2)*\3\2\2\2*\7\3\2\2\2+)\3\2\2\2\7\13\26\37\')";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}