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
public class EstructuraDoClass extends SentenciaClass {
    private String identificador;
    private String valorInicial;
    private String valorFinal;
    private String incremento;
    private ArrayList<SentenciaClass> listaSentencias;
    
    public EstructuraDoClass(String tipoSentencia, String identificador, 
            String valorInicial, String valorFinal, String incremento,
            ArrayList<SentenciaClass> listaSentencias){
        
        super(tipoSentencia);
        this.identificador = identificador;
        this.valorInicial = valorInicial;
        this.valorFinal = valorFinal;
        this.incremento = incremento;
        this.listaSentencias = listaSentencias;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getValorInicial() {
        return valorInicial;
    }

    public void setValorInicial(String valorInicial) {
        this.valorInicial = valorInicial;
    }

    public String getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(String valorFinal) {
        this.valorFinal = valorFinal;
    }

    public String getIncremento() {
        return incremento;
    }

    public void setIncremento(String incremento) {
        this.incremento = incremento;
    }

    public ArrayList<SentenciaClass> getListaSentencias() {
        return listaSentencias;
    }

    public void setListaSentencias(ArrayList<SentenciaClass> listaSentencias) {
        this.listaSentencias = listaSentencias;
    }
    
    
    
    @Override
    public void mostrar(PrintWriter lenguaje){
        lenguaje.println("for(" + identificador + "=" + 
                valorInicial + " ; " + identificador + "!=" + 
                valorFinal + " ; " + identificador + "=" 
                + identificador + "+" + incremento + ") {");
        for(SentenciaClass sentencias: listaSentencias){
            lenguaje.print("\t");
            sentencias.mostrar(lenguaje);
        }
        lenguaje.println("}");
    }
    
}
