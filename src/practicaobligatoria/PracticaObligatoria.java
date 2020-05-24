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

import java.io.*; 
import org.antlr.v4.runtime.*; 
public class PracticaObligatoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        try{
            // Preparar el fichero de entrada para asignarlo al analizador léxico
            CharStream input = CharStreams.fromFileName(args[0]);
            String nombreFichero = args[0].substring(0, args[0].length()-3).concat("c");
            // Crear el objeto correspondiente al analizador léxico con el fichero de entrada
            boolean depuracion = false;
            if(args.length == 2){
                String modoDepuracion = args[1];
                depuracion = modoDepuracion.equals("-d");
            }else{System.out.println("Para entrar en la depuración de tokens, añade -d");}
            ListaTokensDetectadosClass depurador = new ListaTokensDetectadosClass(depuracion);
            practicaObligatoriaLexer analex = new practicaObligatoriaLexer(input, depurador);
            analex.removeErrorListeners();
            analex.addErrorListener(new VerboseListener());
            // Identificar al analizador léxico como fuente de tokens para el sintactico
            CommonTokenStream tokens = new CommonTokenStream(analex);
            ProgramaFinalClass lenguajeFinal = new ProgramaFinalClass();
            practicaObligatoriaParser anasint = new 
                        practicaObligatoriaParser(tokens, lenguajeFinal);
            anasint.removeErrorListeners();
            anasint.addErrorListener(new VerboseListener());
            
            /*
                Comenzar el análisis llamando al axioma de la gramática
            */
		anasint.prg();
            // Llamar al método para sacar el resumen del analizador léxico.
		depurador.mostrarLista();
            /*
                Llamar al método para imprimir el código del lenguaje final que
                será posteriormente recogido en un fichero .bat
            */
             
                lenguajeFinal.generarFichero(nombreFichero);
            
        } catch (org.antlr.v4.runtime.RecognitionException e) { 
            //Fallo al reconocer la entrada    
            System.err.println("REC " + e.getMessage());
        }catch (IOException e) { 
            //Fallo de entrada/salida   
            System.err.println("IO " + e.getMessage());
        } catch (java.lang.RuntimeException e) { 
            //CUalquier otro fallo  
            if(e.getMessage() == null){
            System.err.println("\nHay un error sintáctico o léxico en el fichero "
                    + "de entrada, no se ha podido realizar la traduccion. Inténtelo de nuevo");
            } else if (e.getMessage().equals("0")){
                System.err.println("\nNo especificado fichero de entrada. Inténtelo de nuevo");
            }
        } 
            
    }     
    
}