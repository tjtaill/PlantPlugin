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
		T__13=1, T__12=2, T__11=3, T__10=4, T__9=5, T__8=6, T__7=7, T__6=8, T__5=9, 
		T__4=10, T__3=11, T__2=12, T__1=13, T__0=14, NEWLINE=15, ALPHA_NUM=16, 
		COLOR_SPEC=17, QUOTED_STRING=18, PARTICIPANT=19, GROUP=20, LABEL=21, TILL_NEWLINE=22, 
		NOTE_POSITION=23, SINGLE_LINE_COMMENT=24, START_MULITLINE_COMMENT=25, 
		END_MULTILINE_COMMENT=26, WS=27;
	public static final String[] tokenNames = {
		"<INVALID>", "'as'", "'of'", "':'", "'['", "']'", "'>'", "'box'", "'@enduml'", 
		"'\"'", "'end'", "'@startuml'", "','", "'note'", "'-'", "NEWLINE", "ALPHA_NUM", 
		"COLOR_SPEC", "QUOTED_STRING", "PARTICIPANT", "GROUP", "LABEL", "TILL_NEWLINE", 
		"NOTE_POSITION", "SINGLE_LINE_COMMENT", "START_MULITLINE_COMMENT", "END_MULTILINE_COMMENT", 
		"WS"
	};
	public static final int
		RULE_file = 0, RULE_statements = 1, RULE_startUmlStatement = 2, RULE_participantId = 3, 
		RULE_startBoxStatement = 4, RULE_simpleParticipantStatement = 5, RULE_particpantAsStatement = 6, 
		RULE_participantStatement = 7, RULE_beginGroupStatement = 8, RULE_endStatement = 9, 
		RULE_messageString = 10, RULE_messageStatement = 11, RULE_endUmlStatement = 12, 
		RULE_startSingleLineNoteStatement = 13, RULE_startMultiLineNoteStatement = 14, 
		RULE_endNoteStatement = 15, RULE_singleLineComment = 16, RULE_startMultilineComment = 17, 
		RULE_endMultiLineComment = 18, RULE_comments = 19, RULE_otherLine = 20;
	public static final String[] ruleNames = {
		"file", "statements", "startUmlStatement", "participantId", "startBoxStatement", 
		"simpleParticipantStatement", "particpantAsStatement", "participantStatement", 
		"beginGroupStatement", "endStatement", "messageString", "messageStatement", 
		"endUmlStatement", "startSingleLineNoteStatement", "startMultiLineNoteStatement", 
		"endNoteStatement", "singleLineComment", "startMultilineComment", "endMultiLineComment", 
		"comments", "otherLine"
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
		public List<CommentsContext> comments() {
			return getRuleContexts(CommentsContext.class);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public List<OtherLineContext> otherLine() {
			return getRuleContexts(OtherLineContext.class);
		}
		public OtherLineContext otherLine(int i) {
			return getRuleContext(OtherLineContext.class,i);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public CommentsContext comments(int i) {
			return getRuleContext(CommentsContext.class,i);
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
			setState(59);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(43); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(42); statements();
					}
					}
					setState(45); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__6) | (1L << T__5) | (1L << T__4) | (1L << T__3) | (1L << T__1) | (1L << NEWLINE) | (1L << ALPHA_NUM) | (1L << PARTICIPANT) | (1L << GROUP))) != 0) );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SINGLE_LINE_COMMENT) | (1L << START_MULITLINE_COMMENT) | (1L << END_MULTILINE_COMMENT))) != 0)) {
					{
					{
					setState(47); comments();
					}
					}
					setState(52);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TILL_NEWLINE) {
					{
					{
					setState(53); otherLine();
					}
					}
					setState(58);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
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

	public static class StatementsContext extends ParserRuleContext {
		public StartMultiLineNoteStatementContext startMultiLineNoteStatement() {
			return getRuleContext(StartMultiLineNoteStatementContext.class,0);
		}
		public StartBoxStatementContext startBoxStatement() {
			return getRuleContext(StartBoxStatementContext.class,0);
		}
		public StartUmlStatementContext startUmlStatement() {
			return getRuleContext(StartUmlStatementContext.class,0);
		}
		public EndStatementContext endStatement() {
			return getRuleContext(EndStatementContext.class,0);
		}
		public ParticipantStatementContext participantStatement() {
			return getRuleContext(ParticipantStatementContext.class,0);
		}
		public EndNoteStatementContext endNoteStatement() {
			return getRuleContext(EndNoteStatementContext.class,0);
		}
		public MessageStatementContext messageStatement() {
			return getRuleContext(MessageStatementContext.class,0);
		}
		public StartSingleLineNoteStatementContext startSingleLineNoteStatement() {
			return getRuleContext(StartSingleLineNoteStatementContext.class,0);
		}
		public EndUmlStatementContext endUmlStatement() {
			return getRuleContext(EndUmlStatementContext.class,0);
		}
		public BeginGroupStatementContext beginGroupStatement() {
			return getRuleContext(BeginGroupStatementContext.class,0);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlantumlListener ) ((PlantumlListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlantumlListener ) ((PlantumlListener)listener).exitStatements(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statements);
		try {
			setState(71);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(61); startUmlStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(62); startBoxStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(63); participantStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(64); beginGroupStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(65); endStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(66); messageStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(67); startSingleLineNoteStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(68); startMultiLineNoteStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(69); endNoteStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(70); endUmlStatement();
				}
				break;
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

	public static class StartUmlStatementContext extends ParserRuleContext {
		public StartUmlStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startUmlStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlantumlListener ) ((PlantumlListener)listener).enterStartUmlStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlantumlListener ) ((PlantumlListener)listener).exitStartUmlStatement(this);
		}
	}

	public final StartUmlStatementContext startUmlStatement() throws RecognitionException {
		StartUmlStatementContext _localctx = new StartUmlStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_startUmlStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73); match(T__3);
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

	public static class ParticipantIdContext extends ParserRuleContext {
		public List<TerminalNode> ALPHA_NUM() { return getTokens(PlantumlParser.ALPHA_NUM); }
		public TerminalNode ALPHA_NUM(int i) {
			return getToken(PlantumlParser.ALPHA_NUM, i);
		}
		public ParticipantIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_participantId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlantumlListener ) ((PlantumlListener)listener).enterParticipantId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlantumlListener ) ((PlantumlListener)listener).exitParticipantId(this);
		}
	}

	public final ParticipantIdContext participantId() throws RecognitionException {
		ParticipantIdContext _localctx = new ParticipantIdContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_participantId);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(75); match(T__5);
				}
			}

			setState(79); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(78); match(ALPHA_NUM);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(81); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(84);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(83); match(T__5);
				}
				break;
			}
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

	public static class StartBoxStatementContext extends ParserRuleContext {
		public TerminalNode QUOTED_STRING() { return getToken(PlantumlParser.QUOTED_STRING, 0); }
		public TerminalNode COLOR_SPEC() { return getToken(PlantumlParser.COLOR_SPEC, 0); }
		public StartBoxStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startBoxStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlantumlListener ) ((PlantumlListener)listener).enterStartBoxStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlantumlListener ) ((PlantumlListener)listener).exitStartBoxStatement(this);
		}
	}

	public final StartBoxStatementContext startBoxStatement() throws RecognitionException {
		StartBoxStatementContext _localctx = new StartBoxStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_startBoxStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86); match(T__7);
			setState(87); match(QUOTED_STRING);
			setState(89);
			_la = _input.LA(1);
			if (_la==COLOR_SPEC) {
				{
				setState(88); match(COLOR_SPEC);
				}
			}

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

	public static class SimpleParticipantStatementContext extends ParserRuleContext {
		public TerminalNode PARTICIPANT() { return getToken(PlantumlParser.PARTICIPANT, 0); }
		public ParticipantIdContext participantId() {
			return getRuleContext(ParticipantIdContext.class,0);
		}
		public SimpleParticipantStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleParticipantStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlantumlListener ) ((PlantumlListener)listener).enterSimpleParticipantStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlantumlListener ) ((PlantumlListener)listener).exitSimpleParticipantStatement(this);
		}
	}

	public final SimpleParticipantStatementContext simpleParticipantStatement() throws RecognitionException {
		SimpleParticipantStatementContext _localctx = new SimpleParticipantStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_simpleParticipantStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91); match(PARTICIPANT);
			setState(92); participantId();
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

	public static class ParticpantAsStatementContext extends ParserRuleContext {
		public TerminalNode PARTICIPANT() { return getToken(PlantumlParser.PARTICIPANT, 0); }
		public TerminalNode QUOTED_STRING() { return getToken(PlantumlParser.QUOTED_STRING, 0); }
		public ParticipantIdContext participantId() {
			return getRuleContext(ParticipantIdContext.class,0);
		}
		public ParticpantAsStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_particpantAsStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlantumlListener ) ((PlantumlListener)listener).enterParticpantAsStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlantumlListener ) ((PlantumlListener)listener).exitParticpantAsStatement(this);
		}
	}

	public final ParticpantAsStatementContext particpantAsStatement() throws RecognitionException {
		ParticpantAsStatementContext _localctx = new ParticpantAsStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_particpantAsStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94); match(PARTICIPANT);
			setState(95); match(QUOTED_STRING);
			setState(96); match(T__13);
			setState(97); participantId();
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

	public static class ParticipantStatementContext extends ParserRuleContext {
		public ParticpantAsStatementContext particpantAsStatement() {
			return getRuleContext(ParticpantAsStatementContext.class,0);
		}
		public SimpleParticipantStatementContext simpleParticipantStatement() {
			return getRuleContext(SimpleParticipantStatementContext.class,0);
		}
		public ParticipantStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_participantStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlantumlListener ) ((PlantumlListener)listener).enterParticipantStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlantumlListener ) ((PlantumlListener)listener).exitParticipantStatement(this);
		}
	}

	public final ParticipantStatementContext participantStatement() throws RecognitionException {
		ParticipantStatementContext _localctx = new ParticipantStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_participantStatement);
		try {
			setState(101);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(99); simpleParticipantStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(100); particpantAsStatement();
				}
				break;
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

	public static class BeginGroupStatementContext extends ParserRuleContext {
		public TerminalNode LABEL() { return getToken(PlantumlParser.LABEL, 0); }
		public TerminalNode GROUP() { return getToken(PlantumlParser.GROUP, 0); }
		public BeginGroupStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_beginGroupStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlantumlListener ) ((PlantumlListener)listener).enterBeginGroupStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlantumlListener ) ((PlantumlListener)listener).exitBeginGroupStatement(this);
		}
	}

	public final BeginGroupStatementContext beginGroupStatement() throws RecognitionException {
		BeginGroupStatementContext _localctx = new BeginGroupStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_beginGroupStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103); match(GROUP);
			setState(104); match(LABEL);
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

	public static class EndStatementContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(PlantumlParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(PlantumlParser.NEWLINE, i);
		}
		public EndStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlantumlListener ) ((PlantumlListener)listener).enterEndStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlantumlListener ) ((PlantumlListener)listener).exitEndStatement(this);
		}
	}

	public final EndStatementContext endStatement() throws RecognitionException {
		EndStatementContext _localctx = new EndStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_endStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106); match(NEWLINE);
			setState(107); match(T__4);
			setState(108); match(NEWLINE);
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

	public static class MessageStringContext extends ParserRuleContext {
		public TerminalNode QUOTED_STRING() { return getToken(PlantumlParser.QUOTED_STRING, 0); }
		public TerminalNode TILL_NEWLINE() { return getToken(PlantumlParser.TILL_NEWLINE, 0); }
		public MessageStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_messageString; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlantumlListener ) ((PlantumlListener)listener).enterMessageString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlantumlListener ) ((PlantumlListener)listener).exitMessageString(this);
		}
	}

	public final MessageStringContext messageString() throws RecognitionException {
		MessageStringContext _localctx = new MessageStringContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_messageString);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			_la = _input.LA(1);
			if ( !(_la==QUOTED_STRING || _la==TILL_NEWLINE) ) {
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

	public static class MessageStatementContext extends ParserRuleContext {
		public MessageStringContext messageString() {
			return getRuleContext(MessageStringContext.class,0);
		}
		public List<ParticipantIdContext> participantId() {
			return getRuleContexts(ParticipantIdContext.class);
		}
		public TerminalNode COLOR_SPEC() { return getToken(PlantumlParser.COLOR_SPEC, 0); }
		public ParticipantIdContext participantId(int i) {
			return getRuleContext(ParticipantIdContext.class,i);
		}
		public MessageStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_messageStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlantumlListener ) ((PlantumlListener)listener).enterMessageStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlantumlListener ) ((PlantumlListener)listener).exitMessageStatement(this);
		}
	}

	public final MessageStatementContext messageStatement() throws RecognitionException {
		MessageStatementContext _localctx = new MessageStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_messageStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112); participantId();
			setState(113); match(T__0);
			setState(115);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(114); match(T__10);
				}
			}

			setState(118);
			_la = _input.LA(1);
			if (_la==COLOR_SPEC) {
				{
				setState(117); match(COLOR_SPEC);
				}
			}

			setState(121);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(120); match(T__9);
				}
			}

			setState(123); match(T__8);
			setState(124); participantId();
			setState(125); match(T__11);
			setState(126); messageString();
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

	public static class EndUmlStatementContext extends ParserRuleContext {
		public EndUmlStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endUmlStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlantumlListener ) ((PlantumlListener)listener).enterEndUmlStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlantumlListener ) ((PlantumlListener)listener).exitEndUmlStatement(this);
		}
	}

	public final EndUmlStatementContext endUmlStatement() throws RecognitionException {
		EndUmlStatementContext _localctx = new EndUmlStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_endUmlStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128); match(T__6);
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

	public static class StartSingleLineNoteStatementContext extends ParserRuleContext {
		public TerminalNode LABEL() { return getToken(PlantumlParser.LABEL, 0); }
		public List<TerminalNode> PARTICIPANT() { return getTokens(PlantumlParser.PARTICIPANT); }
		public TerminalNode PARTICIPANT(int i) {
			return getToken(PlantumlParser.PARTICIPANT, i);
		}
		public TerminalNode NOTE_POSITION() { return getToken(PlantumlParser.NOTE_POSITION, 0); }
		public StartSingleLineNoteStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startSingleLineNoteStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlantumlListener ) ((PlantumlListener)listener).enterStartSingleLineNoteStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlantumlListener ) ((PlantumlListener)listener).exitStartSingleLineNoteStatement(this);
		}
	}

	public final StartSingleLineNoteStatementContext startSingleLineNoteStatement() throws RecognitionException {
		StartSingleLineNoteStatementContext _localctx = new StartSingleLineNoteStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_startSingleLineNoteStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130); match(T__1);
			setState(131); match(NOTE_POSITION);
			setState(133);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(132); match(T__12);
				}
			}

			setState(136);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(135); match(PARTICIPANT);
				}
				break;
			}
			setState(139);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(138); match(T__2);
				}
			}

			setState(142);
			_la = _input.LA(1);
			if (_la==PARTICIPANT) {
				{
				setState(141); match(PARTICIPANT);
				}
			}

			setState(144); match(T__11);
			setState(145); match(LABEL);
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

	public static class StartMultiLineNoteStatementContext extends ParserRuleContext {
		public List<TerminalNode> PARTICIPANT() { return getTokens(PlantumlParser.PARTICIPANT); }
		public TerminalNode PARTICIPANT(int i) {
			return getToken(PlantumlParser.PARTICIPANT, i);
		}
		public TerminalNode NOTE_POSITION() { return getToken(PlantumlParser.NOTE_POSITION, 0); }
		public StartMultiLineNoteStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startMultiLineNoteStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlantumlListener ) ((PlantumlListener)listener).enterStartMultiLineNoteStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlantumlListener ) ((PlantumlListener)listener).exitStartMultiLineNoteStatement(this);
		}
	}

	public final StartMultiLineNoteStatementContext startMultiLineNoteStatement() throws RecognitionException {
		StartMultiLineNoteStatementContext _localctx = new StartMultiLineNoteStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_startMultiLineNoteStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147); match(T__1);
			setState(148); match(NOTE_POSITION);
			setState(150);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(149); match(T__12);
				}
			}

			setState(153);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(152); match(PARTICIPANT);
				}
				break;
			}
			setState(156);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(155); match(T__2);
				}
			}

			setState(159);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(158); match(PARTICIPANT);
				}
				break;
			}
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

	public static class EndNoteStatementContext extends ParserRuleContext {
		public EndNoteStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endNoteStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlantumlListener ) ((PlantumlListener)listener).enterEndNoteStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlantumlListener ) ((PlantumlListener)listener).exitEndNoteStatement(this);
		}
	}

	public final EndNoteStatementContext endNoteStatement() throws RecognitionException {
		EndNoteStatementContext _localctx = new EndNoteStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_endNoteStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161); match(T__4);
			setState(162); match(T__1);
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
		enterRule(_localctx, 32, RULE_singleLineComment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164); match(SINGLE_LINE_COMMENT);
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
		enterRule(_localctx, 34, RULE_startMultilineComment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166); match(START_MULITLINE_COMMENT);
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
		enterRule(_localctx, 36, RULE_endMultiLineComment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168); match(END_MULTILINE_COMMENT);
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

	public static class CommentsContext extends ParserRuleContext {
		public SingleLineCommentContext singleLineComment() {
			return getRuleContext(SingleLineCommentContext.class,0);
		}
		public StartMultilineCommentContext startMultilineComment() {
			return getRuleContext(StartMultilineCommentContext.class,0);
		}
		public EndMultiLineCommentContext endMultiLineComment() {
			return getRuleContext(EndMultiLineCommentContext.class,0);
		}
		public CommentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlantumlListener ) ((PlantumlListener)listener).enterComments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlantumlListener ) ((PlantumlListener)listener).exitComments(this);
		}
	}

	public final CommentsContext comments() throws RecognitionException {
		CommentsContext _localctx = new CommentsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_comments);
		try {
			setState(173);
			switch (_input.LA(1)) {
			case SINGLE_LINE_COMMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(170); singleLineComment();
				}
				break;
			case START_MULITLINE_COMMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(171); startMultilineComment();
				}
				break;
			case END_MULTILINE_COMMENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(172); endMultiLineComment();
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

	public static class OtherLineContext extends ParserRuleContext {
		public TerminalNode TILL_NEWLINE() { return getToken(PlantumlParser.TILL_NEWLINE, 0); }
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
		enterRule(_localctx, 40, RULE_otherLine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175); match(TILL_NEWLINE);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\35\u00b4\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\6\2.\n\2\r\2\16\2/\3\2\7"+
		"\2\63\n\2\f\2\16\2\66\13\2\3\2\7\29\n\2\f\2\16\2<\13\2\5\2>\n\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3J\n\3\3\4\3\4\3\5\5\5O\n\5\3\5\6"+
		"\5R\n\5\r\5\16\5S\3\5\5\5W\n\5\3\6\3\6\3\6\5\6\\\n\6\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\t\3\t\5\th\n\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\r\3\r\3\r\5\rv\n\r\3\r\5\ry\n\r\3\r\5\r|\n\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\16\3\16\3\17\3\17\3\17\5\17\u0088\n\17\3\17\5\17\u008b\n\17\3\17\5"+
		"\17\u008e\n\17\3\17\5\17\u0091\n\17\3\17\3\17\3\17\3\20\3\20\3\20\5\20"+
		"\u0099\n\20\3\20\5\20\u009c\n\20\3\20\5\20\u009f\n\20\3\20\5\20\u00a2"+
		"\n\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\5\25"+
		"\u00b0\n\25\3\26\3\26\3\26\2\2\27\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*\2\3\4\2\24\24\30\30\u00be\2=\3\2\2\2\4I\3\2\2\2\6K\3\2\2\2"+
		"\bN\3\2\2\2\nX\3\2\2\2\f]\3\2\2\2\16`\3\2\2\2\20g\3\2\2\2\22i\3\2\2\2"+
		"\24l\3\2\2\2\26p\3\2\2\2\30r\3\2\2\2\32\u0082\3\2\2\2\34\u0084\3\2\2\2"+
		"\36\u0095\3\2\2\2 \u00a3\3\2\2\2\"\u00a6\3\2\2\2$\u00a8\3\2\2\2&\u00aa"+
		"\3\2\2\2(\u00af\3\2\2\2*\u00b1\3\2\2\2,.\5\4\3\2-,\3\2\2\2./\3\2\2\2/"+
		"-\3\2\2\2/\60\3\2\2\2\60>\3\2\2\2\61\63\5(\25\2\62\61\3\2\2\2\63\66\3"+
		"\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65>\3\2\2\2\66\64\3\2\2\2\679\5*\26"+
		"\28\67\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;>\3\2\2\2<:\3\2\2\2=-\3\2"+
		"\2\2=\64\3\2\2\2=:\3\2\2\2>\3\3\2\2\2?J\5\6\4\2@J\5\n\6\2AJ\5\20\t\2B"+
		"J\5\22\n\2CJ\5\24\13\2DJ\5\30\r\2EJ\5\34\17\2FJ\5\36\20\2GJ\5 \21\2HJ"+
		"\5\32\16\2I?\3\2\2\2I@\3\2\2\2IA\3\2\2\2IB\3\2\2\2IC\3\2\2\2ID\3\2\2\2"+
		"IE\3\2\2\2IF\3\2\2\2IG\3\2\2\2IH\3\2\2\2J\5\3\2\2\2KL\7\r\2\2L\7\3\2\2"+
		"\2MO\7\13\2\2NM\3\2\2\2NO\3\2\2\2OQ\3\2\2\2PR\7\22\2\2QP\3\2\2\2RS\3\2"+
		"\2\2SQ\3\2\2\2ST\3\2\2\2TV\3\2\2\2UW\7\13\2\2VU\3\2\2\2VW\3\2\2\2W\t\3"+
		"\2\2\2XY\7\t\2\2Y[\7\24\2\2Z\\\7\23\2\2[Z\3\2\2\2[\\\3\2\2\2\\\13\3\2"+
		"\2\2]^\7\25\2\2^_\5\b\5\2_\r\3\2\2\2`a\7\25\2\2ab\7\24\2\2bc\7\3\2\2c"+
		"d\5\b\5\2d\17\3\2\2\2eh\5\f\7\2fh\5\16\b\2ge\3\2\2\2gf\3\2\2\2h\21\3\2"+
		"\2\2ij\7\26\2\2jk\7\27\2\2k\23\3\2\2\2lm\7\21\2\2mn\7\f\2\2no\7\21\2\2"+
		"o\25\3\2\2\2pq\t\2\2\2q\27\3\2\2\2rs\5\b\5\2su\7\20\2\2tv\7\6\2\2ut\3"+
		"\2\2\2uv\3\2\2\2vx\3\2\2\2wy\7\23\2\2xw\3\2\2\2xy\3\2\2\2y{\3\2\2\2z|"+
		"\7\7\2\2{z\3\2\2\2{|\3\2\2\2|}\3\2\2\2}~\7\b\2\2~\177\5\b\5\2\177\u0080"+
		"\7\5\2\2\u0080\u0081\5\26\f\2\u0081\31\3\2\2\2\u0082\u0083\7\n\2\2\u0083"+
		"\33\3\2\2\2\u0084\u0085\7\17\2\2\u0085\u0087\7\31\2\2\u0086\u0088\7\4"+
		"\2\2\u0087\u0086\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008a\3\2\2\2\u0089"+
		"\u008b\7\25\2\2\u008a\u0089\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008d\3"+
		"\2\2\2\u008c\u008e\7\16\2\2\u008d\u008c\3\2\2\2\u008d\u008e\3\2\2\2\u008e"+
		"\u0090\3\2\2\2\u008f\u0091\7\25\2\2\u0090\u008f\3\2\2\2\u0090\u0091\3"+
		"\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\7\5\2\2\u0093\u0094\7\27\2\2\u0094"+
		"\35\3\2\2\2\u0095\u0096\7\17\2\2\u0096\u0098\7\31\2\2\u0097\u0099\7\4"+
		"\2\2\u0098\u0097\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009b\3\2\2\2\u009a"+
		"\u009c\7\25\2\2\u009b\u009a\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009e\3"+
		"\2\2\2\u009d\u009f\7\16\2\2\u009e\u009d\3\2\2\2\u009e\u009f\3\2\2\2\u009f"+
		"\u00a1\3\2\2\2\u00a0\u00a2\7\25\2\2\u00a1\u00a0\3\2\2\2\u00a1\u00a2\3"+
		"\2\2\2\u00a2\37\3\2\2\2\u00a3\u00a4\7\f\2\2\u00a4\u00a5\7\17\2\2\u00a5"+
		"!\3\2\2\2\u00a6\u00a7\7\32\2\2\u00a7#\3\2\2\2\u00a8\u00a9\7\33\2\2\u00a9"+
		"%\3\2\2\2\u00aa\u00ab\7\34\2\2\u00ab\'\3\2\2\2\u00ac\u00b0\5\"\22\2\u00ad"+
		"\u00b0\5$\23\2\u00ae\u00b0\5&\24\2\u00af\u00ac\3\2\2\2\u00af\u00ad\3\2"+
		"\2\2\u00af\u00ae\3\2\2\2\u00b0)\3\2\2\2\u00b1\u00b2\7\30\2\2\u00b2+\3"+
		"\2\2\2\30/\64:=INSV[gux{\u0087\u008a\u008d\u0090\u0098\u009b\u009e\u00a1"+
		"\u00af";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}