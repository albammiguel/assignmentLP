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
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            // Preparar el fichero de entrada para asignarlo al analizador léxico
            CharStream input = CharStreams.fromFileName(args[0]);
            // Crear el objeto correspondiente al analizador léxico con el fichero de entrada
            /*String modoDepuracion = args[1];
            boolean depuracion = modoDepuracion.equals("s");*/
            boolean depuracion = true;
            ListaTokensDetectadosClass depurador = new ListaTokensDetectadosClass(depuracion);
            practicaObligatoriaLexer analex = new practicaObligatoriaLexer(input, depurador);
            // Identificar al analizador léxico como fuente de tokens para el sintactico
            CommonTokenStream tokens = new CommonTokenStream(analex);
            ProgramaFinalClass lenguajeFinal = new ProgramaFinalClass();
            practicaObligatoriaParser anasint = new 
                        practicaObligatoriaParser(tokens, lenguajeFinal);
            
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
                lenguajeFinal.mostrar();
            
        } catch (org.antlr.v4.runtime.RecognitionException e) { 
            //Fallo al reconocer la entrada    
            System.err.println("REC " + e.getMessage());
        }catch (IOException e) { 
            //Fallo de entrada/salida   
            System.err.println("IO " + e.getMessage());
        } catch (java.lang.RuntimeException e) { 
            //CUalquier otro fallo    
            System.err.println("RUN " + e.getMessage());      
        } 
            
    }     
    
}