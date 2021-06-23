package impl;

import generated.GrammarFileBaseVisitor;
import generated.GrammarFileParser;
import org.antlr.v4.runtime.misc.ParseCancellationException;

import java.util.Scanner;

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

                String valor = visit(value).toString();
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
    public Object visitProcDeclFunc(GrammarFileParser.ProcDeclFuncContext ctx) {
        String nameMethod = ctx.ID().toString();
        if (nameMethod != null) {
            SymbolsTable.getInstance().addFunction(nameMethod);
        }
        return 0d;
    }

    @Override
    public Object visitIdStmt(GrammarFileParser.IdStmtContext ctx) {
        String nameMethod = ctx.ID().toString();
        if (SymbolsTable.getInstance().getFunction(nameMethod) != null) {
        } else {
            throw new ParseCancellationException("Ошибка интерпретации: метод не найден");
        }
        return 0d;
    }

    @Override
    public Object visitSmplExpression(GrammarFileParser.SmplExpressionContext ctx) {
        Double total = 0.0;
        if (ctx.term(0).getText().matches("[a-zA-Z][a-zA-Z0-9_]*(\\Q[\\E[0-9]+\\Q]\\E)?")) {
            total = Double.parseDouble(visit(ctx.term(0)).toString());
        } else if (ctx.term(0).getText().startsWith("\"")) {
            return ctx.term(0).getText();
        } else {
            total = Double.parseDouble(visit(ctx.term(0)).toString());
        }
        int pos = 1;
        for (GrammarFileParser.AddopContext add : ctx.addop()) {

            if (add.getText().equals("+")) {
                total += Double.parseDouble(ctx.term(pos).getText());
            } else if (add.getText().equals("-")) {
                total -= Double.parseDouble(ctx.term(pos).getText());
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
            double total = Double.parseDouble(ctx.factor(0).getText());
            int pos = 1;
            for (GrammarFileParser.MultopContext add : ctx.multop()) {
                if (add.getText().equals("*")) {
                    total *= Double.parseDouble(ctx.factor(pos).getText());
                } else if (add.getText().equals("div")) {
                    total /= Double.parseDouble(ctx.factor(pos).getText());
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

        return SymbolsTable.getInstance().getSymbol(ctx.getText())[1];
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
            if (value == null) {
                value = ctx.expression().getText();
            }
            Object[] var = SymbolsTable.getInstance().getSymbol(ctx.variable().getText());
            if (var[0].equals("float")) {
                var[1] = Float.parseFloat(value.toString());
            } else if (var[0].equals("integer")) {
               // var[1] = (int)Double.parseDouble(value.toString());
               int number = ParserValues.getInstance().parseString(value.toString());
                 var[1] = number;
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

