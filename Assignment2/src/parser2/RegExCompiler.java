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
	
	public static String getResult(DfaUnion dfa) {
		boolean isSubset = true;
		for(DfaUnionNode node : dfa.nodes) {
			if(node.node1.IsFinal != node.node2.IsFinal) {
				isSubset = false;
				break;
			}
		}
		if(isSubset) return "true";
		
		try {
			String start = "";
			getRejectedString(dfa.start, start);		
		} catch(Exception e) {
			return e.getMessage();
		}
		return "I am suck! I couln't find rejected String";
	}
	
	private static void getRejectedString(DfaUnionNode node, String result) throws Exception {
		if(node.node1.IsFinal != node.node2.IsFinal) {
			throw new Exception(result);
		}
		getRejectedString(node.On0, result + "0");
		getRejectedString(node.On1, result + "1");
		getRejectedString(node.On2, result + "2");		
	}
	
	
	
	public static DfaUnion getUnion(Dfa dfa1, Dfa dfa2) {
		DfaUnion dfa = new DfaUnion();
		DfaUnionNode start = new DfaUnionNode();
		start.node1 = dfa1.start;
		start.node2 = dfa2.start;
		dfa.nodes.add(start);
		getUnionTransition(start, dfa);
		
		return dfa;
	}
	
	private static void getUnionTransition(DfaUnionNode unionNode, DfaUnion dfa) {
		//on 0
		if(dfa.getNode(unionNode.node1.On0, unionNode.node2.On0) == null) {
			unionNode.On0 = new DfaUnionNode();
			unionNode.On0.node1 = unionNode.node1.On0;
			unionNode.On0.node2 = unionNode.node2.On0;
			dfa.nodes.add(unionNode.On0);
			getUnionTransition(unionNode.On0, dfa);
		} else {
			unionNode.On0 = dfa.getNode(unionNode.node1.On0, unionNode.node2.On0);
		}
		
		//on 1
		if(dfa.getNode(unionNode.node1.On1, unionNode.node2.On1) == null) {
			unionNode.On1 = new DfaUnionNode();
			unionNode.On1.node1 = unionNode.node1.On1;
			unionNode.On1.node2 = unionNode.node2.On1;
			dfa.nodes.add(unionNode.On1);
			getUnionTransition(unionNode.On1, dfa);
		} else {
			unionNode.On1 = dfa.getNode(unionNode.node1.On1, unionNode.node2.On1);
		}
				
		//on 2
		if(dfa.getNode(unionNode.node1.On2, unionNode.node2.On2) == null) {
			unionNode.On2 = new DfaUnionNode();
			unionNode.On2.node1 = unionNode.node1.On2;
			unionNode.On2.node2 = unionNode.node2.On2;
			dfa.nodes.add(unionNode.On2);
			getUnionTransition(unionNode.On2, dfa);
		} else {
			unionNode.On2 = dfa.getNode(unionNode.node1.On2, unionNode.node2.On2);
		}
	}
	
	public static Dfa getNotDfa(Dfa dfa) {
	
		Dfa notDfa = new Dfa();
		notDfa.start = dfa.start;
		for(DfaNode n : dfa.nodes) {
			n.IsFinal = !n.IsFinal;
			notDfa.nodes.add(n);
			if(n.IsFinal) {
				notDfa.end.add(n);
			}
		}
		return notDfa;
	}
	
	public static Dfa convertEnfaToDfa(Enfa enfa) {
		Dfa dfa = new Dfa();
		
		DfaNode start = new DfaNode();
		dfa.start = start;
		start.IsStart = true;
		start.nodes.add(enfa.start);
		
		discoverEtransitions(enfa.start, dfa.start);		
		
		dfa.nodes.add(dfa.start);
		
		discoverTransitions(dfa.start, dfa);
		
		for(DfaNode n : dfa.nodes) {
			if(isFinal(n.nodes)) {
				n.IsFinal = true;
				dfa.end.add(n);
			}
		}
		
		return dfa;
		
	}
	
	private static void discoverTransitions(DfaNode node, Dfa dfa) {
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
			if(isDiscovered(node.On0, dfa) == null) {
				dfa.nodes.add(node.On0);
				discoverTransitions(node.On0, dfa);
			} else {
				node.On0 = isDiscovered(node.On0, dfa);
			}
		}
		
		if(node.On1 != null) {
			if(isDiscovered(node.On1, dfa) == null) {
				dfa.nodes.add(node.On1);
				discoverTransitions(node.On1, dfa);
			} else {
				node.On1 = isDiscovered(node.On1, dfa);
			}
		}
		
		if(node.On2 != null) {
			if(isDiscovered(node.On2, dfa) == null) {
				dfa.nodes.add(node.On2);
				discoverTransitions(node.On2, dfa);
			} else {
				node.On2 = isDiscovered(node.On2, dfa);
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
	
	private static DfaNode isDiscovered(DfaNode node, Dfa dfa) {
		for(DfaNode discovered : dfa.nodes) {
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
