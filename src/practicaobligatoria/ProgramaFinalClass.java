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
    private DefinesClass defines; 
    private DecFunsClass decfuns;
    //private PartesClass partes;
    
    //CONSTRUCTORES
    public ProgramaFinalClass(){
        this.defines = null;
        this.decfuns = null;
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
    
    public void mostrar(){
        if(!defines.getListaConstantes().isEmpty()){defines.imprimir();}
        if(!decfuns.getListaFunciones().isEmpty()){decfuns.imprimir();}
        

    }   
}
