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
		FLOAT=14, COMMENT=15, SL_COMMENT=16;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'='", "'*'", "'/'", "'-'", "'+'", "'('", "')'", "'{'", "'}'", "NL", "WS", 
		"IDENTIFIER", "INTEGER", "FLOAT", "COMMENT", "SL_COMMENT"
	};
	public static final String[] ruleNames = {
		"OP_EQUAL", "OP_STAR", "OP_SLASH", "OP_MINUS", "OP_PLUS", "OP_LPAREN", 
		"OP_RPAREN", "OP_LCURLY", "OP_RCURLY", "NL", "WS", "IDENTIFIER", "LETTER", 
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
		case 9: NL_action((RuleContext)_localctx, actionIndex); break;

		case 10: WS_action((RuleContext)_localctx, actionIndex); break;

		case 16: COMMENT_action((RuleContext)_localctx, actionIndex); break;
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
		"\2\4\22\u00a1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b"+
		"\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\5\13=\n\13\3\13"+
		"\3\13\3\13\3\13\3\f\6\fD\n\f\r\f\16\fE\3\f\3\f\3\r\3\r\3\r\7\rM\n\r\f"+
		"\r\16\rP\13\r\3\16\3\16\3\17\6\17U\n\17\r\17\16\17V\3\20\6\20Z\n\20\r"+
		"\20\16\20[\3\20\3\20\7\20`\n\20\f\20\16\20c\13\20\3\20\5\20f\n\20\3\20"+
		"\3\20\6\20j\n\20\r\20\16\20k\3\20\5\20o\n\20\3\20\6\20r\n\20\r\20\16\20"+
		"s\3\20\5\20w\n\20\3\21\3\21\5\21{\n\21\3\21\6\21~\n\21\r\21\16\21\177"+
		"\3\22\3\22\5\22\u0084\n\22\3\22\3\22\3\23\3\23\3\23\3\23\7\23\u008c\n"+
		"\23\f\23\16\23\u008f\13\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\7\24\u0098"+
		"\n\24\f\24\16\24\u009b\13\24\3\24\5\24\u009e\n\24\3\24\3\24\3\u008d\25"+
		"\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\2\27"+
		"\r\3\31\16\1\33\2\1\35\17\1\37\20\1!\2\1#\21\4%\2\1\'\22\1\3\2\16\4\13"+
		"\13\"\"\3\62;\4C\\c|\3\62;\3\62;\3\62;\3\62;\3\62;\4GGgg\4--//\3\62;\4"+
		"\f\f\17\17\u00b0\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2#\3\2\2\2\2\'"+
		"\3\2\2\2\3)\3\2\2\2\5+\3\2\2\2\7-\3\2\2\2\t/\3\2\2\2\13\61\3\2\2\2\r\63"+
		"\3\2\2\2\17\65\3\2\2\2\21\67\3\2\2\2\239\3\2\2\2\25<\3\2\2\2\27C\3\2\2"+
		"\2\31I\3\2\2\2\33Q\3\2\2\2\35T\3\2\2\2\37v\3\2\2\2!x\3\2\2\2#\u0083\3"+
		"\2\2\2%\u0087\3\2\2\2\'\u0093\3\2\2\2)*\7?\2\2*\4\3\2\2\2+,\7,\2\2,\6"+
		"\3\2\2\2-.\7\61\2\2.\b\3\2\2\2/\60\7/\2\2\60\n\3\2\2\2\61\62\7-\2\2\62"+
		"\f\3\2\2\2\63\64\7*\2\2\64\16\3\2\2\2\65\66\7+\2\2\66\20\3\2\2\2\678\7"+
		"}\2\28\22\3\2\2\29:\7\177\2\2:\24\3\2\2\2;=\7\17\2\2<;\3\2\2\2<=\3\2\2"+
		"\2=>\3\2\2\2>?\7\f\2\2?@\3\2\2\2@A\b\13\2\2A\26\3\2\2\2BD\t\2\2\2CB\3"+
		"\2\2\2DE\3\2\2\2EC\3\2\2\2EF\3\2\2\2FG\3\2\2\2GH\b\f\3\2H\30\3\2\2\2I"+
		"N\5\33\16\2JM\5\33\16\2KM\t\3\2\2LJ\3\2\2\2LK\3\2\2\2MP\3\2\2\2NL\3\2"+
		"\2\2NO\3\2\2\2O\32\3\2\2\2PN\3\2\2\2QR\t\4\2\2R\34\3\2\2\2SU\t\5\2\2T"+
		"S\3\2\2\2UV\3\2\2\2VT\3\2\2\2VW\3\2\2\2W\36\3\2\2\2XZ\t\6\2\2YX\3\2\2"+
		"\2Z[\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\]\3\2\2\2]a\7\60\2\2^`\t\7\2\2_^\3"+
		"\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2be\3\2\2\2ca\3\2\2\2df\5!\21\2ed\3"+
		"\2\2\2ef\3\2\2\2fw\3\2\2\2gi\7\60\2\2hj\t\b\2\2ih\3\2\2\2jk\3\2\2\2ki"+
		"\3\2\2\2kl\3\2\2\2ln\3\2\2\2mo\5!\21\2nm\3\2\2\2no\3\2\2\2ow\3\2\2\2p"+
		"r\t\t\2\2qp\3\2\2\2rs\3\2\2\2sq\3\2\2\2st\3\2\2\2tu\3\2\2\2uw\5!\21\2"+
		"vY\3\2\2\2vg\3\2\2\2vq\3\2\2\2w \3\2\2\2xz\t\n\2\2y{\t\13\2\2zy\3\2\2"+
		"\2z{\3\2\2\2{}\3\2\2\2|~\t\f\2\2}|\3\2\2\2~\177\3\2\2\2\177}\3\2\2\2\177"+
		"\u0080\3\2\2\2\u0080\"\3\2\2\2\u0081\u0084\5\'\24\2\u0082\u0084\5%\23"+
		"\2\u0083\u0081\3\2\2\2\u0083\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086"+
		"\b\22\4\2\u0086$\3\2\2\2\u0087\u0088\7\61\2\2\u0088\u0089\7,\2\2\u0089"+
		"\u008d\3\2\2\2\u008a\u008c\13\2\2\2\u008b\u008a\3\2\2\2\u008c\u008f\3"+
		"\2\2\2\u008d\u008e\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u0090\3\2\2\2\u008f"+
		"\u008d\3\2\2\2\u0090\u0091\7,\2\2\u0091\u0092\7\61\2\2\u0092&\3\2\2\2"+
		"\u0093\u0094\7\61\2\2\u0094\u0095\7\61\2\2\u0095\u0099\3\2\2\2\u0096\u0098"+
		"\n\r\2\2\u0097\u0096\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099"+
		"\u009a\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u009e\7\17"+
		"\2\2\u009d\u009c\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\3\2\2\2\u009f"+
		"\u00a0\7\f\2\2\u00a0(\3\2\2\2\25\2<ELNV[aeknsvz\177\u0083\u008d\u0099"+
		"\u009d";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}