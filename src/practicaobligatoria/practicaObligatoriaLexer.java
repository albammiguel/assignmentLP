// Generated from practicaObligatoria.g4 by ANTLR 4.7.2

    package practicaobligatoria;
    import java.util.*;

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
		TOKEN_PROGRAM=1, TOKEN_INTERFACE=2, TOKEN_PUNTOCOMA=3, TOKEN_END=4, TOKEN_DOBLEPUNTO=5, 
		TOKEN_PARAMETER=6, TOKEN_IGUAL=7, TOKEN_COMA=8, TOKEN_INTEGER=9, TOKEN_REAL=10, 
		TOKEN_CHARACTER=11, TOKEN_PARENTESIS_IZQ=12, TOKEN_PARENTESIS_DER=13, 
		TOKEN_SUBROUTINE=14, TOKEN_IN=15, TOKEN_OUT=16, TOKEN_INOUT=17, TOKEN_FUNCTION=18, 
		TOKEN_INTENT=19, TOKEN_MAS=20, TOKEN_MENOS=21, TOKEN_MULTIPLICACION=22, 
		TOKEN_DIVISION=23, TOKEN_CALL=24, IDENT=25, NUM_INT_CONST=26, NUM_REAL_CONST=27, 
		STRING_CONST=28, COMENTARIOS=29, WS=30;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"TOKEN_PROGRAM", "TOKEN_INTERFACE", "TOKEN_PUNTOCOMA", "TOKEN_END", "TOKEN_DOBLEPUNTO", 
			"TOKEN_PARAMETER", "TOKEN_IGUAL", "TOKEN_COMA", "TOKEN_INTEGER", "TOKEN_REAL", 
			"TOKEN_CHARACTER", "TOKEN_PARENTESIS_IZQ", "TOKEN_PARENTESIS_DER", "TOKEN_SUBROUTINE", 
			"TOKEN_IN", "TOKEN_OUT", "TOKEN_INOUT", "TOKEN_FUNCTION", "TOKEN_INTENT", 
			"TOKEN_MAS", "TOKEN_MENOS", "TOKEN_MULTIPLICACION", "TOKEN_DIVISION", 
			"TOKEN_CALL", "IDENT", "NUM_INT_CONST", "NUM_REAL_CONST", "STRING_CONST", 
			"COMENTARIOS", "WS", "DIGIT", "PUNTO_FIJO", "EXPONENCIAL", "MIXTO", "SIN_COMILLAS_DOBLES", 
			"SIN_COMILLAS_SIMPLES", "STRING_CONST1", "STRING_CONST2"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'PROGRAM'", "'INTERFACE'", "';'", "'END'", "'::'", "'PARAMETER'", 
			"'='", "','", "'INTEGER'", "'REAL'", "'CHARACTER'", "'('", "')'", "'SUBROUTINE'", 
			"'IN'", "'OUT'", "'INOUT'", "'FUNCTION'", "'INTENT'", "'+'", "'-'", "'*'", 
			"'/'", "'CALL'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TOKEN_PROGRAM", "TOKEN_INTERFACE", "TOKEN_PUNTOCOMA", "TOKEN_END", 
			"TOKEN_DOBLEPUNTO", "TOKEN_PARAMETER", "TOKEN_IGUAL", "TOKEN_COMA", "TOKEN_INTEGER", 
			"TOKEN_REAL", "TOKEN_CHARACTER", "TOKEN_PARENTESIS_IZQ", "TOKEN_PARENTESIS_DER", 
			"TOKEN_SUBROUTINE", "TOKEN_IN", "TOKEN_OUT", "TOKEN_INOUT", "TOKEN_FUNCTION", 
			"TOKEN_INTENT", "TOKEN_MAS", "TOKEN_MENOS", "TOKEN_MULTIPLICACION", "TOKEN_DIVISION", 
			"TOKEN_CALL", "IDENT", "NUM_INT_CONST", "NUM_REAL_CONST", "STRING_CONST", 
			"COMENTARIOS", "WS"
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



	    private ListaTokensDetectados listaTokens;
	    private TokenDetectado token_actual;
	    
	    //Recibir como parámetro los objetos.
	    public practicaObligatoriaLexer(CharStream ficheroFuente, 
	     ListaTokensDetectados lista){
	        this(ficheroFuente);
	        listaTokens= lista;
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
		case 0:
			TOKEN_PROGRAM_action((RuleContext)_localctx, actionIndex);
			break;
		case 1:
			TOKEN_INTERFACE_action((RuleContext)_localctx, actionIndex);
			break;
		case 2:
			TOKEN_PUNTOCOMA_action((RuleContext)_localctx, actionIndex);
			break;
		case 3:
			TOKEN_END_action((RuleContext)_localctx, actionIndex);
			break;
		case 4:
			TOKEN_DOBLEPUNTO_action((RuleContext)_localctx, actionIndex);
			break;
		case 5:
			TOKEN_PARAMETER_action((RuleContext)_localctx, actionIndex);
			break;
		case 6:
			TOKEN_IGUAL_action((RuleContext)_localctx, actionIndex);
			break;
		case 7:
			TOKEN_COMA_action((RuleContext)_localctx, actionIndex);
			break;
		case 8:
			TOKEN_INTEGER_action((RuleContext)_localctx, actionIndex);
			break;
		case 9:
			TOKEN_REAL_action((RuleContext)_localctx, actionIndex);
			break;
		case 10:
			TOKEN_CHARACTER_action((RuleContext)_localctx, actionIndex);
			break;
		case 11:
			TOKEN_PARENTESIS_IZQ_action((RuleContext)_localctx, actionIndex);
			break;
		case 12:
			TOKEN_PARENTESIS_DER_action((RuleContext)_localctx, actionIndex);
			break;
		case 13:
			TOKEN_SUBROUTINE_action((RuleContext)_localctx, actionIndex);
			break;
		case 14:
			TOKEN_IN_action((RuleContext)_localctx, actionIndex);
			break;
		case 15:
			TOKEN_OUT_action((RuleContext)_localctx, actionIndex);
			break;
		case 16:
			TOKEN_INOUT_action((RuleContext)_localctx, actionIndex);
			break;
		case 17:
			TOKEN_FUNCTION_action((RuleContext)_localctx, actionIndex);
			break;
		case 18:
			TOKEN_INTENT_action((RuleContext)_localctx, actionIndex);
			break;
		case 19:
			TOKEN_MAS_action((RuleContext)_localctx, actionIndex);
			break;
		case 20:
			TOKEN_MENOS_action((RuleContext)_localctx, actionIndex);
			break;
		case 21:
			TOKEN_MULTIPLICACION_action((RuleContext)_localctx, actionIndex);
			break;
		case 22:
			TOKEN_DIVISION_action((RuleContext)_localctx, actionIndex);
			break;
		case 23:
			TOKEN_CALL_action((RuleContext)_localctx, actionIndex);
			break;
		case 24:
			IDENT_action((RuleContext)_localctx, actionIndex);
			break;
		case 25:
			NUM_INT_CONST_action((RuleContext)_localctx, actionIndex);
			break;
		case 26:
			NUM_REAL_CONST_action((RuleContext)_localctx, actionIndex);
			break;
		case 27:
			STRING_CONST_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void TOKEN_PROGRAM_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:

			    token_actual = new TokenDetectado(true, getText(), "PROGRAM");
			    listaTokens.añadirToken(token_actual);
			break;
		}
	}
	private void TOKEN_INTERFACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:

			    token_actual = new TokenDetectado(true, getText(), "INTERFACE");
			    listaTokens.añadirToken(token_actual);
			break;
		}
	}
	private void TOKEN_PUNTOCOMA_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:

			    token_actual = new TokenDetectado(true, getText(), ";");
			    listaTokens.añadirToken(token_actual);
			break;
		}
	}
	private void TOKEN_END_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:

			    token_actual = new TokenDetectado(true, getText(), "END");
			    listaTokens.añadirToken(token_actual);
			break;
		}
	}
	private void TOKEN_DOBLEPUNTO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:

			    token_actual = new TokenDetectado(true, getText(), "::");
			    listaTokens.añadirToken(token_actual);
			break;
		}
	}
	private void TOKEN_PARAMETER_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5:

			    token_actual = new TokenDetectado(true, getText(), "PARAMETER");
			    listaTokens.añadirToken(token_actual);
			break;
		}
	}
	private void TOKEN_IGUAL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6:

			    token_actual = new TokenDetectado(true, getText(), "=");
			    listaTokens.añadirToken(token_actual);
			break;
		}
	}
	private void TOKEN_COMA_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 7:

			    token_actual = new TokenDetectado(true, getText(), ",");
			    listaTokens.añadirToken(token_actual);
			break;
		}
	}
	private void TOKEN_INTEGER_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 8:

			    token_actual = new TokenDetectado(true, getText(), "INTEGER");
			    listaTokens.añadirToken(token_actual);
			break;
		}
	}
	private void TOKEN_REAL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 9:

			    token_actual = new TokenDetectado(true, getText(), "REAL");
			    listaTokens.añadirToken(token_actual);
			break;
		}
	}
	private void TOKEN_CHARACTER_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 10:

			    token_actual = new TokenDetectado(true, getText(), "CHARACTER");
			    listaTokens.añadirToken(token_actual);
			break;
		}
	}
	private void TOKEN_PARENTESIS_IZQ_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 11:

			    token_actual = new TokenDetectado(true, getText(), "(");
			    listaTokens.añadirToken(token_actual);
			break;
		}
	}
	private void TOKEN_PARENTESIS_DER_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 12:

			    token_actual = new TokenDetectado(true, getText(), ")");
			    listaTokens.añadirToken(token_actual);
			break;
		}
	}
	private void TOKEN_SUBROUTINE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 13:

			    token_actual = new TokenDetectado(true, getText(), "SUBROUTINE");
			    listaTokens.añadirToken(token_actual);
			break;
		}
	}
	private void TOKEN_IN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 14:

			    token_actual = new TokenDetectado(true, getText(), "IN");
			    listaTokens.añadirToken(token_actual);
			break;
		}
	}
	private void TOKEN_OUT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 15:

			    token_actual = new TokenDetectado(true, getText(), "OUT");
			    listaTokens.añadirToken(token_actual);
			break;
		}
	}
	private void TOKEN_INOUT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 16:

			    token_actual = new TokenDetectado(true, getText(), "INOUT");
			    listaTokens.añadirToken(token_actual);
			break;
		}
	}
	private void TOKEN_FUNCTION_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 17:

			    token_actual = new TokenDetectado(true, getText(), "FUNCTION");
			    listaTokens.añadirToken(token_actual);
			break;
		}
	}
	private void TOKEN_INTENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 18:

			    token_actual = new TokenDetectado(true, getText(), "INTENT");
			    listaTokens.añadirToken(token_actual);
			break;
		}
	}
	private void TOKEN_MAS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 19:

			    token_actual = new TokenDetectado(true, getText(), "+");
			    listaTokens.añadirToken(token_actual);
			break;
		}
	}
	private void TOKEN_MENOS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 20:

			    token_actual = new TokenDetectado(true, getText(),  "-");
			    listaTokens.añadirToken(token_actual);
			break;
		}
	}
	private void TOKEN_MULTIPLICACION_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 21:

			    token_actual = new TokenDetectado(true, getText(), "*");
			    listaTokens.añadirToken(token_actual);
			break;
		}
	}
	private void TOKEN_DIVISION_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 22:

			    token_actual = new TokenDetectado(true, getText(), "/");
			    listaTokens.añadirToken(token_actual);
			break;
		}
	}
	private void TOKEN_CALL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 23:

			    token_actual = new TokenDetectado(true, getText(), "CALL");
			    listaTokens.añadirToken(token_actual);
			break;
		}
	}
	private void IDENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 24:
			 
			    token_actual = new TokenDetectado(true, getText(), "IDENT");
			    listaTokens.añadirToken(token_actual);
			break;
		}
	}
	private void NUM_INT_CONST_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 25:
			   
			    token_actual = new TokenDetectado(true, getText(), "NUM_INT_CONST");
			    listaTokens.añadirToken(token_actual);
			break;
		}
	}
	private void NUM_REAL_CONST_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 26:
			   
			    token_actual = new TokenDetectado(true, getText(), "NUM_REAL_CONST");
			    listaTokens.añadirToken(token_actual);
			break;
		}
	}
	private void STRING_CONST_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 27:

			    token_actual = new TokenDetectado(true, getText(), "STRING_CONST");
			    listaTokens.añadirToken(token_actual);
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2 \u016c\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4"+
		"\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32"+
		"\3\32\7\32\u00f2\n\32\f\32\16\32\u00f5\13\32\3\32\3\32\3\33\5\33\u00fa"+
		"\n\33\3\33\6\33\u00fd\n\33\r\33\16\33\u00fe\3\33\3\33\3\34\3\34\3\34\5"+
		"\34\u0106\n\34\3\34\3\34\3\35\3\35\5\35\u010c\n\35\3\35\3\35\3\36\3\36"+
		"\7\36\u0112\n\36\f\36\16\36\u0115\13\36\3\36\5\36\u0118\n\36\3\36\3\36"+
		"\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3!\5!\u0125\n!\3!\6!\u0128\n!\r!"+
		"\16!\u0129\3!\3!\6!\u012e\n!\r!\16!\u012f\3\"\5\"\u0133\n\"\3\"\6\"\u0136"+
		"\n\"\r\"\16\"\u0137\3\"\3\"\5\"\u013c\n\"\3\"\6\"\u013f\n\"\r\"\16\"\u0140"+
		"\3#\3#\3#\5#\u0146\n#\3#\6#\u0149\n#\r#\16#\u014a\3$\6$\u014e\n$\r$\16"+
		"$\u014f\3%\6%\u0153\n%\r%\16%\u0154\3&\3&\3&\3&\7&\u015b\n&\f&\16&\u015e"+
		"\13&\3&\3&\3\'\3\'\3\'\3\'\7\'\u0166\n\'\f\'\16\'\u0169\13\'\3\'\3\'\3"+
		"\u0113\2(\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?\2A\2C\2E\2G\2I\2K\2M\2\3\2\t\4\2C\\c|\6\2\62;C\\aac|\5"+
		"\2\13\f\17\17\"\"\3\2\62;\4\2GGgg\3\2$$\3\2))\2\u017a\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2"+
		"\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2"+
		"\3O\3\2\2\2\5Y\3\2\2\2\7e\3\2\2\2\th\3\2\2\2\13n\3\2\2\2\rs\3\2\2\2\17"+
		"\177\3\2\2\2\21\u0082\3\2\2\2\23\u0085\3\2\2\2\25\u008f\3\2\2\2\27\u0096"+
		"\3\2\2\2\31\u00a2\3\2\2\2\33\u00a5\3\2\2\2\35\u00a8\3\2\2\2\37\u00b5\3"+
		"\2\2\2!\u00ba\3\2\2\2#\u00c0\3\2\2\2%\u00c8\3\2\2\2\'\u00d3\3\2\2\2)\u00dc"+
		"\3\2\2\2+\u00df\3\2\2\2-\u00e2\3\2\2\2/\u00e5\3\2\2\2\61\u00e8\3\2\2\2"+
		"\63\u00ef\3\2\2\2\65\u00f9\3\2\2\2\67\u0105\3\2\2\29\u010b\3\2\2\2;\u010f"+
		"\3\2\2\2=\u011d\3\2\2\2?\u0121\3\2\2\2A\u0124\3\2\2\2C\u0132\3\2\2\2E"+
		"\u0142\3\2\2\2G\u014d\3\2\2\2I\u0152\3\2\2\2K\u0156\3\2\2\2M\u0161\3\2"+
		"\2\2OP\7R\2\2PQ\7T\2\2QR\7Q\2\2RS\7I\2\2ST\7T\2\2TU\7C\2\2UV\7O\2\2VW"+
		"\3\2\2\2WX\b\2\2\2X\4\3\2\2\2YZ\7K\2\2Z[\7P\2\2[\\\7V\2\2\\]\7G\2\2]^"+
		"\7T\2\2^_\7H\2\2_`\7C\2\2`a\7E\2\2ab\7G\2\2bc\3\2\2\2cd\b\3\3\2d\6\3\2"+
		"\2\2ef\7=\2\2fg\b\4\4\2g\b\3\2\2\2hi\7G\2\2ij\7P\2\2jk\7F\2\2kl\3\2\2"+
		"\2lm\b\5\5\2m\n\3\2\2\2no\7<\2\2op\7<\2\2pq\3\2\2\2qr\b\6\6\2r\f\3\2\2"+
		"\2st\7R\2\2tu\7C\2\2uv\7T\2\2vw\7C\2\2wx\7O\2\2xy\7G\2\2yz\7V\2\2z{\7"+
		"G\2\2{|\7T\2\2|}\3\2\2\2}~\b\7\7\2~\16\3\2\2\2\177\u0080\7?\2\2\u0080"+
		"\u0081\b\b\b\2\u0081\20\3\2\2\2\u0082\u0083\7.\2\2\u0083\u0084\b\t\t\2"+
		"\u0084\22\3\2\2\2\u0085\u0086\7K\2\2\u0086\u0087\7P\2\2\u0087\u0088\7"+
		"V\2\2\u0088\u0089\7G\2\2\u0089\u008a\7I\2\2\u008a\u008b\7G\2\2\u008b\u008c"+
		"\7T\2\2\u008c\u008d\3\2\2\2\u008d\u008e\b\n\n\2\u008e\24\3\2\2\2\u008f"+
		"\u0090\7T\2\2\u0090\u0091\7G\2\2\u0091\u0092\7C\2\2\u0092\u0093\7N\2\2"+
		"\u0093\u0094\3\2\2\2\u0094\u0095\b\13\13\2\u0095\26\3\2\2\2\u0096\u0097"+
		"\7E\2\2\u0097\u0098\7J\2\2\u0098\u0099\7C\2\2\u0099\u009a\7T\2\2\u009a"+
		"\u009b\7C\2\2\u009b\u009c\7E\2\2\u009c\u009d\7V\2\2\u009d\u009e\7G\2\2"+
		"\u009e\u009f\7T\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\b\f\f\2\u00a1\30\3"+
		"\2\2\2\u00a2\u00a3\7*\2\2\u00a3\u00a4\b\r\r\2\u00a4\32\3\2\2\2\u00a5\u00a6"+
		"\7+\2\2\u00a6\u00a7\b\16\16\2\u00a7\34\3\2\2\2\u00a8\u00a9\7U\2\2\u00a9"+
		"\u00aa\7W\2\2\u00aa\u00ab\7D\2\2\u00ab\u00ac\7T\2\2\u00ac\u00ad\7Q\2\2"+
		"\u00ad\u00ae\7W\2\2\u00ae\u00af\7V\2\2\u00af\u00b0\7K\2\2\u00b0\u00b1"+
		"\7P\2\2\u00b1\u00b2\7G\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\b\17\17\2\u00b4"+
		"\36\3\2\2\2\u00b5\u00b6\7K\2\2\u00b6\u00b7\7P\2\2\u00b7\u00b8\3\2\2\2"+
		"\u00b8\u00b9\b\20\20\2\u00b9 \3\2\2\2\u00ba\u00bb\7Q\2\2\u00bb\u00bc\7"+
		"W\2\2\u00bc\u00bd\7V\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\b\21\21\2\u00bf"+
		"\"\3\2\2\2\u00c0\u00c1\7K\2\2\u00c1\u00c2\7P\2\2\u00c2\u00c3\7Q\2\2\u00c3"+
		"\u00c4\7W\2\2\u00c4\u00c5\7V\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\b\22"+
		"\22\2\u00c7$\3\2\2\2\u00c8\u00c9\7H\2\2\u00c9\u00ca\7W\2\2\u00ca\u00cb"+
		"\7P\2\2\u00cb\u00cc\7E\2\2\u00cc\u00cd\7V\2\2\u00cd\u00ce\7K\2\2\u00ce"+
		"\u00cf\7Q\2\2\u00cf\u00d0\7P\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\b\23"+
		"\23\2\u00d2&\3\2\2\2\u00d3\u00d4\7K\2\2\u00d4\u00d5\7P\2\2\u00d5\u00d6"+
		"\7V\2\2\u00d6\u00d7\7G\2\2\u00d7\u00d8\7P\2\2\u00d8\u00d9\7V\2\2\u00d9"+
		"\u00da\3\2\2\2\u00da\u00db\b\24\24\2\u00db(\3\2\2\2\u00dc\u00dd\7-\2\2"+
		"\u00dd\u00de\b\25\25\2\u00de*\3\2\2\2\u00df\u00e0\7/\2\2\u00e0\u00e1\b"+
		"\26\26\2\u00e1,\3\2\2\2\u00e2\u00e3\7,\2\2\u00e3\u00e4\b\27\27\2\u00e4"+
		".\3\2\2\2\u00e5\u00e6\7\61\2\2\u00e6\u00e7\b\30\30\2\u00e7\60\3\2\2\2"+
		"\u00e8\u00e9\7E\2\2\u00e9\u00ea\7C\2\2\u00ea\u00eb\7N\2\2\u00eb\u00ec"+
		"\7N\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee\b\31\31\2\u00ee\62\3\2\2\2\u00ef"+
		"\u00f3\t\2\2\2\u00f0\u00f2\t\3\2\2\u00f1\u00f0\3\2\2\2\u00f2\u00f5\3\2"+
		"\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f6\3\2\2\2\u00f5"+
		"\u00f3\3\2\2\2\u00f6\u00f7\b\32\32\2\u00f7\64\3\2\2\2\u00f8\u00fa\7/\2"+
		"\2\u00f9\u00f8\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fc\3\2\2\2\u00fb\u00fd"+
		"\5? \2\u00fc\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe"+
		"\u00ff\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\b\33\33\2\u0101\66\3\2"+
		"\2\2\u0102\u0106\5A!\2\u0103\u0106\5C\"\2\u0104\u0106\5E#\2\u0105\u0102"+
		"\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107"+
		"\u0108\b\34\34\2\u01088\3\2\2\2\u0109\u010c\5K&\2\u010a\u010c\5M\'\2\u010b"+
		"\u0109\3\2\2\2\u010b\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010e\b\35"+
		"\35\2\u010e:\3\2\2\2\u010f\u0113\7#\2\2\u0110\u0112\13\2\2\2\u0111\u0110"+
		"\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0114\3\2\2\2\u0113\u0111\3\2\2\2\u0114"+
		"\u0117\3\2\2\2\u0115\u0113\3\2\2\2\u0116\u0118\7\17\2\2\u0117\u0116\3"+
		"\2\2\2\u0117\u0118\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011a\7\f\2\2\u011a"+
		"\u011b\3\2\2\2\u011b\u011c\b\36\36\2\u011c<\3\2\2\2\u011d\u011e\t\4\2"+
		"\2\u011e\u011f\3\2\2\2\u011f\u0120\b\37\36\2\u0120>\3\2\2\2\u0121\u0122"+
		"\t\5\2\2\u0122@\3\2\2\2\u0123\u0125\7/\2\2\u0124\u0123\3\2\2\2\u0124\u0125"+
		"\3\2\2\2\u0125\u0127\3\2\2\2\u0126\u0128\5? \2\u0127\u0126\3\2\2\2\u0128"+
		"\u0129\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012b\3\2"+
		"\2\2\u012b\u012d\7\60\2\2\u012c\u012e\5? \2\u012d\u012c\3\2\2\2\u012e"+
		"\u012f\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130B\3\2\2\2"+
		"\u0131\u0133\7/\2\2\u0132\u0131\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0135"+
		"\3\2\2\2\u0134\u0136\5? \2\u0135\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137"+
		"\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013b\t\6"+
		"\2\2\u013a\u013c\7/\2\2\u013b\u013a\3\2\2\2\u013b\u013c\3\2\2\2\u013c"+
		"\u013e\3\2\2\2\u013d\u013f\5? \2\u013e\u013d\3\2\2\2\u013f\u0140\3\2\2"+
		"\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141D\3\2\2\2\u0142\u0143"+
		"\5A!\2\u0143\u0145\t\6\2\2\u0144\u0146\7/\2\2\u0145\u0144\3\2\2\2\u0145"+
		"\u0146\3\2\2\2\u0146\u0148\3\2\2\2\u0147\u0149\5? \2\u0148\u0147\3\2\2"+
		"\2\u0149\u014a\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014bF"+
		"\3\2\2\2\u014c\u014e\n\7\2\2\u014d\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f"+
		"\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150H\3\2\2\2\u0151\u0153\n\b\2\2"+
		"\u0152\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0152\3\2\2\2\u0154\u0155"+
		"\3\2\2\2\u0155J\3\2\2\2\u0156\u015c\7$\2\2\u0157\u0158\7$\2\2\u0158\u015b"+
		"\7$\2\2\u0159\u015b\5G$\2\u015a\u0157\3\2\2\2\u015a\u0159\3\2\2\2\u015b"+
		"\u015e\3\2\2\2\u015c\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015f\3\2"+
		"\2\2\u015e\u015c\3\2\2\2\u015f\u0160\7$\2\2\u0160L\3\2\2\2\u0161\u0167"+
		"\7)\2\2\u0162\u0163\7)\2\2\u0163\u0166\7)\2\2\u0164\u0166\5I%\2\u0165"+
		"\u0162\3\2\2\2\u0165\u0164\3\2\2\2\u0166\u0169\3\2\2\2\u0167\u0165\3\2"+
		"\2\2\u0167\u0168\3\2\2\2\u0168\u016a\3\2\2\2\u0169\u0167\3\2\2\2\u016a"+
		"\u016b\7)\2\2\u016bN\3\2\2\2\31\2\u00f3\u00f9\u00fe\u0105\u010b\u0113"+
		"\u0117\u0124\u0129\u012f\u0132\u0137\u013b\u0140\u0145\u014a\u014f\u0154"+
		"\u015a\u015c\u0165\u0167\37\3\2\2\3\3\3\3\4\4\3\5\5\3\6\6\3\7\7\3\b\b"+
		"\3\t\t\3\n\n\3\13\13\3\f\f\3\r\r\3\16\16\3\17\17\3\20\20\3\21\21\3\22"+
		"\22\3\23\23\3\24\24\3\25\25\3\26\26\3\27\27\3\30\30\3\31\31\3\32\32\3"+
		"\33\33\3\34\34\3\35\35\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}