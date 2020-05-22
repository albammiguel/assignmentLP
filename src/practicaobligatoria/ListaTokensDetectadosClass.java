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
    boolean esDepuracion;
    //CONSTRUCTORES
    public ListaTokensDetectadosClass(boolean esDepuracion){
        listaTokens = new ArrayList <TokenDetectadoClass> ();   
        this.esDepuracion = esDepuracion;
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
        if(esDepuracion){
            System.out.println("Los tokens detectados son:");
            for (TokenDetectadoClass t: getLista()){
               if (t.getDetectado()==true)
                   System.out.println("Tipo: " + t.getTipoToken()+ " " 
                           + "Contenido: " + t.getInfoToken());
           }
       }
    }
    
    
}
