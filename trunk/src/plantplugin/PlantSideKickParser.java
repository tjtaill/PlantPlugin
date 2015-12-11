package plantplugin;

import errorlist.DefaultErrorSource;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.gjt.sp.jedit.Buffer;
import org.gjt.sp.jedit.EditPane;
import org.gjt.sp.jedit.View;
import org.gjt.sp.jedit.textarea.JEditTextArea;
import plantparser.PlantumlLexer;
import plantparser.PlantumlParser;
import sidekick.SideKickCompletion;
import sidekick.SideKickCompletionPopup;
import sidekick.SideKickParsedData;
import sidekick.SideKickParser;

import javax.swing.*;
import java.util.Collections;
import java.util.List;

public class PlantSideKickParser extends SideKickParser {
    private SideKickCompletionPopup lastCompletionPopup;
    private PlantCompletion lastCompletion;
    private CompletionBuilder completionBuilder;

    public PlantSideKickParser() {
        super("plant");
    }

    @Override
    public SideKickParsedData parse(Buffer buffer, DefaultErrorSource defaultErrorSource) {
        PlantSideKickParsedData data = new PlantSideKickParsedData( buffer.getPath() );
        completionBuilder = new CompletionBuilder();
        boolean valid = PlantPlugin.validatePlant(buffer);
        if ( valid ) {
            PlantumlLexer lexer = new PlantumlLexer(new ANTLRInputStream(buffer.getText()));
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            PlantumlParser parser = new PlantumlParser(tokens);

            ParseTree tree = parser.file();

            ParseTreeWalker walker = new ParseTreeWalker();

            PlantSidekickListener listener = new PlantSidekickListener(data, buffer, completionBuilder);

            walker.walk(listener, tree);
        }
        return data;
    }

    @Override
    public boolean supportsCompletion() {
        return true;
    }

    @Override
    public boolean canCompleteAnywhere() {
        return false;
    }

    @Override
    public String getInstantCompletionTriggers() {
        return ">:";
    }

    public SideKickCompletionPopup getCompletionPopup(View view,
                                                      int caretPosition, SideKickCompletion complete, boolean active)
    {
        lastCompletionPopup = new SideKickCompletionPopup(view, this, caretPosition,
                complete, active);
        lastCompletion.setCompletionPopup( lastCompletionPopup );
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                lastCompletionPopup.setSelectedIndex(0);
            }
        });
        return lastCompletionPopup;
    }

    @Override
    public SideKickCompletion complete(EditPane editPane, int caret) {
        Buffer buffer = editPane.getBuffer();
        JEditTextArea textArea = editPane.getTextArea();
        //TODO : figure out which type of completion it is
        char c = textArea.getText(caret, 1).charAt(0);
        List<String> completions = Collections.EMPTY_LIST;
        if ( c == '>') {
            completionBuilder.completeParticipant();
        } else if (c == ':' ){
            completions = completionBuilder.completeMessages();
        }
        lastCompletion = new PlantCompletion(editPane.getView(), "", completions);
        return lastCompletion;
    }

}
