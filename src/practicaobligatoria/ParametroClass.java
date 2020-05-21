/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaobligatoria;

import java.util.Objects;

/**
 *
 * @author albam
 */
public class ParametroClass {
    private String tipo;
    private String nombre;
    private int tamañoChar;
    private boolean entrada;
    private boolean salida;
    
    public ParametroClass(String nombre){
        this.nombre = nombre;
        this.tipo = null;
        this.tamañoChar = 0;
        this.entrada = false;
        this.salida = false;
        
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

    public int getTamañoChar() {
        return tamañoChar;
    }

    public void setTamañoChar(int tamañoChar) {
        this.tamañoChar = tamañoChar;
    }

    public boolean isEntrada() {
        return entrada;
    }

    public void setEntrada(boolean entrada) {
        this.entrada = entrada;
    }

    public boolean isSalida() {
        return salida;
    }

    public void setSalida(boolean salida) {
        this.salida = salida;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ParametroClass other = (ParametroClass) obj;
        if (this.tamañoChar != other.tamañoChar) {
            return false;
        }
        if (this.entrada != other.entrada) {
            return false;
        }
        if (this.salida != other.salida) {
            return false;
        }
        if (!Objects.equals(this.tipo, other.tipo)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }

}
