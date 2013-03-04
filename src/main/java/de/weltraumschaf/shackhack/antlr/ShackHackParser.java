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
		OP_STAR=1, OP_SLASH=2, OP_MINUS=3, OP_PLUS=4, OP_LPAREN=5, OP_RPAREN=6, 
		OP_LCURLY=7, OP_RCURLY=8, NL=9, WS=10, ID=11, INTEGER=12, FLOAT=13, COMMENT=14, 
		ML_COMMENT=15, SL_COMMENT=16;
	public static final String[] tokenNames = {
		"<INVALID>", "'*'", "'/'", "'-'", "'+'", "'('", "')'", "'{'", "'}'", "NL", 
		"WS", "ID", "INTEGER", "FLOAT", "COMMENT", "ML_COMMENT", "SL_COMMENT"
	};
	public static final int
		RULE_start = 0, RULE_expression = 1;
	public static final String[] ruleNames = {
		"start", "expression"
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4); expression(0);
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
	public static class NumberContext extends ExpressionContext {
		public Token number;
		public TerminalNode INTEGER() { return getToken(ShackHackParser.INTEGER, 0); }
		public NumberContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShackHackVisitor ) return ((ShackHackVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState, _p);
		ExpressionContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, RULE_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			switch (_input.LA(1)) {
			case OP_LPAREN:
				{
				_localctx = new BraceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(7); match(OP_LPAREN);
				setState(8); ((BraceContext)_localctx).inBrace = expression(0);
				setState(9); match(OP_RPAREN);
				}
				break;
			case INTEGER:
				{
				_localctx = new NumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(11); ((NumberContext)_localctx).number = match(INTEGER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(22);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(20);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new ExpressionContext(_parentctx, _parentState, _p));
						((MulDivContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(14);
						if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
						setState(15);
						((MulDivContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==OP_STAR || _la==OP_SLASH) ) {
							((MulDivContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(16); ((MulDivContext)_localctx).right = expression(5);
						}
						break;

					case 2:
						{
						_localctx = new AddSubContext(new ExpressionContext(_parentctx, _parentState, _p));
						((AddSubContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(17);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(18);
						((AddSubContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==OP_MINUS || _la==OP_PLUS) ) {
							((AddSubContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(19); ((AddSubContext)_localctx).right = expression(4);
						}
						break;
					}
					} 
				}
				setState(24);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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
		case 1: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 4 >= _localctx._p;

		case 1: return 3 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\2\3\22\34\4\2\t\2\4\3\t\3\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3\17\n\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\7\3\27\n\3\f\3\16\3\32\13\3\3\3\2\4\2\4\2\4\3"+
		"\3\4\3\5\6\34\2\6\3\2\2\2\4\16\3\2\2\2\6\7\5\4\3\2\7\3\3\2\2\2\b\t\b\3"+
		"\1\2\t\n\7\7\2\2\n\13\5\4\3\2\13\f\7\b\2\2\f\17\3\2\2\2\r\17\7\16\2\2"+
		"\16\b\3\2\2\2\16\r\3\2\2\2\17\30\3\2\2\2\20\21\6\3\2\3\21\22\t\2\2\2\22"+
		"\27\5\4\3\2\23\24\6\3\3\3\24\25\t\3\2\2\25\27\5\4\3\2\26\20\3\2\2\2\26"+
		"\23\3\2\2\2\27\32\3\2\2\2\30\26\3\2\2\2\30\31\3\2\2\2\31\5\3\2\2\2\32"+
		"\30\3\2\2\2\5\16\26\30";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}