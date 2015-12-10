package plantplugin;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.NotNull;
import plantparser.PlantumlBaseListener;
import plantparser.PlantumlParser;

import java.util.EnumSet;
import java.util.LinkedList;
import java.util.Map;


public class PlantFoldListener extends PlantumlBaseListener {
    private int foldLevel = 0;
    private LinkedList<FoldState> foldStack = new LinkedList<>();


    private static enum FoldState {
        SPRITE,
        PARTICIPANT,
        BOX,
        SINGLE_COMMENT,
        MULTILINE_COMMENT,
        MULTILINE_NOTE,
        MESSAGE,
        GROUP
    }

    private final static EnumSet<FoldState> LINE_FOLDS =
            EnumSet.of( FoldState.MESSAGE, FoldState.PARTICIPANT, FoldState.SINGLE_COMMENT, FoldState.SPRITE);

    private final static EnumSet<FoldState> GROUP_FOLDS = EnumSet.of(FoldState.BOX, FoldState.GROUP);

    private Map<Integer, Integer> foldLevels;

    public PlantFoldListener(Map<Integer, Integer> foldLevels) {
        this.foldLevels = foldLevels;
    }

    private void startOrContinueFolding(FoldState foldState, ParserRuleContext ctx) {
        int line = ctx.getStart().getLine() - 1;
        if ( foldStack.peekFirst() == FoldState.MULTILINE_COMMENT ) {
            foldLevels.put(line, foldLevel);
            return;
        }

        if ( foldStack.isEmpty() ) {
            foldStack.addFirst(foldState);
            foldLevels.put(line, foldLevel++);
            return;
        } else if ( foldStack.peekFirst() == foldState) {
            foldLevels.put(line, foldLevel);
        } else if ( GROUP_FOLDS.contains( foldStack.peekFirst() ) ) {
            foldLevels.put(line, foldLevel++);
            foldStack.addFirst(foldState);
        } else if ( foldLevel > 0 ){
            foldStack.removeFirst();
            foldLevels.put(line, foldLevel-1);
            foldStack.addFirst(foldState);
        } else {
            foldStack.removeFirst();
            foldLevels.put(line, foldLevel++);
            foldStack.addFirst(foldState);
        }
    }

    @Override
    public void enterMultiLineNote(@NotNull PlantumlParser.MultiLineNoteContext ctx) {
        startOrContinueFolding(FoldState.MULTILINE_NOTE, ctx);
    }

    @Override
    public void enterStartMultilineComment(@NotNull PlantumlParser.StartMultilineCommentContext ctx) {
        int line = ctx.getStart().getLine();
        if ( foldStack.peekFirst() == FoldState.MULTILINE_COMMENT ) {
            foldLevels.put( line, foldLevel);
            return;
        }
        foldStack.addFirst(FoldState.MULTILINE_NOTE);
        foldLevels.put(line, foldLevel++);
    }

    @Override
    public void enterOtherLine(@NotNull PlantumlParser.OtherLineContext ctx) {
        int line = ctx.getStart().getLine() - 1;
        if ( LINE_FOLDS.contains( foldStack.peekFirst() ) ) {
            foldStack.removeFirst();
            foldLevels.put(line, --foldLevel);
        } else {
            foldLevels.put(line, foldLevel);
        }
    }

    @Override
    public void enterSingleLineComment(@NotNull PlantumlParser.SingleLineCommentContext ctx) {
        startOrContinueFolding(FoldState.SINGLE_COMMENT, ctx);
    }

    @Override
    public void enterMessage(@NotNull PlantumlParser.MessageContext ctx) {
        startOrContinueFolding(FoldState.MESSAGE, ctx);
    }

    @Override
    public void enterParticipant(@NotNull PlantumlParser.ParticipantContext ctx) {
        startOrContinueFolding(FoldState.PARTICIPANT, ctx);
    }

    @Override
    public void enterStartBox(@NotNull PlantumlParser.StartBoxContext ctx) {
        int line = ctx.getStart().getLine() - 1;
        if ( foldStack.peekFirst() == FoldState.MULTILINE_COMMENT ) {
            foldLevels.put(line, foldLevel);
            return;
        }
        foldStack.addFirst(FoldState.BOX);
        foldLevels.put(line, foldLevel++);
    }

    @Override
    public void enterStartGroup(@NotNull PlantumlParser.StartGroupContext ctx) {
        int line = ctx.getStart().getLine() - 1;
        if ( foldStack.peekFirst() == FoldState.MULTILINE_COMMENT ) {
            foldLevels.put( line, foldLevel);
            return;
        }
        foldStack.addFirst(FoldState.GROUP);
        foldLevels.put(ctx.getStart().getLine(), foldLevel++);
    }

    @Override
    public void enterSprite(@NotNull PlantumlParser.SpriteContext ctx) {
        startOrContinueFolding(FoldState.SPRITE, ctx);
    }

    @Override
    public void enterEndNote(@NotNull PlantumlParser.EndNoteContext ctx) {
        int line = ctx.getStart().getLine() - 1;
        if ( foldStack.peekFirst() == FoldState.MULTILINE_COMMENT ) {
            foldLevels.put( line, foldLevel);
            return;
        }
        foldStack.removeFirst();
        foldLevels.put(line, foldLevel--);
    }

    @Override
    public void enterEndMultiLineComment(@NotNull PlantumlParser.EndMultiLineCommentContext ctx) {
        foldStack.removeFirst();
        foldLevels.put(ctx.getStart().getLine(), foldLevel--);
    }

    @Override
    public void enterEnd(@NotNull PlantumlParser.EndContext ctx) {
        int line = ctx.getStart().getLine() - 1;
        if ( foldStack.peekFirst() == FoldState.MULTILINE_COMMENT ) {
            foldLevels.put(line, foldLevel);
            return;
        }
        // REMOVE TILL in and including the first group fold group Fold
        while (! GROUP_FOLDS.contains( foldStack.peekFirst() ) ) {
            foldStack.removeFirst();
            foldLevel--;
        }
        foldStack.removeFirst();
        foldLevels.put(line, foldLevel--);
    }
}
