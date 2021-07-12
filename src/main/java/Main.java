
import generated.*;
import impl.MyBaseListener;
import impl.MyBaseVisitor;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ANTLRInputStream input = new ANTLRFileStream("input.txt");
        GrammarFileLexer lexer = new GrammarFileLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        GrammarFileParser parser = new GrammarFileParser(tokens);

        GrammarFileListener listener = new MyBaseListener();

        ParseTree tree = parser.program();
        GrammarFileVisitor eval = new MyBaseVisitor();
        eval.visit(tree);
        /*"Семантический" анализ*/
//        try {
//            ParseTreeWalker walker = new ParseTreeWalker();
//            walker.walk(listener,tree);
//        }catch (Exception e){
//            e.printStackTrace();
//        }
    }

}
