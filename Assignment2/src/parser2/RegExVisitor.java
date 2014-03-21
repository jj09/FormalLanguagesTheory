// Generated from C:\SkyDrive\KSU\CIS770 - Formal Languages Theory\workspace\Assignment2\src\parser2\RegEx.g4 by ANTLR 4.1
package parser2;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link RegExParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface RegExVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link RegExParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(@NotNull RegExParser.ExpContext ctx);

	/**
	 * Visit a parse tree produced by {@link RegExParser#union}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnion(@NotNull RegExParser.UnionContext ctx);

	/**
	 * Visit a parse tree produced by {@link RegExParser#closure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClosure(@NotNull RegExParser.ClosureContext ctx);

	/**
	 * Visit a parse tree produced by {@link RegExParser#concat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcat(@NotNull RegExParser.ConcatContext ctx);
}