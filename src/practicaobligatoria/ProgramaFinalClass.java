/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaobligatoria;

import java.util.ArrayList;

/**
 *
 * @author albam
 */
public class ProgramaFinalClass {
    private boolean esError;
    private DefinesClass defines; 
    private DecFunsClass decfuns;
    private PartesClass partes;
    private ArrayList<SentenciaClass> sentenciasMain;
    
    //CONSTRUCTORES
    public ProgramaFinalClass(){
        this.defines = null;
        this.decfuns = null;
        this.partes = null;
        this.esError = false;
        this.sentenciasMain = new ArrayList<SentenciaClass>();
    }
    
    public boolean isEsError() {
        return esError;
    }

    public void setEsError(boolean esError) {
        this.esError = esError;
    } 
    public DefinesClass getDefines() {
        return defines;
    }

    public void setDefines(DefinesClass defines) {
        this.defines = defines;
    }

    public DecFunsClass getDecfuns() {
        return decfuns;
    }

    public void setDecfuns(DecFunsClass decfuns) {
        this.decfuns = decfuns;
    }

    public PartesClass getPartes() {
        return partes;
    }

    public void setPartes(PartesClass partes) {
        this.partes = partes;
    }
    
    

    public ArrayList<SentenciaClass> getSentenciasMain() {
        return sentenciasMain;
    }

    public void setSentenciasMain(ArrayList<SentenciaClass> sentenciasMain) {
        this.sentenciasMain = sentenciasMain;
    }
    
    
    
    public void mostrar(){
        String vacio = "void";
        String main = "main";
        String tabulacion = "\t";
        String llave_izq = "{";
        String llave_der = "}";
        String parentesis_izq = "(";
        String parentesis_der = ")";
        String espacio = " ";
        
        if(!defines.getListaConstantes().isEmpty())
            {defines.imprimir();}
        if(!decfuns.getListaFunciones().isEmpty())
            {decfuns.imprimir();}
        if(!partes.getListaImplementacionFunciones().isEmpty())
            {partes.imprimir();}
        
        if(!sentenciasMain.isEmpty()){
            System.out.println(vacio + espacio + main + espacio + parentesis_izq 
                              + espacio + vacio + espacio + parentesis_der);
            System.out.println(llave_izq);
            sentenciasMain.forEach((s) -> {
                 System.out.print(tabulacion);
                 s.mostrar();});
            System.out.println(llave_der);
             
        }
        
        

    }   
}
