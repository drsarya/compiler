package impl;

import generated.GrammarFileBaseListener;
import generated.GrammarFileParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.Stack;


public class MyBaseListener extends GrammarFileBaseListener {


    @Override
    public void enterMyStartingRule(GrammarFileParser.MyStartingRuleContext ctx) {
        super.enterMyStartingRule(ctx);
    }


    @Override
    public void enterProgrm(GrammarFileParser.ProgrmContext ctx) {
        super.enterProgrm(ctx);
        if (ctx.exception != null) printException("program", ctx.start.getLine(), ctx.start.getCharPositionInLine());
    }


    @Override
    public void enterBlockProgrm(GrammarFileParser.BlockProgrmContext ctx) {
        super.enterBlockProgrm(ctx);
        if (ctx.exception != null) printException("block", ctx.start.getLine(), ctx.start.getCharPositionInLine());
    }

    @Override
    public void enterBlockVar(GrammarFileParser.BlockVarContext ctx) {
        super.enterBlockVar(ctx);

    }

    @Override
    public void enterVarDeclaration(GrammarFileParser.VarDeclarationContext ctx) {
        super.enterVarDeclaration(ctx);
        if (ctx.exception != null)
            printException("variable declaration", ctx.start.getLine(), ctx.start.getCharPositionInLine());
    }

    @Override
    public void enterSimpleVar(GrammarFileParser.SimpleVarContext ctx) {
        super.enterSimpleVar(ctx);
    }

    @Override
    public void enterArrayVarType(GrammarFileParser.ArrayVarTypeContext ctx) {
        super.enterArrayVarType(ctx);
    }

    @Override
    public void enterArrayVar(GrammarFileParser.ArrayVarContext ctx) {
        super.enterArrayVar(ctx);
    }

    @Override
    public void enterRangeIndexVar(GrammarFileParser.RangeIndexVarContext ctx) {
        super.enterRangeIndexVar(ctx);
    }

    @Override
    public void enterIdVar(GrammarFileParser.IdVarContext ctx) {
        super.enterIdVar(ctx);
    }

    @Override
    public void enterProcdeclpart(GrammarFileParser.ProcdeclpartContext ctx) {
        super.enterProcdeclpart(ctx);
    }

    @Override
    public void enterProcDeclFunc(GrammarFileParser.ProcDeclFuncContext ctx) {
        super.enterProcDeclFunc(ctx);
    }

    @Override
    public void enterStmt(GrammarFileParser.StmtContext ctx) {
        super.enterStmt(ctx);
    }

    @Override
    public void enterMainStmt(GrammarFileParser.MainStmtContext ctx) {
        super.enterMainStmt(ctx);
    }

    @Override
    public void enterSmpStmt(GrammarFileParser.SmpStmtContext ctx) {
        super.enterSmpStmt(ctx);
    }

    @Override
    public void enterStcStmt(GrammarFileParser.StcStmtContext ctx) {
        super.enterStcStmt(ctx);
    }

    @Override
    public void enterAttribStmt(GrammarFileParser.AttribStmtContext ctx) {
        super.enterAttribStmt(ctx);
    }

    @Override
    public void enterStmtID(GrammarFileParser.StmtIDContext ctx) {
        super.enterStmtID(ctx);
    }

    @Override
    public void enterResultReadStmt(GrammarFileParser.ResultReadStmtContext ctx) {
        super.enterResultReadStmt(ctx);
    }

    @Override
    public void enterResultWriteStmt(GrammarFileParser.ResultWriteStmtContext ctx) {
        super.enterResultWriteStmt(ctx);
    }

    @Override
    public void enterStmtAttrib(GrammarFileParser.StmtAttribContext ctx) {
        super.enterStmtAttrib(ctx);
    }

    @Override
    public void enterIdStmt(GrammarFileParser.IdStmtContext ctx) {
        super.enterIdStmt(ctx);
    }

    @Override
    public void enterReadStmt(GrammarFileParser.ReadStmtContext ctx) {
        super.enterReadStmt(ctx);
        System.out.println("Entered read statement");
        for (GrammarFileParser.VariableContext item :
                ctx.variable()) {
            if (item.exception != null)
                printException("read", item.start.getLine(), item.start.getCharPositionInLine());
        }
    }

