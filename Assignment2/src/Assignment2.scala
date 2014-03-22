import logic.RegExpAnalyzer
import parser2._


import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.CommonTree;



object Assignment2 {

  def main(args: Array[String]): Unit = {    
    val enfa = getEnfa("(01+1)*")
    
    println("done")
    
  } 
  
  def getEnfa(regEx: String): Enfa = {
    return RegExCompiler.getEnfa(regEx)    
  }
  

}