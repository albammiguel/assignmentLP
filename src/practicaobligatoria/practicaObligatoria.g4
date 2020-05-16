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
}



//ANALISIS SINTACTICO
//PRINCIPIO - ESTRUCTURA PROGRAMA
prg : TOKEN_PROGRAM IDENT TOKEN_PUNTOCOMA 
{ArrayList<ConstanteClass> lista_final = new ArrayList <ConstanteClass>();}
dcllist[lista_final] 
{DefinesClass defines = new DefinesClass($dcllist.lista_final_constantes);
lenguajeFinal.setDefines(defines);}
cabecera sent sentlist
TOKEN_END TOKEN_PROGRAM IDENT subproglist <EOF>;

dcllist[ArrayList<ConstanteClass> l_constantes] returns 
[ArrayList<ConstanteClass> lista_final_constantes]:
dcl dcllist[$dcl.l_constantes] 
{$lista_final_constantes = $dcllist.lista_final_constantes;}
|     {$lista_final_constantes = $l_constantes;}
;


cabecera returns [ArrayList<FuncionClass> lv] : 
TOKEN_INTERFACE {ArrayList<FuncionClas> l = new ArrayList <FuncionClass>();} 
cablist[l] TOKEN_END TOKEN_INTERFACE {$lv = $cablist.lv;}
|       {$lv = new ArrayList <FuncionClass>();}
;

cablist[ArrayList<FuncionClass> lh] returns [ArrayList<FuncionClass> lv] : 
decproc {$lh.add($decproc.p);} decsubprog[$lh] {$lv = $decsubprog.lv;} 
| decfun {$lh.add($decfun.f);} decsubprog[$lh] {$lv = $decsubprog.lv;} 
;

decsubprog[ArrayList<FuncionClass> lh] returns [ArrayList<FuncionClass> lv]: 
decproc {$lh.add($decproc.p);} decsubprog[$lh] {$lv = $decsubprog.lv;}
|  decfun {$lh.add($decfun.f);} decsubprog[$lh] {$lv = $decsubprog.lv;} 
| {$lv = $lh;}
;

sentlist : sent sentlist 
| 
;

//PRIMERA ZONA DE DECLARACIONES
dcl returns[ArrayList<ConstanteClass> l_constantes]: 
{ArrayList<ConstanteClass> l = new ArrayList <ConstanteClass>();} 
defcte[l] 
{$l_constantes = $defcte.lv;}
| defvar;

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

defvar: tipo TOKEN_DOBLEPUNTO varlist TOKEN_PUNTOCOMA aux2;

aux2: defvar 
|
;

tipo returns [String v, int c]: TOKEN_INTEGER {$v = "int"; $c = 0;}
| TOKEN_REAL {$v = "float"; $c = 0;}
| TOKEN_CHARACTER charlength {$v = "char"; $c = $charlength.c;} 
;

charlength returns [int c]: 
TOKEN_PARENTESIS_IZQ NUM_INT_CONST TOKEN_PARENTESIS_DER 
{$c = Integer.parseInt($NUM_INT_CONST.text);} 
|       {$c = 0;}
;

varlist: IDENT init aux6;

aux6: TOKEN_COMA varlist
|
;

init: TOKEN_IGUAL simpvalue
|
 ;


//SEGUNDA ZONA DECLARACIONES
decproc returns [FuncionClass p] :  TOKEN_SUBROUTINE id1=IDENT formal_paramlist 
dec_s_paramlist[$formal_paramlist.lv] 
TOKEN_END
TOKEN_SUBROUTINE id2=IDENT
{if($id1.text == $id2.text){ 
    $p = new FuncionClass($id1.text, $dec_s_paramlist.lv);
}else{
    //llamar a error
}}
;

formal_paramlist returns [ArrayList<ParametroClass> lv]:  TOKEN_PARENTESIS_IZQ 
{ArrayList<ParametroClass> l = new ArrayList <ParametroClass>();} 
 nomparamlist[l] TOKEN_PARENTESIS_DER {$lv = $nomparamlist.lv;}
| {$lv = null;}
;

nomparamlist[ArrayList<ParametroClass> lh] 
returns [ArrayList<ParametroClass> lv]:
 IDENT 
{ParametroClass p = new ParametroClass($IDENT.text); 
lh.add(p); 
$lv = lh;} 
| IDENT {ParametroClass p = new ParametroClass($IDENT.text); 
$lh.add(p);} TOKEN_COMA nomparamlist[$lh] {$lv = $nomparamlist.lv;}
;

dec_s_paramlist[ArrayList<ParametroClass> lh] 
returns [ArrayList<ParametroClass> lv]: 
tipo TOKEN_COMA TOKEN_INTENT TOKEN_PARENTESIS_IZQ tipoparam 
TOKEN_PARENTESIS_DER IDENT 
{ if (!CompletarParametro($lh, $IDENT.text, $tipo.v, $tipo.c, $tipoparam.v))
    { //llamar notificacion error 
    };} 
TOKEN_PUNTOCOMA dec_s_paramlist[$lh] {$lv = $dec_s_paramlist.lv;} 
|               {$lv = $lh;}
;

tipoparam returns [String v]: TOKEN_IN {$v = $TOKEN_IN.text;}
| TOKEN_OUT {$v = $TOKEN_OUT.text;}
| TOKEN_INOUT {$v = $TOKEN_INOUT.text;}
;

decfun returns [FuncionClass f]: TOKEN_FUNCTION IDENT TOKEN_PARENTESIS_IZQ 
{ArrayList<ParametroClass> l = new ArrayList <ParametroClass>();}  
nomparamlist[l]
TOKEN_PARENTESIS_DER  tipo TOKEN_DOBLEPUNTO id1=IDENT 
TOKEN_PUNTOCOMA dec_f_paramlist[$nomparamlist.lv] TOKEN_END TOKEN_FUNCTION 
id2=IDENT
{if($id1.text == $id2.text){ 
    $f = new FuncionClass($tipo.v, $id1.text, $dec_f_paramlist.lv);
}else{
    //llamar a error
}};

dec_f_paramlist [ArrayList<ParametroClass> lh] 
returns [ArrayList<ParametroClass> lv] : tipo TOKEN_COMA TOKEN_INTENT TOKEN_PARENTESIS_IZQ 
TOKEN_IN TOKEN_PARENTESIS_DER IDENT TOKEN_PUNTOCOMA 
{ if (!CompletarParametro($lh, $IDENT.text, $tipo.v, $tipo.c, $TOKEN_IN.text))
    { //llamar notificacion error 
    };}  aux4[$lh] {$lv = $aux4.lv;};

aux4 [ArrayList<ParametroClass> lh] 
returns [ArrayList<ParametroClass> lv]: 
dec_f_paramlist[$lh]{$lv = dec_f_paramlist}
|       {$lv = $lh;}
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

codproc : TOKEN_SUBROUTINE IDENT formal_paramlist dec_s_paramlist[null] dcllist[null] 
sent sentlist TOKEN_END TOKEN_SUBROUTINE IDENT;

codfun : TOKEN_FUNCTION IDENT TOKEN_PARENTESIS_IZQ 
nomparamlist[null] TOKEN_PARENTESIS_DER  tipo TOKEN_DOBLEPUNTO IDENT TOKEN_PUNTOCOMA
dec_f_paramlist[null] dcllist[null] sent sentlist IDENT TOKEN_IGUAL exp TOKEN_PUNTOCOMA
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