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
$dcllist.lv_declaraciones.forEach((d)->{sentencias_programa.add(d);});
}
cabecera 
{DecFunsClass decfuns = new DecFunsClass($cabecera.lv_funciones);
lenguajeFinal.setDecfuns(decfuns);}
 sent sentlist[sentencias_programa]
{lenguajeFinal.setSentenciasMain(sentencias_programa);}
TOKEN_END TOKEN_PROGRAM IDENT 
{ArrayList<FuncionClass> lista_funciones = new ArrayList<FuncionClass>();}
subproglist[lista_funciones]
{PartesClass partes = new PartesClass($subproglist.lv_funciones_implementadas);
lenguajeFinal.setPartes(partes);} 
;



dcllist[ArrayList<ConstanteClass> l_constantes, 
ArrayList<DeclaracionClass> l_declaraciones] 
returns [ArrayList<ConstanteClass> lv_constantes, 
ArrayList<DeclaracionClass> lv_declaraciones]:
dcl 
{$lv_constantes=$dcl.l_constantes;  
$lv_declaraciones=$dcl.l_declaraciones;} 
dcllist[$dcl.l_constantes, $dcl.l_declaraciones] 
{if(!$dcllist.lv_constantes.isEmpty())$lv_constantes = $dcllist.lv_constantes;
if(!$dcllist.lv_declaraciones.isEmpty())$lv_declaraciones = $dcllist.lv_declaraciones;}

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

sentlist[ArrayList<SentenciaClass> lh_sentencias] 
returns[ArrayList<SentenciaClass> lv_sentencias]: 
sent {lh_sentencias.add($sent.s);} sentlist[$lh_sentencias]
{$lv_sentencias = $sentlist.lv_sentencias;} 
|                       {$lv_sentencias = $lh_sentencias;}
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

sent returns [SentenciaClass s]: IDENT TOKEN_IGUAL exp TOKEN_PUNTOCOMA
{AsignacionClass a = new AsignacionClass("asignacion", $IDENT.text, $exp.v);
$s = a;}
| proc_call TOKEN_PUNTOCOMA {$s = $proc_call.llamada_proc;}
| TOKEN_IF TOKEN_PARENTESIS_IZQ expcond aux7 
{EstructuraIfClass if_sentencia = new EstructuraIfClass("if", 
$expcond.v, $aux7.sentencias_if, $aux7.sentencias_else);
$s = if_sentencia;}
| TOKEN_DO aux8 {$s = $aux8.s;}
| TOKEN_SELECT TOKEN_CASE TOKEN_PARENTESIS_IZQ exp TOKEN_PARENTESIS_DER
{ArrayList<CasosClass> l_casos = new ArrayList<CasosClass>(); boolean esDefault = false; 
ArrayList<SentenciaClass> sentencias_default = new ArrayList<SentenciaClass>();} 
casos[l_casos, esDefault, sentencias_default] 
TOKEN_END TOKEN_SELECT 
{EstructuraCaseClass case_sentencia = new 
EstructuraCaseClass("case", $exp.v, $casos.lv_casos, $casos.esDefault_v, $casos.sv_default);
case_sentencia.mostrar(); $s=case_sentencia;}
;


aux7 returns [ArrayList<SentenciaClass> sentencias_if,
ArrayList<SentenciaClass> sentencias_else]: 
TOKEN_PARENTESIS_DER sent 
{ArrayList<SentenciaClass> l_if = new ArrayList<SentenciaClass>();
ArrayList<SentenciaClass> l_else= new ArrayList<SentenciaClass>();
l_if.add($sent.s); $sentencias_if = l_if; $sentencias_else = l_else;}
| TOKEN_PARENTESIS_DER TOKEN_THEN 
{ArrayList<SentenciaClass> l_if = new ArrayList<SentenciaClass>();
ArrayList<SentenciaClass> l_else= new ArrayList<SentenciaClass>();} 
sentlist[l_if] TOKEN_ENDIF  
{$sentencias_if = $sentlist.lv_sentencias; $sentencias_else = l_else;}
| TOKEN_PARENTESIS_DER TOKEN_THEN 
{ArrayList<SentenciaClass> l_if = new ArrayList<SentenciaClass>();} 
l1=sentlist[l_if] TOKEN_ELSE
{ArrayList<SentenciaClass> lista_else = new ArrayList<SentenciaClass>();}  
l2=sentlist[lista_else] TOKEN_ENDIF
{$sentencias_if = $l1.lv_sentencias; $sentencias_else = $l2.lv_sentencias;}
;

