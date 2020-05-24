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
	public static final int
		RULE_prg = 0, RULE_dcllist = 1, RULE_cabecera = 2, RULE_cablist = 3, RULE_decsubprog = 4, 
		RULE_sentlist = 5, RULE_dcl = 6, RULE_defcte = 7, RULE_aux1 = 8, RULE_ctelist = 9, 
		RULE_simpvalue = 10, RULE_defvar = 11, RULE_aux2 = 12, RULE_tipo = 13, 
		RULE_charlength = 14, RULE_varlist = 15, RULE_aux6 = 16, RULE_init = 17, 
		RULE_decproc = 18, RULE_formal_paramlist = 19, RULE_nomparamlist = 20, 
		RULE_dec_s_paramlist = 21, RULE_tipoparam = 22, RULE_decfun = 23, RULE_dec_f_paramlist = 24, 
		RULE_aux4 = 25, RULE_sent = 26, RULE_aux7 = 27, RULE_aux8 = 28, RULE_exp = 29, 
		RULE_op = 30, RULE_oparit = 31, RULE_factor = 32, RULE_aux5 = 33, RULE_explist = 34, 
		RULE_proc_call = 35, RULE_subpparamlist = 36, RULE_subproglist = 37, RULE_codproc = 38, 
		RULE_codfun = 39, RULE_expcond = 40, RULE_oplog = 41, RULE_factorcond = 42, 
		RULE_opcomp = 43, RULE_doval = 44, RULE_casos = 45, RULE_aux9 = 46, RULE_etiquetas = 47, 
		RULE_aux10 = 48, RULE_listaetiqetas = 49;
	private static String[] makeRuleNames() {
		return new String[] {
			"prg", "dcllist", "cabecera", "cablist", "decsubprog", "sentlist", "dcl", 
			"defcte", "aux1", "ctelist", "simpvalue", "defvar", "aux2", "tipo", "charlength", 
			"varlist", "aux6", "init", "decproc", "formal_paramlist", "nomparamlist", 
			"dec_s_paramlist", "tipoparam", "decfun", "dec_f_paramlist", "aux4", 
			"sent", "aux7", "aux8", "exp", "op", "oparit", "factor", "aux5", "explist", 
			"proc_call", "subpparamlist", "subproglist", "codproc", "codfun", "expcond", 
			"oplog", "factorcond", "opcomp", "doval", "casos", "aux9", "etiquetas", 
			"aux10", "listaetiqetas"
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

	@Override
	public String getGrammarFileName() { return "practicaObligatoria.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    private ProgramaFinalClass lenguajeFinal;

	    //Sobreescribimos el constructor, recibir como parámetro los objetos.
	    public practicaObligatoriaParser(TokenStream tokens, 
	    ProgramaFinalClass lenguajeFinal){
	            this(tokens);
	            this.lenguajeFinal = lenguajeFinal;
	    }

	    public ArrayList<ParametroClass> CompletarParametro
	    (ArrayList<ParametroClass> lista, 
	    String nombre, String tipo_parametro, int tamaño_char, String e_s){
	        ParametroClass p = new ParametroClass(nombre);
	        int i = lista.indexOf(p);
	        if(i != -1){
	            ParametroClass p_encontrado = lista.get(i);
	            p_encontrado.setTipo(tipo_parametro);
	            if(tipo_parametro.equals("char")){p_encontrado.setTamañoChar(tamaño_char);}
	            if(e_s.equals("IN")){
	              p_encontrado.setEntrada(true);  
	            } else if(e_s.equals("OUT") || e_s.equals("INOUT")) 
	                    {p_encontrado.setSalida(true);}
	        }else{
	            //lamar error semántico
	    }
	        return lista;
	    }

	    public ArrayList<VariableClass> AsignarTipo
	    (ArrayList<VariableClass> lista, String tipo_variable, int tamaño_char){
	        lista.forEach((v) -> {
	           v.setTipo(tipo_variable);
	           if(tipo_variable.equals("char")){v.setTamañoChar(tamaño_char);}
	        });
	        return lista;
	    }

	    public FuncionClass crearFuncionImplementada
	    (String ident1, String ident2, String ident3, String ident4,
	    String tipo_devuelto, ArrayList<ParametroClass> listaParametros, 
	    ArrayList<SentenciaClass> listaSentencias){
	        FuncionClass funcion = new FuncionClass();
	        if((ident1.equals(ident2))&&(ident1.equals(ident3))&& 
	        (ident1.equals(ident4)) && (ident2.equals(ident3)) &&
	        (ident2.equals(ident4)) && (ident3.equals(ident4))){
	            funcion.setTipoDevuelto(tipo_devuelto);
	            funcion.setNombre(ident1);
	            funcion.setListaParametros(listaParametros);
	            funcion.setListaSentencias(listaSentencias);
	        }else{
	            lenguajeFinal.setEsError(true);
	            //llamamos a error semántico, no cumple primera y/o tercera regla 
	        }
	        return funcion;
	    }
	    
	    public FuncionClass crearProcedimientoImplementado(String ident1, 
	    String ident2, ArrayList<ParametroClass> listaParametros, 
	    ArrayList<SentenciaClass> listaSentencias){
	        FuncionClass procedimiento = new FuncionClass();
	        if(ident1.equals(ident2)){
	           procedimiento.setNombre(ident1);
	           procedimiento.setListaParametros(listaParametros);
	           procedimiento.setListaSentencias(listaSentencias);
	        }else{
	            lenguajeFinal.setEsError(true);
	           //llamamos a error semántico, no cumple primera  regla
	        }
	        return procedimiento;
	    }
	    
	    public FuncionClass crearDeclaracionFuncion(String ident1, String ident2,
	    String ident3, String tipo_devuelto, ArrayList<ParametroClass> listaParametros){
	        FuncionClass funcion = new FuncionClass();
	        if((ident1.equals(ident2))&&(ident1.equals(ident3))&&
	        (ident2.equals(ident3))){
	                funcion.setTipoDevuelto(tipo_devuelto);
	                funcion.setNombre(ident1);
	                funcion.setListaParametros(listaParametros);
	            }else{
	                lenguajeFinal.setEsError(true);
	                //llamamos a error semántico, no cumple primera y/o tercera regla
	            }
	        return funcion;
	    }

	    public FuncionClass crearDeclaracionProcedimiento(String ident1, String ident2,
	    ArrayList<ParametroClass> listaParametros){
	        FuncionClass procedimiento = new FuncionClass();
	         if(ident1.equals(ident2)){
	            procedimiento.setNombre(ident1);
	            procedimiento.setListaParametros(listaParametros);
	         }else{
	            //llamamos a error semántico, no cumple primera  regla
	         }
	        return procedimiento;
	    }

	    public String traducirBinario(String textoBinario){
	        String texto= "0b";
	        for(int i= 2; i<(textoBinario.length() - 1); i++){
	            texto= texto + textoBinario.charAt(i);
	        }
	        return texto;   
	    }

	    public String traducirOctal(String textoOctal){
	        String texto= "0o";
	        for(int i= 2; i<(textoOctal.length() - 1); i++){
	            texto= texto + textoOctal.charAt(i);
	        }
	        return texto;
	    }
	    
	    public String traducirHexadecimal(String textoHexadecimal){
	        String texto= "0x";
	        for(int i= 2; i<(textoHexadecimal.length() - 1); i++){
	            texto= texto + textoHexadecimal.charAt(i);
	        }
	        return texto;
	    }

	    public String traducirConstanteStrings(String constanteString){
	        String texto= constanteString.substring(1, constanteString.length()-1);
	        texto="\"" + texto + "\"";
	        String t1, t2;
	        for(int i = 1; i < texto.length()-2; i++){
	            if(texto.charAt(i) == '\'' && texto.charAt(i+1) == '\''){
	                t1 = texto.substring(0, i);
	                t2 = texto.substring(i+1);
	                texto= t1 +t2;
	            }
	            if(texto.charAt(i) == '"' && texto.charAt(i+1) == '"'){
	                t1 = texto.substring(0, i);
	                t2 = texto.substring(i+1);
	                texto= t1 +t2;
	                }
	            }
	        for(int i = 1; i < texto.length()-1; i++){
	            if(texto.charAt(i) == '"'){
	                t1 = texto.substring(0, i);
	                t2 = texto.substring(i);
	                texto = t1 + "\\" + t2;
	                i++;
	            }
	        }
	        return texto;
	    }
	    

	public practicaObligatoriaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class PrgContext extends ParserRuleContext {
		public DcllistContext dcllist;
		public CabeceraContext cabecera;
		public SentContext sent;
		public SubproglistContext subproglist;
		public List<TerminalNode> TOKEN_PROGRAM() { return getTokens(practicaObligatoriaParser.TOKEN_PROGRAM); }
		public TerminalNode TOKEN_PROGRAM(int i) {
			return getToken(practicaObligatoriaParser.TOKEN_PROGRAM, i);
		}
		public List<TerminalNode> IDENT() { return getTokens(practicaObligatoriaParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(practicaObligatoriaParser.IDENT, i);
		}
		public TerminalNode TOKEN_PUNTOCOMA() { return getToken(practicaObligatoriaParser.TOKEN_PUNTOCOMA, 0); }
		public DcllistContext dcllist() {
			return getRuleContext(DcllistContext.class,0);
		}
		public CabeceraContext cabecera() {
			return getRuleContext(CabeceraContext.class,0);
		}
		public SentContext sent() {
			return getRuleContext(SentContext.class,0);
		}
		public SentlistContext sentlist() {
			return getRuleContext(SentlistContext.class,0);
		}
		public TerminalNode TOKEN_END() { return getToken(practicaObligatoriaParser.TOKEN_END, 0); }
		public SubproglistContext subproglist() {
			return getRuleContext(SubproglistContext.class,0);
		}
		public PrgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof practicaObligatoriaListener ) ((practicaObligatoriaListener)listener).enterPrg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof practicaObligatoriaListener ) ((practicaObligatoriaListener)listener).exitPrg(this);
		}
	}

	public final PrgContext prg() throws RecognitionException {
		PrgContext _localctx = new PrgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(TOKEN_PROGRAM);
			setState(101);
			match(IDENT);
			setState(102);
			match(TOKEN_PUNTOCOMA);
			ArrayList<ConstanteClass> lista_constantes = new ArrayList <ConstanteClass>();
			ArrayList<DeclaracionClass> lista_declaraciones = new ArrayList<DeclaracionClass>();
			ArrayList<SentenciaClass> sentencias_programa = new ArrayList<SentenciaClass>();
			setState(104);
			((PrgContext)_localctx).dcllist = dcllist(lista_constantes, lista_declaraciones);
			DefinesClass defines = new DefinesClass(((PrgContext)_localctx).dcllist.lv_constantes);
			lenguajeFinal.setDefines(defines);
			((PrgContext)_localctx).dcllist.lv_declaraciones.forEach((d)->{sentencias_programa.add(d);});

			setState(106);
			((PrgContext)_localctx).cabecera = cabecera();
			DecFunsClass decfuns = new DecFunsClass(((PrgContext)_localctx).cabecera.lv_funciones);
			lenguajeFinal.setDecfuns(decfuns);
			setState(108);
			((PrgContext)_localctx).sent = sent();
			sentencias_programa.add(((PrgContext)_localctx).sent.s);
			setState(110);
			sentlist(sentencias_programa);
			lenguajeFinal.setSentenciasMain(sentencias_programa);
			setState(112);
			match(TOKEN_END);
			setState(113);
			match(TOKEN_PROGRAM);
			setState(114);
			match(IDENT);
			ArrayList<FuncionClass> lista_funciones = new ArrayList<FuncionClass>();
			setState(116);
			((PrgContext)_localctx).subproglist = subproglist(lista_funciones);
			PartesClass partes = new PartesClass(((PrgContext)_localctx).subproglist.lv_funciones_implementadas);
			lenguajeFinal.setPartes(partes);
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

	public static class DcllistContext extends ParserRuleContext {
		public ArrayList<ConstanteClass> l_constantes;
		public ArrayList<DeclaracionClass> l_declaraciones;
		public ArrayList<ConstanteClass> lv_constantes;
		public ArrayList<DeclaracionClass> lv_declaraciones;
		public DclContext dcl;
		public DcllistContext dcllist;
		public DclContext dcl() {
			return getRuleContext(DclContext.class,0);
		}
		public DcllistContext dcllist() {
			return getRuleContext(DcllistContext.class,0);
		}
		public DcllistContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public DcllistContext(ParserRuleContext parent, int invokingState, ArrayList<ConstanteClass> l_constantes, ArrayList<DeclaracionClass> l_declaraciones) {
			super(parent, invokingState);
			this.l_constantes = l_constantes;
			this.l_declaraciones = l_declaraciones;
		}
		@Override public int getRuleIndex() { return RULE_dcllist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof practicaObligatoriaListener ) ((practicaObligatoriaListener)listener).enterDcllist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof practicaObligatoriaListener ) ((practicaObligatoriaListener)listener).exitDcllist(this);
		}
	}

	public final DcllistContext dcllist(ArrayList<ConstanteClass> l_constantes,ArrayList<DeclaracionClass> l_declaraciones) throws RecognitionException {
		DcllistContext _localctx = new DcllistContext(_ctx, getState(), l_constantes, l_declaraciones);
		enterRule(_localctx, 2, RULE_dcllist);
		try {
			setState(125);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TOKEN_INTEGER:
			case TOKEN_REAL:
			case TOKEN_CHARACTER:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				((DcllistContext)_localctx).dcl = dcl();
				((DcllistContext)_localctx).lv_constantes = ((DcllistContext)_localctx).dcl.l_constantes;  
				((DcllistContext)_localctx).lv_declaraciones = ((DcllistContext)_localctx).dcl.l_declaraciones;
				setState(121);
				((DcllistContext)_localctx).dcllist = dcllist(((DcllistContext)_localctx).dcl.l_constantes, ((DcllistContext)_localctx).dcl.l_declaraciones);
				if(!((DcllistContext)_localctx).dcllist.lv_constantes.isEmpty())((DcllistContext)_localctx).lv_constantes =  ((DcllistContext)_localctx).dcllist.lv_constantes;
				if(!((DcllistContext)_localctx).dcllist.lv_declaraciones.isEmpty())((DcllistContext)_localctx).lv_declaraciones =  ((DcllistContext)_localctx).dcllist.lv_declaraciones;
				}
				break;
			case TOKEN_INTERFACE:
			case TOKEN_CALL:
			case TOKEN_IF:
			case TOKEN_DO:
			case TOKEN_SELECT:
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				((DcllistContext)_localctx).lv_constantes =  _localctx.l_constantes; ((DcllistContext)_localctx).lv_declaraciones =  _localctx.l_declaraciones;
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class CabeceraContext extends ParserRuleContext {
		public ArrayList<FuncionClass> lv_funciones;
		public CablistContext cablist;
		public List<TerminalNode> TOKEN_INTERFACE() { return getTokens(practicaObligatoriaParser.TOKEN_INTERFACE); }
		public TerminalNode TOKEN_INTERFACE(int i) {
			return getToken(practicaObligatoriaParser.TOKEN_INTERFACE, i);
		}
		public CablistContext cablist() {
			return getRuleContext(CablistContext.class,0);
		}
		public TerminalNode TOKEN_END() { return getToken(practicaObligatoriaParser.TOKEN_END, 0); }
		public CabeceraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cabecera; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof practicaObligatoriaListener ) ((practicaObligatoriaListener)listener).enterCabecera(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof practicaObligatoriaListener ) ((practicaObligatoriaListener)listener).exitCabecera(this);
		}
	}

	public final CabeceraContext cabecera() throws RecognitionException {
		CabeceraContext _localctx = new CabeceraContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_cabecera);
		try {
			setState(135);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TOKEN_INTERFACE:
				enterOuterAlt(_localctx, 1);
				{
				ArrayList<FuncionClass> l = new ArrayList<FuncionClass>();
				setState(128);
				match(TOKEN_INTERFACE);
				setState(129);
				((CabeceraContext)_localctx).cablist = cablist(l);
				setState(130);
				match(TOKEN_END);
				setState(131);
				match(TOKEN_INTERFACE);
				((CabeceraContext)_localctx).lv_funciones =  ((CabeceraContext)_localctx).cablist.lv_funciones;
				}
				break;
			case TOKEN_CALL:
			case TOKEN_IF:
			case TOKEN_DO:
			case TOKEN_SELECT:
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				ArrayList<FuncionClass> l = new ArrayList<FuncionClass>();
				                ((CabeceraContext)_localctx).lv_funciones =  l;
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class CablistContext extends ParserRuleContext {
		public ArrayList<FuncionClass> lh_funciones;
		public ArrayList<FuncionClass> lv_funciones;
		public DecprocContext decproc;
		public DecsubprogContext decsubprog;
		public DecfunContext decfun;
		public DecprocContext decproc() {
			return getRuleContext(DecprocContext.class,0);
		}
		public DecsubprogContext decsubprog() {
			return getRuleContext(DecsubprogContext.class,0);
		}
		public DecfunContext decfun() {
			return getRuleContext(DecfunContext.class,0);
		}
		public CablistContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public CablistContext(ParserRuleContext parent, int invokingState, ArrayList<FuncionClass> lh_funciones) {
			super(parent, invokingState);
			this.lh_funciones = lh_funciones;
		}
		@Override public int getRuleIndex() { return RULE_cablist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof practicaObligatoriaListener ) ((practicaObligatoriaListener)listener).enterCablist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof practicaObligatoriaListener ) ((practicaObligatoriaListener)listener).exitCablist(this);
		}
	}

	public final CablistContext cablist(ArrayList<FuncionClass> lh_funciones) throws RecognitionException {
		CablistContext _localctx = new CablistContext(_ctx, getState(), lh_funciones);
		enterRule(_localctx, 6, RULE_cablist);
		try {
			setState(147);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TOKEN_SUBROUTINE:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				((CablistContext)_localctx).decproc = decproc();
				_localctx.lh_funciones.add(((CablistContext)_localctx).decproc.p);
				setState(139);
				((CablistContext)_localctx).decsubprog = decsubprog(_localctx.lh_funciones);
				((CablistContext)_localctx).lv_funciones =  ((CablistContext)_localctx).decsubprog.lv_funciones;
				}
				break;
			case TOKEN_FUNCTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				((CablistContext)_localctx).decfun = decfun();
				_localctx.lh_funciones.add(((CablistContext)_localctx).decfun.f);
				setState(144);
				((CablistContext)_localctx).decsubprog = decsubprog(_localctx.lh_funciones);
				((CablistContext)_localctx).lv_funciones =  ((CablistContext)_localctx).decsubprog.lv_funciones;
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class DecsubprogContext extends ParserRuleContext {
		public ArrayList<FuncionClass> lh_funciones;
		public ArrayList<FuncionClass> lv_funciones;
		public DecprocContext decproc;
		public DecsubprogContext decsubprog;
		public DecfunContext decfun;
		public DecprocContext decproc() {
			return getRuleContext(DecprocContext.class,0);
		}
		public DecsubprogContext decsubprog() {
			return getRuleContext(DecsubprogContext.class,0);
		}
		public DecfunContext decfun() {
			return getRuleContext(DecfunContext.class,0);
		}
		public DecsubprogContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public DecsubprogContext(ParserRuleContext parent, int invokingState, ArrayList<FuncionClass> lh_funciones) {
			super(parent, invokingState);
			this.lh_funciones = lh_funciones;
		}
		@Override public int getRuleIndex() { return RULE_decsubprog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof practicaObligatoriaListener ) ((practicaObligatoriaListener)listener).enterDecsubprog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof practicaObligatoriaListener ) ((practicaObligatoriaListener)listener).exitDecsubprog(this);
		}
	}

	public final DecsubprogContext decsubprog(ArrayList<FuncionClass> lh_funciones) throws RecognitionException {
		DecsubprogContext _localctx = new DecsubprogContext(_ctx, getState(), lh_funciones);
		enterRule(_localctx, 8, RULE_decsubprog);
		try {
			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TOKEN_SUBROUTINE:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				((DecsubprogContext)_localctx).decproc = decproc();
				_localctx.lh_funciones.add(((DecsubprogContext)_localctx).decproc.p);
				setState(151);
				((DecsubprogContext)_localctx).decsubprog = decsubprog(_localctx.lh_funciones);
				((DecsubprogContext)_localctx).lv_funciones =  ((DecsubprogContext)_localctx).decsubprog.lv_funciones;
				}
				break;
			case TOKEN_FUNCTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				((DecsubprogContext)_localctx).decfun = decfun();
				_localctx.lh_funciones.add(((DecsubprogContext)_localctx).decfun.f);
				setState(156);
				((DecsubprogContext)_localctx).decsubprog = decsubprog(_localctx.lh_funciones);
				((DecsubprogContext)_localctx).lv_funciones =  ((DecsubprogContext)_localctx).decsubprog.lv_funciones;
				}
				break;
			case TOKEN_END:
				enterOuterAlt(_localctx, 3);
				{
				((DecsubprogContext)_localctx).lv_funciones =  _localctx.lh_funciones;
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class SentlistContext extends ParserRuleContext {
		public ArrayList<SentenciaClass> lh_sentencias;
		public ArrayList<SentenciaClass> lv_sentencias;
		public SentContext sent;
		public SentlistContext sentlist;
		public SentContext sent() {
			return getRuleContext(SentContext.class,0);
		}
		public SentlistContext sentlist() {
			return getRuleContext(SentlistContext.class,0);
		}
		public SentlistContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public SentlistContext(ParserRuleContext parent, int invokingState, ArrayList<SentenciaClass> lh_sentencias) {
			super(parent, invokingState);
			this.lh_sentencias = lh_sentencias;
		}
		@Override public int getRuleIndex() { return RULE_sentlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof practicaObligatoriaListener ) ((practicaObligatoriaListener)listener).enterSentlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof practicaObligatoriaListener ) ((practicaObligatoriaListener)listener).exitSentlist(this);
		}
	}

	public final SentlistContext sentlist(ArrayList<SentenciaClass> lh_sentencias) throws RecognitionException {
		SentlistContext _localctx = new SentlistContext(_ctx, getState(), lh_sentencias);
		enterRule(_localctx, 10, RULE_sentlist);
		try {
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				((SentlistContext)_localctx).sent = sent();
				lh_sentencias.add(((SentlistContext)_localctx).sent.s);
				setState(164);
				((SentlistContext)_localctx).sentlist = sentlist(_localctx.lh_sentencias);
				((SentlistContext)_localctx).lv_sentencias =  ((SentlistContext)_localctx).sentlist.lv_sentencias;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				((SentlistContext)_localctx).lv_sentencias =  _localctx.lh_sentencias;
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

	public static class DclContext extends ParserRuleContext {
		public ArrayList<ConstanteClass> l_constantes;
		public ArrayList<DeclaracionClass> l_declaraciones;
		public DefcteContext defcte;
		public DefvarContext defvar;
		public DefcteContext defcte() {
			return getRuleContext(DefcteContext.class,0);
		}
		public DefvarContext defvar() {
			return getRuleContext(DefvarContext.class,0);
		}
		public DclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dcl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof practicaObligatoriaListener ) ((practicaObligatoriaListener)listener).enterDcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof practicaObligatoriaListener ) ((practicaObligatoriaListener)listener).exitDcl(this);
		}
	}

	public final DclContext dcl() throws RecognitionException {
		DclContext _localctx = new DclContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_dcl);
		try {
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				ArrayList<ConstanteClass> l = new ArrayList <ConstanteClass>();
				setState(171);
				((DclContext)_localctx).defcte = defcte(l);
				((DclContext)_localctx).l_constantes =  ((DclContext)_localctx).defcte.lv; 
				((DclContext)_localctx).l_declaraciones =  new ArrayList<DeclaracionClass>();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				ArrayList<DeclaracionClass> l = new ArrayList <DeclaracionClass>();
				setState(175);
				((DclContext)_localctx).defvar = defvar(l);
				((DclContext)_localctx).l_declaraciones =  ((DclContext)_localctx).defvar.lv_declaraciones;
				((DclContext)_localctx).l_constantes =  new ArrayList<ConstanteClass>();
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

	public static class DefcteContext extends ParserRuleContext {
		public ArrayList<ConstanteClass> lh;
		public ArrayList<ConstanteClass> lv;
		public Token IDENT;
		public SimpvalueContext simpvalue;
		public CtelistContext ctelist;
		public Aux1Context aux1;
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode TOKEN_COMA() { return getToken(practicaObligatoriaParser.TOKEN_COMA, 0); }
		public TerminalNode TOKEN_PARAMETER() { return getToken(practicaObligatoriaParser.TOKEN_PARAMETER, 0); }
		public TerminalNode TOKEN_DOBLEPUNTO() { return getToken(practicaObligatoriaParser.TOKEN_DOBLEPUNTO, 0); }
		public TerminalNode IDENT() { return getToken(practicaObligatoriaParser.IDENT, 0); }
		public TerminalNode TOKEN_IGUAL() { return getToken(practicaObligatoriaParser.TOKEN_IGUAL, 0); }
		public SimpvalueContext simpvalue() {
			return getRuleContext(SimpvalueContext.class,0);
		}
		public CtelistContext ctelist() {
			return getRuleContext(CtelistContext.class,0);
		}
		public TerminalNode TOKEN_PUNTOCOMA() { return getToken(practicaObligatoriaParser.TOKEN_PUNTOCOMA, 0); }
		public Aux1Context aux1() {
			return getRuleContext(Aux1Context.class,0);
		}
		public DefcteContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public DefcteContext(ParserRuleContext parent, int invokingState, ArrayList<ConstanteClass> lh) {
			super(parent, invokingState);
			this.lh = lh;
		}
		@Override public int getRuleIndex() { return RULE_defcte; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof practicaObligatoriaListener ) ((practicaObligatoriaListener)listener).enterDefcte(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof practicaObligatoriaListener ) ((practicaObligatoriaListener)listener).exitDefcte(this);
		}
	}

	public final DefcteContext defcte(ArrayList<ConstanteClass> lh) throws RecognitionException {
		DefcteContext _localctx = new DefcteContext(_ctx, getState(), lh);
		enterRule(_localctx, 14, RULE_defcte);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			tipo();
			setState(181);
			match(TOKEN_COMA);
			setState(182);
			match(TOKEN_PARAMETER);
			setState(183);
			match(TOKEN_DOBLEPUNTO);
			setState(184);
			((DefcteContext)_localctx).IDENT = match(IDENT);
			setState(185);
			match(TOKEN_IGUAL);
			setState(186);
			((DefcteContext)_localctx).simpvalue = simpvalue();
			ConstanteClass c = new ConstanteClass((((DefcteContext)_localctx).IDENT!=null?((DefcteContext)_localctx).IDENT.getText():null), ((DefcteContext)_localctx).simpvalue.v); _localctx.lh.add(c);
			setState(188);
			((DefcteContext)_localctx).ctelist = ctelist(_localctx.lh);
			setState(189);
			match(TOKEN_PUNTOCOMA);
			setState(190);
			((DefcteContext)_localctx).aux1 = aux1(((DefcteContext)_localctx).ctelist.lv);
			((DefcteContext)_localctx).lv =  ((DefcteContext)_localctx).aux1.lv;
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

	public static class Aux1Context extends ParserRuleContext {
		public ArrayList<ConstanteClass> lh;
		public ArrayList<ConstanteClass> lv;
		public DefcteContext defcte;
		public DefcteContext defcte() {
			return getRuleContext(DefcteContext.class,0);
		}
		public Aux1Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Aux1Context(ParserRuleContext parent, int invokingState, ArrayList<ConstanteClass> lh) {
			super(parent, invokingState);
			this.lh = lh;
		}
		@Override public int getRuleIndex() { return RULE_aux1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof practicaObligatoriaListener ) ((practicaObligatoriaListener)listener).enterAux1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof practicaObligatoriaListener ) ((practicaObligatoriaListener)listener).exitAux1(this);
		}
	}

	public final Aux1Context aux1(ArrayList<ConstanteClass> lh) throws RecognitionException {
		Aux1Context _localctx = new Aux1Context(_ctx, getState(), lh);
		enterRule(_localctx, 16, RULE_aux1);
		try {
			setState(197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				((Aux1Context)_localctx).defcte = defcte(_localctx.lh);
				((Aux1Context)_localctx).lv =  ((Aux1Context)_localctx).defcte.lv;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				((Aux1Context)_localctx).lv =  _localctx.lh;
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

	public static class CtelistContext extends ParserRuleContext {
		public ArrayList<ConstanteClass> lh;
		public ArrayList<ConstanteClass> lv;
		public Token IDENT;
		public SimpvalueContext simpvalue;
		public CtelistContext ctelist;
		public TerminalNode TOKEN_COMA() { return getToken(practicaObligatoriaParser.TOKEN_COMA, 0); }
		public TerminalNode IDENT() { return getToken(practicaObligatoriaParser.IDENT, 0); }
		public TerminalNode TOKEN_IGUAL() { return getToken(practicaObligatoriaParser.TOKEN_IGUAL, 0); }
		public SimpvalueContext simpvalue() {
			return getRuleContext(SimpvalueContext.class,0);
		}
		public CtelistContext ctelist() {
			return getRuleContext(CtelistContext.class,0);
		}
		public CtelistContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public CtelistContext(ParserRuleContext parent, int invokingState, ArrayList<ConstanteClass> lh) {
			super(parent, invokingState);
			this.lh = lh;
		}
		@Override public int getRuleIndex() { return RULE_ctelist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof practicaObligatoriaListener ) ((practicaObligatoriaListener)listener).enterCtelist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof practicaObligatoriaListener ) ((practicaObligatoriaListener)listener).exitCtelist(this);
		}
	}

	public final CtelistContext ctelist(ArrayList<ConstanteClass> lh) throws RecognitionException {
		CtelistContext _localctx = new CtelistContext(_ctx, getState(), lh);
		enterRule(_localctx, 18, RULE_ctelist);
		try {
			setState(208);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TOKEN_COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				match(TOKEN_COMA);
				setState(200);
				((CtelistContext)_localctx).IDENT = match(IDENT);
				setState(201);
				match(TOKEN_IGUAL);
				setState(202);
				((CtelistContext)_localctx).simpvalue = simpvalue();
				ConstanteClass c = new ConstanteClass((((CtelistContext)_localctx).IDENT!=null?((CtelistContext)_localctx).IDENT.getText():null), ((CtelistContext)_localctx).simpvalue.v); _localctx.lh.add(c);
				setState(204);
				((CtelistContext)_localctx).ctelist = ctelist(_localctx.lh);
				((CtelistContext)_localctx).lv =  ((CtelistContext)_localctx).ctelist.lv;
				}
				break;
			case TOKEN_PUNTOCOMA:
				enterOuterAlt(_localctx, 2);
				{
				((CtelistContext)_localctx).lv =  _localctx.lh;
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class SimpvalueContext extends ParserRuleContext {
		public String v;
		public Token NUM_INT_CONST;
		public Token NUM_REAL_CONST;
		public Token STRING_CONST;
		public Token NUM_INT_CONST_B;
		public Token NUM_INT_CONST_O;
		public Token NUM_INT_CONST_H;
		public TerminalNode NUM_INT_CONST() { return getToken(practicaObligatoriaParser.NUM_INT_CONST, 0); }
		public TerminalNode NUM_REAL_CONST() { return getToken(practicaObligatoriaParser.NUM_REAL_CONST, 0); }
		public TerminalNode STRING_CONST() { return getToken(practicaObligatoriaParser.STRING_CONST, 0); }
		public TerminalNode NUM_INT_CONST_B() { return getToken(practicaObligatoriaParser.NUM_INT_CONST_B, 0); }
		public TerminalNode NUM_INT_CONST_O() { return getToken(practicaObligatoriaParser.NUM_INT_CONST_O, 0); }
		public TerminalNode NUM_INT_CONST_H() { return getToken(practicaObligatoriaParser.NUM_INT_CONST_H, 0); }
		public SimpvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof practicaObligatoriaListener ) ((practicaObligatoriaListener)listener).enterSimpvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof practicaObligatoriaListener ) ((practicaObligatoriaListener)listener).exitSimpvalue(this);
		}
	}

	public final SimpvalueContext simpvalue() throws RecognitionException {
		SimpvalueContext _localctx = new SimpvalueContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_simpvalue);
		try {
			setState(222);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_INT_CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				((SimpvalueContext)_localctx).NUM_INT_CONST = match(NUM_INT_CONST);
				((SimpvalueContext)_localctx).v =  (((SimpvalueContext)_localctx).NUM_INT_CONST!=null?((SimpvalueContext)_localctx).NUM_INT_CONST.getText():null);
				}
				break;
			case NUM_REAL_CONST:
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				((SimpvalueContext)_localctx).NUM_REAL_CONST = match(NUM_REAL_CONST);
				((SimpvalueContext)_localctx).v =  (((SimpvalueContext)_localctx).NUM_REAL_CONST!=null?((SimpvalueContext)_localctx).NUM_REAL_CONST.getText():null);
				}
				break;
			case STRING_CONST:
				enterOuterAlt(_localctx, 3);
				{
				setState(214);
				((SimpvalueContext)_localctx).STRING_CONST = match(STRING_CONST);
				((SimpvalueContext)_localctx).v =  traducirConstanteStrings((((SimpvalueContext)_localctx).STRING_CONST!=null?((SimpvalueContext)_localctx).STRING_CONST.getText():null));
				}
				break;
			case NUM_INT_CONST_B:
				enterOuterAlt(_localctx, 4);
				{
				setState(216);
				((SimpvalueContext)_localctx).NUM_INT_CONST_B = match(NUM_INT_CONST_B);
				 ((SimpvalueContext)_localctx).v =  traducirBinario((((SimpvalueContext)_localctx).NUM_INT_CONST_B!=null?((SimpvalueContext)_localctx).NUM_INT_CONST_B.getText():null));
				}
				break;
			case NUM_INT_CONST_O:
				enterOuterAlt(_localctx, 5);
				{
				setState(218);
				((SimpvalueContext)_localctx).NUM_INT_CONST_O = match(NUM_INT_CONST_O);
				 ((SimpvalueContext)_localctx).v =  traducirOctal((((SimpvalueContext)_localctx).NUM_INT_CONST_O!=null?((SimpvalueContext)_localctx).NUM_INT_CONST_O.getText():null));
				}
				break;
			case NUM_INT_CONST_H:
				enterOuterAlt(_localctx, 6);
				{
				setState(220);
				((SimpvalueContext)_localctx).NUM_INT_CONST_H = match(NUM_INT_CONST_H);
				 ((SimpvalueContext)_localctx).v =  traducirHexadecimal((((SimpvalueContext)_localctx).NUM_INT_CONST_H!=null?((SimpvalueContext)_localctx).NUM_INT_CONST_H.getText():null));
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class DefvarContext extends ParserRuleContext {
		public ArrayList<DeclaracionClass> lh_declaraciones;
		public ArrayList<DeclaracionClass> lv_declaraciones;
		public TipoContext tipo;
		public VarlistContext varlist;
		public Aux2Context aux2;
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode TOKEN_DOBLEPUNTO() { return getToken(practicaObligatoriaParser.TOKEN_DOBLEPUNTO, 0); }
		public VarlistContext varlist() {
			return getRuleContext(VarlistContext.class,0);
		}
		public TerminalNode TOKEN_PUNTOCOMA() { return getToken(practicaObligatoriaParser.TOKEN_PUNTOCOMA, 0); }
		public Aux2Context aux2() {
			return getRuleContext(Aux2Context.class,0);
		}
		public DefvarContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public DefvarContext(ParserRuleContext parent, int invokingState, ArrayList<DeclaracionClass> lh_declaraciones) {
			super(parent, invokingState);
			this.lh_declaraciones = lh_declaraciones;
		}
		@Override public int getRuleIndex() { return RULE_defvar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof practicaObligatoriaListener ) ((practicaObligatoriaListener)listener).enterDefvar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof practicaObligatoriaListener ) ((practicaObligatoriaListener)listener).exitDefvar(this);
		}
	}

	public final DefvarContext defvar(ArrayList<DeclaracionClass> lh_declaraciones) throws RecognitionException {
		DefvarContext _localctx = new DefvarContext(_ctx, getState(), lh_declaraciones);
		enterRule(_localctx, 22, RULE_defvar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			((DefvarContext)_localctx).tipo = tipo();
			setState(225);
			match(TOKEN_DOBLEPUNTO);
			ArrayList<VariableClass> l = new ArrayList<VariableClass>();
			setState(227);
			((DefvarContext)_localctx).varlist = varlist(l);
			((DefvarContext)_localctx).varlist.lv_variables = AsignarTipo(((DefvarContext)_localctx).varlist.lv_variables, ((DefvarContext)_localctx).tipo.v, ((DefvarContext)_localctx).tipo.c);
			DeclaracionClass d = new DeclaracionClass("declaracion", ((DefvarContext)_localctx).tipo.v, ((DefvarContext)_localctx).varlist.lv_variables);
			_localctx.lh_declaraciones.add(d);
			setState(229);
			match(TOKEN_PUNTOCOMA);
			setState(230);
			((DefvarContext)_localctx).aux2 = aux2(_localctx.lh_declaraciones);
			((DefvarContext)_localctx).lv_declaraciones =  ((DefvarContext)_localctx).aux2.lv_declaraciones;
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

	public static class Aux2Context extends ParserRuleContext {
		public ArrayList<DeclaracionClass> lh_declaraciones;
		public ArrayList<DeclaracionClass> lv_declaraciones;
		public DefvarContext defvar;
		public DefvarContext defvar() {
			return getRuleContext(DefvarContext.class,0);
		}
		public Aux2Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Aux2Context(ParserRuleContext parent, int invokingState, ArrayList<DeclaracionClass> lh_declaraciones) {
			super(parent, invokingState);
			this.lh_declaraciones = lh_declaraciones;
		}
		@Override public int getRuleIndex() { return RULE_aux2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof practicaObligatoriaListener ) ((practicaObligatoriaListener)listener).enterAux2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof practicaObligatoriaListener ) ((practicaObligatoriaListener)listener).exitAux2(this);
		}
	}

	public final Aux2Context aux2(ArrayList<DeclaracionClass> lh_declaraciones) throws RecognitionException {
		Aux2Context _localctx = new Aux2Context(_ctx, getState(), lh_declaraciones);
		enterRule(_localctx, 24, RULE_aux2);
		try {
			setState(237);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				((Aux2Context)_localctx).defvar = defvar(_localctx.lh_declaraciones);
				((Aux2Context)_localctx).lv_declaraciones =  ((Aux2Context)_localctx).defvar.lv_declaraciones;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				((Aux2Context)_localctx).lv_declaraciones =  _localctx.lh_declaraciones;
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

	public static class TipoContext extends ParserRuleContext {
		public String v;
		public int c;
		public CharlengthContext charlength;
		public TerminalNode TOKEN_INTEGER() { return getToken(practicaObligatoriaParser.TOKEN_INTEGER, 0); }
		public TerminalNode TOKEN_REAL() { return getToken(practicaObligatoriaParser.TOKEN_REAL, 0); }
		public TerminalNode TOKEN_CHARACTER() { return getToken(practicaObligatoriaParser.TOKEN_CHARACTER, 0); }
		public CharlengthContext charlength() {
			return getRuleContext(CharlengthContext.class,0);
		}
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof practicaObligatoriaListener ) ((practicaObligatoriaListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof practicaObligatoriaListener ) ((practicaObligatoriaListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_tipo);
		try {
			setState(247);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TOKEN_INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(239);
				match(TOKEN_INTEGER);
				((TipoContext)_localctx).v =  "int"; ((TipoContext)_localctx).c = 0;
				}
				break;
			case TOKEN_REAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(241);
				match(TOKEN_REAL);
				((TipoContext)_localctx).v =  "float"; ((TipoContext)_localctx).c = 0;
				}
				break;
			case TOKEN_CHARACTER:
				enterOuterAlt(_localctx, 3);
				{
				setState(243);
				match(TOKEN_CHARACTER);
				setState(244);
				((TipoContext)_localctx).charlength = charlength();
				((TipoContext)_localctx).v =  "char"; ((TipoContext)_localctx).c =  ((TipoContext)_localctx).charlength.c;
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class CharlengthContext extends ParserRuleContext {
		public int c;
		public Token NUM_INT_CONST;
		public TerminalNode TOKEN_PARENTESIS_IZQ() { return getToken(practicaObligatoriaParser.TOKEN_PARENTESIS_IZQ, 0); }
		public TerminalNode NUM_INT_CONST() { return getToken(practicaObligatoriaParser.NUM_INT_CONST, 0); }
		public TerminalNode TOKEN_PARENTESIS_DER() { return getToken(practicaObligatoriaParser.TOKEN_PARENTESIS_DER, 0); }
		public CharlengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charlength; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof practicaObligatoriaListener ) ((practicaObligatoriaListener)listener).enterCharlength(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof practicaObligatoriaListener ) ((practicaObligatoriaListener)listener).exitCharlength(this);
		}
	}

	public final CharlengthContext charlength() throws RecognitionException {
		CharlengthContext _localctx = new CharlengthContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_charlength);
		try {
			setState(254);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TOKEN_PARENTESIS_IZQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(249);
				match(TOKEN_PARENTESIS_IZQ);
				setState(250);
				((CharlengthContext)_localctx).NUM_INT_CONST = match(NUM_INT_CONST);
				setState(251);
				match(TOKEN_PARENTESIS_DER);
				((CharlengthContext)_localctx).c =  Integer.parseInt((((CharlengthContext)_localctx).NUM_INT_CONST!=null?((CharlengthContext)_localctx).NUM_INT_CONST.getText():null));
				}
				break;
			case TOKEN_DOBLEPUNTO:
			case TOKEN_COMA:
				enterOuterAlt(_localctx, 2);
				{
				((CharlengthContext)_localctx).c = 0;
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class VarlistContext extends ParserRuleContext {
		public ArrayList<VariableClass> lh_variables;
		public ArrayList<VariableClass> lv_variables;
		public Token IDENT;
		public InitContext init;
		public Aux6Context aux6;
		public TerminalNode IDENT() { return getToken(practicaObligatoriaParser.IDENT, 0); }
		public InitContext init() {
			return getRuleContext(InitContext.class,0);
		}
		public Aux6Context aux6() {
			return getRuleContext(Aux6Context.class,0);
		}
		public VarlistContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public VarlistContext(ParserRuleContext parent, int invokingState, ArrayList<VariableClass> lh_variables) {
			super(parent, invokingState);
			this.lh_variables = lh_variables;
		}
		@Override public int getRuleIndex() { return RULE_varlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof practicaObligatoriaListener ) ((practicaObligatoriaListener)listener).enterVarlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof practicaObligatoriaListener ) ((practicaObligatoriaListener)listener).exitVarlist(this);
		}
	}

	public final VarlistContext varlist(ArrayList<VariableClass> lh_variables) throws RecognitionException {
		VarlistContext _localctx = new VarlistContext(_ctx, getState(), lh_variables);
		enterRule(_localctx, 30, RULE_varlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			((VarlistContext)_localctx).IDENT = match(IDENT);
			setState(257);
			((VarlistContext)_localctx).init = init();
			VariableClass v = new VariableClass((((VarlistContext)_localctx).IDENT!=null?((VarlistContext)_localctx).IDENT.getText():null), ((VarlistContext)_localctx).init.v); 
			_localctx.lh_variables.add(v);
			setState(259);
			((VarlistContext)_localctx).aux6 = aux6(_localctx.lh_variables);
			((VarlistContext)_localctx).lv_variables =  ((VarlistContext)_localctx).aux6.lv_variables;
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

	public static class Aux6Context extends ParserRuleContext {
		public ArrayList<VariableClass> lh_variables;
		public ArrayList<VariableClass> lv_variables;
		public VarlistContext varlist;
		public TerminalNode TOKEN_COMA() { return getToken(practicaObligatoriaParser.TOKEN_COMA, 0); }
		public VarlistContext varlist() {
			return getRuleContext(VarlistContext.class,0);
		}
		public Aux6Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Aux6Context(ParserRuleContext parent, int invokingState, ArrayList<VariableClass> lh_variables) {
			super(parent, invokingState);
			this.lh_variables = lh_variables;
		}
		@Override public int getRuleIndex() { return RULE_aux6; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof practicaObligatoriaListener ) ((practicaObligatoriaListener)listener).enterAux6(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof practicaObligatoriaListener ) ((practicaObligatoriaListener)listener).exitAux6(this);
		}
	}

	public final Aux6Context aux6(ArrayList<VariableClass> lh_variables) throws RecognitionException {
		Aux6Context _localctx = new Aux6Context(_ctx, getState(), lh_variables);
		enterRule(_localctx, 32, RULE_aux6);
		try {
			setState(267);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TOKEN_COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				match(TOKEN_COMA);
				setState(263);
				((Aux6Context)_localctx).varlist = varlist(_localctx.lh_variables);
				((Aux6Context)_localctx).lv_variables =  ((Aux6Context)_localctx).varlist.lv_variables;
				}
				break;
			case TOKEN_PUNTOCOMA:
				enterOuterAlt(_localctx, 2);
				{
				((Aux6Context)_localctx).lv_variables =  _localctx.lh_variables;
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class InitContext extends ParserRuleContext {
		public String v;
		public SimpvalueContext simpvalue;
		public TerminalNode TOKEN_IGUAL() { return getToken(practicaObligatoriaParser.TOKEN_IGUAL, 0); }
		public SimpvalueContext simpvalue() {
			return getRuleContext(SimpvalueContext.class,0);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof practicaObligatoriaListener ) ((practicaObligatoriaListener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof practicaObligatoriaListener ) ((practicaObligatoriaListener)listener).exitInit(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_init);
		try {
			setState(274);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TOKEN_IGUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(269);
				match(TOKEN_IGUAL);
				setState(270);
				((InitContext)_localctx).simpvalue = simpvalue();
				((InitContext)_localctx).v =  ((InitContext)_localctx).simpvalue.v;
				}
				break;
			case TOKEN_PUNTOCOMA:
			case TOKEN_COMA:
				enterOuterAlt(_localctx, 2);
				{
				((InitContext)_localctx).v =  null;
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class DecprocContext extends ParserRuleContext {
		public FuncionClass p;
		public Token id1;
		public Formal_paramlistContext formal_paramlist;
		public Dec_s_paramlistContext dec_s_paramlist;
		public Token id2;
		public List<TerminalNode> TOKEN_SUBROUTINE() { return getTokens(practicaObligatoriaParser.TOKEN_SUBROUTINE); }
		public TerminalNode TOKEN_SUBROUTINE(int i) {
			return getToken(practicaObligatoriaParser.TOKEN_SUBROUTINE, i);
		}
		public Formal_paramlistContext formal_paramlist() {
			return getRuleContext(Formal_paramlistContext.class,0);
		}
		public Dec_s_paramlistContext dec_s_paramlist() {
			return getRuleContext(Dec_s_paramlistContext.class,0);
		}
		public TerminalNode TOKEN_END() { return getToken(practicaObligatoriaParser.TOKEN_END, 0); }
		public List<TerminalNode> IDENT() { return getTokens(practicaObligatoriaParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(practicaObligatoriaParser.IDENT, i);
		}
		public DecprocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decproc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof practicaObligatoriaListener ) ((practicaObligatoriaListener)listener).enterDecproc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof practicaObligatoriaListener ) ((practicaObligatoriaListener)listener).exitDecproc(this);
		}
	}

	public final DecprocContext decproc() throws RecognitionException {
		DecprocContext _localctx = new DecprocContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_decproc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(TOKEN_SUBROUTINE);
			setState(277);
			((DecprocContext)_localctx).id1 = match(IDENT);
			setState(278);
			((DecprocContext)_localctx).formal_paramlist = formal_paramlist();
			setState(279);
			((DecprocContext)_localctx).dec_s_paramlist = dec_s_paramlist(((DecprocContext)_localctx).formal_paramlist.lv_parametros);
			setState(280);
			match(TOKEN_END);
			setState(281);
			match(TOKEN_SUBROUTINE);
			setState(282);
			((DecprocContext)_localctx).id2 = match(IDENT);
			((DecprocContext)_localctx).p =  crearDeclaracionProcedimiento((((DecprocContext)_localctx).id1!=null?((DecprocContext)_localctx).id1.getText():null), (((DecprocContext)_localctx).id2!=null?((DecprocContext)_localctx).id2.getText():null), ((DecprocContext)_localctx).dec_s_paramlist.lv_parametros);
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

	public static class Formal_paramlistContext extends ParserRuleContext {
		public ArrayList<ParametroClass> lv_parametros;
		public NomparamlistContext nomparamlist;
		public TerminalNode TOKEN_PARENTESIS_IZQ() { return getToken(practicaObligatoriaParser.TOKEN_PARENTESIS_IZQ, 0); }
		public NomparamlistContext nomparamlist() {
			return getRuleContext(NomparamlistContext.class,0);
		}
		public TerminalNode TOKEN_PARENTESIS_DER() { return getToken(practicaObligatoriaParser.TOKEN_PARENTESIS_DER, 0); }
		public Formal_paramlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal_paramlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof practicaObligatoriaListener ) ((practicaObligatoriaListener)listener).enterFormal_paramlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof practicaObligatoriaListener ) ((practicaObligatoriaListener)listener).exitFormal_paramlist(this);
		}
	}

	public final Formal_paramlistContext formal_paramlist() throws RecognitionException {
		Formal_paramlistContext _localctx = new Formal_paramlistContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_formal_paramlist);
		try {
			setState(292);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TOKEN_PARENTESIS_IZQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(285);
				match(TOKEN_PARENTESIS_IZQ);
				ArrayList<ParametroClass> l = new ArrayList<ParametroClass>();
				setState(287);
				((Formal_paramlistContext)_localctx).nomparamlist = nomparamlist(l);
				setState(288);
				match(TOKEN_PARENTESIS_DER);
				((Formal_paramlistContext)_localctx).lv_parametros =  ((Formal_paramlistContext)_localctx).nomparamlist.lv_parametros;
				}
				break;
			case TOKEN_END:
			case TOKEN_INTEGER:
			case TOKEN_REAL:
			case TOKEN_CHARACTER:
			case TOKEN_CALL:
			case TOKEN_IF:
			case TOKEN_DO:
			case TOKEN_SELECT:
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				((Formal_paramlistContext)_localctx).lv_parametros =  new ArrayList<ParametroClass>();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class NomparamlistContext extends ParserRuleContext {
		public ArrayList<ParametroClass> lh_parametros;
		public ArrayList<ParametroClass> lv_parametros;
		public Token IDENT;
		public NomparamlistContext nomparamlist;
		public TerminalNode IDENT() { return getToken(practicaObligatoriaParser.IDENT, 0); }
		public TerminalNode TOKEN_COMA() { return getToken(practicaObligatoriaParser.TOKEN_COMA, 0); }
		public NomparamlistContext nomparamlist() {
			return getRuleContext(NomparamlistContext.class,0);
		}
		public NomparamlistContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public NomparamlistContext(ParserRuleContext parent, int invokingState, ArrayList<ParametroClass> lh_parametros) {
			super(parent, invokingState);
			this.lh_parametros = lh_parametros;
		}
		@Override public int getRuleIndex() { return RULE_nomparamlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof practicaObligatoriaListener ) ((practicaObligatoriaListener)listener).enterNomparamlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof practicaObligatoriaListener ) ((practicaObligatoriaListener)listener).exitNomparamlist(this);
		}
	}

	public final NomparamlistContext nomparamlist(ArrayList<ParametroClass> lh_parametros) throws RecognitionException {
		NomparamlistContext _localctx = new NomparamlistContext(_ctx, getState(), lh_parametros);
		enterRule(_localctx, 40, RULE_nomparamlist);
		try {
			setState(302);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(294);
				((NomparamlistContext)_localctx).IDENT = match(IDENT);
				   ParametroClass p = new ParametroClass((((NomparamlistContext)_localctx).IDENT!=null?((NomparamlistContext)_localctx).IDENT.getText():null));
				    _localctx.lh_parametros.add(p);
				    ((NomparamlistContext)_localctx).lv_parametros =  _localctx.lh_parametros;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(296);
				((NomparamlistContext)_localctx).IDENT = match(IDENT);
				   ParametroClass p = new ParametroClass((((NomparamlistContext)_localctx).IDENT!=null?((NomparamlistContext)_localctx).IDENT.getText():null));
				    _localctx.lh_parametros.add(p);
				setState(298);
				match(TOKEN_COMA);
				setState(299);
				((NomparamlistContext)_localctx).nomparamlist = nomparamlist(_localctx.lh_parametros);
				((NomparamlistContext)_localctx).lv_parametros =  ((NomparamlistContext)_localctx).nomparamlist.lv_parametros;
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

	public static class Dec_s_paramlistContext extends ParserRuleContext {
		public ArrayList<ParametroClass> lh_parametros;
		public ArrayList<ParametroClass> lv_parametros;
		public TipoContext tipo;
		public TipoparamContext tipoparam;
		public Token IDENT;
		public Dec_s_paramlistContext dec_s_paramlist;
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode TOKEN_COMA() { return getToken(practicaObligatoriaParser.TOKEN_COMA, 0); }
		public TerminalNode TOKEN_INTENT() { return getToken(practicaObligatoriaParser.TOKEN_INTENT, 0); }
		public TerminalNode TOKEN_PARENTESIS_IZQ() { return getToken(practicaObligatoriaParser.TOKEN_PARENTESIS_IZQ, 0); }
		public TipoparamContext tipoparam() {
			return getRuleContext(TipoparamContext.class,0);
		}
		public TerminalNode TOKEN_PARENTESIS_DER() { return getToken(practicaObligatoriaParser.TOKEN_PARENTESIS_DER, 0); }
		public TerminalNode IDENT() { return getToken(practicaObligatoriaParser.IDENT, 0); }
		public TerminalNode TOKEN_PUNTOCOMA() { return getToken(practicaObligatoriaParser.TOKEN_PUNTOCOMA, 0); }
		public Dec_s_paramlistContext dec_s_paramlist() {
			return getRuleContext(Dec_s_paramlistContext.class,0);
		}
		public Dec_s_paramlistContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Dec_s_paramlistContext(ParserRuleContext parent, int invokingState, ArrayList<ParametroClass> lh_parametros) {
			super(parent, invokingState);
			this.lh_parametros = lh_parametros;
		}
		@Override public int getRuleIndex() { return RULE_dec_s_paramlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof practicaObligatoriaListener ) ((practicaObligatoriaListener)listener).enterDec_s_paramlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof practicaObligatoriaListener ) ((practicaObligatoriaListener)listener).exitDec_s_paramlist(this);
		}
	}

	public final Dec_s_paramlistContext dec_s_paramlist(ArrayList<ParametroClass> lh_parametros) throws RecognitionException {
		Dec_s_paramlistContext _localctx = new Dec_s_paramlistContext(_ctx, getState(), lh_parametros);
		enterRule(_localctx, 42, RULE_dec_s_paramlist);
		try {
			setState(317);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(304);
				((Dec_s_paramlistContext)_localctx).tipo = tipo();
				setState(305);
				match(TOKEN_COMA);
				setState(306);
				match(TOKEN_INTENT);
				setState(307);
				match(TOKEN_PARENTESIS_IZQ);
				setState(308);
				((Dec_s_paramlistContext)_localctx).tipoparam = tipoparam();
				setState(309);
				match(TOKEN_PARENTESIS_DER);
				setState(310);
				((Dec_s_paramlistContext)_localctx).IDENT = match(IDENT);
				setState(311);
				match(TOKEN_PUNTOCOMA);
				((Dec_s_paramlistContext)_localctx).lh_parametros =  
				CompletarParametro(_localctx.lh_parametros, (((Dec_s_paramlistContext)_localctx).IDENT!=null?((Dec_s_paramlistContext)_localctx).IDENT.getText():null), ((Dec_s_paramlistContext)_localctx).tipo.v, ((Dec_s_paramlistContext)_localctx).tipo.c, ((Dec_s_paramlistContext)_localctx).tipoparam.v);
				setState(313);
				((Dec_s_paramlistContext)_localctx).dec_s_paramlist = dec_s_paramlist(_localctx.lh_parametros);
				((Dec_s_paramlistContext)_localctx).lv_parametros =  ((Dec_s_paramlistContext)_localctx).dec_s_paramlist.lv_parametros;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				((Dec_s_paramlistContext)_localctx).lv_parametros =  _localctx.lh_parametros;
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

	public static class TipoparamContext extends ParserRuleContext {
		public String v;
		public Token TOKEN_IN;
		public Token TOKEN_OUT;
		public Token TOKEN_INOUT;
		public TerminalNode TOKEN_IN() { return getToken(practicaObligatoriaParser.TOKEN_IN, 0); }
		public TerminalNode TOKEN_OUT() { return getToken(practicaObligatoriaParser.TOKEN_OUT, 0); }
		public TerminalNode TOKEN_INOUT() { return getToken(practicaObligatoriaParser.TOKEN_INOUT, 0); }
		public TipoparamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoparam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof practicaObligatoriaListener ) ((practicaObligatoriaListener)listener).enterTipoparam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof practicaObligatoriaListener ) ((practicaObligatoriaListener)listener).exitTipoparam(this);
		}
	}

	public final TipoparamContext tipoparam() throws RecognitionException {
		TipoparamContext _localctx = new TipoparamContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_tipoparam);
		try {
			setState(325);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TOKEN_IN:
				enterOuterAlt(_localctx, 1);
				{
				setState(319);
				((TipoparamContext)_localctx).TOKEN_IN = match(TOKEN_IN);
				((TipoparamContext)_localctx).v =  (((TipoparamContext)_localctx).TOKEN_IN!=null?((TipoparamContext)_localctx).TOKEN_IN.getText():null);
				}
				break;
			case TOKEN_OUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(321);
				((TipoparamContext)_localctx).TOKEN_OUT = match(TOKEN_OUT);
				((TipoparamContext)_localctx).v =  (((TipoparamContext)_localctx).TOKEN_OUT!=null?((TipoparamContext)_localctx).TOKEN_OUT.getText():null);
				}
				break;
			case TOKEN_INOUT:
				enterOuterAlt(_localctx, 3);
				{
				setState(323);
				((TipoparamContext)_localctx).TOKEN_INOUT = match(TOKEN_INOUT);
				((TipoparamContext)_localctx).v =  (((TipoparamContext)_localctx).TOKEN_INOUT!=null?((TipoparamContext)_localctx).TOKEN_INOUT.getText():null);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class DecfunContext extends ParserRuleContext {
		public FuncionClass f;
		public Token id1;
		public NomparamlistContext nomparamlist;
		public TipoContext tipo;
		public Token id2;
		public Dec_f_paramlistContext dec_f_paramlist;
		public Token id3;
		public List<TerminalNode> TOKEN_FUNCTION() { return getTokens(practicaObligatoriaParser.TOKEN_FUNCTION); }
		public TerminalNode TOKEN_FUNCTION(int i) {
			return getToken(practicaObligatoriaParser.TOKEN_FUNCTION, i);
		}
		public TerminalNode TOKEN_PARENTESIS_IZQ() { return getToken(practicaObligatoriaParser.TOKEN_PARENTESIS_IZQ, 0); }
		public NomparamlistContext nomparamlist() {
			return getRuleContext(NomparamlistContext.class,0);
		}
		public TerminalNode TOKEN_PARENTESIS_DER() { return getToken(practicaObligatoriaParser.TOKEN_PARENTESIS_DER, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode TOKEN_DOBLEPUNTO() { return getToken(practicaObligatoriaParser.TOKEN_DOBLEPUNTO, 0); }
		public TerminalNode TOKEN_PUNTOCOMA() { return getToken(practicaObligatoriaParser.TOKEN_PUNTOCOMA, 0); }
		public Dec_f_paramlistContext dec_f_paramlist() {
			return getRuleContext(Dec_f_paramlistContext.class,0);
		}
		public TerminalNode TOKEN_END() { return getToken(practicaObligatoriaParser.TOKEN_END, 0); }
		public List<TerminalNode> IDENT() { return getTokens(practicaObligatoriaParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(practicaObligatoriaParser.IDENT, i);
		}
		public DecfunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decfun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof practicaObligatoriaListener ) ((practicaObligatoriaListener)listener).enterDecfun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof practicaObligatoriaListener ) ((practicaObligatoriaListener)listener).exitDecfun(this);
		}
	}

	public final DecfunContext decfun() throws RecognitionException {
		DecfunContext _localctx = new DecfunContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_decfun);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(TOKEN_FUNCTION);
			setState(328);
			((DecfunContext)_localctx).id1 = match(IDENT);
			setState(329);
			match(TOKEN_PARENTESIS_IZQ);
			ArrayList<ParametroClass> l = new ArrayList<ParametroClass>();
			setState(331);
			((DecfunContext)_localctx).nomparamlist = nomparamlist(l);
			setState(332);
			match(TOKEN_PARENTESIS_DER);
			setState(333);
			((DecfunContext)_localctx).tipo = tipo();
			setState(334);
			match(TOKEN_DOBLEPUNTO);
			setState(335);
			((DecfunContext)_localctx).id2 = match(IDENT);
			setState(336);
			match(TOKEN_PUNTOCOMA);
			setState(337);
			((DecfunContext)_localctx).dec_f_paramlist = dec_f_paramlist(((DecfunContext)_localctx).nomparamlist.lv_parametros);
			setState(338);
			match(TOKEN_END);
			setState(339);
			match(TOKEN_FUNCTION);
			setState(340);
			((DecfunContext)_localctx).id3 = match(IDENT);
			((DecfunContext)_localctx).f =  crearDeclaracionFuncion((((DecfunContext)_localctx).id1!=null?((DecfunContext)_localctx).id1.getText():null), (((DecfunContext)_localctx).id2!=null?((DecfunContext)_localctx).id2.getText():null), (((DecfunContext)_localctx).id3!=null?((DecfunContext)_localctx).id3.getText():null), ((DecfunContext)_localctx).tipo.v, 
			((DecfunContext)_localctx).dec_f_paramlist.lv_parametros);
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

	public static class Dec_f_paramlistContext extends ParserRuleContext {
		public ArrayList<ParametroClass> lh_parametros;
		public ArrayList<ParametroClass> lv_parametros;
		public TipoContext tipo;
		public Token TOKEN_IN;
		public Token IDENT;
		public Aux4Context aux4;
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode TOKEN_COMA() { return getToken(practicaObligatoriaParser.TOKEN_COMA, 0); }
		public TerminalNode TOKEN_INTENT() { return getToken(practicaObligatoriaParser.TOKEN_INTENT, 0); }
		public TerminalNode TOKEN_PARENTESIS_IZQ() { return getToken(practicaObligatoriaParser.TOKEN_PARENTESIS_IZQ, 0); }
		public TerminalNode TOKEN_IN() { return getToken(practicaObligatoriaParser.TOKEN_IN, 0); }
		public TerminalNode TOKEN_PARENTESIS_DER() { return getToken(practicaObligatoriaParser.TOKEN_PARENTESIS_DER, 0); }
		public TerminalNode IDENT() { return getToken(practicaObligatoriaParser.IDENT, 0); }
		public TerminalNode TOKEN_PUNTOCOMA() { return getToken(practicaObligatoriaParser.TOKEN_PUNTOCOMA, 0); }
		public Aux4Context aux4() {
			return getRuleContext(Aux4Context.class,0);
		}
		public Dec_f_paramlistContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Dec_f_paramlistContext(ParserRuleContext parent, int invokingState, ArrayList<ParametroClass> lh_parametros) {
			super(parent, invokingState);
			this.lh_parametros = lh_parametros;
		}
		@Override public int getRuleIndex() { return RULE_dec_f_paramlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof practicaObligatoriaListener ) ((practicaObligatoriaListener)listener).enterDec_f_paramlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof practicaObligatoriaListener ) ((practicaObligatoriaListener)listener).exitDec_f_paramlist(this);
		}
	}

	public final Dec_f_paramlistContext dec_f_paramlist(ArrayList<ParametroClass> lh_parametros) throws RecognitionException {
		Dec_f_paramlistContext _localctx = new Dec_f_paramlistContext(_ctx, getState(), lh_parametros);
		enterRule(_localctx, 48, RULE_dec_f_paramlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			((Dec_f_paramlistContext)_localctx).tipo = tipo();
			setState(344);
			match(TOKEN_COMA);
			setState(345);
			match(TOKEN_INTENT);
			setState(346);
			match(TOKEN_PARENTESIS_IZQ);
			setState(347);
			((Dec_f_paramlistContext)_localctx).TOKEN_IN = match(TOKEN_IN);
			setState(348);
			match(TOKEN_PARENTESIS_DER);
			setState(349);
			((Dec_f_paramlistContext)_localctx).IDENT = match(IDENT);
			setState(350);
			match(TOKEN_PUNTOCOMA);
			((Dec_f_paramlistContext)_localctx).lh_parametros =  
			CompletarParametro(_localctx.lh_parametros, (((Dec_f_paramlistContext)_localctx).IDENT!=null?((Dec_f_paramlistContext)_localctx).IDENT.getText():null), ((Dec_f_paramlistContext)_localctx).tipo.v, ((Dec_f_paramlistContext)_localctx).tipo.c, (((Dec_f_paramlistContext)_localctx).TOKEN_IN!=null?((Dec_f_paramlistContext)_localctx).TOKEN_IN.getText():null));
			setState(352);
			((Dec_f_paramlistContext)_localctx).aux4 = aux4(_localctx.lh_parametros);
			((Dec_f_paramlistContext)_localctx).lv_parametros =  ((Dec_f_paramlistContext)_localctx).aux4.lv_parametros;
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

	public static class Aux4Context extends ParserRuleContext {
		public ArrayList<ParametroClass> lh_parametros;
		public ArrayList<ParametroClass> lv_parametros;
		public Dec_f_paramlistContext dec_f_paramlist;
		public Dec_f_paramlistContext dec_f_paramlist() {
			return getRuleContext(Dec_f_paramlistContext.class,0);
		}
		public Aux4Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Aux4Context(ParserRuleContext parent, int invokingState, ArrayList<ParametroClass> lh_parametros) {
			super(parent, invokingState);
			this.lh_parametros = lh_parametros;
		}
		@Override public int getRuleIndex() { return RULE_aux4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof practicaObligatoriaListener ) ((practicaObligatoriaListener)listener).enterAux4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof practicaObligatoriaListener ) ((practicaObligatoriaListener)listener).exitAux4(this);
		}
	}

	public final Aux4Context aux4(ArrayList<ParametroClass> lh_parametros) throws RecognitionException {
		Aux4Context _localctx = new Aux4Context(_ctx, getState(), lh_parametros);
		enterRule(_localctx, 50, RULE_aux4);
		try {
			setState(359);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(355);
				((Aux4Context)_localctx).dec_f_paramlist = dec_f_paramlist(_localctx.lh_parametros);
				((Aux4Context)_localctx).lv_parametros =  ((Aux4Context)_localctx).dec_f_paramlist.lv_parametros;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				((Aux4Context)_localctx).lv_parametros =  _localctx.lh_parametros;
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

	public static class SentContext extends ParserRuleContext {
		public SentenciaClass s;
		public Token IDENT;
		public ExpContext exp;
		public Proc_callContext proc_call;
		public ExpcondContext expcond;
		public Aux7Context aux7;
		public Aux8Context aux8;
		public CasosContext casos;
		public TerminalNode IDENT() { return getToken(practicaObligatoriaParser.IDENT, 0); }
		public TerminalNode TOKEN_IGUAL() { return getToken(practicaObligatoriaParser.TOKEN_IGUAL, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode TOKEN_PUNTOCOMA() { return getToken(practicaObligatoriaParser.TOKEN_PUNTOCOMA, 0); }
		public Proc_callContext proc_call() {
			return getRuleContext(Proc_callContext.class,0);
		}
		public TerminalNode TOKEN_IF() { return getToken(practicaObligatoriaParser.TOKEN_IF, 0); }
		public TerminalNode TOKEN_PARENTESIS_IZQ() { return getToken(practicaObligatoriaParser.TOKEN_PARENTESIS_IZQ, 0); }
		public ExpcondContext expcond() {
			return getRuleContext(ExpcondContext.class,0);
		}
		public Aux7Context aux7() {
			return getRuleContext(Aux7Context.class,0);
		}
		public TerminalNode TOKEN_DO() { return getToken(practicaObligatoriaParser.TOKEN_DO, 0); }
		public Aux8Context aux8() {
			return getRuleContext(Aux8Context.class,0);
		}
		public List<TerminalNode> TOKEN_SELECT() { return getTokens(practicaObligatoriaParser.TOKEN_SELECT); }
		public TerminalNode TOKEN_SELECT(int i) {
			return getToken(practicaObligatoriaParser.TOKEN_SELECT, i);
		}
		public TerminalNode TOKEN_CASE() { return getToken(practicaObligatoriaParser.TOKEN_CASE, 0); }
		public TerminalNode TOKEN_PARENTESIS_DER() { return getToken(practicaObligatoriaParser.TOKEN_PARENTESIS_DER, 0); }
		public CasosContext casos() {
			return getRuleContext(CasosContext.class,0);
		}
		public TerminalNode TOKEN_END() { return getToken(practicaObligatoriaParser.TOKEN_END, 0); }
		public SentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof practicaObligatoriaListener ) ((practicaObligatoriaListener)listener).enterSent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof practicaObligatoriaListener ) ((practicaObligatoriaListener)listener).exitSent(this);
		}
	}

	public final SentContext sent() throws RecognitionException {
		SentContext _localctx = new SentContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_sent);
		try {
			setState(392);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(361);
				((SentContext)_localctx).IDENT = match(IDENT);
				setState(362);
				match(TOKEN_IGUAL);
				setState(363);
				((SentContext)_localctx).exp = exp(0);
				setState(364);
				match(TOKEN_PUNTOCOMA);
				AsignacionClass a = new AsignacionClass("asignacion", (((SentContext)_localctx).IDENT!=null?((SentContext)_localctx).IDENT.getText():null), ((SentContext)_localctx).exp.v);
				((SentContext)_localctx).s =  a;
				}
				break;
			case TOKEN_CALL:
				enterOuterAlt(_localctx, 2);
				{
				setState(367);
				((SentContext)_localctx).proc_call = proc_call();
				setState(368);
				match(TOKEN_PUNTOCOMA);
				((SentContext)_localctx).s =  ((SentContext)_localctx).proc_call.llamada_proc;
				}
				break;
			case TOKEN_IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(371);
				match(TOKEN_IF);
				setState(372);
				match(TOKEN_PARENTESIS_IZQ);
				setState(373);
				((SentContext)_localctx).expcond = expcond(0);
				setState(374);
				((SentContext)_localctx).aux7 = aux7();
				EstructuraIfClass if_sentencia = new EstructuraIfClass("if", 
				((SentContext)_localctx).expcond.v, ((SentContext)_localctx).aux7.sentencias_if, ((SentContext)_localctx).aux7.sentencias_else); ((SentContext)_localctx).s =  if_sentencia;
				}
				break;
			case TOKEN_DO:
				enterOuterAlt(_localctx, 4);
				{
				setState(377);
				match(TOKEN_DO);
				setState(378);
				((SentContext)_localctx).aux8 = aux8();
				((SentContext)_localctx).s =  ((SentContext)_localctx).aux8.s;
				}
				break;
			case TOKEN_SELECT:
				enterOuterAlt(_localctx, 5);
				{
				setState(381);
				match(TOKEN_SELECT);
				setState(382);
				match(TOKEN_CASE);
				setState(383);
				match(TOKEN_PARENTESIS_IZQ);
				setState(384);
				((SentContext)_localctx).exp = exp(0);
				setState(385);
				match(TOKEN_PARENTESIS_DER);
				ArrayList<CasosClass> l_casos = new ArrayList<CasosClass>(); boolean esDefault = false; 
				ArrayList<SentenciaClass> sentencias_default = new ArrayList<SentenciaClass>();
				setState(387);
				((SentContext)_localctx).casos = casos(l_casos, esDefault, sentencias_default);
				setState(388);
				match(TOKEN_END);
				setState(389);
				match(TOKEN_SELECT);
				EstructuraCaseClass case_sentencia = new 
				EstructuraCaseClass("case", ((SentContext)_localctx).exp.v, ((SentContext)_localctx).casos.lv_casos, ((SentContext)_localctx).casos.esDefault_v, ((SentContext)_localctx).casos.sv_default);
				((SentContext)_localctx).s = case_sentencia;
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Aux7Context extends ParserRuleContext {
		public ArrayList<SentenciaClass> sentencias_if;
		public ArrayList<SentenciaClass> sentencias_else;
		public SentContext sent;
		public SentlistContext sentlist;
		public SentlistContext l1;
		public SentlistContext l2;
		public TerminalNode TOKEN_PARENTESIS_DER() { return getToken(practicaObligatoriaParser.TOKEN_PARENTESIS_DER, 0); }
		public SentContext sent() {
			return getRuleContext(SentContext.class,0);
		}
		public TerminalNode TOKEN_THEN() { return getToken(practicaObligatoriaParser.TOKEN_THEN, 0); }
		public List<SentlistContext> sentlist() {
			return getRuleContexts(SentlistContext.class);
		}
		public SentlistContext sentlist(int i) {
			return getRuleContext(SentlistContext.class,i);
		}
		public TerminalNode TOKEN_ENDIF() { return getToken(practicaObligatoriaParser.TOKEN_ENDIF, 0); }
		public TerminalNode TOKEN_ELSE() { return getToken(practicaObligatoriaParser.TOKEN_ELSE, 0); }
		public Aux7Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aux7; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof practicaObligatoriaListener ) ((practicaObligatoriaListener)listener).enterAux7(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof practicaObligatoriaListener ) ((practicaObligatoriaListener)listener).exitAux7(this);
		}
	}

	public final Aux7Context aux7() throws RecognitionException {
		Aux7Context _localctx = new Aux7Context(_ctx, getState());
		enterRule(_localctx, 54, RULE_aux7);
		try {
			setState(415);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(394);
				match(TOKEN_PARENTESIS_DER);
				setState(395);
				((Aux7Context)_localctx).sent = sent();
				ArrayList<SentenciaClass> l_if = new ArrayList<SentenciaClass>();
				ArrayList<SentenciaClass> l_else= new ArrayList<SentenciaClass>();
				l_if.add(((Aux7Context)_localctx).sent.s); ((Aux7Context)_localctx).sentencias_if =  l_if; ((Aux7Context)_localctx).sentencias_else =  l_else;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(398);
				match(TOKEN_PARENTESIS_DER);
				setState(399);
				match(TOKEN_THEN);
				ArrayList<SentenciaClass> l_if = new ArrayList<SentenciaClass>();
				ArrayList<SentenciaClass> l_else= new ArrayList<SentenciaClass>();
				setState(401);
				((Aux7Context)_localctx).sentlist = sentlist(l_if);
				setState(402);
				match(TOKEN_ENDIF);
				((Aux7Context)_localctx).sentencias_if =  ((Aux7Context)_localctx).sentlist.lv_sentencias; ((Aux7Context)_localctx).sentencias_else =  l_else;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(405);
				match(TOKEN_PARENTESIS_DER);
				setState(406);
				match(TOKEN_THEN);
				ArrayList<SentenciaClass> l_if = new ArrayList<SentenciaClass>();
				setState(408);
				((Aux7Context)_localctx).l1 = sentlist(l_if);
				setState(409);
				match(TOKEN_ELSE);
				ArrayList<SentenciaClass> lista_else = new ArrayList<SentenciaClass>();
				setState(411);
				((Aux7Context)_localctx).l2 = sentlist(lista_else);
				setState(412);
				match(TOKEN_ENDIF);
				((Aux7Context)_localctx).sentencias_if =  ((Aux7Context)_localctx).l1.lv_sentencias; ((Aux7Context)_localctx).sentencias_else =  ((Aux7Context)_localctx).l2.lv_sentencias;
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

	public static class Aux8Context extends ParserRuleContext {
		public SentenciaClass s;
		public ExpcondContext expcond;
		public SentlistContext sentlist;
		public Token IDENT;
		public DovalContext d1;
		public DovalContext d2;
		public DovalContext d3;
		public TerminalNode TOKEN_WHILE() { return getToken(practicaObligatoriaParser.TOKEN_WHILE, 0); }
		public TerminalNode TOKEN_PARENTESIS_IZQ() { return getToken(practicaObligatoriaParser.TOKEN_PARENTESIS_IZQ, 0); }
		public ExpcondContext expcond() {
			return getRuleContext(ExpcondContext.class,0);
		}
		public TerminalNode TOKEN_PARENTESIS_DER() { return getToken(practicaObligatoriaParser.TOKEN_PARENTESIS_DER, 0); }
		public SentlistContext sentlist() {
			return getRuleContext(SentlistContext.class,0);
		}
		public TerminalNode TOKEN_ENDDO() { return getToken(practicaObligatoriaParser.TOKEN_ENDDO, 0); }
		public TerminalNode IDENT() { return getToken(practicaObligatoriaParser.IDENT, 0); }
		public TerminalNode TOKEN_IGUAL() { return getToken(practicaObligatoriaParser.TOKEN_IGUAL, 0); }
		public List<TerminalNode> TOKEN_COMA() { return getTokens(practicaObligatoriaParser.TOKEN_COMA); }
		public TerminalNode TOKEN_COMA(int i) {
			return getToken(practicaObligatoriaParser.TOKEN_COMA, i);
		}
		public List<DovalContext> doval() {
			return getRuleContexts(DovalContext.class);
		}
		public DovalContext doval(int i) {
			return getRuleContext(DovalContext.class,i);
		}
		public Aux8Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aux8; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof practicaObligatoriaListener ) ((practicaObligatoriaListener)listener).enterAux8(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof practicaObligatoriaListener ) ((practicaObligatoriaListener)listener).exitAux8(this);
		}
	}

	public final Aux8Context aux8() throws RecognitionException {
		Aux8Context _localctx = new Aux8Context(_ctx, getState());
		enterRule(_localctx, 56, RULE_aux8);
		try {
			setState(438);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TOKEN_WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(417);
				match(TOKEN_WHILE);
				setState(418);
				match(TOKEN_PARENTESIS_IZQ);
				setState(419);
				((Aux8Context)_localctx).expcond = expcond(0);
				setState(420);
				match(TOKEN_PARENTESIS_DER);
				ArrayList<SentenciaClass> l = new ArrayList<SentenciaClass>();
				setState(422);
				((Aux8Context)_localctx).sentlist = sentlist(l);
				setState(423);
				match(TOKEN_ENDDO);
				EstructuraDoWhileClass dowhile_sentencia = new EstructuraDoWhileClass("while", 
				((Aux8Context)_localctx).expcond.v, ((Aux8Context)_localctx).sentlist.lv_sentencias);
				((Aux8Context)_localctx).s =  dowhile_sentencia;
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(426);
				((Aux8Context)_localctx).IDENT = match(IDENT);
				setState(427);
				match(TOKEN_IGUAL);
				setState(428);
				((Aux8Context)_localctx).d1 = doval();
				setState(429);
				match(TOKEN_COMA);
				setState(430);
				((Aux8Context)_localctx).d2 = doval();
				setState(431);
				match(TOKEN_COMA);
				setState(432);
				((Aux8Context)_localctx).d3 = doval();
				ArrayList<SentenciaClass> l_do = new ArrayList<SentenciaClass>();
				setState(434);
				((Aux8Context)_localctx).sentlist = sentlist(l_do);
				setState(435);
				match(TOKEN_ENDDO);
				EstructuraDoClass do_sentencia = new EstructuraDoClass("for", 
				(((Aux8Context)_localctx).IDENT!=null?((Aux8Context)_localctx).IDENT.getText():null), ((Aux8Context)_localctx).d1.v, ((Aux8Context)_localctx).d2.v, ((Aux8Context)_localctx).d3.v, ((Aux8Context)_localctx).sentlist.lv_sentencias);
				((Aux8Context)_localctx).s =  do_sentencia;
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ExpContext extends ParserRuleContext {
		public String v;
		public ExpContext id1;
		public FactorContext factor;
		public OpContext op;
		public ExpContext id2;
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof practicaObligatoriaListener ) ((practicaObligatoriaListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof practicaObligatoriaListener ) ((practicaObligatoriaListener)listener).exitExp(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 58;
		enterRecursionRule(_localctx, 58, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(441);
			((ExpContext)_localctx).factor = factor();
			((ExpContext)_localctx).v =  ((ExpContext)_localctx).factor.v;
			}
			_ctx.stop = _input.LT(-1);
			setState(451);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpContext(_parentctx, _parentState);
					_localctx.id1 = _prevctx;
					_localctx.id1 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_exp);
					setState(444);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(445);
					((ExpContext)_localctx).op = op();
					setState(446);
					((ExpContext)_localctx).id2 = exp(3);
					((ExpContext)_localctx).v =  ((ExpContext)_localctx).id1.v + " " + ((ExpContext)_localctx).op.v + " "+ ((ExpContext)_localctx).id2.v;
					}
					} 
				}
				setState(453);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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

	public static class OpContext extends ParserRuleContext {
		public String v;
		public OparitContext oparit;
		public OparitContext oparit() {
			return getRuleContext(OparitContext.class,0);
		}
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof practicaObligatoriaListener ) ((practicaObligatoriaListener)listener).enterOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof practicaObligatoriaListener ) ((practicaObligatoriaListener)listener).exitOp(this);
		}
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			((OpContext)_localctx).oparit = oparit();
			((OpContext)_localctx).v =  ((OpContext)_localctx).oparit.v;
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

	public static class OparitContext extends ParserRuleContext {
		public String v;
		public TerminalNode TOKEN_MAS() { return getToken(practicaObligatoriaParser.TOKEN_MAS, 0); }
		public TerminalNode TOKEN_MENOS() { return getToken(practicaObligatoriaParser.TOKEN_MENOS, 0); }
		public TerminalNode TOKEN_MULTIPLICACION() { return getToken(practicaObligatoriaParser.TOKEN_MULTIPLICACION, 0); }
		public TerminalNode TOKEN_DIVISION() { return getToken(practicaObligatoriaParser.TOKEN_DIVISION, 0); }
		public OparitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oparit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof practicaObligatoriaListener ) ((practicaObligatoriaListener)listener).enterOparit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof practicaObligatoriaListener ) ((practicaObligatoriaListener)listener).exitOparit(this);
		}
	}

	public final OparitContext oparit() throws RecognitionException {
		OparitContext _localctx = new OparitContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_oparit);
		try {
			setState(465);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TOKEN_MAS:
				enterOuterAlt(_localctx, 1);
				{
				setState(457);
				match(TOKEN_MAS);
				((OparitContext)_localctx).v =  "+";
				}
				break;
			case TOKEN_MENOS:
				enterOuterAlt(_localctx, 2);
				{
				setState(459);
				match(TOKEN_MENOS);
				((OparitContext)_localctx).v =  "-";
				}
				break;
			case TOKEN_MULTIPLICACION:
				enterOuterAlt(_localctx, 3);
				{
				setState(461);
				match(TOKEN_MULTIPLICACION);
				((OparitContext)_localctx).v =  "*";
				}
				break;
			case TOKEN_DIVISION:
				enterOuterAlt(_localctx, 4);
				{
				setState(463);
				match(TOKEN_DIVISION);
				((OparitContext)_localctx).v =  "/";
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class FactorContext extends ParserRuleContext {
		public String v;
		public SimpvalueContext simpvalue;
		public ExpContext exp;
		public Token IDENT;
		public Aux5Context aux5;
		public SimpvalueContext simpvalue() {
			return getRuleContext(SimpvalueContext.class,0);
		}
		public TerminalNode TOKEN_PARENTESIS_IZQ() { return getToken(practicaObligatoriaParser.TOKEN_PARENTESIS_IZQ, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode TOKEN_PARENTESIS_DER() { return getToken(practicaObligatoriaParser.TOKEN_PARENTESIS_DER, 0); }
		public TerminalNode IDENT() { return getToken(practicaObligatoriaParser.IDENT, 0); }
		public Aux5Context aux5() {
			return getRuleContext(Aux5Context.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof practicaObligatoriaListener ) ((practicaObligatoriaListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof practicaObligatoriaListener ) ((practicaObligatoriaListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_factor);
		try {
			setState(479);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_INT_CONST_B:
			case NUM_INT_CONST_O:
			case NUM_INT_CONST_H:
			case NUM_INT_CONST:
			case NUM_REAL_CONST:
			case STRING_CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(467);
				((FactorContext)_localctx).simpvalue = simpvalue();
				((FactorContext)_localctx).v =  ((FactorContext)_localctx).simpvalue.v;
				}
				break;
			case TOKEN_PARENTESIS_IZQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(470);
				match(TOKEN_PARENTESIS_IZQ);
				setState(471);
				((FactorContext)_localctx).exp = exp(0);
				setState(472);
				match(TOKEN_PARENTESIS_DER);
				((FactorContext)_localctx).v =  "(" + ((FactorContext)_localctx).exp.v + ")";
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(475);
				((FactorContext)_localctx).IDENT = match(IDENT);
				setState(476);
				((FactorContext)_localctx).aux5 = aux5((((FactorContext)_localctx).IDENT!=null?((FactorContext)_localctx).IDENT.getText():null));
				((FactorContext)_localctx).v =  ((FactorContext)_localctx).aux5.v;
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Aux5Context extends ParserRuleContext {
		public String vh;
		public String v;
		public ExpContext exp;
		public ExplistContext explist;
		public TerminalNode TOKEN_PARENTESIS_IZQ() { return getToken(practicaObligatoriaParser.TOKEN_PARENTESIS_IZQ, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public TerminalNode TOKEN_PARENTESIS_DER() { return getToken(practicaObligatoriaParser.TOKEN_PARENTESIS_DER, 0); }
		public Aux5Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Aux5Context(ParserRuleContext parent, int invokingState, String vh) {
			super(parent, invokingState);
			this.vh = vh;
		}
		@Override public int getRuleIndex() { return RULE_aux5; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof practicaObligatoriaListener ) ((practicaObligatoriaListener)listener).enterAux5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof practicaObligatoriaListener ) ((practicaObligatoriaListener)listener).exitAux5(this);
		}
	}

	public final Aux5Context aux5(String vh) throws RecognitionException {
		Aux5Context _localctx = new Aux5Context(_ctx, getState(), vh);
		enterRule(_localctx, 66, RULE_aux5);
		try {
			setState(488);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(481);
				match(TOKEN_PARENTESIS_IZQ);
				setState(482);
				((Aux5Context)_localctx).exp = exp(0);
				setState(483);
				((Aux5Context)_localctx).explist = explist(((Aux5Context)_localctx).exp.v);
				setState(484);
				match(TOKEN_PARENTESIS_DER);
				((Aux5Context)_localctx).v =  _localctx.vh + "(" + ((Aux5Context)_localctx).explist.v + ")";
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				((Aux5Context)_localctx).v =  _localctx.vh;
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

	public static class ExplistContext extends ParserRuleContext {
		public String vh;
		public String v;
		public ExpContext exp;
		public ExplistContext explist;
		public TerminalNode TOKEN_COMA() { return getToken(practicaObligatoriaParser.TOKEN_COMA, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public ExplistContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExplistContext(ParserRuleContext parent, int invokingState, String vh) {
			super(parent, invokingState);
			this.vh = vh;
		}
		@Override public int getRuleIndex() { return RULE_explist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof practicaObligatoriaListener ) ((practicaObligatoriaListener)listener).enterExplist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof practicaObligatoriaListener ) ((practicaObligatoriaListener)listener).exitExplist(this);
		}
	}

	public final ExplistContext explist(String vh) throws RecognitionException {
		ExplistContext _localctx = new ExplistContext(_ctx, getState(), vh);
		enterRule(_localctx, 68, RULE_explist);
		try {
			setState(497);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TOKEN_COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(490);
				match(TOKEN_COMA);
				setState(491);
				((ExplistContext)_localctx).exp = exp(0);
				((ExplistContext)_localctx).vh =  _localctx.vh + "," + " "+((ExplistContext)_localctx).exp.v;
				setState(493);
				((ExplistContext)_localctx).explist = explist(_localctx.vh);
				((ExplistContext)_localctx).v =  ((ExplistContext)_localctx).explist.v;
				}
				break;
			case TOKEN_PARENTESIS_DER:
				enterOuterAlt(_localctx, 2);
				{
				((ExplistContext)_localctx).v =  _localctx.vh;
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Proc_callContext extends ParserRuleContext {
		public LlamadaClass llamada_proc;
		public Token IDENT;
		public SubpparamlistContext subpparamlist;
		public TerminalNode TOKEN_CALL() { return getToken(practicaObligatoriaParser.TOKEN_CALL, 0); }
		public TerminalNode IDENT() { return getToken(practicaObligatoriaParser.IDENT, 0); }
		public SubpparamlistContext subpparamlist() {
			return getRuleContext(SubpparamlistContext.class,0);
		}
		public Proc_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proc_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof practicaObligatoriaListener ) ((practicaObligatoriaListener)listener).enterProc_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof practicaObligatoriaListener ) ((practicaObligatoriaListener)listener).exitProc_call(this);
		}
	}

	public final Proc_callContext proc_call() throws RecognitionException {
		Proc_callContext _localctx = new Proc_callContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_proc_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
			match(TOKEN_CALL);
			setState(500);
			((Proc_callContext)_localctx).IDENT = match(IDENT);
			setState(501);
			((Proc_callContext)_localctx).subpparamlist = subpparamlist();
			LlamadaClass llamada = new LlamadaClass("llamada", (((Proc_callContext)_localctx).IDENT!=null?((Proc_callContext)_localctx).IDENT.getText():null), ((Proc_callContext)_localctx).subpparamlist.v);
			((Proc_callContext)_localctx).llamada_proc =  llamada;
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

	public static class SubpparamlistContext extends ParserRuleContext {
		public String v;
		public ExpContext exp;
		public ExplistContext explist;
		public TerminalNode TOKEN_PARENTESIS_IZQ() { return getToken(practicaObligatoriaParser.TOKEN_PARENTESIS_IZQ, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public TerminalNode TOKEN_PARENTESIS_DER() { return getToken(practicaObligatoriaParser.TOKEN_PARENTESIS_DER, 0); }
		public SubpparamlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subpparamlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof practicaObligatoriaListener ) ((practicaObligatoriaListener)listener).enterSubpparamlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof practicaObligatoriaListener ) ((practicaObligatoriaListener)listener).exitSubpparamlist(this);
		}
	}

	public final SubpparamlistContext subpparamlist() throws RecognitionException {
		SubpparamlistContext _localctx = new SubpparamlistContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_subpparamlist);
		try {
			setState(511);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TOKEN_PARENTESIS_IZQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(504);
				match(TOKEN_PARENTESIS_IZQ);
				setState(505);
				((SubpparamlistContext)_localctx).exp = exp(0);
				setState(506);
				((SubpparamlistContext)_localctx).explist = explist(((SubpparamlistContext)_localctx).exp.v);
				setState(507);
				match(TOKEN_PARENTESIS_DER);
				((SubpparamlistContext)_localctx).v = "(" + ((SubpparamlistContext)_localctx).explist.v + ")";
				}
				break;
			case TOKEN_PUNTOCOMA:
				enterOuterAlt(_localctx, 2);
				{
				((SubpparamlistContext)_localctx).v =  null;
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class SubproglistContext extends ParserRuleContext {
		public ArrayList<FuncionClass> lh_funciones_implementadas;
		public ArrayList<FuncionClass> lv_funciones_implementadas;
		public CodprocContext codproc;
		public SubproglistContext subproglist;
		public CodfunContext codfun;
		public CodprocContext codproc() {
			return getRuleContext(CodprocContext.class,0);
		}
		public SubproglistContext subproglist() {
			return getRuleContext(SubproglistContext.class,0);
		}
		public CodfunContext codfun() {
			return getRuleContext(CodfunContext.class,0);
		}
		public SubproglistContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public SubproglistContext(ParserRuleContext parent, int invokingState, ArrayList<FuncionClass> lh_funciones_implementadas) {
			super(parent, invokingState);
			this.lh_funciones_implementadas = lh_funciones_implementadas;
		}
		@Override public int getRuleIndex() { return RULE_subproglist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof practicaObligatoriaListener ) ((practicaObligatoriaListener)listener).enterSubproglist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof practicaObligatoriaListener ) ((practicaObligatoriaListener)listener).exitSubproglist(this);
		}
	}

	public final SubproglistContext subproglist(ArrayList<FuncionClass> lh_funciones_implementadas) throws RecognitionException {
		SubproglistContext _localctx = new SubproglistContext(_ctx, getState(), lh_funciones_implementadas);
		enterRule(_localctx, 74, RULE_subproglist);
		try {
			setState(524);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TOKEN_SUBROUTINE:
				enterOuterAlt(_localctx, 1);
				{
				setState(513);
				((SubproglistContext)_localctx).codproc = codproc();
				_localctx.lh_funciones_implementadas.add(((SubproglistContext)_localctx).codproc.p);
				setState(515);
				((SubproglistContext)_localctx).subproglist = subproglist(_localctx.lh_funciones_implementadas);
				((SubproglistContext)_localctx).lv_funciones_implementadas =  ((SubproglistContext)_localctx).subproglist.lv_funciones_implementadas;
				}
				break;
			case TOKEN_FUNCTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(518);
				((SubproglistContext)_localctx).codfun = codfun();
				_localctx.lh_funciones_implementadas.add(((SubproglistContext)_localctx).codfun.f);
				setState(520);
				((SubproglistContext)_localctx).subproglist = subproglist(_localctx.lh_funciones_implementadas);
				((SubproglistContext)_localctx).lv_funciones_implementadas =  ((SubproglistContext)_localctx).subproglist.lv_funciones_implementadas;
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 3);
				{
				((SubproglistContext)_localctx).lv_funciones_implementadas =  _localctx.lh_funciones_implementadas;
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class CodprocContext extends ParserRuleContext {
		public FuncionClass p;
		public Token id1;
		public Formal_paramlistContext formal_paramlist;
		public Dec_s_paramlistContext dec_s_paramlist;
		public DcllistContext dcllist;
		public SentContext sent;
		public Token id2;
		public List<TerminalNode> TOKEN_SUBROUTINE() { return getTokens(practicaObligatoriaParser.TOKEN_SUBROUTINE); }
		public TerminalNode TOKEN_SUBROUTINE(int i) {
			return getToken(practicaObligatoriaParser.TOKEN_SUBROUTINE, i);
		}
		public Formal_paramlistContext formal_paramlist() {
			return getRuleContext(Formal_paramlistContext.class,0);
		}
		public Dec_s_paramlistContext dec_s_paramlist() {
			return getRuleContext(Dec_s_paramlistContext.class,0);
		}
		public DcllistContext dcllist() {
			return getRuleContext(DcllistContext.class,0);
		}
		public SentContext sent() {
			return getRuleContext(SentContext.class,0);
		}
		public SentlistContext sentlist() {
			return getRuleContext(SentlistContext.class,0);
		}
		public TerminalNode TOKEN_END() { return getToken(practicaObligatoriaParser.TOKEN_END, 0); }
		public List<TerminalNode> IDENT() { return getTokens(practicaObligatoriaParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(practicaObligatoriaParser.IDENT, i);
		}
		public CodprocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codproc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof practicaObligatoriaListener ) ((practicaObligatoriaListener)listener).enterCodproc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof practicaObligatoriaListener ) ((practicaObligatoriaListener)listener).exitCodproc(this);
		}
	}

	public final CodprocContext codproc() throws RecognitionException {
		CodprocContext _localctx = new CodprocContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_codproc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			match(TOKEN_SUBROUTINE);
			setState(527);
			((CodprocContext)_localctx).id1 = match(IDENT);
			setState(528);
			((CodprocContext)_localctx).formal_paramlist = formal_paramlist();
			setState(529);
			((CodprocContext)_localctx).dec_s_paramlist = dec_s_paramlist(((CodprocContext)_localctx).formal_paramlist.lv_parametros);
			ArrayList<ConstanteClass> lista_constantes = new ArrayList <ConstanteClass>();
			ArrayList<DeclaracionClass> lista_declaraciones = new ArrayList<DeclaracionClass>();
			ArrayList<SentenciaClass> sentencias_procedimiento = new ArrayList<SentenciaClass>();
			setState(531);
			((CodprocContext)_localctx).dcllist = dcllist(lista_constantes, lista_declaraciones);
			((CodprocContext)_localctx).dcllist.lv_declaraciones.forEach((d)->{sentencias_procedimiento.add(d);});
			setState(533);
			((CodprocContext)_localctx).sent = sent();
			sentencias_procedimiento.add(((CodprocContext)_localctx).sent.s);
			setState(535);
			sentlist(sentencias_procedimiento);
			setState(536);
			match(TOKEN_END);
			setState(537);
			match(TOKEN_SUBROUTINE);
			setState(538);
			((CodprocContext)_localctx).id2 = match(IDENT);
			((CodprocContext)_localctx).p =  crearProcedimientoImplementado((((CodprocContext)_localctx).id1!=null?((CodprocContext)_localctx).id1.getText():null), (((CodprocContext)_localctx).id2!=null?((CodprocContext)_localctx).id2.getText():null), ((CodprocContext)_localctx).dec_s_paramlist.lv_parametros,
			sentencias_procedimiento);
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

	public static class CodfunContext extends ParserRuleContext {
		public FuncionClass f;
		public Token id1;
		public NomparamlistContext nomparamlist;
		public TipoContext tipo;
		public Token id2;
		public Dec_f_paramlistContext dec_f_paramlist;
		public DcllistContext dcllist;
		public SentContext sent;
		public Token id3;
		public ExpContext exp;
		public Token id4;
		public List<TerminalNode> TOKEN_FUNCTION() { return getTokens(practicaObligatoriaParser.TOKEN_FUNCTION); }
		public TerminalNode TOKEN_FUNCTION(int i) {
			return getToken(practicaObligatoriaParser.TOKEN_FUNCTION, i);
		}
		public TerminalNode TOKEN_PARENTESIS_IZQ() { return getToken(practicaObligatoriaParser.TOKEN_PARENTESIS_IZQ, 0); }
		public NomparamlistContext nomparamlist() {
			return getRuleContext(NomparamlistContext.class,0);
		}
		public TerminalNode TOKEN_PARENTESIS_DER() { return getToken(practicaObligatoriaParser.TOKEN_PARENTESIS_DER, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode TOKEN_DOBLEPUNTO() { return getToken(practicaObligatoriaParser.TOKEN_DOBLEPUNTO, 0); }
		public List<TerminalNode> TOKEN_PUNTOCOMA() { return getTokens(practicaObligatoriaParser.TOKEN_PUNTOCOMA); }
		public TerminalNode TOKEN_PUNTOCOMA(int i) {
			return getToken(practicaObligatoriaParser.TOKEN_PUNTOCOMA, i);
		}
		public Dec_f_paramlistContext dec_f_paramlist() {
			return getRuleContext(Dec_f_paramlistContext.class,0);
		}
		public DcllistContext dcllist() {
			return getRuleContext(DcllistContext.class,0);
		}
		public SentContext sent() {
			return getRuleContext(SentContext.class,0);
		}
		public SentlistContext sentlist() {
			return getRuleContext(SentlistContext.class,0);
		}
		public TerminalNode TOKEN_IGUAL() { return getToken(practicaObligatoriaParser.TOKEN_IGUAL, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode TOKEN_END() { return getToken(practicaObligatoriaParser.TOKEN_END, 0); }
		public List<TerminalNode> IDENT() { return getTokens(practicaObligatoriaParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(practicaObligatoriaParser.IDENT, i);
		}
		public CodfunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codfun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof practicaObligatoriaListener ) ((practicaObligatoriaListener)listener).enterCodfun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof practicaObligatoriaListener ) ((practicaObligatoriaListener)listener).exitCodfun(this);
		}
	}

	public final CodfunContext codfun() throws RecognitionException {
		CodfunContext _localctx = new CodfunContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_codfun);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(541);
			match(TOKEN_FUNCTION);
			setState(542);
			((CodfunContext)_localctx).id1 = match(IDENT);
			setState(543);
			match(TOKEN_PARENTESIS_IZQ);
			ArrayList<ParametroClass> l = new ArrayList<ParametroClass>();
			setState(545);
			((CodfunContext)_localctx).nomparamlist = nomparamlist(l);
			setState(546);
			match(TOKEN_PARENTESIS_DER);
			setState(547);
			((CodfunContext)_localctx).tipo = tipo();
			setState(548);
			match(TOKEN_DOBLEPUNTO);
			setState(549);
			((CodfunContext)_localctx).id2 = match(IDENT);
			setState(550);
			match(TOKEN_PUNTOCOMA);
			setState(551);
			((CodfunContext)_localctx).dec_f_paramlist = dec_f_paramlist(((CodfunContext)_localctx).nomparamlist.lv_parametros);
			ArrayList<ConstanteClass> lista_constantes = new ArrayList <ConstanteClass>();
			ArrayList<DeclaracionClass> lista_declaraciones = new ArrayList<DeclaracionClass>();
			ArrayList<SentenciaClass> sentencias_funcion = new ArrayList<SentenciaClass>();
			setState(553);
			((CodfunContext)_localctx).dcllist = dcllist(lista_constantes, lista_declaraciones);
			((CodfunContext)_localctx).dcllist.lv_declaraciones.forEach((d)->{sentencias_funcion.add(d);});
			setState(555);
			((CodfunContext)_localctx).sent = sent();
			sentencias_funcion.add(((CodfunContext)_localctx).sent.s);
			setState(557);
			sentlist(sentencias_funcion);
			setState(558);
			((CodfunContext)_localctx).id3 = match(IDENT);
			setState(559);
			match(TOKEN_IGUAL);
			setState(560);
			((CodfunContext)_localctx).exp = exp(0);
			setState(561);
			match(TOKEN_PUNTOCOMA);
			RetornoClass r = new RetornoClass("retorno",((CodfunContext)_localctx).exp.v); sentencias_funcion.add(r);
			setState(563);
			match(TOKEN_END);
			setState(564);
			match(TOKEN_FUNCTION);
			setState(565);
			((CodfunContext)_localctx).id4 = match(IDENT);
			((CodfunContext)_localctx).f =  crearFuncionImplementada((((CodfunContext)_localctx).id1!=null?((CodfunContext)_localctx).id1.getText():null), (((CodfunContext)_localctx).id2!=null?((CodfunContext)_localctx).id2.getText():null), (((CodfunContext)_localctx).id3!=null?((CodfunContext)_localctx).id3.getText():null), (((CodfunContext)_localctx).id4!=null?((CodfunContext)_localctx).id4.getText():null), ((CodfunContext)_localctx).tipo.v,
			 ((CodfunContext)_localctx).dec_f_paramlist.lv_parametros, sentencias_funcion);
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

	public static class ExpcondContext extends ParserRuleContext {
		public String v;
		public ExpcondContext id1;
		public FactorcondContext factorcond;
		public OplogContext oplog;
		public ExpcondContext id2;
		public FactorcondContext factorcond() {
			return getRuleContext(FactorcondContext.class,0);
		}
		public OplogContext oplog() {
			return getRuleContext(OplogContext.class,0);
		}
		public List<ExpcondContext> expcond() {
			return getRuleContexts(ExpcondContext.class);
		}
		public ExpcondContext expcond(int i) {
			return getRuleContext(ExpcondContext.class,i);
		}
		public ExpcondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expcond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof practicaObligatoriaListener ) ((practicaObligatoriaListener)listener).enterExpcond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof practicaObligatoriaListener ) ((practicaObligatoriaListener)listener).exitExpcond(this);
		}
	}

	public final ExpcondContext expcond() throws RecognitionException {
		return expcond(0);
	}

	private ExpcondContext expcond(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpcondContext _localctx = new ExpcondContext(_ctx, _parentState);
		ExpcondContext _prevctx = _localctx;
		int _startState = 80;
		enterRecursionRule(_localctx, 80, RULE_expcond, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(569);
			((ExpcondContext)_localctx).factorcond = factorcond();
			((ExpcondContext)_localctx).v =  ((ExpcondContext)_localctx).factorcond.v;
			}
			_ctx.stop = _input.LT(-1);
			setState(579);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpcondContext(_parentctx, _parentState);
					_localctx.id1 = _prevctx;
					_localctx.id1 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_expcond);
					setState(572);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(573);
					((ExpcondContext)_localctx).oplog = oplog();
					setState(574);
					((ExpcondContext)_localctx).id2 = expcond(3);
					((ExpcondContext)_localctx).v =  ((ExpcondContext)_localctx).id1.v + " " + ((ExpcondContext)_localctx).oplog.v + " " +  ((ExpcondContext)_localctx).id2.v;
					}
					} 
				}
				setState(581);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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

	public static class OplogContext extends ParserRuleContext {
		public String v;
		public TerminalNode TOKEN_OR() { return getToken(practicaObligatoriaParser.TOKEN_OR, 0); }
		public TerminalNode TOKEN_AND() { return getToken(practicaObligatoriaParser.TOKEN_AND, 0); }
		public TerminalNode TOKEN_EQV() { return getToken(practicaObligatoriaParser.TOKEN_EQV, 0); }
		public TerminalNode TOKEN_NEQV() { return getToken(practicaObligatoriaParser.TOKEN_NEQV, 0); }
		public OplogContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oplog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof practicaObligatoriaListener ) ((practicaObligatoriaListener)listener).enterOplog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof practicaObligatoriaListener ) ((practicaObligatoriaListener)listener).exitOplog(this);
		}
	}

	public final OplogContext oplog() throws RecognitionException {
		OplogContext _localctx = new OplogContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_oplog);
		try {
			setState(590);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TOKEN_OR:
				enterOuterAlt(_localctx, 1);
				{
				setState(582);
				match(TOKEN_OR);
				((OplogContext)_localctx).v = "||";
				}
				break;
			case TOKEN_AND:
				enterOuterAlt(_localctx, 2);
				{
				setState(584);
				match(TOKEN_AND);
				((OplogContext)_localctx).v = "&&";
				}
				break;
			case TOKEN_EQV:
				enterOuterAlt(_localctx, 3);
				{
				setState(586);
				match(TOKEN_EQV);
				((OplogContext)_localctx).v = "!^";
				}
				break;
			case TOKEN_NEQV:
				enterOuterAlt(_localctx, 4);
				{
				setState(588);
				match(TOKEN_NEQV);
				((OplogContext)_localctx).v = "^";
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class FactorcondContext extends ParserRuleContext {
		public String v;
		public ExpContext id1;
		public OpcompContext opcomp;
		public ExpContext id2;
		public ExpcondContext expcond;
		public FactorcondContext factorcond;
		public OpcompContext opcomp() {
			return getRuleContext(OpcompContext.class,0);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode TOKEN_PARENTESIS_IZQ() { return getToken(practicaObligatoriaParser.TOKEN_PARENTESIS_IZQ, 0); }
		public ExpcondContext expcond() {
			return getRuleContext(ExpcondContext.class,0);
		}
		public TerminalNode TOKEN_PARENTESIS_DER() { return getToken(practicaObligatoriaParser.TOKEN_PARENTESIS_DER, 0); }
		public TerminalNode TOKEN_NOT() { return getToken(practicaObligatoriaParser.TOKEN_NOT, 0); }
		public FactorcondContext factorcond() {
			return getRuleContext(FactorcondContext.class,0);
		}
		public TerminalNode TOKEN_TRUE() { return getToken(practicaObligatoriaParser.TOKEN_TRUE, 0); }
		public TerminalNode TOKEN_FALSE() { return getToken(practicaObligatoriaParser.TOKEN_FALSE, 0); }
		public FactorcondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factorcond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof practicaObligatoriaListener ) ((practicaObligatoriaListener)listener).enterFactorcond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof practicaObligatoriaListener ) ((practicaObligatoriaListener)listener).exitFactorcond(this);
		}
	}

	public final FactorcondContext factorcond() throws RecognitionException {
		FactorcondContext _localctx = new FactorcondContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_factorcond);
		try {
			setState(610);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(592);
				((FactorcondContext)_localctx).id1 = exp(0);
				setState(593);
				((FactorcondContext)_localctx).opcomp = opcomp();
				setState(594);
				((FactorcondContext)_localctx).id2 = exp(0);
				((FactorcondContext)_localctx).v =  ((FactorcondContext)_localctx).id1.v + ((FactorcondContext)_localctx).opcomp.v + ((FactorcondContext)_localctx).id2.v;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(597);
				match(TOKEN_PARENTESIS_IZQ);
				setState(598);
				((FactorcondContext)_localctx).expcond = expcond(0);
				setState(599);
				match(TOKEN_PARENTESIS_DER);
				((FactorcondContext)_localctx).v =  "(" + ((FactorcondContext)_localctx).expcond.v + ")";
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(602);
				match(TOKEN_NOT);
				setState(603);
				((FactorcondContext)_localctx).factorcond = factorcond();
				((FactorcondContext)_localctx).v =  "!" + ((FactorcondContext)_localctx).factorcond.v;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(606);
				match(TOKEN_TRUE);
				((FactorcondContext)_localctx).v =  "1";
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(608);
				match(TOKEN_FALSE);
				((FactorcondContext)_localctx).v =  "0";
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

	public static class OpcompContext extends ParserRuleContext {
		public String v;
		public Token TOKEN_MENORQUE;
		public Token TOKEN_MAYORQUE;
		public Token TOKEN_MENOROIGUAL;
		public Token TOKEN_MAYOROIGUAL;
		public Token TOKEN_IGUALIGUAL;
		public TerminalNode TOKEN_MENORQUE() { return getToken(practicaObligatoriaParser.TOKEN_MENORQUE, 0); }
		public TerminalNode TOKEN_MAYORQUE() { return getToken(practicaObligatoriaParser.TOKEN_MAYORQUE, 0); }
		public TerminalNode TOKEN_MENOROIGUAL() { return getToken(practicaObligatoriaParser.TOKEN_MENOROIGUAL, 0); }
		public TerminalNode TOKEN_MAYOROIGUAL() { return getToken(practicaObligatoriaParser.TOKEN_MAYOROIGUAL, 0); }
		public TerminalNode TOKEN_IGUALIGUAL() { return getToken(practicaObligatoriaParser.TOKEN_IGUALIGUAL, 0); }
		public TerminalNode TOKEN_DISTINTO() { return getToken(practicaObligatoriaParser.TOKEN_DISTINTO, 0); }
		public OpcompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opcomp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof practicaObligatoriaListener ) ((practicaObligatoriaListener)listener).enterOpcomp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof practicaObligatoriaListener ) ((practicaObligatoriaListener)listener).exitOpcomp(this);
		}
	}

	public final OpcompContext opcomp() throws RecognitionException {
		OpcompContext _localctx = new OpcompContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_opcomp);
		try {
			setState(624);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TOKEN_MENORQUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(612);
				((OpcompContext)_localctx).TOKEN_MENORQUE = match(TOKEN_MENORQUE);
				((OpcompContext)_localctx).v =  (((OpcompContext)_localctx).TOKEN_MENORQUE!=null?((OpcompContext)_localctx).TOKEN_MENORQUE.getText():null);
				}
				break;
			case TOKEN_MAYORQUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(614);
				((OpcompContext)_localctx).TOKEN_MAYORQUE = match(TOKEN_MAYORQUE);
				((OpcompContext)_localctx).v =  (((OpcompContext)_localctx).TOKEN_MAYORQUE!=null?((OpcompContext)_localctx).TOKEN_MAYORQUE.getText():null);
				}
				break;
			case TOKEN_MENOROIGUAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(616);
				((OpcompContext)_localctx).TOKEN_MENOROIGUAL = match(TOKEN_MENOROIGUAL);
				((OpcompContext)_localctx).v =  (((OpcompContext)_localctx).TOKEN_MENOROIGUAL!=null?((OpcompContext)_localctx).TOKEN_MENOROIGUAL.getText():null);
				}
				break;
			case TOKEN_MAYOROIGUAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(618);
				((OpcompContext)_localctx).TOKEN_MAYOROIGUAL = match(TOKEN_MAYOROIGUAL);
				((OpcompContext)_localctx).v =  (((OpcompContext)_localctx).TOKEN_MAYOROIGUAL!=null?((OpcompContext)_localctx).TOKEN_MAYOROIGUAL.getText():null);
				}
				break;
			case TOKEN_IGUALIGUAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(620);
				((OpcompContext)_localctx).TOKEN_IGUALIGUAL = match(TOKEN_IGUALIGUAL);
				((OpcompContext)_localctx).v =  (((OpcompContext)_localctx).TOKEN_IGUALIGUAL!=null?((OpcompContext)_localctx).TOKEN_IGUALIGUAL.getText():null);
				}
				break;
			case TOKEN_DISTINTO:
				enterOuterAlt(_localctx, 6);
				{
				setState(622);
				match(TOKEN_DISTINTO);
				((OpcompContext)_localctx).v =  "!=";
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class DovalContext extends ParserRuleContext {
		public String v;
		public Token NUM_INT_CONST;
		public Token IDENT;
		public TerminalNode NUM_INT_CONST() { return getToken(practicaObligatoriaParser.NUM_INT_CONST, 0); }
		public TerminalNode IDENT() { return getToken(practicaObligatoriaParser.IDENT, 0); }
		public DovalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof practicaObligatoriaListener ) ((practicaObligatoriaListener)listener).enterDoval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof practicaObligatoriaListener ) ((practicaObligatoriaListener)listener).exitDoval(this);
		}
	}

	public final DovalContext doval() throws RecognitionException {
		DovalContext _localctx = new DovalContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_doval);
		try {
			setState(630);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_INT_CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(626);
				((DovalContext)_localctx).NUM_INT_CONST = match(NUM_INT_CONST);
				((DovalContext)_localctx).v =  (((DovalContext)_localctx).NUM_INT_CONST!=null?((DovalContext)_localctx).NUM_INT_CONST.getText():null);
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(628);
				((DovalContext)_localctx).IDENT = match(IDENT);
				((DovalContext)_localctx).v =  (((DovalContext)_localctx).IDENT!=null?((DovalContext)_localctx).IDENT.getText():null);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class CasosContext extends ParserRuleContext {
		public ArrayList<CasosClass> lh_casos;
		public boolean esDefault_h;
		public ArrayList<SentenciaClass> sh_default;
		public ArrayList<CasosClass> lv_casos;
		public boolean esDefault_v;
		public ArrayList<SentenciaClass> sv_default;
		public Aux9Context aux9;
		public TerminalNode TOKEN_CASE() { return getToken(practicaObligatoriaParser.TOKEN_CASE, 0); }
		public Aux9Context aux9() {
			return getRuleContext(Aux9Context.class,0);
		}
		public CasosContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public CasosContext(ParserRuleContext parent, int invokingState, ArrayList<CasosClass> lh_casos, boolean esDefault_h, ArrayList<SentenciaClass> sh_default) {
			super(parent, invokingState);
			this.lh_casos = lh_casos;
			this.esDefault_h = esDefault_h;
			this.sh_default = sh_default;
		}
		@Override public int getRuleIndex() { return RULE_casos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof practicaObligatoriaListener ) ((practicaObligatoriaListener)listener).enterCasos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof practicaObligatoriaListener ) ((practicaObligatoriaListener)listener).exitCasos(this);
		}
	}

	public final CasosContext casos(ArrayList<CasosClass> lh_casos,boolean esDefault_h,ArrayList<SentenciaClass> sh_default) throws RecognitionException {
		CasosContext _localctx = new CasosContext(_ctx, getState(), lh_casos, esDefault_h, sh_default);
		enterRule(_localctx, 90, RULE_casos);
		try {
			setState(637);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TOKEN_CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(632);
				match(TOKEN_CASE);
				setState(633);
				((CasosContext)_localctx).aux9 = aux9(_localctx.lh_casos, _localctx.esDefault_h, _localctx.sh_default);
				((CasosContext)_localctx).lv_casos =  ((CasosContext)_localctx).aux9.lv_casos; ((CasosContext)_localctx).esDefault_v =  ((CasosContext)_localctx).aux9.esDefault_v; ((CasosContext)_localctx).sv_default =  ((CasosContext)_localctx).aux9.sv_default;
				}
				break;
			case TOKEN_END:
				enterOuterAlt(_localctx, 2);
				{
				((CasosContext)_localctx).lv_casos =  _localctx.lh_casos; ((CasosContext)_localctx).esDefault_v =  _localctx.esDefault_h; 
				                ((CasosContext)_localctx).sv_default =  _localctx.sh_default;
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Aux9Context extends ParserRuleContext {
		public ArrayList<CasosClass> lh_casos;
		public boolean esDefault_h;
		public ArrayList<SentenciaClass> sh_default;
		public ArrayList<CasosClass> lv_casos;
		public boolean esDefault_v;
		public ArrayList<SentenciaClass> sv_default;
		public EtiquetasContext etiquetas;
		public SentlistContext sentlist;
		public CasosContext casos;
		public TerminalNode TOKEN_PARENTESIS_IZQ() { return getToken(practicaObligatoriaParser.TOKEN_PARENTESIS_IZQ, 0); }
		public EtiquetasContext etiquetas() {
			return getRuleContext(EtiquetasContext.class,0);
		}
		public TerminalNode TOKEN_PARENTESIS_DER() { return getToken(practicaObligatoriaParser.TOKEN_PARENTESIS_DER, 0); }
		public SentlistContext sentlist() {
			return getRuleContext(SentlistContext.class,0);
		}
		public CasosContext casos() {
			return getRuleContext(CasosContext.class,0);
		}
		public TerminalNode TOKEN_DEFAULT() { return getToken(practicaObligatoriaParser.TOKEN_DEFAULT, 0); }
		public Aux9Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Aux9Context(ParserRuleContext parent, int invokingState, ArrayList<CasosClass> lh_casos, boolean esDefault_h, ArrayList<SentenciaClass> sh_default) {
			super(parent, invokingState);
			this.lh_casos = lh_casos;
			this.esDefault_h = esDefault_h;
			this.sh_default = sh_default;
		}
		@Override public int getRuleIndex() { return RULE_aux9; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof practicaObligatoriaListener ) ((practicaObligatoriaListener)listener).enterAux9(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof practicaObligatoriaListener ) ((practicaObligatoriaListener)listener).exitAux9(this);
		}
	}

	public final Aux9Context aux9(ArrayList<CasosClass> lh_casos,boolean esDefault_h,ArrayList<SentenciaClass> sh_default) throws RecognitionException {
		Aux9Context _localctx = new Aux9Context(_ctx, getState(), lh_casos, esDefault_h, sh_default);
		enterRule(_localctx, 92, RULE_aux9);
		try {
			setState(653);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TOKEN_PARENTESIS_IZQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(639);
				match(TOKEN_PARENTESIS_IZQ);
				setState(640);
				((Aux9Context)_localctx).etiquetas = etiquetas();
				setState(641);
				match(TOKEN_PARENTESIS_DER);
				ArrayList<SentenciaClass> lista = new ArrayList<SentenciaClass>();
				setState(643);
				((Aux9Context)_localctx).sentlist = sentlist(lista);
				CasosClass caso = new CasosClass(((Aux9Context)_localctx).etiquetas.lv_etiquetas,((Aux9Context)_localctx).sentlist.lv_sentencias); 
				_localctx.lh_casos.add(caso);
				setState(645);
				((Aux9Context)_localctx).casos = casos(_localctx.lh_casos, _localctx.esDefault_h, _localctx.sh_default);
				((Aux9Context)_localctx).lv_casos =  ((Aux9Context)_localctx).casos.lv_casos; ((Aux9Context)_localctx).esDefault_v =  ((Aux9Context)_localctx).casos.esDefault_v; 
				((Aux9Context)_localctx).sv_default =  ((Aux9Context)_localctx).casos.sv_default;
				}
				break;
			case TOKEN_DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(648);
				match(TOKEN_DEFAULT);
				((Aux9Context)_localctx).esDefault_h =  true; 
				ArrayList<SentenciaClass> lista = new ArrayList<SentenciaClass>();
				setState(650);
				((Aux9Context)_localctx).sentlist = sentlist(lista);
				((Aux9Context)_localctx).sh_default =  ((Aux9Context)_localctx).sentlist.lv_sentencias;
				((Aux9Context)_localctx).lv_casos =  _localctx.lh_casos; ((Aux9Context)_localctx).esDefault_v =  _localctx.esDefault_h; ((Aux9Context)_localctx).sv_default =  _localctx.sh_default;
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class EtiquetasContext extends ParserRuleContext {
		public ArrayList<String> lv_etiquetas;
		public SimpvalueContext simpvalue;
		public Aux10Context aux10;
		public SimpvalueContext simpvalue() {
			return getRuleContext(SimpvalueContext.class,0);
		}
		public Aux10Context aux10() {
			return getRuleContext(Aux10Context.class,0);
		}
		public TerminalNode TOKEN_DOBLEPUNTO_SIMPLE() { return getToken(practicaObligatoriaParser.TOKEN_DOBLEPUNTO_SIMPLE, 0); }
		public EtiquetasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_etiquetas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof practicaObligatoriaListener ) ((practicaObligatoriaListener)listener).enterEtiquetas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof practicaObligatoriaListener ) ((practicaObligatoriaListener)listener).exitEtiquetas(this);
		}
	}

	public final EtiquetasContext etiquetas() throws RecognitionException {
		EtiquetasContext _localctx = new EtiquetasContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_etiquetas);
		try {
			setState(664);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_INT_CONST_B:
			case NUM_INT_CONST_O:
			case NUM_INT_CONST_H:
			case NUM_INT_CONST:
			case NUM_REAL_CONST:
			case STRING_CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(655);
				((EtiquetasContext)_localctx).simpvalue = simpvalue();
				ArrayList<String> l_etiquetas = new ArrayList<String>();
				setState(657);
				((EtiquetasContext)_localctx).aux10 = aux10(l_etiquetas, ((EtiquetasContext)_localctx).simpvalue.v);
				((EtiquetasContext)_localctx).lv_etiquetas =  ((EtiquetasContext)_localctx).aux10.lv_etiquetas;
				}
				break;
			case TOKEN_DOBLEPUNTO_SIMPLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(660);
				match(TOKEN_DOBLEPUNTO_SIMPLE);
				setState(661);
				((EtiquetasContext)_localctx).simpvalue = simpvalue();
				ArrayList<String> l_etiquetas = new ArrayList<String>();
				String etiqueta = "<" + ((EtiquetasContext)_localctx).simpvalue.v; l_etiquetas.add(etiqueta);
				((EtiquetasContext)_localctx).lv_etiquetas =  l_etiquetas;
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Aux10Context extends ParserRuleContext {
		public ArrayList<String> lh_etiquetas;
		public String vh;
		public ArrayList<String> lv_etiquetas;
		public ListaetiqetasContext listaetiqetas;
		public SimpvalueContext simpvalue;
		public ListaetiqetasContext listaetiqetas() {
			return getRuleContext(ListaetiqetasContext.class,0);
		}
		public TerminalNode TOKEN_DOBLEPUNTO_SIMPLE() { return getToken(practicaObligatoriaParser.TOKEN_DOBLEPUNTO_SIMPLE, 0); }
		public SimpvalueContext simpvalue() {
			return getRuleContext(SimpvalueContext.class,0);
		}
		public Aux10Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Aux10Context(ParserRuleContext parent, int invokingState, ArrayList<String> lh_etiquetas, String vh) {
			super(parent, invokingState);
			this.lh_etiquetas = lh_etiquetas;
			this.vh = vh;
		}
		@Override public int getRuleIndex() { return RULE_aux10; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof practicaObligatoriaListener ) ((practicaObligatoriaListener)listener).enterAux10(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof practicaObligatoriaListener ) ((practicaObligatoriaListener)listener).exitAux10(this);
		}
	}

	public final Aux10Context aux10(ArrayList<String> lh_etiquetas,String vh) throws RecognitionException {
		Aux10Context _localctx = new Aux10Context(_ctx, getState(), lh_etiquetas, vh);
		enterRule(_localctx, 96, RULE_aux10);
		try {
			setState(676);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_localctx.lh_etiquetas.add(_localctx.vh);
				setState(667);
				((Aux10Context)_localctx).listaetiqetas = listaetiqetas(_localctx.lh_etiquetas);
				((Aux10Context)_localctx).lv_etiquetas =  ((Aux10Context)_localctx).listaetiqetas.lv_etiquetas;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(670);
				match(TOKEN_DOBLEPUNTO_SIMPLE);
				setState(671);
				((Aux10Context)_localctx).simpvalue = simpvalue();
				String etiqueta = _localctx.vh
				 + "to" + ((Aux10Context)_localctx).simpvalue.v; 
				 _localctx.lh_etiquetas.add(etiqueta); ((Aux10Context)_localctx).lv_etiquetas =  _localctx.lh_etiquetas;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(674);
				match(TOKEN_DOBLEPUNTO_SIMPLE);

				String etiqueta = ">" + _localctx.vh; 
				_localctx.lh_etiquetas.add(etiqueta); ((Aux10Context)_localctx).lv_etiquetas =  _localctx.lh_etiquetas;
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

	public static class ListaetiqetasContext extends ParserRuleContext {
		public ArrayList<String> lh_etiquetas;
		public ArrayList<String> lv_etiquetas;
		public SimpvalueContext simpvalue;
		public ListaetiqetasContext listaetiqetas;
		public TerminalNode TOKEN_COMA() { return getToken(practicaObligatoriaParser.TOKEN_COMA, 0); }
		public SimpvalueContext simpvalue() {
			return getRuleContext(SimpvalueContext.class,0);
		}
		public ListaetiqetasContext listaetiqetas() {
			return getRuleContext(ListaetiqetasContext.class,0);
		}
		public ListaetiqetasContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ListaetiqetasContext(ParserRuleContext parent, int invokingState, ArrayList<String> lh_etiquetas) {
			super(parent, invokingState);
			this.lh_etiquetas = lh_etiquetas;
		}
		@Override public int getRuleIndex() { return RULE_listaetiqetas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof practicaObligatoriaListener ) ((practicaObligatoriaListener)listener).enterListaetiqetas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof practicaObligatoriaListener ) ((practicaObligatoriaListener)listener).exitListaetiqetas(this);
		}
	}

	public final ListaetiqetasContext listaetiqetas(ArrayList<String> lh_etiquetas) throws RecognitionException {
		ListaetiqetasContext _localctx = new ListaetiqetasContext(_ctx, getState(), lh_etiquetas);
		enterRule(_localctx, 98, RULE_listaetiqetas);
		try {
			setState(685);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TOKEN_COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(678);
				match(TOKEN_COMA);
				setState(679);
				((ListaetiqetasContext)_localctx).simpvalue = simpvalue();
				_localctx.lh_etiquetas.add(((ListaetiqetasContext)_localctx).simpvalue.v);
				setState(681);
				((ListaetiqetasContext)_localctx).listaetiqetas = listaetiqetas(_localctx.lh_etiquetas);
				((ListaetiqetasContext)_localctx).lv_etiquetas =  ((ListaetiqetasContext)_localctx).listaetiqetas.lv_etiquetas;
				}
				break;
			case TOKEN_PARENTESIS_DER:
				enterOuterAlt(_localctx, 2);
				{
				((ListaetiqetasContext)_localctx).lv_etiquetas =  _localctx.lh_etiquetas;
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		case 29:
			return exp_sempred((ExpContext)_localctx, predIndex);
		case 40:
			return expcond_sempred((ExpcondContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expcond_sempred(ExpcondContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3;\u02b2\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\5\3\u0080\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5"+
		"\4\u008a\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0096\n\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00a3\n\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\5\7\u00ab\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00b5\n\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\5\n"+
		"\u00c8\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00d3\n\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00e1\n\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\5\16\u00f0\n\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00fa\n\17\3\20\3\20\3\20\3\20"+
		"\3\20\5\20\u0101\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\5\22\u010e\n\22\3\23\3\23\3\23\3\23\3\23\5\23\u0115\n\23\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\5\25\u0127\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0131"+
		"\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\5\27\u0140\n\27\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0148\n\30\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3"+
		"\33\3\33\3\33\5\33\u016a\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u018b\n\34\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\5\35\u01a2\n\35\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\5\36\u01b9\n\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\7\37"+
		"\u01c4\n\37\f\37\16\37\u01c7\13\37\3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\5"+
		"!\u01d4\n!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u01e2\n"+
		"\"\3#\3#\3#\3#\3#\3#\3#\5#\u01eb\n#\3$\3$\3$\3$\3$\3$\3$\5$\u01f4\n$\3"+
		"%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\5&\u0202\n&\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\5\'\u020f\n\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3"+
		")\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\7*\u0244\n*\f*\16*\u0247"+
		"\13*\3+\3+\3+\3+\3+\3+\3+\3+\5+\u0251\n+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3"+
		",\3,\3,\3,\3,\3,\3,\3,\3,\5,\u0265\n,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3"+
		"-\3-\5-\u0273\n-\3.\3.\3.\3.\5.\u0279\n.\3/\3/\3/\3/\3/\5/\u0280\n/\3"+
		"\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\5"+
		"\60\u0290\n\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u029b"+
		"\n\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u02a7\n\62"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u02b0\n\63\3\63\2\4<R\64\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNP"+
		"RTVXZ\\^`bd\2\2\2\u02bf\2f\3\2\2\2\4\177\3\2\2\2\6\u0089\3\2\2\2\b\u0095"+
		"\3\2\2\2\n\u00a2\3\2\2\2\f\u00aa\3\2\2\2\16\u00b4\3\2\2\2\20\u00b6\3\2"+
		"\2\2\22\u00c7\3\2\2\2\24\u00d2\3\2\2\2\26\u00e0\3\2\2\2\30\u00e2\3\2\2"+
		"\2\32\u00ef\3\2\2\2\34\u00f9\3\2\2\2\36\u0100\3\2\2\2 \u0102\3\2\2\2\""+
		"\u010d\3\2\2\2$\u0114\3\2\2\2&\u0116\3\2\2\2(\u0126\3\2\2\2*\u0130\3\2"+
		"\2\2,\u013f\3\2\2\2.\u0147\3\2\2\2\60\u0149\3\2\2\2\62\u0159\3\2\2\2\64"+
		"\u0169\3\2\2\2\66\u018a\3\2\2\28\u01a1\3\2\2\2:\u01b8\3\2\2\2<\u01ba\3"+
		"\2\2\2>\u01c8\3\2\2\2@\u01d3\3\2\2\2B\u01e1\3\2\2\2D\u01ea\3\2\2\2F\u01f3"+
		"\3\2\2\2H\u01f5\3\2\2\2J\u0201\3\2\2\2L\u020e\3\2\2\2N\u0210\3\2\2\2P"+
		"\u021f\3\2\2\2R\u023a\3\2\2\2T\u0250\3\2\2\2V\u0264\3\2\2\2X\u0272\3\2"+
		"\2\2Z\u0278\3\2\2\2\\\u027f\3\2\2\2^\u028f\3\2\2\2`\u029a\3\2\2\2b\u02a6"+
		"\3\2\2\2d\u02af\3\2\2\2fg\7\3\2\2gh\7\66\2\2hi\7\5\2\2ij\b\2\1\2jk\5\4"+
		"\3\2kl\b\2\1\2lm\5\6\4\2mn\b\2\1\2no\5\66\34\2op\b\2\1\2pq\5\f\7\2qr\b"+
		"\2\1\2rs\7\6\2\2st\7\3\2\2tu\7\66\2\2uv\b\2\1\2vw\5L\'\2wx\b\2\1\2x\3"+
		"\3\2\2\2yz\5\16\b\2z{\b\3\1\2{|\5\4\3\2|}\b\3\1\2}\u0080\3\2\2\2~\u0080"+
		"\b\3\1\2\177y\3\2\2\2\177~\3\2\2\2\u0080\5\3\2\2\2\u0081\u0082\b\4\1\2"+
		"\u0082\u0083\7\4\2\2\u0083\u0084\5\b\5\2\u0084\u0085\7\6\2\2\u0085\u0086"+
		"\7\4\2\2\u0086\u0087\b\4\1\2\u0087\u008a\3\2\2\2\u0088\u008a\b\4\1\2\u0089"+
		"\u0081\3\2\2\2\u0089\u0088\3\2\2\2\u008a\7\3\2\2\2\u008b\u008c\5&\24\2"+
		"\u008c\u008d\b\5\1\2\u008d\u008e\5\n\6\2\u008e\u008f\b\5\1\2\u008f\u0096"+
		"\3\2\2\2\u0090\u0091\5\60\31\2\u0091\u0092\b\5\1\2\u0092\u0093\5\n\6\2"+
		"\u0093\u0094\b\5\1\2\u0094\u0096\3\2\2\2\u0095\u008b\3\2\2\2\u0095\u0090"+
		"\3\2\2\2\u0096\t\3\2\2\2\u0097\u0098\5&\24\2\u0098\u0099\b\6\1\2\u0099"+
		"\u009a\5\n\6\2\u009a\u009b\b\6\1\2\u009b\u00a3\3\2\2\2\u009c\u009d\5\60"+
		"\31\2\u009d\u009e\b\6\1\2\u009e\u009f\5\n\6\2\u009f\u00a0\b\6\1\2\u00a0"+
		"\u00a3\3\2\2\2\u00a1\u00a3\b\6\1\2\u00a2\u0097\3\2\2\2\u00a2\u009c\3\2"+
		"\2\2\u00a2\u00a1\3\2\2\2\u00a3\13\3\2\2\2\u00a4\u00a5\5\66\34\2\u00a5"+
		"\u00a6\b\7\1\2\u00a6\u00a7\5\f\7\2\u00a7\u00a8\b\7\1\2\u00a8\u00ab\3\2"+
		"\2\2\u00a9\u00ab\b\7\1\2\u00aa\u00a4\3\2\2\2\u00aa\u00a9\3\2\2\2\u00ab"+
		"\r\3\2\2\2\u00ac\u00ad\b\b\1\2\u00ad\u00ae\5\20\t\2\u00ae\u00af\b\b\1"+
		"\2\u00af\u00b5\3\2\2\2\u00b0\u00b1\b\b\1\2\u00b1\u00b2\5\30\r\2\u00b2"+
		"\u00b3\b\b\1\2\u00b3\u00b5\3\2\2\2\u00b4\u00ac\3\2\2\2\u00b4\u00b0\3\2"+
		"\2\2\u00b5\17\3\2\2\2\u00b6\u00b7\5\34\17\2\u00b7\u00b8\7\21\2\2\u00b8"+
		"\u00b9\7\t\2\2\u00b9\u00ba\7\b\2\2\u00ba\u00bb\7\66\2\2\u00bb\u00bc\7"+
		"\20\2\2\u00bc\u00bd\5\26\f\2\u00bd\u00be\b\t\1\2\u00be\u00bf\5\24\13\2"+
		"\u00bf\u00c0\7\5\2\2\u00c0\u00c1\5\22\n\2\u00c1\u00c2\b\t\1\2\u00c2\21"+
		"\3\2\2\2\u00c3\u00c4\5\20\t\2\u00c4\u00c5\b\n\1\2\u00c5\u00c8\3\2\2\2"+
		"\u00c6\u00c8\b\n\1\2\u00c7\u00c3\3\2\2\2\u00c7\u00c6\3\2\2\2\u00c8\23"+
		"\3\2\2\2\u00c9\u00ca\7\21\2\2\u00ca\u00cb\7\66\2\2\u00cb\u00cc\7\20\2"+
		"\2\u00cc\u00cd\5\26\f\2\u00cd\u00ce\b\13\1\2\u00ce\u00cf\5\24\13\2\u00cf"+
		"\u00d0\b\13\1\2\u00d0\u00d3\3\2\2\2\u00d1\u00d3\b\13\1\2\u00d2\u00c9\3"+
		"\2\2\2\u00d2\u00d1\3\2\2\2\u00d3\25\3\2\2\2\u00d4\u00d5\7\67\2\2\u00d5"+
		"\u00e1\b\f\1\2\u00d6\u00d7\78\2\2\u00d7\u00e1\b\f\1\2\u00d8\u00d9\79\2"+
		"\2\u00d9\u00e1\b\f\1\2\u00da\u00db\7\60\2\2\u00db\u00e1\b\f\1\2\u00dc"+
		"\u00dd\7\61\2\2\u00dd\u00e1\b\f\1\2\u00de\u00df\7\62\2\2\u00df\u00e1\b"+
		"\f\1\2\u00e0\u00d4\3\2\2\2\u00e0\u00d6\3\2\2\2\u00e0\u00d8\3\2\2\2\u00e0"+
		"\u00da\3\2\2\2\u00e0\u00dc\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1\27\3\2\2"+
		"\2\u00e2\u00e3\5\34\17\2\u00e3\u00e4\7\b\2\2\u00e4\u00e5\b\r\1\2\u00e5"+
		"\u00e6\5 \21\2\u00e6\u00e7\b\r\1\2\u00e7\u00e8\7\5\2\2\u00e8\u00e9\5\32"+
		"\16\2\u00e9\u00ea\b\r\1\2\u00ea\31\3\2\2\2\u00eb\u00ec\5\30\r\2\u00ec"+
		"\u00ed\b\16\1\2\u00ed\u00f0\3\2\2\2\u00ee\u00f0\b\16\1\2\u00ef\u00eb\3"+
		"\2\2\2\u00ef\u00ee\3\2\2\2\u00f0\33\3\2\2\2\u00f1\u00f2\7\22\2\2\u00f2"+
		"\u00fa\b\17\1\2\u00f3\u00f4\7\23\2\2\u00f4\u00fa\b\17\1\2\u00f5\u00f6"+
		"\7\24\2\2\u00f6\u00f7\5\36\20\2\u00f7\u00f8\b\17\1\2\u00f8\u00fa\3\2\2"+
		"\2\u00f9\u00f1\3\2\2\2\u00f9\u00f3\3\2\2\2\u00f9\u00f5\3\2\2\2\u00fa\35"+
		"\3\2\2\2\u00fb\u00fc\7\25\2\2\u00fc\u00fd\7\67\2\2\u00fd\u00fe\7\26\2"+
		"\2\u00fe\u0101\b\20\1\2\u00ff\u0101\b\20\1\2\u0100\u00fb\3\2\2\2\u0100"+
		"\u00ff\3\2\2\2\u0101\37\3\2\2\2\u0102\u0103\7\66\2\2\u0103\u0104\5$\23"+
		"\2\u0104\u0105\b\21\1\2\u0105\u0106\5\"\22\2\u0106\u0107\b\21\1\2\u0107"+
		"!\3\2\2\2\u0108\u0109\7\21\2\2\u0109\u010a\5 \21\2\u010a\u010b\b\22\1"+
		"\2\u010b\u010e\3\2\2\2\u010c\u010e\b\22\1\2\u010d\u0108\3\2\2\2\u010d"+
		"\u010c\3\2\2\2\u010e#\3\2\2\2\u010f\u0110\7\20\2\2\u0110\u0111\5\26\f"+
		"\2\u0111\u0112\b\23\1\2\u0112\u0115\3\2\2\2\u0113\u0115\b\23\1\2\u0114"+
		"\u010f\3\2\2\2\u0114\u0113\3\2\2\2\u0115%\3\2\2\2\u0116\u0117\7\27\2\2"+
		"\u0117\u0118\7\66\2\2\u0118\u0119\5(\25\2\u0119\u011a\5,\27\2\u011a\u011b"+
		"\7\6\2\2\u011b\u011c\7\27\2\2\u011c\u011d\7\66\2\2\u011d\u011e\b\24\1"+
		"\2\u011e\'\3\2\2\2\u011f\u0120\7\25\2\2\u0120\u0121\b\25\1\2\u0121\u0122"+
		"\5*\26\2\u0122\u0123\7\26\2\2\u0123\u0124\b\25\1\2\u0124\u0127\3\2\2\2"+
		"\u0125\u0127\b\25\1\2\u0126\u011f\3\2\2\2\u0126\u0125\3\2\2\2\u0127)\3"+
		"\2\2\2\u0128\u0129\7\66\2\2\u0129\u0131\b\26\1\2\u012a\u012b\7\66\2\2"+
		"\u012b\u012c\b\26\1\2\u012c\u012d\7\21\2\2\u012d\u012e\5*\26\2\u012e\u012f"+
		"\b\26\1\2\u012f\u0131\3\2\2\2\u0130\u0128\3\2\2\2\u0130\u012a\3\2\2\2"+
		"\u0131+\3\2\2\2\u0132\u0133\5\34\17\2\u0133\u0134\7\21\2\2\u0134\u0135"+
		"\7\34\2\2\u0135\u0136\7\25\2\2\u0136\u0137\5.\30\2\u0137\u0138\7\26\2"+
		"\2\u0138\u0139\7\66\2\2\u0139\u013a\7\5\2\2\u013a\u013b\b\27\1\2\u013b"+
		"\u013c\5,\27\2\u013c\u013d\b\27\1\2\u013d\u0140\3\2\2\2\u013e\u0140\b"+
		"\27\1\2\u013f\u0132\3\2\2\2\u013f\u013e\3\2\2\2\u0140-\3\2\2\2\u0141\u0142"+
		"\7\30\2\2\u0142\u0148\b\30\1\2\u0143\u0144\7\31\2\2\u0144\u0148\b\30\1"+
		"\2\u0145\u0146\7\32\2\2\u0146\u0148\b\30\1\2\u0147\u0141\3\2\2\2\u0147"+
		"\u0143\3\2\2\2\u0147\u0145\3\2\2\2\u0148/\3\2\2\2\u0149\u014a\7\33\2\2"+
		"\u014a\u014b\7\66\2\2\u014b\u014c\7\25\2\2\u014c\u014d\b\31\1\2\u014d"+
		"\u014e\5*\26\2\u014e\u014f\7\26\2\2\u014f\u0150\5\34\17\2\u0150\u0151"+
		"\7\b\2\2\u0151\u0152\7\66\2\2\u0152\u0153\7\5\2\2\u0153\u0154\5\62\32"+
		"\2\u0154\u0155\7\6\2\2\u0155\u0156\7\33\2\2\u0156\u0157\7\66\2\2\u0157"+
		"\u0158\b\31\1\2\u0158\61\3\2\2\2\u0159\u015a\5\34\17\2\u015a\u015b\7\21"+
		"\2\2\u015b\u015c\7\34\2\2\u015c\u015d\7\25\2\2\u015d\u015e\7\30\2\2\u015e"+
		"\u015f\7\26\2\2\u015f\u0160\7\66\2\2\u0160\u0161\7\5\2\2\u0161\u0162\b"+
		"\32\1\2\u0162\u0163\5\64\33\2\u0163\u0164\b\32\1\2\u0164\63\3\2\2\2\u0165"+
		"\u0166\5\62\32\2\u0166\u0167\b\33\1\2\u0167\u016a\3\2\2\2\u0168\u016a"+
		"\b\33\1\2\u0169\u0165\3\2\2\2\u0169\u0168\3\2\2\2\u016a\65\3\2\2\2\u016b"+
		"\u016c\7\66\2\2\u016c\u016d\7\20\2\2\u016d\u016e\5<\37\2\u016e\u016f\7"+
		"\5\2\2\u016f\u0170\b\34\1\2\u0170\u018b\3\2\2\2\u0171\u0172\5H%\2\u0172"+
		"\u0173\7\5\2\2\u0173\u0174\b\34\1\2\u0174\u018b\3\2\2\2\u0175\u0176\7"+
		"&\2\2\u0176\u0177\7\25\2\2\u0177\u0178\5R*\2\u0178\u0179\58\35\2\u0179"+
		"\u017a\b\34\1\2\u017a\u018b\3\2\2\2\u017b\u017c\7*\2\2\u017c\u017d\5:"+
		"\36\2\u017d\u017e\b\34\1\2\u017e\u018b\3\2\2\2\u017f\u0180\7-\2\2\u0180"+
		"\u0181\7.\2\2\u0181\u0182\7\25\2\2\u0182\u0183\5<\37\2\u0183\u0184\7\26"+
		"\2\2\u0184\u0185\b\34\1\2\u0185\u0186\5\\/\2\u0186\u0187\7\6\2\2\u0187"+
		"\u0188\7-\2\2\u0188\u0189\b\34\1\2\u0189\u018b\3\2\2\2\u018a\u016b\3\2"+
		"\2\2\u018a\u0171\3\2\2\2\u018a\u0175\3\2\2\2\u018a\u017b\3\2\2\2\u018a"+
		"\u017f\3\2\2\2\u018b\67\3\2\2\2\u018c\u018d\7\26\2\2\u018d\u018e\5\66"+
		"\34\2\u018e\u018f\b\35\1\2\u018f\u01a2\3\2\2\2\u0190\u0191\7\26\2\2\u0191"+
		"\u0192\7\'\2\2\u0192\u0193\b\35\1\2\u0193\u0194\5\f\7\2\u0194\u0195\7"+
		")\2\2\u0195\u0196\b\35\1\2\u0196\u01a2\3\2\2\2\u0197\u0198\7\26\2\2\u0198"+
		"\u0199\7\'\2\2\u0199\u019a\b\35\1\2\u019a\u019b\5\f\7\2\u019b\u019c\7"+
		"(\2\2\u019c\u019d\b\35\1\2\u019d\u019e\5\f\7\2\u019e\u019f\7)\2\2\u019f"+
		"\u01a0\b\35\1\2\u01a0\u01a2\3\2\2\2\u01a1\u018c\3\2\2\2\u01a1\u0190\3"+
		"\2\2\2\u01a1\u0197\3\2\2\2\u01a29\3\2\2\2\u01a3\u01a4\7+\2\2\u01a4\u01a5"+
		"\7\25\2\2\u01a5\u01a6\5R*\2\u01a6\u01a7\7\26\2\2\u01a7\u01a8\b\36\1\2"+
		"\u01a8\u01a9\5\f\7\2\u01a9\u01aa\7,\2\2\u01aa\u01ab\b\36\1\2\u01ab\u01b9"+
		"\3\2\2\2\u01ac\u01ad\7\66\2\2\u01ad\u01ae\7\20\2\2\u01ae\u01af\5Z.\2\u01af"+
		"\u01b0\7\21\2\2\u01b0\u01b1\5Z.\2\u01b1\u01b2\7\21\2\2\u01b2\u01b3\5Z"+
		".\2\u01b3\u01b4\b\36\1\2\u01b4\u01b5\5\f\7\2\u01b5\u01b6\7,\2\2\u01b6"+
		"\u01b7\b\36\1\2\u01b7\u01b9\3\2\2\2\u01b8\u01a3\3\2\2\2\u01b8\u01ac\3"+
		"\2\2\2\u01b9;\3\2\2\2\u01ba\u01bb\b\37\1\2\u01bb\u01bc\5B\"\2\u01bc\u01bd"+
		"\b\37\1\2\u01bd\u01c5\3\2\2\2\u01be\u01bf\f\4\2\2\u01bf\u01c0\5> \2\u01c0"+
		"\u01c1\5<\37\5\u01c1\u01c2\b\37\1\2\u01c2\u01c4\3\2\2\2\u01c3\u01be\3"+
		"\2\2\2\u01c4\u01c7\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6"+
		"=\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c8\u01c9\5@!\2\u01c9\u01ca\b \1\2\u01ca"+
		"?\3\2\2\2\u01cb\u01cc\7\35\2\2\u01cc\u01d4\b!\1\2\u01cd\u01ce\7\36\2\2"+
		"\u01ce\u01d4\b!\1\2\u01cf\u01d0\7\37\2\2\u01d0\u01d4\b!\1\2\u01d1\u01d2"+
		"\7 \2\2\u01d2\u01d4\b!\1\2\u01d3\u01cb\3\2\2\2\u01d3\u01cd\3\2\2\2\u01d3"+
		"\u01cf\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d4A\3\2\2\2\u01d5\u01d6\5\26\f\2"+
		"\u01d6\u01d7\b\"\1\2\u01d7\u01e2\3\2\2\2\u01d8\u01d9\7\25\2\2\u01d9\u01da"+
		"\5<\37\2\u01da\u01db\7\26\2\2\u01db\u01dc\b\"\1\2\u01dc\u01e2\3\2\2\2"+
		"\u01dd\u01de\7\66\2\2\u01de\u01df\5D#\2\u01df\u01e0\b\"\1\2\u01e0\u01e2"+
		"\3\2\2\2\u01e1\u01d5\3\2\2\2\u01e1\u01d8\3\2\2\2\u01e1\u01dd\3\2\2\2\u01e2"+
		"C\3\2\2\2\u01e3\u01e4\7\25\2\2\u01e4\u01e5\5<\37\2\u01e5\u01e6\5F$\2\u01e6"+
		"\u01e7\7\26\2\2\u01e7\u01e8\b#\1\2\u01e8\u01eb\3\2\2\2\u01e9\u01eb\b#"+
		"\1\2\u01ea\u01e3\3\2\2\2\u01ea\u01e9\3\2\2\2\u01ebE\3\2\2\2\u01ec\u01ed"+
		"\7\21\2\2\u01ed\u01ee\5<\37\2\u01ee\u01ef\b$\1\2\u01ef\u01f0\5F$\2\u01f0"+
		"\u01f1\b$\1\2\u01f1\u01f4\3\2\2\2\u01f2\u01f4\b$\1\2\u01f3\u01ec\3\2\2"+
		"\2\u01f3\u01f2\3\2\2\2\u01f4G\3\2\2\2\u01f5\u01f6\7!\2\2\u01f6\u01f7\7"+
		"\66\2\2\u01f7\u01f8\5J&\2\u01f8\u01f9\b%\1\2\u01f9I\3\2\2\2\u01fa\u01fb"+
		"\7\25\2\2\u01fb\u01fc\5<\37\2\u01fc\u01fd\5F$\2\u01fd\u01fe\7\26\2\2\u01fe"+
		"\u01ff\b&\1\2\u01ff\u0202\3\2\2\2\u0200\u0202\b&\1\2\u0201\u01fa\3\2\2"+
		"\2\u0201\u0200\3\2\2\2\u0202K\3\2\2\2\u0203\u0204\5N(\2\u0204\u0205\b"+
		"\'\1\2\u0205\u0206\5L\'\2\u0206\u0207\b\'\1\2\u0207\u020f\3\2\2\2\u0208"+
		"\u0209\5P)\2\u0209\u020a\b\'\1\2\u020a\u020b\5L\'\2\u020b\u020c\b\'\1"+
		"\2\u020c\u020f\3\2\2\2\u020d\u020f\b\'\1\2\u020e\u0203\3\2\2\2\u020e\u0208"+
		"\3\2\2\2\u020e\u020d\3\2\2\2\u020fM\3\2\2\2\u0210\u0211\7\27\2\2\u0211"+
		"\u0212\7\66\2\2\u0212\u0213\5(\25\2\u0213\u0214\5,\27\2\u0214\u0215\b"+
		"(\1\2\u0215\u0216\5\4\3\2\u0216\u0217\b(\1\2\u0217\u0218\5\66\34\2\u0218"+
		"\u0219\b(\1\2\u0219\u021a\5\f\7\2\u021a\u021b\7\6\2\2\u021b\u021c\7\27"+
		"\2\2\u021c\u021d\7\66\2\2\u021d\u021e\b(\1\2\u021eO\3\2\2\2\u021f\u0220"+
		"\7\33\2\2\u0220\u0221\7\66\2\2\u0221\u0222\7\25\2\2\u0222\u0223\b)\1\2"+
		"\u0223\u0224\5*\26\2\u0224\u0225\7\26\2\2\u0225\u0226\5\34\17\2\u0226"+
		"\u0227\7\b\2\2\u0227\u0228\7\66\2\2\u0228\u0229\7\5\2\2\u0229\u022a\5"+
		"\62\32\2\u022a\u022b\b)\1\2\u022b\u022c\5\4\3\2\u022c\u022d\b)\1\2\u022d"+
		"\u022e\5\66\34\2\u022e\u022f\b)\1\2\u022f\u0230\5\f\7\2\u0230\u0231\7"+
		"\66\2\2\u0231\u0232\7\20\2\2\u0232\u0233\5<\37\2\u0233\u0234\7\5\2\2\u0234"+
		"\u0235\b)\1\2\u0235\u0236\7\6\2\2\u0236\u0237\7\33\2\2\u0237\u0238\7\66"+
		"\2\2\u0238\u0239\b)\1\2\u0239Q\3\2\2\2\u023a\u023b\b*\1\2\u023b\u023c"+
		"\5V,\2\u023c\u023d\b*\1\2\u023d\u0245\3\2\2\2\u023e\u023f\f\4\2\2\u023f"+
		"\u0240\5T+\2\u0240\u0241\5R*\5\u0241\u0242\b*\1\2\u0242\u0244\3\2\2\2"+
		"\u0243\u023e\3\2\2\2\u0244\u0247\3\2\2\2\u0245\u0243\3\2\2\2\u0245\u0246"+
		"\3\2\2\2\u0246S\3\2\2\2\u0247\u0245\3\2\2\2\u0248\u0249\7#\2\2\u0249\u0251"+
		"\b+\1\2\u024a\u024b\7\"\2\2\u024b\u0251\b+\1\2\u024c\u024d\7$\2\2\u024d"+
		"\u0251\b+\1\2\u024e\u024f\7%\2\2\u024f\u0251\b+\1\2\u0250\u0248\3\2\2"+
		"\2\u0250\u024a\3\2\2\2\u0250\u024c\3\2\2\2\u0250\u024e\3\2\2\2\u0251U"+
		"\3\2\2\2\u0252\u0253\5<\37\2\u0253\u0254\5X-\2\u0254\u0255\5<\37\2\u0255"+
		"\u0256\b,\1\2\u0256\u0265\3\2\2\2\u0257\u0258\7\25\2\2\u0258\u0259\5R"+
		"*\2\u0259\u025a\7\26\2\2\u025a\u025b\b,\1\2\u025b\u0265\3\2\2\2\u025c"+
		"\u025d\7\65\2\2\u025d\u025e\5V,\2\u025e\u025f\b,\1\2\u025f\u0265\3\2\2"+
		"\2\u0260\u0261\7\63\2\2\u0261\u0265\b,\1\2\u0262\u0263\7\64\2\2\u0263"+
		"\u0265\b,\1\2\u0264\u0252\3\2\2\2\u0264\u0257\3\2\2\2\u0264\u025c\3\2"+
		"\2\2\u0264\u0260\3\2\2\2\u0264\u0262\3\2\2\2\u0265W\3\2\2\2\u0266\u0267"+
		"\7\n\2\2\u0267\u0273\b-\1\2\u0268\u0269\7\13\2\2\u0269\u0273\b-\1\2\u026a"+
		"\u026b\7\f\2\2\u026b\u0273\b-\1\2\u026c\u026d\7\r\2\2\u026d\u0273\b-\1"+
		"\2\u026e\u026f\7\16\2\2\u026f\u0273\b-\1\2\u0270\u0271\7\17\2\2\u0271"+
		"\u0273\b-\1\2\u0272\u0266\3\2\2\2\u0272\u0268\3\2\2\2\u0272\u026a\3\2"+
		"\2\2\u0272\u026c\3\2\2\2\u0272\u026e\3\2\2\2\u0272\u0270\3\2\2\2\u0273"+
		"Y\3\2\2\2\u0274\u0275\7\67\2\2\u0275\u0279\b.\1\2\u0276\u0277\7\66\2\2"+
		"\u0277\u0279\b.\1\2\u0278\u0274\3\2\2\2\u0278\u0276\3\2\2\2\u0279[\3\2"+
		"\2\2\u027a\u027b\7.\2\2\u027b\u027c\5^\60\2\u027c\u027d\b/\1\2\u027d\u0280"+
		"\3\2\2\2\u027e\u0280\b/\1\2\u027f\u027a\3\2\2\2\u027f\u027e\3\2\2\2\u0280"+
		"]\3\2\2\2\u0281\u0282\7\25\2\2\u0282\u0283\5`\61\2\u0283\u0284\7\26\2"+
		"\2\u0284\u0285\b\60\1\2\u0285\u0286\5\f\7\2\u0286\u0287\b\60\1\2\u0287"+
		"\u0288\5\\/\2\u0288\u0289\b\60\1\2\u0289\u0290\3\2\2\2\u028a\u028b\7/"+
		"\2\2\u028b\u028c\b\60\1\2\u028c\u028d\5\f\7\2\u028d\u028e\b\60\1\2\u028e"+
		"\u0290\3\2\2\2\u028f\u0281\3\2\2\2\u028f\u028a\3\2\2\2\u0290_\3\2\2\2"+
		"\u0291\u0292\5\26\f\2\u0292\u0293\b\61\1\2\u0293\u0294\5b\62\2\u0294\u0295"+
		"\b\61\1\2\u0295\u029b\3\2\2\2\u0296\u0297\7\7\2\2\u0297\u0298\5\26\f\2"+
		"\u0298\u0299\b\61\1\2\u0299\u029b\3\2\2\2\u029a\u0291\3\2\2\2\u029a\u0296"+
		"\3\2\2\2\u029ba\3\2\2\2\u029c\u029d\b\62\1\2\u029d\u029e\5d\63\2\u029e"+
		"\u029f\b\62\1\2\u029f\u02a7\3\2\2\2\u02a0\u02a1\7\7\2\2\u02a1\u02a2\5"+
		"\26\f\2\u02a2\u02a3\b\62\1\2\u02a3\u02a7\3\2\2\2\u02a4\u02a5\7\7\2\2\u02a5"+
		"\u02a7\b\62\1\2\u02a6\u029c\3\2\2\2\u02a6\u02a0\3\2\2\2\u02a6\u02a4\3"+
		"\2\2\2\u02a7c\3\2\2\2\u02a8\u02a9\7\21\2\2\u02a9\u02aa\5\26\f\2\u02aa"+
		"\u02ab\b\63\1\2\u02ab\u02ac\5d\63\2\u02ac\u02ad\b\63\1\2\u02ad\u02b0\3"+
		"\2\2\2\u02ae\u02b0\b\63\1\2\u02af\u02a8\3\2\2\2\u02af\u02ae\3\2\2\2\u02b0"+
		"e\3\2\2\2)\177\u0089\u0095\u00a2\u00aa\u00b4\u00c7\u00d2\u00e0\u00ef\u00f9"+
		"\u0100\u010d\u0114\u0126\u0130\u013f\u0147\u0169\u018a\u01a1\u01b8\u01c5"+
		"\u01d3\u01e1\u01ea\u01f3\u0201\u020e\u0245\u0250\u0264\u0272\u0278\u027f"+
		"\u028f\u029a\u02a6\u02af";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}