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

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ShackHackLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OP_STAR=1, OP_SLASH=2, OP_MINUS=3, OP_PLUS=4, OP_LPAREN=5, OP_RPAREN=6, 
		OP_LCURLY=7, OP_RCURLY=8, MUL_OP=9, ADD_OP=10, NL=11, WS=12, ID=13, INTEGER=14, 
		FLOAT=15, COMMENT=16, ML_COMMENT=17, SL_COMMENT=18;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'*'", "'/'", "'-'", "'+'", "'('", "')'", "'{'", "'}'", "MUL_OP", "ADD_OP", 
		"NL", "WS", "ID", "INTEGER", "FLOAT", "COMMENT", "ML_COMMENT", "SL_COMMENT"
	};
	public static final String[] ruleNames = {
		"OP_STAR", "OP_SLASH", "OP_MINUS", "OP_PLUS", "OP_LPAREN", "OP_RPAREN", 
		"OP_LCURLY", "OP_RCURLY", "MUL_OP", "ADD_OP", "NL", "WS", "ID", "LETTER", 
		"INTEGER", "FLOAT", "EXPONENT", "COMMENT", "ML_COMMENT", "SL_COMMENT"
	};


	public ShackHackLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ShackHack.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 10: NL_action((RuleContext)_localctx, actionIndex); break;

		case 11: WS_action((RuleContext)_localctx, actionIndex); break;

		case 17: COMMENT_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: skip();  break;
		}
	}
	private void NL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\2\4\24\u00a9\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b"+
		"\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\5\n>\n\n\3"+
		"\13\3\13\5\13B\n\13\3\f\5\fE\n\f\3\f\3\f\3\f\3\f\3\r\6\rL\n\r\r\r\16\r"+
		"M\3\r\3\r\3\16\3\16\3\16\7\16U\n\16\f\16\16\16X\13\16\3\17\3\17\3\20\6"+
		"\20]\n\20\r\20\16\20^\3\21\6\21b\n\21\r\21\16\21c\3\21\3\21\7\21h\n\21"+
		"\f\21\16\21k\13\21\3\21\5\21n\n\21\3\21\3\21\6\21r\n\21\r\21\16\21s\3"+
		"\21\5\21w\n\21\3\21\6\21z\n\21\r\21\16\21{\3\21\5\21\177\n\21\3\22\3\22"+
		"\5\22\u0083\n\22\3\22\6\22\u0086\n\22\r\22\16\22\u0087\3\23\3\23\5\23"+
		"\u008c\n\23\3\23\3\23\3\24\3\24\3\24\3\24\7\24\u0094\n\24\f\24\16\24\u0097"+
		"\13\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\7\25\u00a0\n\25\f\25\16\25\u00a3"+
		"\13\25\3\25\5\25\u00a6\n\25\3\25\3\25\3\u0095\26\3\3\1\5\4\1\7\5\1\t\6"+
		"\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\2\31\16\3\33\17\1\35"+
		"\2\1\37\20\1!\21\1#\2\1%\22\4\'\23\1)\24\1\3\2\16\4\13\13\"\"\3\62;\4"+
		"C\\c|\3\62;\3\62;\3\62;\3\62;\3\62;\4GGgg\4--//\3\62;\4\f\f\17\17\u00bb"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\3+\3\2\2\2\5-\3\2\2\2\7/\3\2\2\2\t\61\3\2\2\2\13\63\3"+
		"\2\2\2\r\65\3\2\2\2\17\67\3\2\2\2\219\3\2\2\2\23=\3\2\2\2\25A\3\2\2\2"+
		"\27D\3\2\2\2\31K\3\2\2\2\33Q\3\2\2\2\35Y\3\2\2\2\37\\\3\2\2\2!~\3\2\2"+
		"\2#\u0080\3\2\2\2%\u008b\3\2\2\2\'\u008f\3\2\2\2)\u009b\3\2\2\2+,\7,\2"+
		"\2,\4\3\2\2\2-.\7\61\2\2.\6\3\2\2\2/\60\7/\2\2\60\b\3\2\2\2\61\62\7-\2"+
		"\2\62\n\3\2\2\2\63\64\7*\2\2\64\f\3\2\2\2\65\66\7+\2\2\66\16\3\2\2\2\67"+
		"8\7}\2\28\20\3\2\2\29:\7\177\2\2:\22\3\2\2\2;>\5\3\2\2<>\5\5\3\2=;\3\2"+
		"\2\2=<\3\2\2\2>\24\3\2\2\2?B\5\t\5\2@B\5\7\4\2A?\3\2\2\2A@\3\2\2\2B\26"+
		"\3\2\2\2CE\7\17\2\2DC\3\2\2\2DE\3\2\2\2EF\3\2\2\2FG\7\f\2\2GH\3\2\2\2"+
		"HI\b\f\2\2I\30\3\2\2\2JL\t\2\2\2KJ\3\2\2\2LM\3\2\2\2MK\3\2\2\2MN\3\2\2"+
		"\2NO\3\2\2\2OP\b\r\3\2P\32\3\2\2\2QV\5\35\17\2RU\5\35\17\2SU\t\3\2\2T"+
		"R\3\2\2\2TS\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2W\34\3\2\2\2XV\3\2\2"+
		"\2YZ\t\4\2\2Z\36\3\2\2\2[]\t\5\2\2\\[\3\2\2\2]^\3\2\2\2^\\\3\2\2\2^_\3"+
		"\2\2\2_ \3\2\2\2`b\t\6\2\2a`\3\2\2\2bc\3\2\2\2ca\3\2\2\2cd\3\2\2\2de\3"+
		"\2\2\2ei\7\60\2\2fh\t\7\2\2gf\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2jm"+
		"\3\2\2\2ki\3\2\2\2ln\5#\22\2ml\3\2\2\2mn\3\2\2\2n\177\3\2\2\2oq\7\60\2"+
		"\2pr\t\b\2\2qp\3\2\2\2rs\3\2\2\2sq\3\2\2\2st\3\2\2\2tv\3\2\2\2uw\5#\22"+
		"\2vu\3\2\2\2vw\3\2\2\2w\177\3\2\2\2xz\t\t\2\2yx\3\2\2\2z{\3\2\2\2{y\3"+
		"\2\2\2{|\3\2\2\2|}\3\2\2\2}\177\5#\22\2~a\3\2\2\2~o\3\2\2\2~y\3\2\2\2"+
		"\177\"\3\2\2\2\u0080\u0082\t\n\2\2\u0081\u0083\t\13\2\2\u0082\u0081\3"+
		"\2\2\2\u0082\u0083\3\2\2\2\u0083\u0085\3\2\2\2\u0084\u0086\t\f\2\2\u0085"+
		"\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2"+
		"\2\2\u0088$\3\2\2\2\u0089\u008c\5)\25\2\u008a\u008c\5\'\24\2\u008b\u0089"+
		"\3\2\2\2\u008b\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\b\23\4\2"+
		"\u008e&\3\2\2\2\u008f\u0090\7\61\2\2\u0090\u0091\7,\2\2\u0091\u0095\3"+
		"\2\2\2\u0092\u0094\13\2\2\2\u0093\u0092\3\2\2\2\u0094\u0097\3\2\2\2\u0095"+
		"\u0096\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u0098\3\2\2\2\u0097\u0095\3\2"+
		"\2\2\u0098\u0099\7,\2\2\u0099\u009a\7\61\2\2\u009a(\3\2\2\2\u009b\u009c"+
		"\7\61\2\2\u009c\u009d\7\61\2\2\u009d\u00a1\3\2\2\2\u009e\u00a0\n\r\2\2"+
		"\u009f\u009e\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2"+
		"\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a6\7\17\2\2"+
		"\u00a5\u00a4\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8"+
		"\7\f\2\2\u00a8*\3\2\2\2\27\2=ADMTV^cimsv{~\u0082\u0087\u008b\u0095\u00a1"+
		"\u00a5";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}