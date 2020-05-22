grammar practicaObligatoria;

@header{
    package practicaobligatoria;
    import java.util.*;
}

@lexer::members{
    private ListaTokensDetectadosClass listaTokens;
    private TokenDetectadoClass token_actual;
    
    //Recibir como parámetro los objetos.
    public practicaObligatoriaLexer(CharStream ficheroFuente, 
     ListaTokensDetectadosClass lista){
        this(ficheroFuente);
        listaTokens= lista;
    }
}

@parser::members{
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
}



//ANALISIS SINTACTICO
//PRINCIPIO - ESTRUCTURA PROGRAMA
prg : TOKEN_PROGRAM IDENT TOKEN_PUNTOCOMA 
{ArrayList<ConstanteClass> lista_constantes = new ArrayList <ConstanteClass>();
ArrayList<DeclaracionClass> lista_declaraciones = new ArrayList<DeclaracionClass>();
ArrayList<SentenciaClass> sentencias_programa = new ArrayList<SentenciaClass>();}
dcllist[lista_constantes, lista_declaraciones] 
{DefinesClass defines = new DefinesClass($dcllist.lv_constantes);
lenguajeFinal.setDefines(defines);
$dcllist.lv_declaraciones.forEach((d)->{
    sentencias_programa.add(d);});
}
cabecera 
{DecFunsClass decfuns = new DecFunsClass($cabecera.lv_funciones);
lenguajeFinal.setDecfuns(decfuns);}
 sent sentlist
{if(sentencias_programa.isEmpty()){System.out.println("ta vacio");}
else{sentencias_programa.forEach((s)->{System.out.println(s.getTipoSentencia());});}
lenguajeFinal.setSentenciasMain(sentencias_programa);}
TOKEN_END TOKEN_PROGRAM IDENT subproglist <EOF>;

dcllist[ArrayList<ConstanteClass> l_constantes, 
ArrayList<DeclaracionClass> l_declaraciones] 
returns [ArrayList<ConstanteClass> lv_constantes, 
ArrayList<DeclaracionClass> lv_declaraciones]:
dcl dcllist[$dcl.l_constantes, $dcl.l_declaraciones] 
{$lv_constantes = $dcllist.lv_constantes;
$lv_declaraciones = $dcllist.lv_declaraciones;}
|     {$lv_constantes = $l_constantes; $lv_declaraciones = $l_declaraciones;}
;


cabecera returns [ArrayList<FuncionClass> lv_funciones]: 
{ArrayList<FuncionClass> l = new ArrayList<FuncionClass>();}
TOKEN_INTERFACE
cablist[l] TOKEN_END TOKEN_INTERFACE {$lv_funciones = $cablist.lv_funciones;}
|               {ArrayList<FuncionClass> l = new ArrayList<FuncionClass>();
                $lv_funciones = l;}
;

cablist[ArrayList<FuncionClass> lh_funciones] 
returns [ArrayList<FuncionClass> lv_funciones]: 
decproc
{$lh_funciones.add($decproc.p);}   
decsubprog[$lh_funciones] {$lv_funciones = $decsubprog.lv_funciones;}
| decfun
{$lh_funciones.add($decfun.f);}  
decsubprog[$lh_funciones] {$lv_funciones = $decsubprog.lv_funciones;}
;

decsubprog[ArrayList<FuncionClass> lh_funciones] 
returns [ArrayList<FuncionClass> lv_funciones]:
decproc
{$lh_funciones.add($decproc.p);} 
decsubprog[$lh_funciones] {$lv_funciones = $decsubprog.lv_funciones;}
|decfun
{$lh_funciones.add($decfun.f);} 
decsubprog[$lh_funciones] {$lv_funciones = $decsubprog.lv_funciones;}
|                         {$lv_funciones = $lh_funciones;}
;

sentlist : sent sentlist 
| 
;

