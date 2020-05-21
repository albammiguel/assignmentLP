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
public class AsignacionClass extends SentenciaClass {
    private ParametroClass parametro;
    private String valor;
    
    public AsignacionClass(String tipoSentencia, ParametroClass parametro, String valor){
        super(tipoSentencia);
        this.parametro = parametro;
        this.valor = valor;
    }
    
    @Override
    public void mostrar(){}
    
}
