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
public class VariableClass {
    private String tipo;
    private String nombre;
    private int tamañoChar;
    private String valor;
    
    public VariableClass(String nombre, String valor){
        this.tipo = null;
        this.nombre = nombre;
        this.tamañoChar = 0;
        this.valor = valor;
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

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
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
        final VariableClass other = (VariableClass) obj;
        if (this.tamañoChar != other.tamañoChar) {
            return false;
        }
        if (!Objects.equals(this.tipo, other.tipo)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.valor, other.valor)) {
            return false;
        }
        return true;
    }
    
    
    
}
