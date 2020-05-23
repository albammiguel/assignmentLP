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
    private ArrayList<String> etiquetas;
    private ArrayList<SentenciaClass> listaSentencias;
    
    public CasosClass(ArrayList<String>etiquetas, ArrayList<SentenciaClass> listaSentencias){
        this.etiquetas = etiquetas;
        this.listaSentencias = listaSentencias;
    }

    public ArrayList<String> getEtiquetas() {
        return etiquetas;
    }
    public void setEtiquetas(ArrayList<String> etiqueta) {
        this.etiquetas = etiqueta;
    }

    

    public ArrayList<SentenciaClass> getListaSentencias() {
        return listaSentencias;
    }

    public void setListaSentencias(ArrayList<SentenciaClass> listaSentencias) {
        this.listaSentencias = listaSentencias;
    }
    
    
    
}
