package parser2;

import java.util.ArrayList;
import java.util.HashSet;



public class DfaNode {
	public HashSet<Node> nodes = new HashSet<Node>();
	
	public DfaNode On0 = null;
	public DfaNode On1 = null;
	public DfaNode On2 = null;
	
	public boolean IsStart = false;
	public boolean IsFinal = false;

}
