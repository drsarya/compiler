package impl;

import java.util.HashMap;

public class SymbolsTable {
    private HashMap<String, Object[]> symbols;
    private HashMap<String, String> functions;

    protected SymbolsTable() {
        symbols = new HashMap<>();
        functions= new HashMap<>();
    }

    private static SymbolsTable INSTANCE;

    public static SymbolsTable getInstance() {
        if (INSTANCE == null)
            INSTANCE = new SymbolsTable();
        return INSTANCE;
    }

    public void addSymbol(String symbol, Object[] value) {
        if (symbols.containsKey(symbol)) {
            throw new IllegalArgumentException("Повторяющееся имя переменной"+ symbol);
        }
        symbols.put(symbol, value);
    }

    public void addFunction(String symbol) {
        if (functions.containsKey(symbol)) {
            throw new IllegalArgumentException("Повторяющееся имя метода"+ symbol);
        }
        functions.put(symbol,"method");
    }
    public String getFunction(String symbol ) {
        if (functions.containsKey(symbol)) {
            return functions.get(symbol);
        }
        return null;
    }
    public Object[] getSymbol(String symbol) {
        if (symbols.containsKey(symbol)) {
            return symbols.get(symbol);
        }
        return null;
    }
}