    @Override
    public void enterWriteStmt(GrammarFileParser.WriteStmtContext ctx) {
        super.enterWriteStmt(ctx);
    }

    @Override
    public void enterResultSimpleExp(GrammarFileParser.ResultSimpleExpContext ctx) {
        super.enterResultSimpleExp(ctx);
    }

    @Override
    public void enterResultExp(GrammarFileParser.ResultExpContext ctx) {
        super.enterResultExp(ctx);
    }

    @Override
    public void enterSmplExpression(GrammarFileParser.SmplExpressionContext ctx) {
        super.enterSmplExpression(ctx);
    }

    @Override
    public void enterTermExpression(GrammarFileParser.TermExpressionContext ctx) {
        super.enterTermExpression(ctx);
    }

    @Override
    public void enterVarExpr(GrammarFileParser.VarExprContext ctx) {
        super.enterVarExpr(ctx);
    }

    @Override
    public void enterConstantExpr(GrammarFileParser.ConstantExprContext ctx) {
        super.enterConstantExpr(ctx);
    }

    @Override
    public void enterMultExpr(GrammarFileParser.MultExprContext ctx) {
        super.enterMultExpr(ctx);
    }

    @Override
    public void enterNotExpression(GrammarFileParser.NotExpressionContext ctx) {
        super.enterNotExpression(ctx);
    }

    @Override
    public void enterConstant(GrammarFileParser.ConstantContext ctx) {
        super.enterConstant(ctx);
    }

    @Override
    public void enterAddop(GrammarFileParser.AddopContext ctx) {
        super.enterAddop(ctx);
    }

    @Override
    public void enterMultop(GrammarFileParser.MultopContext ctx) {
        super.enterMultop(ctx);
    }

    @Override
    public void enterVarID(GrammarFileParser.VarIDContext ctx) {
        super.enterVarID(ctx);

    }

    @Override
    public void enterIndexedVar(GrammarFileParser.IndexedVarContext ctx) {
        super.enterIndexedVar(ctx);
    }

    @Override
    public void enterCmpStatementFunc(GrammarFileParser.CmpStatementFuncContext ctx) {
        super.enterCmpStatementFunc(ctx);
    }

    @Override
    public void enterIfStatementFunc(GrammarFileParser.IfStatementFuncContext ctx) {
        super.enterIfStatementFunc(ctx);
    }

    @Override
    public void enterWhileStatementFunc(GrammarFileParser.WhileStatementFuncContext ctx) {
        super.enterWhileStatementFunc(ctx);
    }

    @Override
    public void enterForStatementFunc(GrammarFileParser.ForStatementFuncContext ctx) {
        super.enterForStatementFunc(ctx);
    }

    @Override
    public void enterIfStmt(GrammarFileParser.IfStmtContext ctx) {
        super.enterIfStmt(ctx);
    }

    @Override
    public void enterIfElseStmt(GrammarFileParser.IfElseStmtContext ctx) {
        super.enterIfElseStmt(ctx);
    }

    @Override
    public void enterWhileStmt(GrammarFileParser.WhileStmtContext ctx) {
        super.enterWhileStmt(ctx);
    }

    @Override
    public void enterForStmt(GrammarFileParser.ForStmtContext ctx) {
        super.enterForStmt(ctx);
    }

    @Override
    public void enterSpecsym(GrammarFileParser.SpecsymContext ctx) {
        super.enterSpecsym(ctx);
    }

    @Override
    public void enterPredid(GrammarFileParser.PredidContext ctx) {
        super.enterPredid(ctx);
    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        super.enterEveryRule(ctx);
        if (ctx.exception != null)
            printException("variable declaration", ctx.start.getLine(), ctx.start.getCharPositionInLine());
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        super.visitTerminal(node);
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        super.visitErrorNode(node);
        printException(node.getText(), node.getSymbol().getLine(), node.getSymbol().getCharPositionInLine());
    }

    private void printException(String statement, int line, int pos) {
        System.out.printf("There's error at %s statement at %d line, %d position\n", statement, line, pos);
        System.exit(1);
    }
}
