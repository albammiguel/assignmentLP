/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaobligatoria;

import java.io.PrintWriter;
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
     private void imprimirSinArgumentos(FuncionClass f, PrintWriter lenguaje){
        String parentesis_izq = "(";
        String parentesis_der = ")";
        String vacio = "void";
        String espacio = " ";
        
        String tipo = f.getTipoDevuelto();
        String nombre = f.getNombre();
        
        if(tipo ==null){
            lenguaje.println(vacio + espacio + nombre +
                                      espacio + parentesis_izq + espacio
                                      + vacio + espacio + parentesis_der);
            f.imprimirListaSentencias(lenguaje);
        } else {
              lenguaje.println(tipo + espacio + nombre +
                                      espacio + parentesis_izq + espacio
                                      + vacio + espacio + parentesis_der);
              f.imprimirListaSentencias(lenguaje);
        }
    }
    
    private void imprimirConArgumentos(FuncionClass f, PrintWriter lenguaje){
        String parentesis_izq = "(";
        String parentesis_der = ")";
        String vacio = "void";
        String espacio = " ";
        
        String tipo = f.getTipoDevuelto();
        String nombre = f.getNombre();
        
        if(tipo==null){
            lenguaje.print(vacio + espacio 
                            + nombre + espacio
                            +parentesis_izq + espacio);
            f.imprimirListaParametros(lenguaje);
            lenguaje.print(parentesis_der);
            f.imprimirListaSentencias(lenguaje);
            
        } else {
            lenguaje.print(tipo+ espacio 
                               + nombre + espacio
                               +parentesis_izq + espacio);
            f.imprimirListaParametros(lenguaje);
            lenguaje.print(parentesis_der);
            f.imprimirListaSentencias(lenguaje);
        }
    }
     
    public void imprimir(PrintWriter lenguaje){
         listaImplementacionFunciones.forEach((f) -> {
           if(f.getListaParametros().isEmpty()){
               imprimirSinArgumentos(f, lenguaje);
           }else{
               imprimirConArgumentos(f, lenguaje);
           }
        });
        
    }
    
    
    
}
