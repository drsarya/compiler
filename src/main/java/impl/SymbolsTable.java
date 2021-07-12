package impl;

import java.util.HashMap;
import java.util.List;

public class SymbolsTable {
    private HashMap<String, Object[]> symbols;
    private HashMap<String, FunctionModel> functions;

    protected SymbolsTable() {
        symbols = new HashMap<>();
        functions = new HashMap<>();
    }

    private static SymbolsTable INSTANCE;

    public static SymbolsTable getInstance() {
        if (INSTANCE == null)
            INSTANCE = new SymbolsTable();
        return INSTANCE;
    }

    public void addSymbol(String symbol, Object[] value) {
        if (symbols.containsKey(symbol)) {
            throw new IllegalArgumentException("Повторяющееся имя переменной" + symbol);
        }
        symbols.put(symbol, value);
    }

    public void addFunction(FunctionModel model) {
        if (functions.containsKey(model.getName())) {
            throw new IllegalArgumentException("Повторяющееся имя метода" + model.getName());
        }
        functions.put(model.getName(), model);
    }

    public FunctionModel getFunction(String symbol) {
        if (functions.containsKey(symbol)) {
            return functions.get(symbol);
        } else {
            throw new IllegalArgumentException("Функция не найдена");
        }
    }

    public Object[] getSymbol(String symbol) {
        if (symbols.containsKey(symbol)) {
            return symbols.get(symbol);
        }else {
            throw new IllegalArgumentException("Переменная не найдена");
        }
    }

    public void removeVariables(List<VariableModel> variableList) {
        for (int i = 0; i < variableList.size(); i++) {
            symbols.remove(variableList.get(i).getName());
        }
    }
}
