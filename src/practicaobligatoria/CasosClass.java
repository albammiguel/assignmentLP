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
    private ArrayList<String> etiqueta;
    private ArrayList<SentenciaClass> listaSentencias;
    
    public CasosClass(String etiqueta, ArrayList<SentenciaClass> listaSentencias){
        this.etiqueta = new ArrayList<String>();
        this.listaSentencias = listaSentencias;
    }

    public ArrayList<String> getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(ArrayList<String> etiqueta) {
        this.etiqueta = etiqueta;
    }

    

    public ArrayList<SentenciaClass> getListaSentencias() {
        return listaSentencias;
    }

    public void setListaSentencias(ArrayList<SentenciaClass> listaSentencias) {
        this.listaSentencias = listaSentencias;
    }
    
    
    
}
