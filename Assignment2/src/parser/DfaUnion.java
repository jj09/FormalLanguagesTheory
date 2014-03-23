package parser;

import java.util.ArrayList;

public class DfaUnion {
	public DfaUnionNode start;
	public DfaUnionNode end;
	
	public ArrayList<DfaUnionNode> nodes = new ArrayList<DfaUnionNode>();
	
	public DfaUnionNode getNode(DfaNode node1, DfaNode node2) {
		for(DfaUnionNode node : nodes) {
			if(node.node1 == node1 && node.node2 == node2) {
				return node;
			}
		}
		return null;
	}
}
