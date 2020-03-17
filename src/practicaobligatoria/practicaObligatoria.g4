grammar practicaObligatoria;

//ANALISIS SINTACTICO
//PRINCIPIO - ESTRUCTURA PROGRAMA
prg : TOKEN_PROGRAM IDENT TOKEN_PUNTOCOMA dcllist cabecera sent sentlist 
TOKEN_END TOKEN_PROGRAM IDENT subproglist;

dcllist: dcllist dcl
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
TOKEN_IGUAL simpvalue defcte 
|
;

ctelist: TOKEN_COMA IDENT TOKEN_IGUAL simpvalue ctelist 
|
;

simpvalue: NUM_INT_CONST 
| NUM_REAL_CONST 
| STRING_CONST;

defvar: tipo TOKEN_DOBLEPUNTO varlist TOKEN_PUNTOCOMA defvar 
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
IDENT:[a-z][a-z0-9_]*; 
NUM_INT_CONST: '-'? DIGIT+ 
{ System.out.println("Constante entera "+getText()+"\n");};
NUM_REAL_CONST: (PUNTO_FIJO | EXPONENCIAL | MIXTO) 
{System.out.println("Constante real "+getText()+"\n");};
STRING_CONST: (STRING_CONST1 | STRING_CONST2)
{System.out.println("Constante literal "+getText()+"\n");};
TOKEN_PROGRAM: 'PROGRAM';
TOKEN_INTERFACE: 'INTERFACE';
TOKEN_PUNTOCOMA: ';';
TOKEN_END: 'END';
TOKEN_DOBLEPUNTO: '::';
TOKEN_PARAMETER: 'PARAMETER';
TOKEN_IGUAL: '=';
TOKEN_COMA: ',';
TOKEN_INTEGER: 'INTEGER';
TOKEN_REAL: 'REAL';
TOKEN_CHARACTER: 'CHARACTER';
TOKEN_PARENTESIS_IZQ: '(';
TOKEN_PARENTESIS_DER: ')';
TOKEN_SUBROUTINE: 'SUBROUTINE';
TOKEN_IN: 'IN';
TOKEN_OUT: 'OUT';
TOKEN_INOUT: 'INOUT';
TOKEN_FUNCTION: 'FUNCTION';
TOKEN_INTENT: 'INTENT';
TOKEN_MAS: '+';
TOKEN_MENOS: '-';
TOKEN_MULTIPLICACION: '*';
TOKEN_DIVISION:'/';
TOKEN_CALL: 'CALL';
COMENTARIOS: '!' .*? '\r'? '\n' -> skip;
WS: [\t\n\r ] -> skip;

fragment 
DIGIT: [0-9];
PUNTO_FIJO: '-'? DIGIT+ '.' DIGIT+;
EXPONENCIAL: '-'? DIGIT+ ('e' | 'E') '-'? DIGIT+;
MIXTO: PUNTO_FIJO ('e' | 'E') '-'? DIGIT+;
SIN_COMILLAS_DOBLES: ~('"')+;
SIN_COMILLAS_SIMPLES: ~('\'')+;
STRING_CONST1: '"' ('""' | SIN_COMILLAS_DOBLES)* '"';
STRING_CONST2: '\'' ('\'\''| SIN_COMILLAS_SIMPLES)* '\'';
