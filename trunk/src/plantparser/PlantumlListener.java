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
	 * Enter a parse tree produced by {@link PlantumlParser#multiLineNote}.
	 * @param ctx the parse tree
	 */
	void enterMultiLineNote(@NotNull PlantumlParser.MultiLineNoteContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlantumlParser#multiLineNote}.
	 * @param ctx the parse tree
	 */
	void exitMultiLineNote(@NotNull PlantumlParser.MultiLineNoteContext ctx);
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
	 * Enter a parse tree produced by {@link PlantumlParser#note}.
	 * @param ctx the parse tree
	 */
	void enterNote(@NotNull PlantumlParser.NoteContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlantumlParser#note}.
	 * @param ctx the parse tree
	 */
	void exitNote(@NotNull PlantumlParser.NoteContext ctx);
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
	 * Enter a parse tree produced by {@link PlantumlParser#singleLineNote}.
	 * @param ctx the parse tree
	 */
	void enterSingleLineNote(@NotNull PlantumlParser.SingleLineNoteContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlantumlParser#singleLineNote}.
	 * @param ctx the parse tree
	 */
	void exitSingleLineNote(@NotNull PlantumlParser.SingleLineNoteContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlantumlParser#message}.
	 * @param ctx the parse tree
	 */
	void enterMessage(@NotNull PlantumlParser.MessageContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlantumlParser#message}.
	 * @param ctx the parse tree
	 */
	void exitMessage(@NotNull PlantumlParser.MessageContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlantumlParser#startUml}.
	 * @param ctx the parse tree
	 */
	void enterStartUml(@NotNull PlantumlParser.StartUmlContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlantumlParser#startUml}.
	 * @param ctx the parse tree
	 */
	void exitStartUml(@NotNull PlantumlParser.StartUmlContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlantumlParser#participant}.
	 * @param ctx the parse tree
	 */
	void enterParticipant(@NotNull PlantumlParser.ParticipantContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlantumlParser#participant}.
	 * @param ctx the parse tree
	 */
	void exitParticipant(@NotNull PlantumlParser.ParticipantContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlantumlParser#endUml}.
	 * @param ctx the parse tree
	 */
	void enterEndUml(@NotNull PlantumlParser.EndUmlContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlantumlParser#endUml}.
	 * @param ctx the parse tree
	 */
	void exitEndUml(@NotNull PlantumlParser.EndUmlContext ctx);
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
	 * Enter a parse tree produced by {@link PlantumlParser#startBox}.
	 * @param ctx the parse tree
	 */
	void enterStartBox(@NotNull PlantumlParser.StartBoxContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlantumlParser#startBox}.
	 * @param ctx the parse tree
	 */
	void exitStartBox(@NotNull PlantumlParser.StartBoxContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlantumlParser#startGroup}.
	 * @param ctx the parse tree
	 */
	void enterStartGroup(@NotNull PlantumlParser.StartGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlantumlParser#startGroup}.
	 * @param ctx the parse tree
	 */
	void exitStartGroup(@NotNull PlantumlParser.StartGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlantumlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull PlantumlParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlantumlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull PlantumlParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlantumlParser#sprite}.
	 * @param ctx the parse tree
	 */
	void enterSprite(@NotNull PlantumlParser.SpriteContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlantumlParser#sprite}.
	 * @param ctx the parse tree
	 */
	void exitSprite(@NotNull PlantumlParser.SpriteContext ctx);
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
	 * Enter a parse tree produced by {@link PlantumlParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(@NotNull PlantumlParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlantumlParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(@NotNull PlantumlParser.CommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlantumlParser#end}.
	 * @param ctx the parse tree
	 */
	void enterEnd(@NotNull PlantumlParser.EndContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlantumlParser#end}.
	 * @param ctx the parse tree
	 */
	void exitEnd(@NotNull PlantumlParser.EndContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlantumlParser#endNote}.
	 * @param ctx the parse tree
	 */
	void enterEndNote(@NotNull PlantumlParser.EndNoteContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlantumlParser#endNote}.
	 * @param ctx the parse tree
	 */
	void exitEndNote(@NotNull PlantumlParser.EndNoteContext ctx);
}