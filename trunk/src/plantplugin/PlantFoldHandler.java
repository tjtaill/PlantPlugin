package plantplugin;

import org.gjt.sp.jedit.buffer.FoldHandler;
import org.gjt.sp.jedit.buffer.JEditBuffer;

import javax.swing.text.Segment;

public class PlantFoldHandler extends FoldHandler {



    protected PlantFoldHandler(String s) {
        super(s);
    }

    @Override
    public int getFoldLevel(JEditBuffer jEditBuffer, int i, Segment segment) {
        return 0;
    }


}
