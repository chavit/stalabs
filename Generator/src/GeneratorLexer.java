// Generated from /home/vitalii/Generator.g4 by ANTLR 4.0
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GeneratorLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__8=1, T__7=2, T__6=3, T__5=4, T__4=5, T__3=6, T__2=7, T__1=8, T__0=9, 
		LEXID=10, NTERMID=11, WS=12, STRING=13, CODE=14, PARAMS=15;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'@define'", "'->'", "'{'", "'@lexer'", "'@rules'", "':'", "'skip'", "'}'", 
		"';'", "LEXID", "NTERMID", "WS", "STRING", "CODE", "PARAMS"
	};
	public static final String[] ruleNames = {
		"T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", 
		"LEXID", "NTERMID", "WS", "STRING", "CODE", "PARAMS"
	};


	public GeneratorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Generator.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 11: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\2\4\21w\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t"+
		"\3\t\3\n\3\n\3\13\6\13I\n\13\r\13\16\13J\3\f\6\fN\n\f\r\f\16\fO\3\r\3"+
		"\r\3\r\3\r\3\16\3\16\7\16X\n\16\f\16\16\16[\13\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\7\17d\n\17\f\17\16\17g\13\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\7\20p\n\20\f\20\16\20s\13\20\3\20\3\20\3\20\5Yeq\21\3\3\1\5"+
		"\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16"+
		"\2\33\17\1\35\20\1\37\21\1\3\2\5\3C\\\3c|\5\13\f\17\17\"\"|\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\3!\3\2\2\2\5)\3\2\2\2\7,\3\2"+
		"\2\2\t.\3\2\2\2\13\65\3\2\2\2\r<\3\2\2\2\17>\3\2\2\2\21C\3\2\2\2\23E\3"+
		"\2\2\2\25H\3\2\2\2\27M\3\2\2\2\31Q\3\2\2\2\33U\3\2\2\2\35^\3\2\2\2\37"+
		"k\3\2\2\2!\"\7B\2\2\"#\7f\2\2#$\7g\2\2$%\7h\2\2%&\7k\2\2&\'\7p\2\2\'("+
		"\7g\2\2(\4\3\2\2\2)*\7/\2\2*+\7@\2\2+\6\3\2\2\2,-\7}\2\2-\b\3\2\2\2./"+
		"\7B\2\2/\60\7n\2\2\60\61\7g\2\2\61\62\7z\2\2\62\63\7g\2\2\63\64\7t\2\2"+
		"\64\n\3\2\2\2\65\66\7B\2\2\66\67\7t\2\2\678\7w\2\289\7n\2\29:\7g\2\2:"+
		";\7u\2\2;\f\3\2\2\2<=\7<\2\2=\16\3\2\2\2>?\7u\2\2?@\7m\2\2@A\7k\2\2AB"+
		"\7r\2\2B\20\3\2\2\2CD\7\177\2\2D\22\3\2\2\2EF\7=\2\2F\24\3\2\2\2GI\t\2"+
		"\2\2HG\3\2\2\2IJ\3\2\2\2JH\3\2\2\2JK\3\2\2\2K\26\3\2\2\2LN\t\3\2\2ML\3"+
		"\2\2\2NO\3\2\2\2OM\3\2\2\2OP\3\2\2\2P\30\3\2\2\2QR\t\4\2\2RS\3\2\2\2S"+
		"T\b\r\2\2T\32\3\2\2\2UY\7$\2\2VX\13\2\2\2WV\3\2\2\2X[\3\2\2\2YZ\3\2\2"+
		"\2YW\3\2\2\2Z\\\3\2\2\2[Y\3\2\2\2\\]\7$\2\2]\34\3\2\2\2^_\7&\2\2_`\7}"+
		"\2\2`e\3\2\2\2ad\5\33\16\2bd\13\2\2\2ca\3\2\2\2cb\3\2\2\2dg\3\2\2\2ef"+
		"\3\2\2\2ec\3\2\2\2fh\3\2\2\2ge\3\2\2\2hi\7\177\2\2ij\7&\2\2j\36\3\2\2"+
		"\2kl\7&\2\2lm\7]\2\2mq\3\2\2\2np\13\2\2\2on\3\2\2\2ps\3\2\2\2qr\3\2\2"+
		"\2qo\3\2\2\2rt\3\2\2\2sq\3\2\2\2tu\7_\2\2uv\7&\2\2v \3\2\2\2\t\2JOYce"+
		"q";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}