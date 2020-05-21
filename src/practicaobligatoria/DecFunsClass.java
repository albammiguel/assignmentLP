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
    
    public DecFunsClass(ArrayList<FuncionClass> listaFunciones){
        this.listaFunciones = listaFunciones;
    }
    
     public ArrayList<FuncionClass> getListaFunciones() {
        return listaFunciones;
    }

    public void setListaFunciones(ArrayList<FuncionClass> listaConstantes) {
        this.listaFunciones = listaConstantes;
    }
    
    public void imprimir(){
        String parentesis_izq = "(";
        String parentesis_der = ")";
        String puntoComa =";";
        String vacio = "void";
        String espacio = " ";
        String saltoLinea = "\n";
        
        listaFunciones.forEach((f) -> {
            if(f.getTipoDevuelto() == null){
                if(f.getListaParametros().isEmpty()){
                    System.out.println(vacio + espacio + f.getNombre() +
                                      espacio + parentesis_izq + espacio
                                      + vacio + espacio + parentesis_der + 
                                       puntoComa);
                }else{
                    System.out.print(vacio + espacio 
                                    + f.getNombre() + espacio
                                    +parentesis_izq + espacio);
                    f.imprimirListaParametros();
                    System.out.print(parentesis_der + puntoComa + saltoLinea);}
            } else {
                if(f.getListaParametros().isEmpty()){
                    System.out.println(f.getTipoDevuelto() + espacio + f.getNombre() +
                                      espacio + parentesis_izq + espacio
                                      + vacio + espacio + parentesis_der + 
                                       puntoComa);
                }else{
                    System.out.print(f.getTipoDevuelto() + espacio 
                                    + f.getNombre() + espacio
                                    +parentesis_izq + espacio);
                    f.imprimirListaParametros();
                    System.out.print(parentesis_der + puntoComa + saltoLinea);}
            }
        });
    }
    
    
}   