aux8 returns [SentenciaClass s]: 
TOKEN_WHILE TOKEN_PARENTESIS_IZQ expcond TOKEN_PARENTESIS_DER
{ArrayList<SentenciaClass> l = new ArrayList<SentenciaClass>();} 
sentlist[l] TOKEN_ENDDO
{EstructuraDoWhileClass dowhile_sentencia = new EstructuraDoWhileClass("while", 
$expcond.v, $sentlist.lv_sentencias);
dowhile_sentencia.mostrar();
$s= dowhile_sentencia;}
| IDENT TOKEN_IGUAL d1=doval TOKEN_COMA d2=doval TOKEN_COMA d3=doval 
{ArrayList<SentenciaClass> l_do = new ArrayList<SentenciaClass>();} 
sentlist[l_do] TOKEN_ENDDO
{EstructuraDoClass do_sentencia = new EstructuraDoClass("for", 
$IDENT.text, $d1.v, $d2.v, $d3.v, $sentlist.lv_sentencias);
do_sentencia.mostrar();
$s = do_sentencia;}
;


exp returns [String v]: id1=exp op id2=exp {$v = $id1.v + $op.v + $id2.v;}
| factor {$v = $factor.v;}
;

op returns [String v]: oparit {$v = $oparit.v;}
;

oparit returns [String v]: TOKEN_MAS{$v = "+";}
| TOKEN_MENOS {$v = "-";}
| TOKEN_MULTIPLICACION {$v = "*";}
| TOKEN_DIVISION{$v = "/";}
;

factor returns [String v]: simpvalue {$v = $simpvalue.v;}
| TOKEN_PARENTESIS_IZQ exp TOKEN_PARENTESIS_DER {$v= "(" + $exp.v + ")";}
| IDENT aux5[$IDENT.text] {$v = $aux5.v;}
;

aux5[String vh] returns [String v]: TOKEN_PARENTESIS_IZQ exp explist[$exp.v] 
TOKEN_PARENTESIS_DER {$v= $vh + "(" + $explist.v + ")";}
|          {$v = $vh;}
;

explist[String vh] returns [String v]: TOKEN_COMA exp 
{$vh = $vh + "," + " "+$exp.v;}  explist[$vh] {$v = $explist.v;}
|   {$v= $vh;}
;

proc_call returns [LlamadaClass llamada_proc]: TOKEN_CALL IDENT subpparamlist
{LlamadaClass llamada = new LlamadaClass("llamada", $IDENT.text, $subpparamlist.v);
$llamada_proc = llamada;};

subpparamlist returns[String v]: 
TOKEN_PARENTESIS_IZQ exp explist[$exp.v] TOKEN_PARENTESIS_DER
{$v="(" + $explist.v + ")";}
|       {$v = null;}
;


//ZONA IMPLEMENTACION
subproglist[ArrayList<FuncionClass> lh_funciones_implementadas]
returns [ArrayList<FuncionClass> lv_funciones_implementadas]: 
codproc {$lh_funciones_implementadas.add($codproc.p);} 
subproglist[$lh_funciones_implementadas]
{$lv_funciones_implementadas = $subproglist.lv_funciones_implementadas;} 
| codfun {$lh_funciones_implementadas.add($codfun.f);}  
subproglist[$lh_funciones_implementadas] 
{$lv_funciones_implementadas = $subproglist.lv_funciones_implementadas;}
|          {$lv_funciones_implementadas = $lh_funciones_implementadas;}
;

codproc returns[FuncionClass p] : TOKEN_SUBROUTINE id1=IDENT formal_paramlist 
dec_s_paramlist[$formal_paramlist.lv_parametros] 
{ArrayList<ConstanteClass> lista_constantes = new ArrayList <ConstanteClass>();
ArrayList<DeclaracionClass> lista_declaraciones = new ArrayList<DeclaracionClass>();
ArrayList<SentenciaClass> sentencias_procedimiento = new ArrayList<SentenciaClass>();}
dcllist[lista_constantes, lista_declaraciones]
{$dcllist.lv_declaraciones.forEach((d)->{sentencias_procedimiento.add(d);});} 
sent
{sentencias_procedimiento.add($sent.s);} 
sentlist[sentencias_procedimiento] TOKEN_END TOKEN_SUBROUTINE id2=IDENT
{FuncionClass procedimiento = new FuncionClass();
 if($id1.text.equals($id2.text)){
    procedimiento.setNombre($id1.text);
    procedimiento.setListaParametros($dec_s_paramlist.lv_parametros);
    procedimiento.setListaSentencias(sentencias_procedimiento);
 }else{
    //llamamos a error semántico, no cumple primera  regla
 }
$p = procedimiento;}
;


