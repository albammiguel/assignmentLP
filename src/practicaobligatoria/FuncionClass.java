/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaobligatoria;

import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author albam
 */
public class FuncionClass {
    private String tipoDevuelto;
    private String nombre;
    private ArrayList <ParametroClass> listaParametros;
    /*para la implementación de funciones(clase Partes), no la DEFINICION(decFuns
    NO LA USA)
    */
    private ArrayList<SentenciaClass> listaSentencias;
    
    //CONSTRUCTORES
    public FuncionClass (String tipoDevuelto, String nombre, 
                        ArrayList<ParametroClass> listaParametros){
        this.tipoDevuelto = tipoDevuelto;
        this.nombre = nombre;
        this.listaParametros = listaParametros;
    }
    
    public FuncionClass (String nombre, 
                        ArrayList<ParametroClass> listaParametros){
        this.tipoDevuelto = null;
        this.nombre = nombre;
        this.listaParametros = listaParametros;
    }
    
    public FuncionClass(){
        this.tipoDevuelto = null;
        this.nombre = null;
        this.listaParametros = null;
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

    public ArrayList<SentenciaClass> getListaSentencias() {
        return listaSentencias;
    }

    public void setListaSentencias(ArrayList<SentenciaClass> listaSentencias) {
        this.listaSentencias = listaSentencias;
    }
    
    public void imprimirListaSentencias(PrintWriter lenguaje){
        String tabulacion ="\t";
        String llave_izq = "{";
        String llave_der = "}";
        
        lenguaje.println(llave_izq);
        listaSentencias.forEach((s)->{
            lenguaje.print(tabulacion);
            s.mostrar(lenguaje);}
        );
        lenguaje.println(llave_der);
    }
    
    public void imprimirListaParametros(PrintWriter lenguaje){
        String coma = ",";
        String corchete_izq = "[";
        String corchete_der = "]";
        String espacio = " ";
        String asterisco = "*";
        
        listaParametros.forEach((p)-> {
            if(p.getTipo().equals("char") && p.getTamañoChar() > 0){
                if(p.isSalida()){
                   lenguaje.print(p.getTipo() + espacio + asterisco +
                           p.getNombre()+ corchete_izq + corchete_der);
                }else{
                    lenguaje.print(p.getTipo() + espacio + p.getNombre()
                                 + corchete_izq + corchete_der);
                }
            }else{
                 if(p.isSalida()){
                    lenguaje.print(p.getTipo()+espacio+asterisco+p.getNombre());
                }else{
                    lenguaje.print(p.getTipo()+espacio+p.getNombre());
                }
            //comprobamos si es el último parametro o hay que seguir imprimiendo
            if(listaParametros.get(listaParametros.size()-1).equals(p)){
                   lenguaje.print(espacio);
            } else {lenguaje.print(coma+espacio);}
            }
            });
    }
 
}
