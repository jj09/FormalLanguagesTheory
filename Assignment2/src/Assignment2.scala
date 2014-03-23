import logic.RegExpAnalyzer
import parser2._
import org.antlr.runtime.ANTLRStringStream
import org.antlr.runtime.CommonTokenStream
import org.antlr.runtime.RecognitionException
import org.antlr.runtime.TokenStream
import org.antlr.runtime.tree.CommonTree;




object Assignment2 {

  def main(args: Array[String]): Unit = {
    val regEx1: String = "(01+1)*"
    var regEx2: String = "(01+1+0)*"
    
    val rea = new RegExpAnalyzer
    var result = rea.check(regEx1, regEx2) 
    
    println(result)
     
    println("done")
    
  } 
  
  
  
  

}