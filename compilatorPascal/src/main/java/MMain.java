
import generated.*;
import impl.MyBaseListener;
import impl.MyBaseVisitor;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.xpath.XPath;

import java.io.IOException;

public class MMain {
    public static void main(String[] args) throws IOException {
        ANTLRInputStream input = new ANTLRFileStream("input.txt");
        GrammarFileLexer lexer = new GrammarFileLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        GrammarFileParser parser = new GrammarFileParser(tokens);

        GrammarFileListener listener = new MyBaseListener();
       // parser.addParseListener(listener);
       // print(parser.program(), false);

        ParseTree tree = parser.program();

        GrammarFileVisitor eval = new MyBaseVisitor();
        eval.visit(tree);
//        parser.myStartingRule().enterRule(listener);
//        MyBaseVisitor eval = new MyBaseVisitor();
//        eval.visit(tree);
//        print((RuleContext) eval.visit(tree), false);



    }

}
