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
public class EstructuraDoWhileClass extends SentenciaClass {
    private String condicion;
    private ArrayList<SentenciaClass> listaSentencias;
    
    public EstructuraDoWhileClass(String tipoSentencia, String condicion,
            ArrayList<SentenciaClass> listaSentencias){
        super(tipoSentencia);
        this.condicion = condicion;
        this.listaSentencias = listaSentencias;
    }
    
    @Override
    public void mostrar(){}
}
