import logic.RegExpAnalyzer
import parser2._
import org.antlr.runtime.ANTLRStringStream
import org.antlr.runtime.CommonTokenStream
import org.antlr.runtime.RecognitionException
import org.antlr.runtime.TokenStream
import org.antlr.runtime.tree.CommonTree;

object Assignment2 {

  def main(args: Array[String]): Unit = {
    val regEx1: String = "(0(0+2)*+1)*+2+12+(00+21)*+0000110102"
    var regEx2: String = "(0+1+2)*"
    
    val rea = new RegExpAnalyzer
    var result = rea.check(regEx1, regEx2) 
    
    println(result)
     
    println("done")
    
  }
}