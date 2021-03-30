// Generated from C:/Users/PC/Desktop/compilator/compilatorPascal/src/main/java/antlr\GrammarFile.g4 by ANTLR 4.9.1
package gen.antlr;
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
	 * Visit a parse tree produced by {@link GrammarFileParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(GrammarFileParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link GrammarFileParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintExpr(GrammarFileParser.PrintExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link GrammarFileParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(GrammarFileParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blank}
	 * labeled alternative in {@link GrammarFileParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlank(GrammarFileParser.BlankContext ctx);
	/**
	 * Visit a parse tree produced by the {@code num}
	 * labeled alternative in {@link GrammarFileParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum(GrammarFileParser.NumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link GrammarFileParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(GrammarFileParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IncDecAbs}
	 * labeled alternative in {@link GrammarFileParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncDecAbs(GrammarFileParser.IncDecAbsContext ctx);
}