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
    
    //CONSTRUCTOR
    public DecFunsClass(ArrayList<FuncionClass> listaFunciones){
        this.listaFunciones = listaFunciones;
    }
    
    //GETTERS Y SETTERS
     public ArrayList<FuncionClass> getListaFunciones() {
        return listaFunciones;
    }

    public void setListaFunciones(ArrayList<FuncionClass> listaConstantes) {
        this.listaFunciones = listaConstantes;
    }
    
    //METODOS
    private void imprimirSinArgumentos(String tipo, String nombre){
        String parentesis_izq = "(";
        String parentesis_der = ")";
        String puntoComa =";";
        String vacio = "void";
        String espacio = " ";
        if(tipo ==null){
            System.out.println(vacio + espacio + nombre +
                                      espacio + parentesis_izq + espacio
                                      + vacio + espacio + parentesis_der + 
                                       puntoComa);
        } else {
              System.out.println(tipo + espacio + nombre +
                                      espacio + parentesis_izq + espacio
                                      + vacio + espacio + parentesis_der + 
                                       puntoComa);
        }
    }
    
    private void imprimirConArgumentos(FuncionClass f){
        String parentesis_izq = "(";
        String parentesis_der = ")";
        String puntoComa =";";
        String vacio = "void";
        String espacio = " ";
        String saltoLinea = "\n";
        
        String tipo = f.getTipoDevuelto();
        String nombre = f.getNombre();
        
        if(tipo==null){
            System.out.print(vacio + espacio 
                            + nombre + espacio
                            +parentesis_izq + espacio);
            f.imprimirListaParametros();
            System.out.print(parentesis_der + puntoComa + saltoLinea);
        } else {
            System.out.print(tipo+ espacio 
                               + nombre + espacio
                               +parentesis_izq + espacio);
            f.imprimirListaParametros();
            System.out.print(parentesis_der + puntoComa + saltoLinea);
        }
    }
    
    public void imprimir(){
        
        listaFunciones.forEach((f) -> {
           if(f.getListaParametros().isEmpty()){
               imprimirSinArgumentos(f.getTipoDevuelto(),f.getNombre());
           }else{
               imprimirConArgumentos(f);
           }
        });
    }
    
    
}   
