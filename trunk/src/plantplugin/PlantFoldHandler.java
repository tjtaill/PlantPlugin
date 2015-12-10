package plantplugin;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.gjt.sp.jedit.buffer.FoldHandler;
import org.gjt.sp.jedit.buffer.JEditBuffer;
import plantparser.PlantumlLexer;
import plantparser.PlantumlParser;

import javax.swing.text.Segment;
import java.util.HashMap;

public class PlantFoldHandler extends FoldHandler {
    private boolean needsParsing = true;
    private HashMap<Integer, Integer> foldLevels = new HashMap<>();

    public PlantFoldHandler() {
        super("plant");
    }

    @Override
    public int getFoldLevel(JEditBuffer jEditBuffer, int i, Segment segment) {
        if (needsParsing) {
            try {
                PlantumlLexer lexer = new PlantumlLexer(new ANTLRInputStream(jEditBuffer.getText()));
                CommonTokenStream tokens = new CommonTokenStream(lexer);

                PlantumlParser parser = new PlantumlParser(tokens);

                ParseTree tree = parser.file();

                ParseTreeWalker walker = new ParseTreeWalker();

                PlantFoldListener listener = new PlantFoldListener(foldLevels);

                walker.walk(listener, tree);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

            needsParsing = false;
        }
        Integer foldLevel = foldLevels.get(i);
        return foldLevel == null ? 0 : foldLevel;
    }


}
