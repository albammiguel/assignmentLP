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
public class LlamadaClass extends SentenciaClass {
    private String nombre;
    boolean esProcedimiento;
    ArrayList <String> listaInputs;
    public LlamadaClass(String tipoSentencia, boolean esProcedimiento, 
            String nombre, ArrayList<String> listaInputs){
        super(tipoSentencia);
        this.nombre = nombre;
        this.esProcedimiento = esProcedimiento;
        this.listaInputs= listaInputs;
    }
    
    @Override
    public void mostrar(){}
    
}
