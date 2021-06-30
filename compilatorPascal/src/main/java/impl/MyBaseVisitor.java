package impl;

import generated.GrammarFileBaseVisitor;
import generated.GrammarFileParser;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.*;

public class MyBaseVisitor extends GrammarFileBaseVisitor<Object> {


    public Object visitResultExp(GrammarFileParser.ResultExpContext ctx) {
        Object firstExp = visit(ctx.simpleExpression(0));
        Object secondExp = visit(ctx.simpleExpression(1));

        String op = ctx.relationop.getText();
        if (op.equals("=")) {
            try {
                if (Double.parseDouble(firstExp.toString()) == Double.parseDouble(secondExp.toString())) {
                    return true;
                }
            } catch (Throwable ex) {
                if (firstExp.equals(secondExp)) {
                    return true;
                }
            }

        } else if (op.equals("<")) {
            if (Double.parseDouble(firstExp.toString()) < Double.parseDouble(secondExp.toString())) {
                return true;
            }
        } else if (op.equals(">")) {
            if (Double.parseDouble(firstExp.toString()) > Double.parseDouble(secondExp.toString())) {
                return true;
            }
        } else if (op.equals("<=")) {
            if (Double.parseDouble(firstExp.toString()) <= Double.parseDouble(secondExp.toString())) {
                return true;
            }
        } else if (op.equals(">=")) {
            if (Double.parseDouble(firstExp.toString()) >= Double.parseDouble(secondExp.toString())) {
                return true;
            }
        } else if (op.equals("<>")) {
            try {
                if (Double.parseDouble(firstExp.toString()) != Double.parseDouble(secondExp.toString())) {
                    return true;
                }
            } catch (NumberFormatException ex) {
                if (!firstExp.equals(secondExp)) {
                    return true;
                }
            }
        }
        return false;
    }

    public Object visitIfStmt(GrammarFileParser.IfStmtContext ctx) {
        Boolean visit = (Boolean) visit(ctx.expression());
        if (visit) {
            return visit(ctx.statement());
        }
        return null;
    }

    public Object visitIfElseStmt(GrammarFileParser.IfElseStmtContext ctx) {
        Boolean visit = (Boolean) visit(ctx.expression());
        if (visit) {
            return visit(ctx.b1);
        } else {
            return visit(ctx.b2);
        }
    }

    public Object visitReadStmt(GrammarFileParser.ReadStmtContext ctx) {
        Scanner s = new Scanner(System.in);
        for (GrammarFileParser.VariableContext var : ctx.variable()) {
            Object[] value = SymbolsTable.getInstance().getSymbol(var.getText());
            value[1] = s.nextLine();
        }
        return 0d;
    }

    public Object visitWriteStmt(GrammarFileParser.WriteStmtContext ctx) {
        try {
            for (GrammarFileParser.ExpressionContext value : ctx.expression()) {
                Object c = visit(value);
                String valor = "";
                if (c == null) {
                    valor = "NULL";
                } else {
                    valor = c.toString();
                }
                if (valor.startsWith("\"")) {
                    valor = valor.subSequence(1, valor.length() - 1).toString();
                }
                System.out.println(valor);
            }
        } catch (NullPointerException ex) {
            throw new ParseCancellationException("Ошибка интерпретации: Неверный тип!");
        }
        return 0d;
    }

    public Object visitWhileStmt(GrammarFileParser.WhileStmtContext ctx) {
        Boolean visit = (Boolean) visit(ctx.expression());
        while (visit) {
            visit = (Boolean) visit(ctx.expression());
            visit(ctx.b1);
        }
        return 0d;
    }

    public Object visitForStmt(GrammarFileParser.ForStmtContext ctx) {
        Boolean visit = (Boolean) visit(ctx.expression());
        while (visit) {
            visit = (Boolean) visit(ctx.expression());
            visit(ctx.counter);
            visit(ctx.b1);
        }
        return 0;
    }

    @Override
    public Object visitParameterGroup(GrammarFileParser.ParameterGroupContext ctx) {
        List<VariableModel> variableModels = new ArrayList<>();
        for (int i = 0; i < ctx.identifierList().ID().size(); i++) {
            variableModels.add(new VariableModel(ctx.identifierList().ID().get(i).getText(), ctx.simpletype().getText()));
        }
        return variableModels;

    }

