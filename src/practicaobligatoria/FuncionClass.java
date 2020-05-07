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
public class FuncionClass {
    private String tipo;
    private String nombre;
    private ArrayList <ParametroClass> listaParametros;
    
    public FuncionClass (String tipo, String nombre){
        this.tipo = tipo;
        this.nombre = nombre;
        listaParametros = new ArrayList<ParametroClass>();
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<ParametroClass> getListaParametros() {
        return listaParametros;
    }

    public void setListaParametros(ArrayList<ParametroClass> listaParametros) {
        this.listaParametros = listaParametros;
    }
    
    
}