//PRIMERA ZONA DE DECLARACIONES
dcl returns[ArrayList<ConstanteClass> l_constantes, ArrayList<DeclaracionClass> l_declaraciones]: 
{ArrayList<ConstanteClass> l = new ArrayList <ConstanteClass>();} 
defcte[l] 
{$l_constantes = $defcte.lv; 
$l_declaraciones = new ArrayList<DeclaracionClass>();}
|{ArrayList<DeclaracionClass> l = new ArrayList <DeclaracionClass>();} 
 defvar[l]
{$l_declaraciones = $defvar.lv_declaraciones;
$l_constantes = new ArrayList<ConstanteClass>();}
;

defcte[ArrayList<ConstanteClass> lh] returns [ArrayList<ConstanteClass> lv]: 
tipo TOKEN_COMA TOKEN_PARAMETER TOKEN_DOBLEPUNTO IDENT TOKEN_IGUAL simpvalue 
{ConstanteClass c = new ConstanteClass($IDENT.text, $simpvalue.v); $lh.add(c);}
ctelist[$lh] TOKEN_PUNTOCOMA aux1[$ctelist.lv] {$lv = $aux1.lv;};

aux1[ArrayList<ConstanteClass> lh] returns [ArrayList<ConstanteClass> lv]: 
defcte[$lh] {$lv = $defcte.lv;}
| {$lv = $lh;}
;

ctelist[ArrayList<ConstanteClass> lh] returns [ArrayList<ConstanteClass> lv]: 
TOKEN_COMA IDENT TOKEN_IGUAL simpvalue 
{ConstanteClass c = new ConstanteClass($IDENT.text, $simpvalue.v); $lh.add(c);} 
ctelist[$lh] {$lv = $ctelist.lv;}
| {$lv = $lh;}
;

simpvalue returns [String v]: NUM_INT_CONST {$v = $NUM_INT_CONST.text;} 
| NUM_REAL_CONST {$v = $NUM_REAL_CONST.text;} 
| STRING_CONST {$v = $STRING_CONST.text;} 
| NUM_INT_CONST_B {$v = $NUM_INT_CONST_B.text;} 
| NUM_INT_CONST_O {$v = $NUM_INT_CONST_O.text;} 
| NUM_INT_CONST_H {$v = $NUM_INT_CONST_H.text;} 
;

defvar[ArrayList<DeclaracionClass> lh_declaraciones] 
returns [ArrayList<DeclaracionClass> lv_declaraciones]: 
tipo TOKEN_DOBLEPUNTO 
{ArrayList<VariableClass> l = new ArrayList<VariableClass>();} 
varlist[l] 
{$varlist.lv_variables = AsignarTipo($varlist.lv_variables, $tipo.v, $tipo.c);
DeclaracionClass d = new DeclaracionClass("declaracion", $tipo.v, $varlist.lv_variables);
$lh_declaraciones.add(d);}
TOKEN_PUNTOCOMA aux2[$lh_declaraciones] 
{$lv_declaraciones = $aux2.lv_declaraciones;}
;

aux2[ArrayList<DeclaracionClass> lh_declaraciones] 
returns [ArrayList<DeclaracionClass> lv_declaraciones]: 
defvar[$lh_declaraciones] {$lv_declaraciones = $defvar.lv_declaraciones;}
|           {$lv_declaraciones = $lh_declaraciones;}
;

tipo returns [String v, int c]: TOKEN_INTEGER {$v = "int"; $c=0;}
| TOKEN_REAL {$v = "float"; $c=0;}
| TOKEN_CHARACTER charlength {$v = "char"; $c = $charlength.c;}
;

charlength returns [int c]: 
TOKEN_PARENTESIS_IZQ NUM_INT_CONST TOKEN_PARENTESIS_DER 
{$c = Integer.parseInt($NUM_INT_CONST.text);}
|       {$c=0;}
;

varlist[ArrayList<VariableClass> lh_variables] 
returns [ArrayList<VariableClass> lv_variables]: 
IDENT init 
{VariableClass v = new VariableClass($IDENT.text, $init.v); 
$lh_variables.add(v);}
 aux6[$lh_variables] {$lv_variables = $aux6.lv_variables;}
;

