import logic.RegExpAnalyzer
import parser2._


import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.CommonTree;



object Assignment2 {

  def main(args: Array[String]): Unit = {    
    val dfa = getDfa("(01+1)*")
    
    //val dfa = convertEnfaToDfa(enfa)
     
    println("done")
    
  } 
  
  def getDfa(regEx: String): Dfa = {
    return RegExCompiler.getDfa(regEx)    
  }
   
  

}