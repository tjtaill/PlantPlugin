// Generated from Plantuml.g4 by ANTLR 4.4
package plantparser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PlantumlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NEWLINE=1, SPACE=2, SINGLE_LINE_COMMENT=3, START_MULITLINE_COMMENT=4, 
		END_MULTILINE_COMMENT=5, START_UML=6, NOT_WHITE_SPACE=7, PARTICIPANT_ID=8, 
		PARTS=9, SPRITE=10, QUOTED_STRING=11, PARTICIPANT=12, PARTICIPANT_AS=13, 
		START_BOX=14, GROUPS=15, START_GROUP=16, MESSAGE_STRING=17, MESSAGE=18, 
		END=19, NOTE_POSITION=20, NOTE_STRING=21, SINGLE_NOTE=22, MULTI_NOTE=23, 
		END_NOTE=24, END_UML=25, OTHER_LINE=26;
	public static final String[] tokenNames = {
		"<INVALID>", "NEWLINE", "SPACE", "SINGLE_LINE_COMMENT", "START_MULITLINE_COMMENT", 
		"END_MULTILINE_COMMENT", "START_UML", "NOT_WHITE_SPACE", "PARTICIPANT_ID", 
		"PARTS", "SPRITE", "QUOTED_STRING", "PARTICIPANT", "PARTICIPANT_AS", "START_BOX", 
		"GROUPS", "START_GROUP", "MESSAGE_STRING", "MESSAGE", "END", "NOTE_POSITION", 
		"NOTE_STRING", "SINGLE_NOTE", "MULTI_NOTE", "END_NOTE", "END_UML", "OTHER_LINE"
	};
	public static final int
		RULE_file = 0, RULE_statement = 1, RULE_singleLineComment = 2, RULE_startMultilineComment = 3, 
		RULE_endMultiLineComment = 4, RULE_comment = 5, RULE_startUml = 6, RULE_sprite = 7, 
		RULE_participant = 8, RULE_startBox = 9, RULE_startGroup = 10, RULE_message = 11, 
		RULE_end = 12, RULE_singleLineNote = 13, RULE_multiLineNote = 14, RULE_note = 15, 
		RULE_endNote = 16, RULE_endUml = 17, RULE_otherLine = 18;
	public static final String[] ruleNames = {
		"file", "statement", "singleLineComment", "startMultilineComment", "endMultiLineComment", 
		"comment", "startUml", "sprite", "participant", "startBox", "startGroup", 
		"message", "end", "singleLineNote", "multiLineNote", "note", "endNote", 
		"endUml", "otherLine"
	};

	@Override
	public String getGrammarFileName() { return "Plantuml.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PlantumlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class FileContext extends ParserRuleContext {
		public List<CommentContext> comment() {
			return getRuleContexts(CommentContext.class);
		}
		public CommentContext comment(int i) {
			return getRuleContext(CommentContext.class,i);
		}
		public List<OtherLineContext> otherLine() {
			return getRuleContexts(OtherLineContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public OtherLineContext otherLine(int i) {
			return getRuleContext(OtherLineContext.class,i);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlantumlListener ) ((PlantumlListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlantumlListener ) ((PlantumlListener)listener).exitFile(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(41);
				switch (_input.LA(1)) {
				case SINGLE_LINE_COMMENT:
				case START_MULITLINE_COMMENT:
				case END_MULTILINE_COMMENT:
					{
					setState(38); comment();
					}
					break;
				case START_UML:
				case SPRITE:
				case PARTICIPANT:
				case PARTICIPANT_AS:
				case START_BOX:
				case START_GROUP:
				case MESSAGE:
				case END:
				case SINGLE_NOTE:
				case MULTI_NOTE:
				case END_NOTE:
				case END_UML:
					{
					setState(39); statement();
					}
					break;
				case NEWLINE:
				case OTHER_LINE:
					{
					setState(40); otherLine();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(43); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEWLINE) | (1L << SINGLE_LINE_COMMENT) | (1L << START_MULITLINE_COMMENT) | (1L << END_MULTILINE_COMMENT) | (1L << START_UML) | (1L << SPRITE) | (1L << PARTICIPANT) | (1L << PARTICIPANT_AS) | (1L << START_BOX) | (1L << START_GROUP) | (1L << MESSAGE) | (1L << END) | (1L << SINGLE_NOTE) | (1L << MULTI_NOTE) | (1L << END_NOTE) | (1L << END_UML) | (1L << OTHER_LINE))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public SpriteContext sprite() {
			return getRuleContext(SpriteContext.class,0);
		}
		public StartUmlContext startUml() {
			return getRuleContext(StartUmlContext.class,0);
		}
		public StartBoxContext startBox() {
			return getRuleContext(StartBoxContext.class,0);
		}
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public NoteContext note() {
			return getRuleContext(NoteContext.class,0);
		}
		public EndNoteContext endNote() {
			return getRuleContext(EndNoteContext.class,0);
		}
		public MessageContext message() {
			return getRuleContext(MessageContext.class,0);
		}
		public EndUmlContext endUml() {
			return getRuleContext(EndUmlContext.class,0);
		}
		public StartGroupContext startGroup() {
			return getRuleContext(StartGroupContext.class,0);
		}
		public ParticipantContext participant() {
			return getRuleContext(ParticipantContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlantumlListener ) ((PlantumlListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlantumlListener ) ((PlantumlListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(55);
			switch (_input.LA(1)) {
			case START_UML:
				enterOuterAlt(_localctx, 1);
				{
				setState(45); startUml();
				}
				break;
			case SPRITE:
				enterOuterAlt(_localctx, 2);
				{
				setState(46); sprite();
				}
				break;
			case START_BOX:
				enterOuterAlt(_localctx, 3);
				{
				setState(47); startBox();
				}
				break;
			case PARTICIPANT:
			case PARTICIPANT_AS:
				enterOuterAlt(_localctx, 4);
				{
				setState(48); participant();
				}
				break;
			case START_GROUP:
				enterOuterAlt(_localctx, 5);
				{
				setState(49); startGroup();
				}
				break;
			case END:
				enterOuterAlt(_localctx, 6);
				{
				setState(50); end();
				}
				break;
			case MESSAGE:
				enterOuterAlt(_localctx, 7);
				{
				setState(51); message();
				}
				break;
			case SINGLE_NOTE:
			case MULTI_NOTE:
				enterOuterAlt(_localctx, 8);
				{
				setState(52); note();
				}
				break;
			case END_NOTE:
				enterOuterAlt(_localctx, 9);
				{
				setState(53); endNote();
				}
				break;
			case END_UML:
				enterOuterAlt(_localctx, 10);
				{
				setState(54); endUml();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleLineCommentContext extends ParserRuleContext {
		public TerminalNode SINGLE_LINE_COMMENT() { return getToken(PlantumlParser.SINGLE_LINE_COMMENT, 0); }
		public SingleLineCommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleLineComment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlantumlListener ) ((PlantumlListener)listener).enterSingleLineComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlantumlListener ) ((PlantumlListener)listener).exitSingleLineComment(this);
		}
	}

	public final SingleLineCommentContext singleLineComment() throws RecognitionException {
		SingleLineCommentContext _localctx = new SingleLineCommentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_singleLineComment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57); match(SINGLE_LINE_COMMENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StartMultilineCommentContext extends ParserRuleContext {
		public TerminalNode START_MULITLINE_COMMENT() { return getToken(PlantumlParser.START_MULITLINE_COMMENT, 0); }
		public StartMultilineCommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startMultilineComment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlantumlListener ) ((PlantumlListener)listener).enterStartMultilineComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlantumlListener ) ((PlantumlListener)listener).exitStartMultilineComment(this);
		}
	}

	public final StartMultilineCommentContext startMultilineComment() throws RecognitionException {
		StartMultilineCommentContext _localctx = new StartMultilineCommentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_startMultilineComment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59); match(START_MULITLINE_COMMENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EndMultiLineCommentContext extends ParserRuleContext {
		public TerminalNode END_MULTILINE_COMMENT() { return getToken(PlantumlParser.END_MULTILINE_COMMENT, 0); }
		public EndMultiLineCommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endMultiLineComment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlantumlListener ) ((PlantumlListener)listener).enterEndMultiLineComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlantumlListener ) ((PlantumlListener)listener).exitEndMultiLineComment(this);
		}
	}

	public final EndMultiLineCommentContext endMultiLineComment() throws RecognitionException {
		EndMultiLineCommentContext _localctx = new EndMultiLineCommentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_endMultiLineComment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61); match(END_MULTILINE_COMMENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommentContext extends ParserRuleContext {
		public SingleLineCommentContext singleLineComment() {
			return getRuleContext(SingleLineCommentContext.class,0);
		}
		public StartMultilineCommentContext startMultilineComment() {
			return getRuleContext(StartMultilineCommentContext.class,0);
		}
		public EndMultiLineCommentContext endMultiLineComment() {
			return getRuleContext(EndMultiLineCommentContext.class,0);
		}
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlantumlListener ) ((PlantumlListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlantumlListener ) ((PlantumlListener)listener).exitComment(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_comment);
		try {
			setState(66);
			switch (_input.LA(1)) {
			case SINGLE_LINE_COMMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(63); singleLineComment();
				}
				break;
			case START_MULITLINE_COMMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(64); startMultilineComment();
				}
				break;
			case END_MULTILINE_COMMENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(65); endMultiLineComment();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StartUmlContext extends ParserRuleContext {
		public TerminalNode START_UML() { return getToken(PlantumlParser.START_UML, 0); }
		public StartUmlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startUml; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlantumlListener ) ((PlantumlListener)listener).enterStartUml(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlantumlListener ) ((PlantumlListener)listener).exitStartUml(this);
		}
	}

	public final StartUmlContext startUml() throws RecognitionException {
		StartUmlContext _localctx = new StartUmlContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_startUml);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68); match(START_UML);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SpriteContext extends ParserRuleContext {
		public TerminalNode SPRITE() { return getToken(PlantumlParser.SPRITE, 0); }
		public SpriteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sprite; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlantumlListener ) ((PlantumlListener)listener).enterSprite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlantumlListener ) ((PlantumlListener)listener).exitSprite(this);
		}
	}

	public final SpriteContext sprite() throws RecognitionException {
		SpriteContext _localctx = new SpriteContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_sprite);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70); match(SPRITE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParticipantContext extends ParserRuleContext {
		public TerminalNode PARTICIPANT() { return getToken(PlantumlParser.PARTICIPANT, 0); }
		public TerminalNode PARTICIPANT_AS() { return getToken(PlantumlParser.PARTICIPANT_AS, 0); }
		public ParticipantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_participant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlantumlListener ) ((PlantumlListener)listener).enterParticipant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlantumlListener ) ((PlantumlListener)listener).exitParticipant(this);
		}
	}

	public final ParticipantContext participant() throws RecognitionException {
		ParticipantContext _localctx = new ParticipantContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_participant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			_la = _input.LA(1);
			if ( !(_la==PARTICIPANT || _la==PARTICIPANT_AS) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StartBoxContext extends ParserRuleContext {
		public TerminalNode START_BOX() { return getToken(PlantumlParser.START_BOX, 0); }
		public StartBoxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startBox; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlantumlListener ) ((PlantumlListener)listener).enterStartBox(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlantumlListener ) ((PlantumlListener)listener).exitStartBox(this);
		}
	}

	public final StartBoxContext startBox() throws RecognitionException {
		StartBoxContext _localctx = new StartBoxContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_startBox);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74); match(START_BOX);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StartGroupContext extends ParserRuleContext {
		public TerminalNode START_GROUP() { return getToken(PlantumlParser.START_GROUP, 0); }
		public StartGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlantumlListener ) ((PlantumlListener)listener).enterStartGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlantumlListener ) ((PlantumlListener)listener).exitStartGroup(this);
		}
	}

	public final StartGroupContext startGroup() throws RecognitionException {
		StartGroupContext _localctx = new StartGroupContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_startGroup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76); match(START_GROUP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MessageContext extends ParserRuleContext {
		public TerminalNode MESSAGE() { return getToken(PlantumlParser.MESSAGE, 0); }
		public MessageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_message; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlantumlListener ) ((PlantumlListener)listener).enterMessage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlantumlListener ) ((PlantumlListener)listener).exitMessage(this);
		}
	}

	public final MessageContext message() throws RecognitionException {
		MessageContext _localctx = new MessageContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_message);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78); match(MESSAGE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EndContext extends ParserRuleContext {
		public TerminalNode END() { return getToken(PlantumlParser.END, 0); }
		public EndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlantumlListener ) ((PlantumlListener)listener).enterEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlantumlListener ) ((PlantumlListener)listener).exitEnd(this);
		}
	}

	public final EndContext end() throws RecognitionException {
		EndContext _localctx = new EndContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80); match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleLineNoteContext extends ParserRuleContext {
		public TerminalNode SINGLE_NOTE() { return getToken(PlantumlParser.SINGLE_NOTE, 0); }
		public SingleLineNoteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleLineNote; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlantumlListener ) ((PlantumlListener)listener).enterSingleLineNote(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlantumlListener ) ((PlantumlListener)listener).exitSingleLineNote(this);
		}
	}

	public final SingleLineNoteContext singleLineNote() throws RecognitionException {
		SingleLineNoteContext _localctx = new SingleLineNoteContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_singleLineNote);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82); match(SINGLE_NOTE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiLineNoteContext extends ParserRuleContext {
		public TerminalNode MULTI_NOTE() { return getToken(PlantumlParser.MULTI_NOTE, 0); }
		public MultiLineNoteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiLineNote; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlantumlListener ) ((PlantumlListener)listener).enterMultiLineNote(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlantumlListener ) ((PlantumlListener)listener).exitMultiLineNote(this);
		}
	}

	public final MultiLineNoteContext multiLineNote() throws RecognitionException {
		MultiLineNoteContext _localctx = new MultiLineNoteContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_multiLineNote);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84); match(MULTI_NOTE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NoteContext extends ParserRuleContext {
		public SingleLineNoteContext singleLineNote() {
			return getRuleContext(SingleLineNoteContext.class,0);
		}
		public MultiLineNoteContext multiLineNote() {
			return getRuleContext(MultiLineNoteContext.class,0);
		}
		public NoteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_note; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlantumlListener ) ((PlantumlListener)listener).enterNote(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlantumlListener ) ((PlantumlListener)listener).exitNote(this);
		}
	}

	public final NoteContext note() throws RecognitionException {
		NoteContext _localctx = new NoteContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_note);
		try {
			setState(88);
			switch (_input.LA(1)) {
			case SINGLE_NOTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(86); singleLineNote();
				}
				break;
			case MULTI_NOTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(87); multiLineNote();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EndNoteContext extends ParserRuleContext {
		public TerminalNode END_NOTE() { return getToken(PlantumlParser.END_NOTE, 0); }
		public EndNoteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endNote; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlantumlListener ) ((PlantumlListener)listener).enterEndNote(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlantumlListener ) ((PlantumlListener)listener).exitEndNote(this);
		}
	}

	public final EndNoteContext endNote() throws RecognitionException {
		EndNoteContext _localctx = new EndNoteContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_endNote);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90); match(END_NOTE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EndUmlContext extends ParserRuleContext {
		public TerminalNode END_UML() { return getToken(PlantumlParser.END_UML, 0); }
		public EndUmlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endUml; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlantumlListener ) ((PlantumlListener)listener).enterEndUml(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlantumlListener ) ((PlantumlListener)listener).exitEndUml(this);
		}
	}

	public final EndUmlContext endUml() throws RecognitionException {
		EndUmlContext _localctx = new EndUmlContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_endUml);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92); match(END_UML);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OtherLineContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(PlantumlParser.NEWLINE, 0); }
		public TerminalNode OTHER_LINE() { return getToken(PlantumlParser.OTHER_LINE, 0); }
		public OtherLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otherLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlantumlListener ) ((PlantumlListener)listener).enterOtherLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlantumlListener ) ((PlantumlListener)listener).exitOtherLine(this);
		}
	}

	public final OtherLineContext otherLine() throws RecognitionException {
		OtherLineContext _localctx = new OtherLineContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_otherLine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			_la = _input.LA(1);
			if ( !(_la==NEWLINE || _la==OTHER_LINE) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\34c\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22\4\23"+
		"\t\23\4\24\t\24\3\2\3\2\3\2\6\2,\n\2\r\2\16\2-\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\5\3:\n\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\5\7E\n\7"+
		"\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17"+
		"\3\20\3\20\3\21\3\21\5\21[\n\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\2\2"+
		"\25\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&\2\4\3\2\16\17\4\2\3\3"+
		"\34\34^\2+\3\2\2\2\49\3\2\2\2\6;\3\2\2\2\b=\3\2\2\2\n?\3\2\2\2\fD\3\2"+
		"\2\2\16F\3\2\2\2\20H\3\2\2\2\22J\3\2\2\2\24L\3\2\2\2\26N\3\2\2\2\30P\3"+
		"\2\2\2\32R\3\2\2\2\34T\3\2\2\2\36V\3\2\2\2 Z\3\2\2\2\"\\\3\2\2\2$^\3\2"+
		"\2\2&`\3\2\2\2(,\5\f\7\2),\5\4\3\2*,\5&\24\2+(\3\2\2\2+)\3\2\2\2+*\3\2"+
		"\2\2,-\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\3\3\2\2\2/:\5\16\b\2\60:\5\20\t\2"+
		"\61:\5\24\13\2\62:\5\22\n\2\63:\5\26\f\2\64:\5\32\16\2\65:\5\30\r\2\66"+
		":\5 \21\2\67:\5\"\22\28:\5$\23\29/\3\2\2\29\60\3\2\2\29\61\3\2\2\29\62"+
		"\3\2\2\29\63\3\2\2\29\64\3\2\2\29\65\3\2\2\29\66\3\2\2\29\67\3\2\2\29"+
		"8\3\2\2\2:\5\3\2\2\2;<\7\5\2\2<\7\3\2\2\2=>\7\6\2\2>\t\3\2\2\2?@\7\7\2"+
		"\2@\13\3\2\2\2AE\5\6\4\2BE\5\b\5\2CE\5\n\6\2DA\3\2\2\2DB\3\2\2\2DC\3\2"+
		"\2\2E\r\3\2\2\2FG\7\b\2\2G\17\3\2\2\2HI\7\f\2\2I\21\3\2\2\2JK\t\2\2\2"+
		"K\23\3\2\2\2LM\7\20\2\2M\25\3\2\2\2NO\7\22\2\2O\27\3\2\2\2PQ\7\24\2\2"+
		"Q\31\3\2\2\2RS\7\25\2\2S\33\3\2\2\2TU\7\30\2\2U\35\3\2\2\2VW\7\31\2\2"+
		"W\37\3\2\2\2X[\5\34\17\2Y[\5\36\20\2ZX\3\2\2\2ZY\3\2\2\2[!\3\2\2\2\\]"+
		"\7\32\2\2]#\3\2\2\2^_\7\33\2\2_%\3\2\2\2`a\t\3\2\2a\'\3\2\2\2\7+-9DZ";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}