aux6[ArrayList<VariableClass> lh_variables] 
returns [ArrayList<VariableClass> lv_variables]: 
TOKEN_COMA varlist[$lh_variables] {$lv_variables = $varlist.lv_variables;}
|                 {$lv_variables = $lh_variables;}
;

init returns [String v]: TOKEN_IGUAL simpvalue {$v = $simpvalue.v;}
|   {$v = null;}
 ;


//SEGUNDA ZONA DECLARACIONES
decproc returns [FuncionClass p]:  TOKEN_SUBROUTINE id1=IDENT formal_paramlist 
dec_s_paramlist[$formal_paramlist.lv_parametros]
TOKEN_END TOKEN_SUBROUTINE id2=IDENT 
{FuncionClass procedimiento = new FuncionClass();
 if($id1.text.equals($id2.text)){
    procedimiento.setNombre($id1.text);
    procedimiento.setListaParametros($dec_s_paramlist.lv_parametros);
 }else{
    //llamamos a error semántico, no cumple primera  regla
 }
$p = procedimiento;}
;

formal_paramlist returns [ArrayList<ParametroClass> lv_parametros]:
 TOKEN_PARENTESIS_IZQ 
{ArrayList<ParametroClass> l = new ArrayList<ParametroClass>();}
 nomparamlist[l] TOKEN_PARENTESIS_DER 
{$lv_parametros = $nomparamlist.lv_parametros;}
|         {$lv_parametros = new ArrayList<ParametroClass>();}
;

nomparamlist[ArrayList<ParametroClass> lh_parametros] returns 
[ArrayList<ParametroClass> lv_parametros]:
 IDENT
{   ParametroClass p = new ParametroClass($IDENT.text);
    $lh_parametros.add(p);
    $lv_parametros = $lh_parametros;}
| IDENT 
{   ParametroClass p = new ParametroClass($IDENT.text);
    $lh_parametros.add(p);} 
TOKEN_COMA nomparamlist[$lh_parametros] 
{$lv_parametros = $nomparamlist.lv_parametros;}
;

dec_s_paramlist[ArrayList<ParametroClass> lh_parametros]
returns [ArrayList<ParametroClass> lv_parametros]:
tipo TOKEN_COMA TOKEN_INTENT TOKEN_PARENTESIS_IZQ tipoparam 
TOKEN_PARENTESIS_DER IDENT  
TOKEN_PUNTOCOMA
{$lh_parametros = 
CompletarParametro($lh_parametros, $IDENT.text, $tipo.v, $tipo.c, $tipoparam.v);} 
dec_s_paramlist[$lh_parametros] {$lv_parametros = $dec_s_paramlist.lv_parametros;}
|             {$lv_parametros = $lh_parametros;}
;

tipoparam returns [String v]: TOKEN_IN {$v = $TOKEN_IN.text;}
| TOKEN_OUT {$v = $TOKEN_OUT.text;}
| TOKEN_INOUT {$v = $TOKEN_INOUT.text;}
;

decfun returns [FuncionClass f]: TOKEN_FUNCTION id1=IDENT TOKEN_PARENTESIS_IZQ
{ArrayList<ParametroClass> l = new ArrayList<ParametroClass>();}  
nomparamlist[l] TOKEN_PARENTESIS_DER  tipo TOKEN_DOBLEPUNTO id2=IDENT 
TOKEN_PUNTOCOMA dec_f_paramlist[$nomparamlist.lv_parametros] TOKEN_END TOKEN_FUNCTION 
id3=IDENT
{FuncionClass funcion = new FuncionClass();
if(($id1.text.equals($id2.text))&&($id1.text.equals($id3.text))&&($id2.text.equals($id3.text))){
        funcion.setTipoDevuelto($tipo.v);
        funcion.setNombre($id1.text);
        funcion.setListaParametros($dec_f_paramlist.lv_parametros);
    }else{
        //llamamos a error semántico, no cumple primera y/o tercera regla
    }
 $f = funcion;
}
;

