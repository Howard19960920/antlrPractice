// Generated from /home/ecl/antlrPractice/semantic-analyzer/myChecker.g by ANTLR 4.7.1

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
public class myCheckerParser extends Parser {
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
	public String getGrammarFileName() { return "myChecker.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    boolean TRACEON = false;
	    HashMap<String,Integer> symtab = new HashMap<String,Integer>();

	      int attr_type;
	      /*attr_type:
	        1 => integer,
	        2 => float,
	        3 => char,
	        4 => void,
	        5 => short,
	        6 => longlong,
	        7 => double,
	        8 => struct,
	        -1 => doesn't exsit,
	        -2 => error detected
	      */

	public myCheckerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class EntryPointContext extends ParserRuleContext {
		public MainfunctionContext mainfunction() {
			return getRuleContext(MainfunctionContext.class,0);
		}
		public List<TerminalNode> INCLUDE() { return getTokens(myCheckerParser.INCLUDE); }
		public TerminalNode INCLUDE(int i) {
			return getToken(myCheckerParser.INCLUDE, i);
		}
		public List<TerminalNode> ID() { return getTokens(myCheckerParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(myCheckerParser.ID, i);
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
		public int attr_type;
		public TerminalNode INT() { return getToken(myCheckerParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(myCheckerParser.FLOAT, 0); }
		public TerminalNode CHAR() { return getToken(myCheckerParser.CHAR, 0); }
		public TerminalNode VOID() { return getToken(myCheckerParser.VOID, 0); }
		public TerminalNode SHORT() { return getToken(myCheckerParser.SHORT, 0); }
		public TerminalNode LONGLONG() { return getToken(myCheckerParser.LONGLONG, 0); }
		public TerminalNode DOUBLE() { return getToken(myCheckerParser.DOUBLE, 0); }
		public TerminalNode STRUCT() { return getToken(myCheckerParser.STRUCT, 0); }
		public VartypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vartypes; }
	}

	public final VartypesContext vartypes() throws RecognitionException {
		VartypesContext _localctx = new VartypesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_vartypes);
		try {
			setState(81);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				match(INT);
				 if (TRACEON) System.out.println("type: INT");  ((VartypesContext)_localctx).attr_type =  1; 
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				match(FLOAT);
				 if (TRACEON) System.out.println("type: FLOAT");  ((VartypesContext)_localctx).attr_type =  2; 
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(69);
				match(CHAR);
				 if (TRACEON) System.out.println("type: CHAR");  ((VartypesContext)_localctx).attr_type =  3; 
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 4);
				{
				setState(71);
				match(VOID);
				 if (TRACEON) System.out.println("type: VOID");  ((VartypesContext)_localctx).attr_type =  4; 
				}
				break;
			case SHORT:
				enterOuterAlt(_localctx, 5);
				{
				setState(73);
				match(SHORT);
				 if (TRACEON) System.out.println("type: SHORT");  ((VartypesContext)_localctx).attr_type =  5; 
				}
				break;
			case LONGLONG:
				enterOuterAlt(_localctx, 6);
				{
				setState(75);
				match(LONGLONG);
				 if (TRACEON) System.out.println("type: LONGLONG");  ((VartypesContext)_localctx).attr_type =  6; 
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 7);
				{
				setState(77);
				match(DOUBLE);
				 if (TRACEON) System.out.println("type: DOUBLE");  ((VartypesContext)_localctx).attr_type =  7; 
				}
				break;
			case STRUCT:
				enterOuterAlt(_localctx, 8);
				{
				setState(79);
				match(STRUCT);
				 if (TRACEON) System.out.println("type: STRUCT");  ((VartypesContext)_localctx).attr_type =  8; 
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

	public static class VardeclarationsContext extends ParserRuleContext {
		public int attr_type;
		public VartypesContext vartypes;
		public Token a;
		public Token b;
		public VartypesContext vartypes() {
			return getRuleContext(VartypesContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(myCheckerParser.SEMI, 0); }
		public List<TerminalNode> ID() { return getTokens(myCheckerParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(myCheckerParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(myCheckerParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(myCheckerParser.COMMA, i);
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
			setState(83);
			((VardeclarationsContext)_localctx).vartypes = vartypes();
			setState(84);
			((VardeclarationsContext)_localctx).a = match(ID);
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(85);
				match(COMMA);
				setState(86);
				((VardeclarationsContext)_localctx).b = match(ID);
				}
				}
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(92);
			match(SEMI);

				   if (symtab.containsKey((((VardeclarationsContext)_localctx).a!=null?((VardeclarationsContext)_localctx).a.getText():null))) 
			     {
				       System.out.println("Type Error: " + ((VardeclarationsContext)_localctx).a.getLine() + ": redeclared identifier " + (((VardeclarationsContext)_localctx).a!=null?((VardeclarationsContext)_localctx).a.getText():null));
				   }
			     else
			     {
			           symtab.put((((VardeclarationsContext)_localctx).a!=null?((VardeclarationsContext)_localctx).a.getText():null), ((VardeclarationsContext)_localctx).vartypes.attr_type);
				   }
				   
				   if ((((VardeclarationsContext)_localctx).b!=null?((VardeclarationsContext)_localctx).b.getText():null) != null)
			     {
						if (symtab.containsKey((((VardeclarationsContext)_localctx).b!=null?((VardeclarationsContext)_localctx).b.getText():null))) 
			      {
						    System.out.println("Type Error: " + ((VardeclarationsContext)_localctx).b.getLine() + ": redeclared identifier " + (((VardeclarationsContext)_localctx).b!=null?((VardeclarationsContext)_localctx).b.getText():null) );
						}
			      else 
			      {
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

	public static class VarassignmentsContext extends ParserRuleContext {
		public int attr_type;
		public Token ID;
		public ExpressionsContext expressions;
		public TerminalNode ID() { return getToken(myCheckerParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(myCheckerParser.ASSIGN, 0); }
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(myCheckerParser.SEMI, 0); }
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
			setState(95);
			((VarassignmentsContext)_localctx).ID = match(ID);
			setState(96);
			match(ASSIGN);
			setState(97);
			((VarassignmentsContext)_localctx).expressions = expressions();
			setState(98);
			match(SEMI);

			     // 檢查是否存在此 identifier
				   if (symtab.containsKey((((VarassignmentsContext)_localctx).ID!=null?((VarassignmentsContext)_localctx).ID.getText():null))) 
			     {
				       ((VarassignmentsContext)_localctx).attr_type =  symtab.get((((VarassignmentsContext)_localctx).ID!=null?((VarassignmentsContext)_localctx).ID.getText():null));
				   } 
			     
			     else 
			     {
						System.out.println("Type Error: " + ((VarassignmentsContext)_localctx).ID.getLine() + ": undeclared identifier " + (((VarassignmentsContext)_localctx).ID!=null?((VarassignmentsContext)_localctx).ID.getText():null) );
						((VarassignmentsContext)_localctx).attr_type =  -2;
						return _localctx.attr_type;
				   }

			     // 檢查兩者型態 (vartypes) 是否一致
				   if (symtab.get((((VarassignmentsContext)_localctx).ID!=null?((VarassignmentsContext)_localctx).ID.getText():null)) != ((VarassignmentsContext)_localctx).expressions.attr_type) 
			     {
						System.out.println("Type Error: " + (((VarassignmentsContext)_localctx).expressions!=null?(((VarassignmentsContext)_localctx).expressions.start):null).getLine() + ": types of leftside operand differs from the rightside operand");
						((VarassignmentsContext)_localctx).attr_type =  -2;
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

	public static class ExpressionsContext extends ParserRuleContext {
		public int attr_type;
		public OperationsContext a;
		public OperationsContext b;
		public List<OperationsContext> operations() {
			return getRuleContexts(OperationsContext.class);
		}
		public OperationsContext operations(int i) {
			return getRuleContext(OperationsContext.class,i);
		}
		public List<TerminalNode> LGAND() { return getTokens(myCheckerParser.LGAND); }
		public TerminalNode LGAND(int i) {
			return getToken(myCheckerParser.LGAND, i);
		}
		public List<TerminalNode> LGOR() { return getTokens(myCheckerParser.LGOR); }
		public TerminalNode LGOR(int i) {
			return getToken(myCheckerParser.LGOR, i);
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
			setState(101);
			((ExpressionsContext)_localctx).a = operations();
			((ExpressionsContext)_localctx).attr_type =  ((ExpressionsContext)_localctx).a.attr_type;
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
					((ExpressionsContext)_localctx).b = operations();
					}
					break;
				case LGOR:
					{
					setState(105);
					match(LGOR);
					setState(106);
					((ExpressionsContext)_localctx).b = operations();
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
		public int attr_type;
		public AddexprsContext a;
		public AddexprsContext b;
		public List<AddexprsContext> addexprs() {
			return getRuleContexts(AddexprsContext.class);
		}
		public AddexprsContext addexprs(int i) {
			return getRuleContext(AddexprsContext.class,i);
		}
		public List<TerminalNode> EQ() { return getTokens(myCheckerParser.EQ); }
		public TerminalNode EQ(int i) {
			return getToken(myCheckerParser.EQ, i);
		}
		public List<TerminalNode> NEQ() { return getTokens(myCheckerParser.NEQ); }
		public TerminalNode NEQ(int i) {
			return getToken(myCheckerParser.NEQ, i);
		}
		public List<TerminalNode> LT() { return getTokens(myCheckerParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(myCheckerParser.LT, i);
		}
		public List<TerminalNode> NLT() { return getTokens(myCheckerParser.NLT); }
		public TerminalNode NLT(int i) {
			return getToken(myCheckerParser.NLT, i);
		}
		public List<TerminalNode> GT() { return getTokens(myCheckerParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(myCheckerParser.GT, i);
		}
		public List<TerminalNode> NGT() { return getTokens(myCheckerParser.NGT); }
		public TerminalNode NGT(int i) {
			return getToken(myCheckerParser.NGT, i);
		}
		public List<TerminalNode> GTEQ() { return getTokens(myCheckerParser.GTEQ); }
		public TerminalNode GTEQ(int i) {
			return getToken(myCheckerParser.GTEQ, i);
		}
		public List<TerminalNode> LTEQ() { return getTokens(myCheckerParser.LTEQ); }
		public TerminalNode LTEQ(int i) {
			return getToken(myCheckerParser.LTEQ, i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(myCheckerParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(myCheckerParser.ASSIGN, i);
		}
		public List<TerminalNode> PLUSEQ() { return getTokens(myCheckerParser.PLUSEQ); }
		public TerminalNode PLUSEQ(int i) {
			return getToken(myCheckerParser.PLUSEQ, i);
		}
		public List<TerminalNode> MINUSEQ() { return getTokens(myCheckerParser.MINUSEQ); }
		public TerminalNode MINUSEQ(int i) {
			return getToken(myCheckerParser.MINUSEQ, i);
		}
		public List<TerminalNode> TIMEEQ() { return getTokens(myCheckerParser.TIMEEQ); }
		public TerminalNode TIMEEQ(int i) {
			return getToken(myCheckerParser.TIMEEQ, i);
		}
		public List<TerminalNode> DIVIDEEQ() { return getTokens(myCheckerParser.DIVIDEEQ); }
		public TerminalNode DIVIDEEQ(int i) {
			return getToken(myCheckerParser.DIVIDEEQ, i);
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
			((OperationsContext)_localctx).a = addexprs();
			 ((OperationsContext)_localctx).attr_type =  ((OperationsContext)_localctx).a.attr_type; 
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << LTEQ) | (1L << GTEQ) | (1L << NEQ) | (1L << PLUSEQ) | (1L << MINUSEQ) | (1L << TIMEEQ) | (1L << DIVIDEEQ) | (1L << NGT) | (1L << NLT) | (1L << GT) | (1L << LT) | (1L << ASSIGN))) != 0)) {
				{
				{
				setState(114);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << LTEQ) | (1L << GTEQ) | (1L << NEQ) | (1L << PLUSEQ) | (1L << MINUSEQ) | (1L << TIMEEQ) | (1L << DIVIDEEQ) | (1L << NGT) | (1L << NLT) | (1L << GT) | (1L << LT) | (1L << ASSIGN))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(115);
				((OperationsContext)_localctx).b = addexprs();
				 		
				      if (((OperationsContext)_localctx).a.attr_type != ((OperationsContext)_localctx).b.attr_type) {
				          System.out.println("Type Error: " + (((OperationsContext)_localctx).a!=null?(((OperationsContext)_localctx).a.start):null).getLine() + ": types of the operands in the compare-expressions are different");
				            ((OperationsContext)_localctx).attr_type =  -2;
				      }
				    
				}
				}
				setState(122);
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
		public int attr_type;
		public MulexprsContext a;
		public MulexprsContext b;
		public MulexprsContext c;
		public List<MulexprsContext> mulexprs() {
			return getRuleContexts(MulexprsContext.class);
		}
		public MulexprsContext mulexprs(int i) {
			return getRuleContext(MulexprsContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(myCheckerParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(myCheckerParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(myCheckerParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(myCheckerParser.MINUS, i);
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
			setState(123);
			((AddexprsContext)_localctx).a = mulexprs();
			 ((AddexprsContext)_localctx).attr_type =  ((AddexprsContext)_localctx).a.attr_type; 
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MINUS || _la==PLUS) {
				{
				setState(133);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS:
					{
					setState(125);
					match(PLUS);
					setState(126);
					((AddexprsContext)_localctx).b = mulexprs();
					 
					                if (((AddexprsContext)_localctx).a.attr_type != ((AddexprsContext)_localctx).b.attr_type) 
					                {
					                  System.out.println("Type Error: " + (((AddexprsContext)_localctx).a!=null?(((AddexprsContext)_localctx).a.start):null).getLine() + ": types of the operands in the addition-expressions are different");
					                  ((AddexprsContext)_localctx).attr_type =  -2;
					                }
					              
					}
					break;
				case MINUS:
					{
					setState(129);
					match(MINUS);
					setState(130);
					((AddexprsContext)_localctx).c = mulexprs();
					 
					                if (((AddexprsContext)_localctx).a.attr_type != ((AddexprsContext)_localctx).c.attr_type) {
					                  System.out.println("Type Error: " + (((AddexprsContext)_localctx).a!=null?(((AddexprsContext)_localctx).a.start):null).getLine() + ": types of the operands in the substract-expressions are different");
					                ((AddexprsContext)_localctx).attr_type =  -2;
					                }
					              
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(137);
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
		public int attr_type;
		public AtomexprsContext a;
		public AtomexprsContext b;
		public List<AtomexprsContext> atomexprs() {
			return getRuleContexts(AtomexprsContext.class);
		}
		public AtomexprsContext atomexprs(int i) {
			return getRuleContext(AtomexprsContext.class,i);
		}
		public List<TerminalNode> TIME() { return getTokens(myCheckerParser.TIME); }
		public TerminalNode TIME(int i) {
			return getToken(myCheckerParser.TIME, i);
		}
		public List<TerminalNode> DIVIDE() { return getTokens(myCheckerParser.DIVIDE); }
		public TerminalNode DIVIDE(int i) {
			return getToken(myCheckerParser.DIVIDE, i);
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
			setState(138);
			((MulexprsContext)_localctx).a = atomexprs();
			 ((MulexprsContext)_localctx).attr_type =  ((MulexprsContext)_localctx).a.attr_type; 
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TIME || _la==DIVIDE) {
				{
				{
				setState(140);
				_la = _input.LA(1);
				if ( !(_la==TIME || _la==DIVIDE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(141);
				((MulexprsContext)_localctx).b = atomexprs();
				 
				                              if (((MulexprsContext)_localctx).a.attr_type != ((MulexprsContext)_localctx).b.attr_type) 
				                              {
				                                System.out.println("Type Error: " + (((MulexprsContext)_localctx).a!=null?(((MulexprsContext)_localctx).a.start):null).getLine() + ": types of the operands in the (mul/div)-expressions are different");
				                                ((MulexprsContext)_localctx).attr_type =  -2;
				                              }
				                            
				}
				}
				setState(148);
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
		public int attr_type;
		public Token ID;
		public ExpressionsContext expressions;
		public TerminalNode ID() { return getToken(myCheckerParser.ID, 0); }
		public TerminalNode DEC_NUM() { return getToken(myCheckerParser.DEC_NUM, 0); }
		public TerminalNode FLOAT_NUM() { return getToken(myCheckerParser.FLOAT_NUM, 0); }
		public TerminalNode LPAREN() { return getToken(myCheckerParser.LPAREN, 0); }
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(myCheckerParser.RPAREN, 0); }
		public AtomexprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomexprs; }
	}

	public final AtomexprsContext atomexprs() throws RecognitionException {
		AtomexprsContext _localctx = new AtomexprsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_atomexprs);
		try {
			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				((AtomexprsContext)_localctx).ID = match(ID);

				      if (symtab.containsKey((((AtomexprsContext)_localctx).ID!=null?((AtomexprsContext)_localctx).ID.getText():null))) 
				      {
				          ((AtomexprsContext)_localctx).attr_type =  symtab.get((((AtomexprsContext)_localctx).ID!=null?((AtomexprsContext)_localctx).ID.getText():null));
				      } 
				      else 
				      {
				        System.out.println("Type Error: " + ((AtomexprsContext)_localctx).ID.getLine() + ": undeclared identifier " + (((AtomexprsContext)_localctx).ID!=null?((AtomexprsContext)_localctx).ID.getText():null));
				        ((AtomexprsContext)_localctx).attr_type =  -2;
				        // return _localctx.attr_type;
				      }
					 
				}
				break;
			case DEC_NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				match(DEC_NUM);
				 ((AtomexprsContext)_localctx).attr_type =  1; 
				}
				break;
			case FLOAT_NUM:
				enterOuterAlt(_localctx, 3);
				{
				setState(153);
				match(FLOAT_NUM);
				 ((AtomexprsContext)_localctx).attr_type =  2; 
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 4);
				{
				setState(155);
				match(LPAREN);
				setState(156);
				((AtomexprsContext)_localctx).expressions = expressions();
				setState(157);
				match(RPAREN);
				 ((AtomexprsContext)_localctx).attr_type =  ((AtomexprsContext)_localctx).expressions.attr_type; 
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
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				vardeclarations();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				varassignments();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(164);
				callfunctions();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(165);
				expressions();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(166);
				ifconditions();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(167);
				forloops();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(168);
				whileloops();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(169);
				continues();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(170);
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
		public TerminalNode IF() { return getToken(myCheckerParser.IF, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(myCheckerParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(myCheckerParser.LPAREN, i);
		}
		public List<ExpressionsContext> expressions() {
			return getRuleContexts(ExpressionsContext.class);
		}
		public ExpressionsContext expressions(int i) {
			return getRuleContext(ExpressionsContext.class,i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(myCheckerParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(myCheckerParser.RPAREN, i);
		}
		public List<TerminalNode> LBRACE() { return getTokens(myCheckerParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(myCheckerParser.LBRACE, i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(myCheckerParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(myCheckerParser.RBRACE, i);
		}
		public List<CodelinesContext> codelines() {
			return getRuleContexts(CodelinesContext.class);
		}
		public CodelinesContext codelines(int i) {
			return getRuleContext(CodelinesContext.class,i);
		}
		public List<TerminalNode> ELSEIF() { return getTokens(myCheckerParser.ELSEIF); }
		public TerminalNode ELSEIF(int i) {
			return getToken(myCheckerParser.ELSEIF, i);
		}
		public TerminalNode ELSE() { return getToken(myCheckerParser.ELSE, 0); }
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
			setState(173);
			match(IF);
			setState(174);
			match(LPAREN);
			setState(175);
			expressions();
			setState(176);
			match(RPAREN);
			setState(177);
			match(LBRACE);
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << CHAR) | (1L << VOID) | (1L << SHORT) | (1L << LONGLONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << STRUCT) | (1L << IF) | (1L << BREAK) | (1L << CONTINUE) | (1L << FOR) | (1L << WHILE) | (1L << LPAREN))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (DEC_NUM - 65)) | (1L << (ID - 65)) | (1L << (FLOAT_NUM - 65)))) != 0)) {
				{
				{
				setState(178);
				codelines();
				}
				}
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(184);
			match(RBRACE);
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSEIF) {
				{
				{
				setState(185);
				match(ELSEIF);
				setState(186);
				match(LPAREN);
				setState(187);
				expressions();
				setState(188);
				match(RPAREN);
				setState(189);
				match(LBRACE);
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << CHAR) | (1L << VOID) | (1L << SHORT) | (1L << LONGLONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << STRUCT) | (1L << IF) | (1L << BREAK) | (1L << CONTINUE) | (1L << FOR) | (1L << WHILE) | (1L << LPAREN))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (DEC_NUM - 65)) | (1L << (ID - 65)) | (1L << (FLOAT_NUM - 65)))) != 0)) {
					{
					{
					setState(190);
					codelines();
					}
					}
					setState(195);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(196);
				match(RBRACE);
				}
				}
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(203);
				match(ELSE);
				setState(204);
				match(LBRACE);
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << CHAR) | (1L << VOID) | (1L << SHORT) | (1L << LONGLONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << STRUCT) | (1L << IF) | (1L << BREAK) | (1L << CONTINUE) | (1L << FOR) | (1L << WHILE) | (1L << LPAREN))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (DEC_NUM - 65)) | (1L << (ID - 65)) | (1L << (FLOAT_NUM - 65)))) != 0)) {
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
		public TerminalNode FOR() { return getToken(myCheckerParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(myCheckerParser.LPAREN, 0); }
		public List<TerminalNode> SEMI() { return getTokens(myCheckerParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(myCheckerParser.SEMI, i);
		}
		public TerminalNode RPAREN() { return getToken(myCheckerParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(myCheckerParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(myCheckerParser.RBRACE, 0); }
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
			setState(214);
			match(FOR);
			setState(215);
			match(LPAREN);
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & ((1L << (LPAREN - 57)) | (1L << (DEC_NUM - 57)) | (1L << (ID - 57)) | (1L << (FLOAT_NUM - 57)))) != 0)) {
				{
				{
				setState(216);
				expressions();
				}
				}
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(222);
			match(SEMI);
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & ((1L << (LPAREN - 57)) | (1L << (DEC_NUM - 57)) | (1L << (ID - 57)) | (1L << (FLOAT_NUM - 57)))) != 0)) {
				{
				{
				setState(223);
				expressions();
				}
				}
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(229);
			match(SEMI);
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & ((1L << (LPAREN - 57)) | (1L << (DEC_NUM - 57)) | (1L << (ID - 57)) | (1L << (FLOAT_NUM - 57)))) != 0)) {
				{
				{
				setState(230);
				expressions();
				}
				}
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(236);
			match(RPAREN);
			setState(237);
			match(LBRACE);
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << CHAR) | (1L << VOID) | (1L << SHORT) | (1L << LONGLONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << STRUCT) | (1L << IF) | (1L << BREAK) | (1L << CONTINUE) | (1L << FOR) | (1L << WHILE) | (1L << LPAREN))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (DEC_NUM - 65)) | (1L << (ID - 65)) | (1L << (FLOAT_NUM - 65)))) != 0)) {
				{
				{
				setState(238);
				codelines();
				}
				}
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(244);
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
		public TerminalNode WHILE() { return getToken(myCheckerParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(myCheckerParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(myCheckerParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(myCheckerParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(myCheckerParser.RBRACE, 0); }
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
			setState(246);
			match(WHILE);
			setState(247);
			match(LPAREN);
			setState(249); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(248);
				expressions();
				}
				}
				setState(251); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & ((1L << (LPAREN - 57)) | (1L << (DEC_NUM - 57)) | (1L << (ID - 57)) | (1L << (FLOAT_NUM - 57)))) != 0) );
			setState(253);
			match(RPAREN);
			setState(254);
			match(LBRACE);
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << CHAR) | (1L << VOID) | (1L << SHORT) | (1L << LONGLONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << STRUCT) | (1L << IF) | (1L << BREAK) | (1L << CONTINUE) | (1L << FOR) | (1L << WHILE) | (1L << LPAREN))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (DEC_NUM - 65)) | (1L << (ID - 65)) | (1L << (FLOAT_NUM - 65)))) != 0)) {
				{
				{
				setState(255);
				codelines();
				}
				}
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(261);
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
		public TerminalNode CONTINUE() { return getToken(myCheckerParser.CONTINUE, 0); }
		public TerminalNode SEMI() { return getToken(myCheckerParser.SEMI, 0); }
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
			setState(263);
			match(CONTINUE);
			setState(264);
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
		public TerminalNode BREAK() { return getToken(myCheckerParser.BREAK, 0); }
		public TerminalNode SEMI() { return getToken(myCheckerParser.SEMI, 0); }
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
			setState(266);
			match(BREAK);
			setState(267);
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
		public List<TerminalNode> ID() { return getTokens(myCheckerParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(myCheckerParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(myCheckerParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(myCheckerParser.COMMA, i);
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
			setState(269);
			vartypes();
			setState(270);
			match(ID);
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(271);
				match(COMMA);
				setState(272);
				vartypes();
				setState(273);
				match(ID);
				}
				}
				setState(279);
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
		public List<TerminalNode> COMMA() { return getTokens(myCheckerParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(myCheckerParser.COMMA, i);
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
			setState(280);
			expressions();
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(281);
				match(COMMA);
				setState(282);
				expressions();
				}
				}
				setState(287);
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
		public TerminalNode RETURN() { return getToken(myCheckerParser.RETURN, 0); }
		public TerminalNode SEMI() { return getToken(myCheckerParser.SEMI, 0); }
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
			setState(288);
			match(RETURN);
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & ((1L << (LPAREN - 57)) | (1L << (DEC_NUM - 57)) | (1L << (ID - 57)) | (1L << (FLOAT_NUM - 57)))) != 0)) {
				{
				setState(289);
				expressions();
				}
			}

			setState(292);
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
		public TerminalNode ID() { return getToken(myCheckerParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(myCheckerParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(myCheckerParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(myCheckerParser.SEMI, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(myCheckerParser.LBRACE, 0); }
		public RetvalsContext retvals() {
			return getRuleContext(RetvalsContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(myCheckerParser.RBRACE, 0); }
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
			setState(320);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(294);
				vartypes();
				setState(295);
				match(ID);
				setState(296);
				match(LPAREN);
				setState(298);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << CHAR) | (1L << VOID) | (1L << SHORT) | (1L << LONGLONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << STRUCT))) != 0)) {
					{
					setState(297);
					parameters();
					}
				}

				setState(300);
				match(RPAREN);
				setState(301);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(303);
				vartypes();
				setState(304);
				match(ID);
				setState(305);
				match(LPAREN);
				setState(307);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << CHAR) | (1L << VOID) | (1L << SHORT) | (1L << LONGLONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << STRUCT))) != 0)) {
					{
					setState(306);
					parameters();
					}
				}

				setState(309);
				match(RPAREN);
				setState(310);
				match(LBRACE);
				setState(314);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << CHAR) | (1L << VOID) | (1L << SHORT) | (1L << LONGLONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << STRUCT) | (1L << IF) | (1L << BREAK) | (1L << CONTINUE) | (1L << FOR) | (1L << WHILE) | (1L << LPAREN))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (DEC_NUM - 65)) | (1L << (ID - 65)) | (1L << (FLOAT_NUM - 65)))) != 0)) {
					{
					{
					setState(311);
					codelines();
					}
					}
					setState(316);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(317);
				retvals();
				setState(318);
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
		public TerminalNode ID() { return getToken(myCheckerParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(myCheckerParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(myCheckerParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(myCheckerParser.SEMI, 0); }
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
			setState(322);
			match(ID);
			setState(323);
			match(LPAREN);
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & ((1L << (LPAREN - 57)) | (1L << (DEC_NUM - 57)) | (1L << (ID - 57)) | (1L << (FLOAT_NUM - 57)))) != 0)) {
				{
				setState(324);
				argvs();
				}
			}

			setState(327);
			match(RPAREN);
			setState(328);
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
		public TerminalNode LPAREN() { return getToken(myCheckerParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(myCheckerParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(myCheckerParser.LBRACE, 0); }
		public RetvalsContext retvals() {
			return getRuleContext(RetvalsContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(myCheckerParser.RBRACE, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public List<CodelinesContext> codelines() {
			return getRuleContexts(CodelinesContext.class);
		}
		public CodelinesContext codelines(int i) {
			return getRuleContext(CodelinesContext.class,i);
		}
		public TerminalNode INT() { return getToken(myCheckerParser.INT, 0); }
		public TerminalNode VOID() { return getToken(myCheckerParser.VOID, 0); }
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
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INT || _la==VOID) {
				{
				setState(330);
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

			setState(333);
			match(T__1);
			setState(334);
			match(LPAREN);
			setState(336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << CHAR) | (1L << VOID) | (1L << SHORT) | (1L << LONGLONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << STRUCT))) != 0)) {
				{
				setState(335);
				parameters();
				}
			}

			setState(338);
			match(RPAREN);
			setState(339);
			match(LBRACE);
			setState(343);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << CHAR) | (1L << VOID) | (1L << SHORT) | (1L << LONGLONG) | (1L << FLOAT) | (1L << DOUBLE) | (1L << STRUCT) | (1L << IF) | (1L << BREAK) | (1L << CONTINUE) | (1L << FOR) | (1L << WHILE) | (1L << LPAREN))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (DEC_NUM - 65)) | (1L << (ID - 65)) | (1L << (FLOAT_NUM - 65)))) != 0)) {
				{
				{
				setState(340);
				codelines();
				}
				}
				setState(345);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(346);
			retvals();
			setState(347);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3H\u0160\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\3\2\7\2\62\n"+
		"\2\f\2\16\2\65\13\2\3\2\7\28\n\2\f\2\16\2;\13\2\3\2\3\2\7\2?\n\2\f\2\16"+
		"\2B\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\5\3T\n\3\3\4\3\4\3\4\3\4\7\4Z\n\4\f\4\16\4]\13\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\7\6n\n\6\f\6\16\6q\13\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\7\7y\n\7\f\7\16\7|\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\7\b\u0088\n\b\f\b\16\b\u008b\13\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\7\t\u0093\n\t\f\t\16\t\u0096\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\5\n\u00a3\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\5\13\u00ae\n\13\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00b6\n\f\f\f\16\f\u00b9"+
		"\13\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00c2\n\f\f\f\16\f\u00c5\13\f\3"+
		"\f\3\f\7\f\u00c9\n\f\f\f\16\f\u00cc\13\f\3\f\3\f\3\f\7\f\u00d1\n\f\f\f"+
		"\16\f\u00d4\13\f\3\f\5\f\u00d7\n\f\3\r\3\r\3\r\7\r\u00dc\n\r\f\r\16\r"+
		"\u00df\13\r\3\r\3\r\7\r\u00e3\n\r\f\r\16\r\u00e6\13\r\3\r\3\r\7\r\u00ea"+
		"\n\r\f\r\16\r\u00ed\13\r\3\r\3\r\3\r\7\r\u00f2\n\r\f\r\16\r\u00f5\13\r"+
		"\3\r\3\r\3\16\3\16\3\16\6\16\u00fc\n\16\r\16\16\16\u00fd\3\16\3\16\3\16"+
		"\7\16\u0103\n\16\f\16\16\16\u0106\13\16\3\16\3\16\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u0116\n\21\f\21\16\21\u0119"+
		"\13\21\3\22\3\22\3\22\7\22\u011e\n\22\f\22\16\22\u0121\13\22\3\23\3\23"+
		"\5\23\u0125\n\23\3\23\3\23\3\24\3\24\3\24\3\24\5\24\u012d\n\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\5\24\u0136\n\24\3\24\3\24\3\24\7\24\u013b"+
		"\n\24\f\24\16\24\u013e\13\24\3\24\3\24\3\24\5\24\u0143\n\24\3\25\3\25"+
		"\3\25\5\25\u0148\n\25\3\25\3\25\3\25\3\26\5\26\u014e\n\26\3\26\3\26\3"+
		"\26\5\26\u0153\n\26\3\26\3\26\3\26\7\26\u0158\n\26\f\26\16\26\u015b\13"+
		"\26\3\26\3\26\3\26\3\26\2\2\27\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*\2\5\5\2\32\35$\')-\3\2\60\61\4\2\5\5\7\7\2\u017c\2\63\3\2\2\2"+
		"\4S\3\2\2\2\6U\3\2\2\2\ba\3\2\2\2\ng\3\2\2\2\fr\3\2\2\2\16}\3\2\2\2\20"+
		"\u008c\3\2\2\2\22\u00a2\3\2\2\2\24\u00ad\3\2\2\2\26\u00af\3\2\2\2\30\u00d8"+
		"\3\2\2\2\32\u00f8\3\2\2\2\34\u0109\3\2\2\2\36\u010c\3\2\2\2 \u010f\3\2"+
		"\2\2\"\u011a\3\2\2\2$\u0122\3\2\2\2&\u0142\3\2\2\2(\u0144\3\2\2\2*\u014d"+
		"\3\2\2\2,-\7\31\2\2-.\7,\2\2./\7D\2\2/\60\7\3\2\2\60\62\7+\2\2\61,\3\2"+
		"\2\2\62\65\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\649\3\2\2\2\65\63\3\2\2"+
		"\2\668\5&\24\2\67\66\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:<\3\2\2\2"+
		";9\3\2\2\2<@\5*\26\2=?\5&\24\2>=\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2"+
		"A\3\3\2\2\2B@\3\2\2\2CD\7\5\2\2DT\b\3\1\2EF\7\n\2\2FT\b\3\1\2GH\7\6\2"+
		"\2HT\b\3\1\2IJ\7\7\2\2JT\b\3\1\2KL\7\b\2\2LT\b\3\1\2MN\7\t\2\2NT\b\3\1"+
		"\2OP\7\13\2\2PT\b\3\1\2QR\7\f\2\2RT\b\3\1\2SC\3\2\2\2SE\3\2\2\2SG\3\2"+
		"\2\2SI\3\2\2\2SK\3\2\2\2SM\3\2\2\2SO\3\2\2\2SQ\3\2\2\2T\5\3\2\2\2UV\5"+
		"\4\3\2V[\7D\2\2WX\7\67\2\2XZ\7D\2\2YW\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3"+
		"\2\2\2\\^\3\2\2\2][\3\2\2\2^_\78\2\2_`\b\4\1\2`\7\3\2\2\2ab\7D\2\2bc\7"+
		"-\2\2cd\5\n\6\2de\78\2\2ef\b\5\1\2f\t\3\2\2\2gh\5\f\7\2ho\b\6\1\2ij\7"+
		"\63\2\2jn\5\f\7\2kl\7\64\2\2ln\5\f\7\2mi\3\2\2\2mk\3\2\2\2nq\3\2\2\2o"+
		"m\3\2\2\2op\3\2\2\2p\13\3\2\2\2qo\3\2\2\2rs\5\16\b\2sz\b\7\1\2tu\t\2\2"+
		"\2uv\5\16\b\2vw\b\7\1\2wy\3\2\2\2xt\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2"+
		"\2\2{\r\3\2\2\2|z\3\2\2\2}~\5\20\t\2~\u0089\b\b\1\2\177\u0080\7/\2\2\u0080"+
		"\u0081\5\20\t\2\u0081\u0082\b\b\1\2\u0082\u0088\3\2\2\2\u0083\u0084\7"+
		".\2\2\u0084\u0085\5\20\t\2\u0085\u0086\b\b\1\2\u0086\u0088\3\2\2\2\u0087"+
		"\177\3\2\2\2\u0087\u0083\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2\2"+
		"\2\u0089\u008a\3\2\2\2\u008a\17\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u008d"+
		"\5\22\n\2\u008d\u0094\b\t\1\2\u008e\u008f\t\3\2\2\u008f\u0090\5\22\n\2"+
		"\u0090\u0091\b\t\1\2\u0091\u0093\3\2\2\2\u0092\u008e\3\2\2\2\u0093\u0096"+
		"\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\21\3\2\2\2\u0096"+
		"\u0094\3\2\2\2\u0097\u0098\7D\2\2\u0098\u00a3\b\n\1\2\u0099\u009a\7C\2"+
		"\2\u009a\u00a3\b\n\1\2\u009b\u009c\7E\2\2\u009c\u00a3\b\n\1\2\u009d\u009e"+
		"\7;\2\2\u009e\u009f\5\n\6\2\u009f\u00a0\7<\2\2\u00a0\u00a1\b\n\1\2\u00a1"+
		"\u00a3\3\2\2\2\u00a2\u0097\3\2\2\2\u00a2\u0099\3\2\2\2\u00a2\u009b\3\2"+
		"\2\2\u00a2\u009d\3\2\2\2\u00a3\23\3\2\2\2\u00a4\u00ae\5\6\4\2\u00a5\u00ae"+
		"\5\b\5\2\u00a6\u00ae\5(\25\2\u00a7\u00ae\5\n\6\2\u00a8\u00ae\5\26\f\2"+
		"\u00a9\u00ae\5\30\r\2\u00aa\u00ae\5\32\16\2\u00ab\u00ae\5\34\17\2\u00ac"+
		"\u00ae\5\36\20\2\u00ad\u00a4\3\2\2\2\u00ad\u00a5\3\2\2\2\u00ad\u00a6\3"+
		"\2\2\2\u00ad\u00a7\3\2\2\2\u00ad\u00a8\3\2\2\2\u00ad\u00a9\3\2\2\2\u00ad"+
		"\u00aa\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ac\3\2\2\2\u00ae\25\3\2\2"+
		"\2\u00af\u00b0\7\16\2\2\u00b0\u00b1\7;\2\2\u00b1\u00b2\5\n\6\2\u00b2\u00b3"+
		"\7<\2\2\u00b3\u00b7\7=\2\2\u00b4\u00b6\5\24\13\2\u00b5\u00b4\3\2\2\2\u00b6"+
		"\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00ba\3\2"+
		"\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00ca\7>\2\2\u00bb\u00bc\7\r\2\2\u00bc"+
		"\u00bd\7;\2\2\u00bd\u00be\5\n\6\2\u00be\u00bf\7<\2\2\u00bf\u00c3\7=\2"+
		"\2\u00c0\u00c2\5\24\13\2\u00c1\u00c0\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3"+
		"\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c6\3\2\2\2\u00c5\u00c3\3\2"+
		"\2\2\u00c6\u00c7\7>\2\2\u00c7\u00c9\3\2\2\2\u00c8\u00bb\3\2\2\2\u00c9"+
		"\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00d6\3\2"+
		"\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00ce\7\17\2\2\u00ce\u00d2\7=\2\2\u00cf"+
		"\u00d1\5\24\13\2\u00d0\u00cf\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3"+
		"\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d5\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5"+
		"\u00d7\7>\2\2\u00d6\u00cd\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\27\3\2\2\2"+
		"\u00d8\u00d9\7\24\2\2\u00d9\u00dd\7;\2\2\u00da\u00dc\5\n\6\2\u00db\u00da"+
		"\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de"+
		"\u00e0\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0\u00e4\78\2\2\u00e1\u00e3\5\n"+
		"\6\2\u00e2\u00e1\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4"+
		"\u00e5\3\2\2\2\u00e5\u00e7\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00eb\78"+
		"\2\2\u00e8\u00ea\5\n\6\2\u00e9\u00e8\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb"+
		"\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ee\3\2\2\2\u00ed\u00eb\3\2"+
		"\2\2\u00ee\u00ef\7<\2\2\u00ef\u00f3\7=\2\2\u00f0\u00f2\5\24\13\2\u00f1"+
		"\u00f0\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2"+
		"\2\2\u00f4\u00f6\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f7\7>\2\2\u00f7"+
		"\31\3\2\2\2\u00f8\u00f9\7\25\2\2\u00f9\u00fb\7;\2\2\u00fa\u00fc\5\n\6"+
		"\2\u00fb\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe"+
		"\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0100\7<\2\2\u0100\u0104\7=\2\2\u0101"+
		"\u0103\5\24\13\2\u0102\u0101\3\2\2\2\u0103\u0106\3\2\2\2\u0104\u0102\3"+
		"\2\2\2\u0104\u0105\3\2\2\2\u0105\u0107\3\2\2\2\u0106\u0104\3\2\2\2\u0107"+
		"\u0108\7>\2\2\u0108\33\3\2\2\2\u0109\u010a\7\23\2\2\u010a\u010b\78\2\2"+
		"\u010b\35\3\2\2\2\u010c\u010d\7\22\2\2\u010d\u010e\78\2\2\u010e\37\3\2"+
		"\2\2\u010f\u0110\5\4\3\2\u0110\u0117\7D\2\2\u0111\u0112\7\67\2\2\u0112"+
		"\u0113\5\4\3\2\u0113\u0114\7D\2\2\u0114\u0116\3\2\2\2\u0115\u0111\3\2"+
		"\2\2\u0116\u0119\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118"+
		"!\3\2\2\2\u0119\u0117\3\2\2\2\u011a\u011f\5\n\6\2\u011b\u011c\7\67\2\2"+
		"\u011c\u011e\5\n\6\2\u011d\u011b\3\2\2\2\u011e\u0121\3\2\2\2\u011f\u011d"+
		"\3\2\2\2\u011f\u0120\3\2\2\2\u0120#\3\2\2\2\u0121\u011f\3\2\2\2\u0122"+
		"\u0124\7\30\2\2\u0123\u0125\5\n\6\2\u0124\u0123\3\2\2\2\u0124\u0125\3"+
		"\2\2\2\u0125\u0126\3\2\2\2\u0126\u0127\78\2\2\u0127%\3\2\2\2\u0128\u0129"+
		"\5\4\3\2\u0129\u012a\7D\2\2\u012a\u012c\7;\2\2\u012b\u012d\5 \21\2\u012c"+
		"\u012b\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012f\7<"+
		"\2\2\u012f\u0130\78\2\2\u0130\u0143\3\2\2\2\u0131\u0132\5\4\3\2\u0132"+
		"\u0133\7D\2\2\u0133\u0135\7;\2\2\u0134\u0136\5 \21\2\u0135\u0134\3\2\2"+
		"\2\u0135\u0136\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0138\7<\2\2\u0138\u013c"+
		"\7=\2\2\u0139\u013b\5\24\13\2\u013a\u0139\3\2\2\2\u013b\u013e\3\2\2\2"+
		"\u013c\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013f\3\2\2\2\u013e\u013c"+
		"\3\2\2\2\u013f\u0140\5$\23\2\u0140\u0141\7>\2\2\u0141\u0143\3\2\2\2\u0142"+
		"\u0128\3\2\2\2\u0142\u0131\3\2\2\2\u0143\'\3\2\2\2\u0144\u0145\7D\2\2"+
		"\u0145\u0147\7;\2\2\u0146\u0148\5\"\22\2\u0147\u0146\3\2\2\2\u0147\u0148"+
		"\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014a\7<\2\2\u014a\u014b\78\2\2\u014b"+
		")\3\2\2\2\u014c\u014e\t\4\2\2\u014d\u014c\3\2\2\2\u014d\u014e\3\2\2\2"+
		"\u014e\u014f\3\2\2\2\u014f\u0150\7\4\2\2\u0150\u0152\7;\2\2\u0151\u0153"+
		"\5 \21\2\u0152\u0151\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0154\3\2\2\2\u0154"+
		"\u0155\7<\2\2\u0155\u0159\7=\2\2\u0156\u0158\5\24\13\2\u0157\u0156\3\2"+
		"\2\2\u0158\u015b\3\2\2\2\u0159\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a"+
		"\u015c\3\2\2\2\u015b\u0159\3\2\2\2\u015c\u015d\5$\23\2\u015d\u015e\7>"+
		"\2\2\u015e+\3\2\2\2%\639@S[moz\u0087\u0089\u0094\u00a2\u00ad\u00b7\u00c3"+
		"\u00ca\u00d2\u00d6\u00dd\u00e4\u00eb\u00f3\u00fd\u0104\u0117\u011f\u0124"+
		"\u012c\u0135\u013c\u0142\u0147\u014d\u0152\u0159";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}