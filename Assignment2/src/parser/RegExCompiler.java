package parser;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.CommonTree;

public class RegExCompiler {
	
	public static CommonTree getAst(String regEx) {
	    try {
	      //lexer splits input into tokens
	      ANTLRStringStream input = new ANTLRStringStream(regEx);
	      TokenStream tokens = new CommonTokenStream( new RegExLexer( input ) );
	  
	      //parser generates abstract syntax tree
	      RegExParser parser = new RegExParser(tokens);
	      RegExParser.exp_return ret = parser.exp();
	  
	      //acquire parse result
	      CommonTree ast = (CommonTree) ret.tree;
	      //printTree(ast);
	      return ast;
	    } catch (RecognitionException e) {
	      throw new IllegalStateException("Recognition exception is never thrown, only declared.");
	  }
	}
	
	public static void printTree(CommonTree ast) {
		print(ast, 0);
	}

	private static void print(CommonTree tree, int level) {
		//indent level
		for (int i = 0; i < level; i++)
			System.out.print("--");

		//print node description: type code followed by token text
		System.out.println(" " + tree.getType() + " " + tree.getText());

		//print all children
		if (tree.getChildren() != null)
			for (Object ie : tree.getChildren()) {
				print((CommonTree) ie, level + 1);
			}
	}
}
