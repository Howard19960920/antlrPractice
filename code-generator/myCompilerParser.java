// $ANTLR 3.5.2 myCompiler.g 2018-06-23 17:44:44

    // import packages here.
    import java.util.HashMap;

    // final edition here 
    import java.util.ArrayList;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class myCompilerParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ASSIGN", "BREAK", "CASE", 
		"CHAR", "COLON", "COMMA", "COMMENT1", "COMMENT2", "CONTINUE", "DIGIT", 
		"DIVIDE", "DIVIDEEQ", "DOT_", "DOUBLE", "ELSE", "ELSEIF", "EQ", "EscapeSequence", 
		"FLOAT", "FLOAT_NUM1", "FLOAT_NUM2", "FLOAT_NUM3", "FOR", "Floating_point_constant", 
		"GT", "GTEQ", "IF", "INCLUDE", "INT", "Identifier", "Integer_constant", 
		"LBRACE", "LETTER", "LGAND", "LGOR", "LONGLONG", "LPAREN", "LSHIFT", "LSQUARE", 
		"LT", "LTEQ", "MINUS", "MINUSEQ", "MM", "MOD", "MODEQ", "NEQ", "NGT", 
		"NLT", "NOT", "OR", "PLUS", "PLUSEQ", "PP", "PREPROCESSOR", "PRINT", "RBRACE", 
		"RETURN", "RPAREN", "RSHIFT", "RSQUARE", "SCANF", "SEMI", "SHARP", "SHORT", 
		"STRING_LITERAL", "STRUCT", "SWITCH", "TIME", "TIMEEQ", "VOID", "WHILE", 
		"WS"
	};
	public static final int EOF=-1;
	public static final int AND=4;
	public static final int ASSIGN=5;
	public static final int BREAK=6;
	public static final int CASE=7;
	public static final int CHAR=8;
	public static final int COLON=9;
	public static final int COMMA=10;
	public static final int COMMENT1=11;
	public static final int COMMENT2=12;
	public static final int CONTINUE=13;
	public static final int DIGIT=14;
	public static final int DIVIDE=15;
	public static final int DIVIDEEQ=16;
	public static final int DOT_=17;
	public static final int DOUBLE=18;
	public static final int ELSE=19;
	public static final int ELSEIF=20;
	public static final int EQ=21;
	public static final int EscapeSequence=22;
	public static final int FLOAT=23;
	public static final int FLOAT_NUM1=24;
	public static final int FLOAT_NUM2=25;
	public static final int FLOAT_NUM3=26;
	public static final int FOR=27;
	public static final int Floating_point_constant=28;
	public static final int GT=29;
	public static final int GTEQ=30;
	public static final int IF=31;
	public static final int INCLUDE=32;
	public static final int INT=33;
	public static final int Identifier=34;
	public static final int Integer_constant=35;
	public static final int LBRACE=36;
	public static final int LETTER=37;
	public static final int LGAND=38;
	public static final int LGOR=39;
	public static final int LONGLONG=40;
	public static final int LPAREN=41;
	public static final int LSHIFT=42;
	public static final int LSQUARE=43;
	public static final int LT=44;
	public static final int LTEQ=45;
	public static final int MINUS=46;
	public static final int MINUSEQ=47;
	public static final int MM=48;
	public static final int MOD=49;
	public static final int MODEQ=50;
	public static final int NEQ=51;
	public static final int NGT=52;
	public static final int NLT=53;
	public static final int NOT=54;
	public static final int OR=55;
	public static final int PLUS=56;
	public static final int PLUSEQ=57;
	public static final int PP=58;
	public static final int PREPROCESSOR=59;
	public static final int PRINT=60;
	public static final int RBRACE=61;
	public static final int RETURN=62;
	public static final int RPAREN=63;
	public static final int RSHIFT=64;
	public static final int RSQUARE=65;
	public static final int SCANF=66;
	public static final int SEMI=67;
	public static final int SHARP=68;
	public static final int SHORT=69;
	public static final int STRING_LITERAL=70;
	public static final int STRUCT=71;
	public static final int SWITCH=72;
	public static final int TIME=73;
	public static final int TIMEEQ=74;
	public static final int VOID=75;
	public static final int WHILE=76;
	public static final int WS=77;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public myCompilerParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public myCompilerParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return myCompilerParser.tokenNames; }
	@Override public String getGrammarFileName() { return "myCompiler.g"; }


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
	       TextCode.add("\t pushq %rbp");
	       TextCode.add("\t movq %rsp,%rbp");
	       TextCode.add("\t pushq %rbx"); //callee saved registers.
	       TextCode.add("\t pushq %r12"); //callee saved registers.
	       TextCode.add("\t pushq %r13"); //callee saved registers.
	       TextCode.add("\t pushq %r14"); //callee saved registers.
	       TextCode.add("\t pushq %r15"); //callee saved registers.
	       TextCode.add("\t subq $8,%rsp\n"); // aligned 16-byte boundary.
	    }
	    
	    /*
	     * Output epilogue.
	     */
	    void epilogue()
	    {
	       /* handle epilogue */
	       
	       /* Follow x86 calling convention */
	       TextCode.add("\n\t addq $8,%rsp");
	       TextCode.add("\t popq %r15");
	       TextCode.add("\t popq %r14");
	       TextCode.add("\t popq %r13");
	       TextCode.add("\t popq %r12");
	       TextCode.add("\t popq %rbx");
	       TextCode.add("\t popq %rbp");
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



	// $ANTLR start "program"
	// myCompiler.g:123:1: program : declarations functions ;
	public final void program() throws RecognitionException {
		int program_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return; }

			// myCompiler.g:124:5: ( declarations functions )
			// myCompiler.g:126:9: declarations functions
			{
			initRegMappings();
			pushFollow(FOLLOW_declarations_in_program91);
			declarations();
			state._fsp--;

			pushFollow(FOLLOW_functions_in_program93);
			functions();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "program"



	// $ANTLR start "functions"
	// myCompiler.g:131:1: functions : ( function functions |);
	public final void functions() throws RecognitionException {
		int functions_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return; }

			// myCompiler.g:132:5: ( function functions |)
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==CHAR||LA1_0==DOUBLE||LA1_0==FLOAT||LA1_0==INT||LA1_0==LONGLONG||LA1_0==SHORT||LA1_0==STRUCT||LA1_0==VOID) ) {
				alt1=1;
			}
			else if ( (LA1_0==EOF) ) {
				alt1=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// myCompiler.g:133:9: function functions
					{
					pushFollow(FOLLOW_function_in_functions120);
					function();
					state._fsp--;

					pushFollow(FOLLOW_functions_in_functions122);
					functions();
					state._fsp--;

					}
					break;
				case 2 :
					// myCompiler.g:135:5: 
					{
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "functions"



	// $ANTLR start "function"
	// myCompiler.g:137:1: function : type Identifier LPAREN RPAREN LBRACE l_declarations statements RBRACE ;
	public final void function() throws RecognitionException {
		int function_StartIndex = input.index();

		Token Identifier1=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return; }

			// myCompiler.g:138:5: ( type Identifier LPAREN RPAREN LBRACE l_declarations statements RBRACE )
			// myCompiler.g:138:7: type Identifier LPAREN RPAREN LBRACE l_declarations statements RBRACE
			{
			pushFollow(FOLLOW_type_in_function155);
			type();
			state._fsp--;

			Identifier1=(Token)match(input,Identifier,FOLLOW_Identifier_in_function157); 
			match(input,LPAREN,FOLLOW_LPAREN_in_function159); 
			match(input,RPAREN,FOLLOW_RPAREN_in_function161); 
			match(input,LBRACE,FOLLOW_LBRACE_in_function163); 

			         /* output function prologue */
			         prologue((Identifier1!=null?Identifier1.getText():null));
			      
			pushFollow(FOLLOW_l_declarations_in_function179);
			l_declarations();
			state._fsp--;

			pushFollow(FOLLOW_statements_in_function181);
			statements();
			state._fsp--;

			match(input,RBRACE,FOLLOW_RBRACE_in_function183); 

			        if (TRACEON)
			        {
			            System.out.println("type Identifier () {declarations statements}");
			        }
			        /* output function epilogue */	  
			        epilogue();
				  
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "function"



	// $ANTLR start "declarations"
	// myCompiler.g:156:1: declarations : ( type Identifier SEMI declarations |);
	public final void declarations() throws RecognitionException {
		int declarations_StartIndex = input.index();

		Token Identifier2=null;
		int type3 =0;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return; }

			// myCompiler.g:157:5: ( type Identifier SEMI declarations |)
			int alt2=2;
			switch ( input.LA(1) ) {
			case INT:
				{
				int LA2_1 = input.LA(2);
				if ( (LA2_1==Identifier) ) {
					int LA2_10 = input.LA(3);
					if ( (LA2_10==SEMI) ) {
						alt2=1;
					}
					else if ( (LA2_10==LPAREN) ) {
						alt2=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 2, 10, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case FLOAT:
				{
				int LA2_2 = input.LA(2);
				if ( (LA2_2==Identifier) ) {
					int LA2_11 = input.LA(3);
					if ( (LA2_11==SEMI) ) {
						alt2=1;
					}
					else if ( (LA2_11==LPAREN) ) {
						alt2=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 2, 11, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case CHAR:
				{
				int LA2_3 = input.LA(2);
				if ( (LA2_3==Identifier) ) {
					int LA2_12 = input.LA(3);
					if ( (LA2_12==SEMI) ) {
						alt2=1;
					}
					else if ( (LA2_12==LPAREN) ) {
						alt2=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 2, 12, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case VOID:
				{
				int LA2_4 = input.LA(2);
				if ( (LA2_4==Identifier) ) {
					int LA2_13 = input.LA(3);
					if ( (LA2_13==SEMI) ) {
						alt2=1;
					}
					else if ( (LA2_13==LPAREN) ) {
						alt2=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 2, 13, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case SHORT:
				{
				int LA2_5 = input.LA(2);
				if ( (LA2_5==Identifier) ) {
					int LA2_14 = input.LA(3);
					if ( (LA2_14==SEMI) ) {
						alt2=1;
					}
					else if ( (LA2_14==LPAREN) ) {
						alt2=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 2, 14, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case LONGLONG:
				{
				int LA2_6 = input.LA(2);
				if ( (LA2_6==Identifier) ) {
					int LA2_15 = input.LA(3);
					if ( (LA2_15==SEMI) ) {
						alt2=1;
					}
					else if ( (LA2_15==LPAREN) ) {
						alt2=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 2, 15, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 6, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case DOUBLE:
				{
				int LA2_7 = input.LA(2);
				if ( (LA2_7==Identifier) ) {
					int LA2_16 = input.LA(3);
					if ( (LA2_16==SEMI) ) {
						alt2=1;
					}
					else if ( (LA2_16==LPAREN) ) {
						alt2=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 2, 16, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 7, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case STRUCT:
				{
				int LA2_8 = input.LA(2);
				if ( (LA2_8==Identifier) ) {
					int LA2_17 = input.LA(3);
					if ( (LA2_17==SEMI) ) {
						alt2=1;
					}
					else if ( (LA2_17==LPAREN) ) {
						alt2=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 2, 17, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 8, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case EOF:
				{
				alt2=2;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// myCompiler.g:158:9: type Identifier SEMI declarations
					{
					pushFollow(FOLLOW_type_in_declarations217);
					type3=type();
					state._fsp--;

					Identifier2=(Token)match(input,Identifier,FOLLOW_Identifier_in_declarations219); 
					match(input,SEMI,FOLLOW_SEMI_in_declarations221); 
					pushFollow(FOLLOW_declarations_in_declarations223);
					declarations();
					state._fsp--;

					 
					            if (TRACEON) 
					            {
					                System.out.println("declarations: type Identifier : declarations");
					            }
					            // 檢查變數是否已經宣告過
					            if (symtab.containsKey((Identifier2!=null?Identifier2.getText():null))) 
					            {
					                System.out.println("Type Error: " + Identifier2.getLine() + ": Redeclared identifier.");
					            } 
					            else 
					            {
					                /* Add ID and its attr_type into the symbol table. */
					                symtab.put((Identifier2!=null?Identifier2.getText():null), type3);	   
					            }
					            
					            /* code generation */
					            switch(type3) 
					            {
					                case 1: /* Type: integer, size=> 4 bytes, alignment=> 4 byte boundary. */
					                        DataCode.add("\t .common " + (Identifier2!=null?Identifier2.getText():null) + ",4,4\n");
					                        break;
					                case 2: /* Type: float, size=> 4 bytes, alignment=> 4 byte boundary. */
					                        DataCode.add("\t .common " + (Identifier2!=null?Identifier2.getText():null) + ",4,4\n");
					                        break;
					                default:
					            }
					        
					}
					break;
				case 2 :
					// myCompiler.g:189:5: 
					{
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "declarations"



	// $ANTLR start "l_declarations"
	// myCompiler.g:192:1: l_declarations : ( type Identifier SEMI l_declarations |);
	public final void l_declarations() throws RecognitionException {
		int l_declarations_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return; }

			// myCompiler.g:193:5: ( type Identifier SEMI l_declarations |)
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==CHAR||LA3_0==DOUBLE||LA3_0==FLOAT||LA3_0==INT||LA3_0==LONGLONG||LA3_0==SHORT||LA3_0==STRUCT||LA3_0==VOID) ) {
				alt3=1;
			}
			else if ( (LA3_0==IF||LA3_0==Identifier||(LA3_0 >= PRINT && LA3_0 <= RBRACE)) ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// myCompiler.g:194:9: type Identifier SEMI l_declarations
					{
					pushFollow(FOLLOW_type_in_l_declarations275);
					type();
					state._fsp--;

					match(input,Identifier,FOLLOW_Identifier_in_l_declarations277); 
					match(input,SEMI,FOLLOW_SEMI_in_l_declarations279); 
					pushFollow(FOLLOW_l_declarations_in_l_declarations281);
					l_declarations();
					state._fsp--;


					        /* If you want to handle local variables, fix it. */ 
					        
					}
					break;
				case 2 :
					// myCompiler.g:199:5: 
					{
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "l_declarations"



	// $ANTLR start "type"
	// myCompiler.g:202:1: type returns [int attr_type] : ( INT | FLOAT | CHAR | VOID | SHORT | LONGLONG | DOUBLE | STRUCT );
	public final int type() throws RecognitionException {
		int attr_type = 0;

		int type_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return attr_type; }

			// myCompiler.g:203:5: ( INT | FLOAT | CHAR | VOID | SHORT | LONGLONG | DOUBLE | STRUCT )
			int alt4=8;
			switch ( input.LA(1) ) {
			case INT:
				{
				alt4=1;
				}
				break;
			case FLOAT:
				{
				alt4=2;
				}
				break;
			case CHAR:
				{
				alt4=3;
				}
				break;
			case VOID:
				{
				alt4=4;
				}
				break;
			case SHORT:
				{
				alt4=5;
				}
				break;
			case LONGLONG:
				{
				alt4=6;
				}
				break;
			case DOUBLE:
				{
				alt4=7;
				}
				break;
			case STRUCT:
				{
				alt4=8;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}
			switch (alt4) {
				case 1 :
					// myCompiler.g:204:9: INT
					{
					match(input,INT,FOLLOW_INT_in_type329); 
					 if (TRACEON) System.out.println("type: INT");  attr_type = 1; 
					}
					break;
				case 2 :
					// myCompiler.g:205:11: FLOAT
					{
					match(input,FLOAT,FOLLOW_FLOAT_in_type343); 
					 if (TRACEON) System.out.println("type: FLOAT");  attr_type = 2; 
					}
					break;
				case 3 :
					// myCompiler.g:206:11: CHAR
					{
					match(input,CHAR,FOLLOW_CHAR_in_type357); 
					 if (TRACEON) System.out.println("type: CHAR");  attr_type = 3; 
					}
					break;
				case 4 :
					// myCompiler.g:207:11: VOID
					{
					match(input,VOID,FOLLOW_VOID_in_type371); 
					 if (TRACEON) System.out.println("type: VOID");  attr_type = 4; 
					}
					break;
				case 5 :
					// myCompiler.g:208:11: SHORT
					{
					match(input,SHORT,FOLLOW_SHORT_in_type385); 
					 if (TRACEON) System.out.println("type: SHORT");  attr_type = 5; 
					}
					break;
				case 6 :
					// myCompiler.g:209:11: LONGLONG
					{
					match(input,LONGLONG,FOLLOW_LONGLONG_in_type399); 
					 if (TRACEON) System.out.println("type: LONGLONG");  attr_type = 6; 
					}
					break;
				case 7 :
					// myCompiler.g:210:11: DOUBLE
					{
					match(input,DOUBLE,FOLLOW_DOUBLE_in_type413); 
					 if (TRACEON) System.out.println("type: DOUBLE");  attr_type = 7; 
					}
					break;
				case 8 :
					// myCompiler.g:211:11: STRUCT
					{
					match(input,STRUCT,FOLLOW_STRUCT_in_type427); 
					 if (TRACEON) System.out.println("type: STRUCT");  attr_type = 8; 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return attr_type;
	}
	// $ANTLR end "type"



	// $ANTLR start "statements"
	// myCompiler.g:214:1: statements : ( statement statements |);
	public final void statements() throws RecognitionException {
		int statements_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return; }

			// myCompiler.g:215:5: ( statement statements |)
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==IF||LA5_0==Identifier||LA5_0==PRINT) ) {
				alt5=1;
			}
			else if ( (LA5_0==RBRACE) ) {
				alt5=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// myCompiler.g:216:9: statement statements
					{
					pushFollow(FOLLOW_statement_in_statements455);
					statement();
					state._fsp--;

					pushFollow(FOLLOW_statements_in_statements457);
					statements();
					state._fsp--;

					}
					break;
				case 2 :
					// myCompiler.g:218:5: 
					{
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "statements"



	// $ANTLR start "statement"
	// myCompiler.g:220:1: statement returns [int attr_type] : ( Identifier ASSIGN a= arith_expression SEMI | IF LPAREN arith_expression RPAREN if_then_statements | printf_statement );
	public final int statement() throws RecognitionException {
		int attr_type = 0;

		int statement_StartIndex = input.index();

		Token Identifier4=null;
		ParserRuleReturnScope a =null;
		ParserRuleReturnScope arith_expression5 =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return attr_type; }

			// myCompiler.g:221:5: ( Identifier ASSIGN a= arith_expression SEMI | IF LPAREN arith_expression RPAREN if_then_statements | printf_statement )
			int alt6=3;
			switch ( input.LA(1) ) {
			case Identifier:
				{
				alt6=1;
				}
				break;
			case IF:
				{
				alt6=2;
				}
				break;
			case PRINT:
				{
				alt6=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}
			switch (alt6) {
				case 1 :
					// myCompiler.g:222:9: Identifier ASSIGN a= arith_expression SEMI
					{
					Identifier4=(Token)match(input,Identifier,FOLLOW_Identifier_in_statement500); 
					match(input,ASSIGN,FOLLOW_ASSIGN_in_statement502); 
					pushFollow(FOLLOW_arith_expression_in_statement508);
					a=arith_expression();
					state._fsp--;

					match(input,SEMI,FOLLOW_SEMI_in_statement510); 

					            // 檢查是否存在
					            if (symtab.containsKey((Identifier4!=null?Identifier4.getText():null)))
					            {
					                attr_type = symtab.get((Identifier4!=null?Identifier4.getText():null));
					            } 
					            else 
					            {
					                /* Add codes to report and handle this error */
					                System.out.println("Type Error: " + Identifier4.getLine() + ": undeclared identifier " + (Identifier4!=null?Identifier4.getText():null) );
					                attr_type = -2;
					                return attr_type;
					            }
					            // 檢查兩者型態 (vartypes) 是否一致
					            if (attr_type != (a!=null?((myCompilerParser.arith_expression_return)a).attr_type:0)) 
					            {
					                System.out.println("Type Error: " + (a!=null?(a.start):null).getLine() + ": types of leftside operand differs from the rightside operand");
					                attr_type = -2;
					            }
					            // Code Generation
					            TextCode.add("\t movl " + "%" + regMap.get((a!=null?((myCompilerParser.arith_expression_return)a).reg_num:0)) + "," + (Identifier4!=null?Identifier4.getText():null) + "(%rip)");
					        
					}
					break;
				case 2 :
					// myCompiler.g:246:9: IF LPAREN arith_expression RPAREN if_then_statements
					{
					match(input,IF,FOLLOW_IF_in_statement536); 
					match(input,LPAREN,FOLLOW_LPAREN_in_statement538); 
					pushFollow(FOLLOW_arith_expression_in_statement540);
					arith_expression5=arith_expression();
					state._fsp--;

					match(input,RPAREN,FOLLOW_RPAREN_in_statement542); 

					            String label = newLabel();
					            TextCode.add("\t cmpl " + "$0, " + "%" + regMap.get((arith_expression5!=null?((myCompilerParser.arith_expression_return)arith_expression5).reg_num:0)));
					            TextCode.add("\t je " + label);
					        
					pushFollow(FOLLOW_if_then_statements_in_statement564);
					if_then_statements();
					state._fsp--;


					            TextCode.add(label + ":");
					        
					}
					break;
				case 3 :
					// myCompiler.g:257:9: printf_statement
					{
					pushFollow(FOLLOW_printf_statement_in_statement592);
					printf_statement();
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return attr_type;
	}
	// $ANTLR end "statement"


	public static class arith_expression_return extends ParserRuleReturnScope {
		public int attr_type;
		public int reg_num;
		public String str;
	};


	// $ANTLR start "arith_expression"
	// myCompiler.g:260:1: arith_expression returns [int attr_type, int reg_num, String str] : a= multExpr ( PLUS b= multExpr | MINUS c= multExpr )* ;
	public final myCompilerParser.arith_expression_return arith_expression() throws RecognitionException {
		myCompilerParser.arith_expression_return retval = new myCompilerParser.arith_expression_return();
		retval.start = input.LT(1);
		int arith_expression_StartIndex = input.index();

		ParserRuleReturnScope a =null;
		ParserRuleReturnScope b =null;
		ParserRuleReturnScope c =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }

			// myCompiler.g:261:2: (a= multExpr ( PLUS b= multExpr | MINUS c= multExpr )* )
			// myCompiler.g:261:4: a= multExpr ( PLUS b= multExpr | MINUS c= multExpr )*
			{
			pushFollow(FOLLOW_multExpr_in_arith_expression614);
			a=multExpr();
			state._fsp--;


			              retval.attr_type = (a!=null?((myCompilerParser.multExpr_return)a).attr_type:0);
			              retval.reg_num = (a!=null?((myCompilerParser.multExpr_return)a).reg_num:0);
			              retval.str = (a!=null?((myCompilerParser.multExpr_return)a).str:null);
				      
			// myCompiler.g:267:5: ( PLUS b= multExpr | MINUS c= multExpr )*
			loop7:
			while (true) {
				int alt7=3;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==PLUS) ) {
					alt7=1;
				}
				else if ( (LA7_0==MINUS) ) {
					alt7=2;
				}

				switch (alt7) {
				case 1 :
					// myCompiler.g:267:7: PLUS b= multExpr
					{
					match(input,PLUS,FOLLOW_PLUS_in_arith_expression631); 
					pushFollow(FOLLOW_multExpr_in_arith_expression637);
					b=multExpr();
					state._fsp--;


					            // 檢查型態是否相同
					            if ((a!=null?((myCompilerParser.multExpr_return)a).attr_type:0) != (b!=null?((myCompilerParser.multExpr_return)b).attr_type:0)) 
					            {
					                System.out.println("Type Error: " + (a!=null?(a.start):null).getLine() + ": types of the operands in the addition-expressions are different");
					                retval.attr_type = -2;
					            }
					            // Code generation
					            TextCode.add("\t addl " + "%" + regMap.get((b!=null?((myCompilerParser.multExpr_return)b).reg_num:0)) + ", %" + regMap.get(retval.reg_num));
						      
					}
					break;
				case 2 :
					// myCompiler.g:278:6: MINUS c= multExpr
					{
					match(input,MINUS,FOLLOW_MINUS_in_arith_expression653); 
					pushFollow(FOLLOW_multExpr_in_arith_expression659);
					c=multExpr();
					state._fsp--;

					 
					            if ((a!=null?((myCompilerParser.multExpr_return)a).attr_type:0) != (c!=null?((myCompilerParser.multExpr_return)c).attr_type:0)) 
					            {
					                System.out.println("Type Error: " + (a!=null?(a.start):null).getLine() + ": types of the operands in the substract-expressions are different");
					                retval.attr_type = -2;
					            }
						        TextCode.add("\t subl " + "%" + regMap.get((c!=null?((myCompilerParser.multExpr_return)c).reg_num:0)) + ", %" + regMap.get(retval.reg_num));
						      
					}
					break;

				default :
					break loop7;
				}
			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "arith_expression"


	public static class multExpr_return extends ParserRuleReturnScope {
		public int attr_type;
		public int reg_num;
		public String str;
	};


	// $ANTLR start "multExpr"
	// myCompiler.g:291:1: multExpr returns [int attr_type, int reg_num, String str] : a= signExpr ( TIME b= signExpr | DIVIDE c= signExpr )* ;
	public final myCompilerParser.multExpr_return multExpr() throws RecognitionException {
		myCompilerParser.multExpr_return retval = new myCompilerParser.multExpr_return();
		retval.start = input.LT(1);
		int multExpr_StartIndex = input.index();

		ParserRuleReturnScope a =null;
		ParserRuleReturnScope b =null;
		ParserRuleReturnScope c =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }

			// myCompiler.g:292:2: (a= signExpr ( TIME b= signExpr | DIVIDE c= signExpr )* )
			// myCompiler.g:293:9: a= signExpr ( TIME b= signExpr | DIVIDE c= signExpr )*
			{
			pushFollow(FOLLOW_signExpr_in_multExpr704);
			a=signExpr();
			state._fsp--;

			 
			            retval.attr_type = (a!=null?((myCompilerParser.signExpr_return)a).attr_type:0);
			            retval.reg_num = (a!=null?((myCompilerParser.signExpr_return)a).reg_num:0);
			            retval.str = (a!=null?((myCompilerParser.signExpr_return)a).str:null);
			        
			// myCompiler.g:299:5: ( TIME b= signExpr | DIVIDE c= signExpr )*
			loop8:
			while (true) {
				int alt8=3;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==TIME) ) {
					alt8=1;
				}
				else if ( (LA8_0==DIVIDE) ) {
					alt8=2;
				}

				switch (alt8) {
				case 1 :
					// myCompiler.g:300:9: TIME b= signExpr
					{
					match(input,TIME,FOLLOW_TIME_in_multExpr732); 
					pushFollow(FOLLOW_signExpr_in_multExpr738);
					b=signExpr();
					state._fsp--;


					            // 檢查型態是否符合
					            if ((a!=null?((myCompilerParser.signExpr_return)a).attr_type:0) != (b!=null?((myCompilerParser.signExpr_return)b).attr_type:0)) 
					            {
					                System.out.println("Type Error: " + (a!=null?(a.start):null).getLine() + ": types of the operands in the (mul/div)-expressions are different");
					                retval.attr_type = -2;
					            }
					            // Code generation
					            TextCode.add("\t imul " + "%" + regMap.get((b!=null?((myCompilerParser.signExpr_return)b).reg_num:0)) + ", %" + regMap.get((a!=null?((myCompilerParser.signExpr_return)a).reg_num:0)));
					        
					}
					break;
				case 2 :
					// myCompiler.g:312:9: DIVIDE c= signExpr
					{
					match(input,DIVIDE,FOLLOW_DIVIDE_in_multExpr765); 
					pushFollow(FOLLOW_signExpr_in_multExpr771);
					c=signExpr();
					state._fsp--;

					 
					            // 檢查型態是否符合
					            if ((a!=null?((myCompilerParser.signExpr_return)a).attr_type:0) != (c!=null?((myCompilerParser.signExpr_return)c).attr_type:0)) 
					            {
					                System.out.println("Type Error: " + (a!=null?(a.start):null).getLine() + ": types of the operands in the (mul/div)-expressions are different");
					                retval.attr_type = -2;
					            }
					            // Code generation
					            TextCode.add("\t movl " + "%" + regMap.get((a!=null?((myCompilerParser.signExpr_return)a).reg_num:0)) + ", %eax");
					            TextCode.add("\t movl " + "$0" + ", %edx");
					            TextCode.add("\t idivl " + "%" + regMap.get((c!=null?((myCompilerParser.signExpr_return)c).reg_num:0)));
					            TextCode.add("\t movl "  + "%eax" + ", %" + regMap.get((a!=null?((myCompilerParser.signExpr_return)a).reg_num:0)));
					        
					}
					break;

				default :
					break loop8;
				}
			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "multExpr"


	public static class signExpr_return extends ParserRuleReturnScope {
		public int attr_type;
		public int reg_num;
		public String str;
	};


	// $ANTLR start "signExpr"
	// myCompiler.g:330:1: signExpr returns [int attr_type, int reg_num, String str] : ( primaryExpr | MINUS primaryExpr );
	public final myCompilerParser.signExpr_return signExpr() throws RecognitionException {
		myCompilerParser.signExpr_return retval = new myCompilerParser.signExpr_return();
		retval.start = input.LT(1);
		int signExpr_StartIndex = input.index();

		ParserRuleReturnScope primaryExpr6 =null;
		ParserRuleReturnScope primaryExpr7 =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }

			// myCompiler.g:331:2: ( primaryExpr | MINUS primaryExpr )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==Floating_point_constant||(LA9_0 >= Identifier && LA9_0 <= Integer_constant)||LA9_0==LPAREN||LA9_0==STRING_LITERAL) ) {
				alt9=1;
			}
			else if ( (LA9_0==MINUS) ) {
				alt9=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// myCompiler.g:332:9: primaryExpr
					{
					pushFollow(FOLLOW_primaryExpr_in_signExpr813);
					primaryExpr6=primaryExpr();
					state._fsp--;

					 
					            retval.attr_type = (primaryExpr6!=null?((myCompilerParser.primaryExpr_return)primaryExpr6).attr_type:0);
					            retval.reg_num = (primaryExpr6!=null?((myCompilerParser.primaryExpr_return)primaryExpr6).reg_num:0);
					            retval.str = (primaryExpr6!=null?((myCompilerParser.primaryExpr_return)primaryExpr6).str:null);
					        
					}
					break;
				case 2 :
					// myCompiler.g:339:9: MINUS primaryExpr
					{
					match(input,MINUS,FOLLOW_MINUS_in_signExpr837); 
					pushFollow(FOLLOW_primaryExpr_in_signExpr839);
					primaryExpr7=primaryExpr();
					state._fsp--;


					            retval.attr_type = (primaryExpr7!=null?((myCompilerParser.primaryExpr_return)primaryExpr7).attr_type:0);
					            retval.reg_num = (primaryExpr7!=null?((myCompilerParser.primaryExpr_return)primaryExpr7).reg_num:0);
					            retval.str = (primaryExpr7!=null?((myCompilerParser.primaryExpr_return)primaryExpr7).str:null);
					            // code generation
					            TextCode.add("\t negl " + "%" + regMap.get((primaryExpr7!=null?((myCompilerParser.primaryExpr_return)primaryExpr7).reg_num:0)));
					        
					}
					break;

			}
			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "signExpr"


	public static class primaryExpr_return extends ParserRuleReturnScope {
		public int attr_type;
		public int reg_num;
		public String str;
	};


	// $ANTLR start "primaryExpr"
	// myCompiler.g:350:1: primaryExpr returns [int attr_type, int reg_num, String str] : ( Integer_constant | Floating_point_constant | STRING_LITERAL | Identifier | LPAREN arith_expression RPAREN );
	public final myCompilerParser.primaryExpr_return primaryExpr() throws RecognitionException {
		myCompilerParser.primaryExpr_return retval = new myCompilerParser.primaryExpr_return();
		retval.start = input.LT(1);
		int primaryExpr_StartIndex = input.index();

		Token Integer_constant8=null;
		Token STRING_LITERAL9=null;
		Token Identifier10=null;
		ParserRuleReturnScope arith_expression11 =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }

			// myCompiler.g:351:5: ( Integer_constant | Floating_point_constant | STRING_LITERAL | Identifier | LPAREN arith_expression RPAREN )
			int alt10=5;
			switch ( input.LA(1) ) {
			case Integer_constant:
				{
				alt10=1;
				}
				break;
			case Floating_point_constant:
				{
				alt10=2;
				}
				break;
			case STRING_LITERAL:
				{
				alt10=3;
				}
				break;
			case Identifier:
				{
				alt10=4;
				}
				break;
			case LPAREN:
				{
				alt10=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}
			switch (alt10) {
				case 1 :
					// myCompiler.g:352:9: Integer_constant
					{
					Integer_constant8=(Token)match(input,Integer_constant,FOLLOW_Integer_constant_in_primaryExpr877); 
					 
					            retval.attr_type = 1;
					            retval.str = null;
					            // code generation
					            retval.reg_num = reg.get();  /* get an register */
					            TextCode.add("\t movl " + "$" + (Integer_constant8!=null?Integer_constant8.getText():null) + ", %" + regMap.get(retval.reg_num)); 
					        
					}
					break;
				case 2 :
					// myCompiler.g:361:9: Floating_point_constant
					{
					match(input,Floating_point_constant,FOLLOW_Floating_point_constant_in_primaryExpr904); 
					 
					            retval.attr_type = 2; 
					        
					}
					break;
				case 3 :
					// myCompiler.g:366:9: STRING_LITERAL
					{
					STRING_LITERAL9=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_primaryExpr932); 

					            retval.attr_type = 3; retval.str = (STRING_LITERAL9!=null?STRING_LITERAL9.getText():null); 
					        
					}
					break;
				case 4 :
					// myCompiler.g:371:9: Identifier
					{
					Identifier10=(Token)match(input,Identifier,FOLLOW_Identifier_in_primaryExpr960); 

					            if (symtab.containsKey((Identifier10!=null?Identifier10.getText():null))) 
					            {
					                retval.attr_type = symtab.get((Identifier10!=null?Identifier10.getText():null));
					            } 
					            else 
					            {
					                System.out.println("Type Error: " + Identifier10.getLine() + ": undeclared identifier " + (Identifier10!=null?Identifier10.getText():null));
					                retval.attr_type = -2;
					                // return retval.attr_type;
					            }
					            retval.str = null;
					            retval.reg_num = reg.get(); /* get an register */
					            // code generation
					            TextCode.add("\t movl " + (Identifier10!=null?Identifier10.getText():null) + "(%rip), %" + regMap.get(retval.reg_num));
					        
					}
					break;
				case 5 :
					// myCompiler.g:389:9: LPAREN arith_expression RPAREN
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_primaryExpr984); 
					pushFollow(FOLLOW_arith_expression_in_primaryExpr986);
					arith_expression11=arith_expression();
					state._fsp--;

					match(input,RPAREN,FOLLOW_RPAREN_in_primaryExpr988); 
					 
					            retval.attr_type = (arith_expression11!=null?((myCompilerParser.arith_expression_return)arith_expression11).attr_type:0); 
					        
					}
					break;

			}
			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "primaryExpr"



	// $ANTLR start "if_then_statements"
	// myCompiler.g:396:1: if_then_statements : ( statement | LBRACE statements RBRACE );
	public final void if_then_statements() throws RecognitionException {
		int if_then_statements_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return; }

			// myCompiler.g:397:2: ( statement | LBRACE statements RBRACE )
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==IF||LA11_0==Identifier||LA11_0==PRINT) ) {
				alt11=1;
			}
			else if ( (LA11_0==LBRACE) ) {
				alt11=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}

			switch (alt11) {
				case 1 :
					// myCompiler.g:398:9: statement
					{
					pushFollow(FOLLOW_statement_in_if_then_statements1024);
					statement();
					state._fsp--;

					}
					break;
				case 2 :
					// myCompiler.g:400:9: LBRACE statements RBRACE
					{
					match(input,LBRACE,FOLLOW_LBRACE_in_if_then_statements1040); 
					pushFollow(FOLLOW_statements_in_if_then_statements1042);
					statements();
					state._fsp--;

					match(input,RBRACE,FOLLOW_RBRACE_in_if_then_statements1044); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "if_then_statements"



	// $ANTLR start "printf_statement"
	// myCompiler.g:403:1: printf_statement : 'printf' '(' a= STRING_LITERAL ',' Identifier ')' ';' ;
	public final void printf_statement() throws RecognitionException {
		int printf_statement_StartIndex = input.index();

		Token a=null;
		Token Identifier12=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return; }

			// myCompiler.g:404:5: ( 'printf' '(' a= STRING_LITERAL ',' Identifier ')' ';' )
			// myCompiler.g:404:7: 'printf' '(' a= STRING_LITERAL ',' Identifier ')' ';'
			{
			match(input,PRINT,FOLLOW_PRINT_in_printf_statement1058); 
			match(input,LPAREN,FOLLOW_LPAREN_in_printf_statement1060); 
			a=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_printf_statement1064); 
			match(input,COMMA,FOLLOW_COMMA_in_printf_statement1066); 
			Identifier12=(Token)match(input,Identifier,FOLLOW_Identifier_in_printf_statement1068); 
			match(input,RPAREN,FOLLOW_RPAREN_in_printf_statement1071); 
			match(input,SEMI,FOLLOW_SEMI_in_printf_statement1073); 

			     String label = newLabel();
			     DataCode.add(label + ":");
			     DataCode.add("\t .string " + (a!=null?a.getText():null));
			     TextCode.add("\t movl " + (Identifier12!=null?Identifier12.getText():null) + "(%rip), " + "%esi");
			     TextCode.add("\t movl " + "$" + label + ", " + "%edi");
			     TextCode.add("\t call printf");
			    
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "printf_statement"

	// Delegated rules



	public static final BitSet FOLLOW_declarations_in_program91 = new BitSet(new long[]{0x0000010200840100L,0x00000000000008A0L});
	public static final BitSet FOLLOW_functions_in_program93 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_in_functions120 = new BitSet(new long[]{0x0000010200840100L,0x00000000000008A0L});
	public static final BitSet FOLLOW_functions_in_functions122 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_function155 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_Identifier_in_function157 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_LPAREN_in_function159 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_function161 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_LBRACE_in_function163 = new BitSet(new long[]{0x3000010680840100L,0x00000000000008A0L});
	public static final BitSet FOLLOW_l_declarations_in_function179 = new BitSet(new long[]{0x3000000480000000L});
	public static final BitSet FOLLOW_statements_in_function181 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_RBRACE_in_function183 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_declarations217 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_Identifier_in_declarations219 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_SEMI_in_declarations221 = new BitSet(new long[]{0x0000010200840100L,0x00000000000008A0L});
	public static final BitSet FOLLOW_declarations_in_declarations223 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_l_declarations275 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_Identifier_in_l_declarations277 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_SEMI_in_l_declarations279 = new BitSet(new long[]{0x0000010200840100L,0x00000000000008A0L});
	public static final BitSet FOLLOW_l_declarations_in_l_declarations281 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_type329 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_type343 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_type357 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VOID_in_type371 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SHORT_in_type385 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LONGLONG_in_type399 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOUBLE_in_type413 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRUCT_in_type427 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_statements455 = new BitSet(new long[]{0x1000000480000000L});
	public static final BitSet FOLLOW_statements_in_statements457 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_statement500 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ASSIGN_in_statement502 = new BitSet(new long[]{0x0000420C10000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_arith_expression_in_statement508 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_SEMI_in_statement510 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_statement536 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_LPAREN_in_statement538 = new BitSet(new long[]{0x0000420C10000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_arith_expression_in_statement540 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_statement542 = new BitSet(new long[]{0x1000001480000000L});
	public static final BitSet FOLLOW_if_then_statements_in_statement564 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_printf_statement_in_statement592 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multExpr_in_arith_expression614 = new BitSet(new long[]{0x0100400000000002L});
	public static final BitSet FOLLOW_PLUS_in_arith_expression631 = new BitSet(new long[]{0x0000420C10000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_multExpr_in_arith_expression637 = new BitSet(new long[]{0x0100400000000002L});
	public static final BitSet FOLLOW_MINUS_in_arith_expression653 = new BitSet(new long[]{0x0000420C10000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_multExpr_in_arith_expression659 = new BitSet(new long[]{0x0100400000000002L});
	public static final BitSet FOLLOW_signExpr_in_multExpr704 = new BitSet(new long[]{0x0000000000008002L,0x0000000000000200L});
	public static final BitSet FOLLOW_TIME_in_multExpr732 = new BitSet(new long[]{0x0000420C10000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_signExpr_in_multExpr738 = new BitSet(new long[]{0x0000000000008002L,0x0000000000000200L});
	public static final BitSet FOLLOW_DIVIDE_in_multExpr765 = new BitSet(new long[]{0x0000420C10000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_signExpr_in_multExpr771 = new BitSet(new long[]{0x0000000000008002L,0x0000000000000200L});
	public static final BitSet FOLLOW_primaryExpr_in_signExpr813 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MINUS_in_signExpr837 = new BitSet(new long[]{0x0000020C10000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_primaryExpr_in_signExpr839 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Integer_constant_in_primaryExpr877 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Floating_point_constant_in_primaryExpr904 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_primaryExpr932 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_primaryExpr960 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_primaryExpr984 = new BitSet(new long[]{0x0000420C10000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_arith_expression_in_primaryExpr986 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_primaryExpr988 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_if_then_statements1024 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LBRACE_in_if_then_statements1040 = new BitSet(new long[]{0x3000000480000000L});
	public static final BitSet FOLLOW_statements_in_if_then_statements1042 = new BitSet(new long[]{0x2000000000000000L});
	public static final BitSet FOLLOW_RBRACE_in_if_then_statements1044 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINT_in_printf_statement1058 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_LPAREN_in_printf_statement1060 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_printf_statement1064 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_COMMA_in_printf_statement1066 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_Identifier_in_printf_statement1068 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_printf_statement1071 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_SEMI_in_printf_statement1073 = new BitSet(new long[]{0x0000000000000002L});
}