    @Override
    public Object visitProcDeclFunc(GrammarFileParser.ProcDeclFuncContext ctx) {
        String nameMethod = ctx.ID().toString();
        if (nameMethod != null) {
            List<VariableModel> models = new ArrayList<>();
            if (ctx.formalParameterList() != null) {
                models = (List<VariableModel>) visit(ctx.formalParameterList());
            }
            GrammarFileParser.BlockProgrmContext s = (GrammarFileParser.BlockProgrmContext) ctx.block();
            s.statementpart();
            FunctionModel functionModel = new FunctionModel(nameMethod, models, s.statementpart());
            SymbolsTable.getInstance().addFunction(functionModel);
        }
        return 0d;
    }

    @Override
    public Object visitProcVarDeclFunc(GrammarFileParser.ProcVarDeclFuncContext ctx) {
        List<VariableModel> variableModels = new ArrayList<>();
        for (int i = 0; i < ctx.parameterGroup().size(); i++) {
            List<VariableModel> ss = (List<VariableModel>) visit(ctx.parameterGroup(i));
            variableModels.addAll(ss);
        }
        return variableModels;
    }

    @Override
    public Object visitStmt(GrammarFileParser.StmtContext ctx) {
        return super.visitStmt(ctx);
    }

    @Override
    public Object visitMainStmt(GrammarFileParser.MainStmtContext ctx) {
        return super.visitMainStmt(ctx);
    }

    @Override
    public Object visitIdStmt(GrammarFileParser.IdStmtContext ctx) {
        String nameMethod = ctx.ID().toString();
        int currentSize = ctx.parameterList().expression().size();
        int expectedSize = ctx.parameterList().expression().size();
        FunctionModel functionModel = SymbolsTable.getInstance().getFunction(nameMethod);
        if (expectedSize != currentSize)
            throw new ParseCancellationException("Ошибка интерпретации: количество переданных аргументов : " + currentSize + " ,ожидалось: " + expectedSize);
        //functionModel.setName();
        for (int i = 0; i < ctx.parameterList().expression().size(); i++) {
            Object[] varData = new Object[2];
            varData[0] = functionModel.getVariableList().get(i).getType();
            varData[1] = visit(ctx.parameterList().expression(i));
            SymbolsTable.getInstance().addSymbol(functionModel.getVariableList().get(i).getName(), varData);
        }
        if (functionModel != null) {
            visit(functionModel.getProgramContext());
        } else {
            throw new ParseCancellationException("Ошибка интерпретации: метод не найден");
        }
        SymbolsTable.getInstance().removeVariables(functionModel.getVariableList() );
        return 0d;
    }

    @Override
    public Object visitMultExpr(GrammarFileParser.MultExprContext ctx) {
        return visit(ctx.children.get(1));
    }

    @Override
    public Object visitSmplExpression(GrammarFileParser.SmplExpressionContext ctx) {
        Double total = 0.0;
        if (ctx.term(0).getText().matches("[a-zA-Z][a-zA-Z0-9_]*(\\Q[\\E[0-9]+\\Q]\\E)?")) {
            Object value = visit(ctx.term(0));
            if (value == null) {
                total = null;
            } else {
                total = Double.parseDouble(value.toString());
            }
        } else if (ctx.term(0).getText().startsWith("\"")) {
            return ctx.term(0).getText();
        } else {
            if (ctx.children.get(0).getText().equals("-")) {
                ParseTree s = ctx.children.get(1);
                ctx.children.set(1, s);
            }
            total = Double.parseDouble(visit(ctx.term(0)).toString());
        }
        int pos = 1;
        for (GrammarFileParser.AddopContext add : ctx.addop()) {
            if (add.getText().equals("+")) {
                total += Double.parseDouble(visit(ctx.term(pos)).toString());
            } else if (add.getText().equals("-")) {
                total -= Double.parseDouble(visit(ctx.term(pos)).toString());
            }
            pos++;
        }
        return total;
    }


