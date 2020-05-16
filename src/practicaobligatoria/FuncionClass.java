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
    private String tipoDevuelto;
    private String nombre;
    private ArrayList <ParametroClass> listaParametros;
    
    public FuncionClass (String tipoDevuelto, String nombre, 
                        ArrayList<ParametroClass>listaParametros){
        this.tipoDevuelto = tipoDevuelto;
        this.nombre = nombre;
        this.listaParametros = listaParametros;
    }
    
    public FuncionClass (String nombre, 
                        ArrayList<ParametroClass>listaParametros){
        this.tipoDevuelto = null;
        this.nombre = nombre;
        this.listaParametros = listaParametros;
    }

    public String getTipoDevuelto() {
        return tipoDevuelto;
    }

    public void setTipoDevuelto(String tipoDevuelto) {
        this.tipoDevuelto = tipoDevuelto;
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