dec_f_paramlist[ArrayList<ParametroClass> lh_parametros] 
returns [ArrayList<ParametroClass> lv_parametros]: 
tipo TOKEN_COMA TOKEN_INTENT TOKEN_PARENTESIS_IZQ 
TOKEN_IN TOKEN_PARENTESIS_DER IDENT TOKEN_PUNTOCOMA 
{$lh_parametros = 
CompletarParametro($lh_parametros, $IDENT.text, $tipo.v, $tipo.c, $TOKEN_IN.text);} 
aux4[$lh_parametros] {$lv_parametros = $aux4.lv_parametros;};

aux4[ArrayList<ParametroClass> lh_parametros] 
returns [ArrayList<ParametroClass> lv_parametros]:
dec_f_paramlist[$lh_parametros] {$lv_parametros = $dec_f_paramlist.lv_parametros;}
|      {$lv_parametros = $lh_parametros;}
;

//ZONA DE SENTENCIAS DEL PROGRAMA PRINCIPAL

sent: IDENT TOKEN_IGUAL exp TOKEN_PUNTOCOMA
| proc_call TOKEN_PUNTOCOMA
| TOKEN_IF TOKEN_PARENTESIS_IZQ expcond aux7
| TOKEN_DO aux8
| TOKEN_SELECT TOKEN_CASE TOKEN_PARENTESIS_IZQ exp TOKEN_PARENTESIS_DER casos TOKEN_END TOKEN_SELECT;

aux7: TOKEN_PARENTESIS_DER sent
| TOKEN_PARENTESIS_DER TOKEN_THEN sentlist TOKEN_ENDIF
| TOKEN_PARENTESIS_DER TOKEN_THEN sentlist TOKEN_ELSE sentlist TOKEN_ENDIF;

aux8: TOKEN_WHILE TOKEN_PARENTESIS_IZQ expcond TOKEN_PARENTESIS_DER sentlist TOKEN_ENDDO
| IDENT TOKEN_IGUAL doval TOKEN_COMA doval TOKEN_COMA doval sentlist TOKEN_ENDDO;



exp: exp op exp 
| factor;

op: oparit;

oparit: TOKEN_MAS
| TOKEN_MENOS
| TOKEN_MULTIPLICACION
| TOKEN_DIVISION;

factor: simpvalue
| TOKEN_PARENTESIS_IZQ exp TOKEN_PARENTESIS_DER
| IDENT aux5;

aux5: TOKEN_PARENTESIS_IZQ exp explist TOKEN_PARENTESIS_DER 
|
;

explist: TOKEN_COMA exp explist
|
;

proc_call: TOKEN_CALL IDENT subpparamlist;

subpparamlist: TOKEN_PARENTESIS_IZQ exp explist TOKEN_PARENTESIS_DER
|
;

//ZONA IMPLEMENTACION
subproglist : codproc subproglist 
| codfun subproglist 
|
;

codproc : TOKEN_SUBROUTINE IDENT formal_paramlist 
dec_s_paramlist[$formal_paramlist.lv_parametros] 
dcllist[null, null] 
sent sentlist TOKEN_END TOKEN_SUBROUTINE IDENT;

codfun : TOKEN_FUNCTION IDENT TOKEN_PARENTESIS_IZQ
{ArrayList<ParametroClass> l = new ArrayList<ParametroClass>();}   
nomparamlist[l] TOKEN_PARENTESIS_DER  tipo TOKEN_DOBLEPUNTO IDENT TOKEN_PUNTOCOMA
dec_f_paramlist[$nomparamlist.lv_parametros] 
dcllist[null, null] sent sentlist IDENT TOKEN_IGUAL exp TOKEN_PUNTOCOMA
TOKEN_END TOKEN_FUNCTION IDENT;

//SECUENCIAS DE CONTROL DE FLUJO

expcond: expcond oplog expcond
| factorcond;

oplog: TOKEN_OP_LOG;

factorcond: exp opcomp exp
| TOKEN_PARENTESIS_IZQ expcond TOKEN_PARENTESIS_DER
| TOKEN_NOT factorcond
| LOGIC_CONST;