    public Object visitTermExpression(GrammarFileParser.TermExpressionContext ctx) {
        if (ctx.factor(0).getText().matches("[a-zA-Z][a-zA-Z0-9_]*(\\Q[\\E[0-9]+\\Q]\\E)?")) {
            Object test = visit(ctx.factor(0));
            return test;
        } else if (ctx.factor(0).getText().startsWith("\"")) {
            return ctx.factor(0).getText();
        } else {
            double total;
            int pos = 1;
            if (ctx.factor().get(0).children.size() == 2) {
                total = Double.parseDouble(ctx.factor().get(0).children.get(1).getText());
                if (ctx.factor(0).children.get(0).getText().equals("-")) {
                    total *= -1;
                }
            } else {
                total = Double.parseDouble(ctx.factor(0).getText());
            }
            for (GrammarFileParser.MultopContext add : ctx.multop()) {
                if (add.getText().equals("*")) {
                    Object c = visit(ctx.factor(pos));
                    if (c == null) {
                        total *= Double.parseDouble(ctx.factor(pos).getText());
                    } else {
                        total *= Double.parseDouble(c.toString());
                    }
                } else if (add.getText().equals("/")) {
                    Object c = visit(ctx.factor(pos));
                    if (c == null) {
                        total /= Double.parseDouble(ctx.factor(pos).getText());
                    } else {
                        total /= Double.parseDouble(c.toString());
                    }
                }
                pos++;
            }
            return total;
        }
    }

    public Object visitVarExpr(GrammarFileParser.VarExprContext ctx) {
        return visit(ctx.variable());
    }

    public Object visitIndexedVar(GrammarFileParser.IndexedVarContext ctx) {
        return SymbolsTable.getInstance().getSymbol(ctx.getText())[1];
    }

    public Object visitVarID(GrammarFileParser.VarIDContext ctx) {
        RuleContext context = ctx.parent;
        StringBuilder name = new StringBuilder(ctx.getText());
        while (context  != null) {
            if (context instanceof GrammarFileParser.ProcDeclFuncContext) {
                GrammarFileParser.ProcDeclFuncContext contextProg = (GrammarFileParser.ProcDeclFuncContext) context;
                name.insert(0, contextProg.ID());
            }
            context = context.parent;

        }
        return SymbolsTable.getInstance().getSymbol(name.toString())[1];
    }


    public Object visitVarDeclaration(GrammarFileParser.VarDeclarationContext ctx) {
        String type = ctx.type().getText();

        if (type.contains("array")) {
            Object[] list = (Object[]) visit(ctx.type());
            for (GrammarFileParser.VariableContext vars : ctx.variable()) {
                int init = Integer.parseInt(list[0].toString());
                int end = Integer.parseInt(list[1].toString());
                for (int i = init; i <= end; i++) {
                    Object[] varData = new Object[2];
                    varData[0] = list[2];
                    String varName = vars.getText() + "[" + i + "]";
                    SymbolsTable.getInstance().addSymbol(varName, varData);
                }
            }
        } else {

            for (GrammarFileParser.VariableContext vars : ctx.variable()) {
                Object[] varData = new Object[2];
                varData[0] = type;
                String varName = vars.getText();
                SymbolsTable.getInstance().addSymbol(varName, varData);
            }
        }
        return 0d;
    }


    public Object[] visitArrayVarType(GrammarFileParser.ArrayVarTypeContext ctx) {
        return (Object[]) visit(ctx.arraytype());
    }

    public Object[] visitArrayVar(GrammarFileParser.ArrayVarContext ctx) {
        Object[] list = new Object[3];
        Object[] rangeList = (Object[]) visit(ctx.indexrange());
        list[0] = rangeList[0];
        list[1] = rangeList[1];
        list[2] = ctx.simpletype().getText();
        return list;
    }

    public Object[] visitRangeIndexVar(GrammarFileParser.RangeIndexVarContext ctx) {
        return ctx.DIGIT().toArray();
    }


    public Object visitStmtAttrib(GrammarFileParser.StmtAttribContext ctx) {

        if (SymbolsTable.getInstance().getSymbol(ctx.variable().getText()) != null) {
            Object value = visit(ctx.expression());

            Object[] var = SymbolsTable.getInstance().getSymbol(ctx.variable().getText());
            if (var[0].equals("float")) {
                var[1] = Float.parseFloat(value.toString());
            } else if (var[0].equals("integer")) {
                if (value != null) {
                    int number = ParserValues.getInstance().parseString(value.toString());
                    var[1] = number;
                }
            } else if (var[0].equals("boolean")) {
                if (value.toString().equals("true") || value.toString().equals("false")) {
                    var[1] = value;
                } else {
                    throw new ParseCancellationException("Ошибка интерпретации: Неверный тип!");
                }
            } else if (var[0].equals("string")) {
                if (value.toString().startsWith("\"")) {
                    var[1] = value;
                } else {
                    throw new ParseCancellationException("Ошибка интерпретации: Неверный тип!");
                }
            }
        } else {
            throw new ParseCancellationException("Ошибка интерпретации: переменная не объявлена!");
        }
        return 0;
    }
}

