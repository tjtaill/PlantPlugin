package plantplugin;


import org.gjt.sp.jedit.EditPane;
import org.gjt.sp.jedit.View;
import org.gjt.sp.jedit.buffer.JEditBuffer;
import org.gjt.sp.jedit.textarea.Selection;
import sidekick.SideKickActions;
import sidekick.SideKickCompletion;
import sidekick.SideKickCompletionPopup;

import javax.swing.*;
import java.util.List;

public class PlantCompletion extends SideKickCompletion {
    private SideKickCompletionPopup completionPopup;
    private StringBuilder typedChars = new StringBuilder();
    private CompletionType completionType;
    private int line;

    public void setCompletionType(CompletionType completionType) {
        this.completionType = completionType;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public enum CompletionType {
        PARTICIPANT,
        MESSAGE
    }


    public PlantCompletion(View view, String text, List items) {
        super(view, text, items);
    }

    @Override
    public boolean handleKeystroke(int selectedIndex, char keyChar)
    {
        // if(keyChar == '\t' || keyChar == '\n')
        if(SideKickActions.acceptChars.indexOf(keyChar) > -1)
        {
            insert(selectedIndex);
            if(SideKickActions.insertChars.indexOf(keyChar) > -1)
                textArea.userInput(keyChar);
            return false;
        }
        else
        {
            typedChars.append(keyChar);
            String prefix = typedChars.toString();
            for(int i = 0; i < items.size(); i++) {
                String description = (String)items.get(i);
                if ( description.startsWith(prefix) ) {
                    final int toSelect = i;
                    SwingUtilities.invokeLater(new Runnable() {
                        public void run() {
                            completionPopup.setSelectedIndex(toSelect);
                        }
                    });
                    return true;
                }
            }
            // don't bother handling backspace yet just clear and start over
            typedChars.setLength(0);
            return true;
        }
    }

    public void insert(int index)
    {
        String selected = String.valueOf(get(index));
        int caret = textArea.getCaretPosition();
        Selection s = textArea.getSelectionAtOffset(caret);
        int start = (s == null ? caret : s.getStart());
        int end = (s == null ? caret : s.getEnd());
        JEditBuffer buffer = textArea.getBuffer();
        String prefix = completionType == CompletionType.MESSAGE ? " [[" + line + "]] " : " ";
        try
        {
            buffer.beginCompoundEdit();
            buffer.remove(start - text.length(), text.length());
            buffer.insert(start - text.length(), prefix + selected);
        }
        finally
        {
            buffer.endCompoundEdit();
        }
    }

    @Override
    public boolean updateInPlace(EditPane editPane, int caret) {
        return true;
    }

    public void setCompletionPopup(SideKickCompletionPopup completionPopup) {
        this.completionPopup = completionPopup;
    }

}
