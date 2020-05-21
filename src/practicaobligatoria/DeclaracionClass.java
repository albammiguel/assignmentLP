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
public class DeclaracionClass extends SentenciaClass {
    private ParametroClass parametro;
    
    public DeclaracionClass(String tipoSentencia, ParametroClass parametro){
        super(tipoSentencia);
        this.parametro = parametro;
    }
    
    @Override
    public void mostrar(){}
    
}
