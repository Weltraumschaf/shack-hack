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
		FLOAT=14, BOOLEAN=15, TRUE=16, FALSE=17, COMMENT=18, SL_COMMENT=19;
	public static final String[] tokenNames = {
		"<INVALID>", "'='", "'*'", "'/'", "'-'", "'+'", "'('", "')'", "'{'", "'}'", 
		"NL", "WS", "IDENTIFIER", "INTEGER", "FLOAT", "BOOLEAN", "'true'", "'false'", 
		"COMMENT", "SL_COMMENT"
	};
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_expression = 2, RULE_value = 3;
	public static final String[] ruleNames = {
		"program", "statement", "expression", "value"
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
	public static class ProgramContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(ShackHackParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(ShackHackParser.NL, i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShackHackVisitor ) return ((ShackHackVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			setState(19);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(9);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_LPAREN) | (1L << IDENTIFIER) | (1L << INTEGER) | (1L << FLOAT) | (1L << BOOLEAN))) != 0)) {
					{
					setState(8); statement();
					}
				}

				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(16);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_LPAREN) | (1L << IDENTIFIER) | (1L << INTEGER) | (1L << FLOAT) | (1L << BOOLEAN))) != 0)) {
					{
					{
					setState(11); statement();
					setState(12); match(NL);
					}
					}
					setState(18);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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
	public static class ExpressionStatementContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShackHackVisitor ) return ((ShackHackVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignStatementContext extends StatementContext {
		public Token id;
		public ExpressionContext val;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode OP_EQUAL() { return getToken(ShackHackParser.OP_EQUAL, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ShackHackParser.IDENTIFIER, 0); }
		public AssignStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShackHackVisitor ) return ((ShackHackVisitor<? extends T>)visitor).visitAssignStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(25);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new ExpressionStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(21); expression(0);
				}
				break;

			case 2:
				_localctx = new AssignStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(22); ((AssignStatementContext)_localctx).id = match(IDENTIFIER);
				setState(23); match(OP_EQUAL);
				setState(24); ((AssignStatementContext)_localctx).val = expression(0);
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
	public static class ValueExpressionContext extends ExpressionContext {
		public ValueContext val;
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ValueExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShackHackVisitor ) return ((ShackHackVisitor<? extends T>)visitor).visitValueExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenExpressionContext extends ExpressionContext {
		public ExpressionContext inParens;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode OP_LPAREN() { return getToken(ShackHackParser.OP_LPAREN, 0); }
		public TerminalNode OP_RPAREN() { return getToken(ShackHackParser.OP_RPAREN, 0); }
		public ParenExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShackHackVisitor ) return ((ShackHackVisitor<? extends T>)visitor).visitParenExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddSubExpressionContext extends ExpressionContext {
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
		public AddSubExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShackHackVisitor ) return ((ShackHackVisitor<? extends T>)visitor).visitAddSubExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdentiferExpressionContext extends ExpressionContext {
		public Token id;
		public TerminalNode IDENTIFIER() { return getToken(ShackHackParser.IDENTIFIER, 0); }
		public IdentiferExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShackHackVisitor ) return ((ShackHackVisitor<? extends T>)visitor).visitIdentiferExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulDivExpressionContext extends ExpressionContext {
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
		public MulDivExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShackHackVisitor ) return ((ShackHackVisitor<? extends T>)visitor).visitMulDivExpression(this);
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
			setState(34);
			switch (_input.LA(1)) {
			case INTEGER:
			case FLOAT:
			case BOOLEAN:
				{
				_localctx = new ValueExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(28); ((ValueExpressionContext)_localctx).val = value();
				}
				break;
			case IDENTIFIER:
				{
				_localctx = new IdentiferExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(29); ((IdentiferExpressionContext)_localctx).id = match(IDENTIFIER);
				}
				break;
			case OP_LPAREN:
				{
				_localctx = new ParenExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(30); match(OP_LPAREN);
				setState(31); ((ParenExpressionContext)_localctx).inParens = expression(0);
				setState(32); match(OP_RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(44);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(42);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						((MulDivExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(36);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						setState(37);
						((MulDivExpressionContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==OP_STAR || _la==OP_SLASH) ) {
							((MulDivExpressionContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(38); ((MulDivExpressionContext)_localctx).right = expression(6);
						}
						break;

					case 2:
						{
						_localctx = new AddSubExpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						((AddSubExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(39);
						if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
						setState(40);
						((AddSubExpressionContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==OP_MINUS || _la==OP_PLUS) ) {
							((AddSubExpressionContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(41); ((AddSubExpressionContext)_localctx).right = expression(5);
						}
						break;
					}
					} 
				}
				setState(46);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(ShackHackParser.INTEGER, 0); }
		public TerminalNode BOOLEAN() { return getToken(ShackHackParser.BOOLEAN, 0); }
		public TerminalNode FLOAT() { return getToken(ShackHackParser.FLOAT, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShackHackVisitor ) return ((ShackHackVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << FLOAT) | (1L << BOOLEAN))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		"\2\3\25\64\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\3\2\5\2\f\n\2\3\2\3\2\3\2\7"+
		"\2\21\n\2\f\2\16\2\24\13\2\5\2\26\n\2\3\3\3\3\3\3\3\3\5\3\34\n\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\5\4%\n\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4-\n\4\f\4\16"+
		"\4\60\13\4\3\5\3\5\3\5\2\6\2\4\6\b\2\5\3\4\5\3\6\7\3\17\21\67\2\25\3\2"+
		"\2\2\4\33\3\2\2\2\6$\3\2\2\2\b\61\3\2\2\2\n\f\5\4\3\2\13\n\3\2\2\2\13"+
		"\f\3\2\2\2\f\26\3\2\2\2\r\16\5\4\3\2\16\17\7\f\2\2\17\21\3\2\2\2\20\r"+
		"\3\2\2\2\21\24\3\2\2\2\22\20\3\2\2\2\22\23\3\2\2\2\23\26\3\2\2\2\24\22"+
		"\3\2\2\2\25\13\3\2\2\2\25\22\3\2\2\2\26\3\3\2\2\2\27\34\5\6\4\2\30\31"+
		"\7\16\2\2\31\32\7\3\2\2\32\34\5\6\4\2\33\27\3\2\2\2\33\30\3\2\2\2\34\5"+
		"\3\2\2\2\35\36\b\4\1\2\36%\5\b\5\2\37%\7\16\2\2 !\7\b\2\2!\"\5\6\4\2\""+
		"#\7\t\2\2#%\3\2\2\2$\35\3\2\2\2$\37\3\2\2\2$ \3\2\2\2%.\3\2\2\2&\'\6\4"+
		"\2\3\'(\t\2\2\2(-\5\6\4\2)*\6\4\3\3*+\t\3\2\2+-\5\6\4\2,&\3\2\2\2,)\3"+
		"\2\2\2-\60\3\2\2\2.,\3\2\2\2./\3\2\2\2/\7\3\2\2\2\60.\3\2\2\2\61\62\t"+
		"\4\2\2\62\t\3\2\2\2\t\13\22\25\33$,.";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}