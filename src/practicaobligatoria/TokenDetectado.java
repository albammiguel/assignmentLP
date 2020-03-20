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
    private String tipoToken;
    private boolean detectado;
    
    //CONSTRUCTOR
    public TokenDetectado(boolean aceptado, String texto, String tipo){
        detectado = aceptado;
        infoToken = texto;
        tipoToken = tipo;
    }
    
    //GETTERS
    public String getInfoToken(){
        return infoToken;
    }
    
     public boolean getDetectado(){
        return detectado;
    } 
    
    public String getTipoToken(){
        return tipoToken;
    }
}
