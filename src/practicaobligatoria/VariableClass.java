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
public class VariableClass {
    private String tipo;
    private String nombre;
    private int tamañoChar;
    private String valor;
    
    public VariableClass(String tipo, String nombre, int tamañoChar, String valor){
        this.tipo = tipo;
        this.nombre = nombre;
        this.tamañoChar = tamañoChar;
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
    
    
    
}
