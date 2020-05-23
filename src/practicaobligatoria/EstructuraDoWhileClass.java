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
public class EstructuraDoWhileClass extends SentenciaClass {
    private String condicion;
    private ArrayList<SentenciaClass> listaSentencias;
    
    public EstructuraDoWhileClass(String tipoSentencia, String condicion,
            ArrayList<SentenciaClass> listaSentencias){
        super(tipoSentencia);
        this.condicion = condicion;
        this.listaSentencias = listaSentencias;
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }

    public ArrayList<SentenciaClass> getListaSentencias() {
        return listaSentencias;
    }

    public void setListaSentencias(ArrayList<SentenciaClass> listaSentencias) {
        this.listaSentencias = listaSentencias;
    }
    
    
    @Override
    public void mostrar(PrintWriter lenguaje){
        lenguaje.println("while (" + condicion + ") {");
            for(SentenciaClass sentencias: listaSentencias){
                lenguaje.print("\t");
                sentencias.mostrar(lenguaje);
            }
            lenguaje.println("\t}");
    }
}
