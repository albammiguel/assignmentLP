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
public class EstructuraCaseClass extends SentenciaClass{
    private String selector;
    private ArrayList<CasosClass> listaCasos;
    private boolean hayDefault;
    private ArrayList<SentenciaClass> sentenciasDefault;
    
    
    public EstructuraCaseClass(String tipoSentencia, String selector,
            ArrayList<CasosClass> listaCasos, boolean hayDefault,
            ArrayList<SentenciaClass> sentenciasDefault){
        super(tipoSentencia);
        this.selector = selector;
        this.listaCasos = listaCasos;
        this.hayDefault = hayDefault;
        this.sentenciasDefault = sentenciasDefault;
    }
    
    @Override
    public void mostrar(PrintWriter lenguaje){
       lenguaje.println("switch ( " + selector + ") {");
        for(CasosClass casos: listaCasos){
            for(String etiqueta: casos.getEtiquetas()){
                lenguaje.print("\t" + "case "); 
                lenguaje.println(etiqueta + " :");
            }
            for(SentenciaClass sentencias: casos.getListaSentencias()){
                    lenguaje.print("\t\t");
                    sentencias.mostrar(lenguaje);
                }
                lenguaje.println("\t\tbreak;");
        }
        if(hayDefault){
            lenguaje.println("\tdefault:");
            for(SentenciaClass sentencia: sentenciasDefault){
                lenguaje.print("\t\t");
                sentencia.mostrar(lenguaje);
            }
        }
        lenguaje.println("\t}");
    }
}