opcomp: TOKEN_MENORQUE
| TOKEN_MAYORQUE
| TOKEN_MENOROIGUAL
| TOKEN_MAYOROIGUAL
| TOKEN_IGUALIGUAL
| TOKEN_DISTINTO;

doval: NUM_INT_CONST
| IDENT;

casos: TOKEN_CASE aux9
|
;

aux9: TOKEN_PARENTESIS_IZQ etiquetas TOKEN_PARENTESIS_DER sentlist casos
| TOKEN_DEFAULT sentlist;

etiquetas: simpvalue aux10
| TOKEN_DOBLEPUNTO_SIMPLE simpvalue;

aux10: listaetiqetas
| TOKEN_DOBLEPUNTO_SIMPLE simpvalue
| TOKEN_DOBLEPUNTO_SIMPLE;

listaetiqetas: TOKEN_COMA simpvalue
| 
;




//ANALISIS LEXICO
TOKEN_PROGRAM: 'PROGRAM'{
    token_actual = new TokenDetectadoClass(true, getText(), "TOKEN_PROGRAM");
    listaTokens.añadirToken(token_actual);};
TOKEN_INTERFACE: 'INTERFACE'{
    token_actual = new TokenDetectadoClass(true, getText(), "TOKEN_INTERFACE");
    listaTokens.añadirToken(token_actual);};
TOKEN_PUNTOCOMA: ';'{
    token_actual = new TokenDetectadoClass(true, getText(), "TOKEN_PUNTOCOMA");
    listaTokens.añadirToken(token_actual);};
TOKEN_END: 'END'{
    token_actual = new TokenDetectadoClass(true, getText(), "TOKEN_END");
    listaTokens.añadirToken(token_actual);};
TOKEN_DOBLEPUNTO_SIMPLE: ':'{
    token_actual = new TokenDetectadoClass(true, getText(), "TOKEN_DOBLEPUNTO_SIMPLE");
    listaTokens.añadirToken(token_actual);};
TOKEN_DOBLEPUNTO: '::'{
    token_actual = new TokenDetectadoClass(true, getText(), "TOKEN_DOBLEPUNTO");
    listaTokens.añadirToken(token_actual);};
TOKEN_PARAMETER: 'PARAMETER'{
    token_actual = new TokenDetectadoClass(true, getText(), "TOKEN_PARAMETER");
    listaTokens.añadirToken(token_actual);};
TOKEN_MENORQUE: '<'{
    token_actual = new TokenDetectadoClass(true, getText(), "TOKEN_MENORQUE");
    listaTokens.añadirToken(token_actual);};
TOKEN_MAYORQUE: '>'{
    token_actual = new TokenDetectadoClass(true, getText(), "TOKEN_MAYORQUE");
    listaTokens.añadirToken(token_actual);};
TOKEN_MENOROIGUAL: '<='{
    token_actual = new TokenDetectadoClass(true, getText(), "TOKEN_MENOROIGUAL");
    listaTokens.añadirToken(token_actual);};
TOKEN_MAYOROIGUAL: '>='{
    token_actual = new TokenDetectadoClass(true, getText(), "TOKEN_MAYOROIGUAL");
    listaTokens.añadirToken(token_actual);};
TOKEN_IGUALIGUAL: '=='{
    token_actual = new TokenDetectadoClass(true, getText(), "TOKEN_IGUALIGUAL");
    listaTokens.añadirToken(token_actual);};
TOKEN_DISTINTO: '/='{
    token_actual = new TokenDetectadoClass(true, getText(), "TOKEN_DISTINTO");
    listaTokens.añadirToken(token_actual);};
TOKEN_IGUAL: '='{
    token_actual = new TokenDetectadoClass(true, getText(), "TOKEN_IGUAL");
    listaTokens.añadirToken(token_actual);};
TOKEN_COMA: ','{
    token_actual = new TokenDetectadoClass(true, getText(), "TOKEN_COMA");
    listaTokens.añadirToken(token_actual);};
TOKEN_INTEGER: 'INTEGER'{
    token_actual = new TokenDetectadoClass(true, getText(), "TOKEN_INTEGER");
    listaTokens.añadirToken(token_actual);};
