import gen.antlr.BaseVisitorImplSysFunc;
import gen.antlr.GrammarFileLexer;
import gen.antlr.GrammarFileParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.atn.PredictionMode;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        String javaClassContent = "a:=5;\n" +
                "abs( 66);\n";
        //javaClassContent = "inc(a, 5);\n";
        //javaClassContent = "a:=5;\n dec(a, 5 );\n";
        //javaClassContent = "abs(-5);\n";
        GrammarFileLexer lexer = new GrammarFileLexer(CharStreams.fromString(javaClassContent));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        GrammarFileParser parser = new GrammarFileParser(tokens);
        parser.getInterpreter().setPredictionMode(PredictionMode.LL_EXACT_AMBIG_DETECTION);
        ParseTree tree = parser.prog();
        BaseVisitorImplSysFunc visitor = new BaseVisitorImplSysFunc();
        visitor.visit(tree);
        List<String> list = visitor.getValues();
        for (String i : list) {
            System.out.println(i);
        }
    }
}
