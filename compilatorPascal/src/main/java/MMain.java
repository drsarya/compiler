
import generated.GrammarFileLexer;
import generated.GrammarFileParser;
import generated.GrammarFileVisitor;
import impl.MyBaseVisitor;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class MMain {
    public static void main(String[] args) throws IOException {
        ANTLRInputStream input = new ANTLRFileStream("input.basic");
        GrammarFileLexer lexer = new GrammarFileLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        GrammarFileParser parser = new GrammarFileParser(tokens);

        ParseTree tree = parser.program();

        GrammarFileVisitor eval = new MyBaseVisitor();
        eval.visit(tree);

    }
}
