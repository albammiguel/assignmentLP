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
    private String identificador;
    private String valor;
    
    public AsignacionClass(String tipoSentencia, String identificador, String valor){
        super(tipoSentencia);
        this.identificador = identificador;
        this.valor = valor;
    }
    
    @Override
    public void mostrar(){
        System.out.println(identificador + " = " + valor + ";");
    }
    
}
