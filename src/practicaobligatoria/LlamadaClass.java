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
public class LlamadaClass extends SentenciaClass {
    private String nombre;
    private String listaInputs;
    public LlamadaClass(String tipoSentencia, 
            String nombre, String listaInputs){
        super(tipoSentencia);
        this.nombre = nombre;
        this.listaInputs= listaInputs;
    }
    
    @Override
    public void mostrar(PrintWriter lenguaje){
    lenguaje.println(nombre+ " " + listaInputs + ";");}
    
}
