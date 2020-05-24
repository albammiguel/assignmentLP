/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaobligatoria;

import java.util.Collections;
import java.util.List;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;

/**
 *
 * @author albam
 */
public class VerboseListener extends BaseErrorListener {
    @Override 
    public void syntaxError(Recognizer<?, ?> recognizer, 
            Object offendingSymbol, int line, int charPositionInLine, 
            String msg, RecognitionException e){
        
        List<String> stack = ((Parser)recognizer).getRuleInvocationStack(); 
        Collections.reverse(stack); 
        System.err.println("--SE HA PRODUCIDO UN ERROR--");
        System.err.println("Reglas de la gramatica: "+stack); 
        System.err.println("Linea "+line+":"+charPositionInLine+
                            " en "+ offendingSymbol+": "+msg);
        underlineError(recognizer,(Token)offendingSymbol, line, charPositionInLine);

    }
    
    protected void underlineError(Recognizer recognizer, Token offendingToken, int line, int charPositionInLine) 
    { CommonTokenStream tokens = (CommonTokenStream)recognizer.getInputStream(); 
    String input = tokens.getTokenSource().getInputStream().toString(); 
    String[] lines = input.split("\n"); 
    String errorLine = lines[line - 1]; 
    System.err.println(errorLine); 
    for (int i=0; i<charPositionInLine; i++) System.err.print(" "); 
    int start = offendingToken.getStartIndex(); 
    int stop = offendingToken.getStopIndex(); 
    if ( start>=0 && stop>=0 ) 
    { 
        for (int i=start; i<=stop; i++) System.err.print("^"); 
    } 
    System.err.println(); }
    
}
