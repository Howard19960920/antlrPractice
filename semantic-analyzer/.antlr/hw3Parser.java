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
		RULE_vartypes = 0, RULE_vardeclarations = 1, RULE_entryPoint = 2, RULE_varassignments = 3, 
		RULE_expressions = 4, RULE_operations = 5, RULE_addexprs = 6, RULE_mulexprs = 7, 
		RULE_atomexprs = 8, RULE_codelines = 9, RULE_ifconditions = 10, RULE_forloops = 11, 
		RULE_whileloops = 12, RULE_continues = 13, RULE_breaks = 14, RULE_parameters = 15, 
		RULE_argvs = 16, RULE_retvals = 17, RULE_subfunctions = 18, RULE_callfunctions = 19, 
		RULE_mainfunction = 20;
	public static final String[] ruleNames = {
		"vartypes", "vardeclarations", "entryPoint", "varassignments", "expressions", 
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
	public static class VartypesContext extends ParserRuleContext {
		public int attr_type;
		public TerminalNode INT() { return getToken(hw3Parser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(hw3Parser.FLOAT, 0); }
		public TerminalNode CHAR() { return getToken(hw3Parser.CHAR, 0); }
		public TerminalNode VOID() { return getToken(hw3Parser.VOID, 0); }
		public TerminalNode SHORT() { return getToken(hw3Parser.SHORT, 0); }
		public TerminalNode LONGLONG() { return getToken(hw3Parser.LONGLONG, 0); }
		public TerminalNode DOUBLE() { return getToken(hw3Parser.DOUBLE, 0); }
		public TerminalNode STRUCT() { return getToken(hw3Parser.STRUCT, 0); }
		public VartypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vartypes; }
	}

	public final VartypesContext vartypes() throws RecognitionException {
		VartypesContext _localctx = new VartypesContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_vartypes);
		try {
			setState(60);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				match(INT);
				 if (TRACEON) System.out.println("type: INT");  ((VartypesContext)_localctx).attr_type =  1; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				match(FLOAT);
				 if (TRACEON) System.out.println("type: FLOAT");  ((VartypesContext)_localctx).attr_type =  2; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(46);
				match(CHAR);
				 if (TRACEON) System.out.println("type: CHAR");  ((VartypesContext)_localctx).attr_type =  3; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(48);
				match(VOID);
				 if (TRACEON) System.out.println("type: VOID");  ((VartypesContext)_localctx).attr_type =  4; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(50);
				match(SHORT);
				 if (TRACEON) System.out.println("type: SHORT");  ((VartypesContext)_localctx).attr_type =  5; 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(52);
				match(LONGLONG);
				 if (TRACEON) System.out.println("type: LONGLONG");  ((VartypesContext)_localctx).attr_type =  6; 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(54);
				match(FLOAT);
				 if (TRACEON) System.out.println("type: FLOAT");  ((VartypesContext)_localctx).attr_type =  7; 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(56);
				match(DOUBLE);
				 if (TRACEON) System.out.println("type: DOUBLE");  ((VartypesContext)_localctx).attr_type =  8; 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(58);
				match(STRUCT);
				 if (TRACEON) System.out.println("type: STRUCT");  ((VartypesContext)_localctx).attr_type =  9; 
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

	public static class VardeclarationsContext extends ParserRuleContext {
		public int attr_type;
		public VartypesContext vartypes;
		public Token a;
		public Token b;
		public VartypesContext vartypes() {
			return getRuleContext(VartypesContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(hw3Parser.SEMI, 0); }
		public List<TerminalNode> ID() { return getTokens(hw3Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(hw3Parser.ID, i);
		}
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
		enterRule(_localctx, 2, RULE_vardeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			((VardeclarationsContext)_localctx).vartypes = vartypes();
			setState(63);
			((VardeclarationsContext)_localctx).a = match(ID);
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(64);
				match(COMMA);
				setState(65);
				((VardeclarationsContext)_localctx).b = match(ID);
				}
				}
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(71);
			match(SEMI);

				   if (symtab.containsKey((((VardeclarationsContext)_localctx).a!=null?((VardeclarationsContext)_localctx).a.getText():null))) {
				       System.out.println("Type Error: " + 
							                    ((VardeclarationsContext)_localctx).a.getLine() + 
										              ": Redeclared identifier " + (((VardeclarationsContext)_localctx).a!=null?((VardeclarationsContext)_localctx).a.getText():null) + ".");
				   }
			     else {
			           symtab.put((((VardeclarationsContext)_localctx).a!=null?((VardeclarationsContext)_localctx).a.getText():null), ((VardeclarationsContext)_localctx).vartypes.attr_type);
				   }
				   
				   if ((((VardeclarationsContext)_localctx).b!=null?((VardeclarationsContext)_localctx).b.getText():null) != null){
						if (symtab.containsKey((((VardeclarationsContext)_localctx).b!=null?((VardeclarationsContext)_localctx).b.getText():null))) {
						    System.out.println("Type Error: " + 
											              ((VardeclarationsContext)_localctx).b.getLine() + 
											              ": Redeclared identifier " + (((VardeclarationsContext)_localctx).b!=null?((VardeclarationsContext)_localctx).b.getText():null) );
						}
			      else {
							symtab.put((((VardeclarationsContext)_localctx).b!=null?((VardeclarationsContext)_localctx).b.getText():null), ((VardeclarationsContext)_localctx).vartypes.attr_type);
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
		enterRule(_localctx, 4, RULE_entryPoint);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INCLUDE) {
				{
				{
				setState(74);
				match(INCLUDE);
				setState(75);
				match(LT);
				setState(76);
				match(ID);
				setState(77);
				match(T__0);
				setState(78);
				match(GT);
				}
				}
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(87);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(84);
					subfunctions();
					}
					} 
				}
				setState(89);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(90);
			mainfunction();
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << CHAR) | (1L << VOID) | (1L << SHORT) | (1L << LONGLONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << STRUCT))) != 0)) {
				{
				{
				setState(91);
				subfunctions();
				}
				}
				setState(96);
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
			setState(97);
			match(ID);
			setState(98);
			match(ASSIGN);
			setState(99);
			expressions();
			setState(100);
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
			setState(102);
			operations();
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LGAND || _la==LGOR) {
				{
				setState(107);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LGAND:
					{
					setState(103);
					match(LGAND);
					setState(104);
					operations();
					}
					break;
				case LGOR:
					{
					setState(105);
					match(LGOR);
					setState(106);
					operations();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(111);
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
			setState(112);
			addexprs();
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << LTEQ) | (1L << GTEQ) | (1L << NEQ) | (1L << PLUSEQ) | (1L << MINUSEQ) | (1L << TIMEEQ) | (1L << DIVIDEEQ) | (1L << NGT) | (1L << NLT) | (1L << GT) | (1L << LT) | (1L << ASSIGN))) != 0)) {
				{
				{
				setState(113);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << LTEQ) | (1L << GTEQ) | (1L << NEQ) | (1L << PLUSEQ) | (1L << MINUSEQ) | (1L << TIMEEQ) | (1L << DIVIDEEQ) | (1L << NGT) | (1L << NLT) | (1L << GT) | (1L << LT) | (1L << ASSIGN))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(114);
				addexprs();
				}
				}
				setState(119);
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
			setState(120);
			mulexprs();
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MINUS || _la==PLUS) {
				{
				setState(125);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS:
					{
					setState(121);
					match(PLUS);
					setState(122);
					mulexprs();
					}
					break;
				case MINUS:
					{
					setState(123);
					match(MINUS);
					setState(124);
					mulexprs();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(129);
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
			setState(130);
			atomexprs();
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TIME || _la==DIVIDE) {
				{
				setState(135);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TIME:
					{
					setState(131);
					match(TIME);
					setState(132);
					atomexprs();
					}
					break;
				case DIVIDE:
					{
					setState(133);
					match(DIVIDE);
					setState(134);
					atomexprs();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(139);
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
			setState(147);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				match(ID);
				}
				break;
			case DEC_NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				match(DEC_NUM);
				}
				break;
			case FLOAT_NUM:
				enterOuterAlt(_localctx, 3);
				{
				setState(142);
				match(FLOAT_NUM);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 4);
				{
				setState(143);
				match(LPAREN);
				setState(144);
				expressions();
				setState(145);
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
		public CallfunctionsContext callfunctions() {
			return getRuleContext(CallfunctionsContext.class,0);
		}
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
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
		public CodelinesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codelines; }
	}

	public final CodelinesContext codelines() throws RecognitionException {
		CodelinesContext _localctx = new CodelinesContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_codelines);
		try {
			setState(158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				vardeclarations();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				varassignments();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(151);
				callfunctions();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(152);
				expressions();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(153);
				ifconditions();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(154);
				forloops();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(155);
				whileloops();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(156);
				continues();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(157);
				breaks();
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
			setState(160);
			match(IF);
			setState(161);
			match(LPAREN);
			setState(162);
			expressions();
			setState(163);
			match(RPAREN);
			setState(164);
			match(LBRACE);
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << CHAR) | (1L << VOID) | (1L << SHORT) | (1L << LONGLONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << STRUCT) | (1L << IF) | (1L << BREAK) | (1L << CONTINUE) | (1L << FOR) | (1L << WHILE) | (1L << LPAREN))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (DEC_NUM - 65)) | (1L << (ID - 65)) | (1L << (FLOAT_NUM - 65)))) != 0)) {
				{
				{
				setState(165);
				codelines();
				}
				}
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(171);
			match(RBRACE);
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSEIF) {
				{
				{
				setState(172);
				match(ELSEIF);
				setState(173);
				match(LPAREN);
				setState(174);
				expressions();
				setState(175);
				match(RPAREN);
				setState(176);
				match(LBRACE);
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << CHAR) | (1L << VOID) | (1L << SHORT) | (1L << LONGLONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << STRUCT) | (1L << IF) | (1L << BREAK) | (1L << CONTINUE) | (1L << FOR) | (1L << WHILE) | (1L << LPAREN))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (DEC_NUM - 65)) | (1L << (ID - 65)) | (1L << (FLOAT_NUM - 65)))) != 0)) {
					{
					{
					setState(177);
					codelines();
					}
					}
					setState(182);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(183);
				match(RBRACE);
				}
				}
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(190);
				match(ELSE);
				setState(191);
				match(LBRACE);
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << CHAR) | (1L << VOID) | (1L << SHORT) | (1L << LONGLONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << STRUCT) | (1L << IF) | (1L << BREAK) | (1L << CONTINUE) | (1L << FOR) | (1L << WHILE) | (1L << LPAREN))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (DEC_NUM - 65)) | (1L << (ID - 65)) | (1L << (FLOAT_NUM - 65)))) != 0)) {
					{
					{
					setState(192);
					codelines();
					}
					}
					setState(197);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(198);
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
			setState(201);
			match(FOR);
			setState(202);
			match(LPAREN);
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & ((1L << (LPAREN - 57)) | (1L << (DEC_NUM - 57)) | (1L << (ID - 57)) | (1L << (FLOAT_NUM - 57)))) != 0)) {
				{
				{
				setState(203);
				expressions();
				}
				}
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(209);
			match(SEMI);
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & ((1L << (LPAREN - 57)) | (1L << (DEC_NUM - 57)) | (1L << (ID - 57)) | (1L << (FLOAT_NUM - 57)))) != 0)) {
				{
				{
				setState(210);
				expressions();
				}
				}
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(216);
			match(SEMI);
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & ((1L << (LPAREN - 57)) | (1L << (DEC_NUM - 57)) | (1L << (ID - 57)) | (1L << (FLOAT_NUM - 57)))) != 0)) {
				{
				{
				setState(217);
				expressions();
				}
				}
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(223);
			match(RPAREN);
			setState(224);
			match(LBRACE);
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << CHAR) | (1L << VOID) | (1L << SHORT) | (1L << LONGLONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << STRUCT) | (1L << IF) | (1L << BREAK) | (1L << CONTINUE) | (1L << FOR) | (1L << WHILE) | (1L << LPAREN))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (DEC_NUM - 65)) | (1L << (ID - 65)) | (1L << (FLOAT_NUM - 65)))) != 0)) {
				{
				{
				setState(225);
				codelines();
				}
				}
				setState(230);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(231);
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
			setState(233);
			match(WHILE);
			setState(234);
			match(LPAREN);
			setState(236); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(235);
				expressions();
				}
				}
				setState(238); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & ((1L << (LPAREN - 57)) | (1L << (DEC_NUM - 57)) | (1L << (ID - 57)) | (1L << (FLOAT_NUM - 57)))) != 0) );
			setState(240);
			match(RPAREN);
			setState(241);
			match(LBRACE);
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << CHAR) | (1L << VOID) | (1L << SHORT) | (1L << LONGLONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << STRUCT) | (1L << IF) | (1L << BREAK) | (1L << CONTINUE) | (1L << FOR) | (1L << WHILE) | (1L << LPAREN))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (DEC_NUM - 65)) | (1L << (ID - 65)) | (1L << (FLOAT_NUM - 65)))) != 0)) {
				{
				{
				setState(242);
				codelines();
				}
				}
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(248);
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
			setState(250);
			match(CONTINUE);
			setState(251);
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
			setState(253);
			match(BREAK);
			setState(254);
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
			setState(256);
			vartypes();
			setState(257);
			match(ID);
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(258);
				match(COMMA);
				setState(259);
				vartypes();
				setState(260);
				match(ID);
				}
				}
				setState(266);
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
			setState(267);
			expressions();
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(268);
				match(COMMA);
				setState(269);
				expressions();
				}
				}
				setState(274);
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
			setState(275);
			match(RETURN);
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & ((1L << (LPAREN - 57)) | (1L << (DEC_NUM - 57)) | (1L << (ID - 57)) | (1L << (FLOAT_NUM - 57)))) != 0)) {
				{
				setState(276);
				expressions();
				}
			}

			setState(279);
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
			setState(307);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(281);
				vartypes();
				setState(282);
				match(ID);
				setState(283);
				match(LPAREN);
				setState(285);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << CHAR) | (1L << VOID) | (1L << SHORT) | (1L << LONGLONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << STRUCT))) != 0)) {
					{
					setState(284);
					parameters();
					}
				}

				setState(287);
				match(RPAREN);
				setState(288);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(290);
				vartypes();
				setState(291);
				match(ID);
				setState(292);
				match(LPAREN);
				setState(294);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << CHAR) | (1L << VOID) | (1L << SHORT) | (1L << LONGLONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << STRUCT))) != 0)) {
					{
					setState(293);
					parameters();
					}
				}

				setState(296);
				match(RPAREN);
				setState(297);
				match(LBRACE);
				setState(301);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << CHAR) | (1L << VOID) | (1L << SHORT) | (1L << LONGLONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << STRUCT) | (1L << IF) | (1L << BREAK) | (1L << CONTINUE) | (1L << FOR) | (1L << WHILE) | (1L << LPAREN))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (DEC_NUM - 65)) | (1L << (ID - 65)) | (1L << (FLOAT_NUM - 65)))) != 0)) {
					{
					{
					setState(298);
					codelines();
					}
					}
					setState(303);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(304);
				retvals();
				setState(305);
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
			setState(309);
			match(ID);
			setState(310);
			match(LPAREN);
			setState(312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & ((1L << (LPAREN - 57)) | (1L << (DEC_NUM - 57)) | (1L << (ID - 57)) | (1L << (FLOAT_NUM - 57)))) != 0)) {
				{
				setState(311);
				argvs();
				}
			}

			setState(314);
			match(RPAREN);
			setState(315);
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
			setState(318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INT || _la==VOID) {
				{
				setState(317);
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

			setState(320);
			match(T__1);
			setState(321);
			match(LPAREN);
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << CHAR) | (1L << VOID) | (1L << SHORT) | (1L << LONGLONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << STRUCT))) != 0)) {
				{
				setState(322);
				parameters();
				}
			}

			setState(325);
			match(RPAREN);
			setState(326);
			match(LBRACE);
			setState(330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << CHAR) | (1L << VOID) | (1L << SHORT) | (1L << LONGLONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << STRUCT) | (1L << IF) | (1L << BREAK) | (1L << CONTINUE) | (1L << FOR) | (1L << WHILE) | (1L << LPAREN))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (DEC_NUM - 65)) | (1L << (ID - 65)) | (1L << (FLOAT_NUM - 65)))) != 0)) {
				{
				{
				setState(327);
				codelines();
				}
				}
				setState(332);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(333);
			retvals();
			setState(334);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3H\u0153\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2?\n\2\3\3\3\3\3\3\3\3\7"+
		"\3E\n\3\f\3\16\3H\13\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\7\4R\n\4\f\4\16"+
		"\4U\13\4\3\4\7\4X\n\4\f\4\16\4[\13\4\3\4\3\4\7\4_\n\4\f\4\16\4b\13\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\7\6n\n\6\f\6\16\6q\13\6\3\7\3\7"+
		"\3\7\7\7v\n\7\f\7\16\7y\13\7\3\b\3\b\3\b\3\b\3\b\7\b\u0080\n\b\f\b\16"+
		"\b\u0083\13\b\3\t\3\t\3\t\3\t\3\t\7\t\u008a\n\t\f\t\16\t\u008d\13\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0096\n\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\5\13\u00a1\n\13\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00a9\n\f"+
		"\f\f\16\f\u00ac\13\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00b5\n\f\f\f\16"+
		"\f\u00b8\13\f\3\f\3\f\7\f\u00bc\n\f\f\f\16\f\u00bf\13\f\3\f\3\f\3\f\7"+
		"\f\u00c4\n\f\f\f\16\f\u00c7\13\f\3\f\5\f\u00ca\n\f\3\r\3\r\3\r\7\r\u00cf"+
		"\n\r\f\r\16\r\u00d2\13\r\3\r\3\r\7\r\u00d6\n\r\f\r\16\r\u00d9\13\r\3\r"+
		"\3\r\7\r\u00dd\n\r\f\r\16\r\u00e0\13\r\3\r\3\r\3\r\7\r\u00e5\n\r\f\r\16"+
		"\r\u00e8\13\r\3\r\3\r\3\16\3\16\3\16\6\16\u00ef\n\16\r\16\16\16\u00f0"+
		"\3\16\3\16\3\16\7\16\u00f6\n\16\f\16\16\16\u00f9\13\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u0109\n\21"+
		"\f\21\16\21\u010c\13\21\3\22\3\22\3\22\7\22\u0111\n\22\f\22\16\22\u0114"+
		"\13\22\3\23\3\23\5\23\u0118\n\23\3\23\3\23\3\24\3\24\3\24\3\24\5\24\u0120"+
		"\n\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0129\n\24\3\24\3\24\3\24"+
		"\7\24\u012e\n\24\f\24\16\24\u0131\13\24\3\24\3\24\3\24\5\24\u0136\n\24"+
		"\3\25\3\25\3\25\5\25\u013b\n\25\3\25\3\25\3\25\3\26\5\26\u0141\n\26\3"+
		"\26\3\26\3\26\5\26\u0146\n\26\3\26\3\26\3\26\7\26\u014b\n\26\f\26\16\26"+
		"\u014e\13\26\3\26\3\26\3\26\3\26\2\2\27\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*\2\4\5\2\32\35$\')-\4\2\5\5\7\7\2\u0171\2>\3\2\2\2\4@"+
		"\3\2\2\2\6S\3\2\2\2\bc\3\2\2\2\nh\3\2\2\2\fr\3\2\2\2\16z\3\2\2\2\20\u0084"+
		"\3\2\2\2\22\u0095\3\2\2\2\24\u00a0\3\2\2\2\26\u00a2\3\2\2\2\30\u00cb\3"+
		"\2\2\2\32\u00eb\3\2\2\2\34\u00fc\3\2\2\2\36\u00ff\3\2\2\2 \u0102\3\2\2"+
		"\2\"\u010d\3\2\2\2$\u0115\3\2\2\2&\u0135\3\2\2\2(\u0137\3\2\2\2*\u0140"+
		"\3\2\2\2,-\7\5\2\2-?\b\2\1\2./\7\n\2\2/?\b\2\1\2\60\61\7\6\2\2\61?\b\2"+
		"\1\2\62\63\7\7\2\2\63?\b\2\1\2\64\65\7\b\2\2\65?\b\2\1\2\66\67\7\t\2\2"+
		"\67?\b\2\1\289\7\n\2\29?\b\2\1\2:;\7\13\2\2;?\b\2\1\2<=\7\f\2\2=?\b\2"+
		"\1\2>,\3\2\2\2>.\3\2\2\2>\60\3\2\2\2>\62\3\2\2\2>\64\3\2\2\2>\66\3\2\2"+
		"\2>8\3\2\2\2>:\3\2\2\2><\3\2\2\2?\3\3\2\2\2@A\5\2\2\2AF\7D\2\2BC\7\67"+
		"\2\2CE\7D\2\2DB\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2GI\3\2\2\2HF\3\2"+
		"\2\2IJ\78\2\2JK\b\3\1\2K\5\3\2\2\2LM\7\31\2\2MN\7,\2\2NO\7D\2\2OP\7\3"+
		"\2\2PR\7+\2\2QL\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2TY\3\2\2\2US\3\2"+
		"\2\2VX\5&\24\2WV\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\\\3\2\2\2[Y\3"+
		"\2\2\2\\`\5*\26\2]_\5&\24\2^]\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2a\7"+
		"\3\2\2\2b`\3\2\2\2cd\7D\2\2de\7-\2\2ef\5\n\6\2fg\78\2\2g\t\3\2\2\2ho\5"+
		"\f\7\2ij\7\63\2\2jn\5\f\7\2kl\7\64\2\2ln\5\f\7\2mi\3\2\2\2mk\3\2\2\2n"+
		"q\3\2\2\2om\3\2\2\2op\3\2\2\2p\13\3\2\2\2qo\3\2\2\2rw\5\16\b\2st\t\2\2"+
		"\2tv\5\16\b\2us\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2x\r\3\2\2\2yw\3\2"+
		"\2\2z\u0081\5\20\t\2{|\7/\2\2|\u0080\5\20\t\2}~\7.\2\2~\u0080\5\20\t\2"+
		"\177{\3\2\2\2\177}\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081"+
		"\u0082\3\2\2\2\u0082\17\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u008b\5\22\n"+
		"\2\u0085\u0086\7\60\2\2\u0086\u008a\5\22\n\2\u0087\u0088\7\61\2\2\u0088"+
		"\u008a\5\22\n\2\u0089\u0085\3\2\2\2\u0089\u0087\3\2\2\2\u008a\u008d\3"+
		"\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\21\3\2\2\2\u008d"+
		"\u008b\3\2\2\2\u008e\u0096\7D\2\2\u008f\u0096\7C\2\2\u0090\u0096\7E\2"+
		"\2\u0091\u0092\7;\2\2\u0092\u0093\5\n\6\2\u0093\u0094\7<\2\2\u0094\u0096"+
		"\3\2\2\2\u0095\u008e\3\2\2\2\u0095\u008f\3\2\2\2\u0095\u0090\3\2\2\2\u0095"+
		"\u0091\3\2\2\2\u0096\23\3\2\2\2\u0097\u00a1\5\4\3\2\u0098\u00a1\5\b\5"+
		"\2\u0099\u00a1\5(\25\2\u009a\u00a1\5\n\6\2\u009b\u00a1\5\26\f\2\u009c"+
		"\u00a1\5\30\r\2\u009d\u00a1\5\32\16\2\u009e\u00a1\5\34\17\2\u009f\u00a1"+
		"\5\36\20\2\u00a0\u0097\3\2\2\2\u00a0\u0098\3\2\2\2\u00a0\u0099\3\2\2\2"+
		"\u00a0\u009a\3\2\2\2\u00a0\u009b\3\2\2\2\u00a0\u009c\3\2\2\2\u00a0\u009d"+
		"\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u009f\3\2\2\2\u00a1\25\3\2\2\2\u00a2"+
		"\u00a3\7\16\2\2\u00a3\u00a4\7;\2\2\u00a4\u00a5\5\n\6\2\u00a5\u00a6\7<"+
		"\2\2\u00a6\u00aa\7=\2\2\u00a7\u00a9\5\24\13\2\u00a8\u00a7\3\2\2\2\u00a9"+
		"\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ad\3\2"+
		"\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00bd\7>\2\2\u00ae\u00af\7\r\2\2\u00af"+
		"\u00b0\7;\2\2\u00b0\u00b1\5\n\6\2\u00b1\u00b2\7<\2\2\u00b2\u00b6\7=\2"+
		"\2\u00b3\u00b5\5\24\13\2\u00b4\u00b3\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6"+
		"\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b9\3\2\2\2\u00b8\u00b6\3\2"+
		"\2\2\u00b9\u00ba\7>\2\2\u00ba\u00bc\3\2\2\2\u00bb\u00ae\3\2\2\2\u00bc"+
		"\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c9\3\2"+
		"\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c1\7\17\2\2\u00c1\u00c5\7=\2\2\u00c2"+
		"\u00c4\5\24\13\2\u00c3\u00c2\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3"+
		"\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c8\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8"+
		"\u00ca\7>\2\2\u00c9\u00c0\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\27\3\2\2\2"+
		"\u00cb\u00cc\7\24\2\2\u00cc\u00d0\7;\2\2\u00cd\u00cf\5\n\6\2\u00ce\u00cd"+
		"\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1"+
		"\u00d3\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00d7\78\2\2\u00d4\u00d6\5\n"+
		"\6\2\u00d5\u00d4\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7"+
		"\u00d8\3\2\2\2\u00d8\u00da\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da\u00de\78"+
		"\2\2\u00db\u00dd\5\n\6\2\u00dc\u00db\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de"+
		"\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e1\3\2\2\2\u00e0\u00de\3\2"+
		"\2\2\u00e1\u00e2\7<\2\2\u00e2\u00e6\7=\2\2\u00e3\u00e5\5\24\13\2\u00e4"+
		"\u00e3\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2"+
		"\2\2\u00e7\u00e9\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00ea\7>\2\2\u00ea"+
		"\31\3\2\2\2\u00eb\u00ec\7\25\2\2\u00ec\u00ee\7;\2\2\u00ed\u00ef\5\n\6"+
		"\2\u00ee\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1"+
		"\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\7<\2\2\u00f3\u00f7\7=\2\2\u00f4"+
		"\u00f6\5\24\13\2\u00f5\u00f4\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3"+
		"\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00fa\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa"+
		"\u00fb\7>\2\2\u00fb\33\3\2\2\2\u00fc\u00fd\7\23\2\2\u00fd\u00fe\78\2\2"+
		"\u00fe\35\3\2\2\2\u00ff\u0100\7\22\2\2\u0100\u0101\78\2\2\u0101\37\3\2"+
		"\2\2\u0102\u0103\5\2\2\2\u0103\u010a\7D\2\2\u0104\u0105\7\67\2\2\u0105"+
		"\u0106\5\2\2\2\u0106\u0107\7D\2\2\u0107\u0109\3\2\2\2\u0108\u0104\3\2"+
		"\2\2\u0109\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b"+
		"!\3\2\2\2\u010c\u010a\3\2\2\2\u010d\u0112\5\n\6\2\u010e\u010f\7\67\2\2"+
		"\u010f\u0111\5\n\6\2\u0110\u010e\3\2\2\2\u0111\u0114\3\2\2\2\u0112\u0110"+
		"\3\2\2\2\u0112\u0113\3\2\2\2\u0113#\3\2\2\2\u0114\u0112\3\2\2\2\u0115"+
		"\u0117\7\30\2\2\u0116\u0118\5\n\6\2\u0117\u0116\3\2\2\2\u0117\u0118\3"+
		"\2\2\2\u0118\u0119\3\2\2\2\u0119\u011a\78\2\2\u011a%\3\2\2\2\u011b\u011c"+
		"\5\2\2\2\u011c\u011d\7D\2\2\u011d\u011f\7;\2\2\u011e\u0120\5 \21\2\u011f"+
		"\u011e\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0122\7<"+
		"\2\2\u0122\u0123\78\2\2\u0123\u0136\3\2\2\2\u0124\u0125\5\2\2\2\u0125"+
		"\u0126\7D\2\2\u0126\u0128\7;\2\2\u0127\u0129\5 \21\2\u0128\u0127\3\2\2"+
		"\2\u0128\u0129\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012b\7<\2\2\u012b\u012f"+
		"\7=\2\2\u012c\u012e\5\24\13\2\u012d\u012c\3\2\2\2\u012e\u0131\3\2\2\2"+
		"\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0132\3\2\2\2\u0131\u012f"+
		"\3\2\2\2\u0132\u0133\5$\23\2\u0133\u0134\7>\2\2\u0134\u0136\3\2\2\2\u0135"+
		"\u011b\3\2\2\2\u0135\u0124\3\2\2\2\u0136\'\3\2\2\2\u0137\u0138\7D\2\2"+
		"\u0138\u013a\7;\2\2\u0139\u013b\5\"\22\2\u013a\u0139\3\2\2\2\u013a\u013b"+
		"\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013d\7<\2\2\u013d\u013e\78\2\2\u013e"+
		")\3\2\2\2\u013f\u0141\t\3\2\2\u0140\u013f\3\2\2\2\u0140\u0141\3\2\2\2"+
		"\u0141\u0142\3\2\2\2\u0142\u0143\7\4\2\2\u0143\u0145\7;\2\2\u0144\u0146"+
		"\5 \21\2\u0145\u0144\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0147\3\2\2\2\u0147"+
		"\u0148\7<\2\2\u0148\u014c\7=\2\2\u0149\u014b\5\24\13\2\u014a\u0149\3\2"+
		"\2\2\u014b\u014e\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d"+
		"\u014f\3\2\2\2\u014e\u014c\3\2\2\2\u014f\u0150\5$\23\2\u0150\u0151\7>"+
		"\2\2\u0151+\3\2\2\2&>FSY`mow\177\u0081\u0089\u008b\u0095\u00a0\u00aa\u00b6"+
		"\u00bd\u00c5\u00c9\u00d0\u00d7\u00de\u00e6\u00f0\u00f7\u010a\u0112\u0117"+
		"\u011f\u0128\u012f\u0135\u013a\u0140\u0145\u014c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}