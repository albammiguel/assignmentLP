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
    
    @Override
    public void mostrar(){}
    
}
