// Generated from C:\SkyDrive\KSU\CIS770 - Formal Languages Theory\workspace\Assignment2\src\parser2\RegEx.g4 by ANTLR 4.1
package parser2;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link RegExVisitor}, which
 * can be extended to create a visitor which only needs to handle a subset of
 * the available methods.
 * 
 * @param <T>
 *            The return type of the visit operation. Use {@link Void} for
 *            operations with no return type.
 */
public class RegExExtendedVisitor extends RegExBaseVisitor<Enfa> {

	public Enfa finalEnfa;
	
	@Override
	public Enfa visitExp(@NotNull RegExParser.ExpContext ctx) {
		finalEnfa = visitChildren(ctx);
		return finalEnfa;
	}

	@Override
	public Enfa visitUnion(@NotNull RegExParser.UnionContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Enfa visitClosure(@NotNull RegExParser.ClosureContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public Enfa visitConcat(@NotNull RegExParser.ConcatContext ctx) {
		Enfa nfa = new Enfa();
		
		Node start = new Node();
		start.IsStart = true;
		
		Node end = new Node();
		end.IsFinal = true;
		
		nfa.start = start;
		nfa.end.add(end);
		
		Node cur = start;
		for (int i = 0; i < ctx.getChildCount(); ++i) {
			int value = Integer.parseInt(ctx.getChild(i).getText());
			Node newNode = i==(ctx.getChildCount()-1) ? end : new Node();
			switch (value) {
			case 0:
				cur.On0.add(newNode);
				break;
			case 1:
				cur.On1.add(newNode);
				break;
			case 2:
				cur.On2.add(newNode);
				break;
			}
			cur = newNode;
		}
		
		return nfa;
	}	
	
}