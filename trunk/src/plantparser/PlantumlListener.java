// Generated from Plantuml.g4 by ANTLR 4.4
package plantparser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PlantumlParser}.
 */
public interface PlantumlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PlantumlParser#endStatement}.
	 * @param ctx the parse tree
	 */
	void enterEndStatement(@NotNull PlantumlParser.EndStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlantumlParser#endStatement}.
	 * @param ctx the parse tree
	 */
	void exitEndStatement(@NotNull PlantumlParser.EndStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlantumlParser#particpantAsStatement}.
	 * @param ctx the parse tree
	 */
	void enterParticpantAsStatement(@NotNull PlantumlParser.ParticpantAsStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlantumlParser#particpantAsStatement}.
	 * @param ctx the parse tree
	 */
	void exitParticpantAsStatement(@NotNull PlantumlParser.ParticpantAsStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlantumlParser#startMultilineComment}.
	 * @param ctx the parse tree
	 */
	void enterStartMultilineComment(@NotNull PlantumlParser.StartMultilineCommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlantumlParser#startMultilineComment}.
	 * @param ctx the parse tree
	 */
	void exitStartMultilineComment(@NotNull PlantumlParser.StartMultilineCommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlantumlParser#comments}.
	 * @param ctx the parse tree
	 */
	void enterComments(@NotNull PlantumlParser.CommentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlantumlParser#comments}.
	 * @param ctx the parse tree
	 */
	void exitComments(@NotNull PlantumlParser.CommentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlantumlParser#otherLine}.
	 * @param ctx the parse tree
	 */
	void enterOtherLine(@NotNull PlantumlParser.OtherLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlantumlParser#otherLine}.
	 * @param ctx the parse tree
	 */
	void exitOtherLine(@NotNull PlantumlParser.OtherLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlantumlParser#singleLineComment}.
	 * @param ctx the parse tree
	 */
	void enterSingleLineComment(@NotNull PlantumlParser.SingleLineCommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlantumlParser#singleLineComment}.
	 * @param ctx the parse tree
	 */
	void exitSingleLineComment(@NotNull PlantumlParser.SingleLineCommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlantumlParser#messageString}.
	 * @param ctx the parse tree
	 */
	void enterMessageString(@NotNull PlantumlParser.MessageStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlantumlParser#messageString}.
	 * @param ctx the parse tree
	 */
	void exitMessageString(@NotNull PlantumlParser.MessageStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlantumlParser#messageStatement}.
	 * @param ctx the parse tree
	 */
	void enterMessageStatement(@NotNull PlantumlParser.MessageStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlantumlParser#messageStatement}.
	 * @param ctx the parse tree
	 */
	void exitMessageStatement(@NotNull PlantumlParser.MessageStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlantumlParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(@NotNull PlantumlParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlantumlParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(@NotNull PlantumlParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlantumlParser#endNoteStatement}.
	 * @param ctx the parse tree
	 */
	void enterEndNoteStatement(@NotNull PlantumlParser.EndNoteStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlantumlParser#endNoteStatement}.
	 * @param ctx the parse tree
	 */
	void exitEndNoteStatement(@NotNull PlantumlParser.EndNoteStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlantumlParser#participantId}.
	 * @param ctx the parse tree
	 */
	void enterParticipantId(@NotNull PlantumlParser.ParticipantIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlantumlParser#participantId}.
	 * @param ctx the parse tree
	 */
	void exitParticipantId(@NotNull PlantumlParser.ParticipantIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlantumlParser#simpleParticipantStatement}.
	 * @param ctx the parse tree
	 */
	void enterSimpleParticipantStatement(@NotNull PlantumlParser.SimpleParticipantStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlantumlParser#simpleParticipantStatement}.
	 * @param ctx the parse tree
	 */
	void exitSimpleParticipantStatement(@NotNull PlantumlParser.SimpleParticipantStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlantumlParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(@NotNull PlantumlParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlantumlParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(@NotNull PlantumlParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlantumlParser#startUmlStatement}.
	 * @param ctx the parse tree
	 */
	void enterStartUmlStatement(@NotNull PlantumlParser.StartUmlStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlantumlParser#startUmlStatement}.
	 * @param ctx the parse tree
	 */
	void exitStartUmlStatement(@NotNull PlantumlParser.StartUmlStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlantumlParser#participantStatement}.
	 * @param ctx the parse tree
	 */
	void enterParticipantStatement(@NotNull PlantumlParser.ParticipantStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlantumlParser#participantStatement}.
	 * @param ctx the parse tree
	 */
	void exitParticipantStatement(@NotNull PlantumlParser.ParticipantStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlantumlParser#beginGroupStatement}.
	 * @param ctx the parse tree
	 */
	void enterBeginGroupStatement(@NotNull PlantumlParser.BeginGroupStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlantumlParser#beginGroupStatement}.
	 * @param ctx the parse tree
	 */
	void exitBeginGroupStatement(@NotNull PlantumlParser.BeginGroupStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlantumlParser#startSingleLineNoteStatement}.
	 * @param ctx the parse tree
	 */
	void enterStartSingleLineNoteStatement(@NotNull PlantumlParser.StartSingleLineNoteStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlantumlParser#startSingleLineNoteStatement}.
	 * @param ctx the parse tree
	 */
	void exitStartSingleLineNoteStatement(@NotNull PlantumlParser.StartSingleLineNoteStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlantumlParser#endMultiLineComment}.
	 * @param ctx the parse tree
	 */
	void enterEndMultiLineComment(@NotNull PlantumlParser.EndMultiLineCommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlantumlParser#endMultiLineComment}.
	 * @param ctx the parse tree
	 */
	void exitEndMultiLineComment(@NotNull PlantumlParser.EndMultiLineCommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlantumlParser#endUmlStatement}.
	 * @param ctx the parse tree
	 */
	void enterEndUmlStatement(@NotNull PlantumlParser.EndUmlStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlantumlParser#endUmlStatement}.
	 * @param ctx the parse tree
	 */
	void exitEndUmlStatement(@NotNull PlantumlParser.EndUmlStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlantumlParser#startMultiLineNoteStatement}.
	 * @param ctx the parse tree
	 */
	void enterStartMultiLineNoteStatement(@NotNull PlantumlParser.StartMultiLineNoteStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlantumlParser#startMultiLineNoteStatement}.
	 * @param ctx the parse tree
	 */
	void exitStartMultiLineNoteStatement(@NotNull PlantumlParser.StartMultiLineNoteStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlantumlParser#startBoxStatement}.
	 * @param ctx the parse tree
	 */
	void enterStartBoxStatement(@NotNull PlantumlParser.StartBoxStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlantumlParser#startBoxStatement}.
	 * @param ctx the parse tree
	 */
	void exitStartBoxStatement(@NotNull PlantumlParser.StartBoxStatementContext ctx);
}