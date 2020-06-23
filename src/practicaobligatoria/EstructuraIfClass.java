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
public class EstructuraIfClass extends SentenciaClass{
    private String condicion;
    private ArrayList<SentenciaClass> sentenciasIf;
    private ArrayList<SentenciaClass> sentenciasElse;
    
    public EstructuraIfClass(String tipoSentencia, String condicion, 
            ArrayList<SentenciaClass> sentenciasIf,
            ArrayList<SentenciaClass> sentenciasElse){
        super(tipoSentencia);
        this.condicion = condicion;
        this.sentenciasIf = sentenciasIf;
        this.sentenciasElse = sentenciasElse;
    }
    
    @Override
    public void mostrar(PrintWriter lenguaje, String tabulacion){
        String tabulacionSentencias = tabulacion + "\t";
        lenguaje.print(tabulacion);
        lenguaje.println("if (" + condicion +") {");
        for(SentenciaClass sentencia: sentenciasIf){
                sentencia.mostrar(lenguaje, tabulacionSentencias);
        }
        lenguaje.print(tabulacion + "}");
        if(!sentenciasElse.isEmpty()){
            lenguaje.println("else{");
            for(SentenciaClass sentencias: sentenciasElse){
                sentencias.mostrar(lenguaje, tabulacionSentencias);
            }
            lenguaje.print(tabulacion + "}");
        }
        lenguaje.println();
    }
    
    
}
