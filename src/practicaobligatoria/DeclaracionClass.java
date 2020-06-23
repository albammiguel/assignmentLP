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
public class DeclaracionClass extends SentenciaClass {
    private String tipoVariables;
    private ArrayList<VariableClass> listaVariablesDeclaradas;
    
    public DeclaracionClass(String tipoSentencia, String tipoVariables,
            ArrayList<VariableClass> listaVariablesDeclaradas){
        super(tipoSentencia);
        this.tipoVariables = tipoVariables;
        this.listaVariablesDeclaradas = listaVariablesDeclaradas;
    }

    public ArrayList<VariableClass> getListaVariablesDeclaradas() {
        return listaVariablesDeclaradas;
    }

    public void setListaVariablesDeclaradas(ArrayList<VariableClass> listaVariablesDeclaradas) {
        this.listaVariablesDeclaradas = listaVariablesDeclaradas;
    }

    public String getTipoVariables() {
        return tipoVariables;
    }

    public void setTipoVariables(String tipoVariables) {
        this.tipoVariables = tipoVariables;
    }
    
    
    private void imprimirVariables(PrintWriter lenguaje){
          String igual = "=";
          String espacio =" ";
          String puntoComa = ";";
          String corchete_izq = "[";
          String corchete_der = "]";
          String coma = ",";
          
  
        listaVariablesDeclaradas.forEach((v)-> {
            if(v.getTipo().equals("char") && v.getTamañoChar() > 0){
                if(v.getValor() != null){
                   lenguaje.print(v.getNombre()+ corchete_izq + v.getTamañoChar()+ 
                                   corchete_der + igual + v.getValor());
                }else{
                    lenguaje.print(v.getNombre()+ corchete_izq + v.getTamañoChar()+ 
                                   corchete_der);
                }
            if(listaVariablesDeclaradas.get(listaVariablesDeclaradas.size()-1).equals(v)){
                   lenguaje.print(puntoComa);
            } else {lenguaje.print(coma+espacio);}
            }else{
                 if(v.getValor() != null){
                    lenguaje.print(v.getNombre()+ igual + v.getValor());
                }else{
                    lenguaje.print(v.getNombre());
                }
            //comprobamos si es la última variable o hay que seguir imprimiendo
            if(listaVariablesDeclaradas.get(listaVariablesDeclaradas.size()-1).equals(v)){
                  lenguaje.print(puntoComa);
            } else {lenguaje.print(coma+espacio);}
            }
            });
          
          
          
    }
    
    @Override
    public void mostrar(PrintWriter lenguaje, String tabulacion){
        String espacio = " ";
        String saltoLinea = "\n";
        
        lenguaje.print(tabulacion);
        lenguaje.print(tipoVariables + espacio);
        imprimirVariables(lenguaje);
        lenguaje.print(saltoLinea);
    } 
}
