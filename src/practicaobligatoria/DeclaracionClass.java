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
public class DeclaracionClass extends SentenciaClass {
    private ArrayList<VariableClass> listaVariablesDeclaradas;
    
    public DeclaracionClass(String tipoSentencia, 
            ArrayList<VariableClass> listaVariablesDeclaradas){
        super(tipoSentencia);
        this.listaVariablesDeclaradas = listaVariablesDeclaradas;
    }
    
    @Override
    public void mostrar(){}
    
}
