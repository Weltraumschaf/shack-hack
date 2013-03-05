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
		OP_EQUAL=1, OP_STAR=2, OP_SLASH=3, OP_MINUS=4, OP_PLUS=5, OP_LPAREN=6, 
		OP_RPAREN=7, OP_LCURLY=8, OP_RCURLY=9, NL=10, WS=11, IDENTIFIER=12, INTEGER=13, 
		FLOAT=14, BOOLEAN=15, TRUE=16, FALSE=17, COMMENT=18, SL_COMMENT=19;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'='", "'*'", "'/'", "'-'", "'+'", "'('", "')'", "'{'", "'}'", "NL", "WS", 
		"IDENTIFIER", "INTEGER", "FLOAT", "BOOLEAN", "'true'", "'false'", "COMMENT", 
		"SL_COMMENT"
	};
	public static final String[] ruleNames = {
		"OP_EQUAL", "OP_STAR", "OP_SLASH", "OP_MINUS", "OP_PLUS", "OP_LPAREN", 
		"OP_RPAREN", "OP_LCURLY", "OP_RCURLY", "NL", "WS", "IDENTIFIER", "LETTER", 
		"INTEGER", "FLOAT", "EXPONENT", "BOOLEAN", "TRUE", "FALSE", "COMMENT", 
		"ML_COMMENT", "SL_COMMENT"
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
		case 9: NL_action((RuleContext)_localctx, actionIndex); break;

		case 10: WS_action((RuleContext)_localctx, actionIndex); break;

		case 19: COMMENT_action((RuleContext)_localctx, actionIndex); break;
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
		"\2\4\25\u00b6\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b"+
		"\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t"+
		"\3\n\3\n\3\13\5\13C\n\13\3\13\3\13\3\13\3\13\3\f\6\fJ\n\f\r\f\16\fK\3"+
		"\f\3\f\3\r\3\r\3\r\7\rS\n\r\f\r\16\rV\13\r\3\16\3\16\3\17\6\17[\n\17\r"+
		"\17\16\17\\\3\20\6\20`\n\20\r\20\16\20a\3\20\3\20\7\20f\n\20\f\20\16\20"+
		"i\13\20\3\20\5\20l\n\20\3\20\3\20\6\20p\n\20\r\20\16\20q\3\20\5\20u\n"+
		"\20\3\20\6\20x\n\20\r\20\16\20y\3\20\5\20}\n\20\3\21\3\21\5\21\u0081\n"+
		"\21\3\21\6\21\u0084\n\21\r\21\16\21\u0085\3\22\3\22\5\22\u008a\n\22\3"+
		"\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\5\25\u0099"+
		"\n\25\3\25\3\25\3\26\3\26\3\26\3\26\7\26\u00a1\n\26\f\26\16\26\u00a4\13"+
		"\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\7\27\u00ad\n\27\f\27\16\27\u00b0"+
		"\13\27\3\27\5\27\u00b3\n\27\3\27\3\27\3\u00a2\30\3\3\1\5\4\1\7\5\1\t\6"+
		"\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\2\27\r\3\31\16\1\33\2\1\35"+
		"\17\1\37\20\1!\2\1#\21\1%\22\1\'\23\1)\24\4+\2\1-\25\1\3\2\16\4\13\13"+
		"\"\"\3\62;\4C\\c|\3\62;\3\62;\3\62;\3\62;\3\62;\4GGgg\4--//\3\62;\4\f"+
		"\f\17\17\u00c6\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2-\3\2\2\2\3/\3\2\2\2\5\61\3\2\2\2\7\63\3"+
		"\2\2\2\t\65\3\2\2\2\13\67\3\2\2\2\r9\3\2\2\2\17;\3\2\2\2\21=\3\2\2\2\23"+
		"?\3\2\2\2\25B\3\2\2\2\27I\3\2\2\2\31O\3\2\2\2\33W\3\2\2\2\35Z\3\2\2\2"+
		"\37|\3\2\2\2!~\3\2\2\2#\u0089\3\2\2\2%\u008b\3\2\2\2\'\u0090\3\2\2\2)"+
		"\u0098\3\2\2\2+\u009c\3\2\2\2-\u00a8\3\2\2\2/\60\7?\2\2\60\4\3\2\2\2\61"+
		"\62\7,\2\2\62\6\3\2\2\2\63\64\7\61\2\2\64\b\3\2\2\2\65\66\7/\2\2\66\n"+
		"\3\2\2\2\678\7-\2\28\f\3\2\2\29:\7*\2\2:\16\3\2\2\2;<\7+\2\2<\20\3\2\2"+
		"\2=>\7}\2\2>\22\3\2\2\2?@\7\177\2\2@\24\3\2\2\2AC\7\17\2\2BA\3\2\2\2B"+
		"C\3\2\2\2CD\3\2\2\2DE\7\f\2\2EF\3\2\2\2FG\b\13\2\2G\26\3\2\2\2HJ\t\2\2"+
		"\2IH\3\2\2\2JK\3\2\2\2KI\3\2\2\2KL\3\2\2\2LM\3\2\2\2MN\b\f\3\2N\30\3\2"+
		"\2\2OT\5\33\16\2PS\5\33\16\2QS\t\3\2\2RP\3\2\2\2RQ\3\2\2\2SV\3\2\2\2T"+
		"R\3\2\2\2TU\3\2\2\2U\32\3\2\2\2VT\3\2\2\2WX\t\4\2\2X\34\3\2\2\2Y[\t\5"+
		"\2\2ZY\3\2\2\2[\\\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]\36\3\2\2\2^`\t\6\2\2"+
		"_^\3\2\2\2`a\3\2\2\2a_\3\2\2\2ab\3\2\2\2bc\3\2\2\2cg\7\60\2\2df\t\7\2"+
		"\2ed\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2hk\3\2\2\2ig\3\2\2\2jl\5!\21"+
		"\2kj\3\2\2\2kl\3\2\2\2l}\3\2\2\2mo\7\60\2\2np\t\b\2\2on\3\2\2\2pq\3\2"+
		"\2\2qo\3\2\2\2qr\3\2\2\2rt\3\2\2\2su\5!\21\2ts\3\2\2\2tu\3\2\2\2u}\3\2"+
		"\2\2vx\t\t\2\2wv\3\2\2\2xy\3\2\2\2yw\3\2\2\2yz\3\2\2\2z{\3\2\2\2{}\5!"+
		"\21\2|_\3\2\2\2|m\3\2\2\2|w\3\2\2\2} \3\2\2\2~\u0080\t\n\2\2\177\u0081"+
		"\t\13\2\2\u0080\177\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0083\3\2\2\2\u0082"+
		"\u0084\t\f\2\2\u0083\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0083\3\2"+
		"\2\2\u0085\u0086\3\2\2\2\u0086\"\3\2\2\2\u0087\u008a\5%\23\2\u0088\u008a"+
		"\5\'\24\2\u0089\u0087\3\2\2\2\u0089\u0088\3\2\2\2\u008a$\3\2\2\2\u008b"+
		"\u008c\7v\2\2\u008c\u008d\7t\2\2\u008d\u008e\7w\2\2\u008e\u008f\7g\2\2"+
		"\u008f&\3\2\2\2\u0090\u0091\7h\2\2\u0091\u0092\7c\2\2\u0092\u0093\7n\2"+
		"\2\u0093\u0094\7u\2\2\u0094\u0095\7g\2\2\u0095(\3\2\2\2\u0096\u0099\5"+
		"-\27\2\u0097\u0099\5+\26\2\u0098\u0096\3\2\2\2\u0098\u0097\3\2\2\2\u0099"+
		"\u009a\3\2\2\2\u009a\u009b\b\25\4\2\u009b*\3\2\2\2\u009c\u009d\7\61\2"+
		"\2\u009d\u009e\7,\2\2\u009e\u00a2\3\2\2\2\u009f\u00a1\13\2\2\2\u00a0\u009f"+
		"\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3"+
		"\u00a5\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a6\7,\2\2\u00a6\u00a7\7\61"+
		"\2\2\u00a7,\3\2\2\2\u00a8\u00a9\7\61\2\2\u00a9\u00aa\7\61\2\2\u00aa\u00ae"+
		"\3\2\2\2\u00ab\u00ad\n\r\2\2\u00ac\u00ab\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae"+
		"\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00ae\3\2"+
		"\2\2\u00b1\u00b3\7\17\2\2\u00b2\u00b1\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3"+
		"\u00b4\3\2\2\2\u00b4\u00b5\7\f\2\2\u00b5.\3\2\2\2\26\2BKRT\\agkqty|\u0080"+
		"\u0085\u0089\u0098\u00a2\u00ae\u00b2";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}