codfun returns[FuncionClass f]: TOKEN_FUNCTION id1=IDENT TOKEN_PARENTESIS_IZQ
{ArrayList<ParametroClass> l = new ArrayList<ParametroClass>();}   
nomparamlist[l] TOKEN_PARENTESIS_DER  tipo TOKEN_DOBLEPUNTO id2=IDENT TOKEN_PUNTOCOMA
dec_f_paramlist[$nomparamlist.lv_parametros] 
{ArrayList<ConstanteClass> lista_constantes = new ArrayList <ConstanteClass>();
ArrayList<DeclaracionClass> lista_declaraciones = new ArrayList<DeclaracionClass>();
ArrayList<SentenciaClass> sentencias_funcion = new ArrayList<SentenciaClass>();}
dcllist[lista_constantes, lista_declaraciones]
{$dcllist.lv_declaraciones.forEach((d)->{sentencias_funcion.add(d);});} 
sent
{sentencias_funcion.add($sent.s);}  
sentlist[sentencias_funcion] id3=IDENT TOKEN_IGUAL exp TOKEN_PUNTOCOMA
{RetornoClass r = new RetornoClass("retorno",$exp.v); sentencias_funcion.add(r);}
TOKEN_END TOKEN_FUNCTION id4=IDENT
{FuncionClass funcion = new FuncionClass();
if(($id1.text.equals($id2.text))&&($id1.text.equals($id3.text))&& 
   ($id1.text.equals($id4.text)) && ($id2.text.equals($id3.text)) &&
    ($id2.text.equals($id4.text)) && ($id3.text.equals($id4.text))){
        funcion.setTipoDevuelto($tipo.v);
        funcion.setNombre($id1.text);
        funcion.setListaParametros($dec_f_paramlist.lv_parametros);
        funcion.setListaSentencias(sentencias_funcion);
    }else{
        //llamamos a error semántico, no cumple primera y/o tercera regla 
    }
 $f = funcion;}
;

//SECUENCIAS DE CONTROL DE FLUJO

expcond returns[String v]: 
id1=expcond oplog id2=expcond {$v = $id1.v + $oplog.v + $id2.v;}
| factorcond {$v = $factorcond.v;}
;

oplog returns[String v]:  TOKEN_OR{$v="||";}
| TOKEN_AND {$v="&&";}
| TOKEN_EQV {$v="!^";}
| TOKEN_NEQV {$v="^";}
;

factorcond returns[String v]: id1=exp opcomp id2=exp {$v = $id1.v + $opcomp.v + $id2.v;}
| TOKEN_PARENTESIS_IZQ expcond TOKEN_PARENTESIS_DER {$v = "(" + $expcond.v + ")";}
| TOKEN_NOT factorcond {$v = "!" + $factorcond.v;}
| TOKEN_TRUE {$v = "1";}
| TOKEN_FALSE {$v = "0";}
;

opcomp returns [String v]: TOKEN_MENORQUE {$v = $TOKEN_MENORQUE.text;}
| TOKEN_MAYORQUE {$v = $TOKEN_MAYORQUE.text;}
| TOKEN_MENOROIGUAL {$v = $TOKEN_MENOROIGUAL.text;}
| TOKEN_MAYOROIGUAL {$v = $TOKEN_MAYOROIGUAL.text;}
| TOKEN_IGUALIGUAL {$v = $TOKEN_IGUALIGUAL.text;}
| TOKEN_DISTINTO {$v = "!=";};

doval returns[String v]: NUM_INT_CONST {$v= $NUM_INT_CONST.text;}
| IDENT{$v= $IDENT.text;};

