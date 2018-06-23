// Generated from /home/ecl/antlrPractice/code-generator/myCompiler.g by ANTLR 4.7.1

    // import packages here.
    import java.util.HashMap;

    // final edition here 
    import java.util.ArrayList;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class myCompilerParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, CHAR=2, VOID=3, SHORT=4, LONGLONG=5, FLOAT=6, DOUBLE=7, STRUCT=8, 
		ELSEIF=9, IF=10, ELSE=11, SWITCH=12, CASE=13, BREAK=14, CONTINUE=15, FOR=16, 
		WHILE=17, PRINT=18, SCANF=19, RETURN=20, INCLUDE=21, EQ=22, LTEQ=23, GTEQ=24, 
		NEQ=25, PP=26, MM=27, LSHIFT=28, RSHIFT=29, AND=30, OR=31, PLUSEQ=32, 
		MINUSEQ=33, TIMEEQ=34, DIVIDEEQ=35, MODEQ=36, NGT=37, NLT=38, GT=39, LT=40, 
		ASSIGN=41, MINUS=42, PLUS=43, TIME=44, DIVIDE=45, NOT=46, LGAND=47, LGOR=48, 
		MOD=49, DOT_=50, COMMA=51, SEMI=52, COLON=53, SHARP=54, LPAREN=55, RPAREN=56, 
		LBRACE=57, RBRACE=58, LSQUARE=59, RSQUARE=60, Identifier=61, Integer_constant=62, 
		Floating_point_constant=63, STRING_LITERAL=64, PREPROCESSOR=65, COMMENT1=66, 
		COMMENT2=67, WS=68;
	public static final int
		RULE_program = 0, RULE_functions = 1, RULE_function = 2, RULE_declarations = 3, 
		RULE_l_declarations = 4, RULE_type = 5, RULE_statements = 6, RULE_statement = 7, 
		RULE_arith_expression = 8, RULE_multExpr = 9, RULE_signExpr = 10, RULE_primaryExpr = 11, 
		RULE_if_then_statements = 12, RULE_printf_statement = 13;
	public static final String[] ruleNames = {
		"program", "functions", "function", "declarations", "l_declarations", 
		"type", "statements", "statement", "arith_expression", "multExpr", "signExpr", 
		"primaryExpr", "if_then_statements", "printf_statement"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'int'", "'char'", "'void'", "'short'", "'long long'", "'float'", 
		"'double'", "'struct'", "'else if'", "'if'", "'else'", "'switch'", "'case'", 
		"'break'", "'continue'", "'for'", "'while'", "'printf'", "'scanf'", "'return'", 
		"'#include'", "'=='", "'<='", "'>='", "'!='", "'++'", "'--'", "'<<'", 
		"'>>'", "'&&'", "'||'", "'+='", "'-='", "'*='", "'/='", "'%='", "'!>'", 
		"'!<'", "'>'", "'<'", "'='", "'-'", "'+'", "'*'", "'/'", "'!'", "'&'", 
		"'|'", "'%'", "'.'", "','", "';'", "':'", "'#'", "'('", "')'", "'{'", 
		"'}'", "'['", "']'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "INT", "CHAR", "VOID", "SHORT", "LONGLONG", "FLOAT", "DOUBLE", "STRUCT", 
		"ELSEIF", "IF", "ELSE", "SWITCH", "CASE", "BREAK", "CONTINUE", "FOR", 
		"WHILE", "PRINT", "SCANF", "RETURN", "INCLUDE", "EQ", "LTEQ", "GTEQ", 
		"NEQ", "PP", "MM", "LSHIFT", "RSHIFT", "AND", "OR", "PLUSEQ", "MINUSEQ", 
		"TIMEEQ", "DIVIDEEQ", "MODEQ", "NGT", "NLT", "GT", "LT", "ASSIGN", "MINUS", 
		"PLUS", "TIME", "DIVIDE", "NOT", "LGAND", "LGOR", "MOD", "DOT_", "COMMA", 
		"SEMI", "COLON", "SHARP", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LSQUARE", 
		"RSQUARE", "Identifier", "Integer_constant", "Floating_point_constant", 
		"STRING_LITERAL", "PREPROCESSOR", "COMMENT1", "COMMENT2", "WS"
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
	public String getGrammarFileName() { return "myCompiler.g"; }

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
	        -1 => doesn't exist,
	        -2 => error detected
	      */


	    // final edition here 以下參考自 sample code
	    HashMap<Integer,String> regMap = new HashMap<Integer,String>(); //

	    int labelCount = 0;

	    List<String> DataCode = new ArrayList<String>();
	    List<String> TextCode = new ArrayList<String>();
	 
	    public static register reg = new register(0, 9);
	    
	    /*
	     * Output prologue.
	     */
	    void prologue(String id)
	    {
	       TextCode.add("\n\n/* Text section */");
	       TextCode.add("\t.section .text");
	       TextCode.add("\t.global " + id);
	       TextCode.add("\t.type " + id + ",@function");
	       TextCode.add(id + ":");
	       
	       /* Follow x86 calling convention */
	       TextCode.add("\t pushq \%rbp");
	       TextCode.add("\t movq \%rsp,\%rbp");
	       TextCode.add("\t pushq \%rbx"); //callee saved registers.
	       TextCode.add("\t pushq \%r12"); //callee saved registers.
	       TextCode.add("\t pushq \%r13"); //callee saved registers.
	       TextCode.add("\t pushq \%r14"); //callee saved registers.
	       TextCode.add("\t pushq \%r15"); //callee saved registers.
	       TextCode.add("\t subq $8,\%rsp\n"); // aligned 16-byte boundary.
	    }
	    
	    /*
	     * Output epilogue.
	     */
	    void epilogue()
	    {
	       /* handle epilogue */
	       
	       /* Follow x86 calling convention */
	       TextCode.add("\n\t addq $8,\%rsp");
	       TextCode.add("\t popq \%r15");
	       TextCode.add("\t popq \%r14");
	       TextCode.add("\t popq \%r13");
	       TextCode.add("\t popq \%r12");
	       TextCode.add("\t popq \%rbx");
	       TextCode.add("\t popq \%rbp");
	       TextCode.add("\t ret");
	    }
	    
	    
	    /* Generate a new label */
	    String newLabel()
	    {
	       labelCount ++;
	       return (new String("L")) + Integer.toString(labelCount);
	    } 
	    
	    
	    public List<String> getDataCode()
	    {
	       return DataCode;
	    }
	    
	    public List<String> getTextCode()
	    {
	       return TextCode;
	    }
	    // 用來初始化 register 與 自訂 integer 之間的 mapping 關係
	    void initRegMappings()
	    {
	        regMap.put(0,"r14d");
	        regMap.put(1,"ebx");
	        regMap.put(2,"ecx");
	        regMap.put(3,"r15d");
	        regMap.put(4,"r8d");
	        regMap.put(5,"r9d");
	        regMap.put(6,"r10d");
	        regMap.put(7,"r11d");
	        regMap.put(8,"r12d");
	        regMap.put(9,"r13d");
	    }

	public myCompilerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public FunctionsContext functions() {
			return getRuleContext(FunctionsContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			initRegMappings();
			setState(29);
			declarations();
			setState(30);
			functions();
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

	public static class FunctionsContext extends ParserRuleContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public FunctionsContext functions() {
			return getRuleContext(FunctionsContext.class,0);
		}
		public FunctionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functions; }
	}

	public final FunctionsContext functions() throws RecognitionException {
		FunctionsContext _localctx = new FunctionsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_functions);
		try {
			setState(36);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case CHAR:
			case VOID:
			case SHORT:
			case LONGLONG:
			case FLOAT:
			case DOUBLE:
			case STRUCT:
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				function();
				setState(33);
				functions();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class FunctionContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(myCompilerParser.Identifier, 0); }
		public TerminalNode LPAREN() { return getToken(myCompilerParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(myCompilerParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(myCompilerParser.LBRACE, 0); }
		public L_declarationsContext l_declarations() {
			return getRuleContext(L_declarationsContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(myCompilerParser.RBRACE, 0); }
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			type();
			setState(39);
			match(Identifier);
			setState(40);
			match(LPAREN);
			setState(41);
			match(RPAREN);
			setState(42);
			match(LBRACE);

			         /* output function prologue */
			         prologue((((FunctionContext)_localctx).Identifier!=null?((FunctionContext)_localctx).Identifier.getText():null));
			      
			setState(44);
			l_declarations();
			setState(45);
			statements();
			setState(46);
			match(RBRACE);

			        if (TRACEON)
			        {
			            System.out.println("type Identifier () {declarations statements}");
			        }
			        /* output function epilogue */	  
			        epilogue();
				  
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

	public static class DeclarationsContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(myCompilerParser.Identifier, 0); }
		public TerminalNode SEMI() { return getToken(myCompilerParser.SEMI, 0); }
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public DeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations; }
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declarations);
		try {
			setState(56);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(49);
				type();
				setState(50);
				match(Identifier);
				setState(51);
				match(SEMI);
				setState(52);
				declarations();
				 
				            if (TRACEON) 
				            {
				                System.out.println("declarations: type Identifier : declarations");
				            }
				            // 檢查變數是否已經宣告過
				            if (symtab.containsKey((((DeclarationsContext)_localctx).Identifier!=null?((DeclarationsContext)_localctx).Identifier.getText():null))) 
				            {
				                System.out.println("Type Error: " + ((DeclarationsContext)_localctx).Identifier.getLine() + ": Redeclared identifier.");
				            } 
				            else 
				            {
				                /* Add ID and its attr_type into the symbol table. */
				                symtab.put((((DeclarationsContext)_localctx).Identifier!=null?((DeclarationsContext)_localctx).Identifier.getText():null), ((DeclarationsContext)_localctx).type.attr_type);	   
				            }
				            
				            /* code generation */
				            switch(((DeclarationsContext)_localctx).type.attr_type) 
				            {
				                case 1: /* Type: integer, size=> 4 bytes, alignment=> 4 byte boundary. */
				                        DataCode.add("\t .common " + (((DeclarationsContext)_localctx).Identifier!=null?((DeclarationsContext)_localctx).Identifier.getText():null) + ",4,4\n");
				                        break;
				                case 2: /* Type: float, size=> 4 bytes, alignment=> 4 byte boundary. */
				                        DataCode.add("\t .common " + (((DeclarationsContext)_localctx).Identifier!=null?((DeclarationsContext)_localctx).Identifier.getText():null) + ",4,4\n");
				                        break;
				                default:
				            }
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class L_declarationsContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(myCompilerParser.Identifier, 0); }
		public TerminalNode SEMI() { return getToken(myCompilerParser.SEMI, 0); }
		public L_declarationsContext l_declarations() {
			return getRuleContext(L_declarationsContext.class,0);
		}
		public L_declarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_l_declarations; }
	}

	public final L_declarationsContext l_declarations() throws RecognitionException {
		L_declarationsContext _localctx = new L_declarationsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_l_declarations);
		try {
			setState(65);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case CHAR:
			case VOID:
			case SHORT:
			case LONGLONG:
			case FLOAT:
			case DOUBLE:
			case STRUCT:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				type();
				setState(59);
				match(Identifier);
				setState(60);
				match(SEMI);
				setState(61);
				l_declarations();

				        /* If you want to handle local variables, fix it. */ 
				        
				}
				break;
			case IF:
			case PRINT:
			case RBRACE:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class TypeContext extends ParserRuleContext {
		public int attr_type;
		public TerminalNode INT() { return getToken(myCompilerParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(myCompilerParser.FLOAT, 0); }
		public TerminalNode CHAR() { return getToken(myCompilerParser.CHAR, 0); }
		public TerminalNode VOID() { return getToken(myCompilerParser.VOID, 0); }
		public TerminalNode SHORT() { return getToken(myCompilerParser.SHORT, 0); }
		public TerminalNode LONGLONG() { return getToken(myCompilerParser.LONGLONG, 0); }
		public TerminalNode DOUBLE() { return getToken(myCompilerParser.DOUBLE, 0); }
		public TerminalNode STRUCT() { return getToken(myCompilerParser.STRUCT, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_type);
		try {
			setState(83);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				match(INT);
				 if (TRACEON) System.out.println("type: INT");  ((TypeContext)_localctx).attr_type =  1; 
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				match(FLOAT);
				 if (TRACEON) System.out.println("type: FLOAT");  ((TypeContext)_localctx).attr_type =  2; 
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(71);
				match(CHAR);
				 if (TRACEON) System.out.println("type: CHAR");  ((TypeContext)_localctx).attr_type =  3; 
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 4);
				{
				setState(73);
				match(VOID);
				 if (TRACEON) System.out.println("type: VOID");  ((TypeContext)_localctx).attr_type =  4; 
				}
				break;
			case SHORT:
				enterOuterAlt(_localctx, 5);
				{
				setState(75);
				match(SHORT);
				 if (TRACEON) System.out.println("type: SHORT");  ((TypeContext)_localctx).attr_type =  5; 
				}
				break;
			case LONGLONG:
				enterOuterAlt(_localctx, 6);
				{
				setState(77);
				match(LONGLONG);
				 if (TRACEON) System.out.println("type: LONGLONG");  ((TypeContext)_localctx).attr_type =  6; 
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 7);
				{
				setState(79);
				match(DOUBLE);
				 if (TRACEON) System.out.println("type: DOUBLE");  ((TypeContext)_localctx).attr_type =  7; 
				}
				break;
			case STRUCT:
				enterOuterAlt(_localctx, 8);
				{
				setState(81);
				match(STRUCT);
				 if (TRACEON) System.out.println("type: STRUCT");  ((TypeContext)_localctx).attr_type =  8; 
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

	public static class StatementsContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statements);
		try {
			setState(89);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
			case PRINT:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				statement();
				setState(86);
				statements();
				}
				break;
			case RBRACE:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class StatementContext extends ParserRuleContext {
		public int attr_type;
		public Arith_expressionContext a;
		public TerminalNode Identifier() { return getToken(myCompilerParser.Identifier, 0); }
		public TerminalNode ASSIGN() { return getToken(myCompilerParser.ASSIGN, 0); }
		public TerminalNode SEMI() { return getToken(myCompilerParser.SEMI, 0); }
		public Arith_expressionContext arith_expression() {
			return getRuleContext(Arith_expressionContext.class,0);
		}
		public TerminalNode IF() { return getToken(myCompilerParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(myCompilerParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(myCompilerParser.RPAREN, 0); }
		public If_then_statementsContext if_then_statements() {
			return getRuleContext(If_then_statementsContext.class,0);
		}
		public Printf_statementContext printf_statement() {
			return getRuleContext(Printf_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statement);
		try {
			setState(106);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				match(Identifier);
				setState(92);
				match(ASSIGN);
				setState(93);
				((StatementContext)_localctx).a = arith_expression();
				setState(94);
				match(SEMI);

				            // 檢查是否存在
				            if (symtab.containsKey((((StatementContext)_localctx).Identifier!=null?((StatementContext)_localctx).Identifier.getText():null)))
				            {
				                ((StatementContext)_localctx).attr_type =  symtab.get((((StatementContext)_localctx).Identifier!=null?((StatementContext)_localctx).Identifier.getText():null));
				            } 
				            else 
				            {
				                /* Add codes to report and handle this error */
				                System.out.println("Type Error: " + ((StatementContext)_localctx).Identifier.getLine() + ": undeclared identifier " + (((StatementContext)_localctx).Identifier!=null?((StatementContext)_localctx).Identifier.getText():null) );
				                ((StatementContext)_localctx).attr_type =  -2;
				                return _localctx.attr_type;
				            }
				            // 檢查兩者型態 (vartypes) 是否一致
				            if (_localctx.attr_type != ((StatementContext)_localctx).arith_expression.attr_type) 
				            {
				                System.out.println("Type Error: " + (((StatementContext)_localctx).arith_expression!=null?(((StatementContext)_localctx).arith_expression.start):null).getLine() + ": types of leftside operand differs from the rightside operand");
				                ((StatementContext)_localctx).attr_type =  -2;
				            }
				            // Code Generation
				            TextCode.add("\t movl " + "\%" + regMap.get(((StatementContext)_localctx).a.reg_num) + "," + (((StatementContext)_localctx).Identifier!=null?((StatementContext)_localctx).Identifier.getText():null) + "(\%rip)");
				        
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				match(IF);
				setState(98);
				match(LPAREN);
				setState(99);
				arith_expression();
				setState(100);
				match(RPAREN);

				            String label = newLabel();
				            TextCode.add("\t cmpl " + "$0, " + "\%" + regMap.get(((StatementContext)_localctx).arith_expression.reg_num));
				            TextCode.add("\t je " + label);
				        
				setState(102);
				if_then_statements();

				            TextCode.add(label + ":");
				        
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 3);
				{
				setState(105);
				printf_statement();
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

	public static class Arith_expressionContext extends ParserRuleContext {
		public int attr_type;
		public int reg_num;
		public String str;
		public MultExprContext a;
		public MultExprContext b;
		public MultExprContext c;
		public List<MultExprContext> multExpr() {
			return getRuleContexts(MultExprContext.class);
		}
		public MultExprContext multExpr(int i) {
			return getRuleContext(MultExprContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(myCompilerParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(myCompilerParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(myCompilerParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(myCompilerParser.MINUS, i);
		}
		public Arith_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arith_expression; }
	}

	public final Arith_expressionContext arith_expression() throws RecognitionException {
		Arith_expressionContext _localctx = new Arith_expressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_arith_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			((Arith_expressionContext)_localctx).a = multExpr();

			              ((Arith_expressionContext)_localctx).attr_type =  ((Arith_expressionContext)_localctx).a.attr_type;
			              ((Arith_expressionContext)_localctx).reg_num =  ((Arith_expressionContext)_localctx).a.reg_num;
			              ((Arith_expressionContext)_localctx).str =  ((Arith_expressionContext)_localctx).a.str;
				      
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MINUS || _la==PLUS) {
				{
				setState(118);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS:
					{
					setState(110);
					match(PLUS);
					setState(111);
					((Arith_expressionContext)_localctx).b = multExpr();

					            // 檢查型態是否相同
					            if (((Arith_expressionContext)_localctx).a.attr_type != ((Arith_expressionContext)_localctx).b.attr_type) 
					            {
					                System.out.println("Type Error: " + (((Arith_expressionContext)_localctx).a!=null?(((Arith_expressionContext)_localctx).a.start):null).getLine() + ": types of the operands in the addition-expressions are different");
					                ((Arith_expressionContext)_localctx).attr_type =  -2;
					            }
					            // Code generation
					            TextCode.add("\t addl " + "\%" + regMap.get(((Arith_expressionContext)_localctx).b.reg_num) + ", \%" + regMap.get(_localctx.reg_num));
						      
					}
					break;
				case MINUS:
					{
					setState(114);
					match(MINUS);
					setState(115);
					((Arith_expressionContext)_localctx).c = multExpr();
					 
					            if (((Arith_expressionContext)_localctx).a.attr_type != ((Arith_expressionContext)_localctx).c.attr_type) 
					            {
					                System.out.println("Type Error: " + (((Arith_expressionContext)_localctx).a!=null?(((Arith_expressionContext)_localctx).a.start):null).getLine() + ": types of the operands in the substract-expressions are different");
					                ((Arith_expressionContext)_localctx).attr_type =  -2;
					            }
						        TextCode.add("\t subl " + "\%" + regMap.get(((Arith_expressionContext)_localctx).c.reg_num) + ", \%" + regMap.get(_localctx.reg_num));
						      
					}
					break;
				default:
					throw new NoViableAltException(this);
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

	public static class MultExprContext extends ParserRuleContext {
		public int attr_type;
		public int reg_num;
		public String str;
		public SignExprContext a;
		public SignExprContext b;
		public SignExprContext c;
		public List<SignExprContext> signExpr() {
			return getRuleContexts(SignExprContext.class);
		}
		public SignExprContext signExpr(int i) {
			return getRuleContext(SignExprContext.class,i);
		}
		public List<TerminalNode> TIME() { return getTokens(myCompilerParser.TIME); }
		public TerminalNode TIME(int i) {
			return getToken(myCompilerParser.TIME, i);
		}
		public List<TerminalNode> DIVIDE() { return getTokens(myCompilerParser.DIVIDE); }
		public TerminalNode DIVIDE(int i) {
			return getToken(myCompilerParser.DIVIDE, i);
		}
		public MultExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multExpr; }
	}

	public final MultExprContext multExpr() throws RecognitionException {
		MultExprContext _localctx = new MultExprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_multExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			((MultExprContext)_localctx).a = signExpr();
			 
			            ((MultExprContext)_localctx).attr_type =  ((MultExprContext)_localctx).a.attr_type;
			            ((MultExprContext)_localctx).reg_num =  ((MultExprContext)_localctx).a.reg_num;
			            ((MultExprContext)_localctx).str =  ((MultExprContext)_localctx).a.str;
			        
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TIME || _la==DIVIDE) {
				{
				setState(133);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TIME:
					{
					setState(125);
					match(TIME);
					setState(126);
					((MultExprContext)_localctx).b = signExpr();

					            // 檢查型態是否符合
					            if (((MultExprContext)_localctx).a.attr_type != ((MultExprContext)_localctx).b.attr_type) 
					            {
					                System.out.println("Type Error: " + (((MultExprContext)_localctx).a!=null?(((MultExprContext)_localctx).a.start):null).getLine() + ": types of the operands in the (mul/div)-expressions are different");
					                ((MultExprContext)_localctx).attr_type =  -2;
					            }
					            // Code generation
					            TextCode.add("\t imul " + "\%" + regMap.get(((MultExprContext)_localctx).b.reg_num) + ", \%" + regMap.get(((MultExprContext)_localctx).a.reg_num));
					        
					}
					break;
				case DIVIDE:
					{
					setState(129);
					match(DIVIDE);
					setState(130);
					((MultExprContext)_localctx).c = signExpr();
					 
					            // 檢查型態是否符合
					            if (((MultExprContext)_localctx).a.attr_type != ((MultExprContext)_localctx).c.attr_type) 
					            {
					                System.out.println("Type Error: " + (((MultExprContext)_localctx).a!=null?(((MultExprContext)_localctx).a.start):null).getLine() + ": types of the operands in the (mul/div)-expressions are different");
					                ((MultExprContext)_localctx).attr_type =  -2;
					            }
					            // Code generation
					            TextCode.add("\t movl " + "\%" + regMap.get(((MultExprContext)_localctx).a.reg_num) + ", \%eax");
					            TextCode.add("\t movl " + "$0" + ", \%edx");
					            TextCode.add("\t idivl " + "\%" + regMap.get(((MultExprContext)_localctx).c.reg_num));
					            TextCode.add("\t movl "  + "\%eax" + ", \%" + regMap.get(((MultExprContext)_localctx).a.reg_num));
					        
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

	public static class SignExprContext extends ParserRuleContext {
		public int attr_type;
		public int reg_num;
		public String str;
		public PrimaryExprContext primaryExpr() {
			return getRuleContext(PrimaryExprContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(myCompilerParser.MINUS, 0); }
		public SignExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signExpr; }
	}

	public final SignExprContext signExpr() throws RecognitionException {
		SignExprContext _localctx = new SignExprContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_signExpr);
		try {
			setState(145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
			case Identifier:
			case Integer_constant:
			case Floating_point_constant:
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				primaryExpr();
				 
				            ((SignExprContext)_localctx).attr_type =  ((SignExprContext)_localctx).primaryExpr.attr_type;
				            ((SignExprContext)_localctx).reg_num =  ((SignExprContext)_localctx).primaryExpr.reg_num;
				            ((SignExprContext)_localctx).str =  ((SignExprContext)_localctx).primaryExpr.str;
				        
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				match(MINUS);
				setState(142);
				primaryExpr();

				            ((SignExprContext)_localctx).attr_type =  ((SignExprContext)_localctx).primaryExpr.attr_type;
				            ((SignExprContext)_localctx).reg_num =  ((SignExprContext)_localctx).primaryExpr.reg_num;
				            ((SignExprContext)_localctx).str =  ((SignExprContext)_localctx).primaryExpr.str;
				            // code generation
				            TextCode.add("\t negl " + "\%" + regMap.get(((SignExprContext)_localctx).primaryExpr.reg_num));
				        
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

	public static class PrimaryExprContext extends ParserRuleContext {
		public int attr_type;
		public int reg_num;
		public String str;
		public TerminalNode Integer_constant() { return getToken(myCompilerParser.Integer_constant, 0); }
		public TerminalNode Floating_point_constant() { return getToken(myCompilerParser.Floating_point_constant, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(myCompilerParser.STRING_LITERAL, 0); }
		public TerminalNode Identifier() { return getToken(myCompilerParser.Identifier, 0); }
		public TerminalNode LPAREN() { return getToken(myCompilerParser.LPAREN, 0); }
		public Arith_expressionContext arith_expression() {
			return getRuleContext(Arith_expressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(myCompilerParser.RPAREN, 0); }
		public PrimaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpr; }
	}

	public final PrimaryExprContext primaryExpr() throws RecognitionException {
		PrimaryExprContext _localctx = new PrimaryExprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_primaryExpr);
		try {
			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Integer_constant:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				match(Integer_constant);
				 
				            ((PrimaryExprContext)_localctx).attr_type =  1;
				            ((PrimaryExprContext)_localctx).str =  null;
				            // code generation
				            ((PrimaryExprContext)_localctx).reg_num =  reg.get();  /* get an register */
				            TextCode.add("\t movl " + "$" + (((PrimaryExprContext)_localctx).Integer_constant!=null?((PrimaryExprContext)_localctx).Integer_constant.getText():null) + ", \%" + regMap.get(_localctx.reg_num)); 
				        
				}
				break;
			case Floating_point_constant:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				match(Floating_point_constant);
				 
				            ((PrimaryExprContext)_localctx).attr_type =  2; 
				        
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(151);
				match(STRING_LITERAL);

				            ((PrimaryExprContext)_localctx).attr_type =  3; ((PrimaryExprContext)_localctx).str =  (((PrimaryExprContext)_localctx).STRING_LITERAL!=null?((PrimaryExprContext)_localctx).STRING_LITERAL.getText():null); 
				        
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 4);
				{
				setState(153);
				match(Identifier);

				            if (symtab.containsKey((((PrimaryExprContext)_localctx).Identifier!=null?((PrimaryExprContext)_localctx).Identifier.getText():null))) 
				            {
				                ((PrimaryExprContext)_localctx).attr_type =  symtab.get((((PrimaryExprContext)_localctx).Identifier!=null?((PrimaryExprContext)_localctx).Identifier.getText():null));
				            } 
				            else 
				            {
				                System.out.println("Type Error: " + ((PrimaryExprContext)_localctx).Identifier.getLine() + ": undeclared identifier " + (((PrimaryExprContext)_localctx).Identifier!=null?((PrimaryExprContext)_localctx).Identifier.getText():null));
				                ((PrimaryExprContext)_localctx).attr_type =  -2;
				                // return _localctx.attr_type;
				            }
				            ((PrimaryExprContext)_localctx).str =  null;
				            ((PrimaryExprContext)_localctx).reg_num =  reg.get(); /* get an register */
				            // code generation
				            TextCode.add("\t movl " + (((PrimaryExprContext)_localctx).Identifier!=null?((PrimaryExprContext)_localctx).Identifier.getText():null) + "(\%rip), \%" + regMap.get(_localctx.reg_num));
				        
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 5);
				{
				setState(155);
				match(LPAREN);
				setState(156);
				arith_expression();
				setState(157);
				match(RPAREN);
				 
				            ((PrimaryExprContext)_localctx).attr_type =  ((PrimaryExprContext)_localctx).arith_expression.attr_type; 
				        
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

	public static class If_then_statementsContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(myCompilerParser.LBRACE, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(myCompilerParser.RBRACE, 0); }
		public If_then_statementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_then_statements; }
	}

	public final If_then_statementsContext if_then_statements() throws RecognitionException {
		If_then_statementsContext _localctx = new If_then_statementsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_if_then_statements);
		try {
			setState(167);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
			case PRINT:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				statement();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				match(LBRACE);
				setState(164);
				statements();
				setState(165);
				match(RBRACE);
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

	public static class Printf_statementContext extends ParserRuleContext {
		public Token a;
		public TerminalNode Identifier() { return getToken(myCompilerParser.Identifier, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(myCompilerParser.STRING_LITERAL, 0); }
		public Printf_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printf_statement; }
	}

	public final Printf_statementContext printf_statement() throws RecognitionException {
		Printf_statementContext _localctx = new Printf_statementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_printf_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(PRINT);
			setState(170);
			match(LPAREN);
			setState(171);
			((Printf_statementContext)_localctx).a = match(STRING_LITERAL);
			setState(172);
			match(COMMA);
			setState(173);
			match(Identifier);
			setState(174);
			match(RPAREN);
			setState(175);
			match(SEMI);

			     String label = newLabel();
			     DataCode.add(label + ":");
			     DataCode.add("\t .string " + (((Printf_statementContext)_localctx).a!=null?((Printf_statementContext)_localctx).a.getText():null));
			     TextCode.add("\t movl " + (((Printf_statementContext)_localctx).Identifier!=null?((Printf_statementContext)_localctx).Identifier.getText():null) + "(\%rip), " + "\%esi");
			     TextCode.add("\t movl " + "$" + label + ", " + "\%edi");
			     TextCode.add("\t call printf");
			    
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3F\u00b5\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\5\3\'\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\5\5;\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6D\n\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7V\n\7\3\b\3"+
		"\b\3\b\3\b\5\b\\\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\5\tm\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\ny\n\n\f"+
		"\n\16\n|\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u0088"+
		"\n\13\f\13\16\13\u008b\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0094\n\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00a3\n\r\3\16"+
		"\3\16\3\16\3\16\3\16\5\16\u00aa\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\2\2\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2\2\2\u00bd"+
		"\2\36\3\2\2\2\4&\3\2\2\2\6(\3\2\2\2\b:\3\2\2\2\nC\3\2\2\2\fU\3\2\2\2\16"+
		"[\3\2\2\2\20l\3\2\2\2\22n\3\2\2\2\24}\3\2\2\2\26\u0093\3\2\2\2\30\u00a2"+
		"\3\2\2\2\32\u00a9\3\2\2\2\34\u00ab\3\2\2\2\36\37\b\2\1\2\37 \5\b\5\2 "+
		"!\5\4\3\2!\3\3\2\2\2\"#\5\6\4\2#$\5\4\3\2$\'\3\2\2\2%\'\3\2\2\2&\"\3\2"+
		"\2\2&%\3\2\2\2\'\5\3\2\2\2()\5\f\7\2)*\7?\2\2*+\79\2\2+,\7:\2\2,-\7;\2"+
		"\2-.\b\4\1\2./\5\n\6\2/\60\5\16\b\2\60\61\7<\2\2\61\62\b\4\1\2\62\7\3"+
		"\2\2\2\63\64\5\f\7\2\64\65\7?\2\2\65\66\7\66\2\2\66\67\5\b\5\2\678\b\5"+
		"\1\28;\3\2\2\29;\3\2\2\2:\63\3\2\2\2:9\3\2\2\2;\t\3\2\2\2<=\5\f\7\2=>"+
		"\7?\2\2>?\7\66\2\2?@\5\n\6\2@A\b\6\1\2AD\3\2\2\2BD\3\2\2\2C<\3\2\2\2C"+
		"B\3\2\2\2D\13\3\2\2\2EF\7\3\2\2FV\b\7\1\2GH\7\b\2\2HV\b\7\1\2IJ\7\4\2"+
		"\2JV\b\7\1\2KL\7\5\2\2LV\b\7\1\2MN\7\6\2\2NV\b\7\1\2OP\7\7\2\2PV\b\7\1"+
		"\2QR\7\t\2\2RV\b\7\1\2ST\7\n\2\2TV\b\7\1\2UE\3\2\2\2UG\3\2\2\2UI\3\2\2"+
		"\2UK\3\2\2\2UM\3\2\2\2UO\3\2\2\2UQ\3\2\2\2US\3\2\2\2V\r\3\2\2\2WX\5\20"+
		"\t\2XY\5\16\b\2Y\\\3\2\2\2Z\\\3\2\2\2[W\3\2\2\2[Z\3\2\2\2\\\17\3\2\2\2"+
		"]^\7?\2\2^_\7+\2\2_`\5\22\n\2`a\7\66\2\2ab\b\t\1\2bm\3\2\2\2cd\7\f\2\2"+
		"de\79\2\2ef\5\22\n\2fg\7:\2\2gh\b\t\1\2hi\5\32\16\2ij\b\t\1\2jm\3\2\2"+
		"\2km\5\34\17\2l]\3\2\2\2lc\3\2\2\2lk\3\2\2\2m\21\3\2\2\2no\5\24\13\2o"+
		"z\b\n\1\2pq\7-\2\2qr\5\24\13\2rs\b\n\1\2sy\3\2\2\2tu\7,\2\2uv\5\24\13"+
		"\2vw\b\n\1\2wy\3\2\2\2xp\3\2\2\2xt\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2"+
		"\2{\23\3\2\2\2|z\3\2\2\2}~\5\26\f\2~\u0089\b\13\1\2\177\u0080\7.\2\2\u0080"+
		"\u0081\5\26\f\2\u0081\u0082\b\13\1\2\u0082\u0088\3\2\2\2\u0083\u0084\7"+
		"/\2\2\u0084\u0085\5\26\f\2\u0085\u0086\b\13\1\2\u0086\u0088\3\2\2\2\u0087"+
		"\177\3\2\2\2\u0087\u0083\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2\2"+
		"\2\u0089\u008a\3\2\2\2\u008a\25\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u008d"+
		"\5\30\r\2\u008d\u008e\b\f\1\2\u008e\u0094\3\2\2\2\u008f\u0090\7,\2\2\u0090"+
		"\u0091\5\30\r\2\u0091\u0092\b\f\1\2\u0092\u0094\3\2\2\2\u0093\u008c\3"+
		"\2\2\2\u0093\u008f\3\2\2\2\u0094\27\3\2\2\2\u0095\u0096\7@\2\2\u0096\u00a3"+
		"\b\r\1\2\u0097\u0098\7A\2\2\u0098\u00a3\b\r\1\2\u0099\u009a\7B\2\2\u009a"+
		"\u00a3\b\r\1\2\u009b\u009c\7?\2\2\u009c\u00a3\b\r\1\2\u009d\u009e\79\2"+
		"\2\u009e\u009f\5\22\n\2\u009f\u00a0\7:\2\2\u00a0\u00a1\b\r\1\2\u00a1\u00a3"+
		"\3\2\2\2\u00a2\u0095\3\2\2\2\u00a2\u0097\3\2\2\2\u00a2\u0099\3\2\2\2\u00a2"+
		"\u009b\3\2\2\2\u00a2\u009d\3\2\2\2\u00a3\31\3\2\2\2\u00a4\u00aa\5\20\t"+
		"\2\u00a5\u00a6\7;\2\2\u00a6\u00a7\5\16\b\2\u00a7\u00a8\7<\2\2\u00a8\u00aa"+
		"\3\2\2\2\u00a9\u00a4\3\2\2\2\u00a9\u00a5\3\2\2\2\u00aa\33\3\2\2\2\u00ab"+
		"\u00ac\7\24\2\2\u00ac\u00ad\79\2\2\u00ad\u00ae\7B\2\2\u00ae\u00af\7\65"+
		"\2\2\u00af\u00b0\7?\2\2\u00b0\u00b1\7:\2\2\u00b1\u00b2\7\66\2\2\u00b2"+
		"\u00b3\b\17\1\2\u00b3\35\3\2\2\2\17&:CU[lxz\u0087\u0089\u0093\u00a2\u00a9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}