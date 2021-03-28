// Generated from C:/Users/PC/Desktop/compilator/compilatorPascal/src/main/java/antlr\GrammarFile.g4 by ANTLR 4.9.1
package genAntlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GrammarFileParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GrammarFileVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GrammarFileParser#r}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitR(GrammarFileParser.RContext ctx);
}