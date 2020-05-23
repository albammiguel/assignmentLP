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
		TOKEN_PROGRAM=1, TOKEN_INTERFACE=2, TOKEN_PUNTOCOMA=3, TOKEN_END=4, TOKEN_DOBLEPUNTO_SIMPLE=5, 
		TOKEN_DOBLEPUNTO=6, TOKEN_PARAMETER=7, TOKEN_MENORQUE=8, TOKEN_MAYORQUE=9, 
		TOKEN_MENOROIGUAL=10, TOKEN_MAYOROIGUAL=11, TOKEN_IGUALIGUAL=12, TOKEN_DISTINTO=13, 
		TOKEN_IGUAL=14, TOKEN_COMA=15, TOKEN_INTEGER=16, TOKEN_REAL=17, TOKEN_CHARACTER=18, 
		TOKEN_PARENTESIS_IZQ=19, TOKEN_PARENTESIS_DER=20, TOKEN_SUBROUTINE=21, 
		TOKEN_IN=22, TOKEN_OUT=23, TOKEN_INOUT=24, TOKEN_FUNCTION=25, TOKEN_INTENT=26, 
		TOKEN_MAS=27, TOKEN_MENOS=28, TOKEN_MULTIPLICACION=29, TOKEN_DIVISION=30, 
		TOKEN_CALL=31, TOKEN_AND=32, TOKEN_OR=33, TOKEN_EQV=34, TOKEN_NEQV=35, 
		TOKEN_IF=36, TOKEN_THEN=37, TOKEN_ELSE=38, TOKEN_ENDIF=39, TOKEN_DO=40, 
		TOKEN_WHILE=41, TOKEN_ENDDO=42, TOKEN_SELECT=43, TOKEN_CASE=44, TOKEN_DEFAULT=45, 
		NUM_INT_CONST_B=46, NUM_INT_CONST_O=47, NUM_INT_CONST_H=48, TOKEN_TRUE=49, 
		TOKEN_FALSE=50, TOKEN_NOT=51, IDENT=52, NUM_INT_CONST=53, NUM_REAL_CONST=54, 
		STRING_CONST=55, COMENTARIOS=56, WS=57;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"TOKEN_PROGRAM", "TOKEN_INTERFACE", "TOKEN_PUNTOCOMA", "TOKEN_END", "TOKEN_DOBLEPUNTO_SIMPLE", 
			"TOKEN_DOBLEPUNTO", "TOKEN_PARAMETER", "TOKEN_MENORQUE", "TOKEN_MAYORQUE", 
			"TOKEN_MENOROIGUAL", "TOKEN_MAYOROIGUAL", "TOKEN_IGUALIGUAL", "TOKEN_DISTINTO", 
			"TOKEN_IGUAL", "TOKEN_COMA", "TOKEN_INTEGER", "TOKEN_REAL", "TOKEN_CHARACTER", 
			"TOKEN_PARENTESIS_IZQ", "TOKEN_PARENTESIS_DER", "TOKEN_SUBROUTINE", "TOKEN_IN", 
			"TOKEN_OUT", "TOKEN_INOUT", "TOKEN_FUNCTION", "TOKEN_INTENT", "TOKEN_MAS", 
			"TOKEN_MENOS", "TOKEN_MULTIPLICACION", "TOKEN_DIVISION", "TOKEN_CALL", 
			"TOKEN_AND", "TOKEN_OR", "TOKEN_EQV", "TOKEN_NEQV", "TOKEN_IF", "TOKEN_THEN", 
			"TOKEN_ELSE", "TOKEN_ENDIF", "TOKEN_DO", "TOKEN_WHILE", "TOKEN_ENDDO", 
			"TOKEN_SELECT", "TOKEN_CASE", "TOKEN_DEFAULT", "NUM_INT_CONST_B", "NUM_INT_CONST_O", 
			"NUM_INT_CONST_H", "TOKEN_TRUE", "TOKEN_FALSE", "TOKEN_NOT", "IDENT", 
			"NUM_INT_CONST", "NUM_REAL_CONST", "STRING_CONST", "COMENTARIOS", "WS", 
			"DIGIT", "PUNTO_FIJO", "EXPONENCIAL", "MIXTO", "SIN_COMILLAS_DOBLES", 
			"SIN_COMILLAS_SIMPLES", "STRING_CONST1", "STRING_CONST2"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'PROGRAM'", "'INTERFACE'", "';'", "'END'", "':'", "'::'", "'PARAMETER'", 
			"'<'", "'>'", "'<='", "'>='", "'=='", "'/='", "'='", "','", "'INTEGER'", 
			"'REAL'", "'CHARACTER'", "'('", "')'", "'SUBROUTINE'", "'IN'", "'OUT'", 
			"'INOUT'", "'FUNCTION'", "'INTENT'", "'+'", "'-'", "'*'", "'/'", "'CALL'", 
			"'.AND.'", "'.OR.'", "'.EQV.'", "'.NEQV.'", "'IF'", "'THEN'", "'ELSE'", 
			"'ENDIF'", "'DO'", "'WHILE'", "'ENDDO'", "'SELECT'", "'CASE'", "'DEFAULT'", 
			null, null, null, "'.TRUE.'", "'.FALSE.'", "'.NOT.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TOKEN_PROGRAM", "TOKEN_INTERFACE", "TOKEN_PUNTOCOMA", "TOKEN_END", 
			"TOKEN_DOBLEPUNTO_SIMPLE", "TOKEN_DOBLEPUNTO", "TOKEN_PARAMETER", "TOKEN_MENORQUE", 
			"TOKEN_MAYORQUE", "TOKEN_MENOROIGUAL", "TOKEN_MAYOROIGUAL", "TOKEN_IGUALIGUAL", 
			"TOKEN_DISTINTO", "TOKEN_IGUAL", "TOKEN_COMA", "TOKEN_INTEGER", "TOKEN_REAL", 
			"TOKEN_CHARACTER", "TOKEN_PARENTESIS_IZQ", "TOKEN_PARENTESIS_DER", "TOKEN_SUBROUTINE", 
			"TOKEN_IN", "TOKEN_OUT", "TOKEN_INOUT", "TOKEN_FUNCTION", "TOKEN_INTENT", 
			"TOKEN_MAS", "TOKEN_MENOS", "TOKEN_MULTIPLICACION", "TOKEN_DIVISION", 
			"TOKEN_CALL", "TOKEN_AND", "TOKEN_OR", "TOKEN_EQV", "TOKEN_NEQV", "TOKEN_IF", 
			"TOKEN_THEN", "TOKEN_ELSE", "TOKEN_ENDIF", "TOKEN_DO", "TOKEN_WHILE", 
			"TOKEN_ENDDO", "TOKEN_SELECT", "TOKEN_CASE", "TOKEN_DEFAULT", "NUM_INT_CONST_B", 
			"NUM_INT_CONST_O", "NUM_INT_CONST_H", "TOKEN_TRUE", "TOKEN_FALSE", "TOKEN_NOT", 
			"IDENT", "NUM_INT_CONST", "NUM_REAL_CONST", "STRING_CONST", "COMENTARIOS", 
			"WS"
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


	    private ListaTokensDetectadosClass listaTokens;
	    private TokenDetectadoClass token_actual;
	    
	    //Recibir como parámetro los objetos.
	    public practicaObligatoriaLexer(CharStream ficheroFuente, 
	     ListaTokensDetectadosClass lista){
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
			TOKEN_DOBLEPUNTO_SIMPLE_action((RuleContext)_localctx, actionIndex);
			break;
		case 5:
			TOKEN_DOBLEPUNTO_action((RuleContext)_localctx, actionIndex);
			break;
		case 6:
			TOKEN_PARAMETER_action((RuleContext)_localctx, actionIndex);
			break;
		case 7:
			TOKEN_MENORQUE_action((RuleContext)_localctx, actionIndex);
			break;
		case 8:
			TOKEN_MAYORQUE_action((RuleContext)_localctx, actionIndex);
			break;
		case 9:
			TOKEN_MENOROIGUAL_action((RuleContext)_localctx, actionIndex);
			break;
		case 10:
			TOKEN_MAYOROIGUAL_action((RuleContext)_localctx, actionIndex);
			break;
		case 11:
			TOKEN_IGUALIGUAL_action((RuleContext)_localctx, actionIndex);
			break;
		case 12:
			TOKEN_DISTINTO_action((RuleContext)_localctx, actionIndex);
			break;
		case 13:
			TOKEN_IGUAL_action((RuleContext)_localctx, actionIndex);
			break;
		case 14:
			TOKEN_COMA_action((RuleContext)_localctx, actionIndex);
			break;
		case 15:
			TOKEN_INTEGER_action((RuleContext)_localctx, actionIndex);
			break;
		case 16:
			TOKEN_REAL_action((RuleContext)_localctx, actionIndex);
			break;
		case 17:
			TOKEN_CHARACTER_action((RuleContext)_localctx, actionIndex);
			break;
		case 18:
			TOKEN_PARENTESIS_IZQ_action((RuleContext)_localctx, actionIndex);
			break;
		case 19:
			TOKEN_PARENTESIS_DER_action((RuleContext)_localctx, actionIndex);
			break;
		case 20:
			TOKEN_SUBROUTINE_action((RuleContext)_localctx, actionIndex);
			break;
		case 21:
			TOKEN_IN_action((RuleContext)_localctx, actionIndex);
			break;
		case 22:
			TOKEN_OUT_action((RuleContext)_localctx, actionIndex);
			break;
		case 23:
			TOKEN_INOUT_action((RuleContext)_localctx, actionIndex);
			break;
		case 24:
			TOKEN_FUNCTION_action((RuleContext)_localctx, actionIndex);
			break;
		case 25:
			TOKEN_INTENT_action((RuleContext)_localctx, actionIndex);
			break;
		case 26:
			TOKEN_MAS_action((RuleContext)_localctx, actionIndex);
			break;
		case 27:
			TOKEN_MENOS_action((RuleContext)_localctx, actionIndex);
			break;
		case 28:
			TOKEN_MULTIPLICACION_action((RuleContext)_localctx, actionIndex);
			break;
		case 29:
			TOKEN_DIVISION_action((RuleContext)_localctx, actionIndex);
			break;
		case 30:
			TOKEN_CALL_action((RuleContext)_localctx, actionIndex);
			break;
		case 31:
			TOKEN_AND_action((RuleContext)_localctx, actionIndex);
			break;
		case 32:
			TOKEN_OR_action((RuleContext)_localctx, actionIndex);
			break;
		case 33:
			TOKEN_EQV_action((RuleContext)_localctx, actionIndex);
			break;
		case 34:
			TOKEN_NEQV_action((RuleContext)_localctx, actionIndex);
			break;
		case 35:
			TOKEN_IF_action((RuleContext)_localctx, actionIndex);
			break;
		case 36:
			TOKEN_THEN_action((RuleContext)_localctx, actionIndex);
			break;
		case 37:
			TOKEN_ELSE_action((RuleContext)_localctx, actionIndex);
			break;
		case 38:
			TOKEN_ENDIF_action((RuleContext)_localctx, actionIndex);
			break;
		case 39:
			TOKEN_DO_action((RuleContext)_localctx, actionIndex);
			break;
		case 40:
			TOKEN_WHILE_action((RuleContext)_localctx, actionIndex);
			break;
		case 41:
			TOKEN_ENDDO_action((RuleContext)_localctx, actionIndex);
			break;
		case 42:
			TOKEN_SELECT_action((RuleContext)_localctx, actionIndex);
			break;
		case 43:
			TOKEN_CASE_action((RuleContext)_localctx, actionIndex);
			break;
		case 44:
			TOKEN_DEFAULT_action((RuleContext)_localctx, actionIndex);
			break;
		case 45:
			NUM_INT_CONST_B_action((RuleContext)_localctx, actionIndex);
			break;
		case 46:
			NUM_INT_CONST_O_action((RuleContext)_localctx, actionIndex);
			break;
		case 47:
			NUM_INT_CONST_H_action((RuleContext)_localctx, actionIndex);
			break;
		case 48:
			TOKEN_TRUE_action((RuleContext)_localctx, actionIndex);
			break;
		case 49:
			TOKEN_FALSE_action((RuleContext)_localctx, actionIndex);
			break;
		case 50:
			TOKEN_NOT_action((RuleContext)_localctx, actionIndex);
			break;
		case 51:
			IDENT_action((RuleContext)_localctx, actionIndex);
			break;
		case 52:
			NUM_INT_CONST_action((RuleContext)_localctx, actionIndex);
			break;
		case 53:
			NUM_REAL_CONST_action((RuleContext)_localctx, actionIndex);
			break;
		case 54:
			STRING_CONST_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void TOKEN_PROGRAM_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:

			    token_actual = new TokenDetectadoClass(true, getText(), "TOKEN_PROGRAM");
			    listaTokens.añadirToken(token_actual);
			break;
		}
	}
	private void TOKEN_INTERFACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:

			    token_actual = new TokenDetectadoClass(true, getText(), "TOKEN_INTERFACE");
			    listaTokens.añadirToken(token_actual);
			break;
		}
	}
	private void TOKEN_PUNTOCOMA_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:

			    token_actual = new TokenDetectadoClass(true, getText(), "TOKEN_PUNTOCOMA");
			    listaTokens.añadirToken(token_actual);
			break;
		}
	}
	private void TOKEN_END_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:

			    token_actual = new TokenDetectadoClass(true, getText(), "TOKEN_END");
			    listaTokens.añadirToken(token_actual);
			break;
		}
	}
	private void TOKEN_DOBLEPUNTO_SIMPLE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:

			    token_actual = new TokenDetectadoClass(true, getText(), "TOKEN_DOBLEPUNTO_SIMPLE");
			    listaTokens.añadirToken(token_actual);
			break;
		}
	}
	private void TOKEN_DOBLEPUNTO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5:

			    token_actual = new TokenDetectadoClass(true, getText(), "TOKEN_DOBLEPUNTO");
			    listaTokens.añadirToken(token_actual);
			break;
		}
	}
	private void TOKEN_PARAMETER_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6:

			    token_actual = new TokenDetectadoClass(true, getText(), "TOKEN_PARAMETER");
			    listaTokens.añadirToken(token_actual);
			break;
		}
	}
	private void TOKEN_MENORQUE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 7:

			    token_actual = new TokenDetectadoClass(true, getText(), "TOKEN_MENORQUE");
			    listaTokens.añadirToken(token_actual);
			break;
		}
	}
	private void TOKEN_MAYORQUE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 8:

			    token_actual = new TokenDetectadoClass(true, getText(), "TOKEN_MAYORQUE");
			    listaTokens.añadirToken(token_actual);
			break;
		}
	}
	private void TOKEN_MENOROIGUAL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 9:

			    token_actual = new TokenDetectadoClass(true, getText(), "TOKEN_MENOROIGUAL");
			    listaTokens.añadirToken(token_actual);
			break;
		}
	}
	private void TOKEN_MAYOROIGUAL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 10:

			    token_actual = new TokenDetectadoClass(true, getText(), "TOKEN_MAYOROIGUAL");
			    listaTokens.añadirToken(token_actual);
			break;
		}
	}
	private void TOKEN_IGUALIGUAL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 11:

			    token_actual = new TokenDetectadoClass(true, getText(), "TOKEN_IGUALIGUAL");
			    listaTokens.añadirToken(token_actual);
			break;
		}
	}
	private void TOKEN_DISTINTO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 12:

			    token_actual = new TokenDetectadoClass(true, getText(), "TOKEN_DISTINTO");
			    listaTokens.añadirToken(token_actual);
			break;
		}
	}
	private void TOKEN_IGUAL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 13:

			    token_actual = new TokenDetectadoClass(true, getText(), "TOKEN_IGUAL");
			    listaTokens.añadirToken(token_actual);
			break;
		}
	}
	private void TOKEN_COMA_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 14:

			    token_actual = new TokenDetectadoClass(true, getText(), "TOKEN_COMA");
			    listaTokens.añadirToken(token_actual);
			break;
		}
	}
	private void TOKEN_INTEGER_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 15:

			    token_actual = new TokenDetectadoClass(true, getText(), "TOKEN_INTEGER");
			    listaTokens.añadirToken(token_actual);
			break;
		}
	}
	private void TOKEN_REAL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 16:

			    token_actual = new TokenDetectadoClass(true, getText(), "TOKEN_REAL");
			    listaTokens.añadirToken(token_actual);
			break;
		}
	}
	private void TOKEN_CHARACTER_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 17:

			    token_actual = new TokenDetectadoClass(true, getText(), "TOKEN_CHARACTER");
			    listaTokens.añadirToken(token_actual);
			break;
		}
	}
	private void TOKEN_PARENTESIS_IZQ_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 18:

			    token_actual = new TokenDetectadoClass(true, getText(), "TOKEN_PARENTESIS_IZQ");
			    listaTokens.añadirToken(token_actual);
			break;
		}
	}
	private void TOKEN_PARENTESIS_DER_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 19:

			    token_actual = new TokenDetectadoClass(true, getText(), "TOKEN_PARENTESIS_DER");
			    listaTokens.añadirToken(token_actual);
			break;
		}
	}
	private void TOKEN_SUBROUTINE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 20:

			    token_actual = new TokenDetectadoClass(true, getText(), "TOKEN_SUBROUTINE");
			    listaTokens.añadirToken(token_actual);
			break;
		}
	}
	private void TOKEN_IN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 21:

			    token_actual = new TokenDetectadoClass(true, getText(), "TOKEN_IN");
			    listaTokens.añadirToken(token_actual);
			break;
		}
	}
	private void TOKEN_OUT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 22:

			    token_actual = new TokenDetectadoClass(true, getText(), "TOKEN_OUT");
			    listaTokens.añadirToken(token_actual);
			break;
		}
	}
	private void TOKEN_INOUT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 23:

			    token_actual = new TokenDetectadoClass(true, getText(), "TOKEN_INOUT");
			    listaTokens.añadirToken(token_actual);
			break;
		}
	}
	private void TOKEN_FUNCTION_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 24:

			    token_actual = new TokenDetectadoClass(true, getText(), "TOKEN_FUNCTION");
			    listaTokens.añadirToken(token_actual);
			break;
		}
	}
	private void TOKEN_INTENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 25:

			    token_actual = new TokenDetectadoClass(true, getText(), "TOKEN_INTENT");
			    listaTokens.añadirToken(token_actual);
			break;
		}
	}
	private void TOKEN_MAS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 26:

			    token_actual = new TokenDetectadoClass(true, getText(), "TOKEN_MAS");
			    listaTokens.añadirToken(token_actual);
			break;
		}
	}
	private void TOKEN_MENOS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 27:

			    token_actual = new TokenDetectadoClass(true, getText(),  "TOKEN_MENOS");
			    listaTokens.añadirToken(token_actual);
			break;
		}
	}
	private void TOKEN_MULTIPLICACION_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 28:

			    token_actual = new TokenDetectadoClass(true, getText(), "TOKEN_MULTIPLICACION");
			    listaTokens.añadirToken(token_actual);
			break;
		}
	}
	private void TOKEN_DIVISION_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 29:

			    token_actual = new TokenDetectadoClass(true, getText(), "TOKEN_DIVISION");
			    listaTokens.añadirToken(token_actual);
			break;
		}
	}
	private void TOKEN_CALL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 30:

			    token_actual = new TokenDetectadoClass(true, getText(), "TOKEN_CALL");
			    listaTokens.añadirToken(token_actual);
			break;
		}
	}
	private void TOKEN_AND_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 31:

			    token_actual = new TokenDetectadoClass(true, getText(), "TOKEN_AND");
			    listaTokens.añadirToken(token_actual);
			break;
		}
	}
	private void TOKEN_OR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 32:

			    token_actual = new TokenDetectadoClass(true, getText(), "TOKEN_OR");
			    listaTokens.añadirToken(token_actual);
			break;
		}
	}
	private void TOKEN_EQV_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 33:

			    token_actual = new TokenDetectadoClass(true, getText(), "TOKEN_EQV");
			    listaTokens.añadirToken(token_actual);
			break;
		}
	}
	private void TOKEN_NEQV_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 34:

			    token_actual = new TokenDetectadoClass(true, getText(), "TOKEN_NEQV");
			    listaTokens.añadirToken(token_actual);
			break;
		}
	}
	private void TOKEN_IF_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 35:

			    token_actual = new TokenDetectadoClass(true, getText(), "TOKEN_IF");
			    listaTokens.añadirToken(token_actual);
			break;
		}
	}
	private void TOKEN_THEN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 36:

			    token_actual = new TokenDetectadoClass(true, getText(), "TOKEN_THEN");
			    listaTokens.añadirToken(token_actual);
			break;
		}
	}
	private void TOKEN_ELSE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 37:

			    token_actual = new TokenDetectadoClass(true, getText(), "TOKEN_ELSE");
			    listaTokens.añadirToken(token_actual);
			break;
		}
	}
	private void TOKEN_ENDIF_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 38:

			    token_actual = new TokenDetectadoClass(true, getText(), "TOKEN_ENDIF");
			    listaTokens.añadirToken(token_actual);
			break;
		}
	}
	private void TOKEN_DO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 39:

			    token_actual = new TokenDetectadoClass(true, getText(), "TOKEN_DO");
			    listaTokens.añadirToken(token_actual);
			break;
		}
	}
	private void TOKEN_WHILE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 40:

			    token_actual = new TokenDetectadoClass(true, getText(), "TOKEN_WHILE");
			    listaTokens.añadirToken(token_actual);
			break;
		}
	}
	private void TOKEN_ENDDO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 41:

			    token_actual = new TokenDetectadoClass(true, getText(), "TOKEN_ENDDO");
			    listaTokens.añadirToken(token_actual);
			break;
		}
	}
	private void TOKEN_SELECT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 42:

			    token_actual = new TokenDetectadoClass(true, getText(), "TOKEN_SELECT");
			    listaTokens.añadirToken(token_actual);
			break;
		}
	}
	private void TOKEN_CASE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 43:

			    token_actual = new TokenDetectadoClass(true, getText(), "TOKEN_CASE");
			    listaTokens.añadirToken(token_actual);
			break;
		}
	}
	private void TOKEN_DEFAULT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 44:

			    token_actual = new TokenDetectadoClass(true, getText(), "TOKEN_DEFAULT");
			    listaTokens.añadirToken(token_actual);
			break;
		}
	}
	private void NUM_INT_CONST_B_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 45:

			    token_actual = new TokenDetectadoClass(true, getText(), "NUM_INT_CONST_B");
			    listaTokens.añadirToken(token_actual);
			break;
		}
	}
	private void NUM_INT_CONST_O_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 46:

			    token_actual = new TokenDetectadoClass(true, getText(), "NUM_INT_CONST_O");
			    listaTokens.añadirToken(token_actual);
			break;
		}
	}
	private void NUM_INT_CONST_H_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 47:

			    token_actual = new TokenDetectadoClass(true, getText(), "NUM_INT_CONST_H");
			    listaTokens.añadirToken(token_actual);
			break;
		}
	}
	private void TOKEN_TRUE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 48:

			    token_actual = new TokenDetectadoClass(true, getText(), "TOKEN_TRUE");
			    listaTokens.añadirToken(token_actual);
			break;
		}
	}
	private void TOKEN_FALSE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 49:

			    token_actual = new TokenDetectadoClass(true, getText(), "TOKEN_FALSE");
			    listaTokens.añadirToken(token_actual);
			break;
		}
	}
	private void TOKEN_NOT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 50:

			    token_actual = new TokenDetectadoClass(true, getText(), "TOKEN_NOT");
			    listaTokens.añadirToken(token_actual);
			break;
		}
	}
	private void IDENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 51:
			 
			    token_actual = new TokenDetectadoClass(true, getText(), "IDENT");
			    listaTokens.añadirToken(token_actual);
			break;
		}
	}
	private void NUM_INT_CONST_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 52:
			   
			    token_actual = new TokenDetectadoClass(true, getText(), "NUM_INT_CONST");
			    listaTokens.añadirToken(token_actual);
			break;
		}
	}
	private void NUM_REAL_CONST_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 53:
			   
			    token_actual = new TokenDetectadoClass(true, getText(), "NUM_REAL_CONST");
			    listaTokens.añadirToken(token_actual);
			break;
		}
	}
	private void STRING_CONST_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 54:

			    token_actual = new TokenDetectadoClass(true, getText(), "STRING_CONST");
			    listaTokens.añadirToken(token_actual);
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2;\u0262\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3"+
		"\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3"+
		"\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!"+
		"\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3"+
		"*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3"+
		"-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\6/\u01b0\n/\r/\16/\u01b1"+
		"\3/\3/\3/\3\60\3\60\3\60\6\60\u01ba\n\60\r\60\16\60\u01bb\3\60\3\60\3"+
		"\60\3\61\3\61\3\61\6\61\u01c4\n\61\r\61\16\61\u01c5\3\61\3\61\3\61\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65"+
		"\7\65\u01e8\n\65\f\65\16\65\u01eb\13\65\3\65\3\65\3\66\5\66\u01f0\n\66"+
		"\3\66\6\66\u01f3\n\66\r\66\16\66\u01f4\3\66\3\66\3\67\3\67\3\67\5\67\u01fc"+
		"\n\67\3\67\3\67\38\38\58\u0202\n8\38\38\39\39\79\u0208\n9\f9\169\u020b"+
		"\139\39\59\u020e\n9\39\39\39\39\3:\3:\3:\3:\3;\3;\3<\5<\u021b\n<\3<\6"+
		"<\u021e\n<\r<\16<\u021f\3<\3<\6<\u0224\n<\r<\16<\u0225\3=\5=\u0229\n="+
		"\3=\6=\u022c\n=\r=\16=\u022d\3=\3=\5=\u0232\n=\3=\6=\u0235\n=\r=\16=\u0236"+
		"\3>\3>\3>\5>\u023c\n>\3>\6>\u023f\n>\r>\16>\u0240\3?\6?\u0244\n?\r?\16"+
		"?\u0245\3@\6@\u0249\n@\r@\16@\u024a\3A\3A\3A\3A\7A\u0251\nA\fA\16A\u0254"+
		"\13A\3A\3A\3B\3B\3B\3B\7B\u025c\nB\fB\16B\u025f\13B\3B\3B\3\u0209\2C\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37="+
		" ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9"+
		"q:s;u\2w\2y\2{\2}\2\177\2\u0081\2\u0083\2\3\2\f\3\2\62\63\3\2\629\4\2"+
		"\62;CH\4\2C\\c|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\3\2\62;\4\2GGgg\3\2"+
		"$$\3\2))\2\u0273\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2"+
		"\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2"+
		"\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k"+
		"\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\3\u0085\3\2\2\2\5"+
		"\u008f\3\2\2\2\7\u009b\3\2\2\2\t\u009e\3\2\2\2\13\u00a4\3\2\2\2\r\u00a7"+
		"\3\2\2\2\17\u00ac\3\2\2\2\21\u00b8\3\2\2\2\23\u00bb\3\2\2\2\25\u00be\3"+
		"\2\2\2\27\u00c3\3\2\2\2\31\u00c8\3\2\2\2\33\u00cd\3\2\2\2\35\u00d2\3\2"+
		"\2\2\37\u00d5\3\2\2\2!\u00d8\3\2\2\2#\u00e2\3\2\2\2%\u00e9\3\2\2\2\'\u00f5"+
		"\3\2\2\2)\u00f8\3\2\2\2+\u00fb\3\2\2\2-\u0108\3\2\2\2/\u010d\3\2\2\2\61"+
		"\u0113\3\2\2\2\63\u011b\3\2\2\2\65\u0126\3\2\2\2\67\u012f\3\2\2\29\u0132"+
		"\3\2\2\2;\u0135\3\2\2\2=\u0138\3\2\2\2?\u013b\3\2\2\2A\u0142\3\2\2\2C"+
		"\u014a\3\2\2\2E\u0151\3\2\2\2G\u0159\3\2\2\2I\u0162\3\2\2\2K\u0167\3\2"+
		"\2\2M\u016e\3\2\2\2O\u0175\3\2\2\2Q\u017d\3\2\2\2S\u0182\3\2\2\2U\u018a"+
		"\3\2\2\2W\u0192\3\2\2\2Y\u019b\3\2\2\2[\u01a2\3\2\2\2]\u01ac\3\2\2\2_"+
		"\u01b6\3\2\2\2a\u01c0\3\2\2\2c\u01ca\3\2\2\2e\u01d3\3\2\2\2g\u01dd\3\2"+
		"\2\2i\u01e5\3\2\2\2k\u01ef\3\2\2\2m\u01fb\3\2\2\2o\u0201\3\2\2\2q\u0205"+
		"\3\2\2\2s\u0213\3\2\2\2u\u0217\3\2\2\2w\u021a\3\2\2\2y\u0228\3\2\2\2{"+
		"\u0238\3\2\2\2}\u0243\3\2\2\2\177\u0248\3\2\2\2\u0081\u024c\3\2\2\2\u0083"+
		"\u0257\3\2\2\2\u0085\u0086\7R\2\2\u0086\u0087\7T\2\2\u0087\u0088\7Q\2"+
		"\2\u0088\u0089\7I\2\2\u0089\u008a\7T\2\2\u008a\u008b\7C\2\2\u008b\u008c"+
		"\7O\2\2\u008c\u008d\3\2\2\2\u008d\u008e\b\2\2\2\u008e\4\3\2\2\2\u008f"+
		"\u0090\7K\2\2\u0090\u0091\7P\2\2\u0091\u0092\7V\2\2\u0092\u0093\7G\2\2"+
		"\u0093\u0094\7T\2\2\u0094\u0095\7H\2\2\u0095\u0096\7C\2\2\u0096\u0097"+
		"\7E\2\2\u0097\u0098\7G\2\2\u0098\u0099\3\2\2\2\u0099\u009a\b\3\3\2\u009a"+
		"\6\3\2\2\2\u009b\u009c\7=\2\2\u009c\u009d\b\4\4\2\u009d\b\3\2\2\2\u009e"+
		"\u009f\7G\2\2\u009f\u00a0\7P\2\2\u00a0\u00a1\7F\2\2\u00a1\u00a2\3\2\2"+
		"\2\u00a2\u00a3\b\5\5\2\u00a3\n\3\2\2\2\u00a4\u00a5\7<\2\2\u00a5\u00a6"+
		"\b\6\6\2\u00a6\f\3\2\2\2\u00a7\u00a8\7<\2\2\u00a8\u00a9\7<\2\2\u00a9\u00aa"+
		"\3\2\2\2\u00aa\u00ab\b\7\7\2\u00ab\16\3\2\2\2\u00ac\u00ad\7R\2\2\u00ad"+
		"\u00ae\7C\2\2\u00ae\u00af\7T\2\2\u00af\u00b0\7C\2\2\u00b0\u00b1\7O\2\2"+
		"\u00b1\u00b2\7G\2\2\u00b2\u00b3\7V\2\2\u00b3\u00b4\7G\2\2\u00b4\u00b5"+
		"\7T\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\b\b\b\2\u00b7\20\3\2\2\2\u00b8"+
		"\u00b9\7>\2\2\u00b9\u00ba\b\t\t\2\u00ba\22\3\2\2\2\u00bb\u00bc\7@\2\2"+
		"\u00bc\u00bd\b\n\n\2\u00bd\24\3\2\2\2\u00be\u00bf\7>\2\2\u00bf\u00c0\7"+
		"?\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\b\13\13\2\u00c2\26\3\2\2\2\u00c3"+
		"\u00c4\7@\2\2\u00c4\u00c5\7?\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\b\f\f"+
		"\2\u00c7\30\3\2\2\2\u00c8\u00c9\7?\2\2\u00c9\u00ca\7?\2\2\u00ca\u00cb"+
		"\3\2\2\2\u00cb\u00cc\b\r\r\2\u00cc\32\3\2\2\2\u00cd\u00ce\7\61\2\2\u00ce"+
		"\u00cf\7?\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\b\16\16\2\u00d1\34\3\2\2"+
		"\2\u00d2\u00d3\7?\2\2\u00d3\u00d4\b\17\17\2\u00d4\36\3\2\2\2\u00d5\u00d6"+
		"\7.\2\2\u00d6\u00d7\b\20\20\2\u00d7 \3\2\2\2\u00d8\u00d9\7K\2\2\u00d9"+
		"\u00da\7P\2\2\u00da\u00db\7V\2\2\u00db\u00dc\7G\2\2\u00dc\u00dd\7I\2\2"+
		"\u00dd\u00de\7G\2\2\u00de\u00df\7T\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1"+
		"\b\21\21\2\u00e1\"\3\2\2\2\u00e2\u00e3\7T\2\2\u00e3\u00e4\7G\2\2\u00e4"+
		"\u00e5\7C\2\2\u00e5\u00e6\7N\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e8\b\22"+
		"\22\2\u00e8$\3\2\2\2\u00e9\u00ea\7E\2\2\u00ea\u00eb\7J\2\2\u00eb\u00ec"+
		"\7C\2\2\u00ec\u00ed\7T\2\2\u00ed\u00ee\7C\2\2\u00ee\u00ef\7E\2\2\u00ef"+
		"\u00f0\7V\2\2\u00f0\u00f1\7G\2\2\u00f1\u00f2\7T\2\2\u00f2\u00f3\3\2\2"+
		"\2\u00f3\u00f4\b\23\23\2\u00f4&\3\2\2\2\u00f5\u00f6\7*\2\2\u00f6\u00f7"+
		"\b\24\24\2\u00f7(\3\2\2\2\u00f8\u00f9\7+\2\2\u00f9\u00fa\b\25\25\2\u00fa"+
		"*\3\2\2\2\u00fb\u00fc\7U\2\2\u00fc\u00fd\7W\2\2\u00fd\u00fe\7D\2\2\u00fe"+
		"\u00ff\7T\2\2\u00ff\u0100\7Q\2\2\u0100\u0101\7W\2\2\u0101\u0102\7V\2\2"+
		"\u0102\u0103\7K\2\2\u0103\u0104\7P\2\2\u0104\u0105\7G\2\2\u0105\u0106"+
		"\3\2\2\2\u0106\u0107\b\26\26\2\u0107,\3\2\2\2\u0108\u0109\7K\2\2\u0109"+
		"\u010a\7P\2\2\u010a\u010b\3\2\2\2\u010b\u010c\b\27\27\2\u010c.\3\2\2\2"+
		"\u010d\u010e\7Q\2\2\u010e\u010f\7W\2\2\u010f\u0110\7V\2\2\u0110\u0111"+
		"\3\2\2\2\u0111\u0112\b\30\30\2\u0112\60\3\2\2\2\u0113\u0114\7K\2\2\u0114"+
		"\u0115\7P\2\2\u0115\u0116\7Q\2\2\u0116\u0117\7W\2\2\u0117\u0118\7V\2\2"+
		"\u0118\u0119\3\2\2\2\u0119\u011a\b\31\31\2\u011a\62\3\2\2\2\u011b\u011c"+
		"\7H\2\2\u011c\u011d\7W\2\2\u011d\u011e\7P\2\2\u011e\u011f\7E\2\2\u011f"+
		"\u0120\7V\2\2\u0120\u0121\7K\2\2\u0121\u0122\7Q\2\2\u0122\u0123\7P\2\2"+
		"\u0123\u0124\3\2\2\2\u0124\u0125\b\32\32\2\u0125\64\3\2\2\2\u0126\u0127"+
		"\7K\2\2\u0127\u0128\7P\2\2\u0128\u0129\7V\2\2\u0129\u012a\7G\2\2\u012a"+
		"\u012b\7P\2\2\u012b\u012c\7V\2\2\u012c\u012d\3\2\2\2\u012d\u012e\b\33"+
		"\33\2\u012e\66\3\2\2\2\u012f\u0130\7-\2\2\u0130\u0131\b\34\34\2\u0131"+
		"8\3\2\2\2\u0132\u0133\7/\2\2\u0133\u0134\b\35\35\2\u0134:\3\2\2\2\u0135"+
		"\u0136\7,\2\2\u0136\u0137\b\36\36\2\u0137<\3\2\2\2\u0138\u0139\7\61\2"+
		"\2\u0139\u013a\b\37\37\2\u013a>\3\2\2\2\u013b\u013c\7E\2\2\u013c\u013d"+
		"\7C\2\2\u013d\u013e\7N\2\2\u013e\u013f\7N\2\2\u013f\u0140\3\2\2\2\u0140"+
		"\u0141\b  \2\u0141@\3\2\2\2\u0142\u0143\7\60\2\2\u0143\u0144\7C\2\2\u0144"+
		"\u0145\7P\2\2\u0145\u0146\7F\2\2\u0146\u0147\7\60\2\2\u0147\u0148\3\2"+
		"\2\2\u0148\u0149\b!!\2\u0149B\3\2\2\2\u014a\u014b\7\60\2\2\u014b\u014c"+
		"\7Q\2\2\u014c\u014d\7T\2\2\u014d\u014e\7\60\2\2\u014e\u014f\3\2\2\2\u014f"+
		"\u0150\b\"\"\2\u0150D\3\2\2\2\u0151\u0152\7\60\2\2\u0152\u0153\7G\2\2"+
		"\u0153\u0154\7S\2\2\u0154\u0155\7X\2\2\u0155\u0156\7\60\2\2\u0156\u0157"+
		"\3\2\2\2\u0157\u0158\b##\2\u0158F\3\2\2\2\u0159\u015a\7\60\2\2\u015a\u015b"+
		"\7P\2\2\u015b\u015c\7G\2\2\u015c\u015d\7S\2\2\u015d\u015e\7X\2\2\u015e"+
		"\u015f\7\60\2\2\u015f\u0160\3\2\2\2\u0160\u0161\b$$\2\u0161H\3\2\2\2\u0162"+
		"\u0163\7K\2\2\u0163\u0164\7H\2\2\u0164\u0165\3\2\2\2\u0165\u0166\b%%\2"+
		"\u0166J\3\2\2\2\u0167\u0168\7V\2\2\u0168\u0169\7J\2\2\u0169\u016a\7G\2"+
		"\2\u016a\u016b\7P\2\2\u016b\u016c\3\2\2\2\u016c\u016d\b&&\2\u016dL\3\2"+
		"\2\2\u016e\u016f\7G\2\2\u016f\u0170\7N\2\2\u0170\u0171\7U\2\2\u0171\u0172"+
		"\7G\2\2\u0172\u0173\3\2\2\2\u0173\u0174\b\'\'\2\u0174N\3\2\2\2\u0175\u0176"+
		"\7G\2\2\u0176\u0177\7P\2\2\u0177\u0178\7F\2\2\u0178\u0179\7K\2\2\u0179"+
		"\u017a\7H\2\2\u017a\u017b\3\2\2\2\u017b\u017c\b((\2\u017cP\3\2\2\2\u017d"+
		"\u017e\7F\2\2\u017e\u017f\7Q\2\2\u017f\u0180\3\2\2\2\u0180\u0181\b))\2"+
		"\u0181R\3\2\2\2\u0182\u0183\7Y\2\2\u0183\u0184\7J\2\2\u0184\u0185\7K\2"+
		"\2\u0185\u0186\7N\2\2\u0186\u0187\7G\2\2\u0187\u0188\3\2\2\2\u0188\u0189"+
		"\b**\2\u0189T\3\2\2\2\u018a\u018b\7G\2\2\u018b\u018c\7P\2\2\u018c\u018d"+
		"\7F\2\2\u018d\u018e\7F\2\2\u018e\u018f\7Q\2\2\u018f\u0190\3\2\2\2\u0190"+
		"\u0191\b++\2\u0191V\3\2\2\2\u0192\u0193\7U\2\2\u0193\u0194\7G\2\2\u0194"+
		"\u0195\7N\2\2\u0195\u0196\7G\2\2\u0196\u0197\7E\2\2\u0197\u0198\7V\2\2"+
		"\u0198\u0199\3\2\2\2\u0199\u019a\b,,\2\u019aX\3\2\2\2\u019b\u019c\7E\2"+
		"\2\u019c\u019d\7C\2\2\u019d\u019e\7U\2\2\u019e\u019f\7G\2\2\u019f\u01a0"+
		"\3\2\2\2\u01a0\u01a1\b--\2\u01a1Z\3\2\2\2\u01a2\u01a3\7F\2\2\u01a3\u01a4"+
		"\7G\2\2\u01a4\u01a5\7H\2\2\u01a5\u01a6\7C\2\2\u01a6\u01a7\7W\2\2\u01a7"+
		"\u01a8\7N\2\2\u01a8\u01a9\7V\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ab\b..\2"+
		"\u01ab\\\3\2\2\2\u01ac\u01ad\7d\2\2\u01ad\u01af\7)\2\2\u01ae\u01b0\t\2"+
		"\2\2\u01af\u01ae\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01af\3\2\2\2\u01b1"+
		"\u01b2\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b4\7)\2\2\u01b4\u01b5\b//"+
		"\2\u01b5^\3\2\2\2\u01b6\u01b7\7q\2\2\u01b7\u01b9\7)\2\2\u01b8\u01ba\t"+
		"\3\2\2\u01b9\u01b8\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bb"+
		"\u01bc\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01be\7)\2\2\u01be\u01bf\b\60"+
		"\60\2\u01bf`\3\2\2\2\u01c0\u01c1\7|\2\2\u01c1\u01c3\7)\2\2\u01c2\u01c4"+
		"\t\4\2\2\u01c3\u01c2\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c5"+
		"\u01c6\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c8\7)\2\2\u01c8\u01c9\b\61"+
		"\61\2\u01c9b\3\2\2\2\u01ca\u01cb\7\60\2\2\u01cb\u01cc\7V\2\2\u01cc\u01cd"+
		"\7T\2\2\u01cd\u01ce\7W\2\2\u01ce\u01cf\7G\2\2\u01cf\u01d0\7\60\2\2\u01d0"+
		"\u01d1\3\2\2\2\u01d1\u01d2\b\62\62\2\u01d2d\3\2\2\2\u01d3\u01d4\7\60\2"+
		"\2\u01d4\u01d5\7H\2\2\u01d5\u01d6\7C\2\2\u01d6\u01d7\7N\2\2\u01d7\u01d8"+
		"\7U\2\2\u01d8\u01d9\7G\2\2\u01d9\u01da\7\60\2\2\u01da\u01db\3\2\2\2\u01db"+
		"\u01dc\b\63\63\2\u01dcf\3\2\2\2\u01dd\u01de\7\60\2\2\u01de\u01df\7P\2"+
		"\2\u01df\u01e0\7Q\2\2\u01e0\u01e1\7V\2\2\u01e1\u01e2\7\60\2\2\u01e2\u01e3"+
		"\3\2\2\2\u01e3\u01e4\b\64\64\2\u01e4h\3\2\2\2\u01e5\u01e9\t\5\2\2\u01e6"+
		"\u01e8\t\6\2\2\u01e7\u01e6\3\2\2\2\u01e8\u01eb\3\2\2\2\u01e9\u01e7\3\2"+
		"\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01ec\3\2\2\2\u01eb\u01e9\3\2\2\2\u01ec"+
		"\u01ed\b\65\65\2\u01edj\3\2\2\2\u01ee\u01f0\7/\2\2\u01ef\u01ee\3\2\2\2"+
		"\u01ef\u01f0\3\2\2\2\u01f0\u01f2\3\2\2\2\u01f1\u01f3\5u;\2\u01f2\u01f1"+
		"\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f2\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5"+
		"\u01f6\3\2\2\2\u01f6\u01f7\b\66\66\2\u01f7l\3\2\2\2\u01f8\u01fc\5w<\2"+
		"\u01f9\u01fc\5y=\2\u01fa\u01fc\5{>\2\u01fb\u01f8\3\2\2\2\u01fb\u01f9\3"+
		"\2\2\2\u01fb\u01fa\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u01fe\b\67\67\2\u01fe"+
		"n\3\2\2\2\u01ff\u0202\5\u0081A\2\u0200\u0202\5\u0083B\2\u0201\u01ff\3"+
		"\2\2\2\u0201\u0200\3\2\2\2\u0202\u0203\3\2\2\2\u0203\u0204\b88\2\u0204"+
		"p\3\2\2\2\u0205\u0209\7#\2\2\u0206\u0208\13\2\2\2\u0207\u0206\3\2\2\2"+
		"\u0208\u020b\3\2\2\2\u0209\u020a\3\2\2\2\u0209\u0207\3\2\2\2\u020a\u020d"+
		"\3\2\2\2\u020b\u0209\3\2\2\2\u020c\u020e\7\17\2\2\u020d\u020c\3\2\2\2"+
		"\u020d\u020e\3\2\2\2\u020e\u020f\3\2\2\2\u020f\u0210\7\f\2\2\u0210\u0211"+
		"\3\2\2\2\u0211\u0212\b99\2\u0212r\3\2\2\2\u0213\u0214\t\7\2\2\u0214\u0215"+
		"\3\2\2\2\u0215\u0216\b:9\2\u0216t\3\2\2\2\u0217\u0218\t\b\2\2\u0218v\3"+
		"\2\2\2\u0219\u021b\7/\2\2\u021a\u0219\3\2\2\2\u021a\u021b\3\2\2\2\u021b"+
		"\u021d\3\2\2\2\u021c\u021e\5u;\2\u021d\u021c\3\2\2\2\u021e\u021f\3\2\2"+
		"\2\u021f\u021d\3\2\2\2\u021f\u0220\3\2\2\2\u0220\u0221\3\2\2\2\u0221\u0223"+
		"\7\60\2\2\u0222\u0224\5u;\2\u0223\u0222\3\2\2\2\u0224\u0225\3\2\2\2\u0225"+
		"\u0223\3\2\2\2\u0225\u0226\3\2\2\2\u0226x\3\2\2\2\u0227\u0229\7/\2\2\u0228"+
		"\u0227\3\2\2\2\u0228\u0229\3\2\2\2\u0229\u022b\3\2\2\2\u022a\u022c\5u"+
		";\2\u022b\u022a\3\2\2\2\u022c\u022d\3\2\2\2\u022d\u022b\3\2\2\2\u022d"+
		"\u022e\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u0231\t\t\2\2\u0230\u0232\7/"+
		"\2\2\u0231\u0230\3\2\2\2\u0231\u0232\3\2\2\2\u0232\u0234\3\2\2\2\u0233"+
		"\u0235\5u;\2\u0234\u0233\3\2\2\2\u0235\u0236\3\2\2\2\u0236\u0234\3\2\2"+
		"\2\u0236\u0237\3\2\2\2\u0237z\3\2\2\2\u0238\u0239\5w<\2\u0239\u023b\t"+
		"\t\2\2\u023a\u023c\7/\2\2\u023b\u023a\3\2\2\2\u023b\u023c\3\2\2\2\u023c"+
		"\u023e\3\2\2\2\u023d\u023f\5u;\2\u023e\u023d\3\2\2\2\u023f\u0240\3\2\2"+
		"\2\u0240\u023e\3\2\2\2\u0240\u0241\3\2\2\2\u0241|\3\2\2\2\u0242\u0244"+
		"\n\n\2\2\u0243\u0242\3\2\2\2\u0244\u0245\3\2\2\2\u0245\u0243\3\2\2\2\u0245"+
		"\u0246\3\2\2\2\u0246~\3\2\2\2\u0247\u0249\n\13\2\2\u0248\u0247\3\2\2\2"+
		"\u0249\u024a\3\2\2\2\u024a\u0248\3\2\2\2\u024a\u024b\3\2\2\2\u024b\u0080"+
		"\3\2\2\2\u024c\u0252\7$\2\2\u024d\u024e\7$\2\2\u024e\u0251\7$\2\2\u024f"+
		"\u0251\5}?\2\u0250\u024d\3\2\2\2\u0250\u024f\3\2\2\2\u0251\u0254\3\2\2"+
		"\2\u0252\u0250\3\2\2\2\u0252\u0253\3\2\2\2\u0253\u0255\3\2\2\2\u0254\u0252"+
		"\3\2\2\2\u0255\u0256\7$\2\2\u0256\u0082\3\2\2\2\u0257\u025d\7)\2\2\u0258"+
		"\u0259\7)\2\2\u0259\u025c\7)\2\2\u025a\u025c\5\177@\2\u025b\u0258\3\2"+
		"\2\2\u025b\u025a\3\2\2\2\u025c\u025f\3\2\2\2\u025d\u025b\3\2\2\2\u025d"+
		"\u025e\3\2\2\2\u025e\u0260\3\2\2\2\u025f\u025d\3\2\2\2\u0260\u0261\7)"+
		"\2\2\u0261\u0084\3\2\2\2\34\2\u01b1\u01bb\u01c5\u01e9\u01ef\u01f4\u01fb"+
		"\u0201\u0209\u020d\u021a\u021f\u0225\u0228\u022d\u0231\u0236\u023b\u0240"+
		"\u0245\u024a\u0250\u0252\u025b\u025d:\3\2\2\3\3\3\3\4\4\3\5\5\3\6\6\3"+
		"\7\7\3\b\b\3\t\t\3\n\n\3\13\13\3\f\f\3\r\r\3\16\16\3\17\17\3\20\20\3\21"+
		"\21\3\22\22\3\23\23\3\24\24\3\25\25\3\26\26\3\27\27\3\30\30\3\31\31\3"+
		"\32\32\3\33\33\3\34\34\3\35\35\3\36\36\3\37\37\3  \3!!\3\"\"\3##\3$$\3"+
		"%%\3&&\3\'\'\3((\3))\3**\3++\3,,\3--\3..\3//\3\60\60\3\61\61\3\62\62\3"+
		"\63\63\3\64\64\3\65\65\3\66\66\3\67\67\388\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}