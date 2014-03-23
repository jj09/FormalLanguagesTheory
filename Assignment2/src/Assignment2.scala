import logic.RegExpAnalyzer
import parser2._


import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.CommonTree;



object Assignment2 {

  def main(args: Array[String]): Unit = {    
    val dfa1 = getDfa("(01+1)*")
    var dfa2 = getDfa("(01+1)*")
    dfa2 = getNotDfa(dfa2)
    
    var union = getUnion(dfa1, dfa2)
    
    println(getResult(union))    
    
    //val dfa = convertEnfaToDfa(enfa)
     
    println("done")
    
  } 
  
  def getDfa(regEx: String): Dfa = {
    return RegExCompiler.getDfa(regEx)    
  }  
  
  def getNotDfa(dfa: Dfa): Dfa = {
    return RegExCompiler.getNotDfa(dfa);
  }
  
  def getUnion(dfa1: Dfa, dfa2: Dfa): DfaUnion = {
    return RegExCompiler.getUnion(dfa1, dfa2);
  }
  
  def getResult(unionDfa: DfaUnion): String = {
    return RegExCompiler.getResult(unionDfa);
  }

}