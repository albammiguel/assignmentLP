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
public class DefinesClass {
    private ArrayList<ConstanteClass> listaConstantes; 
    
    public DefinesClass(){
           listaConstantes = new ArrayList <ConstanteClass> ();   
    }

    public ArrayList<ConstanteClass> getListaConstantes() {
        return listaConstantes;
    }

    public void setListaConstantes(ArrayList<ConstanteClass> listaConstantes) {
        this.listaConstantes = listaConstantes;
    }
    
    public void imprimir(){
        
    }
    
    
}

