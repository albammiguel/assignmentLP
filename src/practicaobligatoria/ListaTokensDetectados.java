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
public class ListaTokensDetectados {
    private ArrayList<TokenDetectado> listaTokens;
    //CONSTRUCTORES
    public ListaTokensDetectados(){
        listaTokens = new ArrayList <TokenDetectado> ();   
    }
    
    //GETTERS
    public ArrayList<TokenDetectado> getLista(){
        return listaTokens;
    }
    
    //METODOS
    
    public void añadirToken(TokenDetectado token){
        listaTokens.add(token);
    }
    
    public void mostrarLista(){
         System.out.println("Los tokens detectados son:");
         for (TokenDetectado t: getLista()){
            if (t.getDetectado()==true)
                System.out.println(t.getInfoToken());
        }
    }
    
    
}
