// Generated from /home/ecl/antlrPractice/semantic-analyzer/hw3.g by ANTLR 4.7.1

    // import packages here.
    import java.util.HashMap;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class hw3Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, INT=3, CHAR=4, VOID=5, SHORT=6, LONGLONG=7, FLOAT=8, DOUBLE=9, 
		STRUCT=10, ELSEIF=11, IF=12, ELSE=13, SWITCH=14, CASE=15, BREAK=16, CONTINUE=17, 
		FOR=18, WHILE=19, PRINT=20, SCANF=21, RETURN=22, INCLUDE=23, EQ=24, LTEQ=25, 
		GTEQ=26, NEQ=27, PP=28, MM=29, LSHIFT=30, RSHIFT=31, AND=32, OR=33, PLUSEQ=34, 
		MINUSEQ=35, TIMEEQ=36, DIVIDEEQ=37, MODEQ=38, NGT=39, NLT=40, GT=41, LT=42, 
		ASSIGN=43, MINUS=44, PLUS=45, TIME=46, DIVIDE=47, NOT=48, LGAND=49, LGOR=50, 
		MOD=51, DOT_=52, COMMA=53, SEMI=54, COLON=55, SHARP=56, LPAREN=57, RPAREN=58, 
		LBRACE=59, RBRACE=60, LSQUARE=61, RSQUARE=62, STRING=63, NEW_LINE=64, 
		DEC_NUM=65, ID=66, FLOAT_NUM=67, COMMENT1=68, COMMENT2=69, WS=70;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "INT", "CHAR", "VOID", "SHORT", "LONGLONG", "FLOAT", "DOUBLE", 
		"STRUCT", "ELSEIF", "IF", "ELSE", "SWITCH", "CASE", "BREAK", "CONTINUE", 
		"FOR", "WHILE", "PRINT", "SCANF", "RETURN", "INCLUDE", "EQ", "LTEQ", "GTEQ", 
		"NEQ", "PP", "MM", "LSHIFT", "RSHIFT", "AND", "OR", "PLUSEQ", "MINUSEQ", 
		"TIMEEQ", "DIVIDEEQ", "MODEQ", "NGT", "NLT", "GT", "LT", "ASSIGN", "MINUS", 
		"PLUS", "TIME", "DIVIDE", "NOT", "LGAND", "LGOR", "MOD", "DOT_", "COMMA", 
		"SEMI", "COLON", "SHARP", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LSQUARE", 
		"RSQUARE", "STRING", "NEW_LINE", "DEC_NUM", "ID", "FLOAT_NUM", "LETTER", 
		"DIGIT", "FLOAT_NUM1", "FLOAT_NUM2", "FLOAT_NUM3", "COMMENT1", "COMMENT2", 
		"WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'.h'", "'main'", "'int'", "'char'", "'void'", "'short'", "'long long'", 
		"'float'", "'double'", "'struct'", "'else if'", "'if'", "'else'", "'switch'", 
		"'case'", "'break'", "'continue'", "'for'", "'while'", "'printf'", "'scanf'", 
		"'return'", "'#include'", "'=='", "'<='", "'>='", "'!='", "'++'", "'--'", 
		"'<<'", "'>>'", "'&&'", "'||'", "'+='", "'-='", "'*='", "'/='", "'%='", 
		"'!>'", "'!<'", "'>'", "'<'", "'='", "'-'", "'+'", "'*'", "'/'", "'!'", 
		"'&'", "'|'", "'%'", "'.'", "','", "';'", "':'", "'#'", "'('", "')'", 
		"'{'", "'}'", "'['", "']'", null, "'\n'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "INT", "CHAR", "VOID", "SHORT", "LONGLONG", "FLOAT", 
		"DOUBLE", "STRUCT", "ELSEIF", "IF", "ELSE", "SWITCH", "CASE", "BREAK", 
		"CONTINUE", "FOR", "WHILE", "PRINT", "SCANF", "RETURN", "INCLUDE", "EQ", 
		"LTEQ", "GTEQ", "NEQ", "PP", "MM", "LSHIFT", "RSHIFT", "AND", "OR", "PLUSEQ", 
		"MINUSEQ", "TIMEEQ", "DIVIDEEQ", "MODEQ", "NGT", "NLT", "GT", "LT", "ASSIGN", 
		"MINUS", "PLUS", "TIME", "DIVIDE", "NOT", "LGAND", "LGOR", "MOD", "DOT_", 
		"COMMA", "SEMI", "COLON", "SHARP", "LPAREN", "RPAREN", "LBRACE", "RBRACE", 
		"LSQUARE", "RSQUARE", "STRING", "NEW_LINE", "DEC_NUM", "ID", "FLOAT_NUM", 
		"COMMENT1", "COMMENT2", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	    boolean TRACEON = false;
	    HashMap<String,Integer> symtab = new HashMap<String,Integer>();

	    /*public enum TypeInfo {
	        Integer,
	        Float,
	        Char,
	        Void,
	        Unknown,
	        No_Exist,
	        Error
	      }*/
	        
	      int attr_type;
	      
	      /*attr_type:
	        1 => integer,
	        2 => float,
	        3 => char,
	        4 => void,
	        -1 => do not exist,
	        -2 => error
	      */


	public hw3Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "hw3.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 63:
			NEW_LINE_action((RuleContext)_localctx, actionIndex);
			break;
		case 72:
			COMMENT1_action((RuleContext)_localctx, actionIndex);
			break;
		case 73:
			COMMENT2_action((RuleContext)_localctx, actionIndex);
			break;
		case 74:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void NEW_LINE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			skip();
			break;
		}
	}
	private void COMMENT1_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			skip();
			break;
		}
	}
	private void COMMENT2_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			skip();
			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			skip();
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2H\u01e3\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3"+
		" \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'"+
		"\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3"+
		"\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\3"+
		"8\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\7@\u0187\n@\f@\16"+
		"@\u018a\13@\3@\3@\3A\3A\3A\3B\3B\3B\7B\u0194\nB\fB\16B\u0197\13B\5B\u0199"+
		"\nB\3C\3C\3C\7C\u019e\nC\fC\16C\u01a1\13C\3D\3D\3D\5D\u01a6\nD\3E\3E\3"+
		"F\3F\3G\6G\u01ad\nG\rG\16G\u01ae\3G\3G\7G\u01b3\nG\fG\16G\u01b6\13G\3"+
		"H\3H\6H\u01ba\nH\rH\16H\u01bb\3I\6I\u01bf\nI\rI\16I\u01c0\3J\3J\3J\3J"+
		"\7J\u01c7\nJ\fJ\16J\u01ca\13J\3J\3J\3J\3K\3K\3K\3K\7K\u01d3\nK\fK\16K"+
		"\u01d6\13K\3K\3K\3K\3K\3K\3L\6L\u01de\nL\rL\16L\u01df\3L\3L\2\2M\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s"+
		";u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089\2\u008b\2\u008d\2\u008f"+
		"\2\u0091\2\u0093F\u0095G\u0097H\3\2\5\3\2$$\5\2C\\aac|\5\2\13\13\17\17"+
		"\"\"\2\u01eb\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3"+
		"\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2"+
		"\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2"+
		"S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3"+
		"\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2"+
		"\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2"+
		"y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083"+
		"\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2"+
		"\2\2\u0097\3\2\2\2\3\u0099\3\2\2\2\5\u009c\3\2\2\2\7\u00a1\3\2\2\2\t\u00a5"+
		"\3\2\2\2\13\u00aa\3\2\2\2\r\u00af\3\2\2\2\17\u00b5\3\2\2\2\21\u00bf\3"+
		"\2\2\2\23\u00c5\3\2\2\2\25\u00cc\3\2\2\2\27\u00d3\3\2\2\2\31\u00db\3\2"+
		"\2\2\33\u00de\3\2\2\2\35\u00e3\3\2\2\2\37\u00ea\3\2\2\2!\u00ef\3\2\2\2"+
		"#\u00f5\3\2\2\2%\u00fe\3\2\2\2\'\u0102\3\2\2\2)\u0108\3\2\2\2+\u010f\3"+
		"\2\2\2-\u0115\3\2\2\2/\u011c\3\2\2\2\61\u0125\3\2\2\2\63\u0128\3\2\2\2"+
		"\65\u012b\3\2\2\2\67\u012e\3\2\2\29\u0131\3\2\2\2;\u0134\3\2\2\2=\u0137"+
		"\3\2\2\2?\u013a\3\2\2\2A\u013d\3\2\2\2C\u0140\3\2\2\2E\u0143\3\2\2\2G"+
		"\u0146\3\2\2\2I\u0149\3\2\2\2K\u014c\3\2\2\2M\u014f\3\2\2\2O\u0152\3\2"+
		"\2\2Q\u0155\3\2\2\2S\u0158\3\2\2\2U\u015a\3\2\2\2W\u015c\3\2\2\2Y\u015e"+
		"\3\2\2\2[\u0160\3\2\2\2]\u0162\3\2\2\2_\u0164\3\2\2\2a\u0166\3\2\2\2c"+
		"\u0168\3\2\2\2e\u016a\3\2\2\2g\u016c\3\2\2\2i\u016e\3\2\2\2k\u0170\3\2"+
		"\2\2m\u0172\3\2\2\2o\u0174\3\2\2\2q\u0176\3\2\2\2s\u0178\3\2\2\2u\u017a"+
		"\3\2\2\2w\u017c\3\2\2\2y\u017e\3\2\2\2{\u0180\3\2\2\2}\u0182\3\2\2\2\177"+
		"\u0184\3\2\2\2\u0081\u018d\3\2\2\2\u0083\u0198\3\2\2\2\u0085\u019a\3\2"+
		"\2\2\u0087\u01a5\3\2\2\2\u0089\u01a7\3\2\2\2\u008b\u01a9\3\2\2\2\u008d"+
		"\u01ac\3\2\2\2\u008f\u01b7\3\2\2\2\u0091\u01be\3\2\2\2\u0093\u01c2\3\2"+
		"\2\2\u0095\u01ce\3\2\2\2\u0097\u01dd\3\2\2\2\u0099\u009a\7\60\2\2\u009a"+
		"\u009b\7j\2\2\u009b\4\3\2\2\2\u009c\u009d\7o\2\2\u009d\u009e\7c\2\2\u009e"+
		"\u009f\7k\2\2\u009f\u00a0\7p\2\2\u00a0\6\3\2\2\2\u00a1\u00a2\7k\2\2\u00a2"+
		"\u00a3\7p\2\2\u00a3\u00a4\7v\2\2\u00a4\b\3\2\2\2\u00a5\u00a6\7e\2\2\u00a6"+
		"\u00a7\7j\2\2\u00a7\u00a8\7c\2\2\u00a8\u00a9\7t\2\2\u00a9\n\3\2\2\2\u00aa"+
		"\u00ab\7x\2\2\u00ab\u00ac\7q\2\2\u00ac\u00ad\7k\2\2\u00ad\u00ae\7f\2\2"+
		"\u00ae\f\3\2\2\2\u00af\u00b0\7u\2\2\u00b0\u00b1\7j\2\2\u00b1\u00b2\7q"+
		"\2\2\u00b2\u00b3\7t\2\2\u00b3\u00b4\7v\2\2\u00b4\16\3\2\2\2\u00b5\u00b6"+
		"\7n\2\2\u00b6\u00b7\7q\2\2\u00b7\u00b8\7p\2\2\u00b8\u00b9\7i\2\2\u00b9"+
		"\u00ba\7\"\2\2\u00ba\u00bb\7n\2\2\u00bb\u00bc\7q\2\2\u00bc\u00bd\7p\2"+
		"\2\u00bd\u00be\7i\2\2\u00be\20\3\2\2\2\u00bf\u00c0\7h\2\2\u00c0\u00c1"+
		"\7n\2\2\u00c1\u00c2\7q\2\2\u00c2\u00c3\7c\2\2\u00c3\u00c4\7v\2\2\u00c4"+
		"\22\3\2\2\2\u00c5\u00c6\7f\2\2\u00c6\u00c7\7q\2\2\u00c7\u00c8\7w\2\2\u00c8"+
		"\u00c9\7d\2\2\u00c9\u00ca\7n\2\2\u00ca\u00cb\7g\2\2\u00cb\24\3\2\2\2\u00cc"+
		"\u00cd\7u\2\2\u00cd\u00ce\7v\2\2\u00ce\u00cf\7t\2\2\u00cf\u00d0\7w\2\2"+
		"\u00d0\u00d1\7e\2\2\u00d1\u00d2\7v\2\2\u00d2\26\3\2\2\2\u00d3\u00d4\7"+
		"g\2\2\u00d4\u00d5\7n\2\2\u00d5\u00d6\7u\2\2\u00d6\u00d7\7g\2\2\u00d7\u00d8"+
		"\7\"\2\2\u00d8\u00d9\7k\2\2\u00d9\u00da\7h\2\2\u00da\30\3\2\2\2\u00db"+
		"\u00dc\7k\2\2\u00dc\u00dd\7h\2\2\u00dd\32\3\2\2\2\u00de\u00df\7g\2\2\u00df"+
		"\u00e0\7n\2\2\u00e0\u00e1\7u\2\2\u00e1\u00e2\7g\2\2\u00e2\34\3\2\2\2\u00e3"+
		"\u00e4\7u\2\2\u00e4\u00e5\7y\2\2\u00e5\u00e6\7k\2\2\u00e6\u00e7\7v\2\2"+
		"\u00e7\u00e8\7e\2\2\u00e8\u00e9\7j\2\2\u00e9\36\3\2\2\2\u00ea\u00eb\7"+
		"e\2\2\u00eb\u00ec\7c\2\2\u00ec\u00ed\7u\2\2\u00ed\u00ee\7g\2\2\u00ee "+
		"\3\2\2\2\u00ef\u00f0\7d\2\2\u00f0\u00f1\7t\2\2\u00f1\u00f2\7g\2\2\u00f2"+
		"\u00f3\7c\2\2\u00f3\u00f4\7m\2\2\u00f4\"\3\2\2\2\u00f5\u00f6\7e\2\2\u00f6"+
		"\u00f7\7q\2\2\u00f7\u00f8\7p\2\2\u00f8\u00f9\7v\2\2\u00f9\u00fa\7k\2\2"+
		"\u00fa\u00fb\7p\2\2\u00fb\u00fc\7w\2\2\u00fc\u00fd\7g\2\2\u00fd$\3\2\2"+
		"\2\u00fe\u00ff\7h\2\2\u00ff\u0100\7q\2\2\u0100\u0101\7t\2\2\u0101&\3\2"+
		"\2\2\u0102\u0103\7y\2\2\u0103\u0104\7j\2\2\u0104\u0105\7k\2\2\u0105\u0106"+
		"\7n\2\2\u0106\u0107\7g\2\2\u0107(\3\2\2\2\u0108\u0109\7r\2\2\u0109\u010a"+
		"\7t\2\2\u010a\u010b\7k\2\2\u010b\u010c\7p\2\2\u010c\u010d\7v\2\2\u010d"+
		"\u010e\7h\2\2\u010e*\3\2\2\2\u010f\u0110\7u\2\2\u0110\u0111\7e\2\2\u0111"+
		"\u0112\7c\2\2\u0112\u0113\7p\2\2\u0113\u0114\7h\2\2\u0114,\3\2\2\2\u0115"+
		"\u0116\7t\2\2\u0116\u0117\7g\2\2\u0117\u0118\7v\2\2\u0118\u0119\7w\2\2"+
		"\u0119\u011a\7t\2\2\u011a\u011b\7p\2\2\u011b.\3\2\2\2\u011c\u011d\7%\2"+
		"\2\u011d\u011e\7k\2\2\u011e\u011f\7p\2\2\u011f\u0120\7e\2\2\u0120\u0121"+
		"\7n\2\2\u0121\u0122\7w\2\2\u0122\u0123\7f\2\2\u0123\u0124\7g\2\2\u0124"+
		"\60\3\2\2\2\u0125\u0126\7?\2\2\u0126\u0127\7?\2\2\u0127\62\3\2\2\2\u0128"+
		"\u0129\7>\2\2\u0129\u012a\7?\2\2\u012a\64\3\2\2\2\u012b\u012c\7@\2\2\u012c"+
		"\u012d\7?\2\2\u012d\66\3\2\2\2\u012e\u012f\7#\2\2\u012f\u0130\7?\2\2\u0130"+
		"8\3\2\2\2\u0131\u0132\7-\2\2\u0132\u0133\7-\2\2\u0133:\3\2\2\2\u0134\u0135"+
		"\7/\2\2\u0135\u0136\7/\2\2\u0136<\3\2\2\2\u0137\u0138\7>\2\2\u0138\u0139"+
		"\7>\2\2\u0139>\3\2\2\2\u013a\u013b\7@\2\2\u013b\u013c\7@\2\2\u013c@\3"+
		"\2\2\2\u013d\u013e\7(\2\2\u013e\u013f\7(\2\2\u013fB\3\2\2\2\u0140\u0141"+
		"\7~\2\2\u0141\u0142\7~\2\2\u0142D\3\2\2\2\u0143\u0144\7-\2\2\u0144\u0145"+
		"\7?\2\2\u0145F\3\2\2\2\u0146\u0147\7/\2\2\u0147\u0148\7?\2\2\u0148H\3"+
		"\2\2\2\u0149\u014a\7,\2\2\u014a\u014b\7?\2\2\u014bJ\3\2\2\2\u014c\u014d"+
		"\7\61\2\2\u014d\u014e\7?\2\2\u014eL\3\2\2\2\u014f\u0150\7\'\2\2\u0150"+
		"\u0151\7?\2\2\u0151N\3\2\2\2\u0152\u0153\7#\2\2\u0153\u0154\7@\2\2\u0154"+
		"P\3\2\2\2\u0155\u0156\7#\2\2\u0156\u0157\7>\2\2\u0157R\3\2\2\2\u0158\u0159"+
		"\7@\2\2\u0159T\3\2\2\2\u015a\u015b\7>\2\2\u015bV\3\2\2\2\u015c\u015d\7"+
		"?\2\2\u015dX\3\2\2\2\u015e\u015f\7/\2\2\u015fZ\3\2\2\2\u0160\u0161\7-"+
		"\2\2\u0161\\\3\2\2\2\u0162\u0163\7,\2\2\u0163^\3\2\2\2\u0164\u0165\7\61"+
		"\2\2\u0165`\3\2\2\2\u0166\u0167\7#\2\2\u0167b\3\2\2\2\u0168\u0169\7(\2"+
		"\2\u0169d\3\2\2\2\u016a\u016b\7~\2\2\u016bf\3\2\2\2\u016c\u016d\7\'\2"+
		"\2\u016dh\3\2\2\2\u016e\u016f\7\60\2\2\u016fj\3\2\2\2\u0170\u0171\7.\2"+
		"\2\u0171l\3\2\2\2\u0172\u0173\7=\2\2\u0173n\3\2\2\2\u0174\u0175\7<\2\2"+
		"\u0175p\3\2\2\2\u0176\u0177\7%\2\2\u0177r\3\2\2\2\u0178\u0179\7*\2\2\u0179"+
		"t\3\2\2\2\u017a\u017b\7+\2\2\u017bv\3\2\2\2\u017c\u017d\7}\2\2\u017dx"+
		"\3\2\2\2\u017e\u017f\7\177\2\2\u017fz\3\2\2\2\u0180\u0181\7]\2\2\u0181"+
		"|\3\2\2\2\u0182\u0183\7_\2\2\u0183~\3\2\2\2\u0184\u0188\7$\2\2\u0185\u0187"+
		"\n\2\2\2\u0186\u0185\3\2\2\2\u0187\u018a\3\2\2\2\u0188\u0186\3\2\2\2\u0188"+
		"\u0189\3\2\2\2\u0189\u018b\3\2\2\2\u018a\u0188\3\2\2\2\u018b\u018c\7$"+
		"\2\2\u018c\u0080\3\2\2\2\u018d\u018e\7\f\2\2\u018e\u018f\bA\2\2\u018f"+
		"\u0082\3\2\2\2\u0190\u0199\7\62\2\2\u0191\u0195\4\63;\2\u0192\u0194\5"+
		"\u008bF\2\u0193\u0192\3\2\2\2\u0194\u0197\3\2\2\2\u0195\u0193\3\2\2\2"+
		"\u0195\u0196\3\2\2\2\u0196\u0199\3\2\2\2\u0197\u0195\3\2\2\2\u0198\u0190"+
		"\3\2\2\2\u0198\u0191\3\2\2\2\u0199\u0084\3\2\2\2\u019a\u019f\5\u0089E"+
		"\2\u019b\u019e\5\u0089E\2\u019c\u019e\5\u008bF\2\u019d\u019b\3\2\2\2\u019d"+
		"\u019c\3\2\2\2\u019e\u01a1\3\2\2\2\u019f\u019d\3\2\2\2\u019f\u01a0\3\2"+
		"\2\2\u01a0\u0086\3\2\2\2\u01a1\u019f\3\2\2\2\u01a2\u01a6\5\u008dG\2\u01a3"+
		"\u01a6\5\u008fH\2\u01a4\u01a6\5\u0091I\2\u01a5\u01a2\3\2\2\2\u01a5\u01a3"+
		"\3\2\2\2\u01a5\u01a4\3\2\2\2\u01a6\u0088\3\2\2\2\u01a7\u01a8\t\3\2\2\u01a8"+
		"\u008a\3\2\2\2\u01a9\u01aa\4\62;\2\u01aa\u008c\3\2\2\2\u01ab\u01ad\5\u008b"+
		"F\2\u01ac\u01ab\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01ac\3\2\2\2\u01ae"+
		"\u01af\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b4\7\60\2\2\u01b1\u01b3\5"+
		"\u008bF\2\u01b2\u01b1\3\2\2\2\u01b3\u01b6\3\2\2\2\u01b4\u01b2\3\2\2\2"+
		"\u01b4\u01b5\3\2\2\2\u01b5\u008e\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b7\u01b9"+
		"\7\60\2\2\u01b8\u01ba\5\u008bF\2\u01b9\u01b8\3\2\2\2\u01ba\u01bb\3\2\2"+
		"\2\u01bb\u01b9\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u0090\3\2\2\2\u01bd\u01bf"+
		"\5\u008bF\2\u01be\u01bd\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01be\3\2\2"+
		"\2\u01c0\u01c1\3\2\2\2\u01c1\u0092\3\2\2\2\u01c2\u01c3\7\61\2\2\u01c3"+
		"\u01c4\7\61\2\2\u01c4\u01c8\3\2\2\2\u01c5\u01c7\13\2\2\2\u01c6\u01c5\3"+
		"\2\2\2\u01c7\u01ca\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9"+
		"\u01cb\3\2\2\2\u01ca\u01c8\3\2\2\2\u01cb\u01cc\7\f\2\2\u01cc\u01cd\bJ"+
		"\3\2\u01cd\u0094\3\2\2\2\u01ce\u01cf\7\61\2\2\u01cf\u01d0\7,\2\2\u01d0"+
		"\u01d4\3\2\2\2\u01d1\u01d3\13\2\2\2\u01d2\u01d1\3\2\2\2\u01d3\u01d6\3"+
		"\2\2\2\u01d4\u01d2\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01d7\3\2\2\2\u01d6"+
		"\u01d4\3\2\2\2\u01d7\u01d8\7,\2\2\u01d8\u01d9\7\61\2\2\u01d9\u01da\3\2"+
		"\2\2\u01da\u01db\bK\4\2\u01db\u0096\3\2\2\2\u01dc\u01de\t\4\2\2\u01dd"+
		"\u01dc\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01dd\3\2\2\2\u01df\u01e0\3\2"+
		"\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e2\bL\5\2\u01e2\u0098\3\2\2\2\20\2\u0188"+
		"\u0195\u0198\u019d\u019f\u01a5\u01ae\u01b4\u01bb\u01c0\u01c8\u01d4\u01df"+
		"\6\3A\2\3J\3\3K\4\3L\5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}