/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaobligatoria;

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
    
    //METDOSO
    public abstract void mostrar();
    
}
