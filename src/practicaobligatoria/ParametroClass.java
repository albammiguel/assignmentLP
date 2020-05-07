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
public class ParametroClass {
    private String tipo;
    private String nombre;
    private boolean entrada;
    private boolean salida;
    
    public ParametroClass(String tipo, String nombre, boolean entrada, boolean salida){
        this.tipo = tipo;
        this.nombre = nombre;
        this.entrada = entrada;
        this.salida = salida;
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
    
    
  
    
}
