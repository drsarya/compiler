// Generated from C:/Users/PC/Desktop/eeee/compilator/compilatorPascal/src/main/java/gram\GrammarFile.g4 by ANTLR 4.9.1
package generated;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarFileParser}.
 */
public interface GrammarFileListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarFileParser#myStartingRule}.
	 * @param ctx the parse tree
	 */
	void enterMyStartingRule(GrammarFileParser.MyStartingRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarFileParser#myStartingRule}.
	 * @param ctx the parse tree
	 */
	void exitMyStartingRule(GrammarFileParser.MyStartingRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code progrm}
	 * labeled alternative in {@link GrammarFileParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgrm(GrammarFileParser.ProgrmContext ctx);
	/**
	 * Exit a parse tree produced by the {@code progrm}
	 * labeled alternative in {@link GrammarFileParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgrm(GrammarFileParser.ProgrmContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blockProgrm}
	 * labeled alternative in {@link GrammarFileParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlockProgrm(GrammarFileParser.BlockProgrmContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blockProgrm}
	 * labeled alternative in {@link GrammarFileParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlockProgrm(GrammarFileParser.BlockProgrmContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blockVar}
	 * labeled alternative in {@link GrammarFileParser#vardeclpart}.
	 * @param ctx the parse tree
	 */
	void enterBlockVar(GrammarFileParser.BlockVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blockVar}
	 * labeled alternative in {@link GrammarFileParser#vardeclpart}.
	 * @param ctx the parse tree
	 */
	void exitBlockVar(GrammarFileParser.BlockVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varDeclaration}
	 * labeled alternative in {@link GrammarFileParser#vardecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(GrammarFileParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varDeclaration}
	 * labeled alternative in {@link GrammarFileParser#vardecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(GrammarFileParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleVar}
	 * labeled alternative in {@link GrammarFileParser#type}.
	 * @param ctx the parse tree
	 */
	void enterSimpleVar(GrammarFileParser.SimpleVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleVar}
	 * labeled alternative in {@link GrammarFileParser#type}.
	 * @param ctx the parse tree
	 */
	void exitSimpleVar(GrammarFileParser.SimpleVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayVarType}
	 * labeled alternative in {@link GrammarFileParser#type}.
	 * @param ctx the parse tree
	 */
	void enterArrayVarType(GrammarFileParser.ArrayVarTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayVarType}
	 * labeled alternative in {@link GrammarFileParser#type}.
	 * @param ctx the parse tree
	 */
	void exitArrayVarType(GrammarFileParser.ArrayVarTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayVar}
	 * labeled alternative in {@link GrammarFileParser#arraytype}.
	 * @param ctx the parse tree
	 */
	void enterArrayVar(GrammarFileParser.ArrayVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayVar}
	 * labeled alternative in {@link GrammarFileParser#arraytype}.
	 * @param ctx the parse tree
	 */
	void exitArrayVar(GrammarFileParser.ArrayVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rangeIndexVar}
	 * labeled alternative in {@link GrammarFileParser#indexrange}.
	 * @param ctx the parse tree
	 */
	void enterRangeIndexVar(GrammarFileParser.RangeIndexVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rangeIndexVar}
	 * labeled alternative in {@link GrammarFileParser#indexrange}.
	 * @param ctx the parse tree
	 */
	void exitRangeIndexVar(GrammarFileParser.RangeIndexVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idVar}
	 * labeled alternative in {@link GrammarFileParser#simpletype}.
	 * @param ctx the parse tree
	 */
	void enterIdVar(GrammarFileParser.IdVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idVar}
	 * labeled alternative in {@link GrammarFileParser#simpletype}.
	 * @param ctx the parse tree
	 */
	void exitIdVar(GrammarFileParser.IdVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarFileParser#procdeclpart}.
	 * @param ctx the parse tree
	 */
	void enterProcdeclpart(GrammarFileParser.ProcdeclpartContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarFileParser#procdeclpart}.
	 * @param ctx the parse tree
	 */
	void exitProcdeclpart(GrammarFileParser.ProcdeclpartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code procDeclFunc}
	 * labeled alternative in {@link GrammarFileParser#procdecl}.
	 * @param ctx the parse tree
	 */
	void enterProcDeclFunc(GrammarFileParser.ProcDeclFuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code procDeclFunc}
	 * labeled alternative in {@link GrammarFileParser#procdecl}.
	 * @param ctx the parse tree
	 */
	void exitProcDeclFunc(GrammarFileParser.ProcDeclFuncContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmt}
	 * labeled alternative in {@link GrammarFileParser#statementpart}.
	 * @param ctx the parse tree
	 */
	void enterStmt(GrammarFileParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmt}
	 * labeled alternative in {@link GrammarFileParser#statementpart}.
	 * @param ctx the parse tree
	 */
	void exitStmt(GrammarFileParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mainStmt}
	 * labeled alternative in {@link GrammarFileParser#cmpstatement}.
	 * @param ctx the parse tree
	 */
	void enterMainStmt(GrammarFileParser.MainStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mainStmt}
	 * labeled alternative in {@link GrammarFileParser#cmpstatement}.
	 * @param ctx the parse tree
	 */
	void exitMainStmt(GrammarFileParser.MainStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code smpStmt}
	 * labeled alternative in {@link GrammarFileParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSmpStmt(GrammarFileParser.SmpStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code smpStmt}
	 * labeled alternative in {@link GrammarFileParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSmpStmt(GrammarFileParser.SmpStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stcStmt}
	 * labeled alternative in {@link GrammarFileParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStcStmt(GrammarFileParser.StcStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stcStmt}
	 * labeled alternative in {@link GrammarFileParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStcStmt(GrammarFileParser.StcStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code attribStmt}
	 * labeled alternative in {@link GrammarFileParser#smpstatement}.
	 * @param ctx the parse tree
	 */
	void enterAttribStmt(GrammarFileParser.AttribStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code attribStmt}
	 * labeled alternative in {@link GrammarFileParser#smpstatement}.
	 * @param ctx the parse tree
	 */
	void exitAttribStmt(GrammarFileParser.AttribStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtID}
	 * labeled alternative in {@link GrammarFileParser#smpstatement}.
	 * @param ctx the parse tree
	 */
	void enterStmtID(GrammarFileParser.StmtIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtID}
	 * labeled alternative in {@link GrammarFileParser#smpstatement}.
	 * @param ctx the parse tree
	 */
	void exitStmtID(GrammarFileParser.StmtIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code resultReadStmt}
	 * labeled alternative in {@link GrammarFileParser#smpstatement}.
	 * @param ctx the parse tree
	 */
	void enterResultReadStmt(GrammarFileParser.ResultReadStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code resultReadStmt}
	 * labeled alternative in {@link GrammarFileParser#smpstatement}.
	 * @param ctx the parse tree
	 */
	void exitResultReadStmt(GrammarFileParser.ResultReadStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code resultWriteStmt}
	 * labeled alternative in {@link GrammarFileParser#smpstatement}.
	 * @param ctx the parse tree
	 */
	void enterResultWriteStmt(GrammarFileParser.ResultWriteStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code resultWriteStmt}
	 * labeled alternative in {@link GrammarFileParser#smpstatement}.
	 * @param ctx the parse tree
	 */
	void exitResultWriteStmt(GrammarFileParser.ResultWriteStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtAttrib}
	 * labeled alternative in {@link GrammarFileParser#assstatement}.
	 * @param ctx the parse tree
	 */
	void enterStmtAttrib(GrammarFileParser.StmtAttribContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtAttrib}
	 * labeled alternative in {@link GrammarFileParser#assstatement}.
	 * @param ctx the parse tree
	 */
	void exitStmtAttrib(GrammarFileParser.StmtAttribContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idStmt}
	 * labeled alternative in {@link GrammarFileParser#procstatement}.
	 * @param ctx the parse tree
	 */
	void enterIdStmt(GrammarFileParser.IdStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idStmt}
	 * labeled alternative in {@link GrammarFileParser#procstatement}.
	 * @param ctx the parse tree
	 */
	void exitIdStmt(GrammarFileParser.IdStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code readStmt}
	 * labeled alternative in {@link GrammarFileParser#readstatement}.
	 * @param ctx the parse tree
	 */
	void enterReadStmt(GrammarFileParser.ReadStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code readStmt}
	 * labeled alternative in {@link GrammarFileParser#readstatement}.
	 * @param ctx the parse tree
	 */
	void exitReadStmt(GrammarFileParser.ReadStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code writeStmt}
	 * labeled alternative in {@link GrammarFileParser#writestatement}.
	 * @param ctx the parse tree
	 */
	void enterWriteStmt(GrammarFileParser.WriteStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code writeStmt}
	 * labeled alternative in {@link GrammarFileParser#writestatement}.
	 * @param ctx the parse tree
	 */
	void exitWriteStmt(GrammarFileParser.WriteStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code resultSimpleExp}
	 * labeled alternative in {@link GrammarFileParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterResultSimpleExp(GrammarFileParser.ResultSimpleExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code resultSimpleExp}
	 * labeled alternative in {@link GrammarFileParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitResultSimpleExp(GrammarFileParser.ResultSimpleExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code resultExp}
	 * labeled alternative in {@link GrammarFileParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterResultExp(GrammarFileParser.ResultExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code resultExp}
	 * labeled alternative in {@link GrammarFileParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitResultExp(GrammarFileParser.ResultExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code smplExpression}
	 * labeled alternative in {@link GrammarFileParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void enterSmplExpression(GrammarFileParser.SmplExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code smplExpression}
	 * labeled alternative in {@link GrammarFileParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void exitSmplExpression(GrammarFileParser.SmplExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termExpression}
	 * labeled alternative in {@link GrammarFileParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTermExpression(GrammarFileParser.TermExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termExpression}
	 * labeled alternative in {@link GrammarFileParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTermExpression(GrammarFileParser.TermExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varExpr}
	 * labeled alternative in {@link GrammarFileParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterVarExpr(GrammarFileParser.VarExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varExpr}
	 * labeled alternative in {@link GrammarFileParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitVarExpr(GrammarFileParser.VarExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constantExpr}
	 * labeled alternative in {@link GrammarFileParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpr(GrammarFileParser.ConstantExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constantExpr}
	 * labeled alternative in {@link GrammarFileParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpr(GrammarFileParser.ConstantExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multExpr}
	 * labeled alternative in {@link GrammarFileParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterMultExpr(GrammarFileParser.MultExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multExpr}
	 * labeled alternative in {@link GrammarFileParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitMultExpr(GrammarFileParser.MultExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link GrammarFileParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(GrammarFileParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link GrammarFileParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(GrammarFileParser.NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarFileParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(GrammarFileParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarFileParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(GrammarFileParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarFileParser#addop}.
	 * @param ctx the parse tree
	 */
	void enterAddop(GrammarFileParser.AddopContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarFileParser#addop}.
	 * @param ctx the parse tree
	 */
	void exitAddop(GrammarFileParser.AddopContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarFileParser#multop}.
	 * @param ctx the parse tree
	 */
	void enterMultop(GrammarFileParser.MultopContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarFileParser#multop}.
	 * @param ctx the parse tree
	 */
	void exitMultop(GrammarFileParser.MultopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varID}
	 * labeled alternative in {@link GrammarFileParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVarID(GrammarFileParser.VarIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varID}
	 * labeled alternative in {@link GrammarFileParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVarID(GrammarFileParser.VarIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code indexedVar}
	 * labeled alternative in {@link GrammarFileParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterIndexedVar(GrammarFileParser.IndexedVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code indexedVar}
	 * labeled alternative in {@link GrammarFileParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitIndexedVar(GrammarFileParser.IndexedVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cmpStatementFunc}
	 * labeled alternative in {@link GrammarFileParser#stcstatement}.
	 * @param ctx the parse tree
	 */
	void enterCmpStatementFunc(GrammarFileParser.CmpStatementFuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cmpStatementFunc}
	 * labeled alternative in {@link GrammarFileParser#stcstatement}.
	 * @param ctx the parse tree
	 */
	void exitCmpStatementFunc(GrammarFileParser.CmpStatementFuncContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifStatementFunc}
	 * labeled alternative in {@link GrammarFileParser#stcstatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatementFunc(GrammarFileParser.IfStatementFuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifStatementFunc}
	 * labeled alternative in {@link GrammarFileParser#stcstatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatementFunc(GrammarFileParser.IfStatementFuncContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileStatementFunc}
	 * labeled alternative in {@link GrammarFileParser#stcstatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatementFunc(GrammarFileParser.WhileStatementFuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileStatementFunc}
	 * labeled alternative in {@link GrammarFileParser#stcstatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatementFunc(GrammarFileParser.WhileStatementFuncContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forStatementFunc}
	 * labeled alternative in {@link GrammarFileParser#stcstatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatementFunc(GrammarFileParser.ForStatementFuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forStatementFunc}
	 * labeled alternative in {@link GrammarFileParser#stcstatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatementFunc(GrammarFileParser.ForStatementFuncContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifStmt}
	 * labeled alternative in {@link GrammarFileParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(GrammarFileParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifStmt}
	 * labeled alternative in {@link GrammarFileParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(GrammarFileParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifElseStmt}
	 * labeled alternative in {@link GrammarFileParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfElseStmt(GrammarFileParser.IfElseStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifElseStmt}
	 * labeled alternative in {@link GrammarFileParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfElseStmt(GrammarFileParser.IfElseStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileStmt}
	 * labeled alternative in {@link GrammarFileParser#whilestatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmt(GrammarFileParser.WhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileStmt}
	 * labeled alternative in {@link GrammarFileParser#whilestatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmt(GrammarFileParser.WhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forStmt}
	 * labeled alternative in {@link GrammarFileParser#forstatement}.
	 * @param ctx the parse tree
	 */
	void enterForStmt(GrammarFileParser.ForStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forStmt}
	 * labeled alternative in {@link GrammarFileParser#forstatement}.
	 * @param ctx the parse tree
	 */
	void exitForStmt(GrammarFileParser.ForStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarFileParser#specsym}.
	 * @param ctx the parse tree
	 */
	void enterSpecsym(GrammarFileParser.SpecsymContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarFileParser#specsym}.
	 * @param ctx the parse tree
	 */
	void exitSpecsym(GrammarFileParser.SpecsymContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarFileParser#predid}.
	 * @param ctx the parse tree
	 */
	void enterPredid(GrammarFileParser.PredidContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarFileParser#predid}.
	 * @param ctx the parse tree
	 */
	void exitPredid(GrammarFileParser.PredidContext ctx);
}