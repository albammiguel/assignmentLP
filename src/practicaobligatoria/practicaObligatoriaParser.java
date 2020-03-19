// Generated from practicaObligatoria.g4 by ANTLR 4.7.2

    package practicaobligatoria;
    import java.util.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class practicaObligatoriaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IDENT=1, NUM_INT_CONST=2, NUM_REAL_CONST=3, STRING_CONST=4, TOKEN_PROGRAM=5, 
		TOKEN_INTERFACE=6, TOKEN_PUNTOCOMA=7, TOKEN_END=8, TOKEN_DOBLEPUNTO=9, 
		TOKEN_PARAMETER=10, TOKEN_IGUAL=11, TOKEN_COMA=12, TOKEN_INTEGER=13, TOKEN_REAL=14, 
		TOKEN_CHARACTER=15, TOKEN_PARENTESIS_IZQ=16, TOKEN_PARENTESIS_DER=17, 
		TOKEN_SUBROUTINE=18, TOKEN_IN=19, TOKEN_OUT=20, TOKEN_INOUT=21, TOKEN_FUNCTION=22, 
		TOKEN_INTENT=23, TOKEN_MAS=24, TOKEN_MENOS=25, TOKEN_MULTIPLICACION=26, 
		TOKEN_DIVISION=27, TOKEN_CALL=28, COMENTARIOS=29, WS=30;
	public static final int
		RULE_p = 0;
	private static String[] makeRuleNames() {
		return new String[] {
			"p"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'PROGRAM'", "'INTERFACE'", "';'", "'END'", 
			"'::'", "'PARAMETER'", "'='", "','", "'INTEGER'", "'REAL'", "'CHARACTER'", 
			"'('", "')'", "'SUBROUTINE'", "'IN'", "'OUT'", "'INOUT'", "'FUNCTION'", 
			"'INTENT'", "'+'", "'-'", "'*'", "'/'", "'CALL'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IDENT", "NUM_INT_CONST", "NUM_REAL_CONST", "STRING_CONST", "TOKEN_PROGRAM", 
			"TOKEN_INTERFACE", "TOKEN_PUNTOCOMA", "TOKEN_END", "TOKEN_DOBLEPUNTO", 
			"TOKEN_PARAMETER", "TOKEN_IGUAL", "TOKEN_COMA", "TOKEN_INTEGER", "TOKEN_REAL", 
			"TOKEN_CHARACTER", "TOKEN_PARENTESIS_IZQ", "TOKEN_PARENTESIS_DER", "TOKEN_SUBROUTINE", 
			"TOKEN_IN", "TOKEN_OUT", "TOKEN_INOUT", "TOKEN_FUNCTION", "TOKEN_INTENT", 
			"TOKEN_MAS", "TOKEN_MENOS", "TOKEN_MULTIPLICACION", "TOKEN_DIVISION", 
			"TOKEN_CALL", "COMENTARIOS", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "practicaObligatoria.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public practicaObligatoriaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class PContext extends ParserRuleContext {
		public List<TerminalNode> NUM_REAL_CONST() { return getTokens(practicaObligatoriaParser.NUM_REAL_CONST); }
		public TerminalNode NUM_REAL_CONST(int i) {
			return getToken(practicaObligatoriaParser.NUM_REAL_CONST, i);
		}
		public List<TerminalNode> NUM_INT_CONST() { return getTokens(practicaObligatoriaParser.NUM_INT_CONST); }
		public TerminalNode NUM_INT_CONST(int i) {
			return getToken(practicaObligatoriaParser.NUM_INT_CONST, i);
		}
		public List<TerminalNode> STRING_CONST() { return getTokens(practicaObligatoriaParser.STRING_CONST); }
		public TerminalNode STRING_CONST(int i) {
			return getToken(practicaObligatoriaParser.STRING_CONST, i);
		}
		public List<TerminalNode> IDENT() { return getTokens(practicaObligatoriaParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(practicaObligatoriaParser.IDENT, i);
		}
		public List<TerminalNode> TOKEN_PROGRAM() { return getTokens(practicaObligatoriaParser.TOKEN_PROGRAM); }
		public TerminalNode TOKEN_PROGRAM(int i) {
			return getToken(practicaObligatoriaParser.TOKEN_PROGRAM, i);
		}
		public List<TerminalNode> TOKEN_END() { return getTokens(practicaObligatoriaParser.TOKEN_END); }
		public TerminalNode TOKEN_END(int i) {
			return getToken(practicaObligatoriaParser.TOKEN_END, i);
		}
		public List<TerminalNode> TOKEN_SUBROUTINE() { return getTokens(practicaObligatoriaParser.TOKEN_SUBROUTINE); }
		public TerminalNode TOKEN_SUBROUTINE(int i) {
			return getToken(practicaObligatoriaParser.TOKEN_SUBROUTINE, i);
		}
		public PContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_p; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof practicaObligatoriaListener ) ((practicaObligatoriaListener)listener).enterP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof practicaObligatoriaListener ) ((practicaObligatoriaListener)listener).exitP(this);
		}
	}

	public final PContext p() throws RecognitionException {
		PContext _localctx = new PContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_p);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENT) | (1L << NUM_INT_CONST) | (1L << NUM_REAL_CONST) | (1L << STRING_CONST) | (1L << TOKEN_PROGRAM) | (1L << TOKEN_END) | (1L << TOKEN_SUBROUTINE))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(5); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENT) | (1L << NUM_INT_CONST) | (1L << NUM_REAL_CONST) | (1L << STRING_CONST) | (1L << TOKEN_PROGRAM) | (1L << TOKEN_END) | (1L << TOKEN_SUBROUTINE))) != 0) );
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3 \n\4\2\t\2\3\2\6"+
		"\2\6\n\2\r\2\16\2\7\3\2\2\2\3\2\2\3\5\2\3\7\n\n\24\24\2\t\2\5\3\2\2\2"+
		"\4\6\t\2\2\2\5\4\3\2\2\2\6\7\3\2\2\2\7\5\3\2\2\2\7\b\3\2\2\2\b\3\3\2\2"+
		"\2\3\7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}