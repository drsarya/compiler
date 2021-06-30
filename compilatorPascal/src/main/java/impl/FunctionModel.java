package impl;

import generated.GrammarFileParser;

import java.util.List;

public class FunctionModel {

    private  String name;
    private  List<VariableModel> variableList;
    private   GrammarFileParser.StatementpartContext programContext;

    public String getName() {
        return name;
    }

    public List<VariableModel> getVariableList() {
        return variableList;
    }

    public GrammarFileParser.StatementpartContext getProgramContext() {
        return programContext;
    }

    public FunctionModel(String name, List<VariableModel> variableList, GrammarFileParser.StatementpartContext programContext) {
        this.name = name;

        this.variableList = variableList;
        this.programContext = programContext;
        setName();
    }

    private void setName() {
        for (int i = 0; i < variableList.size(); i++) {
            variableList.get(i).setName(name + variableList.get(i).getName());
        }
    }
}
