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
public class TokenDetectado {
    //ATRIBUTOS
    private String infoToken;
    private boolean detectado;
    
    //CONSTRUCTOR
    public TokenDetectado(boolean aceptado, String texto){
        detectado = aceptado;
        infoToken = texto;
    }
    
    //GETTERS
    public String getInfoToken(){
        return infoToken;
    }
    
     public boolean getDetectado(){
        return detectado;
    } 
}
