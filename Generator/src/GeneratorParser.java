// Generated from /home/vitalii/Generator.g4 by ANTLR 4.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GeneratorParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__8=1, T__7=2, T__6=3, T__5=4, T__4=5, T__3=6, T__2=7, T__1=8, T__0=9, 
		LEXID=10, NTERMID=11, WS=12, STRING=13, CODE=14, PARAMS=15;
	public static final String[] tokenNames = {
		"<INVALID>", "'@define'", "'->'", "'{'", "'@lexer'", "'@rules'", "':'", 
		"'skip'", "'}'", "';'", "LEXID", "NTERMID", "WS", "STRING", "CODE", "PARAMS"
	};
	public static final int
		RULE_prog = 0, RULE_prules = 1, RULE_prule = 2, RULE_prulepart = 3, RULE_lexems = 4, 
		RULE_lexem = 5, RULE_nterms = 6, RULE_nterm = 7, RULE_params = 8;
	public static final String[] ruleNames = {
		"prog", "prules", "prule", "prulepart", "lexems", "lexem", "nterms", "nterm", 
		"params"
	};

	@Override
	public String getGrammarFileName() { return "Generator.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public GeneratorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public LexemsContext lexems() {
			return getRuleContext(LexemsContext.class,0);
		}
		public PrulesContext prules() {
			return getRuleContext(PrulesContext.class,0);
		}
		public NtermsContext nterms() {
			return getRuleContext(NtermsContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeneratorListener ) ((GeneratorListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeneratorListener ) ((GeneratorListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18); match(4);
			setState(19); match(3);
			setState(20); lexems();
			setState(21); match(8);
			setState(22); match(1);
			setState(23); match(3);
			setState(24); nterms();
			setState(25); match(8);
			setState(26); match(5);
			setState(27); match(3);
			setState(28); prules();
			setState(29); match(8);
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

	public static class PrulesContext extends ParserRuleContext {
		public PruleContext prule(int i) {
			return getRuleContext(PruleContext.class,i);
		}
		public List<PruleContext> prule() {
			return getRuleContexts(PruleContext.class);
		}
		public PrulesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prules; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeneratorListener ) ((GeneratorListener)listener).enterPrules(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeneratorListener ) ((GeneratorListener)listener).exitPrules(this);
		}
	}

	public final PrulesContext prules() throws RecognitionException {
		PrulesContext _localctx = new PrulesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_prules);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NTERMID) {
				{
				{
				setState(31); prule();
				}
				}
				setState(36);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class PruleContext extends ParserRuleContext {
		public PrulepartContext prulepart() {
			return getRuleContext(PrulepartContext.class,0);
		}
		public TerminalNode NTERMID() { return getToken(GeneratorParser.NTERMID, 0); }
		public PruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeneratorListener ) ((GeneratorListener)listener).enterPrule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeneratorListener ) ((GeneratorListener)listener).exitPrule(this);
		}
	}

	public final PruleContext prule() throws RecognitionException {
		PruleContext _localctx = new PruleContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_prule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37); match(NTERMID);
			setState(38); match(2);
			setState(39); prulepart();
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

	public static class PrulepartContext extends ParserRuleContext {
		public TerminalNode LEXID(int i) {
			return getToken(GeneratorParser.LEXID, i);
		}
		public List<TerminalNode> LEXID() { return getTokens(GeneratorParser.LEXID); }
		public TerminalNode NTERMID(int i) {
			return getToken(GeneratorParser.NTERMID, i);
		}
		public List<TerminalNode> NTERMID() { return getTokens(GeneratorParser.NTERMID); }
		public TerminalNode CODE(int i) {
			return getToken(GeneratorParser.CODE, i);
		}
		public List<TerminalNode> CODE() { return getTokens(GeneratorParser.CODE); }
		public PrulepartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prulepart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeneratorListener ) ((GeneratorListener)listener).enterPrulepart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeneratorListener ) ((GeneratorListener)listener).exitPrulepart(this);
		}
	}

	public final PrulepartContext prulepart() throws RecognitionException {
		PrulepartContext _localctx = new PrulepartContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_prulepart);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(42);
					_la = _input.LA(1);
					if (_la==CODE) {
						{
						setState(41); match(CODE);
						}
					}

					setState(44);
					_la = _input.LA(1);
					if ( !(_la==LEXID || _la==NTERMID) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					} 
				}
				setState(49);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(51);
			_la = _input.LA(1);
			if (_la==CODE) {
				{
				setState(50); match(CODE);
				}
			}

			setState(53); match(9);
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

	public static class LexemsContext extends ParserRuleContext {
		public List<LexemContext> lexem() {
			return getRuleContexts(LexemContext.class);
		}
		public LexemContext lexem(int i) {
			return getRuleContext(LexemContext.class,i);
		}
		public LexemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexems; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeneratorListener ) ((GeneratorListener)listener).enterLexems(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeneratorListener ) ((GeneratorListener)listener).exitLexems(this);
		}
	}

	public final LexemsContext lexems() throws RecognitionException {
		LexemsContext _localctx = new LexemsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_lexems);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LEXID) {
				{
				{
				setState(55); lexem();
				}
				}
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class LexemContext extends ParserRuleContext {
		public TerminalNode LEXID() { return getToken(GeneratorParser.LEXID, 0); }
		public TerminalNode STRING() { return getToken(GeneratorParser.STRING, 0); }
		public LexemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeneratorListener ) ((GeneratorListener)listener).enterLexem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeneratorListener ) ((GeneratorListener)listener).exitLexem(this);
		}
	}

	public final LexemContext lexem() throws RecognitionException {
		LexemContext _localctx = new LexemContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_lexem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61); match(LEXID);
			setState(62); match(6);
			setState(63); match(STRING);
			setState(66);
			_la = _input.LA(1);
			if (_la==2) {
				{
				setState(64); match(2);
				setState(65); match(7);
				}
			}

			setState(68); match(9);
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

	public static class NtermsContext extends ParserRuleContext {
		public List<NtermContext> nterm() {
			return getRuleContexts(NtermContext.class);
		}
		public NtermContext nterm(int i) {
			return getRuleContext(NtermContext.class,i);
		}
		public NtermsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nterms; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeneratorListener ) ((GeneratorListener)listener).enterNterms(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeneratorListener ) ((GeneratorListener)listener).exitNterms(this);
		}
	}

	public final NtermsContext nterms() throws RecognitionException {
		NtermsContext _localctx = new NtermsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_nterms);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(70); nterm();
				}
				}
				setState(73); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NTERMID );
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

	public static class NtermContext extends ParserRuleContext {
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode NTERMID() { return getToken(GeneratorParser.NTERMID, 0); }
		public NtermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nterm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeneratorListener ) ((GeneratorListener)listener).enterNterm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeneratorListener ) ((GeneratorListener)listener).exitNterm(this);
		}
	}

	public final NtermContext nterm() throws RecognitionException {
		NtermContext _localctx = new NtermContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_nterm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75); match(NTERMID);
			setState(77);
			_la = _input.LA(1);
			if (_la==PARAMS) {
				{
				setState(76); params();
				}
			}

			setState(79); match(9);
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

	public static class ParamsContext extends ParserRuleContext {
		public TerminalNode PARAMS() { return getToken(GeneratorParser.PARAMS, 0); }
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GeneratorListener ) ((GeneratorListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GeneratorListener ) ((GeneratorListener)listener).exitParams(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_params);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81); match(PARAMS);
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
		"\2\3\21V\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t"+
		"\t\4\n\t\n\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\7\3"+
		"#\n\3\f\3\16\3&\13\3\3\4\3\4\3\4\3\4\3\5\5\5-\n\5\3\5\7\5\60\n\5\f\5\16"+
		"\5\63\13\5\3\5\5\5\66\n\5\3\5\3\5\3\6\7\6;\n\6\f\6\16\6>\13\6\3\7\3\7"+
		"\3\7\3\7\3\7\5\7E\n\7\3\7\3\7\3\b\6\bJ\n\b\r\b\16\bK\3\t\3\t\5\tP\n\t"+
		"\3\t\3\t\3\n\3\n\3\n\2\13\2\4\6\b\n\f\16\20\22\2\3\3\f\rT\2\24\3\2\2\2"+
		"\4$\3\2\2\2\6\'\3\2\2\2\b\61\3\2\2\2\n<\3\2\2\2\f?\3\2\2\2\16I\3\2\2\2"+
		"\20M\3\2\2\2\22S\3\2\2\2\24\25\7\6\2\2\25\26\7\5\2\2\26\27\5\n\6\2\27"+
		"\30\7\n\2\2\30\31\7\3\2\2\31\32\7\5\2\2\32\33\5\16\b\2\33\34\7\n\2\2\34"+
		"\35\7\7\2\2\35\36\7\5\2\2\36\37\5\4\3\2\37 \7\n\2\2 \3\3\2\2\2!#\5\6\4"+
		"\2\"!\3\2\2\2#&\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%\5\3\2\2\2&$\3\2\2\2\'(\7"+
		"\r\2\2()\7\4\2\2)*\5\b\5\2*\7\3\2\2\2+-\7\20\2\2,+\3\2\2\2,-\3\2\2\2-"+
		".\3\2\2\2.\60\t\2\2\2/,\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62\3\2\2"+
		"\2\62\65\3\2\2\2\63\61\3\2\2\2\64\66\7\20\2\2\65\64\3\2\2\2\65\66\3\2"+
		"\2\2\66\67\3\2\2\2\678\7\13\2\28\t\3\2\2\29;\5\f\7\2:9\3\2\2\2;>\3\2\2"+
		"\2<:\3\2\2\2<=\3\2\2\2=\13\3\2\2\2><\3\2\2\2?@\7\f\2\2@A\7\b\2\2AD\7\17"+
		"\2\2BC\7\4\2\2CE\7\t\2\2DB\3\2\2\2DE\3\2\2\2EF\3\2\2\2FG\7\13\2\2G\r\3"+
		"\2\2\2HJ\5\20\t\2IH\3\2\2\2JK\3\2\2\2KI\3\2\2\2KL\3\2\2\2L\17\3\2\2\2"+
		"MO\7\r\2\2NP\5\22\n\2ON\3\2\2\2OP\3\2\2\2PQ\3\2\2\2QR\7\13\2\2R\21\3\2"+
		"\2\2ST\7\21\2\2T\23\3\2\2\2\n$,\61\65<DKO";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}