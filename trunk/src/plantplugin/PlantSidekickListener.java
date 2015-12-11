package plantplugin;


import org.antlr.v4.runtime.misc.NotNull;
import org.gjt.sp.jedit.Buffer;
import plantparser.PlantumlBaseListener;
import plantparser.PlantumlParser;
import sidekick.enhanced.SourceAsset;

import javax.swing.text.Position;
import javax.swing.tree.DefaultMutableTreeNode;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PlantSidekickListener extends PlantumlBaseListener {
    private PlantSideKickParsedData data;
    private Buffer buffer;
    private CompletionBuilder completions;
    private static final Pattern MSG = Pattern.compile("(\\S+)\\s*-\\[?#?.*?\\]?>\\s*(\\S+)\\s*:(.*)");


    public PlantSidekickListener(PlantSideKickParsedData data, Buffer buffer, CompletionBuilder completions) {
        this.data = data;
        this.buffer = buffer;
        this.completions = completions;
    }

    private Position begin(int line, Buffer buffer) {
        return buffer.createPosition(buffer.getLineStartOffset(line));
    }

    @Override
    public void enterNote(@NotNull PlantumlParser.NoteContext ctx) {
        int line = ctx.getStart().getLine()-1;
        if ( data.notes == null ) {
            SourceAsset notes = new SourceAsset("notes", line, begin(line, buffer) );
            data.notes = new DefaultMutableTreeNode(notes);
            data.root.add(data.notes);
        }
        SourceAsset note = new SourceAsset(ctx.getText(), line, begin(line, buffer));
        data.notes.add( new DefaultMutableTreeNode(note));
    }

    @Override
    public void enterMessage(@NotNull PlantumlParser.MessageContext ctx) {
        int line = ctx.getStart().getLine()-1;
        if ( data.messages == null ) {
            SourceAsset messages = new SourceAsset("messages", line, begin(line, buffer) );
            data.messages = new DefaultMutableTreeNode(messages);
            data.root.add( data.messages );
        }
        String msg = ctx.getText();
        Matcher matcher = MSG.matcher(msg);
        if ( matcher.find() ) {
            String p1 = matcher.group(1);
            String p2 = matcher.group(2);
            String ms = matcher.group(3);
            completions.addParticipant(p1);
            completions.addParticipant(p2);
            completions.addMessage(ms);
        }
        SourceAsset message = new SourceAsset(msg, line, begin(line, buffer));
        data.messages.add(new DefaultMutableTreeNode(message));
    }

    @Override
    public void enterParticipant(@NotNull PlantumlParser.ParticipantContext ctx) {
        int line = ctx.getStart().getLine()-1;
        if ( data.particpants == null ) {
            SourceAsset participants = new SourceAsset("participants", line, begin(line, buffer) );
            data.particpants = new DefaultMutableTreeNode(participants);
            data.root.add( data.particpants );
        }
        String participantText = ctx.getText();
        participantText = participantText.substring( participantText.lastIndexOf(' ') + 1 );
        SourceAsset participant = new SourceAsset(participantText, line, begin(line, buffer));
        data.particpants.add(new DefaultMutableTreeNode(participant));
        completions.addParticipant(participantText);
    }

    @Override
    public void enterStartBox(@NotNull PlantumlParser.StartBoxContext ctx) {
        int line = ctx.getStart().getLine()-1;
        if ( data.boxes == null ) {
            SourceAsset participants = new SourceAsset("participants", line, begin(line, buffer) );
            data.boxes = new DefaultMutableTreeNode(participants);
            data.root.add( data.boxes );
        }
        SourceAsset participant = new SourceAsset(ctx.getText(), line, begin(line, buffer));
        data.boxes.add(new DefaultMutableTreeNode(participant));
    }

    @Override
    public void enterStartGroup(@NotNull PlantumlParser.StartGroupContext ctx) {
        int line = ctx.getStart().getLine()-1;
        if ( data.groups == null ) {
            SourceAsset groups = new SourceAsset("groups", line, begin(line, buffer) );
            data.groups = new DefaultMutableTreeNode(groups);
            data.root.add( data.groups );
        }
        SourceAsset group = new SourceAsset(ctx.getText(), line, begin(line, buffer));
        data.groups.add(new DefaultMutableTreeNode(group));
    }
}
