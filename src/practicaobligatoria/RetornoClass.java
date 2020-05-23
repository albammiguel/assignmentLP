/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaobligatoria;

import java.io.PrintWriter;

/**
 *
 * @author albam
 */
public class RetornoClass extends SentenciaClass {
    private String expresionRetorno;
    
    //CONSTRUCTORES
    public RetornoClass (String tipoSentencia, String expresionRetorno){
        super(tipoSentencia);
        this.expresionRetorno = expresionRetorno;
    }
    
    @Override
    public void mostrar(PrintWriter lenguaje){
        lenguaje.println("return" + " " + expresionRetorno);
    }
    
}
