
import generated.*;
import impl.MyBaseListener;
import impl.MyBaseVisitor;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;

public class MMain {
    public static void main(String[] args) throws IOException {
        ANTLRInputStream input = new ANTLRFileStream("input.basic");
        GrammarFileLexer lexer = new GrammarFileLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        GrammarFileParser parser = new GrammarFileParser(tokens);

        GrammarFileListener listener = new MyBaseListener();
        parser.addParseListener(listener);
        ParseTree tree = parser.program();
        try {
            ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(listener,tree);
        }catch (Exception e){
            e.printStackTrace();
        }

//        parser.myStartingRule().enterRule(listener);
//        GrammarFileVisitor eval = new MyBaseVisitor();
//        eval.visit(tree);

    }
}
