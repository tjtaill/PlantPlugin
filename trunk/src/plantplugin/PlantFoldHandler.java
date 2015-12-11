package plantplugin;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.gjt.sp.jedit.EBComponent;
import org.gjt.sp.jedit.EBMessage;
import org.gjt.sp.jedit.EditBus;
import org.gjt.sp.jedit.EditPane;
import org.gjt.sp.jedit.buffer.BufferListener;
import org.gjt.sp.jedit.buffer.FoldHandler;
import org.gjt.sp.jedit.buffer.JEditBuffer;
import org.gjt.sp.jedit.msg.EditPaneUpdate;
import plantparser.PlantumlLexer;
import plantparser.PlantumlParser;

import javax.swing.text.Segment;
import java.util.HashMap;

public class PlantFoldHandler extends FoldHandler implements BufferListener {
    private boolean needsParsing = true;
    private HashMap<Integer, Integer> foldLevels = new HashMap<>();
    private JEditBuffer buffer;
    private boolean bufferRegistered;

    public PlantFoldHandler() {
        super("plant");

    }

    @Override
    public int getFoldLevel(JEditBuffer jEditBuffer, int i, Segment segment) {
        if ( ! bufferRegistered ) {
            jEditBuffer.addBufferListener(this);
            bufferRegistered = true;
        }

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
    public void foldLevelChanged(JEditBuffer jEditBuffer, int i, int i1) {

    }

    @Override
    public void contentInserted(JEditBuffer jEditBuffer, int i, int i1, int i2, int i3) {
        needsParsing = true;
    }

    @Override
    public void contentRemoved(JEditBuffer jEditBuffer, int i, int i1, int i2, int i3) {
        needsParsing = true;
    }

    @Override
    public void preContentInserted(JEditBuffer jEditBuffer, int i, int i1, int i2, int i3) {

    }

    @Override
    public void preContentRemoved(JEditBuffer jEditBuffer, int i, int i1, int i2, int i3) {

    }

    @Override
    public void transactionComplete(JEditBuffer jEditBuffer) {

    }

    @Override
    public void foldHandlerChanged(JEditBuffer jEditBuffer) {

    }

    @Override
    public void bufferLoaded(JEditBuffer jEditBuffer) {

    }
}