TOKEN_REAL: 'REAL'{
    token_actual = new TokenDetectadoClass(true, getText(), "TOKEN_REAL");
    listaTokens.añadirToken(token_actual);};
TOKEN_CHARACTER: 'CHARACTER'{
    token_actual = new TokenDetectadoClass(true, getText(), "TOKEN_CHARACTER");
    listaTokens.añadirToken(token_actual);};
TOKEN_PARENTESIS_IZQ: '('{
    token_actual = new TokenDetectadoClass(true, getText(), "TOKEN_PARENTESIS_IZQ");
    listaTokens.añadirToken(token_actual);};
TOKEN_PARENTESIS_DER: ')'{
    token_actual = new TokenDetectadoClass(true, getText(), "TOKEN_PARENTESIS_DER");
    listaTokens.añadirToken(token_actual);};
TOKEN_SUBROUTINE: 'SUBROUTINE'{
    token_actual = new TokenDetectadoClass(true, getText(), "TOKEN_SUBROUTINE");
    listaTokens.añadirToken(token_actual);};
TOKEN_IN: 'IN'{
    token_actual = new TokenDetectadoClass(true, getText(), "TOKEN_IN");
    listaTokens.añadirToken(token_actual);};
TOKEN_OUT: 'OUT'{
    token_actual = new TokenDetectadoClass(true, getText(), "TOKEN_OUT");
    listaTokens.añadirToken(token_actual);};
TOKEN_INOUT: 'INOUT'{
    token_actual = new TokenDetectadoClass(true, getText(), "TOKEN_INOUT");
    listaTokens.añadirToken(token_actual);};
TOKEN_FUNCTION: 'FUNCTION'{
    token_actual = new TokenDetectadoClass(true, getText(), "TOKEN_FUNCTION");
    listaTokens.añadirToken(token_actual);};
TOKEN_INTENT: 'INTENT'{
    token_actual = new TokenDetectadoClass(true, getText(), "TOKEN_INTENT");
    listaTokens.añadirToken(token_actual);};
TOKEN_MAS: '+'{
    token_actual = new TokenDetectadoClass(true, getText(), "TOKEN_MAS");
    listaTokens.añadirToken(token_actual);};
TOKEN_MENOS: '-'{
    token_actual = new TokenDetectadoClass(true, getText(),  "TOKEN_MENOS");
    listaTokens.añadirToken(token_actual);};
TOKEN_MULTIPLICACION: '*'{
    token_actual = new TokenDetectadoClass(true, getText(), "TOKEN_MULTIPLICACION");
    listaTokens.añadirToken(token_actual);};
TOKEN_DIVISION:'/'{
    token_actual = new TokenDetectadoClass(true, getText(), "TOKEN_DIVISION");
    listaTokens.añadirToken(token_actual);};
TOKEN_CALL: 'CALL'{
    token_actual = new TokenDetectadoClass(true, getText(), "TOKEN_CALL");
    listaTokens.añadirToken(token_actual);};
TOKEN_OP_LOG: ('.AND.' | '.OR.' | '.EQV.' | '.NEQV.'){
    token_actual = new TokenDetectadoClass(true, getText(), "TOKEN_OP_LOG");
    listaTokens.añadirToken(token_actual);};
TOKEN_IF: 'IF'{
    token_actual = new TokenDetectadoClass(true, getText(), "TOKEN_IF");
    listaTokens.añadirToken(token_actual);};
TOKEN_THEN: 'THEN'{
    token_actual = new TokenDetectadoClass(true, getText(), "TOKEN_THEN");
    listaTokens.añadirToken(token_actual);};
TOKEN_ELSE: 'ELSE'{
    token_actual = new TokenDetectadoClass(true, getText(), "TOKEN_ELSE");
    listaTokens.añadirToken(token_actual);};
TOKEN_ENDIF: 'ENDIF'{
    token_actual = new TokenDetectadoClass(true, getText(), "TOKEN_ENDIF");
    listaTokens.añadirToken(token_actual);};
