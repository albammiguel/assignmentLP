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
public class DecFunsClass {
    private ArrayList<FuncionClass> listaFunciones;
    
    public DecFunsClass(){
        listaFunciones = new ArrayList<FuncionClass>();
    }
    
     public ArrayList<FuncionClass> getListaFunciones() {
        return listaFunciones;
    }

    public void setListaFunciones(ArrayList<FuncionClass> listaConstantes) {
        this.listaFunciones = listaConstantes;
    }
    
    public void imprimir(){}
    
    
}   
