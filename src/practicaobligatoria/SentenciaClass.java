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
public abstract class SentenciaClass {
    //ATRIBUTOS
    private String tipoSentencia;
    
    //CONSTRUCTORES
    public SentenciaClass(String tipoSentencia){
        this.tipoSentencia = tipoSentencia;
    }

    public String getTipoSentencia() {
        return tipoSentencia;
    }
    
    //METODOS
    public abstract void mostrar(PrintWriter lenguaje, String tabulacion);
    
}
