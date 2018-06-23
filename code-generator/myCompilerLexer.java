// $ANTLR 3.5.2 myCompiler.g 2018-06-23 17:44:44

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class myCompilerLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public myCompilerLexer() {} 
	public myCompilerLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public myCompilerLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "myCompiler.g"; }

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:420:6: ( 'int' )
			// myCompiler.g:420:8: 'int'
			{
			match("int"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "CHAR"
	public final void mCHAR() throws RecognitionException {
		try {
			int _type = CHAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:421:6: ( 'char' )
			// myCompiler.g:421:8: 'char'
			{
			match("char"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHAR"

	// $ANTLR start "VOID"
	public final void mVOID() throws RecognitionException {
		try {
			int _type = VOID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:422:6: ( 'void' )
			// myCompiler.g:422:8: 'void'
			{
			match("void"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VOID"

	// $ANTLR start "SHORT"
	public final void mSHORT() throws RecognitionException {
		try {
			int _type = SHORT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:423:6: ( 'short' )
			// myCompiler.g:423:8: 'short'
			{
			match("short"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SHORT"

	// $ANTLR start "LONGLONG"
	public final void mLONGLONG() throws RecognitionException {
		try {
			int _type = LONGLONG;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:424:9: ( 'long long' )
			// myCompiler.g:424:11: 'long long'
			{
			match("long long"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LONGLONG"

	// $ANTLR start "FLOAT"
	public final void mFLOAT() throws RecognitionException {
		try {
			int _type = FLOAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:425:6: ( 'float' )
			// myCompiler.g:425:8: 'float'
			{
			match("float"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT"

	// $ANTLR start "DOUBLE"
	public final void mDOUBLE() throws RecognitionException {
		try {
			int _type = DOUBLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:426:7: ( 'double' )
			// myCompiler.g:426:9: 'double'
			{
			match("double"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOUBLE"

	// $ANTLR start "STRUCT"
	public final void mSTRUCT() throws RecognitionException {
		try {
			int _type = STRUCT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:427:7: ( 'struct' )
			// myCompiler.g:427:9: 'struct'
			{
			match("struct"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRUCT"

	// $ANTLR start "ELSEIF"
	public final void mELSEIF() throws RecognitionException {
		try {
			int _type = ELSEIF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:430:7: ( 'else if' )
			// myCompiler.g:430:9: 'else if'
			{
			match("else if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ELSEIF"

	// $ANTLR start "IF"
	public final void mIF() throws RecognitionException {
		try {
			int _type = IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:431:3: ( 'if' )
			// myCompiler.g:431:5: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IF"

	// $ANTLR start "ELSE"
	public final void mELSE() throws RecognitionException {
		try {
			int _type = ELSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:432:5: ( 'else' )
			// myCompiler.g:432:7: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ELSE"

	// $ANTLR start "SWITCH"
	public final void mSWITCH() throws RecognitionException {
		try {
			int _type = SWITCH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:433:7: ( 'switch' )
			// myCompiler.g:433:9: 'switch'
			{
			match("switch"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SWITCH"

	// $ANTLR start "CASE"
	public final void mCASE() throws RecognitionException {
		try {
			int _type = CASE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:434:5: ( 'case' )
			// myCompiler.g:434:7: 'case'
			{
			match("case"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CASE"

	// $ANTLR start "BREAK"
	public final void mBREAK() throws RecognitionException {
		try {
			int _type = BREAK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:435:6: ( 'break' )
			// myCompiler.g:435:8: 'break'
			{
			match("break"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BREAK"

	// $ANTLR start "CONTINUE"
	public final void mCONTINUE() throws RecognitionException {
		try {
			int _type = CONTINUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:436:9: ( 'continue' )
			// myCompiler.g:436:11: 'continue'
			{
			match("continue"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CONTINUE"

	// $ANTLR start "FOR"
	public final void mFOR() throws RecognitionException {
		try {
			int _type = FOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:437:4: ( 'for' )
			// myCompiler.g:437:6: 'for'
			{
			match("for"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FOR"

	// $ANTLR start "WHILE"
	public final void mWHILE() throws RecognitionException {
		try {
			int _type = WHILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:438:6: ( 'while' )
			// myCompiler.g:438:8: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WHILE"

	// $ANTLR start "PRINT"
	public final void mPRINT() throws RecognitionException {
		try {
			int _type = PRINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:439:6: ( 'printf' )
			// myCompiler.g:439:8: 'printf'
			{
			match("printf"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PRINT"

	// $ANTLR start "SCANF"
	public final void mSCANF() throws RecognitionException {
		try {
			int _type = SCANF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:440:6: ( 'scanf' )
			// myCompiler.g:440:8: 'scanf'
			{
			match("scanf"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SCANF"

	// $ANTLR start "RETURN"
	public final void mRETURN() throws RecognitionException {
		try {
			int _type = RETURN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:441:7: ( 'return' )
			// myCompiler.g:441:9: 'return'
			{
			match("return"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RETURN"

	// $ANTLR start "INCLUDE"
	public final void mINCLUDE() throws RecognitionException {
		try {
			int _type = INCLUDE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:442:8: ( '#include' )
			// myCompiler.g:442:10: '#include'
			{
			match("#include"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INCLUDE"

	// $ANTLR start "EQ"
	public final void mEQ() throws RecognitionException {
		try {
			int _type = EQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:448:4: ( '==' )
			// myCompiler.g:448:6: '=='
			{
			match("=="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQ"

	// $ANTLR start "LTEQ"
	public final void mLTEQ() throws RecognitionException {
		try {
			int _type = LTEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:449:6: ( '<=' )
			// myCompiler.g:449:8: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LTEQ"

	// $ANTLR start "GTEQ"
	public final void mGTEQ() throws RecognitionException {
		try {
			int _type = GTEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:450:6: ( '>=' )
			// myCompiler.g:450:8: '>='
			{
			match(">="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GTEQ"

	// $ANTLR start "NEQ"
	public final void mNEQ() throws RecognitionException {
		try {
			int _type = NEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:451:5: ( '!=' )
			// myCompiler.g:451:7: '!='
			{
			match("!="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NEQ"

	// $ANTLR start "PP"
	public final void mPP() throws RecognitionException {
		try {
			int _type = PP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:452:4: ( '++' )
			// myCompiler.g:452:6: '++'
			{
			match("++"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PP"

	// $ANTLR start "MM"
	public final void mMM() throws RecognitionException {
		try {
			int _type = MM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:453:4: ( '--' )
			// myCompiler.g:453:6: '--'
			{
			match("--"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MM"

	// $ANTLR start "LSHIFT"
	public final void mLSHIFT() throws RecognitionException {
		try {
			int _type = LSHIFT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:454:8: ( '<<' )
			// myCompiler.g:454:10: '<<'
			{
			match("<<"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LSHIFT"

	// $ANTLR start "RSHIFT"
	public final void mRSHIFT() throws RecognitionException {
		try {
			int _type = RSHIFT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:455:8: ( '>>' )
			// myCompiler.g:455:10: '>>'
			{
			match(">>"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RSHIFT"

	// $ANTLR start "AND"
	public final void mAND() throws RecognitionException {
		try {
			int _type = AND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:456:4: ( '&&' )
			// myCompiler.g:456:6: '&&'
			{
			match("&&"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AND"

	// $ANTLR start "OR"
	public final void mOR() throws RecognitionException {
		try {
			int _type = OR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:457:3: ( '||' )
			// myCompiler.g:457:5: '||'
			{
			match("||"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OR"

	// $ANTLR start "PLUSEQ"
	public final void mPLUSEQ() throws RecognitionException {
		try {
			int _type = PLUSEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:458:7: ( '+=' )
			// myCompiler.g:458:9: '+='
			{
			match("+="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PLUSEQ"

	// $ANTLR start "MINUSEQ"
	public final void mMINUSEQ() throws RecognitionException {
		try {
			int _type = MINUSEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:459:8: ( '-=' )
			// myCompiler.g:459:10: '-='
			{
			match("-="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MINUSEQ"

	// $ANTLR start "TIMEEQ"
	public final void mTIMEEQ() throws RecognitionException {
		try {
			int _type = TIMEEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:460:7: ( '*=' )
			// myCompiler.g:460:9: '*='
			{
			match("*="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TIMEEQ"

	// $ANTLR start "DIVIDEEQ"
	public final void mDIVIDEEQ() throws RecognitionException {
		try {
			int _type = DIVIDEEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:461:9: ( '/=' )
			// myCompiler.g:461:11: '/='
			{
			match("/="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIVIDEEQ"

	// $ANTLR start "MODEQ"
	public final void mMODEQ() throws RecognitionException {
		try {
			int _type = MODEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:462:6: ( '%=' )
			// myCompiler.g:462:8: '%='
			{
			match("%="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MODEQ"

	// $ANTLR start "NGT"
	public final void mNGT() throws RecognitionException {
		try {
			int _type = NGT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:463:4: ( '!>' )
			// myCompiler.g:463:6: '!>'
			{
			match("!>"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NGT"

	// $ANTLR start "NLT"
	public final void mNLT() throws RecognitionException {
		try {
			int _type = NLT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:464:4: ( '!<' )
			// myCompiler.g:464:6: '!<'
			{
			match("!<"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NLT"

	// $ANTLR start "GT"
	public final void mGT() throws RecognitionException {
		try {
			int _type = GT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:471:3: ( '>' )
			// myCompiler.g:471:5: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GT"

	// $ANTLR start "LT"
	public final void mLT() throws RecognitionException {
		try {
			int _type = LT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:472:3: ( '<' )
			// myCompiler.g:472:5: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LT"

	// $ANTLR start "ASSIGN"
	public final void mASSIGN() throws RecognitionException {
		try {
			int _type = ASSIGN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:473:7: ( '=' )
			// myCompiler.g:473:9: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ASSIGN"

	// $ANTLR start "MINUS"
	public final void mMINUS() throws RecognitionException {
		try {
			int _type = MINUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:474:6: ( '-' )
			// myCompiler.g:474:8: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MINUS"

	// $ANTLR start "PLUS"
	public final void mPLUS() throws RecognitionException {
		try {
			int _type = PLUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:475:5: ( '+' )
			// myCompiler.g:475:7: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PLUS"

	// $ANTLR start "TIME"
	public final void mTIME() throws RecognitionException {
		try {
			int _type = TIME;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:476:5: ( '*' )
			// myCompiler.g:476:7: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TIME"

	// $ANTLR start "DIVIDE"
	public final void mDIVIDE() throws RecognitionException {
		try {
			int _type = DIVIDE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:477:7: ( '/' )
			// myCompiler.g:477:9: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIVIDE"

	// $ANTLR start "NOT"
	public final void mNOT() throws RecognitionException {
		try {
			int _type = NOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:478:4: ( '!' )
			// myCompiler.g:478:6: '!'
			{
			match('!'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOT"

	// $ANTLR start "LGAND"
	public final void mLGAND() throws RecognitionException {
		try {
			int _type = LGAND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:479:6: ( '&' )
			// myCompiler.g:479:8: '&'
			{
			match('&'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LGAND"

	// $ANTLR start "LGOR"
	public final void mLGOR() throws RecognitionException {
		try {
			int _type = LGOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:480:5: ( '|' )
			// myCompiler.g:480:7: '|'
			{
			match('|'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LGOR"

	// $ANTLR start "MOD"
	public final void mMOD() throws RecognitionException {
		try {
			int _type = MOD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:481:4: ( '%' )
			// myCompiler.g:481:6: '%'
			{
			match('%'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MOD"

	// $ANTLR start "DOT_"
	public final void mDOT_() throws RecognitionException {
		try {
			int _type = DOT_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:486:5: ( '.' )
			// myCompiler.g:486:7: '.'
			{
			match('.'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOT_"

	// $ANTLR start "COMMA"
	public final void mCOMMA() throws RecognitionException {
		try {
			int _type = COMMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:487:6: ( ',' )
			// myCompiler.g:487:8: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMA"

	// $ANTLR start "SEMI"
	public final void mSEMI() throws RecognitionException {
		try {
			int _type = SEMI;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:488:5: ( ';' )
			// myCompiler.g:488:7: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEMI"

	// $ANTLR start "COLON"
	public final void mCOLON() throws RecognitionException {
		try {
			int _type = COLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:489:6: ( ':' )
			// myCompiler.g:489:8: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COLON"

	// $ANTLR start "SHARP"
	public final void mSHARP() throws RecognitionException {
		try {
			int _type = SHARP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:490:6: ( '#' )
			// myCompiler.g:490:8: '#'
			{
			match('#'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SHARP"

	// $ANTLR start "LPAREN"
	public final void mLPAREN() throws RecognitionException {
		try {
			int _type = LPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:491:7: ( '(' )
			// myCompiler.g:491:9: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LPAREN"

	// $ANTLR start "RPAREN"
	public final void mRPAREN() throws RecognitionException {
		try {
			int _type = RPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:492:7: ( ')' )
			// myCompiler.g:492:9: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RPAREN"

	// $ANTLR start "LBRACE"
	public final void mLBRACE() throws RecognitionException {
		try {
			int _type = LBRACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:493:7: ( '{' )
			// myCompiler.g:493:9: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LBRACE"

	// $ANTLR start "RBRACE"
	public final void mRBRACE() throws RecognitionException {
		try {
			int _type = RBRACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:494:7: ( '}' )
			// myCompiler.g:494:9: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RBRACE"

	// $ANTLR start "LSQUARE"
	public final void mLSQUARE() throws RecognitionException {
		try {
			int _type = LSQUARE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:495:8: ( '[' )
			// myCompiler.g:495:10: '['
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LSQUARE"

	// $ANTLR start "RSQUARE"
	public final void mRSQUARE() throws RecognitionException {
		try {
			int _type = RSQUARE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:496:8: ( ']' )
			// myCompiler.g:496:10: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RSQUARE"

	// $ANTLR start "Identifier"
	public final void mIdentifier() throws RecognitionException {
		try {
			int _type = Identifier;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:502:11: ( ( LETTER ) ( LETTER | DIGIT )* )
			// myCompiler.g:502:12: ( LETTER ) ( LETTER | DIGIT )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// myCompiler.g:502:20: ( LETTER | DIGIT )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// myCompiler.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop1;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Identifier"

	// $ANTLR start "Integer_constant"
	public final void mInteger_constant() throws RecognitionException {
		try {
			int _type = Integer_constant;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:503:17: ( ( '0' | ( '1' .. '9' ) ( DIGIT )* ) )
			// myCompiler.g:503:19: ( '0' | ( '1' .. '9' ) ( DIGIT )* )
			{
			// myCompiler.g:503:19: ( '0' | ( '1' .. '9' ) ( DIGIT )* )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='0') ) {
				alt3=1;
			}
			else if ( ((LA3_0 >= '1' && LA3_0 <= '9')) ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// myCompiler.g:503:20: '0'
					{
					match('0'); 
					}
					break;
				case 2 :
					// myCompiler.g:503:26: ( '1' .. '9' ) ( DIGIT )*
					{
					if ( (input.LA(1) >= '1' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					// myCompiler.g:503:36: ( DIGIT )*
					loop2:
					while (true) {
						int alt2=2;
						int LA2_0 = input.LA(1);
						if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
							alt2=1;
						}

						switch (alt2) {
						case 1 :
							// myCompiler.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop2;
						}
					}

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Integer_constant"

	// $ANTLR start "Floating_point_constant"
	public final void mFloating_point_constant() throws RecognitionException {
		try {
			int _type = Floating_point_constant;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:504:24: ( FLOAT_NUM1 | FLOAT_NUM2 | FLOAT_NUM3 )
			int alt4=3;
			alt4 = dfa4.predict(input);
			switch (alt4) {
				case 1 :
					// myCompiler.g:504:25: FLOAT_NUM1
					{
					mFLOAT_NUM1(); 

					}
					break;
				case 2 :
					// myCompiler.g:504:38: FLOAT_NUM2
					{
					mFLOAT_NUM2(); 

					}
					break;
				case 3 :
					// myCompiler.g:504:51: FLOAT_NUM3
					{
					mFLOAT_NUM3(); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Floating_point_constant"

	// $ANTLR start "STRING_LITERAL"
	public final void mSTRING_LITERAL() throws RecognitionException {
		try {
			int _type = STRING_LITERAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:505:15: ( '\"' ( EscapeSequence |~ ( '\\\\' | '\"' ) )* '\"' )
			// myCompiler.g:505:18: '\"' ( EscapeSequence |~ ( '\\\\' | '\"' ) )* '\"'
			{
			match('\"'); 
			// myCompiler.g:505:22: ( EscapeSequence |~ ( '\\\\' | '\"' ) )*
			loop5:
			while (true) {
				int alt5=3;
				int LA5_0 = input.LA(1);
				if ( (LA5_0=='\\') ) {
					alt5=1;
				}
				else if ( ((LA5_0 >= '\u0000' && LA5_0 <= '!')||(LA5_0 >= '#' && LA5_0 <= '[')||(LA5_0 >= ']' && LA5_0 <= '\uFFFF')) ) {
					alt5=2;
				}

				switch (alt5) {
				case 1 :
					// myCompiler.g:505:24: EscapeSequence
					{
					mEscapeSequence(); 

					}
					break;
				case 2 :
					// myCompiler.g:505:41: ~ ( '\\\\' | '\"' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop5;
				}
			}

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING_LITERAL"

	// $ANTLR start "PREPROCESSOR"
	public final void mPREPROCESSOR() throws RecognitionException {
		try {
			int _type = PREPROCESSOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:507:14: ( '#' ( . )* '\\n' )
			// myCompiler.g:507:16: '#' ( . )* '\\n'
			{
			match('#'); 
			// myCompiler.g:507:19: ( . )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0=='\n') ) {
					alt6=2;
				}
				else if ( ((LA6_0 >= '\u0000' && LA6_0 <= '\t')||(LA6_0 >= '\u000B' && LA6_0 <= '\uFFFF')) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// myCompiler.g:507:20: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop6;
				}
			}

			match('\n'); 
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PREPROCESSOR"

	// $ANTLR start "EscapeSequence"
	public final void mEscapeSequence() throws RecognitionException {
		try {
			// myCompiler.g:514:24: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) )
			// myCompiler.g:514:26: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
			{
			match('\\'); 
			if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EscapeSequence"

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// myCompiler.g:515:17: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )
			// myCompiler.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LETTER"

	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			// myCompiler.g:516:16: ( '0' .. '9' )
			// myCompiler.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIGIT"

	// $ANTLR start "FLOAT_NUM1"
	public final void mFLOAT_NUM1() throws RecognitionException {
		try {
			// myCompiler.g:517:20: ( ( DIGIT )+ '.' ( DIGIT )* )
			// myCompiler.g:517:22: ( DIGIT )+ '.' ( DIGIT )*
			{
			// myCompiler.g:517:22: ( DIGIT )+
			int cnt7=0;
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( ((LA7_0 >= '0' && LA7_0 <= '9')) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// myCompiler.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt7 >= 1 ) break loop7;
					EarlyExitException eee = new EarlyExitException(7, input);
					throw eee;
				}
				cnt7++;
			}

			match('.'); 
			// myCompiler.g:517:33: ( DIGIT )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// myCompiler.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop8;
				}
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT_NUM1"

	// $ANTLR start "FLOAT_NUM2"
	public final void mFLOAT_NUM2() throws RecognitionException {
		try {
			// myCompiler.g:518:20: ( '.' ( DIGIT )+ )
			// myCompiler.g:518:22: '.' ( DIGIT )+
			{
			match('.'); 
			// myCompiler.g:518:25: ( DIGIT )+
			int cnt9=0;
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( ((LA9_0 >= '0' && LA9_0 <= '9')) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// myCompiler.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt9 >= 1 ) break loop9;
					EarlyExitException eee = new EarlyExitException(9, input);
					throw eee;
				}
				cnt9++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT_NUM2"

	// $ANTLR start "FLOAT_NUM3"
	public final void mFLOAT_NUM3() throws RecognitionException {
		try {
			// myCompiler.g:519:20: ( ( DIGIT )+ )
			// myCompiler.g:519:22: ( DIGIT )+
			{
			// myCompiler.g:519:22: ( DIGIT )+
			int cnt10=0;
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( ((LA10_0 >= '0' && LA10_0 <= '9')) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// myCompiler.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt10 >= 1 ) break loop10;
					EarlyExitException eee = new EarlyExitException(10, input);
					throw eee;
				}
				cnt10++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT_NUM3"

	// $ANTLR start "COMMENT1"
	public final void mCOMMENT1() throws RecognitionException {
		try {
			int _type = COMMENT1;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:526:10: ( '//' ( . )* '\\n' )
			// myCompiler.g:526:12: '//' ( . )* '\\n'
			{
			match("//"); 

			// myCompiler.g:526:16: ( . )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0=='\n') ) {
					alt11=2;
				}
				else if ( ((LA11_0 >= '\u0000' && LA11_0 <= '\t')||(LA11_0 >= '\u000B' && LA11_0 <= '\uFFFF')) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// myCompiler.g:526:17: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop11;
				}
			}

			match('\n'); 
			skip();
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT1"

	// $ANTLR start "COMMENT2"
	public final void mCOMMENT2() throws RecognitionException {
		try {
			int _type = COMMENT2;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:527:10: ( '/*' ( options {greedy=false; } : . )* '*/' )
			// myCompiler.g:527:12: '/*' ( options {greedy=false; } : . )* '*/'
			{
			match("/*"); 

			// myCompiler.g:527:17: ( options {greedy=false; } : . )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0=='*') ) {
					int LA12_1 = input.LA(2);
					if ( (LA12_1=='/') ) {
						alt12=2;
					}
					else if ( ((LA12_1 >= '\u0000' && LA12_1 <= '.')||(LA12_1 >= '0' && LA12_1 <= '\uFFFF')) ) {
						alt12=1;
					}

				}
				else if ( ((LA12_0 >= '\u0000' && LA12_0 <= ')')||(LA12_0 >= '+' && LA12_0 <= '\uFFFF')) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// myCompiler.g:527:42: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop12;
				}
			}

			match("*/"); 

			skip();
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT2"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:532:5: ( ( ' ' | '\\r' | '\\t' | '\\n' )+ )
			// myCompiler.g:532:7: ( ' ' | '\\r' | '\\t' | '\\n' )+
			{
			// myCompiler.g:532:7: ( ' ' | '\\r' | '\\t' | '\\n' )+
			int cnt13=0;
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( ((LA13_0 >= '\t' && LA13_0 <= '\n')||LA13_0=='\r'||LA13_0==' ') ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// myCompiler.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt13 >= 1 ) break loop13;
					EarlyExitException eee = new EarlyExitException(13, input);
					throw eee;
				}
				cnt13++;
			}

			skip();
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	@Override
	public void mTokens() throws RecognitionException {
		// myCompiler.g:1:8: ( INT | CHAR | VOID | SHORT | LONGLONG | FLOAT | DOUBLE | STRUCT | ELSEIF | IF | ELSE | SWITCH | CASE | BREAK | CONTINUE | FOR | WHILE | PRINT | SCANF | RETURN | INCLUDE | EQ | LTEQ | GTEQ | NEQ | PP | MM | LSHIFT | RSHIFT | AND | OR | PLUSEQ | MINUSEQ | TIMEEQ | DIVIDEEQ | MODEQ | NGT | NLT | GT | LT | ASSIGN | MINUS | PLUS | TIME | DIVIDE | NOT | LGAND | LGOR | MOD | DOT_ | COMMA | SEMI | COLON | SHARP | LPAREN | RPAREN | LBRACE | RBRACE | LSQUARE | RSQUARE | Identifier | Integer_constant | Floating_point_constant | STRING_LITERAL | PREPROCESSOR | COMMENT1 | COMMENT2 | WS )
		int alt14=68;
		alt14 = dfa14.predict(input);
		switch (alt14) {
			case 1 :
				// myCompiler.g:1:10: INT
				{
				mINT(); 

				}
				break;
			case 2 :
				// myCompiler.g:1:14: CHAR
				{
				mCHAR(); 

				}
				break;
			case 3 :
				// myCompiler.g:1:19: VOID
				{
				mVOID(); 

				}
				break;
			case 4 :
				// myCompiler.g:1:24: SHORT
				{
				mSHORT(); 

				}
				break;
			case 5 :
				// myCompiler.g:1:30: LONGLONG
				{
				mLONGLONG(); 

				}
				break;
			case 6 :
				// myCompiler.g:1:39: FLOAT
				{
				mFLOAT(); 

				}
				break;
			case 7 :
				// myCompiler.g:1:45: DOUBLE
				{
				mDOUBLE(); 

				}
				break;
			case 8 :
				// myCompiler.g:1:52: STRUCT
				{
				mSTRUCT(); 

				}
				break;
			case 9 :
				// myCompiler.g:1:59: ELSEIF
				{
				mELSEIF(); 

				}
				break;
			case 10 :
				// myCompiler.g:1:66: IF
				{
				mIF(); 

				}
				break;
			case 11 :
				// myCompiler.g:1:69: ELSE
				{
				mELSE(); 

				}
				break;
			case 12 :
				// myCompiler.g:1:74: SWITCH
				{
				mSWITCH(); 

				}
				break;
			case 13 :
				// myCompiler.g:1:81: CASE
				{
				mCASE(); 

				}
				break;
			case 14 :
				// myCompiler.g:1:86: BREAK
				{
				mBREAK(); 

				}
				break;
			case 15 :
				// myCompiler.g:1:92: CONTINUE
				{
				mCONTINUE(); 

				}
				break;
			case 16 :
				// myCompiler.g:1:101: FOR
				{
				mFOR(); 

				}
				break;
			case 17 :
				// myCompiler.g:1:105: WHILE
				{
				mWHILE(); 

				}
				break;
			case 18 :
				// myCompiler.g:1:111: PRINT
				{
				mPRINT(); 

				}
				break;
			case 19 :
				// myCompiler.g:1:117: SCANF
				{
				mSCANF(); 

				}
				break;
			case 20 :
				// myCompiler.g:1:123: RETURN
				{
				mRETURN(); 

				}
				break;
			case 21 :
				// myCompiler.g:1:130: INCLUDE
				{
				mINCLUDE(); 

				}
				break;
			case 22 :
				// myCompiler.g:1:138: EQ
				{
				mEQ(); 

				}
				break;
			case 23 :
				// myCompiler.g:1:141: LTEQ
				{
				mLTEQ(); 

				}
				break;
			case 24 :
				// myCompiler.g:1:146: GTEQ
				{
				mGTEQ(); 

				}
				break;
			case 25 :
				// myCompiler.g:1:151: NEQ
				{
				mNEQ(); 

				}
				break;
			case 26 :
				// myCompiler.g:1:155: PP
				{
				mPP(); 

				}
				break;
			case 27 :
				// myCompiler.g:1:158: MM
				{
				mMM(); 

				}
				break;
			case 28 :
				// myCompiler.g:1:161: LSHIFT
				{
				mLSHIFT(); 

				}
				break;
			case 29 :
				// myCompiler.g:1:168: RSHIFT
				{
				mRSHIFT(); 

				}
				break;
			case 30 :
				// myCompiler.g:1:175: AND
				{
				mAND(); 

				}
				break;
			case 31 :
				// myCompiler.g:1:179: OR
				{
				mOR(); 

				}
				break;
			case 32 :
				// myCompiler.g:1:182: PLUSEQ
				{
				mPLUSEQ(); 

				}
				break;
			case 33 :
				// myCompiler.g:1:189: MINUSEQ
				{
				mMINUSEQ(); 

				}
				break;
			case 34 :
				// myCompiler.g:1:197: TIMEEQ
				{
				mTIMEEQ(); 

				}
				break;
			case 35 :
				// myCompiler.g:1:204: DIVIDEEQ
				{
				mDIVIDEEQ(); 

				}
				break;
			case 36 :
				// myCompiler.g:1:213: MODEQ
				{
				mMODEQ(); 

				}
				break;
			case 37 :
				// myCompiler.g:1:219: NGT
				{
				mNGT(); 

				}
				break;
			case 38 :
				// myCompiler.g:1:223: NLT
				{
				mNLT(); 

				}
				break;
			case 39 :
				// myCompiler.g:1:227: GT
				{
				mGT(); 

				}
				break;
			case 40 :
				// myCompiler.g:1:230: LT
				{
				mLT(); 

				}
				break;
			case 41 :
				// myCompiler.g:1:233: ASSIGN
				{
				mASSIGN(); 

				}
				break;
			case 42 :
				// myCompiler.g:1:240: MINUS
				{
				mMINUS(); 

				}
				break;
			case 43 :
				// myCompiler.g:1:246: PLUS
				{
				mPLUS(); 

				}
				break;
			case 44 :
				// myCompiler.g:1:251: TIME
				{
				mTIME(); 

				}
				break;
			case 45 :
				// myCompiler.g:1:256: DIVIDE
				{
				mDIVIDE(); 

				}
				break;
			case 46 :
				// myCompiler.g:1:263: NOT
				{
				mNOT(); 

				}
				break;
			case 47 :
				// myCompiler.g:1:267: LGAND
				{
				mLGAND(); 

				}
				break;
			case 48 :
				// myCompiler.g:1:273: LGOR
				{
				mLGOR(); 

				}
				break;
			case 49 :
				// myCompiler.g:1:278: MOD
				{
				mMOD(); 

				}
				break;
			case 50 :
				// myCompiler.g:1:282: DOT_
				{
				mDOT_(); 

				}
				break;
			case 51 :
				// myCompiler.g:1:287: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 52 :
				// myCompiler.g:1:293: SEMI
				{
				mSEMI(); 

				}
				break;
			case 53 :
				// myCompiler.g:1:298: COLON
				{
				mCOLON(); 

				}
				break;
			case 54 :
				// myCompiler.g:1:304: SHARP
				{
				mSHARP(); 

				}
				break;
			case 55 :
				// myCompiler.g:1:310: LPAREN
				{
				mLPAREN(); 

				}
				break;
			case 56 :
				// myCompiler.g:1:317: RPAREN
				{
				mRPAREN(); 

				}
				break;
			case 57 :
				// myCompiler.g:1:324: LBRACE
				{
				mLBRACE(); 

				}
				break;
			case 58 :
				// myCompiler.g:1:331: RBRACE
				{
				mRBRACE(); 

				}
				break;
			case 59 :
				// myCompiler.g:1:338: LSQUARE
				{
				mLSQUARE(); 

				}
				break;
			case 60 :
				// myCompiler.g:1:346: RSQUARE
				{
				mRSQUARE(); 

				}
				break;
			case 61 :
				// myCompiler.g:1:354: Identifier
				{
				mIdentifier(); 

				}
				break;
			case 62 :
				// myCompiler.g:1:365: Integer_constant
				{
				mInteger_constant(); 

				}
				break;
			case 63 :
				// myCompiler.g:1:382: Floating_point_constant
				{
				mFloating_point_constant(); 

				}
				break;
			case 64 :
				// myCompiler.g:1:406: STRING_LITERAL
				{
				mSTRING_LITERAL(); 

				}
				break;
			case 65 :
				// myCompiler.g:1:421: PREPROCESSOR
				{
				mPREPROCESSOR(); 

				}
				break;
			case 66 :
				// myCompiler.g:1:434: COMMENT1
				{
				mCOMMENT1(); 

				}
				break;
			case 67 :
				// myCompiler.g:1:443: COMMENT2
				{
				mCOMMENT2(); 

				}
				break;
			case 68 :
				// myCompiler.g:1:452: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA4 dfa4 = new DFA4(this);
	protected DFA14 dfa14 = new DFA14(this);
	static final String DFA4_eotS =
		"\1\uffff\1\4\3\uffff";
	static final String DFA4_eofS =
		"\5\uffff";
	static final String DFA4_minS =
		"\2\56\3\uffff";
	static final String DFA4_maxS =
		"\2\71\3\uffff";
	static final String DFA4_acceptS =
		"\2\uffff\1\2\1\1\1\3";
	static final String DFA4_specialS =
		"\5\uffff}>";
	static final String[] DFA4_transitionS = {
			"\1\2\1\uffff\12\1",
			"\1\3\1\uffff\12\1",
			"",
			"",
			""
	};

	static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
	static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
	static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
	static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
	static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
	static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
	static final short[][] DFA4_transition;

	static {
		int numStates = DFA4_transitionS.length;
		DFA4_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
		}
	}

	protected class DFA4 extends DFA {

		public DFA4(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 4;
			this.eot = DFA4_eot;
			this.eof = DFA4_eof;
			this.min = DFA4_min;
			this.max = DFA4_max;
			this.accept = DFA4_accept;
			this.special = DFA4_special;
			this.transition = DFA4_transition;
		}
		@Override
		public String getDescription() {
			return "504:1: Floating_point_constant : ( FLOAT_NUM1 | FLOAT_NUM2 | FLOAT_NUM3 );";
		}
	}

	static final String DFA14_eotS =
		"\1\uffff\14\43\1\74\1\77\1\102\1\105\1\111\1\114\1\117\1\121\1\123\1\125"+
		"\1\131\1\133\1\134\12\uffff\2\136\2\uffff\1\43\1\141\21\43\44\uffff\1"+
		"\136\1\164\1\uffff\12\43\1\177\6\43\2\uffff\1\u0087\1\u0088\1\43\1\u008a"+
		"\6\43\1\uffff\1\43\1\u0093\4\43\3\uffff\1\43\1\uffff\1\u009a\2\43\1\u009d"+
		"\1\uffff\1\u009e\1\43\2\uffff\1\u00a0\1\u00a1\2\43\1\uffff\1\43\1\uffff"+
		"\1\u00a6\1\u00a7\2\uffff\1\u00a8\2\uffff\1\u00a9\1\u00aa\1\uffff\1\43"+
		"\6\uffff\1\u00ae\1\u00af\2\uffff";
	static final String DFA14_eofS =
		"\u00b0\uffff";
	static final String DFA14_minS =
		"\1\11\1\146\1\141\1\157\1\143\1\157\1\154\1\157\1\154\1\162\1\150\1\162"+
		"\1\145\1\0\1\75\1\74\1\75\1\74\1\53\1\55\1\46\1\174\1\75\1\52\1\75\1\60"+
		"\12\uffff\2\56\2\uffff\1\164\1\60\1\141\1\163\1\156\1\151\1\157\1\162"+
		"\1\151\1\141\1\156\1\157\1\162\1\165\1\163\1\145\2\151\1\164\1\0\43\uffff"+
		"\1\56\1\60\1\uffff\1\162\1\145\1\164\1\144\1\162\1\165\1\164\1\156\1\147"+
		"\1\141\1\60\1\142\1\145\1\141\1\154\1\156\1\165\1\0\1\uffff\2\60\1\151"+
		"\1\60\1\164\2\143\1\146\1\40\1\164\1\uffff\1\154\1\40\1\153\1\145\1\164"+
		"\1\162\1\0\2\uffff\1\156\1\uffff\1\60\1\164\1\150\1\60\1\uffff\1\60\1"+
		"\145\2\uffff\2\60\1\146\1\156\1\0\1\165\1\uffff\2\60\2\uffff\1\60\2\uffff"+
		"\2\60\1\0\1\145\5\uffff\1\0\1\60\1\0\2\uffff";
	static final String DFA14_maxS =
		"\1\175\1\156\2\157\1\167\3\157\1\154\1\162\1\150\1\162\1\145\1\uffff\2"+
		"\75\2\76\2\75\1\46\1\174\3\75\1\71\12\uffff\2\71\2\uffff\1\164\1\172\1"+
		"\141\1\163\1\156\1\151\1\157\1\162\1\151\1\141\1\156\1\157\1\162\1\165"+
		"\1\163\1\145\2\151\1\164\1\uffff\43\uffff\1\71\1\172\1\uffff\1\162\1\145"+
		"\1\164\1\144\1\162\1\165\1\164\1\156\1\147\1\141\1\172\1\142\1\145\1\141"+
		"\1\154\1\156\1\165\1\uffff\1\uffff\2\172\1\151\1\172\1\164\2\143\1\146"+
		"\1\40\1\164\1\uffff\1\154\1\172\1\153\1\145\1\164\1\162\1\uffff\2\uffff"+
		"\1\156\1\uffff\1\172\1\164\1\150\1\172\1\uffff\1\172\1\145\2\uffff\2\172"+
		"\1\146\1\156\1\uffff\1\165\1\uffff\2\172\2\uffff\1\172\2\uffff\2\172\1"+
		"\uffff\1\145\5\uffff\1\uffff\1\172\1\uffff\2\uffff";
	static final String DFA14_acceptS =
		"\32\uffff\1\63\1\64\1\65\1\67\1\70\1\71\1\72\1\73\1\74\1\75\2\uffff\1"+
		"\100\1\104\24\uffff\1\66\1\101\1\26\1\51\1\27\1\34\1\50\1\30\1\35\1\47"+
		"\1\31\1\45\1\46\1\56\1\32\1\40\1\53\1\33\1\41\1\52\1\36\1\57\1\37\1\60"+
		"\1\42\1\54\1\43\1\102\1\103\1\55\1\44\1\61\1\62\1\77\1\76\2\uffff\1\12"+
		"\22\uffff\1\1\12\uffff\1\20\7\uffff\1\2\1\15\1\uffff\1\3\4\uffff\1\5\2"+
		"\uffff\1\11\1\13\6\uffff\1\4\2\uffff\1\23\1\6\1\uffff\1\16\1\21\4\uffff"+
		"\1\10\1\14\1\7\1\22\1\24\3\uffff\1\17\1\25";
	static final String DFA14_specialS =
		"\15\uffff\1\1\55\uffff\1\2\67\uffff\1\3\22\uffff\1\4\21\uffff\1\5\13\uffff"+
		"\1\6\6\uffff\1\7\1\uffff\1\0\2\uffff}>";
	static final String[] DFA14_transitionS = {
			"\2\47\2\uffff\1\47\22\uffff\1\47\1\21\1\46\1\15\1\uffff\1\30\1\24\1\uffff"+
			"\1\35\1\36\1\26\1\22\1\32\1\23\1\31\1\27\1\44\11\45\1\34\1\33\1\17\1"+
			"\16\1\20\2\uffff\32\43\1\41\1\uffff\1\42\1\uffff\1\43\1\uffff\1\43\1"+
			"\11\1\2\1\7\1\10\1\6\2\43\1\1\2\43\1\5\3\43\1\13\1\43\1\14\1\4\2\43\1"+
			"\3\1\12\3\43\1\37\1\25\1\40",
			"\1\51\7\uffff\1\50",
			"\1\53\6\uffff\1\52\6\uffff\1\54",
			"\1\55",
			"\1\61\4\uffff\1\56\13\uffff\1\57\2\uffff\1\60",
			"\1\62",
			"\1\63\2\uffff\1\64",
			"\1\65",
			"\1\66",
			"\1\67",
			"\1\70",
			"\1\71",
			"\1\72",
			"\151\75\1\73\uff96\75",
			"\1\76",
			"\1\101\1\100",
			"\1\103\1\104",
			"\1\110\1\106\1\107",
			"\1\112\21\uffff\1\113",
			"\1\115\17\uffff\1\116",
			"\1\120",
			"\1\122",
			"\1\124",
			"\1\130\4\uffff\1\127\15\uffff\1\126",
			"\1\132",
			"\12\135",
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
			"\1\135\1\uffff\12\135",
			"\1\135\1\uffff\12\137",
			"",
			"",
			"\1\140",
			"\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"\1\142",
			"\1\143",
			"\1\144",
			"\1\145",
			"\1\146",
			"\1\147",
			"\1\150",
			"\1\151",
			"\1\152",
			"\1\153",
			"\1\154",
			"\1\155",
			"\1\156",
			"\1\157",
			"\1\160",
			"\1\161",
			"\1\162",
			"\156\75\1\163\uff91\75",
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
			"\1\135\1\uffff\12\137",
			"\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"",
			"\1\165",
			"\1\166",
			"\1\167",
			"\1\170",
			"\1\171",
			"\1\172",
			"\1\173",
			"\1\174",
			"\1\175",
			"\1\176",
			"\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"\1\u0080",
			"\1\u0081",
			"\1\u0082",
			"\1\u0083",
			"\1\u0084",
			"\1\u0085",
			"\143\75\1\u0086\uff9c\75",
			"",
			"\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"\1\u0089",
			"\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"\1\u008b",
			"\1\u008c",
			"\1\u008d",
			"\1\u008e",
			"\1\u008f",
			"\1\u0090",
			"",
			"\1\u0091",
			"\1\u0092\17\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"\1\u0094",
			"\1\u0095",
			"\1\u0096",
			"\1\u0097",
			"\154\75\1\u0098\uff93\75",
			"",
			"",
			"\1\u0099",
			"",
			"\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"\1\u009b",
			"\1\u009c",
			"\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"",
			"\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"\1\u009f",
			"",
			"",
			"\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"\1\u00a2",
			"\1\u00a3",
			"\165\75\1\u00a4\uff8a\75",
			"\1\u00a5",
			"",
			"\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"",
			"",
			"\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"",
			"",
			"\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"\144\75\1\u00ab\uff9b\75",
			"\1\u00ac",
			"",
			"",
			"",
			"",
			"",
			"\145\75\1\u00ad\uff9a\75",
			"\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43",
			"\0\75",
			"",
			""
	};

	static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
	static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
	static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
	static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
	static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
	static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
	static final short[][] DFA14_transition;

	static {
		int numStates = DFA14_transitionS.length;
		DFA14_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
		}
	}

	protected class DFA14 extends DFA {

		public DFA14(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 14;
			this.eot = DFA14_eot;
			this.eof = DFA14_eof;
			this.min = DFA14_min;
			this.max = DFA14_max;
			this.accept = DFA14_accept;
			this.special = DFA14_special;
			this.transition = DFA14_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( INT | CHAR | VOID | SHORT | LONGLONG | FLOAT | DOUBLE | STRUCT | ELSEIF | IF | ELSE | SWITCH | CASE | BREAK | CONTINUE | FOR | WHILE | PRINT | SCANF | RETURN | INCLUDE | EQ | LTEQ | GTEQ | NEQ | PP | MM | LSHIFT | RSHIFT | AND | OR | PLUSEQ | MINUSEQ | TIMEEQ | DIVIDEEQ | MODEQ | NGT | NLT | GT | LT | ASSIGN | MINUS | PLUS | TIME | DIVIDE | NOT | LGAND | LGOR | MOD | DOT_ | COMMA | SEMI | COLON | SHARP | LPAREN | RPAREN | LBRACE | RBRACE | LSQUARE | RSQUARE | Identifier | Integer_constant | Floating_point_constant | STRING_LITERAL | PREPROCESSOR | COMMENT1 | COMMENT2 | WS );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA14_173 = input.LA(1);
						s = -1;
						if ( ((LA14_173 >= '\u0000' && LA14_173 <= '\uFFFF')) ) {s = 61;}
						else s = 175;
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA14_13 = input.LA(1);
						s = -1;
						if ( (LA14_13=='i') ) {s = 59;}
						else if ( ((LA14_13 >= '\u0000' && LA14_13 <= 'h')||(LA14_13 >= 'j' && LA14_13 <= '\uFFFF')) ) {s = 61;}
						else s = 60;
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA14_59 = input.LA(1);
						s = -1;
						if ( (LA14_59=='n') ) {s = 115;}
						else if ( ((LA14_59 >= '\u0000' && LA14_59 <= 'm')||(LA14_59 >= 'o' && LA14_59 <= '\uFFFF')) ) {s = 61;}
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA14_115 = input.LA(1);
						s = -1;
						if ( (LA14_115=='c') ) {s = 134;}
						else if ( ((LA14_115 >= '\u0000' && LA14_115 <= 'b')||(LA14_115 >= 'd' && LA14_115 <= '\uFFFF')) ) {s = 61;}
						if ( s>=0 ) return s;
						break;

					case 4 : 
						int LA14_134 = input.LA(1);
						s = -1;
						if ( (LA14_134=='l') ) {s = 152;}
						else if ( ((LA14_134 >= '\u0000' && LA14_134 <= 'k')||(LA14_134 >= 'm' && LA14_134 <= '\uFFFF')) ) {s = 61;}
						if ( s>=0 ) return s;
						break;

					case 5 : 
						int LA14_152 = input.LA(1);
						s = -1;
						if ( (LA14_152=='u') ) {s = 164;}
						else if ( ((LA14_152 >= '\u0000' && LA14_152 <= 't')||(LA14_152 >= 'v' && LA14_152 <= '\uFFFF')) ) {s = 61;}
						if ( s>=0 ) return s;
						break;

					case 6 : 
						int LA14_164 = input.LA(1);
						s = -1;
						if ( (LA14_164=='d') ) {s = 171;}
						else if ( ((LA14_164 >= '\u0000' && LA14_164 <= 'c')||(LA14_164 >= 'e' && LA14_164 <= '\uFFFF')) ) {s = 61;}
						if ( s>=0 ) return s;
						break;

					case 7 : 
						int LA14_171 = input.LA(1);
						s = -1;
						if ( (LA14_171=='e') ) {s = 173;}
						else if ( ((LA14_171 >= '\u0000' && LA14_171 <= 'd')||(LA14_171 >= 'f' && LA14_171 <= '\uFFFF')) ) {s = 61;}
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 14, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}
