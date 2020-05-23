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
public class PartesClass {
     private ArrayList<FuncionClass> listaImplementacionFunciones;
    
    //CONSTRUCTOR
    public PartesClass(ArrayList<FuncionClass> listaImplementacionFunciones){
        this.listaImplementacionFunciones = listaImplementacionFunciones;
    }
    
    //GETTERS Y SETTERS
    public ArrayList<FuncionClass> getListaImplementacionFunciones() {
        return listaImplementacionFunciones;
    }

    public void setListaImplementacionFunciones
        (ArrayList<FuncionClass> listaImplementacionFunciones) {
        this.listaImplementacionFunciones = listaImplementacionFunciones;
    }
    
    //METODOS
     private void imprimirSinArgumentos(FuncionClass f){
        String parentesis_izq = "(";
        String parentesis_der = ")";
        String puntoComa =";";
        String vacio = "void";
        String espacio = " ";
        
        String tipo = f.getTipoDevuelto();
        String nombre = f.getNombre();
        
        if(tipo ==null){
            System.out.println(vacio + espacio + nombre +
                                      espacio + parentesis_izq + espacio
                                      + vacio + espacio + parentesis_der);
            f.imprimirListaSentencias();
        } else {
              System.out.println(tipo + espacio + nombre +
                                      espacio + parentesis_izq + espacio
                                      + vacio + espacio + parentesis_der);
              f.imprimirListaSentencias();
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
            System.out.print(parentesis_der);
            f.imprimirListaSentencias();
            
        } else {
            System.out.print(tipo+ espacio 
                               + nombre + espacio
                               +parentesis_izq + espacio);
            f.imprimirListaParametros();
            System.out.print(parentesis_der);
            f.imprimirListaSentencias();
        }
    }
     
    public void imprimir(){
         listaImplementacionFunciones.forEach((f) -> {
           if(f.getListaParametros().isEmpty()){
               imprimirSinArgumentos(f);
           }else{
               imprimirConArgumentos(f);
           }
        });
        
    }
    
    
    
}
