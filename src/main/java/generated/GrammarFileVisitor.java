// Generated from C:/Users/PC/Desktop/eeee/compilator/compilatorPascal/src/main/java/gram\GrammarFile.g4 by ANTLR 4.9.1
package generated;
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
	 * Visit a parse tree produced by {@link GrammarFileParser#myStartingRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMyStartingRule(GrammarFileParser.MyStartingRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code progrm}
	 * labeled alternative in {@link GrammarFileParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgrm(GrammarFileParser.ProgrmContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blockProgrm}
	 * labeled alternative in {@link GrammarFileParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockProgrm(GrammarFileParser.BlockProgrmContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blockVar}
	 * labeled alternative in {@link GrammarFileParser#vardeclpart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockVar(GrammarFileParser.BlockVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varDeclaration}
	 * labeled alternative in {@link GrammarFileParser#vardecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclaration(GrammarFileParser.VarDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleVar}
	 * labeled alternative in {@link GrammarFileParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleVar(GrammarFileParser.SimpleVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayVarType}
	 * labeled alternative in {@link GrammarFileParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayVarType(GrammarFileParser.ArrayVarTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayVar}
	 * labeled alternative in {@link GrammarFileParser#arraytype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayVar(GrammarFileParser.ArrayVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rangeIndexVar}
	 * labeled alternative in {@link GrammarFileParser#indexrange}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRangeIndexVar(GrammarFileParser.RangeIndexVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idVar}
	 * labeled alternative in {@link GrammarFileParser#simpletype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdVar(GrammarFileParser.IdVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarFileParser#procdeclpart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcdeclpart(GrammarFileParser.ProcdeclpartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code procDeclFunc}
	 * labeled alternative in {@link GrammarFileParser#procdecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcDeclFunc(GrammarFileParser.ProcDeclFuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code procVarDeclFunc}
	 * labeled alternative in {@link GrammarFileParser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcVarDeclFunc(GrammarFileParser.ProcVarDeclFuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarFileParser#parameterGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterGroup(GrammarFileParser.ParameterGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarFileParser#identifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierList(GrammarFileParser.IdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmt}
	 * labeled alternative in {@link GrammarFileParser#statementpart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(GrammarFileParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mainStmt}
	 * labeled alternative in {@link GrammarFileParser#cmpstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainStmt(GrammarFileParser.MainStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code smpStmt}
	 * labeled alternative in {@link GrammarFileParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSmpStmt(GrammarFileParser.SmpStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stcStmt}
	 * labeled alternative in {@link GrammarFileParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStcStmt(GrammarFileParser.StcStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code attribStmt}
	 * labeled alternative in {@link GrammarFileParser#smpstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribStmt(GrammarFileParser.AttribStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtID}
	 * labeled alternative in {@link GrammarFileParser#smpstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtID(GrammarFileParser.StmtIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code resultReadStmt}
	 * labeled alternative in {@link GrammarFileParser#smpstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResultReadStmt(GrammarFileParser.ResultReadStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code resultWriteStmt}
	 * labeled alternative in {@link GrammarFileParser#smpstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResultWriteStmt(GrammarFileParser.ResultWriteStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtAttrib}
	 * labeled alternative in {@link GrammarFileParser#assstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtAttrib(GrammarFileParser.StmtAttribContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idStmt}
	 * labeled alternative in {@link GrammarFileParser#procstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdStmt(GrammarFileParser.IdStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarFileParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(GrammarFileParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code readStmt}
	 * labeled alternative in {@link GrammarFileParser#readstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadStmt(GrammarFileParser.ReadStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code writeStmt}
	 * labeled alternative in {@link GrammarFileParser#writestatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteStmt(GrammarFileParser.WriteStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code resultSimpleExp}
	 * labeled alternative in {@link GrammarFileParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResultSimpleExp(GrammarFileParser.ResultSimpleExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code resultExp}
	 * labeled alternative in {@link GrammarFileParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResultExp(GrammarFileParser.ResultExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code smplExpression}
	 * labeled alternative in {@link GrammarFileParser#simpleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSmplExpression(GrammarFileParser.SmplExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termExpression}
	 * labeled alternative in {@link GrammarFileParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermExpression(GrammarFileParser.TermExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varExpr}
	 * labeled alternative in {@link GrammarFileParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarExpr(GrammarFileParser.VarExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constantExpr}
	 * labeled alternative in {@link GrammarFileParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExpr(GrammarFileParser.ConstantExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multExpr}
	 * labeled alternative in {@link GrammarFileParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultExpr(GrammarFileParser.MultExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link GrammarFileParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpression(GrammarFileParser.NotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarFileParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(GrammarFileParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarFileParser#addop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddop(GrammarFileParser.AddopContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarFileParser#multop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultop(GrammarFileParser.MultopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varID}
	 * labeled alternative in {@link GrammarFileParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarID(GrammarFileParser.VarIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code indexedVar}
	 * labeled alternative in {@link GrammarFileParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexedVar(GrammarFileParser.IndexedVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cmpStatementFunc}
	 * labeled alternative in {@link GrammarFileParser#stcstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmpStatementFunc(GrammarFileParser.CmpStatementFuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifStatementFunc}
	 * labeled alternative in {@link GrammarFileParser#stcstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatementFunc(GrammarFileParser.IfStatementFuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileStatementFunc}
	 * labeled alternative in {@link GrammarFileParser#stcstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatementFunc(GrammarFileParser.WhileStatementFuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forStatementFunc}
	 * labeled alternative in {@link GrammarFileParser#stcstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatementFunc(GrammarFileParser.ForStatementFuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifStmt}
	 * labeled alternative in {@link GrammarFileParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(GrammarFileParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifElseStmt}
	 * labeled alternative in {@link GrammarFileParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElseStmt(GrammarFileParser.IfElseStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileStmt}
	 * labeled alternative in {@link GrammarFileParser#whilestatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStmt(GrammarFileParser.WhileStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forStmt}
	 * labeled alternative in {@link GrammarFileParser#forstatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStmt(GrammarFileParser.ForStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarFileParser#specsym}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecsym(GrammarFileParser.SpecsymContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarFileParser#predid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredid(GrammarFileParser.PredidContext ctx);
}