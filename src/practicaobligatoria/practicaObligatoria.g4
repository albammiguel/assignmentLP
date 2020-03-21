grammar practicaObligatoria;

@header{
    package practicaobligatoria;
    import java.util.*;
}

@lexer::members{

    private ListaTokensDetectados listaTokens;
    private TokenDetectado token_actual;
    
    //Recibir como parámetro los objetos.
    public practicaObligatoriaLexer(CharStream ficheroFuente, 
     ListaTokensDetectados lista){
        this(ficheroFuente);
        listaTokens= lista;
    }
}



//ANALISIS SINTACTICO
//PRINCIPIO - ESTRUCTURA PROGRAMA
prg : TOKEN_PROGRAM IDENT TOKEN_PUNTOCOMA dcllist cabecera sent sentlist
TOKEN_END TOKEN_PROGRAM IDENT subproglist <EOF>;

dcllist: dcl dcllist
|
;

cabecera : TOKEN_INTERFACE cablist TOKEN_END TOKEN_INTERFACE 
| 
;

cablist : decproc decsubprog 
| decfun decsubprog 
;

decsubprog : decproc decsubprog 
| decfun decsubprog 
| 
;

sentlist : sent sentlist 
| 
;

//PRIMERA ZONA DE DECLARACIONES
dcl: defcte 
| defvar;

defcte: tipo TOKEN_COMA TOKEN_PARAMETER TOKEN_DOBLEPUNTO IDENT 
TOKEN_IGUAL simpvalue ctelist TOKEN_PUNTOCOMA aux1;

aux1: defcte
|
;

ctelist: TOKEN_COMA IDENT TOKEN_IGUAL simpvalue ctelist 
|
;

simpvalue: NUM_INT_CONST 
| NUM_REAL_CONST 
| STRING_CONST;

defvar: tipo TOKEN_DOBLEPUNTO varlist TOKEN_PUNTOCOMA aux2;

aux2: defvar 
|
;

tipo: TOKEN_INTEGER
| TOKEN_REAL
| TOKEN_CHARACTER charlength;

charlength: TOKEN_PARENTESIS_IZQ NUM_INT_CONST TOKEN_PARENTESIS_DER
|
;

varlist: IDENT init
| IDENT init TOKEN_COMA varlist;

init: TOKEN_IGUAL simpvalue
|
 ;


//SEGUNDA ZONA DECLARACIONES
decproc :  TOKEN_SUBROUTINE IDENT formal_paramlist dec_s_paramlist TOKEN_END
TOKEN_SUBROUTINE IDENT;

formal_paramlist :  TOKEN_PARENTESIS_IZQ nomparamlist TOKEN_PARENTESIS_DER
|
;

nomparamlist : IDENT 
| IDENT TOKEN_COMA nomparamlist
;

dec_s_paramlist : tipo TOKEN_COMA TOKEN_INTENT TOKEN_PARENTESIS_IZQ tipoparam 
TOKEN_PARENTESIS_DER IDENT TOKEN_PUNTOCOMA dec_s_paramlist 
| 
;

tipoparam : TOKEN_IN 
| TOKEN_OUT 
| TOKEN_INOUT
;

decfun : TOKEN_FUNCTION IDENT TOKEN_PARENTESIS_IZQ nomparamlist 
TOKEN_PARENTESIS_DER  tipo TOKEN_DOBLEPUNTO IDENT 
TOKEN_PUNTOCOMA dec_f_paramlist TOKEN_END TOKEN_FUNCTION IDENT;

dec_f_paramlist : tipo TOKEN_COMA TOKEN_INTENT TOKEN_PARENTESIS_IZQ 
TOKEN_IN TOKEN_PARENTESIS_DER IDENT TOKEN_PUNTOCOMA  dec_f_paramlist 
|
;

//ZONA DE SENTENCIAS DEL PROGRAMA PRINCIPAL

sent: IDENT TOKEN_IGUAL exp TOKEN_PUNTOCOMA
| proc_call TOKEN_PUNTOCOMA;

exp: exp op exp 
| factor;

op: oparit;

oparit: TOKEN_MAS
| TOKEN_MENOS
| TOKEN_MULTIPLICACION
| TOKEN_DIVISION;

factor: simpvalue
| TOKEN_PARENTESIS_IZQ exp TOKEN_PARENTESIS_DER
| IDENT TOKEN_PARENTESIS_IZQ exp explist TOKEN_PARENTESIS_DER
| IDENT;

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

codproc : TOKEN_SUBROUTINE IDENT formal_paramlist dec_s_paramlist dcllist 
sent sentlist TOKEN_END TOKEN_SUBROUTINE IDENT;

codfun : TOKEN_FUNCTION IDENT TOKEN_PARENTESIS_IZQ 
nomparamlist TOKEN_PARENTESIS_DER  tipo TOKEN_DOBLEPUNTO IDENT TOKEN_PUNTOCOMA
dec_f_paramlist dcllist sent sentlist IDENT TOKEN_IGUAL exp TOKEN_PUNTOCOMA
TOKEN_END TOKEN_FUNCTION IDENT;




//ANALISIS LEXICO
TOKEN_PROGRAM: 'PROGRAM'{
    token_actual = new TokenDetectado(true, getText(), "PROGRAM");
    listaTokens.añadirToken(token_actual);};
TOKEN_INTERFACE: 'INTERFACE'{
    token_actual = new TokenDetectado(true, getText(), "INTERFACE");
    listaTokens.añadirToken(token_actual);};
