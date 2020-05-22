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
    
    public void imprimirListaParametros(){
        String coma = ",";
        String corchete_izq = "[";
        String corchete_der = "]";
        String espacio = " ";
        String asterisco = "*";
        
        listaParametros.forEach((p)-> {
            if(p.getTipo().equals("char") && p.getTamañoChar() > 0){
                if(p.isSalida()){
                   System.out.print(p.getTipo() + espacio + asterisco +
                           p.getNombre()+ corchete_izq + corchete_der);
                }else{
                    System.out.print(p.getTipo() + espacio + p.getNombre()
                                 + corchete_izq + corchete_der);
                }
            }else{
                 if(p.isSalida()){
                    System.out.print(p.getTipo()+espacio+asterisco+p.getNombre());
                }else{
                    System.out.print(p.getTipo()+espacio+p.getNombre());
                }
            //comprobamos si es el último parametro o hay que seguir imprimiendo
            if(listaParametros.get(listaParametros.size()-1).equals(p)){
                   System.out.print(espacio);
            } else {System.out.print(coma+espacio);}
            }
            });
    }
 
}
