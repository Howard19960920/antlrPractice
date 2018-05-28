// $ANTLR 3.5.2 myChecker.g 2018-05-28 22:36:34

    // import packages here.
    import java.util.HashMap;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings("all")
public class myCheckerParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ASSIGN", "BREAK", "CASE", 
		"CHAR", "COLON", "COMMA", "COMMENT1", "COMMENT2", "CONTINUE", "DEC_NUM", 
		"DIGIT", "DIVIDE", "DIVIDEEQ", "DOT_", "DOUBLE", "ELSE", "ELSEIF", "EQ", 
		"FLOAT", "FLOAT_NUM", "FLOAT_NUM1", "FLOAT_NUM2", "FLOAT_NUM3", "FOR", 
		"GT", "GTEQ", "ID", "IF", "INCLUDE", "INT", "LBRACE", "LETTER", "LGAND", 
		"LGOR", "LONGLONG", "LPAREN", "LSHIFT", "LSQUARE", "LT", "LTEQ", "MINUS", 
		"MINUSEQ", "MM", "MOD", "MODEQ", "NEQ", "NEW_LINE", "NGT", "NLT", "NOT", 
		"OR", "PLUS", "PLUSEQ", "PP", "PRINT", "RBRACE", "RETURN", "RPAREN", "RSHIFT", 
		"RSQUARE", "SCANF", "SEMI", "SHARP", "SHORT", "STRING", "STRUCT", "SWITCH", 
		"TIME", "TIMEEQ", "VOID", "WHILE", "WS", "'.h'", "'main'"
	};
	public static final int EOF=-1;
	public static final int T__77=77;
	public static final int T__78=78;
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
	public static final int DEC_NUM=14;
	public static final int DIGIT=15;
	public static final int DIVIDE=16;
	public static final int DIVIDEEQ=17;
	public static final int DOT_=18;
	public static final int DOUBLE=19;
	public static final int ELSE=20;
	public static final int ELSEIF=21;
	public static final int EQ=22;
	public static final int FLOAT=23;
	public static final int FLOAT_NUM=24;
	public static final int FLOAT_NUM1=25;
	public static final int FLOAT_NUM2=26;
	public static final int FLOAT_NUM3=27;
	public static final int FOR=28;
	public static final int GT=29;
	public static final int GTEQ=30;
	public static final int ID=31;
	public static final int IF=32;
	public static final int INCLUDE=33;
	public static final int INT=34;
	public static final int LBRACE=35;
	public static final int LETTER=36;
	public static final int LGAND=37;
	public static final int LGOR=38;
	public static final int LONGLONG=39;
	public static final int LPAREN=40;
	public static final int LSHIFT=41;
	public static final int LSQUARE=42;
	public static final int LT=43;
	public static final int LTEQ=44;
	public static final int MINUS=45;
	public static final int MINUSEQ=46;
	public static final int MM=47;
	public static final int MOD=48;
	public static final int MODEQ=49;
	public static final int NEQ=50;
	public static final int NEW_LINE=51;
	public static final int NGT=52;
	public static final int NLT=53;
	public static final int NOT=54;
	public static final int OR=55;
	public static final int PLUS=56;
	public static final int PLUSEQ=57;
	public static final int PP=58;
	public static final int PRINT=59;
	public static final int RBRACE=60;
	public static final int RETURN=61;
	public static final int RPAREN=62;
	public static final int RSHIFT=63;
	public static final int RSQUARE=64;
	public static final int SCANF=65;
	public static final int SEMI=66;
	public static final int SHARP=67;
	public static final int SHORT=68;
	public static final int STRING=69;
	public static final int STRUCT=70;
	public static final int SWITCH=71;
	public static final int TIME=72;
	public static final int TIMEEQ=73;
	public static final int VOID=74;
	public static final int WHILE=75;
	public static final int WS=76;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public myCheckerParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public myCheckerParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
		this.state.ruleMemo = new HashMap[85+1];


	}

	@Override public String[] getTokenNames() { return myCheckerParser.tokenNames; }
	@Override public String getGrammarFileName() { return "myChecker.g"; }


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



	// $ANTLR start "entryPoint"
	// myChecker.g:39:1: entryPoint : ( INCLUDE '<' ID '.h' '>' )* ( subfunctions )* mainfunction ( subfunctions )* ;
	public final void entryPoint() throws RecognitionException {
		int entryPoint_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return; }

			// myChecker.g:40:5: ( ( INCLUDE '<' ID '.h' '>' )* ( subfunctions )* mainfunction ( subfunctions )* )
			// myChecker.g:42:5: ( INCLUDE '<' ID '.h' '>' )* ( subfunctions )* mainfunction ( subfunctions )*
			{
			// myChecker.g:42:5: ( INCLUDE '<' ID '.h' '>' )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==INCLUDE) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// myChecker.g:42:6: INCLUDE '<' ID '.h' '>'
					{
					match(input,INCLUDE,FOLLOW_INCLUDE_in_entryPoint78); if (state.failed) return;
					match(input,LT,FOLLOW_LT_in_entryPoint81); if (state.failed) return;
					match(input,ID,FOLLOW_ID_in_entryPoint83); if (state.failed) return;
					match(input,77,FOLLOW_77_in_entryPoint85); if (state.failed) return;
					match(input,GT,FOLLOW_GT_in_entryPoint87); if (state.failed) return;
					}
					break;

				default :
					break loop1;
				}
			}

			// myChecker.g:44:5: ( subfunctions )*
			loop2:
			while (true) {
				int alt2=2;
				switch ( input.LA(1) ) {
				case INT:
					{
					int LA2_1 = input.LA(2);
					if ( (LA2_1==ID) ) {
						alt2=1;
					}

					}
					break;
				case VOID:
					{
					int LA2_3 = input.LA(2);
					if ( (LA2_3==ID) ) {
						alt2=1;
					}

					}
					break;
				case CHAR:
				case DOUBLE:
				case FLOAT:
				case LONGLONG:
				case SHORT:
				case STRUCT:
					{
					alt2=1;
					}
					break;
				}
				switch (alt2) {
				case 1 :
					// myChecker.g:44:5: subfunctions
					{
					pushFollow(FOLLOW_subfunctions_in_entryPoint100);
					subfunctions();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop2;
				}
			}

			pushFollow(FOLLOW_mainfunction_in_entryPoint108);
			mainfunction();
			state._fsp--;
			if (state.failed) return;
			// myChecker.g:47:5: ( subfunctions )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==CHAR||LA3_0==DOUBLE||LA3_0==FLOAT||LA3_0==INT||LA3_0==LONGLONG||LA3_0==SHORT||LA3_0==STRUCT||LA3_0==VOID) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// myChecker.g:47:5: subfunctions
					{
					pushFollow(FOLLOW_subfunctions_in_entryPoint119);
					subfunctions();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop3;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 1, entryPoint_StartIndex); }

		}
	}
	// $ANTLR end "entryPoint"



	// $ANTLR start "vartypes"
	// myChecker.g:54:1: vartypes returns [int attr_type] : ( INT | FLOAT | CHAR | VOID | SHORT | LONGLONG | DOUBLE | STRUCT );
	public final int vartypes() throws RecognitionException {
		int attr_type = 0;

		int vartypes_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return attr_type; }

			// myChecker.g:55:3: ( INT | FLOAT | CHAR | VOID | SHORT | LONGLONG | DOUBLE | STRUCT )
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
				if (state.backtracking>0) {state.failed=true; return attr_type;}
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}
			switch (alt4) {
				case 1 :
					// myChecker.g:56:7: INT
					{
					match(input,INT,FOLLOW_INT_in_vartypes147); if (state.failed) return attr_type;
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("type: INT");  attr_type = 1; }
					}
					break;
				case 2 :
					// myChecker.g:57:7: FLOAT
					{
					match(input,FLOAT,FOLLOW_FLOAT_in_vartypes157); if (state.failed) return attr_type;
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("type: FLOAT");  attr_type = 2; }
					}
					break;
				case 3 :
					// myChecker.g:58:7: CHAR
					{
					match(input,CHAR,FOLLOW_CHAR_in_vartypes167); if (state.failed) return attr_type;
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("type: CHAR");  attr_type = 3; }
					}
					break;
				case 4 :
					// myChecker.g:59:7: VOID
					{
					match(input,VOID,FOLLOW_VOID_in_vartypes177); if (state.failed) return attr_type;
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("type: VOID");  attr_type = 4; }
					}
					break;
				case 5 :
					// myChecker.g:60:7: SHORT
					{
					match(input,SHORT,FOLLOW_SHORT_in_vartypes187); if (state.failed) return attr_type;
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("type: SHORT");  attr_type = 5; }
					}
					break;
				case 6 :
					// myChecker.g:61:7: LONGLONG
					{
					match(input,LONGLONG,FOLLOW_LONGLONG_in_vartypes197); if (state.failed) return attr_type;
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("type: LONGLONG");  attr_type = 6; }
					}
					break;
				case 7 :
					// myChecker.g:62:7: DOUBLE
					{
					match(input,DOUBLE,FOLLOW_DOUBLE_in_vartypes207); if (state.failed) return attr_type;
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("type: DOUBLE");  attr_type = 7; }
					}
					break;
				case 8 :
					// myChecker.g:63:7: STRUCT
					{
					match(input,STRUCT,FOLLOW_STRUCT_in_vartypes217); if (state.failed) return attr_type;
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("type: STRUCT");  attr_type = 8; }
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
			if ( state.backtracking>0 ) { memoize(input, 2, vartypes_StartIndex); }

		}
		return attr_type;
	}
	// $ANTLR end "vartypes"



	// $ANTLR start "vardeclarations"
	// myChecker.g:68:1: vardeclarations returns [int attr_type] : vartypes a= ID ( COMMA b= ID )* SEMI ;
	public final int vardeclarations() throws RecognitionException {
		int attr_type = 0;

		int vardeclarations_StartIndex = input.index();

		Token a=null;
		Token b=null;
		int vartypes1 =0;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return attr_type; }

			// myChecker.g:69:3: ( vartypes a= ID ( COMMA b= ID )* SEMI )
			// myChecker.g:72:5: vartypes a= ID ( COMMA b= ID )* SEMI
			{
			pushFollow(FOLLOW_vartypes_in_vardeclarations253);
			vartypes1=vartypes();
			state._fsp--;
			if (state.failed) return attr_type;
			a=(Token)match(input,ID,FOLLOW_ID_in_vardeclarations259); if (state.failed) return attr_type;
			// myChecker.g:72:21: ( COMMA b= ID )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==COMMA) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// myChecker.g:72:22: COMMA b= ID
					{
					match(input,COMMA,FOLLOW_COMMA_in_vardeclarations262); if (state.failed) return attr_type;
					b=(Token)match(input,ID,FOLLOW_ID_in_vardeclarations268); if (state.failed) return attr_type;
					}
					break;

				default :
					break loop5;
				}
			}

			match(input,SEMI,FOLLOW_SEMI_in_vardeclarations272); if (state.failed) return attr_type;
			if ( state.backtracking==0 ) {
				   if (symtab.containsKey((a!=null?a.getText():null))) 
			     {
				       System.out.println("Type Error: " + a.getLine() + ": redeclared identifier " + (a!=null?a.getText():null));
				   }
			     else
			     {
			           symtab.put((a!=null?a.getText():null), vartypes1);
				   }
				   
				   if ((b!=null?b.getText():null) != null)
			     {
						if (symtab.containsKey((b!=null?b.getText():null))) 
			      {
						    System.out.println("Type Error: " + b.getLine() + ": redeclared identifier " + (b!=null?b.getText():null) );
						}
			      else 
			      {
							symtab.put((b!=null?b.getText():null), vartypes1);
						}
				   }	   
				 }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 3, vardeclarations_StartIndex); }

		}
		return attr_type;
	}
	// $ANTLR end "vardeclarations"



	// $ANTLR start "varassignments"
	// myChecker.g:101:1: varassignments returns [int attr_type] : ID ASSIGN expressions SEMI ;
	public final int varassignments() throws RecognitionException {
		int attr_type = 0;

		int varassignments_StartIndex = input.index();

		Token ID2=null;
		ParserRuleReturnScope expressions3 =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return attr_type; }

			// myChecker.g:102:5: ( ID ASSIGN expressions SEMI )
			// myChecker.g:103:5: ID ASSIGN expressions SEMI
			{
			ID2=(Token)match(input,ID,FOLLOW_ID_in_varassignments301); if (state.failed) return attr_type;
			match(input,ASSIGN,FOLLOW_ASSIGN_in_varassignments303); if (state.failed) return attr_type;
			pushFollow(FOLLOW_expressions_in_varassignments305);
			expressions3=expressions();
			state._fsp--;
			if (state.failed) return attr_type;
			match(input,SEMI,FOLLOW_SEMI_in_varassignments307); if (state.failed) return attr_type;
			if ( state.backtracking==0 ) {
			     // 檢查是否存在此 identifier
				   if (symtab.containsKey((ID2!=null?ID2.getText():null))) 
			     {
				       attr_type = symtab.get((ID2!=null?ID2.getText():null));
				   } 
			     
			     else 
			     {
						System.out.println("Type Error: " + ID2.getLine() + ": undeclared identifier " + (ID2!=null?ID2.getText():null) );
						attr_type = -2;
						return attr_type;
				   }

			     // 檢查兩者型態 (vartypes) 是否一致
				   if (symtab.get((ID2!=null?ID2.getText():null)) != (expressions3!=null?((myCheckerParser.expressions_return)expressions3).attr_type:0)) 
			     {
						System.out.println("Type Error: " + (expressions3!=null?(expressions3.start):null).getLine() + ": types of leftside operand differs from the rightside operand");
						attr_type = -2;
			     }
				}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 4, varassignments_StartIndex); }

		}
		return attr_type;
	}
	// $ANTLR end "varassignments"


	public static class expressions_return extends ParserRuleReturnScope {
		public int attr_type;
	};


	// $ANTLR start "expressions"
	// myChecker.g:135:1: expressions returns [int attr_type] : a= operations ( LGAND b= operations | LGOR b= operations )* ;
	public final myCheckerParser.expressions_return expressions() throws RecognitionException {
		myCheckerParser.expressions_return retval = new myCheckerParser.expressions_return();
		retval.start = input.LT(1);
		int expressions_StartIndex = input.index();

		int a =0;
		int b =0;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }

			// myChecker.g:136:3: (a= operations ( LGAND b= operations | LGOR b= operations )* )
			// myChecker.g:137:3: a= operations ( LGAND b= operations | LGOR b= operations )*
			{
			pushFollow(FOLLOW_operations_in_expressions349);
			a=operations();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) {retval.attr_type = a;}
			// myChecker.g:137:47: ( LGAND b= operations | LGOR b= operations )*
			loop6:
			while (true) {
				int alt6=3;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==LGAND) ) {
					alt6=1;
				}
				else if ( (LA6_0==LGOR) ) {
					alt6=2;
				}

				switch (alt6) {
				case 1 :
					// myChecker.g:138:7: LGAND b= operations
					{
					match(input,LGAND,FOLLOW_LGAND_in_expressions361); if (state.failed) return retval;
					pushFollow(FOLLOW_operations_in_expressions367);
					b=operations();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;
				case 2 :
					// myChecker.g:139:7: LGOR b= operations
					{
					match(input,LGOR,FOLLOW_LGOR_in_expressions375); if (state.failed) return retval;
					pushFollow(FOLLOW_operations_in_expressions382);
					b=operations();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;

				default :
					break loop6;
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
			if ( state.backtracking>0 ) { memoize(input, 5, expressions_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "expressions"



	// $ANTLR start "operations"
	// myChecker.g:144:1: operations returns [int attr_type] : a= addexprs ( ( EQ | NEQ | LT | NLT | GT | NGT | GTEQ | LTEQ | ASSIGN | PLUSEQ | MINUSEQ | TIMEEQ | DIVIDEEQ ) b= addexprs )* ;
	public final int operations() throws RecognitionException {
		int attr_type = 0;

		int operations_StartIndex = input.index();

		ParserRuleReturnScope a =null;
		ParserRuleReturnScope b =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return attr_type; }

			// myChecker.g:145:3: (a= addexprs ( ( EQ | NEQ | LT | NLT | GT | NGT | GTEQ | LTEQ | ASSIGN | PLUSEQ | MINUSEQ | TIMEEQ | DIVIDEEQ ) b= addexprs )* )
			// myChecker.g:146:3: a= addexprs ( ( EQ | NEQ | LT | NLT | GT | NGT | GTEQ | LTEQ | ASSIGN | PLUSEQ | MINUSEQ | TIMEEQ | DIVIDEEQ ) b= addexprs )*
			{
			pushFollow(FOLLOW_addexprs_in_operations407);
			a=addexprs();
			state._fsp--;
			if (state.failed) return attr_type;
			if ( state.backtracking==0 ) { attr_type = (a!=null?((myCheckerParser.addexprs_return)a).attr_type:0); }
			// myChecker.g:146:47: ( ( EQ | NEQ | LT | NLT | GT | NGT | GTEQ | LTEQ | ASSIGN | PLUSEQ | MINUSEQ | TIMEEQ | DIVIDEEQ ) b= addexprs )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==ASSIGN||LA7_0==DIVIDEEQ||LA7_0==EQ||(LA7_0 >= GT && LA7_0 <= GTEQ)||(LA7_0 >= LT && LA7_0 <= LTEQ)||LA7_0==MINUSEQ||LA7_0==NEQ||(LA7_0 >= NGT && LA7_0 <= NLT)||LA7_0==PLUSEQ||LA7_0==TIMEEQ) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// myChecker.g:146:48: ( EQ | NEQ | LT | NLT | GT | NGT | GTEQ | LTEQ | ASSIGN | PLUSEQ | MINUSEQ | TIMEEQ | DIVIDEEQ ) b= addexprs
					{
					if ( input.LA(1)==ASSIGN||input.LA(1)==DIVIDEEQ||input.LA(1)==EQ||(input.LA(1) >= GT && input.LA(1) <= GTEQ)||(input.LA(1) >= LT && input.LA(1) <= LTEQ)||input.LA(1)==MINUSEQ||input.LA(1)==NEQ||(input.LA(1) >= NGT && input.LA(1) <= NLT)||input.LA(1)==PLUSEQ||input.LA(1)==TIMEEQ ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return attr_type;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_addexprs_in_operations516);
					b=addexprs();
					state._fsp--;
					if (state.failed) return attr_type;
					if ( state.backtracking==0 ) { 		
					      if ((a!=null?((myCheckerParser.addexprs_return)a).attr_type:0) != (b!=null?((myCheckerParser.addexprs_return)b).attr_type:0)) {
					          System.out.println("Type Error: " + (a!=null?(a.start):null).getLine() + ": types of the operands in the expressions are different");
					            attr_type = -2;
					      }
					    }
					}
					break;

				default :
					break loop7;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 6, operations_StartIndex); }

		}
		return attr_type;
	}
	// $ANTLR end "operations"


	public static class addexprs_return extends ParserRuleReturnScope {
		public int attr_type;
	};


	// $ANTLR start "addexprs"
	// myChecker.g:173:1: addexprs returns [int attr_type] : a= mulexprs ( PLUS b= mulexprs | MINUS c= mulexprs )* ;
	public final myCheckerParser.addexprs_return addexprs() throws RecognitionException {
		myCheckerParser.addexprs_return retval = new myCheckerParser.addexprs_return();
		retval.start = input.LT(1);
		int addexprs_StartIndex = input.index();

		ParserRuleReturnScope a =null;
		ParserRuleReturnScope b =null;
		ParserRuleReturnScope c =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }

			// myChecker.g:174:5: (a= mulexprs ( PLUS b= mulexprs | MINUS c= mulexprs )* )
			// myChecker.g:175:5: a= mulexprs ( PLUS b= mulexprs | MINUS c= mulexprs )*
			{
			pushFollow(FOLLOW_mulexprs_in_addexprs552);
			a=mulexprs();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) { retval.attr_type = (a!=null?((myCheckerParser.mulexprs_return)a).attr_type:0); }
			// myChecker.g:176:5: ( PLUS b= mulexprs | MINUS c= mulexprs )*
			loop8:
			while (true) {
				int alt8=3;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==PLUS) ) {
					alt8=1;
				}
				else if ( (LA8_0==MINUS) ) {
					alt8=2;
				}

				switch (alt8) {
				case 1 :
					// myChecker.g:176:6: PLUS b= mulexprs
					{
					match(input,PLUS,FOLLOW_PLUS_in_addexprs563); if (state.failed) return retval;
					pushFollow(FOLLOW_mulexprs_in_addexprs569);
					b=mulexprs();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) { 
					                if ((a!=null?((myCheckerParser.mulexprs_return)a).attr_type:0) != (b!=null?((myCheckerParser.mulexprs_return)b).attr_type:0)) 
					                {
					                  System.out.println("Type Error: " + (a!=null?(a.start):null).getLine() + ": types of the operands in the addition-expressions are different");
					                  retval.attr_type = -2;
					                }
					              }
					}
					break;
				case 2 :
					// myChecker.g:184:6: MINUS c= mulexprs
					{
					match(input,MINUS,FOLLOW_MINUS_in_addexprs592); if (state.failed) return retval;
					pushFollow(FOLLOW_mulexprs_in_addexprs598);
					c=mulexprs();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) { 
					                if ((a!=null?((myCheckerParser.mulexprs_return)a).attr_type:0) != (c!=null?((myCheckerParser.mulexprs_return)c).attr_type:0)) {
					                  System.out.println("Type Error: " + (a!=null?(a.start):null).getLine() + ": types of the operands in the substract-expressions are different");
					                retval.attr_type = -2;
					                }
					              }
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
			if ( state.backtracking>0 ) { memoize(input, 7, addexprs_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "addexprs"


	public static class mulexprs_return extends ParserRuleReturnScope {
		public int attr_type;
	};


	// $ANTLR start "mulexprs"
	// myChecker.g:197:1: mulexprs returns [int attr_type] : a= atomexprs ( ( TIME | DIVIDE ) b= atomexprs )* ;
	public final myCheckerParser.mulexprs_return mulexprs() throws RecognitionException {
		myCheckerParser.mulexprs_return retval = new myCheckerParser.mulexprs_return();
		retval.start = input.LT(1);
		int mulexprs_StartIndex = input.index();

		ParserRuleReturnScope a =null;
		ParserRuleReturnScope b =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }

			// myChecker.g:198:5: (a= atomexprs ( ( TIME | DIVIDE ) b= atomexprs )* )
			// myChecker.g:199:5: a= atomexprs ( ( TIME | DIVIDE ) b= atomexprs )*
			{
			pushFollow(FOLLOW_atomexprs_in_mulexprs646);
			a=atomexprs();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) { retval.attr_type = (a!=null?((myCheckerParser.atomexprs_return)a).attr_type:0); }
			// myChecker.g:200:9: ( ( TIME | DIVIDE ) b= atomexprs )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==DIVIDE||LA9_0==TIME) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// myChecker.g:200:10: ( TIME | DIVIDE ) b= atomexprs
					{
					if ( input.LA(1)==DIVIDE||input.LA(1)==TIME ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_atomexprs_in_mulexprs672);
					b=atomexprs();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) { 
					                              if ((a!=null?((myCheckerParser.atomexprs_return)a).attr_type:0) != (b!=null?((myCheckerParser.atomexprs_return)b).attr_type:0)) 
					                              {
					                                System.out.println("Type Error: " + (a!=null?(a.start):null).getLine() + ": types of the operands in the (mul/div)-expressions are different");
					                                retval.attr_type = -2;
					                              }
					                            }
					}
					break;

				default :
					break loop9;
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
			if ( state.backtracking>0 ) { memoize(input, 8, mulexprs_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "mulexprs"


	public static class atomexprs_return extends ParserRuleReturnScope {
		public int attr_type;
	};


	// $ANTLR start "atomexprs"
	// myChecker.g:213:1: atomexprs returns [int attr_type] : ( ID | DEC_NUM | FLOAT_NUM | LPAREN expressions RPAREN );
	public final myCheckerParser.atomexprs_return atomexprs() throws RecognitionException {
		myCheckerParser.atomexprs_return retval = new myCheckerParser.atomexprs_return();
		retval.start = input.LT(1);
		int atomexprs_StartIndex = input.index();

		Token ID4=null;
		ParserRuleReturnScope expressions5 =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }

			// myChecker.g:214:5: ( ID | DEC_NUM | FLOAT_NUM | LPAREN expressions RPAREN )
			int alt10=4;
			switch ( input.LA(1) ) {
			case ID:
				{
				alt10=1;
				}
				break;
			case DEC_NUM:
				{
				alt10=2;
				}
				break;
			case FLOAT_NUM:
				{
				alt10=3;
				}
				break;
			case LPAREN:
				{
				alt10=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}
			switch (alt10) {
				case 1 :
					// myChecker.g:215:5: ID
					{
					ID4=(Token)match(input,ID,FOLLOW_ID_in_atomexprs732); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					      if (symtab.containsKey((ID4!=null?ID4.getText():null))) 
					      {
					          retval.attr_type = symtab.get((ID4!=null?ID4.getText():null));
					      } 
					      else 
					      {
					        System.out.println("Type Error: " + ID4.getLine() + ": undeclared identifier " + (ID4!=null?ID4.getText():null));
					        retval.attr_type = -2;
					        // return retval.attr_type;
					      }
						 }
					}
					break;
				case 2 :
					// myChecker.g:228:7: DEC_NUM
					{
					match(input,DEC_NUM,FOLLOW_DEC_NUM_in_atomexprs746); if (state.failed) return retval;
					if ( state.backtracking==0 ) { retval.attr_type = 1; }
					}
					break;
				case 3 :
					// myChecker.g:229:7: FLOAT_NUM
					{
					match(input,FLOAT_NUM,FOLLOW_FLOAT_NUM_in_atomexprs756); if (state.failed) return retval;
					if ( state.backtracking==0 ) { retval.attr_type = 2; }
					}
					break;
				case 4 :
					// myChecker.g:230:7: LPAREN expressions RPAREN
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_atomexprs766); if (state.failed) return retval;
					pushFollow(FOLLOW_expressions_in_atomexprs768);
					expressions5=expressions();
					state._fsp--;
					if (state.failed) return retval;
					match(input,RPAREN,FOLLOW_RPAREN_in_atomexprs770); if (state.failed) return retval;
					if ( state.backtracking==0 ) { retval.attr_type = (expressions5!=null?((myCheckerParser.expressions_return)expressions5).attr_type:0); }
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
			if ( state.backtracking>0 ) { memoize(input, 9, atomexprs_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "atomexprs"



	// $ANTLR start "codelines"
	// myChecker.g:236:2: codelines : ( vardeclarations | varassignments | callfunctions | expressions | ifconditions | forloops | whileloops | continues | breaks );
	public final void codelines() throws RecognitionException {
		int codelines_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return; }

			// myChecker.g:237:2: ( vardeclarations | varassignments | callfunctions | expressions | ifconditions | forloops | whileloops | continues | breaks )
			int alt11=9;
			alt11 = dfa11.predict(input);
			switch (alt11) {
				case 1 :
					// myChecker.g:238:7: vardeclarations
					{
					pushFollow(FOLLOW_vardeclarations_in_codelines792);
					vardeclarations();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// myChecker.g:239:7: varassignments
					{
					pushFollow(FOLLOW_varassignments_in_codelines800);
					varassignments();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// myChecker.g:240:7: callfunctions
					{
					pushFollow(FOLLOW_callfunctions_in_codelines808);
					callfunctions();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					// myChecker.g:241:7: expressions
					{
					pushFollow(FOLLOW_expressions_in_codelines816);
					expressions();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 5 :
					// myChecker.g:242:7: ifconditions
					{
					pushFollow(FOLLOW_ifconditions_in_codelines824);
					ifconditions();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 6 :
					// myChecker.g:243:7: forloops
					{
					pushFollow(FOLLOW_forloops_in_codelines832);
					forloops();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 7 :
					// myChecker.g:244:7: whileloops
					{
					pushFollow(FOLLOW_whileloops_in_codelines840);
					whileloops();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 8 :
					// myChecker.g:245:7: continues
					{
					pushFollow(FOLLOW_continues_in_codelines848);
					continues();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 9 :
					// myChecker.g:246:7: breaks
					{
					pushFollow(FOLLOW_breaks_in_codelines856);
					breaks();
					state._fsp--;
					if (state.failed) return;
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
			if ( state.backtracking>0 ) { memoize(input, 10, codelines_StartIndex); }

		}
	}
	// $ANTLR end "codelines"



	// $ANTLR start "ifconditions"
	// myChecker.g:251:1: ifconditions : IF LPAREN expressions RPAREN LBRACE ( codelines )* RBRACE ( ELSEIF LPAREN expressions RPAREN LBRACE ( codelines )* RBRACE )* ( ELSE LBRACE ( codelines )* RBRACE )? ;
	public final void ifconditions() throws RecognitionException {
		int ifconditions_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return; }

			// myChecker.g:252:3: ( IF LPAREN expressions RPAREN LBRACE ( codelines )* RBRACE ( ELSEIF LPAREN expressions RPAREN LBRACE ( codelines )* RBRACE )* ( ELSE LBRACE ( codelines )* RBRACE )? )
			// myChecker.g:253:3: IF LPAREN expressions RPAREN LBRACE ( codelines )* RBRACE ( ELSEIF LPAREN expressions RPAREN LBRACE ( codelines )* RBRACE )* ( ELSE LBRACE ( codelines )* RBRACE )?
			{
			match(input,IF,FOLLOW_IF_in_ifconditions870); if (state.failed) return;
			match(input,LPAREN,FOLLOW_LPAREN_in_ifconditions872); if (state.failed) return;
			pushFollow(FOLLOW_expressions_in_ifconditions874);
			expressions();
			state._fsp--;
			if (state.failed) return;
			match(input,RPAREN,FOLLOW_RPAREN_in_ifconditions876); if (state.failed) return;
			match(input,LBRACE,FOLLOW_LBRACE_in_ifconditions884); if (state.failed) return;
			// myChecker.g:257:5: ( codelines )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==BREAK||LA12_0==CHAR||(LA12_0 >= CONTINUE && LA12_0 <= DEC_NUM)||LA12_0==DOUBLE||(LA12_0 >= FLOAT && LA12_0 <= FLOAT_NUM)||LA12_0==FOR||(LA12_0 >= ID && LA12_0 <= IF)||LA12_0==INT||(LA12_0 >= LONGLONG && LA12_0 <= LPAREN)||LA12_0==SHORT||LA12_0==STRUCT||(LA12_0 >= VOID && LA12_0 <= WHILE)) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// myChecker.g:257:5: codelines
					{
					pushFollow(FOLLOW_codelines_in_ifconditions893);
					codelines();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop12;
				}
			}

			match(input,RBRACE,FOLLOW_RBRACE_in_ifconditions898); if (state.failed) return;
			// myChecker.g:263:3: ( ELSEIF LPAREN expressions RPAREN LBRACE ( codelines )* RBRACE )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==ELSEIF) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// myChecker.g:263:4: ELSEIF LPAREN expressions RPAREN LBRACE ( codelines )* RBRACE
					{
					match(input,ELSEIF,FOLLOW_ELSEIF_in_ifconditions911); if (state.failed) return;
					match(input,LPAREN,FOLLOW_LPAREN_in_ifconditions913); if (state.failed) return;
					pushFollow(FOLLOW_expressions_in_ifconditions915);
					expressions();
					state._fsp--;
					if (state.failed) return;
					match(input,RPAREN,FOLLOW_RPAREN_in_ifconditions917); if (state.failed) return;
					match(input,LBRACE,FOLLOW_LBRACE_in_ifconditions921); if (state.failed) return;
					// myChecker.g:265:5: ( codelines )*
					loop13:
					while (true) {
						int alt13=2;
						int LA13_0 = input.LA(1);
						if ( (LA13_0==BREAK||LA13_0==CHAR||(LA13_0 >= CONTINUE && LA13_0 <= DEC_NUM)||LA13_0==DOUBLE||(LA13_0 >= FLOAT && LA13_0 <= FLOAT_NUM)||LA13_0==FOR||(LA13_0 >= ID && LA13_0 <= IF)||LA13_0==INT||(LA13_0 >= LONGLONG && LA13_0 <= LPAREN)||LA13_0==SHORT||LA13_0==STRUCT||(LA13_0 >= VOID && LA13_0 <= WHILE)) ) {
							alt13=1;
						}

						switch (alt13) {
						case 1 :
							// myChecker.g:265:5: codelines
							{
							pushFollow(FOLLOW_codelines_in_ifconditions927);
							codelines();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							break loop13;
						}
					}

					match(input,RBRACE,FOLLOW_RBRACE_in_ifconditions932); if (state.failed) return;
					}
					break;

				default :
					break loop14;
				}
			}

			// myChecker.g:271:3: ( ELSE LBRACE ( codelines )* RBRACE )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==ELSE) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// myChecker.g:271:4: ELSE LBRACE ( codelines )* RBRACE
					{
					match(input,ELSE,FOLLOW_ELSE_in_ifconditions947); if (state.failed) return;
					match(input,LBRACE,FOLLOW_LBRACE_in_ifconditions951); if (state.failed) return;
					// myChecker.g:273:5: ( codelines )*
					loop15:
					while (true) {
						int alt15=2;
						int LA15_0 = input.LA(1);
						if ( (LA15_0==BREAK||LA15_0==CHAR||(LA15_0 >= CONTINUE && LA15_0 <= DEC_NUM)||LA15_0==DOUBLE||(LA15_0 >= FLOAT && LA15_0 <= FLOAT_NUM)||LA15_0==FOR||(LA15_0 >= ID && LA15_0 <= IF)||LA15_0==INT||(LA15_0 >= LONGLONG && LA15_0 <= LPAREN)||LA15_0==SHORT||LA15_0==STRUCT||(LA15_0 >= VOID && LA15_0 <= WHILE)) ) {
							alt15=1;
						}

						switch (alt15) {
						case 1 :
							// myChecker.g:273:5: codelines
							{
							pushFollow(FOLLOW_codelines_in_ifconditions957);
							codelines();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							break loop15;
						}
					}

					match(input,RBRACE,FOLLOW_RBRACE_in_ifconditions962); if (state.failed) return;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 11, ifconditions_StartIndex); }

		}
	}
	// $ANTLR end "ifconditions"



	// $ANTLR start "forloops"
	// myChecker.g:280:1: forloops : FOR LPAREN ( expressions )* SEMI ( expressions )* SEMI ( expressions )* RPAREN LBRACE ( codelines )* RBRACE ;
	public final void forloops() throws RecognitionException {
		int forloops_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return; }

			// myChecker.g:281:3: ( FOR LPAREN ( expressions )* SEMI ( expressions )* SEMI ( expressions )* RPAREN LBRACE ( codelines )* RBRACE )
			// myChecker.g:283:3: FOR LPAREN ( expressions )* SEMI ( expressions )* SEMI ( expressions )* RPAREN LBRACE ( codelines )* RBRACE
			{
			match(input,FOR,FOLLOW_FOR_in_forloops983); if (state.failed) return;
			match(input,LPAREN,FOLLOW_LPAREN_in_forloops985); if (state.failed) return;
			// myChecker.g:283:14: ( expressions )*
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( (LA17_0==DEC_NUM||LA17_0==FLOAT_NUM||LA17_0==ID||LA17_0==LPAREN) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// myChecker.g:283:14: expressions
					{
					pushFollow(FOLLOW_expressions_in_forloops987);
					expressions();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop17;
				}
			}

			match(input,SEMI,FOLLOW_SEMI_in_forloops990); if (state.failed) return;
			// myChecker.g:283:32: ( expressions )*
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==DEC_NUM||LA18_0==FLOAT_NUM||LA18_0==ID||LA18_0==LPAREN) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// myChecker.g:283:32: expressions
					{
					pushFollow(FOLLOW_expressions_in_forloops992);
					expressions();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop18;
				}
			}

			match(input,SEMI,FOLLOW_SEMI_in_forloops995); if (state.failed) return;
			// myChecker.g:283:50: ( expressions )*
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==DEC_NUM||LA19_0==FLOAT_NUM||LA19_0==ID||LA19_0==LPAREN) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// myChecker.g:283:50: expressions
					{
					pushFollow(FOLLOW_expressions_in_forloops997);
					expressions();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop19;
				}
			}

			match(input,RPAREN,FOLLOW_RPAREN_in_forloops1001); if (state.failed) return;
			match(input,LBRACE,FOLLOW_LBRACE_in_forloops1005); if (state.failed) return;
			// myChecker.g:285:5: ( codelines )*
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==BREAK||LA20_0==CHAR||(LA20_0 >= CONTINUE && LA20_0 <= DEC_NUM)||LA20_0==DOUBLE||(LA20_0 >= FLOAT && LA20_0 <= FLOAT_NUM)||LA20_0==FOR||(LA20_0 >= ID && LA20_0 <= IF)||LA20_0==INT||(LA20_0 >= LONGLONG && LA20_0 <= LPAREN)||LA20_0==SHORT||LA20_0==STRUCT||(LA20_0 >= VOID && LA20_0 <= WHILE)) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// myChecker.g:285:5: codelines
					{
					pushFollow(FOLLOW_codelines_in_forloops1011);
					codelines();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop20;
				}
			}

			match(input,RBRACE,FOLLOW_RBRACE_in_forloops1016); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 12, forloops_StartIndex); }

		}
	}
	// $ANTLR end "forloops"



	// $ANTLR start "whileloops"
	// myChecker.g:290:1: whileloops : WHILE LPAREN ( expressions )+ RPAREN LBRACE ( codelines )* RBRACE ;
	public final void whileloops() throws RecognitionException {
		int whileloops_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return; }

			// myChecker.g:291:3: ( WHILE LPAREN ( expressions )+ RPAREN LBRACE ( codelines )* RBRACE )
			// myChecker.g:293:3: WHILE LPAREN ( expressions )+ RPAREN LBRACE ( codelines )* RBRACE
			{
			match(input,WHILE,FOLLOW_WHILE_in_whileloops1031); if (state.failed) return;
			match(input,LPAREN,FOLLOW_LPAREN_in_whileloops1033); if (state.failed) return;
			// myChecker.g:293:16: ( expressions )+
			int cnt21=0;
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( (LA21_0==DEC_NUM||LA21_0==FLOAT_NUM||LA21_0==ID||LA21_0==LPAREN) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// myChecker.g:293:16: expressions
					{
					pushFollow(FOLLOW_expressions_in_whileloops1035);
					expressions();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					if ( cnt21 >= 1 ) break loop21;
					if (state.backtracking>0) {state.failed=true; return;}
					EarlyExitException eee = new EarlyExitException(21, input);
					throw eee;
				}
				cnt21++;
			}

			match(input,RPAREN,FOLLOW_RPAREN_in_whileloops1038); if (state.failed) return;
			match(input,LBRACE,FOLLOW_LBRACE_in_whileloops1042); if (state.failed) return;
			// myChecker.g:295:5: ( codelines )*
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0==BREAK||LA22_0==CHAR||(LA22_0 >= CONTINUE && LA22_0 <= DEC_NUM)||LA22_0==DOUBLE||(LA22_0 >= FLOAT && LA22_0 <= FLOAT_NUM)||LA22_0==FOR||(LA22_0 >= ID && LA22_0 <= IF)||LA22_0==INT||(LA22_0 >= LONGLONG && LA22_0 <= LPAREN)||LA22_0==SHORT||LA22_0==STRUCT||(LA22_0 >= VOID && LA22_0 <= WHILE)) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// myChecker.g:295:5: codelines
					{
					pushFollow(FOLLOW_codelines_in_whileloops1048);
					codelines();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop22;
				}
			}

			match(input,RBRACE,FOLLOW_RBRACE_in_whileloops1053); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 13, whileloops_StartIndex); }

		}
	}
	// $ANTLR end "whileloops"



	// $ANTLR start "continues"
	// myChecker.g:300:1: continues : CONTINUE SEMI ;
	public final void continues() throws RecognitionException {
		int continues_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return; }

			// myChecker.g:301:3: ( CONTINUE SEMI )
			// myChecker.g:302:3: CONTINUE SEMI
			{
			match(input,CONTINUE,FOLLOW_CONTINUE_in_continues1065); if (state.failed) return;
			match(input,SEMI,FOLLOW_SEMI_in_continues1067); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 14, continues_StartIndex); }

		}
	}
	// $ANTLR end "continues"



	// $ANTLR start "breaks"
	// myChecker.g:306:1: breaks : BREAK SEMI ;
	public final void breaks() throws RecognitionException {
		int breaks_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return; }

			// myChecker.g:307:3: ( BREAK SEMI )
			// myChecker.g:308:3: BREAK SEMI
			{
			match(input,BREAK,FOLLOW_BREAK_in_breaks1079); if (state.failed) return;
			match(input,SEMI,FOLLOW_SEMI_in_breaks1081); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 15, breaks_StartIndex); }

		}
	}
	// $ANTLR end "breaks"



	// $ANTLR start "parameters"
	// myChecker.g:313:1: parameters : vartypes ID ( COMMA vartypes ID )* ;
	public final void parameters() throws RecognitionException {
		int parameters_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return; }

			// myChecker.g:314:3: ( vartypes ID ( COMMA vartypes ID )* )
			// myChecker.g:315:3: vartypes ID ( COMMA vartypes ID )*
			{
			pushFollow(FOLLOW_vartypes_in_parameters1094);
			vartypes();
			state._fsp--;
			if (state.failed) return;
			match(input,ID,FOLLOW_ID_in_parameters1096); if (state.failed) return;
			// myChecker.g:315:15: ( COMMA vartypes ID )*
			loop23:
			while (true) {
				int alt23=2;
				int LA23_0 = input.LA(1);
				if ( (LA23_0==COMMA) ) {
					alt23=1;
				}

				switch (alt23) {
				case 1 :
					// myChecker.g:315:16: COMMA vartypes ID
					{
					match(input,COMMA,FOLLOW_COMMA_in_parameters1099); if (state.failed) return;
					pushFollow(FOLLOW_vartypes_in_parameters1101);
					vartypes();
					state._fsp--;
					if (state.failed) return;
					match(input,ID,FOLLOW_ID_in_parameters1103); if (state.failed) return;
					}
					break;

				default :
					break loop23;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 16, parameters_StartIndex); }

		}
	}
	// $ANTLR end "parameters"



	// $ANTLR start "argvs"
	// myChecker.g:320:1: argvs : expressions ( COMMA expressions )* ;
	public final void argvs() throws RecognitionException {
		int argvs_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return; }

			// myChecker.g:321:3: ( expressions ( COMMA expressions )* )
			// myChecker.g:322:3: expressions ( COMMA expressions )*
			{
			pushFollow(FOLLOW_expressions_in_argvs1118);
			expressions();
			state._fsp--;
			if (state.failed) return;
			// myChecker.g:322:14: ( COMMA expressions )*
			loop24:
			while (true) {
				int alt24=2;
				int LA24_0 = input.LA(1);
				if ( (LA24_0==COMMA) ) {
					alt24=1;
				}

				switch (alt24) {
				case 1 :
					// myChecker.g:322:15: COMMA expressions
					{
					match(input,COMMA,FOLLOW_COMMA_in_argvs1120); if (state.failed) return;
					pushFollow(FOLLOW_expressions_in_argvs1122);
					expressions();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop24;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 17, argvs_StartIndex); }

		}
	}
	// $ANTLR end "argvs"



	// $ANTLR start "retvals"
	// myChecker.g:327:1: retvals : RETURN ( expressions )? SEMI ;
	public final void retvals() throws RecognitionException {
		int retvals_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return; }

			// myChecker.g:328:3: ( RETURN ( expressions )? SEMI )
			// myChecker.g:329:3: RETURN ( expressions )? SEMI
			{
			match(input,RETURN,FOLLOW_RETURN_in_retvals1138); if (state.failed) return;
			// myChecker.g:329:10: ( expressions )?
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==DEC_NUM||LA25_0==FLOAT_NUM||LA25_0==ID||LA25_0==LPAREN) ) {
				alt25=1;
			}
			switch (alt25) {
				case 1 :
					// myChecker.g:329:11: expressions
					{
					pushFollow(FOLLOW_expressions_in_retvals1141);
					expressions();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			match(input,SEMI,FOLLOW_SEMI_in_retvals1145); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 18, retvals_StartIndex); }

		}
	}
	// $ANTLR end "retvals"



	// $ANTLR start "subfunctions"
	// myChecker.g:334:1: subfunctions : ( vartypes ID LPAREN ( parameters )? RPAREN SEMI | vartypes ID LPAREN ( parameters )? RPAREN LBRACE ( codelines )* retvals RBRACE );
	public final void subfunctions() throws RecognitionException {
		int subfunctions_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return; }

			// myChecker.g:335:5: ( vartypes ID LPAREN ( parameters )? RPAREN SEMI | vartypes ID LPAREN ( parameters )? RPAREN LBRACE ( codelines )* retvals RBRACE )
			int alt29=2;
			alt29 = dfa29.predict(input);
			switch (alt29) {
				case 1 :
					// myChecker.g:336:5: vartypes ID LPAREN ( parameters )? RPAREN SEMI
					{
					pushFollow(FOLLOW_vartypes_in_subfunctions1165);
					vartypes();
					state._fsp--;
					if (state.failed) return;
					match(input,ID,FOLLOW_ID_in_subfunctions1167); if (state.failed) return;
					match(input,LPAREN,FOLLOW_LPAREN_in_subfunctions1169); if (state.failed) return;
					// myChecker.g:336:24: ( parameters )?
					int alt26=2;
					int LA26_0 = input.LA(1);
					if ( (LA26_0==CHAR||LA26_0==DOUBLE||LA26_0==FLOAT||LA26_0==INT||LA26_0==LONGLONG||LA26_0==SHORT||LA26_0==STRUCT||LA26_0==VOID) ) {
						alt26=1;
					}
					switch (alt26) {
						case 1 :
							// myChecker.g:336:24: parameters
							{
							pushFollow(FOLLOW_parameters_in_subfunctions1171);
							parameters();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					match(input,RPAREN,FOLLOW_RPAREN_in_subfunctions1174); if (state.failed) return;
					match(input,SEMI,FOLLOW_SEMI_in_subfunctions1176); if (state.failed) return;
					}
					break;
				case 2 :
					// myChecker.g:339:5: vartypes ID LPAREN ( parameters )? RPAREN LBRACE ( codelines )* retvals RBRACE
					{
					pushFollow(FOLLOW_vartypes_in_subfunctions1188);
					vartypes();
					state._fsp--;
					if (state.failed) return;
					match(input,ID,FOLLOW_ID_in_subfunctions1190); if (state.failed) return;
					match(input,LPAREN,FOLLOW_LPAREN_in_subfunctions1192); if (state.failed) return;
					// myChecker.g:339:24: ( parameters )?
					int alt27=2;
					int LA27_0 = input.LA(1);
					if ( (LA27_0==CHAR||LA27_0==DOUBLE||LA27_0==FLOAT||LA27_0==INT||LA27_0==LONGLONG||LA27_0==SHORT||LA27_0==STRUCT||LA27_0==VOID) ) {
						alt27=1;
					}
					switch (alt27) {
						case 1 :
							// myChecker.g:339:24: parameters
							{
							pushFollow(FOLLOW_parameters_in_subfunctions1194);
							parameters();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					match(input,RPAREN,FOLLOW_RPAREN_in_subfunctions1197); if (state.failed) return;
					match(input,LBRACE,FOLLOW_LBRACE_in_subfunctions1204); if (state.failed) return;
					// myChecker.g:341:7: ( codelines )*
					loop28:
					while (true) {
						int alt28=2;
						int LA28_0 = input.LA(1);
						if ( (LA28_0==BREAK||LA28_0==CHAR||(LA28_0 >= CONTINUE && LA28_0 <= DEC_NUM)||LA28_0==DOUBLE||(LA28_0 >= FLOAT && LA28_0 <= FLOAT_NUM)||LA28_0==FOR||(LA28_0 >= ID && LA28_0 <= IF)||LA28_0==INT||(LA28_0 >= LONGLONG && LA28_0 <= LPAREN)||LA28_0==SHORT||LA28_0==STRUCT||(LA28_0 >= VOID && LA28_0 <= WHILE)) ) {
							alt28=1;
						}

						switch (alt28) {
						case 1 :
							// myChecker.g:341:7: codelines
							{
							pushFollow(FOLLOW_codelines_in_subfunctions1212);
							codelines();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							break loop28;
						}
					}

					pushFollow(FOLLOW_retvals_in_subfunctions1221);
					retvals();
					state._fsp--;
					if (state.failed) return;
					match(input,RBRACE,FOLLOW_RBRACE_in_subfunctions1227); if (state.failed) return;
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
			if ( state.backtracking>0 ) { memoize(input, 19, subfunctions_StartIndex); }

		}
	}
	// $ANTLR end "subfunctions"



	// $ANTLR start "callfunctions"
	// myChecker.g:347:1: callfunctions : ID LPAREN ( argvs )? RPAREN SEMI ;
	public final void callfunctions() throws RecognitionException {
		int callfunctions_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return; }

			// myChecker.g:348:3: ( ID LPAREN ( argvs )? RPAREN SEMI )
			// myChecker.g:349:3: ID LPAREN ( argvs )? RPAREN SEMI
			{
			match(input,ID,FOLLOW_ID_in_callfunctions1239); if (state.failed) return;
			match(input,LPAREN,FOLLOW_LPAREN_in_callfunctions1241); if (state.failed) return;
			// myChecker.g:349:13: ( argvs )?
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( (LA30_0==DEC_NUM||LA30_0==FLOAT_NUM||LA30_0==ID||LA30_0==LPAREN) ) {
				alt30=1;
			}
			switch (alt30) {
				case 1 :
					// myChecker.g:349:13: argvs
					{
					pushFollow(FOLLOW_argvs_in_callfunctions1243);
					argvs();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			match(input,RPAREN,FOLLOW_RPAREN_in_callfunctions1246); if (state.failed) return;
			match(input,SEMI,FOLLOW_SEMI_in_callfunctions1248); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 20, callfunctions_StartIndex); }

		}
	}
	// $ANTLR end "callfunctions"



	// $ANTLR start "mainfunction"
	// myChecker.g:354:1: mainfunction : ( INT | VOID )? 'main' LPAREN ( parameters )? RPAREN LBRACE ( codelines )* retvals RBRACE ;
	public final void mainfunction() throws RecognitionException {
		int mainfunction_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return; }

			// myChecker.g:355:3: ( ( INT | VOID )? 'main' LPAREN ( parameters )? RPAREN LBRACE ( codelines )* retvals RBRACE )
			// myChecker.g:356:3: ( INT | VOID )? 'main' LPAREN ( parameters )? RPAREN LBRACE ( codelines )* retvals RBRACE
			{
			// myChecker.g:356:3: ( INT | VOID )?
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==INT||LA31_0==VOID) ) {
				alt31=1;
			}
			switch (alt31) {
				case 1 :
					// myChecker.g:
					{
					if ( input.LA(1)==INT||input.LA(1)==VOID ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					}
					break;

			}

			match(input,78,FOLLOW_78_in_mainfunction1270); if (state.failed) return;
			match(input,LPAREN,FOLLOW_LPAREN_in_mainfunction1272); if (state.failed) return;
			// myChecker.g:356:31: ( parameters )?
			int alt32=2;
			int LA32_0 = input.LA(1);
			if ( (LA32_0==CHAR||LA32_0==DOUBLE||LA32_0==FLOAT||LA32_0==INT||LA32_0==LONGLONG||LA32_0==SHORT||LA32_0==STRUCT||LA32_0==VOID) ) {
				alt32=1;
			}
			switch (alt32) {
				case 1 :
					// myChecker.g:356:31: parameters
					{
					pushFollow(FOLLOW_parameters_in_mainfunction1274);
					parameters();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			match(input,RPAREN,FOLLOW_RPAREN_in_mainfunction1277); if (state.failed) return;
			match(input,LBRACE,FOLLOW_LBRACE_in_mainfunction1281); if (state.failed) return;
			// myChecker.g:358:5: ( codelines )*
			loop33:
			while (true) {
				int alt33=2;
				int LA33_0 = input.LA(1);
				if ( (LA33_0==BREAK||LA33_0==CHAR||(LA33_0 >= CONTINUE && LA33_0 <= DEC_NUM)||LA33_0==DOUBLE||(LA33_0 >= FLOAT && LA33_0 <= FLOAT_NUM)||LA33_0==FOR||(LA33_0 >= ID && LA33_0 <= IF)||LA33_0==INT||(LA33_0 >= LONGLONG && LA33_0 <= LPAREN)||LA33_0==SHORT||LA33_0==STRUCT||(LA33_0 >= VOID && LA33_0 <= WHILE)) ) {
					alt33=1;
				}

				switch (alt33) {
				case 1 :
					// myChecker.g:358:5: codelines
					{
					pushFollow(FOLLOW_codelines_in_mainfunction1287);
					codelines();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop33;
				}
			}

			pushFollow(FOLLOW_retvals_in_mainfunction1294);
			retvals();
			state._fsp--;
			if (state.failed) return;
			match(input,RBRACE,FOLLOW_RBRACE_in_mainfunction1298); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 21, mainfunction_StartIndex); }

		}
	}
	// $ANTLR end "mainfunction"

	// $ANTLR start synpred35_myChecker
	public final void synpred35_myChecker_fragment() throws RecognitionException {
		// myChecker.g:239:7: ( varassignments )
		// myChecker.g:239:7: varassignments
		{
		pushFollow(FOLLOW_varassignments_in_synpred35_myChecker800);
		varassignments();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred35_myChecker

	// $ANTLR start synpred36_myChecker
	public final void synpred36_myChecker_fragment() throws RecognitionException {
		// myChecker.g:240:7: ( callfunctions )
		// myChecker.g:240:7: callfunctions
		{
		pushFollow(FOLLOW_callfunctions_in_synpred36_myChecker808);
		callfunctions();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred36_myChecker

	// $ANTLR start synpred37_myChecker
	public final void synpred37_myChecker_fragment() throws RecognitionException {
		// myChecker.g:241:7: ( expressions )
		// myChecker.g:241:7: expressions
		{
		pushFollow(FOLLOW_expressions_in_synpred37_myChecker816);
		expressions();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred37_myChecker

	// $ANTLR start synpred57_myChecker
	public final void synpred57_myChecker_fragment() throws RecognitionException {
		// myChecker.g:336:5: ( vartypes ID LPAREN ( parameters )? RPAREN SEMI )
		// myChecker.g:336:5: vartypes ID LPAREN ( parameters )? RPAREN SEMI
		{
		pushFollow(FOLLOW_vartypes_in_synpred57_myChecker1165);
		vartypes();
		state._fsp--;
		if (state.failed) return;
		match(input,ID,FOLLOW_ID_in_synpred57_myChecker1167); if (state.failed) return;
		match(input,LPAREN,FOLLOW_LPAREN_in_synpred57_myChecker1169); if (state.failed) return;
		// myChecker.g:336:24: ( parameters )?
		int alt36=2;
		int LA36_0 = input.LA(1);
		if ( (LA36_0==CHAR||LA36_0==DOUBLE||LA36_0==FLOAT||LA36_0==INT||LA36_0==LONGLONG||LA36_0==SHORT||LA36_0==STRUCT||LA36_0==VOID) ) {
			alt36=1;
		}
		switch (alt36) {
			case 1 :
				// myChecker.g:336:24: parameters
				{
				pushFollow(FOLLOW_parameters_in_synpred57_myChecker1171);
				parameters();
				state._fsp--;
				if (state.failed) return;
				}
				break;

		}

		match(input,RPAREN,FOLLOW_RPAREN_in_synpred57_myChecker1174); if (state.failed) return;
		match(input,SEMI,FOLLOW_SEMI_in_synpred57_myChecker1176); if (state.failed) return;
		}

	}
	// $ANTLR end synpred57_myChecker

	// Delegated rules

	public final boolean synpred57_myChecker() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred57_myChecker_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred35_myChecker() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred35_myChecker_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred37_myChecker() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred37_myChecker_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred36_myChecker() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred36_myChecker_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}


	protected DFA11 dfa11 = new DFA11(this);
	protected DFA29 dfa29 = new DFA29(this);
	static final String DFA11_eotS =
		"\u00a7\uffff";
	static final String DFA11_eofS =
		"\11\uffff\1\12\43\uffff\3\12\167\uffff";
	static final String DFA11_minS =
		"\1\6\10\uffff\1\5\10\uffff\2\16\31\uffff\3\5\1\16\3\5\1\16\1\uffff\6\0"+
		"\25\uffff\6\0\25\uffff\6\0\25\uffff\12\0\1\uffff\7\0\1\uffff\7\0\1\uffff"+
		"\5\0";
	static final String DFA11_maxS =
		"\1\113\10\uffff\1\113\10\uffff\1\50\1\76\31\uffff\3\113\1\50\3\111\1\50"+
		"\1\uffff\6\0\25\uffff\6\0\25\uffff\6\0\25\uffff\12\0\1\uffff\7\0\1\uffff"+
		"\7\0\1\uffff\5\0";
	static final String DFA11_acceptS =
		"\1\uffff\1\1\10\uffff\1\4\2\uffff\1\5\1\6\1\7\1\10\1\11\43\uffff\1\3\6"+
		"\uffff\1\2\152\uffff";
	static final String DFA11_specialS =
		"\66\uffff\1\0\1\1\1\2\1\3\1\4\1\5\25\uffff\1\6\1\7\1\10\1\11\1\12\1\13"+
		"\25\uffff\1\14\1\15\1\16\1\17\1\20\1\21\25\uffff\1\22\1\23\1\24\1\25\1"+
		"\26\1\27\1\30\1\31\1\32\1\33\1\uffff\1\34\1\35\1\36\1\37\1\40\1\41\1\42"+
		"\1\uffff\1\43\1\44\1\45\1\46\1\47\1\50\1\51\1\uffff\1\52\1\53\1\54\1\55"+
		"\1\56}>";
	static final String[] DFA11_transitionS = {
			"\1\21\1\uffff\1\1\4\uffff\1\20\1\12\4\uffff\1\1\3\uffff\1\1\1\12\3\uffff"+
			"\1\16\2\uffff\1\11\1\15\1\uffff\1\1\4\uffff\1\1\1\12\33\uffff\1\1\1\uffff"+
			"\1\1\3\uffff\1\1\1\17",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\22\1\12\1\uffff\1\12\4\uffff\2\12\1\uffff\2\12\1\uffff\1\12\2\uffff"+
			"\3\12\3\uffff\5\12\1\uffff\1\12\2\uffff\3\12\1\23\2\uffff\4\12\3\uffff"+
			"\1\12\1\uffff\2\12\2\uffff\2\12\2\uffff\2\12\6\uffff\1\12\1\uffff\1\12"+
			"\1\uffff\4\12",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\56\11\uffff\1\57\6\uffff\1\55\10\uffff\1\60",
			"\1\62\11\uffff\1\63\6\uffff\1\61\10\uffff\1\64\25\uffff\1\65",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\71\1\12\1\uffff\1\12\4\uffff\2\12\1\uffff\1\66\1\71\1\uffff\1\12"+
			"\2\uffff\1\71\2\12\3\uffff\1\12\2\71\2\12\1\uffff\1\12\2\uffff\1\72\1"+
			"\73\2\12\2\uffff\2\71\1\70\1\71\3\uffff\1\71\1\uffff\2\71\2\uffff\1\67"+
			"\1\71\2\uffff\2\12\4\uffff\1\74\1\uffff\1\12\1\uffff\1\12\1\uffff\1\66"+
			"\1\71\2\12",
			"\1\124\1\12\1\uffff\1\12\4\uffff\2\12\1\uffff\1\121\1\124\1\uffff\1"+
			"\12\2\uffff\1\124\2\12\3\uffff\1\12\2\124\2\12\1\uffff\1\12\2\uffff\1"+
			"\125\1\126\2\12\2\uffff\2\124\1\123\1\124\3\uffff\1\124\1\uffff\2\124"+
			"\2\uffff\1\122\1\124\2\uffff\2\12\4\uffff\1\74\1\uffff\1\12\1\uffff\1"+
			"\12\1\uffff\1\121\1\124\2\12",
			"\1\157\1\12\1\uffff\1\12\4\uffff\2\12\1\uffff\1\154\1\157\1\uffff\1"+
			"\12\2\uffff\1\157\2\12\3\uffff\1\12\2\157\2\12\1\uffff\1\12\2\uffff\1"+
			"\160\1\161\2\12\2\uffff\2\157\1\156\1\157\3\uffff\1\157\1\uffff\2\157"+
			"\2\uffff\1\155\1\157\2\uffff\2\12\4\uffff\1\74\1\uffff\1\12\1\uffff\1"+
			"\12\1\uffff\1\154\1\157\2\12",
			"\1\u0088\11\uffff\1\u0089\6\uffff\1\u0087\10\uffff\1\u008a",
			"\1\u008e\4\uffff\1\65\5\uffff\1\u008b\1\u008e\4\uffff\1\u008e\6\uffff"+
			"\2\u008e\6\uffff\1\u008f\1\u0090\4\uffff\2\u008e\1\u008d\1\u008e\3\uffff"+
			"\1\u008e\1\uffff\2\u008e\2\uffff\1\u008c\1\u008e\4\uffff\1\u0092\11\uffff"+
			"\1\u008b\1\u008e",
			"\1\u0096\4\uffff\1\65\5\uffff\1\u0093\1\u0096\4\uffff\1\u0096\6\uffff"+
			"\2\u0096\6\uffff\1\u0097\1\u0098\4\uffff\2\u0096\1\u0095\1\u0096\3\uffff"+
			"\1\u0096\1\uffff\2\u0096\2\uffff\1\u0094\1\u0096\4\uffff\1\u009a\11\uffff"+
			"\1\u0093\1\u0096",
			"\1\u009e\4\uffff\1\65\5\uffff\1\u009b\1\u009e\4\uffff\1\u009e\6\uffff"+
			"\2\u009e\6\uffff\1\u009f\1\u00a0\4\uffff\2\u009e\1\u009d\1\u009e\3\uffff"+
			"\1\u009e\1\uffff\2\u009e\2\uffff\1\u009c\1\u009e\4\uffff\1\u00a2\11\uffff"+
			"\1\u009b\1\u009e",
			"\1\u00a4\11\uffff\1\u00a5\6\uffff\1\u00a3\10\uffff\1\u00a6",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff"
	};

	static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
	static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
	static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
	static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
	static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
	static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
	static final short[][] DFA11_transition;

	static {
		int numStates = DFA11_transitionS.length;
		DFA11_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
		}
	}

	protected class DFA11 extends DFA {

		public DFA11(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 11;
			this.eot = DFA11_eot;
			this.eof = DFA11_eof;
			this.min = DFA11_min;
			this.max = DFA11_max;
			this.accept = DFA11_accept;
			this.special = DFA11_special;
			this.transition = DFA11_transition;
		}
		@Override
		public String getDescription() {
			return "236:2: codelines : ( vardeclarations | varassignments | callfunctions | expressions | ifconditions | forloops | whileloops | continues | breaks );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA11_54 = input.LA(1);
						 
						int index11_54 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred35_myChecker()) ) {s = 60;}
						else if ( (synpred37_myChecker()) ) {s = 10;}
						 
						input.seek(index11_54);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA11_55 = input.LA(1);
						 
						int index11_55 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred35_myChecker()) ) {s = 60;}
						else if ( (synpred37_myChecker()) ) {s = 10;}
						 
						input.seek(index11_55);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA11_56 = input.LA(1);
						 
						int index11_56 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred35_myChecker()) ) {s = 60;}
						else if ( (synpred37_myChecker()) ) {s = 10;}
						 
						input.seek(index11_56);
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA11_57 = input.LA(1);
						 
						int index11_57 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred35_myChecker()) ) {s = 60;}
						else if ( (synpred37_myChecker()) ) {s = 10;}
						 
						input.seek(index11_57);
						if ( s>=0 ) return s;
						break;

					case 4 : 
						int LA11_58 = input.LA(1);
						 
						int index11_58 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred35_myChecker()) ) {s = 60;}
						else if ( (synpred37_myChecker()) ) {s = 10;}
						 
						input.seek(index11_58);
						if ( s>=0 ) return s;
						break;

					case 5 : 
						int LA11_59 = input.LA(1);
						 
						int index11_59 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred35_myChecker()) ) {s = 60;}
						else if ( (synpred37_myChecker()) ) {s = 10;}
						 
						input.seek(index11_59);
						if ( s>=0 ) return s;
						break;

					case 6 : 
						int LA11_81 = input.LA(1);
						 
						int index11_81 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred35_myChecker()) ) {s = 60;}
						else if ( (synpred37_myChecker()) ) {s = 10;}
						 
						input.seek(index11_81);
						if ( s>=0 ) return s;
						break;

					case 7 : 
						int LA11_82 = input.LA(1);
						 
						int index11_82 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred35_myChecker()) ) {s = 60;}
						else if ( (synpred37_myChecker()) ) {s = 10;}
						 
						input.seek(index11_82);
						if ( s>=0 ) return s;
						break;

					case 8 : 
						int LA11_83 = input.LA(1);
						 
						int index11_83 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred35_myChecker()) ) {s = 60;}
						else if ( (synpred37_myChecker()) ) {s = 10;}
						 
						input.seek(index11_83);
						if ( s>=0 ) return s;
						break;

					case 9 : 
						int LA11_84 = input.LA(1);
						 
						int index11_84 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred35_myChecker()) ) {s = 60;}
						else if ( (synpred37_myChecker()) ) {s = 10;}
						 
						input.seek(index11_84);
						if ( s>=0 ) return s;
						break;

					case 10 : 
						int LA11_85 = input.LA(1);
						 
						int index11_85 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred35_myChecker()) ) {s = 60;}
						else if ( (synpred37_myChecker()) ) {s = 10;}
						 
						input.seek(index11_85);
						if ( s>=0 ) return s;
						break;

					case 11 : 
						int LA11_86 = input.LA(1);
						 
						int index11_86 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred35_myChecker()) ) {s = 60;}
						else if ( (synpred37_myChecker()) ) {s = 10;}
						 
						input.seek(index11_86);
						if ( s>=0 ) return s;
						break;

					case 12 : 
						int LA11_108 = input.LA(1);
						 
						int index11_108 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred35_myChecker()) ) {s = 60;}
						else if ( (synpred37_myChecker()) ) {s = 10;}
						 
						input.seek(index11_108);
						if ( s>=0 ) return s;
						break;

					case 13 : 
						int LA11_109 = input.LA(1);
						 
						int index11_109 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred35_myChecker()) ) {s = 60;}
						else if ( (synpred37_myChecker()) ) {s = 10;}
						 
						input.seek(index11_109);
						if ( s>=0 ) return s;
						break;

					case 14 : 
						int LA11_110 = input.LA(1);
						 
						int index11_110 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred35_myChecker()) ) {s = 60;}
						else if ( (synpred37_myChecker()) ) {s = 10;}
						 
						input.seek(index11_110);
						if ( s>=0 ) return s;
						break;

					case 15 : 
						int LA11_111 = input.LA(1);
						 
						int index11_111 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred35_myChecker()) ) {s = 60;}
						else if ( (synpred37_myChecker()) ) {s = 10;}
						 
						input.seek(index11_111);
						if ( s>=0 ) return s;
						break;

					case 16 : 
						int LA11_112 = input.LA(1);
						 
						int index11_112 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred35_myChecker()) ) {s = 60;}
						else if ( (synpred37_myChecker()) ) {s = 10;}
						 
						input.seek(index11_112);
						if ( s>=0 ) return s;
						break;

					case 17 : 
						int LA11_113 = input.LA(1);
						 
						int index11_113 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred35_myChecker()) ) {s = 60;}
						else if ( (synpred37_myChecker()) ) {s = 10;}
						 
						input.seek(index11_113);
						if ( s>=0 ) return s;
						break;

					case 18 : 
						int LA11_135 = input.LA(1);
						 
						int index11_135 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred35_myChecker()) ) {s = 60;}
						else if ( (synpred37_myChecker()) ) {s = 10;}
						 
						input.seek(index11_135);
						if ( s>=0 ) return s;
						break;

					case 19 : 
						int LA11_136 = input.LA(1);
						 
						int index11_136 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred35_myChecker()) ) {s = 60;}
						else if ( (synpred37_myChecker()) ) {s = 10;}
						 
						input.seek(index11_136);
						if ( s>=0 ) return s;
						break;

					case 20 : 
						int LA11_137 = input.LA(1);
						 
						int index11_137 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred35_myChecker()) ) {s = 60;}
						else if ( (synpred37_myChecker()) ) {s = 10;}
						 
						input.seek(index11_137);
						if ( s>=0 ) return s;
						break;

					case 21 : 
						int LA11_138 = input.LA(1);
						 
						int index11_138 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred35_myChecker()) ) {s = 60;}
						else if ( (synpred37_myChecker()) ) {s = 10;}
						 
						input.seek(index11_138);
						if ( s>=0 ) return s;
						break;

					case 22 : 
						int LA11_139 = input.LA(1);
						 
						int index11_139 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred36_myChecker()) ) {s = 53;}
						else if ( (synpred37_myChecker()) ) {s = 10;}
						 
						input.seek(index11_139);
						if ( s>=0 ) return s;
						break;

					case 23 : 
						int LA11_140 = input.LA(1);
						 
						int index11_140 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred36_myChecker()) ) {s = 53;}
						else if ( (synpred37_myChecker()) ) {s = 10;}
						 
						input.seek(index11_140);
						if ( s>=0 ) return s;
						break;

					case 24 : 
						int LA11_141 = input.LA(1);
						 
						int index11_141 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred36_myChecker()) ) {s = 53;}
						else if ( (synpred37_myChecker()) ) {s = 10;}
						 
						input.seek(index11_141);
						if ( s>=0 ) return s;
						break;

					case 25 : 
						int LA11_142 = input.LA(1);
						 
						int index11_142 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred36_myChecker()) ) {s = 53;}
						else if ( (synpred37_myChecker()) ) {s = 10;}
						 
						input.seek(index11_142);
						if ( s>=0 ) return s;
						break;

					case 26 : 
						int LA11_143 = input.LA(1);
						 
						int index11_143 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred36_myChecker()) ) {s = 53;}
						else if ( (synpred37_myChecker()) ) {s = 10;}
						 
						input.seek(index11_143);
						if ( s>=0 ) return s;
						break;

					case 27 : 
						int LA11_144 = input.LA(1);
						 
						int index11_144 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred36_myChecker()) ) {s = 53;}
						else if ( (synpred37_myChecker()) ) {s = 10;}
						 
						input.seek(index11_144);
						if ( s>=0 ) return s;
						break;

					case 28 : 
						int LA11_146 = input.LA(1);
						 
						int index11_146 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred36_myChecker()) ) {s = 53;}
						else if ( (synpred37_myChecker()) ) {s = 10;}
						 
						input.seek(index11_146);
						if ( s>=0 ) return s;
						break;

					case 29 : 
						int LA11_147 = input.LA(1);
						 
						int index11_147 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred36_myChecker()) ) {s = 53;}
						else if ( (synpred37_myChecker()) ) {s = 10;}
						 
						input.seek(index11_147);
						if ( s>=0 ) return s;
						break;

					case 30 : 
						int LA11_148 = input.LA(1);
						 
						int index11_148 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred36_myChecker()) ) {s = 53;}
						else if ( (synpred37_myChecker()) ) {s = 10;}
						 
						input.seek(index11_148);
						if ( s>=0 ) return s;
						break;

					case 31 : 
						int LA11_149 = input.LA(1);
						 
						int index11_149 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred36_myChecker()) ) {s = 53;}
						else if ( (synpred37_myChecker()) ) {s = 10;}
						 
						input.seek(index11_149);
						if ( s>=0 ) return s;
						break;

					case 32 : 
						int LA11_150 = input.LA(1);
						 
						int index11_150 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred36_myChecker()) ) {s = 53;}
						else if ( (synpred37_myChecker()) ) {s = 10;}
						 
						input.seek(index11_150);
						if ( s>=0 ) return s;
						break;

					case 33 : 
						int LA11_151 = input.LA(1);
						 
						int index11_151 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred36_myChecker()) ) {s = 53;}
						else if ( (synpred37_myChecker()) ) {s = 10;}
						 
						input.seek(index11_151);
						if ( s>=0 ) return s;
						break;

					case 34 : 
						int LA11_152 = input.LA(1);
						 
						int index11_152 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred36_myChecker()) ) {s = 53;}
						else if ( (synpred37_myChecker()) ) {s = 10;}
						 
						input.seek(index11_152);
						if ( s>=0 ) return s;
						break;

					case 35 : 
						int LA11_154 = input.LA(1);
						 
						int index11_154 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred36_myChecker()) ) {s = 53;}
						else if ( (synpred37_myChecker()) ) {s = 10;}
						 
						input.seek(index11_154);
						if ( s>=0 ) return s;
						break;

					case 36 : 
						int LA11_155 = input.LA(1);
						 
						int index11_155 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred36_myChecker()) ) {s = 53;}
						else if ( (synpred37_myChecker()) ) {s = 10;}
						 
						input.seek(index11_155);
						if ( s>=0 ) return s;
						break;

					case 37 : 
						int LA11_156 = input.LA(1);
						 
						int index11_156 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred36_myChecker()) ) {s = 53;}
						else if ( (synpred37_myChecker()) ) {s = 10;}
						 
						input.seek(index11_156);
						if ( s>=0 ) return s;
						break;

					case 38 : 
						int LA11_157 = input.LA(1);
						 
						int index11_157 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred36_myChecker()) ) {s = 53;}
						else if ( (synpred37_myChecker()) ) {s = 10;}
						 
						input.seek(index11_157);
						if ( s>=0 ) return s;
						break;

					case 39 : 
						int LA11_158 = input.LA(1);
						 
						int index11_158 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred36_myChecker()) ) {s = 53;}
						else if ( (synpred37_myChecker()) ) {s = 10;}
						 
						input.seek(index11_158);
						if ( s>=0 ) return s;
						break;

					case 40 : 
						int LA11_159 = input.LA(1);
						 
						int index11_159 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred36_myChecker()) ) {s = 53;}
						else if ( (synpred37_myChecker()) ) {s = 10;}
						 
						input.seek(index11_159);
						if ( s>=0 ) return s;
						break;

					case 41 : 
						int LA11_160 = input.LA(1);
						 
						int index11_160 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred36_myChecker()) ) {s = 53;}
						else if ( (synpred37_myChecker()) ) {s = 10;}
						 
						input.seek(index11_160);
						if ( s>=0 ) return s;
						break;

					case 42 : 
						int LA11_162 = input.LA(1);
						 
						int index11_162 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred36_myChecker()) ) {s = 53;}
						else if ( (synpred37_myChecker()) ) {s = 10;}
						 
						input.seek(index11_162);
						if ( s>=0 ) return s;
						break;

					case 43 : 
						int LA11_163 = input.LA(1);
						 
						int index11_163 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred36_myChecker()) ) {s = 53;}
						else if ( (synpred37_myChecker()) ) {s = 10;}
						 
						input.seek(index11_163);
						if ( s>=0 ) return s;
						break;

					case 44 : 
						int LA11_164 = input.LA(1);
						 
						int index11_164 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred36_myChecker()) ) {s = 53;}
						else if ( (synpred37_myChecker()) ) {s = 10;}
						 
						input.seek(index11_164);
						if ( s>=0 ) return s;
						break;

					case 45 : 
						int LA11_165 = input.LA(1);
						 
						int index11_165 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred36_myChecker()) ) {s = 53;}
						else if ( (synpred37_myChecker()) ) {s = 10;}
						 
						input.seek(index11_165);
						if ( s>=0 ) return s;
						break;

					case 46 : 
						int LA11_166 = input.LA(1);
						 
						int index11_166 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred36_myChecker()) ) {s = 53;}
						else if ( (synpred37_myChecker()) ) {s = 10;}
						 
						input.seek(index11_166);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 11, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA29_eotS =
		"\143\uffff";
	static final String DFA29_eofS =
		"\143\uffff";
	static final String DFA29_minS =
		"\1\10\10\37\10\50\10\10\110\0\2\uffff";
	static final String DFA29_maxS =
		"\1\112\10\37\10\50\10\112\110\0\2\uffff";
	static final String DFA29_acceptS =
		"\141\uffff\1\1\1\2";
	static final String DFA29_specialS =
		"\31\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15"+
		"\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33"+
		"\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51"+
		"\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67"+
		"\1\70\1\71\1\72\1\73\1\74\1\75\1\76\1\77\1\100\1\101\1\102\1\103\1\104"+
		"\1\105\1\106\1\107\2\uffff}>";
	static final String[] DFA29_transitionS = {
			"\1\3\12\uffff\1\7\3\uffff\1\2\12\uffff\1\1\4\uffff\1\6\34\uffff\1\5\1"+
			"\uffff\1\10\3\uffff\1\4",
			"\1\11",
			"\1\12",
			"\1\13",
			"\1\14",
			"\1\15",
			"\1\16",
			"\1\17",
			"\1\20",
			"\1\21",
			"\1\22",
			"\1\23",
			"\1\24",
			"\1\25",
			"\1\26",
			"\1\27",
			"\1\30",
			"\1\33\12\uffff\1\37\3\uffff\1\32\12\uffff\1\31\4\uffff\1\36\26\uffff"+
			"\1\41\5\uffff\1\35\1\uffff\1\40\3\uffff\1\34",
			"\1\44\12\uffff\1\50\3\uffff\1\43\12\uffff\1\42\4\uffff\1\47\26\uffff"+
			"\1\52\5\uffff\1\46\1\uffff\1\51\3\uffff\1\45",
			"\1\55\12\uffff\1\61\3\uffff\1\54\12\uffff\1\53\4\uffff\1\60\26\uffff"+
			"\1\63\5\uffff\1\57\1\uffff\1\62\3\uffff\1\56",
			"\1\66\12\uffff\1\72\3\uffff\1\65\12\uffff\1\64\4\uffff\1\71\26\uffff"+
			"\1\74\5\uffff\1\70\1\uffff\1\73\3\uffff\1\67",
			"\1\77\12\uffff\1\103\3\uffff\1\76\12\uffff\1\75\4\uffff\1\102\26\uffff"+
			"\1\105\5\uffff\1\101\1\uffff\1\104\3\uffff\1\100",
			"\1\110\12\uffff\1\114\3\uffff\1\107\12\uffff\1\106\4\uffff\1\113\26"+
			"\uffff\1\116\5\uffff\1\112\1\uffff\1\115\3\uffff\1\111",
			"\1\121\12\uffff\1\125\3\uffff\1\120\12\uffff\1\117\4\uffff\1\124\26"+
			"\uffff\1\127\5\uffff\1\123\1\uffff\1\126\3\uffff\1\122",
			"\1\132\12\uffff\1\136\3\uffff\1\131\12\uffff\1\130\4\uffff\1\135\26"+
			"\uffff\1\140\5\uffff\1\134\1\uffff\1\137\3\uffff\1\133",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			""
	};

	static final short[] DFA29_eot = DFA.unpackEncodedString(DFA29_eotS);
	static final short[] DFA29_eof = DFA.unpackEncodedString(DFA29_eofS);
	static final char[] DFA29_min = DFA.unpackEncodedStringToUnsignedChars(DFA29_minS);
	static final char[] DFA29_max = DFA.unpackEncodedStringToUnsignedChars(DFA29_maxS);
	static final short[] DFA29_accept = DFA.unpackEncodedString(DFA29_acceptS);
	static final short[] DFA29_special = DFA.unpackEncodedString(DFA29_specialS);
	static final short[][] DFA29_transition;

	static {
		int numStates = DFA29_transitionS.length;
		DFA29_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA29_transition[i] = DFA.unpackEncodedString(DFA29_transitionS[i]);
		}
	}

	protected class DFA29 extends DFA {

		public DFA29(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 29;
			this.eot = DFA29_eot;
			this.eof = DFA29_eof;
			this.min = DFA29_min;
			this.max = DFA29_max;
			this.accept = DFA29_accept;
			this.special = DFA29_special;
			this.transition = DFA29_transition;
		}
		@Override
		public String getDescription() {
			return "334:1: subfunctions : ( vartypes ID LPAREN ( parameters )? RPAREN SEMI | vartypes ID LPAREN ( parameters )? RPAREN LBRACE ( codelines )* retvals RBRACE );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA29_25 = input.LA(1);
						 
						int index29_25 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred57_myChecker()) ) {s = 97;}
						else if ( (true) ) {s = 98;}
						 
						input.seek(index29_25);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA29_26 = input.LA(1);
						 
						int index29_26 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred57_myChecker()) ) {s = 97;}
						else if ( (true) ) {s = 98;}
						 
						input.seek(index29_26);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA29_27 = input.LA(1);
						 
						int index29_27 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred57_myChecker()) ) {s = 97;}
						else if ( (true) ) {s = 98;}
						 
						input.seek(index29_27);
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA29_28 = input.LA(1);
						 
						int index29_28 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred57_myChecker()) ) {s = 97;}
						else if ( (true) ) {s = 98;}
						 
						input.seek(index29_28);
						if ( s>=0 ) return s;
						break;

					case 4 : 
						int LA29_29 = input.LA(1);
						 
						int index29_29 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred57_myChecker()) ) {s = 97;}
						else if ( (true) ) {s = 98;}
						 
						input.seek(index29_29);
						if ( s>=0 ) return s;
						break;

					case 5 : 
						int LA29_30 = input.LA(1);
						 
						int index29_30 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred57_myChecker()) ) {s = 97;}
						else if ( (true) ) {s = 98;}
						 
						input.seek(index29_30);
						if ( s>=0 ) return s;
						break;

					case 6 : 
						int LA29_31 = input.LA(1);
						 
						int index29_31 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred57_myChecker()) ) {s = 97;}
						else if ( (true) ) {s = 98;}
						 
						input.seek(index29_31);
						if ( s>=0 ) return s;
						break;

					case 7 : 
						int LA29_32 = input.LA(1);
						 
						int index29_32 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred57_myChecker()) ) {s = 97;}
						else if ( (true) ) {s = 98;}
						 
						input.seek(index29_32);
						if ( s>=0 ) return s;
						break;

					case 8 : 
						int LA29_33 = input.LA(1);
						 
						int index29_33 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred57_myChecker()) ) {s = 97;}
						else if ( (true) ) {s = 98;}
						 
						input.seek(index29_33);
						if ( s>=0 ) return s;
						break;

					case 9 : 
						int LA29_34 = input.LA(1);
						 
						int index29_34 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred57_myChecker()) ) {s = 97;}
						else if ( (true) ) {s = 98;}
						 
						input.seek(index29_34);
						if ( s>=0 ) return s;
						break;

					case 10 : 
						int LA29_35 = input.LA(1);
						 
						int index29_35 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred57_myChecker()) ) {s = 97;}
						else if ( (true) ) {s = 98;}
						 
						input.seek(index29_35);
						if ( s>=0 ) return s;
						break;

					case 11 : 
						int LA29_36 = input.LA(1);
						 
						int index29_36 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred57_myChecker()) ) {s = 97;}
						else if ( (true) ) {s = 98;}
						 
						input.seek(index29_36);
						if ( s>=0 ) return s;
						break;

					case 12 : 
						int LA29_37 = input.LA(1);
						 
						int index29_37 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred57_myChecker()) ) {s = 97;}
						else if ( (true) ) {s = 98;}
						 
						input.seek(index29_37);
						if ( s>=0 ) return s;
						break;

					case 13 : 
						int LA29_38 = input.LA(1);
						 
						int index29_38 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred57_myChecker()) ) {s = 97;}
						else if ( (true) ) {s = 98;}
						 
						input.seek(index29_38);
						if ( s>=0 ) return s;
						break;

					case 14 : 
						int LA29_39 = input.LA(1);
						 
						int index29_39 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred57_myChecker()) ) {s = 97;}
						else if ( (true) ) {s = 98;}
						 
						input.seek(index29_39);
						if ( s>=0 ) return s;
						break;

					case 15 : 
						int LA29_40 = input.LA(1);
						 
						int index29_40 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred57_myChecker()) ) {s = 97;}
						else if ( (true) ) {s = 98;}
						 
						input.seek(index29_40);
						if ( s>=0 ) return s;
						break;

					case 16 : 
						int LA29_41 = input.LA(1);
						 
						int index29_41 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred57_myChecker()) ) {s = 97;}
						else if ( (true) ) {s = 98;}
						 
						input.seek(index29_41);
						if ( s>=0 ) return s;
						break;

					case 17 : 
						int LA29_42 = input.LA(1);
						 
						int index29_42 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred57_myChecker()) ) {s = 97;}
						else if ( (true) ) {s = 98;}
						 
						input.seek(index29_42);
						if ( s>=0 ) return s;
						break;

					case 18 : 
						int LA29_43 = input.LA(1);
						 
						int index29_43 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred57_myChecker()) ) {s = 97;}
						else if ( (true) ) {s = 98;}
						 
						input.seek(index29_43);
						if ( s>=0 ) return s;
						break;

					case 19 : 
						int LA29_44 = input.LA(1);
						 
						int index29_44 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred57_myChecker()) ) {s = 97;}
						else if ( (true) ) {s = 98;}
						 
						input.seek(index29_44);
						if ( s>=0 ) return s;
						break;

					case 20 : 
						int LA29_45 = input.LA(1);
						 
						int index29_45 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred57_myChecker()) ) {s = 97;}
						else if ( (true) ) {s = 98;}
						 
						input.seek(index29_45);
						if ( s>=0 ) return s;
						break;

					case 21 : 
						int LA29_46 = input.LA(1);
						 
						int index29_46 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred57_myChecker()) ) {s = 97;}
						else if ( (true) ) {s = 98;}
						 
						input.seek(index29_46);
						if ( s>=0 ) return s;
						break;

					case 22 : 
						int LA29_47 = input.LA(1);
						 
						int index29_47 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred57_myChecker()) ) {s = 97;}
						else if ( (true) ) {s = 98;}
						 
						input.seek(index29_47);
						if ( s>=0 ) return s;
						break;

					case 23 : 
						int LA29_48 = input.LA(1);
						 
						int index29_48 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred57_myChecker()) ) {s = 97;}
						else if ( (true) ) {s = 98;}
						 
						input.seek(index29_48);
						if ( s>=0 ) return s;
						break;

					case 24 : 
						int LA29_49 = input.LA(1);
						 
						int index29_49 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred57_myChecker()) ) {s = 97;}
						else if ( (true) ) {s = 98;}
						 
						input.seek(index29_49);
						if ( s>=0 ) return s;
						break;

					case 25 : 
						int LA29_50 = input.LA(1);
						 
						int index29_50 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred57_myChecker()) ) {s = 97;}
						else if ( (true) ) {s = 98;}
						 
						input.seek(index29_50);
						if ( s>=0 ) return s;
						break;

					case 26 : 
						int LA29_51 = input.LA(1);
						 
						int index29_51 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred57_myChecker()) ) {s = 97;}
						else if ( (true) ) {s = 98;}
						 
						input.seek(index29_51);
						if ( s>=0 ) return s;
						break;

					case 27 : 
						int LA29_52 = input.LA(1);
						 
						int index29_52 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred57_myChecker()) ) {s = 97;}
						else if ( (true) ) {s = 98;}
						 
						input.seek(index29_52);
						if ( s>=0 ) return s;
						break;

					case 28 : 
						int LA29_53 = input.LA(1);
						 
						int index29_53 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred57_myChecker()) ) {s = 97;}
						else if ( (true) ) {s = 98;}
						 
						input.seek(index29_53);
						if ( s>=0 ) return s;
						break;

					case 29 : 
						int LA29_54 = input.LA(1);
						 
						int index29_54 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred57_myChecker()) ) {s = 97;}
						else if ( (true) ) {s = 98;}
						 
						input.seek(index29_54);
						if ( s>=0 ) return s;
						break;

					case 30 : 
						int LA29_55 = input.LA(1);
						 
						int index29_55 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred57_myChecker()) ) {s = 97;}
						else if ( (true) ) {s = 98;}
						 
						input.seek(index29_55);
						if ( s>=0 ) return s;
						break;

					case 31 : 
						int LA29_56 = input.LA(1);
						 
						int index29_56 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred57_myChecker()) ) {s = 97;}
						else if ( (true) ) {s = 98;}
						 
						input.seek(index29_56);
						if ( s>=0 ) return s;
						break;

					case 32 : 
						int LA29_57 = input.LA(1);
						 
						int index29_57 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred57_myChecker()) ) {s = 97;}
						else if ( (true) ) {s = 98;}
						 
						input.seek(index29_57);
						if ( s>=0 ) return s;
						break;

					case 33 : 
						int LA29_58 = input.LA(1);
						 
						int index29_58 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred57_myChecker()) ) {s = 97;}
						else if ( (true) ) {s = 98;}
						 
						input.seek(index29_58);
						if ( s>=0 ) return s;
						break;

					case 34 : 
						int LA29_59 = input.LA(1);
						 
						int index29_59 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred57_myChecker()) ) {s = 97;}
						else if ( (true) ) {s = 98;}
						 
						input.seek(index29_59);
						if ( s>=0 ) return s;
						break;

					case 35 : 
						int LA29_60 = input.LA(1);
						 
						int index29_60 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred57_myChecker()) ) {s = 97;}
						else if ( (true) ) {s = 98;}
						 
						input.seek(index29_60);
						if ( s>=0 ) return s;
						break;

					case 36 : 
						int LA29_61 = input.LA(1);
						 
						int index29_61 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred57_myChecker()) ) {s = 97;}
						else if ( (true) ) {s = 98;}
						 
						input.seek(index29_61);
						if ( s>=0 ) return s;
						break;

					case 37 : 
						int LA29_62 = input.LA(1);
						 
						int index29_62 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred57_myChecker()) ) {s = 97;}
						else if ( (true) ) {s = 98;}
						 
						input.seek(index29_62);
						if ( s>=0 ) return s;
						break;

					case 38 : 
						int LA29_63 = input.LA(1);
						 
						int index29_63 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred57_myChecker()) ) {s = 97;}
						else if ( (true) ) {s = 98;}
						 
						input.seek(index29_63);
						if ( s>=0 ) return s;
						break;

					case 39 : 
						int LA29_64 = input.LA(1);
						 
						int index29_64 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred57_myChecker()) ) {s = 97;}
						else if ( (true) ) {s = 98;}
						 
						input.seek(index29_64);
						if ( s>=0 ) return s;
						break;

					case 40 : 
						int LA29_65 = input.LA(1);
						 
						int index29_65 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred57_myChecker()) ) {s = 97;}
						else if ( (true) ) {s = 98;}
						 
						input.seek(index29_65);
						if ( s>=0 ) return s;
						break;

					case 41 : 
						int LA29_66 = input.LA(1);
						 
						int index29_66 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred57_myChecker()) ) {s = 97;}
						else if ( (true) ) {s = 98;}
						 
						input.seek(index29_66);
						if ( s>=0 ) return s;
						break;

					case 42 : 
						int LA29_67 = input.LA(1);
						 
						int index29_67 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred57_myChecker()) ) {s = 97;}
						else if ( (true) ) {s = 98;}
						 
						input.seek(index29_67);
						if ( s>=0 ) return s;
						break;

					case 43 : 
						int LA29_68 = input.LA(1);
						 
						int index29_68 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred57_myChecker()) ) {s = 97;}
						else if ( (true) ) {s = 98;}
						 
						input.seek(index29_68);
						if ( s>=0 ) return s;
						break;

					case 44 : 
						int LA29_69 = input.LA(1);
						 
						int index29_69 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred57_myChecker()) ) {s = 97;}
						else if ( (true) ) {s = 98;}
						 
						input.seek(index29_69);
						if ( s>=0 ) return s;
						break;

					case 45 : 
						int LA29_70 = input.LA(1);
						 
						int index29_70 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred57_myChecker()) ) {s = 97;}
						else if ( (true) ) {s = 98;}
						 
						input.seek(index29_70);
						if ( s>=0 ) return s;
						break;

					case 46 : 
						int LA29_71 = input.LA(1);
						 
						int index29_71 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred57_myChecker()) ) {s = 97;}
						else if ( (true) ) {s = 98;}
						 
						input.seek(index29_71);
						if ( s>=0 ) return s;
						break;

					case 47 : 
						int LA29_72 = input.LA(1);
						 
						int index29_72 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred57_myChecker()) ) {s = 97;}
						else if ( (true) ) {s = 98;}
						 
						input.seek(index29_72);
						if ( s>=0 ) return s;
						break;

					case 48 : 
						int LA29_73 = input.LA(1);
						 
						int index29_73 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred57_myChecker()) ) {s = 97;}
						else if ( (true) ) {s = 98;}
						 
						input.seek(index29_73);
						if ( s>=0 ) return s;
						break;

					case 49 : 
						int LA29_74 = input.LA(1);
						 
						int index29_74 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred57_myChecker()) ) {s = 97;}
						else if ( (true) ) {s = 98;}
						 
						input.seek(index29_74);
						if ( s>=0 ) return s;
						break;

					case 50 : 
						int LA29_75 = input.LA(1);
						 
						int index29_75 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred57_myChecker()) ) {s = 97;}
						else if ( (true) ) {s = 98;}
						 
						input.seek(index29_75);
						if ( s>=0 ) return s;
						break;

					case 51 : 
						int LA29_76 = input.LA(1);
						 
						int index29_76 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred57_myChecker()) ) {s = 97;}
						else if ( (true) ) {s = 98;}
						 
						input.seek(index29_76);
						if ( s>=0 ) return s;
						break;

					case 52 : 
						int LA29_77 = input.LA(1);
						 
						int index29_77 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred57_myChecker()) ) {s = 97;}
						else if ( (true) ) {s = 98;}
						 
						input.seek(index29_77);
						if ( s>=0 ) return s;
						break;

					case 53 : 
						int LA29_78 = input.LA(1);
						 
						int index29_78 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred57_myChecker()) ) {s = 97;}
						else if ( (true) ) {s = 98;}
						 
						input.seek(index29_78);
						if ( s>=0 ) return s;
						break;

					case 54 : 
						int LA29_79 = input.LA(1);
						 
						int index29_79 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred57_myChecker()) ) {s = 97;}
						else if ( (true) ) {s = 98;}
						 
						input.seek(index29_79);
						if ( s>=0 ) return s;
						break;

					case 55 : 
						int LA29_80 = input.LA(1);
						 
						int index29_80 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred57_myChecker()) ) {s = 97;}
						else if ( (true) ) {s = 98;}
						 
						input.seek(index29_80);
						if ( s>=0 ) return s;
						break;

					case 56 : 
						int LA29_81 = input.LA(1);
						 
						int index29_81 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred57_myChecker()) ) {s = 97;}
						else if ( (true) ) {s = 98;}
						 
						input.seek(index29_81);
						if ( s>=0 ) return s;
						break;

					case 57 : 
						int LA29_82 = input.LA(1);
						 
						int index29_82 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred57_myChecker()) ) {s = 97;}
						else if ( (true) ) {s = 98;}
						 
						input.seek(index29_82);
						if ( s>=0 ) return s;
						break;

					case 58 : 
						int LA29_83 = input.LA(1);
						 
						int index29_83 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred57_myChecker()) ) {s = 97;}
						else if ( (true) ) {s = 98;}
						 
						input.seek(index29_83);
						if ( s>=0 ) return s;
						break;

					case 59 : 
						int LA29_84 = input.LA(1);
						 
						int index29_84 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred57_myChecker()) ) {s = 97;}
						else if ( (true) ) {s = 98;}
						 
						input.seek(index29_84);
						if ( s>=0 ) return s;
						break;

					case 60 : 
						int LA29_85 = input.LA(1);
						 
						int index29_85 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred57_myChecker()) ) {s = 97;}
						else if ( (true) ) {s = 98;}
						 
						input.seek(index29_85);
						if ( s>=0 ) return s;
						break;

					case 61 : 
						int LA29_86 = input.LA(1);
						 
						int index29_86 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred57_myChecker()) ) {s = 97;}
						else if ( (true) ) {s = 98;}
						 
						input.seek(index29_86);
						if ( s>=0 ) return s;
						break;

					case 62 : 
						int LA29_87 = input.LA(1);
						 
						int index29_87 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred57_myChecker()) ) {s = 97;}
						else if ( (true) ) {s = 98;}
						 
						input.seek(index29_87);
						if ( s>=0 ) return s;
						break;

					case 63 : 
						int LA29_88 = input.LA(1);
						 
						int index29_88 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred57_myChecker()) ) {s = 97;}
						else if ( (true) ) {s = 98;}
						 
						input.seek(index29_88);
						if ( s>=0 ) return s;
						break;

					case 64 : 
						int LA29_89 = input.LA(1);
						 
						int index29_89 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred57_myChecker()) ) {s = 97;}
						else if ( (true) ) {s = 98;}
						 
						input.seek(index29_89);
						if ( s>=0 ) return s;
						break;

					case 65 : 
						int LA29_90 = input.LA(1);
						 
						int index29_90 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred57_myChecker()) ) {s = 97;}
						else if ( (true) ) {s = 98;}
						 
						input.seek(index29_90);
						if ( s>=0 ) return s;
						break;

					case 66 : 
						int LA29_91 = input.LA(1);
						 
						int index29_91 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred57_myChecker()) ) {s = 97;}
						else if ( (true) ) {s = 98;}
						 
						input.seek(index29_91);
						if ( s>=0 ) return s;
						break;

					case 67 : 
						int LA29_92 = input.LA(1);
						 
						int index29_92 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred57_myChecker()) ) {s = 97;}
						else if ( (true) ) {s = 98;}
						 
						input.seek(index29_92);
						if ( s>=0 ) return s;
						break;

					case 68 : 
						int LA29_93 = input.LA(1);
						 
						int index29_93 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred57_myChecker()) ) {s = 97;}
						else if ( (true) ) {s = 98;}
						 
						input.seek(index29_93);
						if ( s>=0 ) return s;
						break;

					case 69 : 
						int LA29_94 = input.LA(1);
						 
						int index29_94 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred57_myChecker()) ) {s = 97;}
						else if ( (true) ) {s = 98;}
						 
						input.seek(index29_94);
						if ( s>=0 ) return s;
						break;

					case 70 : 
						int LA29_95 = input.LA(1);
						 
						int index29_95 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred57_myChecker()) ) {s = 97;}
						else if ( (true) ) {s = 98;}
						 
						input.seek(index29_95);
						if ( s>=0 ) return s;
						break;

					case 71 : 
						int LA29_96 = input.LA(1);
						 
						int index29_96 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred57_myChecker()) ) {s = 97;}
						else if ( (true) ) {s = 98;}
						 
						input.seek(index29_96);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 29, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	public static final BitSet FOLLOW_INCLUDE_in_entryPoint78 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_LT_in_entryPoint81 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_ID_in_entryPoint83 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_77_in_entryPoint85 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_GT_in_entryPoint87 = new BitSet(new long[]{0x0000008600880100L,0x0000000000004450L});
	public static final BitSet FOLLOW_subfunctions_in_entryPoint100 = new BitSet(new long[]{0x0000008400880100L,0x0000000000004450L});
	public static final BitSet FOLLOW_mainfunction_in_entryPoint108 = new BitSet(new long[]{0x0000008400880102L,0x0000000000000450L});
	public static final BitSet FOLLOW_subfunctions_in_entryPoint119 = new BitSet(new long[]{0x0000008400880102L,0x0000000000000450L});
	public static final BitSet FOLLOW_INT_in_vartypes147 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_vartypes157 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_vartypes167 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VOID_in_vartypes177 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SHORT_in_vartypes187 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LONGLONG_in_vartypes197 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOUBLE_in_vartypes207 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRUCT_in_vartypes217 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_vartypes_in_vardeclarations253 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_ID_in_vardeclarations259 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000004L});
	public static final BitSet FOLLOW_COMMA_in_vardeclarations262 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_ID_in_vardeclarations268 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000004L});
	public static final BitSet FOLLOW_SEMI_in_vardeclarations272 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_varassignments301 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ASSIGN_in_varassignments303 = new BitSet(new long[]{0x0000010081004000L});
	public static final BitSet FOLLOW_expressions_in_varassignments305 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_SEMI_in_varassignments307 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_operations_in_expressions349 = new BitSet(new long[]{0x0000006000000002L});
	public static final BitSet FOLLOW_LGAND_in_expressions361 = new BitSet(new long[]{0x0000010081004000L});
	public static final BitSet FOLLOW_operations_in_expressions367 = new BitSet(new long[]{0x0000006000000002L});
	public static final BitSet FOLLOW_LGOR_in_expressions375 = new BitSet(new long[]{0x0000010081004000L});
	public static final BitSet FOLLOW_operations_in_expressions382 = new BitSet(new long[]{0x0000006000000002L});
	public static final BitSet FOLLOW_addexprs_in_operations407 = new BitSet(new long[]{0x0234580060420022L,0x0000000000000200L});
	public static final BitSet FOLLOW_set_in_operations412 = new BitSet(new long[]{0x0000010081004000L});
	public static final BitSet FOLLOW_addexprs_in_operations516 = new BitSet(new long[]{0x0234580060420022L,0x0000000000000200L});
	public static final BitSet FOLLOW_mulexprs_in_addexprs552 = new BitSet(new long[]{0x0100200000000002L});
	public static final BitSet FOLLOW_PLUS_in_addexprs563 = new BitSet(new long[]{0x0000010081004000L});
	public static final BitSet FOLLOW_mulexprs_in_addexprs569 = new BitSet(new long[]{0x0100200000000002L});
	public static final BitSet FOLLOW_MINUS_in_addexprs592 = new BitSet(new long[]{0x0000010081004000L});
	public static final BitSet FOLLOW_mulexprs_in_addexprs598 = new BitSet(new long[]{0x0100200000000002L});
	public static final BitSet FOLLOW_atomexprs_in_mulexprs646 = new BitSet(new long[]{0x0000000000010002L,0x0000000000000100L});
	public static final BitSet FOLLOW_set_in_mulexprs660 = new BitSet(new long[]{0x0000010081004000L});
	public static final BitSet FOLLOW_atomexprs_in_mulexprs672 = new BitSet(new long[]{0x0000000000010002L,0x0000000000000100L});
	public static final BitSet FOLLOW_ID_in_atomexprs732 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DEC_NUM_in_atomexprs746 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_NUM_in_atomexprs756 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_atomexprs766 = new BitSet(new long[]{0x0000010081004000L});
	public static final BitSet FOLLOW_expressions_in_atomexprs768 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_atomexprs770 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_vardeclarations_in_codelines792 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_varassignments_in_codelines800 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_callfunctions_in_codelines808 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expressions_in_codelines816 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifconditions_in_codelines824 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forloops_in_codelines832 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileloops_in_codelines840 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_continues_in_codelines848 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_breaks_in_codelines856 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_ifconditions870 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_LPAREN_in_ifconditions872 = new BitSet(new long[]{0x0000010081004000L});
	public static final BitSet FOLLOW_expressions_in_ifconditions874 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_ifconditions876 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_LBRACE_in_ifconditions884 = new BitSet(new long[]{0x1000018591886140L,0x0000000000000C50L});
	public static final BitSet FOLLOW_codelines_in_ifconditions893 = new BitSet(new long[]{0x1000018591886140L,0x0000000000000C50L});
	public static final BitSet FOLLOW_RBRACE_in_ifconditions898 = new BitSet(new long[]{0x0000000000300002L});
	public static final BitSet FOLLOW_ELSEIF_in_ifconditions911 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_LPAREN_in_ifconditions913 = new BitSet(new long[]{0x0000010081004000L});
	public static final BitSet FOLLOW_expressions_in_ifconditions915 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_ifconditions917 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_LBRACE_in_ifconditions921 = new BitSet(new long[]{0x1000018591886140L,0x0000000000000C50L});
	public static final BitSet FOLLOW_codelines_in_ifconditions927 = new BitSet(new long[]{0x1000018591886140L,0x0000000000000C50L});
	public static final BitSet FOLLOW_RBRACE_in_ifconditions932 = new BitSet(new long[]{0x0000000000300002L});
	public static final BitSet FOLLOW_ELSE_in_ifconditions947 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_LBRACE_in_ifconditions951 = new BitSet(new long[]{0x1000018591886140L,0x0000000000000C50L});
	public static final BitSet FOLLOW_codelines_in_ifconditions957 = new BitSet(new long[]{0x1000018591886140L,0x0000000000000C50L});
	public static final BitSet FOLLOW_RBRACE_in_ifconditions962 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_forloops983 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_LPAREN_in_forloops985 = new BitSet(new long[]{0x0000010081004000L,0x0000000000000004L});
	public static final BitSet FOLLOW_expressions_in_forloops987 = new BitSet(new long[]{0x0000010081004000L,0x0000000000000004L});
	public static final BitSet FOLLOW_SEMI_in_forloops990 = new BitSet(new long[]{0x0000010081004000L,0x0000000000000004L});
	public static final BitSet FOLLOW_expressions_in_forloops992 = new BitSet(new long[]{0x0000010081004000L,0x0000000000000004L});
	public static final BitSet FOLLOW_SEMI_in_forloops995 = new BitSet(new long[]{0x4000010081004000L});
	public static final BitSet FOLLOW_expressions_in_forloops997 = new BitSet(new long[]{0x4000010081004000L});
	public static final BitSet FOLLOW_RPAREN_in_forloops1001 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_LBRACE_in_forloops1005 = new BitSet(new long[]{0x1000018591886140L,0x0000000000000C50L});
	public static final BitSet FOLLOW_codelines_in_forloops1011 = new BitSet(new long[]{0x1000018591886140L,0x0000000000000C50L});
	public static final BitSet FOLLOW_RBRACE_in_forloops1016 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_whileloops1031 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_LPAREN_in_whileloops1033 = new BitSet(new long[]{0x0000010081004000L});
	public static final BitSet FOLLOW_expressions_in_whileloops1035 = new BitSet(new long[]{0x4000010081004000L});
	public static final BitSet FOLLOW_RPAREN_in_whileloops1038 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_LBRACE_in_whileloops1042 = new BitSet(new long[]{0x1000018591886140L,0x0000000000000C50L});
	public static final BitSet FOLLOW_codelines_in_whileloops1048 = new BitSet(new long[]{0x1000018591886140L,0x0000000000000C50L});
	public static final BitSet FOLLOW_RBRACE_in_whileloops1053 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONTINUE_in_continues1065 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_SEMI_in_continues1067 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BREAK_in_breaks1079 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_SEMI_in_breaks1081 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_vartypes_in_parameters1094 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_ID_in_parameters1096 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_parameters1099 = new BitSet(new long[]{0x0000008400880100L,0x0000000000000450L});
	public static final BitSet FOLLOW_vartypes_in_parameters1101 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_ID_in_parameters1103 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_expressions_in_argvs1118 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_argvs1120 = new BitSet(new long[]{0x0000010081004000L});
	public static final BitSet FOLLOW_expressions_in_argvs1122 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_RETURN_in_retvals1138 = new BitSet(new long[]{0x0000010081004000L,0x0000000000000004L});
	public static final BitSet FOLLOW_expressions_in_retvals1141 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_SEMI_in_retvals1145 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_vartypes_in_subfunctions1165 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_ID_in_subfunctions1167 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_LPAREN_in_subfunctions1169 = new BitSet(new long[]{0x4000008400880100L,0x0000000000000450L});
	public static final BitSet FOLLOW_parameters_in_subfunctions1171 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_subfunctions1174 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_SEMI_in_subfunctions1176 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_vartypes_in_subfunctions1188 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_ID_in_subfunctions1190 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_LPAREN_in_subfunctions1192 = new BitSet(new long[]{0x4000008400880100L,0x0000000000000450L});
	public static final BitSet FOLLOW_parameters_in_subfunctions1194 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_subfunctions1197 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_LBRACE_in_subfunctions1204 = new BitSet(new long[]{0x2000018591886140L,0x0000000000000C50L});
	public static final BitSet FOLLOW_codelines_in_subfunctions1212 = new BitSet(new long[]{0x2000018591886140L,0x0000000000000C50L});
	public static final BitSet FOLLOW_retvals_in_subfunctions1221 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_RBRACE_in_subfunctions1227 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_callfunctions1239 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_LPAREN_in_callfunctions1241 = new BitSet(new long[]{0x4000010081004000L});
	public static final BitSet FOLLOW_argvs_in_callfunctions1243 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_callfunctions1246 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_SEMI_in_callfunctions1248 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_78_in_mainfunction1270 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_LPAREN_in_mainfunction1272 = new BitSet(new long[]{0x4000008400880100L,0x0000000000000450L});
	public static final BitSet FOLLOW_parameters_in_mainfunction1274 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_mainfunction1277 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_LBRACE_in_mainfunction1281 = new BitSet(new long[]{0x2000018591886140L,0x0000000000000C50L});
	public static final BitSet FOLLOW_codelines_in_mainfunction1287 = new BitSet(new long[]{0x2000018591886140L,0x0000000000000C50L});
	public static final BitSet FOLLOW_retvals_in_mainfunction1294 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_RBRACE_in_mainfunction1298 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_varassignments_in_synpred35_myChecker800 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_callfunctions_in_synpred36_myChecker808 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expressions_in_synpred37_myChecker816 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_vartypes_in_synpred57_myChecker1165 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_ID_in_synpred57_myChecker1167 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_LPAREN_in_synpred57_myChecker1169 = new BitSet(new long[]{0x4000008400880100L,0x0000000000000450L});
	public static final BitSet FOLLOW_parameters_in_synpred57_myChecker1171 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_synpred57_myChecker1174 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_SEMI_in_synpred57_myChecker1176 = new BitSet(new long[]{0x0000000000000002L});
}