TOKEN_PUNTOCOMA: ';'{
    token_actual = new TokenDetectado(true, getText(), ";");
    listaTokens.añadirToken(token_actual);};
TOKEN_END: 'END'{
    token_actual = new TokenDetectado(true, getText(), "END");
    listaTokens.añadirToken(token_actual);};
TOKEN_DOBLEPUNTO: '::'{
    token_actual = new TokenDetectado(true, getText(), "::");
    listaTokens.añadirToken(token_actual);};
TOKEN_PARAMETER: 'PARAMETER'{
    token_actual = new TokenDetectado(true, getText(), "PARAMETER");
    listaTokens.añadirToken(token_actual);};
TOKEN_IGUAL: '='{
    token_actual = new TokenDetectado(true, getText(), "=");
    listaTokens.añadirToken(token_actual);};
TOKEN_COMA: ','{
    token_actual = new TokenDetectado(true, getText(), ",");
    listaTokens.añadirToken(token_actual);};
TOKEN_INTEGER: 'INTEGER'{
    token_actual = new TokenDetectado(true, getText(), "INTEGER");
    listaTokens.añadirToken(token_actual);};
TOKEN_REAL: 'REAL'{
    token_actual = new TokenDetectado(true, getText(), "REAL");
    listaTokens.añadirToken(token_actual);};
TOKEN_CHARACTER: 'CHARACTER'{
    token_actual = new TokenDetectado(true, getText(), "CHARACTER");
    listaTokens.añadirToken(token_actual);};
TOKEN_PARENTESIS_IZQ: '('{
    token_actual = new TokenDetectado(true, getText(), "(");
    listaTokens.añadirToken(token_actual);};
TOKEN_PARENTESIS_DER: ')'{
    token_actual = new TokenDetectado(true, getText(), ")");
    listaTokens.añadirToken(token_actual);};
TOKEN_SUBROUTINE: 'SUBROUTINE'{
    token_actual = new TokenDetectado(true, getText(), "SUBROUTINE");
    listaTokens.añadirToken(token_actual);};
TOKEN_IN: 'IN'{
    token_actual = new TokenDetectado(true, getText(), "IN");
    listaTokens.añadirToken(token_actual);};
TOKEN_OUT: 'OUT'{
    token_actual = new TokenDetectado(true, getText(), "OUT");
    listaTokens.añadirToken(token_actual);};
TOKEN_INOUT: 'INOUT'{
    token_actual = new TokenDetectado(true, getText(), "INOUT");
    listaTokens.añadirToken(token_actual);};
TOKEN_FUNCTION: 'FUNCTION'{
    token_actual = new TokenDetectado(true, getText(), "FUNCTION");
    listaTokens.añadirToken(token_actual);};
TOKEN_INTENT: 'INTENT'{
    token_actual = new TokenDetectado(true, getText(), "INTENT");
    listaTokens.añadirToken(token_actual);};
TOKEN_MAS: '+'{
    token_actual = new TokenDetectado(true, getText(), "+");
    listaTokens.añadirToken(token_actual);};
TOKEN_MENOS: '-'{
    token_actual = new TokenDetectado(true, getText(),  "-");
    listaTokens.añadirToken(token_actual);};
TOKEN_MULTIPLICACION: '*'{
    token_actual = new TokenDetectado(true, getText(), "*");
    listaTokens.añadirToken(token_actual);};
TOKEN_DIVISION:'/'{
    token_actual = new TokenDetectado(true, getText(), "/");
    listaTokens.añadirToken(token_actual);};
TOKEN_CALL: 'CALL'{
    token_actual = new TokenDetectado(true, getText(), "CALL");
    listaTokens.añadirToken(token_actual);};
/* NUM_INT_CONST_B: 'b' ''' [0-1]+ '''{
    token_actual = new TokenDetectado(true, getText(), "NUM_INT_CONST_B");
    listaTokens.añadirToken(token_actual);};
NUM_INT_CONST_O: 'o' ''' [0-7]+ '''{
    token_actual = new TokenDetectado(true, getText(), "NUM_INT_CONST_O");
    listaTokens.añadirToken(token_actual);};
NUM_INT_CONST_H: 'h' ''' [0-9A-F]+ '''{
    token_actual = new TokenDetectado(true, getText(), "NUM_INT_CONST_H");
    listaTokens.añadirToken(token_actual);};
LOGIC_CONST: ('.TRUE.' | '.FALSE.'){
    token_actual = new TokenDetectado(true, getText(), "LOGIC_CONST");
    listaTokens.añadirToken(token_actual);};*/ 
IDENT:[a-zA-Z][a-zA-Z0-9_]*{ 
    token_actual = new TokenDetectado(true, getText(), "IDENT");
    listaTokens.añadirToken(token_actual);}; 
NUM_INT_CONST: '-'? DIGIT+ 
{   
    token_actual = new TokenDetectado(true, getText(), "NUM_INT_CONST");
    listaTokens.añadirToken(token_actual);};
NUM_REAL_CONST: (PUNTO_FIJO | EXPONENCIAL | MIXTO) 
{   
    token_actual = new TokenDetectado(true, getText(), "NUM_REAL_CONST");
    listaTokens.añadirToken(token_actual);};
STRING_CONST: (STRING_CONST1 | STRING_CONST2){
    token_actual = new TokenDetectado(true, getText(), "STRING_CONST");
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