casos [ArrayList<CasosClass>lh_casos, boolean esDefault_h, ArrayList<SentenciaClass> sh_default] 
returns [ArrayList<CasosClass> lv_casos,
boolean esDefault_v, ArrayList<SentenciaClass> sv_default]: 
TOKEN_CASE aux9[$lh_casos, $esDefault_h, $sh_default] 
{$lv_casos = $aux9.lv_casos; $esDefault_v = $aux9.esDefault_v; $sv_default = $aux9.sv_default;}
|               {$lv_casos = $lh_casos; $esDefault_v = $esDefault_h; 
                $sv_default = $sh_default;}
;

aux9[ArrayList<CasosClass>lh_casos, boolean esDefault_h, ArrayList<SentenciaClass> sh_default] 
returns [ArrayList<CasosClass> lv_casos,
boolean esDefault_v, ArrayList<SentenciaClass> sv_default]: 
TOKEN_PARENTESIS_IZQ etiquetas TOKEN_PARENTESIS_DER
{ArrayList<SentenciaClass> lista = new ArrayList<SentenciaClass>();} 
sentlist[lista] 
{CasosClass caso = new CasosClass($etiquetas.lv_etiquetas,$sentlist.lv_sentencias); 
$lh_casos.add(caso);} casos[$lh_casos, $esDefault_h, $sh_default] 
{$lv_casos = $casos.lv_casos; $esDefault_v = $casos.esDefault_v; 
$sv_default = $casos.sv_default;}
| TOKEN_DEFAULT {$esDefault_h = true; 
ArrayList<SentenciaClass> lista = new ArrayList<SentenciaClass>();}
 sentlist[lista] {$sh_default = $sentlist.lv_sentencias;
$lv_casos = $lh_casos; $esDefault_v = $esDefault_h; $sv_default = $sh_default;};

etiquetas returns [ArrayList<String> lv_etiquetas]: 
simpvalue {ArrayList<String> l_etiquetas = new ArrayList<String>();} 
aux10[l_etiquetas, $simpvalue.v] {$lv_etiquetas = $aux10.lv_etiquetas;}
| TOKEN_DOBLEPUNTO_SIMPLE simpvalue 
{ArrayList<String> l_etiquetas = new ArrayList<String>();
String etiqueta = "<" + $simpvalue.v; l_etiquetas.add(etiqueta);
$lv_etiquetas = l_etiquetas;}
;

aux10[ArrayList<String> lh_etiquetas, String vh] returns
[ArrayList<String> lv_etiquetas]: {$lh_etiquetas.add($vh);}
listaetiqetas[$lh_etiquetas] {$lv_etiquetas = $listaetiqetas.lv_etiquetas;}
| TOKEN_DOBLEPUNTO_SIMPLE simpvalue {String etiqueta = $vh
 + "to" + $simpvalue.v; 
 $lh_etiquetas.add(etiqueta); $lv_etiquetas = $lh_etiquetas;}
| TOKEN_DOBLEPUNTO_SIMPLE {
String etiqueta = ">" + $vh; 
$lh_etiquetas.add(etiqueta); $lv_etiquetas = $lh_etiquetas;}
;

listaetiqetas[ArrayList<String> lh_etiquetas]
returns [ArrayList<String> lv_etiquetas]: 
TOKEN_COMA simpvalue {$lh_etiquetas.add($simpvalue.v);} 
listaetiqetas[$lh_etiquetas] {$lv_etiquetas = $listaetiqetas.lv_etiquetas;}
|                           {$lv_etiquetas = $lh_etiquetas;}
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
TOKEN_AND: '.AND.' {
    token_actual = new TokenDetectadoClass(true, getText(), "TOKEN_AND");
    listaTokens.añadirToken(token_actual);};
TOKEN_OR: '.OR.' {
    token_actual = new TokenDetectadoClass(true, getText(), "TOKEN_OR");
    listaTokens.añadirToken(token_actual);};
TOKEN_EQV: '.EQV.' {
    token_actual = new TokenDetectadoClass(true, getText(), "TOKEN_EQV");
    listaTokens.añadirToken(token_actual);};
TOKEN_NEQV: '.NEQV.' {
    token_actual = new TokenDetectadoClass(true, getText(), "TOKEN_NEQV");
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
TOKEN_TRUE: '.TRUE.'{
    token_actual = new TokenDetectadoClass(true, getText(), "TOKEN_TRUE");
    listaTokens.añadirToken(token_actual);};
TOKEN_FALSE: '.FALSE.'{
    token_actual = new TokenDetectadoClass(true, getText(), "TOKEN_FALSE");
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