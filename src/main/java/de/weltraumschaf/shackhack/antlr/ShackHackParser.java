// Generated from ../ShackHack.g by ANTLR 4.0

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
		T__5=1, T__4=2, T__3=3, T__2=4, T__1=5, T__0=6, NUMBER=7, WS=8;
	public static final String[] tokenNames = {
		"<INVALID>", "')'", "'+'", "'*'", "'-'", "'('", "'/'", "NUMBER", "WS"
	};
	public static final int
		RULE_start = 0, RULE_ausdruck = 1;
	public static final String[] ruleNames = {
		"start", "ausdruck"
	};

	@Override
	public String getGrammarFileName() { return "ShackHack.g"; }

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
		public AusdruckContext ausdruck() {
			return getRuleContext(AusdruckContext.class,0);
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
			setState(4); ausdruck(0);
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

	public static class AusdruckContext extends ParserRuleContext {
		public int _p;
		public AusdruckContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public AusdruckContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_ausdruck; }
	 
		public AusdruckContext() { }
		public void copyFrom(AusdruckContext ctx) {
			super.copyFrom(ctx);
			this._p = ctx._p;
		}
	}
	public static class MultContext extends AusdruckContext {
		public AusdruckContext left;
		public Token operator;
		public AusdruckContext right;
		public List<AusdruckContext> ausdruck() {
			return getRuleContexts(AusdruckContext.class);
		}
		public AusdruckContext ausdruck(int i) {
			return getRuleContext(AusdruckContext.class,i);
		}
		public MultContext(AusdruckContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShackHackVisitor ) return ((ShackHackVisitor<? extends T>)visitor).visitMult(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubContext extends AusdruckContext {
		public AusdruckContext left;
		public Token operator;
		public AusdruckContext right;
		public List<AusdruckContext> ausdruck() {
			return getRuleContexts(AusdruckContext.class);
		}
		public AusdruckContext ausdruck(int i) {
			return getRuleContext(AusdruckContext.class,i);
		}
		public SubContext(AusdruckContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShackHackVisitor ) return ((ShackHackVisitor<? extends T>)visitor).visitSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BraceContext extends AusdruckContext {
		public AusdruckContext inBrace;
		public AusdruckContext ausdruck() {
			return getRuleContext(AusdruckContext.class,0);
		}
		public BraceContext(AusdruckContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShackHackVisitor ) return ((ShackHackVisitor<? extends T>)visitor).visitBrace(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivContext extends AusdruckContext {
		public AusdruckContext left;
		public Token operator;
		public AusdruckContext right;
		public List<AusdruckContext> ausdruck() {
			return getRuleContexts(AusdruckContext.class);
		}
		public AusdruckContext ausdruck(int i) {
			return getRuleContext(AusdruckContext.class,i);
		}
		public DivContext(AusdruckContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShackHackVisitor ) return ((ShackHackVisitor<? extends T>)visitor).visitDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberContext extends AusdruckContext {
		public Token number;
		public TerminalNode NUMBER() { return getToken(ShackHackParser.NUMBER, 0); }
		public NumberContext(AusdruckContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShackHackVisitor ) return ((ShackHackVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddContext extends AusdruckContext {
		public AusdruckContext left;
		public Token operator;
		public AusdruckContext right;
		public List<AusdruckContext> ausdruck() {
			return getRuleContexts(AusdruckContext.class);
		}
		public AusdruckContext ausdruck(int i) {
			return getRuleContext(AusdruckContext.class,i);
		}
		public AddContext(AusdruckContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShackHackVisitor ) return ((ShackHackVisitor<? extends T>)visitor).visitAdd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AusdruckContext ausdruck(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AusdruckContext _localctx = new AusdruckContext(_ctx, _parentState, _p);
		AusdruckContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, RULE_ausdruck);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			switch (_input.LA(1)) {
			case 5:
				{
				_localctx = new BraceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(7); match(5);
				setState(8); ((BraceContext)_localctx).inBrace = ausdruck(0);
				setState(9); match(1);
				}
				break;
			case NUMBER:
				{
				_localctx = new NumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(11); ((NumberContext)_localctx).number = match(NUMBER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(28);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(26);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new MultContext(new AusdruckContext(_parentctx, _parentState, _p));
						((MultContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_ausdruck);
						setState(14);
						if (!(6 >= _localctx._p)) throw new FailedPredicateException(this, "6 >= $_p");
						setState(15); ((MultContext)_localctx).operator = match(3);
						setState(16); ((MultContext)_localctx).right = ausdruck(7);
						}
						break;

					case 2:
						{
						_localctx = new DivContext(new AusdruckContext(_parentctx, _parentState, _p));
						((DivContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_ausdruck);
						setState(17);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						setState(18); ((DivContext)_localctx).operator = match(6);
						setState(19); ((DivContext)_localctx).right = ausdruck(6);
						}
						break;

					case 3:
						{
						_localctx = new SubContext(new AusdruckContext(_parentctx, _parentState, _p));
						((SubContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_ausdruck);
						setState(20);
						if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
						setState(21); ((SubContext)_localctx).operator = match(4);
						setState(22); ((SubContext)_localctx).right = ausdruck(5);
						}
						break;

					case 4:
						{
						_localctx = new AddContext(new AusdruckContext(_parentctx, _parentState, _p));
						((AddContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_ausdruck);
						setState(23);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(24); ((AddContext)_localctx).operator = match(2);
						setState(25); ((AddContext)_localctx).right = ausdruck(4);
						}
						break;
					}
					} 
				}
				setState(30);
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
		case 1: return ausdruck_sempred((AusdruckContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean ausdruck_sempred(AusdruckContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 6 >= _localctx._p;

		case 1: return 5 >= _localctx._p;

		case 2: return 4 >= _localctx._p;

		case 3: return 3 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\2\3\n\"\4\2\t\2\4\3\t\3\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3\17\n\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\35\n\3\f\3\16\3 \13"+
		"\3\3\3\2\4\2\4\2\2$\2\6\3\2\2\2\4\16\3\2\2\2\6\7\5\4\3\2\7\3\3\2\2\2\b"+
		"\t\b\3\1\2\t\n\7\7\2\2\n\13\5\4\3\2\13\f\7\3\2\2\f\17\3\2\2\2\r\17\7\t"+
		"\2\2\16\b\3\2\2\2\16\r\3\2\2\2\17\36\3\2\2\2\20\21\6\3\2\3\21\22\7\5\2"+
		"\2\22\35\5\4\3\2\23\24\6\3\3\3\24\25\7\b\2\2\25\35\5\4\3\2\26\27\6\3\4"+
		"\3\27\30\7\6\2\2\30\35\5\4\3\2\31\32\6\3\5\3\32\33\7\4\2\2\33\35\5\4\3"+
		"\2\34\20\3\2\2\2\34\23\3\2\2\2\34\26\3\2\2\2\34\31\3\2\2\2\35 \3\2\2\2"+
		"\36\34\3\2\2\2\36\37\3\2\2\2\37\5\3\2\2\2 \36\3\2\2\2\5\16\34\36";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}