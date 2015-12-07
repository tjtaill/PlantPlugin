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
    private FoldState foldState = FoldState.NONE;
    private LinkedList<FoldState> foldStack = new LinkedList<>();


    private static enum FoldState {
        NONE,
        PARTICIPANT,
        BOX,
        SINGLE_COMMENT,
        MULTILINE_COMMENT,
        SINGLE_NOTE,
        MULTILINE_NOTE,
        MESSAGE,
        GROUP
    }

    private final static EnumSet<FoldState> LINE_FOLDS =
            EnumSet.of( FoldState.MESSAGE, FoldState.PARTICIPANT, FoldState.SINGLE_COMMENT);

    private final static EnumSet<FoldState> GROUP_FOLDS = EnumSet.of(FoldState.BOX, FoldState.GROUP);

    private Map<Integer, Integer> foldLevels;

    public PlantFoldListener(Map<Integer, Integer> foldLevels) {
        this.foldLevels = foldLevels;
    }

    @Override
    public void enterEndStatement(@NotNull PlantumlParser.EndStatementContext ctx) {
        if ( foldStack.peekFirst() == FoldState.MULTILINE_COMMENT ) return;
        int line = ctx.getStart().getLine();
        foldLevels.put(line, foldLevel--);
        foldStack.removeFirst();
    }

    private void startOrContinueFolding(FoldState foldState, ParserRuleContext ctx) {
        if ( foldStack.peekFirst() == FoldState.MULTILINE_COMMENT ) return;
        int line = ctx.getStart().getLine();
        if ( foldStack.peekFirst() == FoldState.PARTICIPANT) {
            foldLevels.put(line, foldLevel);
        } else {
            foldLevels.put(line, foldLevel++);
            foldStack.addFirst(FoldState.PARTICIPANT);
        }
    }

    @Override
    public void enterParticpantAsStatement(@NotNull PlantumlParser.ParticpantAsStatementContext ctx) {
        startOrContinueFolding(FoldState.PARTICIPANT, ctx);
    }


    @Override
    public void enterStartMultilineComment(@NotNull PlantumlParser.StartMultilineCommentContext ctx) {
        startOrContinueFolding(FoldState.MULTILINE_COMMENT, ctx);
    }

    @Override
    public void enterOtherLine(@NotNull PlantumlParser.OtherLineContext ctx) {
        if ( foldStack.peekFirst() == FoldState.MULTILINE_COMMENT ) return;
        int line = ctx.getStart().getLine();
        if ( LINE_FOLDS.contains( foldStack.peekFirst() ) ) {
            foldStack.removeFirst();
            foldLevels.put(line, --foldLevel);
        }
    }

    @Override
    public void enterSingleLineComment(@NotNull PlantumlParser.SingleLineCommentContext ctx) {
        startOrContinueFolding(FoldState.SINGLE_COMMENT, ctx);
    }

    @Override
    public void enterMessageStatement(@NotNull PlantumlParser.MessageStatementContext ctx) {
        startOrContinueFolding(FoldState.MESSAGE, ctx);
    }



    @Override
    public void enterEndNoteStatement(@NotNull PlantumlParser.EndNoteStatementContext ctx) {

    }

    @Override
    public void enterSimpleParticipantStatement(@NotNull PlantumlParser.SimpleParticipantStatementContext ctx) {
        startOrContinueFolding(FoldState.PARTICIPANT, ctx);
    }

    @Override
    public void enterBeginGroupStatement(@NotNull PlantumlParser.BeginGroupStatementContext ctx) {
        super.enterBeginGroupStatement(ctx);
    }

    @Override
    public void enterEndMultiLineComment(@NotNull PlantumlParser.EndMultiLineCommentContext ctx) {
        super.enterEndMultiLineComment(ctx);
    }

    @Override
    public void enterStartMultiLineNoteStatement(@NotNull PlantumlParser.StartMultiLineNoteStatementContext ctx) {
        super.enterStartMultiLineNoteStatement(ctx);
    }

    @Override
    public void enterStartBoxStatement(@NotNull PlantumlParser.StartBoxStatementContext ctx) {
        super.enterStartBoxStatement(ctx);
    }

}
