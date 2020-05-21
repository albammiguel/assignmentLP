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
public class CasosClass {
    private String valor;
    private ArrayList<SentenciaClass> listaSentencias;
    
    public CasosClass(String valor, ArrayList<SentenciaClass> listaSentencias){
        this.valor = valor;
        this.listaSentencias = listaSentencias;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public ArrayList<SentenciaClass> getListaSentencias() {
        return listaSentencias;
    }

    public void setListaSentencias(ArrayList<SentenciaClass> listaSentencias) {
        this.listaSentencias = listaSentencias;
    }
    
    
    
}
