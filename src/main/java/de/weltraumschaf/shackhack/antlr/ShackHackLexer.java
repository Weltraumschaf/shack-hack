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
		OP_LCURLY=7, OP_RCURLY=8, NL=9, WS=10, ID=11, INTEGER=12, FLOAT=13, COMMENT=14, 
		ML_COMMENT=15, SL_COMMENT=16;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'*'", "'/'", "'-'", "'+'", "'('", "')'", "'{'", "'}'", "NL", "WS", "ID", 
		"INTEGER", "FLOAT", "COMMENT", "ML_COMMENT", "SL_COMMENT"
	};
	public static final String[] ruleNames = {
		"OP_STAR", "OP_SLASH", "OP_MINUS", "OP_PLUS", "OP_LPAREN", "OP_RPAREN", 
		"OP_LCURLY", "OP_RCURLY", "NL", "WS", "ID", "LETTER", "INTEGER", "FLOAT", 
		"EXPONENT", "COMMENT", "ML_COMMENT", "SL_COMMENT"
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
		case 8: NL_action((RuleContext)_localctx, actionIndex); break;

		case 9: WS_action((RuleContext)_localctx, actionIndex); break;

		case 15: COMMENT_action((RuleContext)_localctx, actionIndex); break;
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
		"\2\4\22\u009d\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b"+
		"\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\5\n9\n\n\3\n\3\n\3\n\3\n\3\13\6\13"+
		"@\n\13\r\13\16\13A\3\13\3\13\3\f\3\f\3\f\7\fI\n\f\f\f\16\fL\13\f\3\r\3"+
		"\r\3\16\6\16Q\n\16\r\16\16\16R\3\17\6\17V\n\17\r\17\16\17W\3\17\3\17\7"+
		"\17\\\n\17\f\17\16\17_\13\17\3\17\5\17b\n\17\3\17\3\17\6\17f\n\17\r\17"+
		"\16\17g\3\17\5\17k\n\17\3\17\6\17n\n\17\r\17\16\17o\3\17\5\17s\n\17\3"+
		"\20\3\20\5\20w\n\20\3\20\6\20z\n\20\r\20\16\20{\3\21\3\21\5\21\u0080\n"+
		"\21\3\21\3\21\3\22\3\22\3\22\3\22\7\22\u0088\n\22\f\22\16\22\u008b\13"+
		"\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\7\23\u0094\n\23\f\23\16\23\u0097"+
		"\13\23\3\23\5\23\u009a\n\23\3\23\3\23\3\u0089\24\3\3\1\5\4\1\7\5\1\t\6"+
		"\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\2\25\f\3\27\r\1\31\2\1\33\16\1\35"+
		"\17\1\37\2\1!\20\4#\21\1%\22\1\3\2\16\4\13\13\"\"\3\62;\4C\\c|\3\62;\3"+
		"\62;\3\62;\3\62;\3\62;\4GGgg\4--//\3\62;\4\f\f\17\17\u00ad\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\3\'\3\2\2\2\5)\3\2\2\2"+
		"\7+\3\2\2\2\t-\3\2\2\2\13/\3\2\2\2\r\61\3\2\2\2\17\63\3\2\2\2\21\65\3"+
		"\2\2\2\238\3\2\2\2\25?\3\2\2\2\27E\3\2\2\2\31M\3\2\2\2\33P\3\2\2\2\35"+
		"r\3\2\2\2\37t\3\2\2\2!\177\3\2\2\2#\u0083\3\2\2\2%\u008f\3\2\2\2\'(\7"+
		",\2\2(\4\3\2\2\2)*\7\61\2\2*\6\3\2\2\2+,\7/\2\2,\b\3\2\2\2-.\7-\2\2.\n"+
		"\3\2\2\2/\60\7*\2\2\60\f\3\2\2\2\61\62\7+\2\2\62\16\3\2\2\2\63\64\7}\2"+
		"\2\64\20\3\2\2\2\65\66\7\177\2\2\66\22\3\2\2\2\679\7\17\2\28\67\3\2\2"+
		"\289\3\2\2\29:\3\2\2\2:;\7\f\2\2;<\3\2\2\2<=\b\n\2\2=\24\3\2\2\2>@\t\2"+
		"\2\2?>\3\2\2\2@A\3\2\2\2A?\3\2\2\2AB\3\2\2\2BC\3\2\2\2CD\b\13\3\2D\26"+
		"\3\2\2\2EJ\5\31\r\2FI\5\31\r\2GI\t\3\2\2HF\3\2\2\2HG\3\2\2\2IL\3\2\2\2"+
		"JH\3\2\2\2JK\3\2\2\2K\30\3\2\2\2LJ\3\2\2\2MN\t\4\2\2N\32\3\2\2\2OQ\t\5"+
		"\2\2PO\3\2\2\2QR\3\2\2\2RP\3\2\2\2RS\3\2\2\2S\34\3\2\2\2TV\t\6\2\2UT\3"+
		"\2\2\2VW\3\2\2\2WU\3\2\2\2WX\3\2\2\2XY\3\2\2\2Y]\7\60\2\2Z\\\t\7\2\2["+
		"Z\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^a\3\2\2\2_]\3\2\2\2`b\5\37\20"+
		"\2a`\3\2\2\2ab\3\2\2\2bs\3\2\2\2ce\7\60\2\2df\t\b\2\2ed\3\2\2\2fg\3\2"+
		"\2\2ge\3\2\2\2gh\3\2\2\2hj\3\2\2\2ik\5\37\20\2ji\3\2\2\2jk\3\2\2\2ks\3"+
		"\2\2\2ln\t\t\2\2ml\3\2\2\2no\3\2\2\2om\3\2\2\2op\3\2\2\2pq\3\2\2\2qs\5"+
		"\37\20\2rU\3\2\2\2rc\3\2\2\2rm\3\2\2\2s\36\3\2\2\2tv\t\n\2\2uw\t\13\2"+
		"\2vu\3\2\2\2vw\3\2\2\2wy\3\2\2\2xz\t\f\2\2yx\3\2\2\2z{\3\2\2\2{y\3\2\2"+
		"\2{|\3\2\2\2| \3\2\2\2}\u0080\5%\23\2~\u0080\5#\22\2\177}\3\2\2\2\177"+
		"~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\b\21\4\2\u0082\"\3\2\2\2\u0083"+
		"\u0084\7\61\2\2\u0084\u0085\7,\2\2\u0085\u0089\3\2\2\2\u0086\u0088\13"+
		"\2\2\2\u0087\u0086\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u008a\3\2\2\2\u0089"+
		"\u0087\3\2\2\2\u008a\u008c\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u008d\7,"+
		"\2\2\u008d\u008e\7\61\2\2\u008e$\3\2\2\2\u008f\u0090\7\61\2\2\u0090\u0091"+
		"\7\61\2\2\u0091\u0095\3\2\2\2\u0092\u0094\n\r\2\2\u0093\u0092\3\2\2\2"+
		"\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0099"+
		"\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u009a\7\17\2\2\u0099\u0098\3\2\2\2"+
		"\u0099\u009a\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c\7\f\2\2\u009c&\3"+
		"\2\2\2\25\28AHJRW]agjorv{\177\u0089\u0095\u0099";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}