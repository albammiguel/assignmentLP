/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaobligatoria;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author albam
 */
public class ProgramaFinalClass {
    private boolean esError;
    private DefinesClass defines; 
    private DecFunsClass decfuns;
    private PartesClass partes;
    private ArrayList<SentenciaClass> sentenciasMain;
    
    //CONSTRUCTORES
    public ProgramaFinalClass(){
        this.defines = null;
        this.decfuns = null;
        this.partes = null;
        this.esError = false;
        this.sentenciasMain = new ArrayList<SentenciaClass>();
    }
    
    public boolean isEsError() {
        return esError;
    }

    public void setEsError(boolean esError) {
        this.esError = esError;
    } 
    public DefinesClass getDefines() {
        return defines;
    }

    public void setDefines(DefinesClass defines) {
        this.defines = defines;
    }

    public DecFunsClass getDecfuns() {
        return decfuns;
    }

    public void setDecfuns(DecFunsClass decfuns) {
        this.decfuns = decfuns;
    }

    public PartesClass getPartes() {
        return partes;
    }

    public void setPartes(PartesClass partes) {
        this.partes = partes;
    }
    
    

    public ArrayList<SentenciaClass> getSentenciasMain() {
        return sentenciasMain;
    }

    public void setSentenciasMain(ArrayList<SentenciaClass> sentenciasMain) {
        this.sentenciasMain = sentenciasMain;
    }
    
    
    
    public void generarFichero(String nombreFichero) throws IOException{
        String vacio = "void";
        String main = "main";
        String tabulacion = "\t";
        String llave_izq = "{";
        String llave_der = "}";
        String parentesis_izq = "(";
        String parentesis_der = ")";
        String espacio = " ";
        if(!isEsError()){
            FileWriter ficheroSalida = new FileWriter(nombreFichero);
            BufferedWriter buffer = new BufferedWriter(ficheroSalida);
            PrintWriter lenguaje = new PrintWriter(buffer);
            if(!defines.getListaConstantes().isEmpty())
                {defines.imprimir(lenguaje);
                lenguaje.println();}
            if(!decfuns.getListaFunciones().isEmpty())
                {decfuns.imprimir(lenguaje);
                lenguaje.println();}
            if(!partes.getListaImplementacionFunciones().isEmpty())
                {partes.imprimir(lenguaje);
                lenguaje.println();}

            if(!sentenciasMain.isEmpty()){
                lenguaje.println(vacio + espacio + main + espacio + parentesis_izq 
                                  + espacio + vacio + espacio + parentesis_der);
                lenguaje.println(llave_izq);
                sentenciasMain.forEach((s) -> {
                     s.mostrar(lenguaje);});
                lenguaje.println(llave_der);
                
            lenguaje.close();

            }
        } else {
            System.err.println("El fichero de entrada tiene un error semántico. Inténtelo de nuevo");
        }
        
        

    }   
}
