// Generated from practicaObligatoria.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class practicaObligatoriaLexer extends Lexer {
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
		TOKEN_DIVISION=27, TOKEN_CALL=28, COMENTARIOS=29, WS=30, PUNTO_FIJO=31, 
		EXPONENCIAL=32, MIXTO=33, SIN_COMILLAS_DOBLES=34, SIN_COMILLAS_SIMPLES=35, 
		STRING_CONST1=36, STRING_CONST2=37;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"IDENT", "NUM_INT_CONST", "NUM_REAL_CONST", "STRING_CONST", "TOKEN_PROGRAM", 
			"TOKEN_INTERFACE", "TOKEN_PUNTOCOMA", "TOKEN_END", "TOKEN_DOBLEPUNTO", 
			"TOKEN_PARAMETER", "TOKEN_IGUAL", "TOKEN_COMA", "TOKEN_INTEGER", "TOKEN_REAL", 
			"TOKEN_CHARACTER", "TOKEN_PARENTESIS_IZQ", "TOKEN_PARENTESIS_DER", "TOKEN_SUBROUTINE", 
			"TOKEN_IN", "TOKEN_OUT", "TOKEN_INOUT", "TOKEN_FUNCTION", "TOKEN_INTENT", 
			"TOKEN_MAS", "TOKEN_MENOS", "TOKEN_MULTIPLICACION", "TOKEN_DIVISION", 
			"TOKEN_CALL", "COMENTARIOS", "WS", "DIGIT", "PUNTO_FIJO", "EXPONENCIAL", 
			"MIXTO", "SIN_COMILLAS_DOBLES", "SIN_COMILLAS_SIMPLES", "STRING_CONST1", 
			"STRING_CONST2"
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
			"TOKEN_CALL", "COMENTARIOS", "WS", "PUNTO_FIJO", "EXPONENCIAL", "MIXTO", 
			"SIN_COMILLAS_DOBLES", "SIN_COMILLAS_SIMPLES", "STRING_CONST1", "STRING_CONST2"
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


	public practicaObligatoriaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "practicaObligatoria.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 1:
			NUM_INT_CONST_action((RuleContext)_localctx, actionIndex);
			break;
		case 2:
			NUM_REAL_CONST_action((RuleContext)_localctx, actionIndex);
			break;
		case 3:
			STRING_CONST_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void NUM_INT_CONST_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			 System.out.println("Constante entera "+getText()+"\n");
			break;
		}
	}
	private void NUM_REAL_CONST_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			System.out.println("Constante real "+getText()+"\n");
			break;
		}
	}
	private void STRING_CONST_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			System.out.println("Constante literal "+getText()+"\n");
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\'\u0143\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\7\2R\n\2\f\2\16\2"+
		"U\13\2\3\3\5\3X\n\3\3\3\6\3[\n\3\r\3\16\3\\\3\3\3\3\3\4\3\4\3\4\5\4d\n"+
		"\4\3\4\3\4\3\5\3\5\5\5j\n\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\32"+
		"\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\7\36\u00e9"+
		"\n\36\f\36\16\36\u00ec\13\36\3\36\5\36\u00ef\n\36\3\36\3\36\3\36\3\36"+
		"\3\37\3\37\3\37\3\37\3 \3 \3!\5!\u00fc\n!\3!\6!\u00ff\n!\r!\16!\u0100"+
		"\3!\3!\6!\u0105\n!\r!\16!\u0106\3\"\5\"\u010a\n\"\3\"\6\"\u010d\n\"\r"+
		"\"\16\"\u010e\3\"\3\"\5\"\u0113\n\"\3\"\6\"\u0116\n\"\r\"\16\"\u0117\3"+
		"#\3#\3#\5#\u011d\n#\3#\6#\u0120\n#\r#\16#\u0121\3$\6$\u0125\n$\r$\16$"+
		"\u0126\3%\6%\u012a\n%\r%\16%\u012b\3&\3&\3&\3&\7&\u0132\n&\f&\16&\u0135"+
		"\13&\3&\3&\3\'\3\'\3\'\3\'\7\'\u013d\n\'\f\'\16\'\u0140\13\'\3\'\3\'\3"+
		"\u00ea\2(\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?\2A!C\"E#G$I%K&M\'\3\2\t\3\2c|\5\2\62;aac|\5\2\13\f\17\17"+
		"\"\"\3\2\62;\4\2GGgg\3\2$$\3\2))\2\u0158\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2"+
		"\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2A\3\2\2\2\2"+
		"C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\3O\3"+
		"\2\2\2\5W\3\2\2\2\7c\3\2\2\2\ti\3\2\2\2\13m\3\2\2\2\ru\3\2\2\2\17\177"+
		"\3\2\2\2\21\u0081\3\2\2\2\23\u0085\3\2\2\2\25\u0088\3\2\2\2\27\u0092\3"+
		"\2\2\2\31\u0094\3\2\2\2\33\u0096\3\2\2\2\35\u009e\3\2\2\2\37\u00a3\3\2"+
		"\2\2!\u00ad\3\2\2\2#\u00af\3\2\2\2%\u00b1\3\2\2\2\'\u00bc\3\2\2\2)\u00bf"+
		"\3\2\2\2+\u00c3\3\2\2\2-\u00c9\3\2\2\2/\u00d2\3\2\2\2\61\u00d9\3\2\2\2"+
		"\63\u00db\3\2\2\2\65\u00dd\3\2\2\2\67\u00df\3\2\2\29\u00e1\3\2\2\2;\u00e6"+
		"\3\2\2\2=\u00f4\3\2\2\2?\u00f8\3\2\2\2A\u00fb\3\2\2\2C\u0109\3\2\2\2E"+
		"\u0119\3\2\2\2G\u0124\3\2\2\2I\u0129\3\2\2\2K\u012d\3\2\2\2M\u0138\3\2"+
		"\2\2OS\t\2\2\2PR\t\3\2\2QP\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2T\4\3"+
		"\2\2\2US\3\2\2\2VX\7/\2\2WV\3\2\2\2WX\3\2\2\2XZ\3\2\2\2Y[\5? \2ZY\3\2"+
		"\2\2[\\\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]^\3\2\2\2^_\b\3\2\2_\6\3\2\2\2`"+
		"d\5A!\2ad\5C\"\2bd\5E#\2c`\3\2\2\2ca\3\2\2\2cb\3\2\2\2de\3\2\2\2ef\b\4"+
		"\3\2f\b\3\2\2\2gj\5K&\2hj\5M\'\2ig\3\2\2\2ih\3\2\2\2jk\3\2\2\2kl\b\5\4"+
		"\2l\n\3\2\2\2mn\7R\2\2no\7T\2\2op\7Q\2\2pq\7I\2\2qr\7T\2\2rs\7C\2\2st"+
		"\7O\2\2t\f\3\2\2\2uv\7K\2\2vw\7P\2\2wx\7V\2\2xy\7G\2\2yz\7T\2\2z{\7H\2"+
		"\2{|\7C\2\2|}\7E\2\2}~\7G\2\2~\16\3\2\2\2\177\u0080\7=\2\2\u0080\20\3"+
		"\2\2\2\u0081\u0082\7G\2\2\u0082\u0083\7P\2\2\u0083\u0084\7F\2\2\u0084"+
		"\22\3\2\2\2\u0085\u0086\7<\2\2\u0086\u0087\7<\2\2\u0087\24\3\2\2\2\u0088"+
		"\u0089\7R\2\2\u0089\u008a\7C\2\2\u008a\u008b\7T\2\2\u008b\u008c\7C\2\2"+
		"\u008c\u008d\7O\2\2\u008d\u008e\7G\2\2\u008e\u008f\7V\2\2\u008f\u0090"+
		"\7G\2\2\u0090\u0091\7T\2\2\u0091\26\3\2\2\2\u0092\u0093\7?\2\2\u0093\30"+
		"\3\2\2\2\u0094\u0095\7.\2\2\u0095\32\3\2\2\2\u0096\u0097\7K\2\2\u0097"+
		"\u0098\7P\2\2\u0098\u0099\7V\2\2\u0099\u009a\7G\2\2\u009a\u009b\7I\2\2"+
		"\u009b\u009c\7G\2\2\u009c\u009d\7T\2\2\u009d\34\3\2\2\2\u009e\u009f\7"+
		"T\2\2\u009f\u00a0\7G\2\2\u00a0\u00a1\7C\2\2\u00a1\u00a2\7N\2\2\u00a2\36"+
		"\3\2\2\2\u00a3\u00a4\7E\2\2\u00a4\u00a5\7J\2\2\u00a5\u00a6\7C\2\2\u00a6"+
		"\u00a7\7T\2\2\u00a7\u00a8\7C\2\2\u00a8\u00a9\7E\2\2\u00a9\u00aa\7V\2\2"+
		"\u00aa\u00ab\7G\2\2\u00ab\u00ac\7T\2\2\u00ac \3\2\2\2\u00ad\u00ae\7*\2"+
		"\2\u00ae\"\3\2\2\2\u00af\u00b0\7+\2\2\u00b0$\3\2\2\2\u00b1\u00b2\7U\2"+
		"\2\u00b2\u00b3\7W\2\2\u00b3\u00b4\7D\2\2\u00b4\u00b5\7T\2\2\u00b5\u00b6"+
		"\7Q\2\2\u00b6\u00b7\7W\2\2\u00b7\u00b8\7V\2\2\u00b8\u00b9\7K\2\2\u00b9"+
		"\u00ba\7P\2\2\u00ba\u00bb\7G\2\2\u00bb&\3\2\2\2\u00bc\u00bd\7K\2\2\u00bd"+
		"\u00be\7P\2\2\u00be(\3\2\2\2\u00bf\u00c0\7Q\2\2\u00c0\u00c1\7W\2\2\u00c1"+
		"\u00c2\7V\2\2\u00c2*\3\2\2\2\u00c3\u00c4\7K\2\2\u00c4\u00c5\7P\2\2\u00c5"+
		"\u00c6\7Q\2\2\u00c6\u00c7\7W\2\2\u00c7\u00c8\7V\2\2\u00c8,\3\2\2\2\u00c9"+
		"\u00ca\7H\2\2\u00ca\u00cb\7W\2\2\u00cb\u00cc\7P\2\2\u00cc\u00cd\7E\2\2"+
		"\u00cd\u00ce\7V\2\2\u00ce\u00cf\7K\2\2\u00cf\u00d0\7Q\2\2\u00d0\u00d1"+
		"\7P\2\2\u00d1.\3\2\2\2\u00d2\u00d3\7K\2\2\u00d3\u00d4\7P\2\2\u00d4\u00d5"+
		"\7V\2\2\u00d5\u00d6\7G\2\2\u00d6\u00d7\7P\2\2\u00d7\u00d8\7V\2\2\u00d8"+
		"\60\3\2\2\2\u00d9\u00da\7-\2\2\u00da\62\3\2\2\2\u00db\u00dc\7/\2\2\u00dc"+
		"\64\3\2\2\2\u00dd\u00de\7,\2\2\u00de\66\3\2\2\2\u00df\u00e0\7\61\2\2\u00e0"+
		"8\3\2\2\2\u00e1\u00e2\7E\2\2\u00e2\u00e3\7C\2\2\u00e3\u00e4\7N\2\2\u00e4"+
		"\u00e5\7N\2\2\u00e5:\3\2\2\2\u00e6\u00ea\7#\2\2\u00e7\u00e9\13\2\2\2\u00e8"+
		"\u00e7\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00eb\3\2\2\2\u00ea\u00e8\3\2"+
		"\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00ef\7\17\2\2\u00ee"+
		"\u00ed\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f1\7\f"+
		"\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\b\36\5\2\u00f3<\3\2\2\2\u00f4\u00f5"+
		"\t\4\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\b\37\5\2\u00f7>\3\2\2\2\u00f8"+
		"\u00f9\t\5\2\2\u00f9@\3\2\2\2\u00fa\u00fc\7/\2\2\u00fb\u00fa\3\2\2\2\u00fb"+
		"\u00fc\3\2\2\2\u00fc\u00fe\3\2\2\2\u00fd\u00ff\5? \2\u00fe\u00fd\3\2\2"+
		"\2\u00ff\u0100\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102"+
		"\3\2\2\2\u0102\u0104\7\60\2\2\u0103\u0105\5? \2\u0104\u0103\3\2\2\2\u0105"+
		"\u0106\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107B\3\2\2\2"+
		"\u0108\u010a\7/\2\2\u0109\u0108\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010c"+
		"\3\2\2\2\u010b\u010d\5? \2\u010c\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e"+
		"\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0112\t\6"+
		"\2\2\u0111\u0113\7/\2\2\u0112\u0111\3\2\2\2\u0112\u0113\3\2\2\2\u0113"+
		"\u0115\3\2\2\2\u0114\u0116\5? \2\u0115\u0114\3\2\2\2\u0116\u0117\3\2\2"+
		"\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118D\3\2\2\2\u0119\u011a"+
		"\5A!\2\u011a\u011c\t\6\2\2\u011b\u011d\7/\2\2\u011c\u011b\3\2\2\2\u011c"+
		"\u011d\3\2\2\2\u011d\u011f\3\2\2\2\u011e\u0120\5? \2\u011f\u011e\3\2\2"+
		"\2\u0120\u0121\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122F"+
		"\3\2\2\2\u0123\u0125\n\7\2\2\u0124\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126"+
		"\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127H\3\2\2\2\u0128\u012a\n\b\2\2"+
		"\u0129\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u0129\3\2\2\2\u012b\u012c"+
		"\3\2\2\2\u012cJ\3\2\2\2\u012d\u0133\7$\2\2\u012e\u012f\7$\2\2\u012f\u0132"+
		"\7$\2\2\u0130\u0132\5G$\2\u0131\u012e\3\2\2\2\u0131\u0130\3\2\2\2\u0132"+
		"\u0135\3\2\2\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0136\3\2"+
		"\2\2\u0135\u0133\3\2\2\2\u0136\u0137\7$\2\2\u0137L\3\2\2\2\u0138\u013e"+
		"\7)\2\2\u0139\u013a\7)\2\2\u013a\u013d\7)\2\2\u013b\u013d\5I%\2\u013c"+
		"\u0139\3\2\2\2\u013c\u013b\3\2\2\2\u013d\u0140\3\2\2\2\u013e\u013c\3\2"+
		"\2\2\u013e\u013f\3\2\2\2\u013f\u0141\3\2\2\2\u0140\u013e\3\2\2\2\u0141"+
		"\u0142\7)\2\2\u0142N\3\2\2\2\31\2SW\\ci\u00ea\u00ee\u00fb\u0100\u0106"+
		"\u0109\u010e\u0112\u0117\u011c\u0121\u0126\u012b\u0131\u0133\u013c\u013e"+
		"\6\3\3\2\3\4\3\3\5\4\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}