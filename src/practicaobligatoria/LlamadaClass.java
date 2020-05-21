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
    private boolean esProcedimiento;
    private String nombre;
    ArrayList <ParametroClass> listaParametros;
    
    public LlamadaClass(String tipoSentencia, boolean esProcedimiento, 
            String nombre, ArrayList<ParametroClass> listaParametros){
        super(tipoSentencia);
        this.esProcedimiento = esProcedimiento;
        this.nombre = nombre;
        this.listaParametros = listaParametros;
    }
    
    @Override
    public void mostrar(){}
    
}
