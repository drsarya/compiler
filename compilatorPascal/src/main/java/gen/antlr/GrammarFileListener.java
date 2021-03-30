// Generated from C:/Users/PC/Desktop/compilator/compilatorPascal/src/main/java/antlr\GrammarFile.g4 by ANTLR 4.9.1
package gen.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarFileParser}.
 */
public interface GrammarFileListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarFileParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(GrammarFileParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarFileParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(GrammarFileParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link GrammarFileParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterPrintExpr(GrammarFileParser.PrintExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link GrammarFileParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitPrintExpr(GrammarFileParser.PrintExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link GrammarFileParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssign(GrammarFileParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link GrammarFileParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssign(GrammarFileParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blank}
	 * labeled alternative in {@link GrammarFileParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterBlank(GrammarFileParser.BlankContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blank}
	 * labeled alternative in {@link GrammarFileParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitBlank(GrammarFileParser.BlankContext ctx);
	/**
	 * Enter a parse tree produced by the {@code num}
	 * labeled alternative in {@link GrammarFileParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNum(GrammarFileParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code num}
	 * labeled alternative in {@link GrammarFileParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNum(GrammarFileParser.NumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link GrammarFileParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterId(GrammarFileParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link GrammarFileParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitId(GrammarFileParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IncDecAbs}
	 * labeled alternative in {@link GrammarFileParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIncDecAbs(GrammarFileParser.IncDecAbsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IncDecAbs}
	 * labeled alternative in {@link GrammarFileParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIncDecAbs(GrammarFileParser.IncDecAbsContext ctx);
}