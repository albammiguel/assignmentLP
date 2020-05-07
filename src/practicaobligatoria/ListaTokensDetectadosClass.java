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
public class ListaTokensDetectadosClass {
    private ArrayList<TokenDetectadoClass> listaTokens;
    //CONSTRUCTORES
    public ListaTokensDetectadosClass(){
        listaTokens = new ArrayList <TokenDetectadoClass> ();   
    }
    
    //GETTERS
    public ArrayList<TokenDetectadoClass> getLista(){
        return listaTokens;
    }
    
    //METODOS
    
    public void añadirToken(TokenDetectadoClass token){
        listaTokens.add(token);
    }
    
    public void mostrarLista(){
         System.out.println("Los tokens detectados son:");
         for (TokenDetectadoClass t: getLista()){
            if (t.getDetectado()==true)
                System.out.println("Tipo: " + t.getTipoToken()+ " " 
                        + "Contenido: " + t.getInfoToken());
        }
    }
    
    
}
