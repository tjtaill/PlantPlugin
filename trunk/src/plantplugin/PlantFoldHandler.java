package plantplugin;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.gjt.sp.jedit.EBComponent;
import org.gjt.sp.jedit.EBMessage;
import org.gjt.sp.jedit.EditBus;
import org.gjt.sp.jedit.buffer.FoldHandler;
import org.gjt.sp.jedit.buffer.JEditBuffer;
import org.gjt.sp.jedit.msg.EditPaneUpdate;
import plantparser.PlantumlLexer;
import plantparser.PlantumlParser;

import javax.swing.text.Segment;
import java.util.HashMap;

public class PlantFoldHandler extends FoldHandler implements EBComponent {
    private boolean needsParsing = true;
    private HashMap<Integer, Integer> foldLevels = new HashMap<>();
    private JEditBuffer buffer;

    public PlantFoldHandler() {
        super("plant");
        EditBus.addToBus(this);
    }

    @Override
    public int getFoldLevel(JEditBuffer jEditBuffer, int i, Segment segment) {
        if (needsParsing) {
            buffer = jEditBuffer;
            foldLevels.clear();
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


    @Override
    public void handleMessage(EBMessage ebMessage) {
        if( ebMessage instanceof EditPaneUpdate) {
            EditPaneUpdate editPaneUpdate = (EditPaneUpdate) ebMessage;

            if ( !needsParsing && editPaneUpdate.getSource() == buffer && editPaneUpdate.getWhat() == EditPaneUpdate.BUFFER_CHANGED ) {
                needsParsing = true;
            }
        }
    }
}