TOKEN_DO: 'DO'{
    token_actual = new TokenDetectadoClass(true, getText(), "TOKEN_DO");
    listaTokens.añadirToken(token_actual);};
TOKEN_WHILE:'WHILE'{
    token_actual = new TokenDetectadoClass(true, getText(), "TOKEN_WHILE");
    listaTokens.añadirToken(token_actual);};
TOKEN_ENDDO: 'ENDDO'{
    token_actual = new TokenDetectadoClass(true, getText(), "TOKEN_ENDDO");
    listaTokens.añadirToken(token_actual);};
TOKEN_SELECT: 'SELECT'{
    token_actual = new TokenDetectadoClass(true, getText(), "TOKEN_SELECT");
    listaTokens.añadirToken(token_actual);};
TOKEN_CASE: 'CASE'{
    token_actual = new TokenDetectadoClass(true, getText(), "TOKEN_CASE");
    listaTokens.añadirToken(token_actual);};
TOKEN_DEFAULT: 'DEFAULT'{
    token_actual = new TokenDetectadoClass(true, getText(), "TOKEN_DEFAULT");
    listaTokens.añadirToken(token_actual);};
NUM_INT_CONST_B: 'b' '\'' [0-1]+ '\''{
    token_actual = new TokenDetectadoClass(true, getText(), "NUM_INT_CONST_B");
    listaTokens.añadirToken(token_actual);};
NUM_INT_CONST_O: 'o' '\'' [0-7]+ '\''{
    token_actual = new TokenDetectadoClass(true, getText(), "NUM_INT_CONST_O");
    listaTokens.añadirToken(token_actual);};
NUM_INT_CONST_H: 'h' '\'' [0-9A-F]+ '\''{
    token_actual = new TokenDetectadoClass(true, getText(), "NUM_INT_CONST_H");
    listaTokens.añadirToken(token_actual);};
LOGIC_CONST: ('.TRUE.' | '.FALSE.'){
    token_actual = new TokenDetectadoClass(true, getText(), "LOGIC_CONST");
    listaTokens.añadirToken(token_actual);};
TOKEN_NOT: '.NOT.'{
    token_actual = new TokenDetectadoClass(true, getText(), "TOKEN_NOT");
    listaTokens.añadirToken(token_actual);};
IDENT:[a-zA-Z][a-zA-Z0-9_]*{ 
    token_actual = new TokenDetectadoClass(true, getText(), "IDENT");
    listaTokens.añadirToken(token_actual);}; 
NUM_INT_CONST: '-'? DIGIT+ {   
    token_actual = new TokenDetectadoClass(true, getText(), "NUM_INT_CONST");
    listaTokens.añadirToken(token_actual);};
NUM_REAL_CONST: (PUNTO_FIJO | EXPONENCIAL | MIXTO) {   
    token_actual = new TokenDetectadoClass(true, getText(), "NUM_REAL_CONST");
    listaTokens.añadirToken(token_actual);};
STRING_CONST: (STRING_CONST1 | STRING_CONST2){
    token_actual = new TokenDetectadoClass(true, getText(), "STRING_CONST");
    listaTokens.añadirToken(token_actual);};

COMENTARIOS: '!' .*? '\r'? '\n' -> skip;
WS: [\t\n\r ] -> skip;


fragment 
DIGIT: [0-9];
fragment
PUNTO_FIJO: '-'? DIGIT+ '.' DIGIT+;
fragment
EXPONENCIAL: '-'? DIGIT+ ('e' | 'E') '-'? DIGIT+;
fragment
MIXTO: PUNTO_FIJO ('e' | 'E') '-'? DIGIT+;
fragment
SIN_COMILLAS_DOBLES: ~('"')+;
fragment
SIN_COMILLAS_SIMPLES: ~('\'')+;
fragment
STRING_CONST1: '"' ( '""' | SIN_COMILLAS_DOBLES)* '"';
fragment
STRING_CONST2: '\'' ('\'\''| SIN_COMILLAS_SIMPLES)* '\'';