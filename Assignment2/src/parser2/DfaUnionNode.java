package parser2;

public class DfaUnionNode {
	public DfaNode node1;
	public DfaNode node2;
	
	public DfaUnionNode On0 = null;
	public DfaUnionNode On1 = null;
	public DfaUnionNode On2 = null;
	
	public boolean IsStart() {
		return node1.IsStart && node2.IsStart;
	}
	
	public boolean IsFinal() {
		return node1.IsFinal && node2.IsFinal;
	}
	
	public boolean inspected = false;

}
