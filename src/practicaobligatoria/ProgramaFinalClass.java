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
    //private PartesClass partes;
    private ArrayList<SentenciaClass> sentenciasMain;
    
    //CONSTRUCTORES
    public ProgramaFinalClass(){
        this.defines = null;
        this.decfuns = null;
        this.esError = false;
        this.sentenciasMain = new ArrayList<SentenciaClass>();
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

    public boolean isEsError() {
        return esError;
    }

    public void setEsError(boolean esError) {
        this.esError = esError;
    }

    public ArrayList<SentenciaClass> getSentenciasMain() {
        return sentenciasMain;
    }

    public void setSentenciasMain(ArrayList<SentenciaClass> sentenciasMain) {
        this.sentenciasMain = sentenciasMain;
    }
    
    
    
    public void mostrar(){
        if(!defines.getListaConstantes().isEmpty()){defines.imprimir();}
        if(!decfuns.getListaFunciones().isEmpty()){decfuns.imprimir();}
        if(!sentenciasMain.isEmpty()){
             sentenciasMain.forEach((s) -> {
                 s.mostrar();
        });}
        

    }   
}
