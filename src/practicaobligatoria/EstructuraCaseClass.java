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
public class EstructuraCaseClass extends SentenciaClass{
    private String selector;
    private ArrayList<CasosClass> listaCasos;
    
    public EstructuraCaseClass(String tipoSentencia, String selector,
            ArrayList<CasosClass> listaCasos){
        super(tipoSentencia);
        this.selector = selector;
        this.listaCasos = listaCasos;
    }
    
    @Override
    public void mostrar(){}
    
}
