import logic.RegExpAnalyzer
import parser._

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.CommonTree;



object Assignment2 {

  def main(args: Array[String]): Unit = {
//    print("Enter E1: ")
//    val e1 = readLine()
//    
//    print("Enter E2: ")
//    val e2 = readLine()
//    
//    val rea = new RegExpAnalyzer
//    
//    if (rea.compare(e1,e2)) {
//      println("yes")
//    } else {
//      println("no")
//    }    
    
    compile
    //println(ast)
    
  } 
  
  def compile {
    //val rec = new RegExCompiler()
    val ast = RegExCompiler.getAst("(0+1)*")
    RegExCompiler.printTree(ast)
  }
  
//  def printTree(ast: CommonTree) {
//		print(ast, 0);
//	}
//
//	def printRec(tree: CommonTree, level: Int) {
//		//indent level
//		for (i <- 0 until level) {
//			print("--")
//		}
//
//		//print node description: type code followed by token text
//		println(" " + tree.getType() + " " + tree.getText());
//
//		//print all children
//		if (tree.getChildren() != null) {
//		  val list = tree.getChildren();
//		  for (var ie <- list.toArray()) {
//			printRec(ie, level + 1);
//		  }
//		}
//	}

}