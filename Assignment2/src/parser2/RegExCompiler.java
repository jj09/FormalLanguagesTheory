package parser2;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.util.ArrayList;
import java.util.Set;

public class RegExCompiler {

	public static Dfa getDfa(String regEx) {

		// create a CharStream that reads from standard input
		ANTLRInputStream input = new ANTLRInputStream(regEx);

		// create a lexer that feeds off of input CharStream
		RegExLexer lexer = new RegExLexer(input);

		// create a buffer of tokens pulled from the lexer
		CommonTokenStream tokens = new CommonTokenStream(lexer);

		// create a parser that feeds off the tokens buffer
		RegExParser parser = new RegExParser(tokens);

		ParseTree tree = parser.exp(); // begin parsing at init rule

		RegExExtendedVisitor rev = new RegExExtendedVisitor();

		rev.visit(tree);

		return convertEnfaToDfa(rev.finalEnfa);

	}
	
	private static ArrayList<DfaNode> discoveredNodes;
	
	public static Dfa convertEnfaToDfa(Enfa enfa) {
		Dfa dfa = new Dfa();
		
		DfaNode start = new DfaNode();
		dfa.start = start;
		start.IsStart = true;
		start.nodes.add(enfa.start);
		
		discoverEtransitions(enfa.start, dfa.start);		
		
		discoveredNodes = new ArrayList<DfaNode>();
		discoveredNodes.add(dfa.start);
		
		discoverTransitions(dfa.start);
		
		for(DfaNode n : discoveredNodes) {
			if(isFinal(n.nodes)) {
				n.IsFinal = true;
				dfa.end.add(n);
			}
		}
		
		return dfa;
		
	}
	
	private static void discoverTransitions(DfaNode node) {
		for(Node n : node.nodes) {
			for(Node n0 : n.On0) {
				if(node.On0==null) node.On0 = new DfaNode();
				node.On0.nodes.add(n0);
				discoverEtransitions(n0, node.On0);
			}			
			
			for(Node n1 : n.On1) {
				if(node.On1==null) node.On1 = new DfaNode();
				node.On1.nodes.add(n1);
				discoverEtransitions(n1, node.On1);
			}			
			
			for(Node n2 : n.On2) {
				node.On2.nodes.add(n2);
				discoverEtransitions(n2, node.On2);
			}			
		}
		
		if(node.On0 != null) {
			if(isDiscovered(node.On0) == null) {
				discoveredNodes.add(node.On0);
				discoverTransitions(node.On0);
			} else {
				node.On0 = isDiscovered(node.On0);
			}
		}
		
		if(node.On1 != null) {
			if(isDiscovered(node.On1) == null) {
				discoveredNodes.add(node.On1);
				discoverTransitions(node.On1);
			} else {
				node.On1 = isDiscovered(node.On1);
			}
		}
		
		if(node.On2 != null) {
			if(isDiscovered(node.On2) == null) {
				discoveredNodes.add(node.On2);
				discoverTransitions(node.On2);
			} else {
				node.On2 = isDiscovered(node.On2);
			}
		}
	}
	
	private static void discoverEtransitions(Node node, DfaNode state) {
		for(Node n : node.OnE) {
			if (state.nodes.contains(n)==false) {
				state.nodes.add(n);
				if(n.IsFinal) state.IsFinal = true;
				discoverEtransitions(n, state);
			}
		}
	}
	
	private static DfaNode isDiscovered(DfaNode node) {
		for(DfaNode discovered : discoveredNodes) {
			boolean containsAll = true;
			for(Node n : node.nodes) {
				if(!discovered.nodes.contains(n)) containsAll = false;
			}
			if(containsAll && node.nodes.size() == discovered.nodes.size()) return discovered;
		}
		return null;
	}
	
	private static boolean isFinal(Set<Node> state) {
		for(Node n : state) {
			if(n.IsFinal) return true;
		}
		return false;
	}

}
