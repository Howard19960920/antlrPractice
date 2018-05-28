// Generated from /home/ecl/antlrPractice/semantic-analyzer/hw3.g by ANTLR 4.7.1

    // import packages here.
    import java.util.HashMap;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class hw3Parser extends Parser {
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
	public static final int
		RULE_entryPoint = 0, RULE_vartypes = 1, RULE_vardeclarations = 2, RULE_varassignments = 3, 
		RULE_expressions = 4, RULE_operations = 5, RULE_addexprs = 6, RULE_mulexprs = 7, 
		RULE_atomexprs = 8, RULE_codelines = 9, RULE_ifconditions = 10, RULE_forloops = 11, 
		RULE_whileloops = 12, RULE_continues = 13, RULE_breaks = 14, RULE_parameters = 15, 
		RULE_argvs = 16, RULE_retvals = 17, RULE_subfunctions = 18, RULE_callfunctions = 19, 
		RULE_mainfunction = 20;
	public static final String[] ruleNames = {
		"entryPoint", "vartypes", "vardeclarations", "varassignments", "expressions", 
		"operations", "addexprs", "mulexprs", "atomexprs", "codelines", "ifconditions", 
		"forloops", "whileloops", "continues", "breaks", "parameters", "argvs", 
		"retvals", "subfunctions", "callfunctions", "mainfunction"
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

	@Override
	public String getGrammarFileName() { return "hw3.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


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

	public hw3Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class EntryPointContext extends ParserRuleContext {
		public MainfunctionContext mainfunction() {
			return getRuleContext(MainfunctionContext.class,0);
		}
		public List<TerminalNode> INCLUDE() { return getTokens(hw3Parser.INCLUDE); }
		public TerminalNode INCLUDE(int i) {
			return getToken(hw3Parser.INCLUDE, i);
		}
		public List<TerminalNode> ID() { return getTokens(hw3Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(hw3Parser.ID, i);
		}
		public List<SubfunctionsContext> subfunctions() {
			return getRuleContexts(SubfunctionsContext.class);
		}
		public SubfunctionsContext subfunctions(int i) {
			return getRuleContext(SubfunctionsContext.class,i);
		}
		public EntryPointContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entryPoint; }
	}

	public final EntryPointContext entryPoint() throws RecognitionException {
		EntryPointContext _localctx = new EntryPointContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_entryPoint);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INCLUDE) {
				{
				{
				setState(42);
				match(INCLUDE);
				setState(43);
				match(LT);
				setState(44);
				match(ID);
				setState(45);
				match(T__0);
				setState(46);
				match(GT);
				}
				}
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(55);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(52);
					subfunctions();
					}
					} 
				}
				setState(57);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(58);
			mainfunction();
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << CHAR) | (1L << VOID) | (1L << SHORT) | (1L << LONGLONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << STRUCT))) != 0)) {
				{
				{
				setState(59);
				subfunctions();
				}
				}
				setState(64);
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

	public static class VartypesContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(hw3Parser.INT, 0); }
		public TerminalNode CHAR() { return getToken(hw3Parser.CHAR, 0); }
		public TerminalNode VOID() { return getToken(hw3Parser.VOID, 0); }
		public TerminalNode SHORT() { return getToken(hw3Parser.SHORT, 0); }
		public TerminalNode LONGLONG() { return getToken(hw3Parser.LONGLONG, 0); }
		public TerminalNode FLOAT() { return getToken(hw3Parser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(hw3Parser.DOUBLE, 0); }
		public TerminalNode STRUCT() { return getToken(hw3Parser.STRUCT, 0); }
		public VartypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vartypes; }
	}

	public final VartypesContext vartypes() throws RecognitionException {
		VartypesContext _localctx = new VartypesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_vartypes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << CHAR) | (1L << VOID) | (1L << SHORT) | (1L << LONGLONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << STRUCT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class VardeclarationsContext extends ParserRuleContext {
		public VartypesContext vartypes() {
			return getRuleContext(VartypesContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(hw3Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(hw3Parser.ID, i);
		}
		public TerminalNode SEMI() { return getToken(hw3Parser.SEMI, 0); }
		public List<TerminalNode> COMMA() { return getTokens(hw3Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(hw3Parser.COMMA, i);
		}
		public VardeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardeclarations; }
	}

	public final VardeclarationsContext vardeclarations() throws RecognitionException {
		VardeclarationsContext _localctx = new VardeclarationsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_vardeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			vartypes();
			setState(68);
			match(ID);
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(69);
				match(COMMA);
				setState(70);
				match(ID);
				}
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(76);
			match(SEMI);
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

	public static class VarassignmentsContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(hw3Parser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(hw3Parser.ASSIGN, 0); }
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(hw3Parser.SEMI, 0); }
		public VarassignmentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varassignments; }
	}

	public final VarassignmentsContext varassignments() throws RecognitionException {
		VarassignmentsContext _localctx = new VarassignmentsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_varassignments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(ID);
			setState(79);
			match(ASSIGN);
			setState(80);
			expressions();
			setState(81);
			match(SEMI);
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

	public static class ExpressionsContext extends ParserRuleContext {
		public List<OperationsContext> operations() {
			return getRuleContexts(OperationsContext.class);
		}
		public OperationsContext operations(int i) {
			return getRuleContext(OperationsContext.class,i);
		}
		public List<TerminalNode> LGAND() { return getTokens(hw3Parser.LGAND); }
		public TerminalNode LGAND(int i) {
			return getToken(hw3Parser.LGAND, i);
		}
		public List<TerminalNode> LGOR() { return getTokens(hw3Parser.LGOR); }
		public TerminalNode LGOR(int i) {
			return getToken(hw3Parser.LGOR, i);
		}
		public ExpressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressions; }
	}

	public final ExpressionsContext expressions() throws RecognitionException {
		ExpressionsContext _localctx = new ExpressionsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_expressions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			operations();
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LGAND || _la==LGOR) {
				{
				setState(88);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LGAND:
					{
					setState(84);
					match(LGAND);
					setState(85);
					operations();
					}
					break;
				case LGOR:
					{
					setState(86);
					match(LGOR);
					setState(87);
					operations();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(92);
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

	public static class OperationsContext extends ParserRuleContext {
		public List<AddexprsContext> addexprs() {
			return getRuleContexts(AddexprsContext.class);
		}
		public AddexprsContext addexprs(int i) {
			return getRuleContext(AddexprsContext.class,i);
		}
		public List<TerminalNode> EQ() { return getTokens(hw3Parser.EQ); }
		public TerminalNode EQ(int i) {
			return getToken(hw3Parser.EQ, i);
		}
		public List<TerminalNode> NEQ() { return getTokens(hw3Parser.NEQ); }
		public TerminalNode NEQ(int i) {
			return getToken(hw3Parser.NEQ, i);
		}
		public List<TerminalNode> LT() { return getTokens(hw3Parser.LT); }
		public TerminalNode LT(int i) {
			return getToken(hw3Parser.LT, i);
		}
		public List<TerminalNode> NLT() { return getTokens(hw3Parser.NLT); }
		public TerminalNode NLT(int i) {
			return getToken(hw3Parser.NLT, i);
		}
		public List<TerminalNode> GT() { return getTokens(hw3Parser.GT); }
		public TerminalNode GT(int i) {
			return getToken(hw3Parser.GT, i);
		}
		public List<TerminalNode> NGT() { return getTokens(hw3Parser.NGT); }
		public TerminalNode NGT(int i) {
			return getToken(hw3Parser.NGT, i);
		}
		public List<TerminalNode> GTEQ() { return getTokens(hw3Parser.GTEQ); }
		public TerminalNode GTEQ(int i) {
			return getToken(hw3Parser.GTEQ, i);
		}
		public List<TerminalNode> LTEQ() { return getTokens(hw3Parser.LTEQ); }
		public TerminalNode LTEQ(int i) {
			return getToken(hw3Parser.LTEQ, i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(hw3Parser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(hw3Parser.ASSIGN, i);
		}
		public List<TerminalNode> PLUSEQ() { return getTokens(hw3Parser.PLUSEQ); }
		public TerminalNode PLUSEQ(int i) {
			return getToken(hw3Parser.PLUSEQ, i);
		}
		public List<TerminalNode> MINUSEQ() { return getTokens(hw3Parser.MINUSEQ); }
		public TerminalNode MINUSEQ(int i) {
			return getToken(hw3Parser.MINUSEQ, i);
		}
		public List<TerminalNode> TIMEEQ() { return getTokens(hw3Parser.TIMEEQ); }
		public TerminalNode TIMEEQ(int i) {
			return getToken(hw3Parser.TIMEEQ, i);
		}
		public List<TerminalNode> DIVIDEEQ() { return getTokens(hw3Parser.DIVIDEEQ); }
		public TerminalNode DIVIDEEQ(int i) {
			return getToken(hw3Parser.DIVIDEEQ, i);
		}
		public OperationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operations; }
	}

	public final OperationsContext operations() throws RecognitionException {
		OperationsContext _localctx = new OperationsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_operations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			addexprs();
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << LTEQ) | (1L << GTEQ) | (1L << NEQ) | (1L << PLUSEQ) | (1L << MINUSEQ) | (1L << TIMEEQ) | (1L << DIVIDEEQ) | (1L << NGT) | (1L << NLT) | (1L << GT) | (1L << LT) | (1L << ASSIGN))) != 0)) {
				{
				{
				setState(94);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << LTEQ) | (1L << GTEQ) | (1L << NEQ) | (1L << PLUSEQ) | (1L << MINUSEQ) | (1L << TIMEEQ) | (1L << DIVIDEEQ) | (1L << NGT) | (1L << NLT) | (1L << GT) | (1L << LT) | (1L << ASSIGN))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(95);
				addexprs();
				}
				}
				setState(100);
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

	public static class AddexprsContext extends ParserRuleContext {
		public List<MulexprsContext> mulexprs() {
			return getRuleContexts(MulexprsContext.class);
		}
		public MulexprsContext mulexprs(int i) {
			return getRuleContext(MulexprsContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(hw3Parser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(hw3Parser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(hw3Parser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(hw3Parser.MINUS, i);
		}
		public AddexprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addexprs; }
	}

	public final AddexprsContext addexprs() throws RecognitionException {
		AddexprsContext _localctx = new AddexprsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_addexprs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			mulexprs();
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MINUS || _la==PLUS) {
				{
				setState(106);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS:
					{
					setState(102);
					match(PLUS);
					setState(103);
					mulexprs();
					}
					break;
				case MINUS:
					{
					setState(104);
					match(MINUS);
					setState(105);
					mulexprs();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(110);
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

	public static class MulexprsContext extends ParserRuleContext {
		public List<AtomexprsContext> atomexprs() {
			return getRuleContexts(AtomexprsContext.class);
		}
		public AtomexprsContext atomexprs(int i) {
			return getRuleContext(AtomexprsContext.class,i);
		}
		public List<TerminalNode> TIME() { return getTokens(hw3Parser.TIME); }
		public TerminalNode TIME(int i) {
			return getToken(hw3Parser.TIME, i);
		}
		public List<TerminalNode> DIVIDE() { return getTokens(hw3Parser.DIVIDE); }
		public TerminalNode DIVIDE(int i) {
			return getToken(hw3Parser.DIVIDE, i);
		}
		public MulexprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulexprs; }
	}

	public final MulexprsContext mulexprs() throws RecognitionException {
		MulexprsContext _localctx = new MulexprsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_mulexprs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			atomexprs();
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TIME || _la==DIVIDE) {
				{
				setState(116);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TIME:
					{
					setState(112);
					match(TIME);
					setState(113);
					atomexprs();
					}
					break;
				case DIVIDE:
					{
					setState(114);
					match(DIVIDE);
					setState(115);
					atomexprs();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(120);
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

	public static class AtomexprsContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(hw3Parser.ID, 0); }
		public TerminalNode DEC_NUM() { return getToken(hw3Parser.DEC_NUM, 0); }
		public TerminalNode FLOAT_NUM() { return getToken(hw3Parser.FLOAT_NUM, 0); }
		public TerminalNode LPAREN() { return getToken(hw3Parser.LPAREN, 0); }
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(hw3Parser.RPAREN, 0); }
		public AtomexprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomexprs; }
	}

	public final AtomexprsContext atomexprs() throws RecognitionException {
		AtomexprsContext _localctx = new AtomexprsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_atomexprs);
		try {
			setState(128);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				match(ID);
				}
				break;
			case DEC_NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				match(DEC_NUM);
				}
				break;
			case FLOAT_NUM:
				enterOuterAlt(_localctx, 3);
				{
				setState(123);
				match(FLOAT_NUM);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 4);
				{
				setState(124);
				match(LPAREN);
				setState(125);
				expressions();
				setState(126);
				match(RPAREN);
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

	public static class CodelinesContext extends ParserRuleContext {
		public VardeclarationsContext vardeclarations() {
			return getRuleContext(VardeclarationsContext.class,0);
		}
		public VarassignmentsContext varassignments() {
			return getRuleContext(VarassignmentsContext.class,0);
		}
		public IfconditionsContext ifconditions() {
			return getRuleContext(IfconditionsContext.class,0);
		}
		public ForloopsContext forloops() {
			return getRuleContext(ForloopsContext.class,0);
		}
		public WhileloopsContext whileloops() {
			return getRuleContext(WhileloopsContext.class,0);
		}
		public ContinuesContext continues() {
			return getRuleContext(ContinuesContext.class,0);
		}
		public BreaksContext breaks() {
			return getRuleContext(BreaksContext.class,0);
		}
		public CallfunctionsContext callfunctions() {
			return getRuleContext(CallfunctionsContext.class,0);
		}
		public CodelinesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codelines; }
	}

	public final CodelinesContext codelines() throws RecognitionException {
		CodelinesContext _localctx = new CodelinesContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_codelines);
		try {
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				vardeclarations();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				varassignments();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(132);
				ifconditions();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(133);
				forloops();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(134);
				whileloops();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(135);
				continues();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(136);
				breaks();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(137);
				callfunctions();
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

	public static class IfconditionsContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(hw3Parser.IF, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(hw3Parser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(hw3Parser.LPAREN, i);
		}
		public List<ExpressionsContext> expressions() {
			return getRuleContexts(ExpressionsContext.class);
		}
		public ExpressionsContext expressions(int i) {
			return getRuleContext(ExpressionsContext.class,i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(hw3Parser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(hw3Parser.RPAREN, i);
		}
		public List<TerminalNode> LBRACE() { return getTokens(hw3Parser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(hw3Parser.LBRACE, i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(hw3Parser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(hw3Parser.RBRACE, i);
		}
		public List<CodelinesContext> codelines() {
			return getRuleContexts(CodelinesContext.class);
		}
		public CodelinesContext codelines(int i) {
			return getRuleContext(CodelinesContext.class,i);
		}
		public List<TerminalNode> ELSEIF() { return getTokens(hw3Parser.ELSEIF); }
		public TerminalNode ELSEIF(int i) {
			return getToken(hw3Parser.ELSEIF, i);
		}
		public TerminalNode ELSE() { return getToken(hw3Parser.ELSE, 0); }
		public IfconditionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifconditions; }
	}

	public final IfconditionsContext ifconditions() throws RecognitionException {
		IfconditionsContext _localctx = new IfconditionsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ifconditions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(IF);
			setState(141);
			match(LPAREN);
			setState(142);
			expressions();
			setState(143);
			match(RPAREN);
			setState(144);
			match(LBRACE);
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (INT - 3)) | (1L << (CHAR - 3)) | (1L << (VOID - 3)) | (1L << (SHORT - 3)) | (1L << (LONGLONG - 3)) | (1L << (FLOAT - 3)) | (1L << (DOUBLE - 3)) | (1L << (STRUCT - 3)) | (1L << (IF - 3)) | (1L << (BREAK - 3)) | (1L << (CONTINUE - 3)) | (1L << (FOR - 3)) | (1L << (WHILE - 3)) | (1L << (ID - 3)))) != 0)) {
				{
				{
				setState(145);
				codelines();
				}
				}
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(151);
			match(RBRACE);
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSEIF) {
				{
				{
				setState(152);
				match(ELSEIF);
				setState(153);
				match(LPAREN);
				setState(154);
				expressions();
				setState(155);
				match(RPAREN);
				setState(156);
				match(LBRACE);
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (INT - 3)) | (1L << (CHAR - 3)) | (1L << (VOID - 3)) | (1L << (SHORT - 3)) | (1L << (LONGLONG - 3)) | (1L << (FLOAT - 3)) | (1L << (DOUBLE - 3)) | (1L << (STRUCT - 3)) | (1L << (IF - 3)) | (1L << (BREAK - 3)) | (1L << (CONTINUE - 3)) | (1L << (FOR - 3)) | (1L << (WHILE - 3)) | (1L << (ID - 3)))) != 0)) {
					{
					{
					setState(157);
					codelines();
					}
					}
					setState(162);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(163);
				match(RBRACE);
				}
				}
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(170);
				match(ELSE);
				setState(171);
				match(LBRACE);
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (INT - 3)) | (1L << (CHAR - 3)) | (1L << (VOID - 3)) | (1L << (SHORT - 3)) | (1L << (LONGLONG - 3)) | (1L << (FLOAT - 3)) | (1L << (DOUBLE - 3)) | (1L << (STRUCT - 3)) | (1L << (IF - 3)) | (1L << (BREAK - 3)) | (1L << (CONTINUE - 3)) | (1L << (FOR - 3)) | (1L << (WHILE - 3)) | (1L << (ID - 3)))) != 0)) {
					{
					{
					setState(172);
					codelines();
					}
					}
					setState(177);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(178);
				match(RBRACE);
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

	public static class ForloopsContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(hw3Parser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(hw3Parser.LPAREN, 0); }
		public List<TerminalNode> SEMI() { return getTokens(hw3Parser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(hw3Parser.SEMI, i);
		}
		public TerminalNode RPAREN() { return getToken(hw3Parser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(hw3Parser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(hw3Parser.RBRACE, 0); }
		public List<ExpressionsContext> expressions() {
			return getRuleContexts(ExpressionsContext.class);
		}
		public ExpressionsContext expressions(int i) {
			return getRuleContext(ExpressionsContext.class,i);
		}
		public List<CodelinesContext> codelines() {
			return getRuleContexts(CodelinesContext.class);
		}
		public CodelinesContext codelines(int i) {
			return getRuleContext(CodelinesContext.class,i);
		}
		public ForloopsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forloops; }
	}

	public final ForloopsContext forloops() throws RecognitionException {
		ForloopsContext _localctx = new ForloopsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_forloops);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(FOR);
			setState(182);
			match(LPAREN);
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & ((1L << (LPAREN - 57)) | (1L << (DEC_NUM - 57)) | (1L << (ID - 57)) | (1L << (FLOAT_NUM - 57)))) != 0)) {
				{
				{
				setState(183);
				expressions();
				}
				}
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(189);
			match(SEMI);
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & ((1L << (LPAREN - 57)) | (1L << (DEC_NUM - 57)) | (1L << (ID - 57)) | (1L << (FLOAT_NUM - 57)))) != 0)) {
				{
				{
				setState(190);
				expressions();
				}
				}
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(196);
			match(SEMI);
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & ((1L << (LPAREN - 57)) | (1L << (DEC_NUM - 57)) | (1L << (ID - 57)) | (1L << (FLOAT_NUM - 57)))) != 0)) {
				{
				{
				setState(197);
				expressions();
				}
				}
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(203);
			match(RPAREN);
			setState(204);
			match(LBRACE);
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (INT - 3)) | (1L << (CHAR - 3)) | (1L << (VOID - 3)) | (1L << (SHORT - 3)) | (1L << (LONGLONG - 3)) | (1L << (FLOAT - 3)) | (1L << (DOUBLE - 3)) | (1L << (STRUCT - 3)) | (1L << (IF - 3)) | (1L << (BREAK - 3)) | (1L << (CONTINUE - 3)) | (1L << (FOR - 3)) | (1L << (WHILE - 3)) | (1L << (ID - 3)))) != 0)) {
				{
				{
				setState(205);
				codelines();
				}
				}
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(211);
			match(RBRACE);
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

	public static class WhileloopsContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(hw3Parser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(hw3Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(hw3Parser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(hw3Parser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(hw3Parser.RBRACE, 0); }
		public List<ExpressionsContext> expressions() {
			return getRuleContexts(ExpressionsContext.class);
		}
		public ExpressionsContext expressions(int i) {
			return getRuleContext(ExpressionsContext.class,i);
		}
		public List<CodelinesContext> codelines() {
			return getRuleContexts(CodelinesContext.class);
		}
		public CodelinesContext codelines(int i) {
			return getRuleContext(CodelinesContext.class,i);
		}
		public WhileloopsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileloops; }
	}

	public final WhileloopsContext whileloops() throws RecognitionException {
		WhileloopsContext _localctx = new WhileloopsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_whileloops);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(WHILE);
			setState(214);
			match(LPAREN);
			setState(216); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(215);
				expressions();
				}
				}
				setState(218); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & ((1L << (LPAREN - 57)) | (1L << (DEC_NUM - 57)) | (1L << (ID - 57)) | (1L << (FLOAT_NUM - 57)))) != 0) );
			setState(220);
			match(RPAREN);
			setState(221);
			match(LBRACE);
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (INT - 3)) | (1L << (CHAR - 3)) | (1L << (VOID - 3)) | (1L << (SHORT - 3)) | (1L << (LONGLONG - 3)) | (1L << (FLOAT - 3)) | (1L << (DOUBLE - 3)) | (1L << (STRUCT - 3)) | (1L << (IF - 3)) | (1L << (BREAK - 3)) | (1L << (CONTINUE - 3)) | (1L << (FOR - 3)) | (1L << (WHILE - 3)) | (1L << (ID - 3)))) != 0)) {
				{
				{
				setState(222);
				codelines();
				}
				}
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(228);
			match(RBRACE);
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

	public static class ContinuesContext extends ParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(hw3Parser.CONTINUE, 0); }
		public TerminalNode SEMI() { return getToken(hw3Parser.SEMI, 0); }
		public ContinuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continues; }
	}

	public final ContinuesContext continues() throws RecognitionException {
		ContinuesContext _localctx = new ContinuesContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_continues);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(CONTINUE);
			setState(231);
			match(SEMI);
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

	public static class BreaksContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(hw3Parser.BREAK, 0); }
		public TerminalNode SEMI() { return getToken(hw3Parser.SEMI, 0); }
		public BreaksContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breaks; }
	}

	public final BreaksContext breaks() throws RecognitionException {
		BreaksContext _localctx = new BreaksContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_breaks);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(BREAK);
			setState(234);
			match(SEMI);
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

	public static class ParametersContext extends ParserRuleContext {
		public List<VartypesContext> vartypes() {
			return getRuleContexts(VartypesContext.class);
		}
		public VartypesContext vartypes(int i) {
			return getRuleContext(VartypesContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(hw3Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(hw3Parser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(hw3Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(hw3Parser.COMMA, i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			vartypes();
			setState(237);
			match(ID);
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(238);
				match(COMMA);
				setState(239);
				vartypes();
				setState(240);
				match(ID);
				}
				}
				setState(246);
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

	public static class ArgvsContext extends ParserRuleContext {
		public List<ExpressionsContext> expressions() {
			return getRuleContexts(ExpressionsContext.class);
		}
		public ExpressionsContext expressions(int i) {
			return getRuleContext(ExpressionsContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(hw3Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(hw3Parser.COMMA, i);
		}
		public ArgvsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argvs; }
	}

	public final ArgvsContext argvs() throws RecognitionException {
		ArgvsContext _localctx = new ArgvsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_argvs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			expressions();
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(248);
				match(COMMA);
				setState(249);
				expressions();
				}
				}
				setState(254);
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

	public static class RetvalsContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(hw3Parser.RETURN, 0); }
		public TerminalNode SEMI() { return getToken(hw3Parser.SEMI, 0); }
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public RetvalsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retvals; }
	}

	public final RetvalsContext retvals() throws RecognitionException {
		RetvalsContext _localctx = new RetvalsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_retvals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(RETURN);
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & ((1L << (LPAREN - 57)) | (1L << (DEC_NUM - 57)) | (1L << (ID - 57)) | (1L << (FLOAT_NUM - 57)))) != 0)) {
				{
				setState(256);
				expressions();
				}
			}

			setState(259);
			match(SEMI);
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

	public static class SubfunctionsContext extends ParserRuleContext {
		public VartypesContext vartypes() {
			return getRuleContext(VartypesContext.class,0);
		}
		public TerminalNode ID() { return getToken(hw3Parser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(hw3Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(hw3Parser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(hw3Parser.SEMI, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(hw3Parser.LBRACE, 0); }
		public RetvalsContext retvals() {
			return getRuleContext(RetvalsContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(hw3Parser.RBRACE, 0); }
		public List<CodelinesContext> codelines() {
			return getRuleContexts(CodelinesContext.class);
		}
		public CodelinesContext codelines(int i) {
			return getRuleContext(CodelinesContext.class,i);
		}
		public SubfunctionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subfunctions; }
	}

	public final SubfunctionsContext subfunctions() throws RecognitionException {
		SubfunctionsContext _localctx = new SubfunctionsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_subfunctions);
		int _la;
		try {
			setState(287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(261);
				vartypes();
				setState(262);
				match(ID);
				setState(263);
				match(LPAREN);
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << CHAR) | (1L << VOID) | (1L << SHORT) | (1L << LONGLONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << STRUCT))) != 0)) {
					{
					setState(264);
					parameters();
					}
				}

				setState(267);
				match(RPAREN);
				setState(268);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(270);
				vartypes();
				setState(271);
				match(ID);
				setState(272);
				match(LPAREN);
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << CHAR) | (1L << VOID) | (1L << SHORT) | (1L << LONGLONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << STRUCT))) != 0)) {
					{
					setState(273);
					parameters();
					}
				}

				setState(276);
				match(RPAREN);
				setState(277);
				match(LBRACE);
				setState(281);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (INT - 3)) | (1L << (CHAR - 3)) | (1L << (VOID - 3)) | (1L << (SHORT - 3)) | (1L << (LONGLONG - 3)) | (1L << (FLOAT - 3)) | (1L << (DOUBLE - 3)) | (1L << (STRUCT - 3)) | (1L << (IF - 3)) | (1L << (BREAK - 3)) | (1L << (CONTINUE - 3)) | (1L << (FOR - 3)) | (1L << (WHILE - 3)) | (1L << (ID - 3)))) != 0)) {
					{
					{
					setState(278);
					codelines();
					}
					}
					setState(283);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(284);
				retvals();
				setState(285);
				match(RBRACE);
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

	public static class CallfunctionsContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(hw3Parser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(hw3Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(hw3Parser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(hw3Parser.SEMI, 0); }
		public ArgvsContext argvs() {
			return getRuleContext(ArgvsContext.class,0);
		}
		public CallfunctionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callfunctions; }
	}

	public final CallfunctionsContext callfunctions() throws RecognitionException {
		CallfunctionsContext _localctx = new CallfunctionsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_callfunctions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(ID);
			setState(290);
			match(LPAREN);
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & ((1L << (LPAREN - 57)) | (1L << (DEC_NUM - 57)) | (1L << (ID - 57)) | (1L << (FLOAT_NUM - 57)))) != 0)) {
				{
				setState(291);
				argvs();
				}
			}

			setState(294);
			match(RPAREN);
			setState(295);
			match(SEMI);
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

	public static class MainfunctionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(hw3Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(hw3Parser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(hw3Parser.LBRACE, 0); }
		public RetvalsContext retvals() {
			return getRuleContext(RetvalsContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(hw3Parser.RBRACE, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public List<CodelinesContext> codelines() {
			return getRuleContexts(CodelinesContext.class);
		}
		public CodelinesContext codelines(int i) {
			return getRuleContext(CodelinesContext.class,i);
		}
		public TerminalNode INT() { return getToken(hw3Parser.INT, 0); }
		public TerminalNode VOID() { return getToken(hw3Parser.VOID, 0); }
		public MainfunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainfunction; }
	}

	public final MainfunctionContext mainfunction() throws RecognitionException {
		MainfunctionContext _localctx = new MainfunctionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_mainfunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INT || _la==VOID) {
				{
				setState(297);
				_la = _input.LA(1);
				if ( !(_la==INT || _la==VOID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(300);
			match(T__1);
			setState(301);
			match(LPAREN);
			setState(303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << CHAR) | (1L << VOID) | (1L << SHORT) | (1L << LONGLONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << STRUCT))) != 0)) {
				{
				setState(302);
				parameters();
				}
			}

			setState(305);
			match(RPAREN);
			setState(306);
			match(LBRACE);
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (INT - 3)) | (1L << (CHAR - 3)) | (1L << (VOID - 3)) | (1L << (SHORT - 3)) | (1L << (LONGLONG - 3)) | (1L << (FLOAT - 3)) | (1L << (DOUBLE - 3)) | (1L << (STRUCT - 3)) | (1L << (IF - 3)) | (1L << (BREAK - 3)) | (1L << (CONTINUE - 3)) | (1L << (FOR - 3)) | (1L << (WHILE - 3)) | (1L << (ID - 3)))) != 0)) {
				{
				{
				setState(307);
				codelines();
				}
				}
				setState(312);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(313);
			retvals();
			setState(314);
			match(RBRACE);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3H\u013f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\3\2\7\2\62\n"+
		"\2\f\2\16\2\65\13\2\3\2\7\28\n\2\f\2\16\2;\13\2\3\2\3\2\7\2?\n\2\f\2\16"+
		"\2B\13\2\3\3\3\3\3\4\3\4\3\4\3\4\7\4J\n\4\f\4\16\4M\13\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\7\6[\n\6\f\6\16\6^\13\6\3\7\3\7\3\7"+
		"\7\7c\n\7\f\7\16\7f\13\7\3\b\3\b\3\b\3\b\3\b\7\bm\n\b\f\b\16\bp\13\b\3"+
		"\t\3\t\3\t\3\t\3\t\7\tw\n\t\f\t\16\tz\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\5\n\u0083\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u008d\n\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u0095\n\f\f\f\16\f\u0098\13\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\7\f\u00a1\n\f\f\f\16\f\u00a4\13\f\3\f\3\f\7\f\u00a8\n"+
		"\f\f\f\16\f\u00ab\13\f\3\f\3\f\3\f\7\f\u00b0\n\f\f\f\16\f\u00b3\13\f\3"+
		"\f\5\f\u00b6\n\f\3\r\3\r\3\r\7\r\u00bb\n\r\f\r\16\r\u00be\13\r\3\r\3\r"+
		"\7\r\u00c2\n\r\f\r\16\r\u00c5\13\r\3\r\3\r\7\r\u00c9\n\r\f\r\16\r\u00cc"+
		"\13\r\3\r\3\r\3\r\7\r\u00d1\n\r\f\r\16\r\u00d4\13\r\3\r\3\r\3\16\3\16"+
		"\3\16\6\16\u00db\n\16\r\16\16\16\u00dc\3\16\3\16\3\16\7\16\u00e2\n\16"+
		"\f\16\16\16\u00e5\13\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\7\21\u00f5\n\21\f\21\16\21\u00f8\13\21\3\22\3"+
		"\22\3\22\7\22\u00fd\n\22\f\22\16\22\u0100\13\22\3\23\3\23\5\23\u0104\n"+
		"\23\3\23\3\23\3\24\3\24\3\24\3\24\5\24\u010c\n\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\5\24\u0115\n\24\3\24\3\24\3\24\7\24\u011a\n\24\f\24\16"+
		"\24\u011d\13\24\3\24\3\24\3\24\5\24\u0122\n\24\3\25\3\25\3\25\5\25\u0127"+
		"\n\25\3\25\3\25\3\25\3\26\5\26\u012d\n\26\3\26\3\26\3\26\5\26\u0132\n"+
		"\26\3\26\3\26\3\26\7\26\u0137\n\26\f\26\16\26\u013a\13\26\3\26\3\26\3"+
		"\26\3\26\2\2\27\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*\2\5\3\2"+
		"\5\f\5\2\32\35$\')-\4\2\5\5\7\7\2\u0154\2\63\3\2\2\2\4C\3\2\2\2\6E\3\2"+
		"\2\2\bP\3\2\2\2\nU\3\2\2\2\f_\3\2\2\2\16g\3\2\2\2\20q\3\2\2\2\22\u0082"+
		"\3\2\2\2\24\u008c\3\2\2\2\26\u008e\3\2\2\2\30\u00b7\3\2\2\2\32\u00d7\3"+
		"\2\2\2\34\u00e8\3\2\2\2\36\u00eb\3\2\2\2 \u00ee\3\2\2\2\"\u00f9\3\2\2"+
		"\2$\u0101\3\2\2\2&\u0121\3\2\2\2(\u0123\3\2\2\2*\u012c\3\2\2\2,-\7\31"+
		"\2\2-.\7,\2\2./\7D\2\2/\60\7\3\2\2\60\62\7+\2\2\61,\3\2\2\2\62\65\3\2"+
		"\2\2\63\61\3\2\2\2\63\64\3\2\2\2\649\3\2\2\2\65\63\3\2\2\2\668\5&\24\2"+
		"\67\66\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:<\3\2\2\2;9\3\2\2\2<@\5"+
		"*\26\2=?\5&\24\2>=\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2A\3\3\2\2\2B@"+
		"\3\2\2\2CD\t\2\2\2D\5\3\2\2\2EF\5\4\3\2FK\7D\2\2GH\7\67\2\2HJ\7D\2\2I"+
		"G\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2LN\3\2\2\2MK\3\2\2\2NO\78\2\2O"+
		"\7\3\2\2\2PQ\7D\2\2QR\7-\2\2RS\5\n\6\2ST\78\2\2T\t\3\2\2\2U\\\5\f\7\2"+
		"VW\7\63\2\2W[\5\f\7\2XY\7\64\2\2Y[\5\f\7\2ZV\3\2\2\2ZX\3\2\2\2[^\3\2\2"+
		"\2\\Z\3\2\2\2\\]\3\2\2\2]\13\3\2\2\2^\\\3\2\2\2_d\5\16\b\2`a\t\3\2\2a"+
		"c\5\16\b\2b`\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2e\r\3\2\2\2fd\3\2\2"+
		"\2gn\5\20\t\2hi\7/\2\2im\5\20\t\2jk\7.\2\2km\5\20\t\2lh\3\2\2\2lj\3\2"+
		"\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2o\17\3\2\2\2pn\3\2\2\2qx\5\22\n\2rs"+
		"\7\60\2\2sw\5\22\n\2tu\7\61\2\2uw\5\22\n\2vr\3\2\2\2vt\3\2\2\2wz\3\2\2"+
		"\2xv\3\2\2\2xy\3\2\2\2y\21\3\2\2\2zx\3\2\2\2{\u0083\7D\2\2|\u0083\7C\2"+
		"\2}\u0083\7E\2\2~\177\7;\2\2\177\u0080\5\n\6\2\u0080\u0081\7<\2\2\u0081"+
		"\u0083\3\2\2\2\u0082{\3\2\2\2\u0082|\3\2\2\2\u0082}\3\2\2\2\u0082~\3\2"+
		"\2\2\u0083\23\3\2\2\2\u0084\u008d\5\6\4\2\u0085\u008d\5\b\5\2\u0086\u008d"+
		"\5\26\f\2\u0087\u008d\5\30\r\2\u0088\u008d\5\32\16\2\u0089\u008d\5\34"+
		"\17\2\u008a\u008d\5\36\20\2\u008b\u008d\5(\25\2\u008c\u0084\3\2\2\2\u008c"+
		"\u0085\3\2\2\2\u008c\u0086\3\2\2\2\u008c\u0087\3\2\2\2\u008c\u0088\3\2"+
		"\2\2\u008c\u0089\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008b\3\2\2\2\u008d"+
		"\25\3\2\2\2\u008e\u008f\7\16\2\2\u008f\u0090\7;\2\2\u0090\u0091\5\n\6"+
		"\2\u0091\u0092\7<\2\2\u0092\u0096\7=\2\2\u0093\u0095\5\24\13\2\u0094\u0093"+
		"\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097"+
		"\u0099\3\2\2\2\u0098\u0096\3\2\2\2\u0099\u00a9\7>\2\2\u009a\u009b\7\r"+
		"\2\2\u009b\u009c\7;\2\2\u009c\u009d\5\n\6\2\u009d\u009e\7<\2\2\u009e\u00a2"+
		"\7=\2\2\u009f\u00a1\5\24\13\2\u00a0\u009f\3\2\2\2\u00a1\u00a4\3\2\2\2"+
		"\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a5\3\2\2\2\u00a4\u00a2"+
		"\3\2\2\2\u00a5\u00a6\7>\2\2\u00a6\u00a8\3\2\2\2\u00a7\u009a\3\2\2\2\u00a8"+
		"\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00b5\3\2"+
		"\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00ad\7\17\2\2\u00ad\u00b1\7=\2\2\u00ae"+
		"\u00b0\5\24\13\2\u00af\u00ae\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af\3"+
		"\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4"+
		"\u00b6\7>\2\2\u00b5\u00ac\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\27\3\2\2\2"+
		"\u00b7\u00b8\7\24\2\2\u00b8\u00bc\7;\2\2\u00b9\u00bb\5\n\6\2\u00ba\u00b9"+
		"\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd"+
		"\u00bf\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c3\78\2\2\u00c0\u00c2\5\n"+
		"\6\2\u00c1\u00c0\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3"+
		"\u00c4\3\2\2\2\u00c4\u00c6\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00ca\78"+
		"\2\2\u00c7\u00c9\5\n\6\2\u00c8\u00c7\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca"+
		"\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cd\3\2\2\2\u00cc\u00ca\3\2"+
		"\2\2\u00cd\u00ce\7<\2\2\u00ce\u00d2\7=\2\2\u00cf\u00d1\5\24\13\2\u00d0"+
		"\u00cf\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2"+
		"\2\2\u00d3\u00d5\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d6\7>\2\2\u00d6"+
		"\31\3\2\2\2\u00d7\u00d8\7\25\2\2\u00d8\u00da\7;\2\2\u00d9\u00db\5\n\6"+
		"\2\u00da\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd"+
		"\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00df\7<\2\2\u00df\u00e3\7=\2\2\u00e0"+
		"\u00e2\5\24\13\2\u00e1\u00e0\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3"+
		"\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e6\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6"+
		"\u00e7\7>\2\2\u00e7\33\3\2\2\2\u00e8\u00e9\7\23\2\2\u00e9\u00ea\78\2\2"+
		"\u00ea\35\3\2\2\2\u00eb\u00ec\7\22\2\2\u00ec\u00ed\78\2\2\u00ed\37\3\2"+
		"\2\2\u00ee\u00ef\5\4\3\2\u00ef\u00f6\7D\2\2\u00f0\u00f1\7\67\2\2\u00f1"+
		"\u00f2\5\4\3\2\u00f2\u00f3\7D\2\2\u00f3\u00f5\3\2\2\2\u00f4\u00f0\3\2"+
		"\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7"+
		"!\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9\u00fe\5\n\6\2\u00fa\u00fb\7\67\2\2"+
		"\u00fb\u00fd\5\n\6\2\u00fc\u00fa\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc"+
		"\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff#\3\2\2\2\u0100\u00fe\3\2\2\2\u0101"+
		"\u0103\7\30\2\2\u0102\u0104\5\n\6\2\u0103\u0102\3\2\2\2\u0103\u0104\3"+
		"\2\2\2\u0104\u0105\3\2\2\2\u0105\u0106\78\2\2\u0106%\3\2\2\2\u0107\u0108"+
		"\5\4\3\2\u0108\u0109\7D\2\2\u0109\u010b\7;\2\2\u010a\u010c\5 \21\2\u010b"+
		"\u010a\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010e\7<"+
		"\2\2\u010e\u010f\78\2\2\u010f\u0122\3\2\2\2\u0110\u0111\5\4\3\2\u0111"+
		"\u0112\7D\2\2\u0112\u0114\7;\2\2\u0113\u0115\5 \21\2\u0114\u0113\3\2\2"+
		"\2\u0114\u0115\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0117\7<\2\2\u0117\u011b"+
		"\7=\2\2\u0118\u011a\5\24\13\2\u0119\u0118\3\2\2\2\u011a\u011d\3\2\2\2"+
		"\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011e\3\2\2\2\u011d\u011b"+
		"\3\2\2\2\u011e\u011f\5$\23\2\u011f\u0120\7>\2\2\u0120\u0122\3\2\2\2\u0121"+
		"\u0107\3\2\2\2\u0121\u0110\3\2\2\2\u0122\'\3\2\2\2\u0123\u0124\7D\2\2"+
		"\u0124\u0126\7;\2\2\u0125\u0127\5\"\22\2\u0126\u0125\3\2\2\2\u0126\u0127"+
		"\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0129\7<\2\2\u0129\u012a\78\2\2\u012a"+
		")\3\2\2\2\u012b\u012d\t\4\2\2\u012c\u012b\3\2\2\2\u012c\u012d\3\2\2\2"+
		"\u012d\u012e\3\2\2\2\u012e\u012f\7\4\2\2\u012f\u0131\7;\2\2\u0130\u0132"+
		"\5 \21\2\u0131\u0130\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0133\3\2\2\2\u0133"+
		"\u0134\7<\2\2\u0134\u0138\7=\2\2\u0135\u0137\5\24\13\2\u0136\u0135\3\2"+
		"\2\2\u0137\u013a\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139"+
		"\u013b\3\2\2\2\u013a\u0138\3\2\2\2\u013b\u013c\5$\23\2\u013c\u013d\7>"+
		"\2\2\u013d+\3\2\2\2%\639@KZ\\dlnvx\u0082\u008c\u0096\u00a2\u00a9\u00b1"+
		"\u00b5\u00bc\u00c3\u00ca\u00d2\u00dc\u00e3\u00f6\u00fe\u0103\u010b\u0114"+
		"\u011b\u0121\u0126\u012c\u0131\u0138";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}