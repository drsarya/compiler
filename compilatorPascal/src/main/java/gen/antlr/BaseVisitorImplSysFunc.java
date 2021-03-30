// Generated from C:/Users/PC/Desktop/compilator/compilatorPascal/src/main/java/antlr\GrammarFile.g4 by ANTLR 4.9.1
package gen.antlr;

import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * This class provides an empty implementation of {@link GrammarFileVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 */
public class BaseVisitorImplSysFunc extends AbstractParseTreeVisitor<String> implements GrammarFileVisitor<String> {
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    private Map<String, Double> memory = new HashMap<>();
    public List<String> values = new ArrayList<>();

    public List<String> getValues() {
        return values;
    }

    @Override
    public String visitProg(GrammarFileParser.ProgContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public String visitPrintExpr(GrammarFileParser.PrintExprContext ctx) {
        String value = visit(ctx.expr());
        values.add(value);
        return value;
    }

    @Override
    public String visitAssign(GrammarFileParser.AssignContext ctx) {
        String id = ctx.ID().getText();
        String value = visit(ctx.expr());
        memory.put(id, Double.parseDouble(value));
        return value;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public String visitBlank(GrammarFileParser.BlankContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitNum(GrammarFileParser.NumContext ctx) {
        return ctx.NUM().getText();
    }


    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public String visitIncDecAbs(GrammarFileParser.IncDecAbsContext ctx) {
        String nameOrValue = visit(ctx.expr(0));
        Double value = null;
        Double res = null;

        if (ctx.expr().size() > 1) {
            value = Double.parseDouble(visit(ctx.expr(1)));
        }
        switch (ctx.op.getType()) {
            case GrammarFileParser.ABS: {
                if (value != null) throw new IllegalArgumentException("Ошибочное число параметров функции abs");
                res = Math.abs(Double.parseDouble(nameOrValue));
                break;
            }
            case GrammarFileParser.DEC: {
                if (value == null) value = 1.0;
                res = memory.get(nameOrValue) - value;
                memory.put(nameOrValue, memory.get(nameOrValue) - value);
                break;
            }
            case GrammarFileParser.INC: {
                if (value == null) value = 1.0;
                res = memory.get(nameOrValue) + value;
                memory.put(nameOrValue, memory.get(nameOrValue) + value);
                break;
            }
        }
        return Double.toString(res);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public String visitId(GrammarFileParser.IdContext ctx) {
        String id = ctx.ID().getText();
        if (memory.containsKey(id))
            return id;
        throw new IllegalArgumentException("Необъявленная переменная: " + id);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */

}