// $ANTLR 3.5.2 myChecker.g 2018-05-28 17:28:28

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class myCheckerLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public myCheckerLexer() {} 
	public myCheckerLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public myCheckerLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "myChecker.g"; }

	// $ANTLR start "T__77"
	public final void mT__77() throws RecognitionException {
		try {
			int _type = T__77;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:7:7: ( '.h' )
			// myChecker.g:7:9: '.h'
			{
			match(".h"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__77"

	// $ANTLR start "T__78"
	public final void mT__78() throws RecognitionException {
		try {
			int _type = T__78;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:8:7: ( 'main' )
			// myChecker.g:8:9: 'main'
			{
			match("main"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__78"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:369:6: ( 'int' )
			// myChecker.g:369:8: 'int'
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
			// myChecker.g:370:6: ( 'char' )
			// myChecker.g:370:8: 'char'
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
			// myChecker.g:371:6: ( 'void' )
			// myChecker.g:371:8: 'void'
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
			// myChecker.g:372:6: ( 'short' )
			// myChecker.g:372:8: 'short'
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
			// myChecker.g:373:9: ( 'long long' )
			// myChecker.g:373:11: 'long long'
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
			// myChecker.g:374:6: ( 'float' )
			// myChecker.g:374:8: 'float'
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
			// myChecker.g:375:7: ( 'double' )
			// myChecker.g:375:9: 'double'
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
			// myChecker.g:376:7: ( 'struct' )
			// myChecker.g:376:9: 'struct'
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
			// myChecker.g:379:7: ( 'else if' )
			// myChecker.g:379:9: 'else if'
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
			// myChecker.g:380:3: ( 'if' )
			// myChecker.g:380:5: 'if'
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
			// myChecker.g:381:5: ( 'else' )
			// myChecker.g:381:7: 'else'
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
			// myChecker.g:382:7: ( 'switch' )
			// myChecker.g:382:9: 'switch'
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
			// myChecker.g:383:5: ( 'case' )
			// myChecker.g:383:7: 'case'
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
			// myChecker.g:384:6: ( 'break' )
			// myChecker.g:384:8: 'break'
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
			// myChecker.g:385:9: ( 'continue' )
			// myChecker.g:385:11: 'continue'
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
			// myChecker.g:386:4: ( 'for' )
			// myChecker.g:386:6: 'for'
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
			// myChecker.g:387:6: ( 'while' )
			// myChecker.g:387:8: 'while'
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
			// myChecker.g:388:6: ( 'printf' )
			// myChecker.g:388:8: 'printf'
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
			// myChecker.g:389:6: ( 'scanf' )
			// myChecker.g:389:8: 'scanf'
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
			// myChecker.g:390:7: ( 'return' )
			// myChecker.g:390:9: 'return'
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
			// myChecker.g:391:8: ( '#include' )
			// myChecker.g:391:10: '#include'
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
			// myChecker.g:397:4: ( '==' )
			// myChecker.g:397:6: '=='
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
			// myChecker.g:398:6: ( '<=' )
			// myChecker.g:398:8: '<='
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
			// myChecker.g:399:6: ( '>=' )
			// myChecker.g:399:8: '>='
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
			// myChecker.g:400:5: ( '!=' )
			// myChecker.g:400:7: '!='
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
			// myChecker.g:401:4: ( '++' )
			// myChecker.g:401:6: '++'
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
			// myChecker.g:402:4: ( '--' )
			// myChecker.g:402:6: '--'
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
			// myChecker.g:403:8: ( '<<' )
			// myChecker.g:403:10: '<<'
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
			// myChecker.g:404:8: ( '>>' )
			// myChecker.g:404:10: '>>'
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
			// myChecker.g:405:4: ( '&&' )
			// myChecker.g:405:6: '&&'
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
			// myChecker.g:406:3: ( '||' )
			// myChecker.g:406:5: '||'
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
			// myChecker.g:407:7: ( '+=' )
			// myChecker.g:407:9: '+='
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
			// myChecker.g:408:8: ( '-=' )
			// myChecker.g:408:10: '-='
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
			// myChecker.g:409:7: ( '*=' )
			// myChecker.g:409:9: '*='
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
			// myChecker.g:410:9: ( '/=' )
			// myChecker.g:410:11: '/='
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
			// myChecker.g:411:6: ( '%=' )
			// myChecker.g:411:8: '%='
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
			// myChecker.g:412:4: ( '!>' )
			// myChecker.g:412:6: '!>'
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
			// myChecker.g:413:4: ( '!<' )
			// myChecker.g:413:6: '!<'
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
			// myChecker.g:420:3: ( '>' )
			// myChecker.g:420:5: '>'
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
			// myChecker.g:421:3: ( '<' )
			// myChecker.g:421:5: '<'
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
			// myChecker.g:422:7: ( '=' )
			// myChecker.g:422:9: '='
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
			// myChecker.g:423:6: ( '-' )
			// myChecker.g:423:8: '-'
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
			// myChecker.g:424:5: ( '+' )
			// myChecker.g:424:7: '+'
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
			// myChecker.g:425:5: ( '*' )
			// myChecker.g:425:7: '*'
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
			// myChecker.g:426:7: ( '/' )
			// myChecker.g:426:9: '/'
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
			// myChecker.g:427:4: ( '!' )
			// myChecker.g:427:6: '!'
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
			// myChecker.g:428:6: ( '&' )
			// myChecker.g:428:8: '&'
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
			// myChecker.g:429:5: ( '|' )
			// myChecker.g:429:7: '|'
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
			// myChecker.g:430:4: ( '%' )
			// myChecker.g:430:6: '%'
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
			// myChecker.g:435:5: ( '.' )
			// myChecker.g:435:7: '.'
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
			// myChecker.g:436:6: ( ',' )
			// myChecker.g:436:8: ','
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
			// myChecker.g:437:5: ( ';' )
			// myChecker.g:437:7: ';'
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
			// myChecker.g:438:6: ( ':' )
			// myChecker.g:438:8: ':'
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
			// myChecker.g:439:6: ( '#' )
			// myChecker.g:439:8: '#'
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
			// myChecker.g:440:7: ( '(' )
			// myChecker.g:440:9: '('
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
			// myChecker.g:441:7: ( ')' )
			// myChecker.g:441:9: ')'
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
			// myChecker.g:442:7: ( '{' )
			// myChecker.g:442:9: '{'
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
			// myChecker.g:443:7: ( '}' )
			// myChecker.g:443:9: '}'
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
			// myChecker.g:444:8: ( '[' )
			// myChecker.g:444:10: '['
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
			// myChecker.g:445:8: ( ']' )
			// myChecker.g:445:10: ']'
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

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:450:8: ( ( '\"' (~ '\"' )* '\"' ) )
			// myChecker.g:450:10: ( '\"' (~ '\"' )* '\"' )
			{
			// myChecker.g:450:10: ( '\"' (~ '\"' )* '\"' )
			// myChecker.g:450:11: '\"' (~ '\"' )* '\"'
			{
			match('\"'); 
			// myChecker.g:450:15: (~ '\"' )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '\u0000' && LA1_0 <= '!')||(LA1_0 >= '#' && LA1_0 <= '\uFFFF')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// myChecker.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '\uFFFF') ) {
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

			match('\"'); 
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING"

	// $ANTLR start "NEW_LINE"
	public final void mNEW_LINE() throws RecognitionException {
		try {
			int _type = NEW_LINE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:451:9: ( '\\n' )
			// myChecker.g:451:11: '\\n'
			{
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
	// $ANTLR end "NEW_LINE"

	// $ANTLR start "DEC_NUM"
	public final void mDEC_NUM() throws RecognitionException {
		try {
			int _type = DEC_NUM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:454:9: ( ( '0' | ( '1' .. '9' ) ( DIGIT )* ) )
			// myChecker.g:454:11: ( '0' | ( '1' .. '9' ) ( DIGIT )* )
			{
			// myChecker.g:454:11: ( '0' | ( '1' .. '9' ) ( DIGIT )* )
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
					// myChecker.g:454:12: '0'
					{
					match('0'); 
					}
					break;
				case 2 :
					// myChecker.g:454:18: ( '1' .. '9' ) ( DIGIT )*
					{
					if ( (input.LA(1) >= '1' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					// myChecker.g:454:28: ( DIGIT )*
					loop2:
					while (true) {
						int alt2=2;
						int LA2_0 = input.LA(1);
						if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
							alt2=1;
						}

						switch (alt2) {
						case 1 :
							// myChecker.g:
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
	// $ANTLR end "DEC_NUM"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:456:4: ( ( LETTER ) ( LETTER | DIGIT )* )
			// myChecker.g:456:6: ( LETTER ) ( LETTER | DIGIT )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// myChecker.g:456:14: ( LETTER | DIGIT )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= '0' && LA4_0 <= '9')||(LA4_0 >= 'A' && LA4_0 <= 'Z')||LA4_0=='_'||(LA4_0 >= 'a' && LA4_0 <= 'z')) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// myChecker.g:
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
					break loop4;
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
	// $ANTLR end "ID"

	// $ANTLR start "FLOAT_NUM"
	public final void mFLOAT_NUM() throws RecognitionException {
		try {
			int _type = FLOAT_NUM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:458:10: ( FLOAT_NUM1 | FLOAT_NUM2 | FLOAT_NUM3 )
			int alt5=3;
			alt5 = dfa5.predict(input);
			switch (alt5) {
				case 1 :
					// myChecker.g:458:12: FLOAT_NUM1
					{
					mFLOAT_NUM1(); 

					}
					break;
				case 2 :
					// myChecker.g:458:25: FLOAT_NUM2
					{
					mFLOAT_NUM2(); 

					}
					break;
				case 3 :
					// myChecker.g:458:38: FLOAT_NUM3
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
	// $ANTLR end "FLOAT_NUM"

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// myChecker.g:460:17: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )
			// myChecker.g:
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
			// myChecker.g:461:16: ( '0' .. '9' )
			// myChecker.g:
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
			// myChecker.g:462:20: ( ( DIGIT )+ '.' ( DIGIT )* )
			// myChecker.g:462:22: ( DIGIT )+ '.' ( DIGIT )*
			{
			// myChecker.g:462:22: ( DIGIT )+
			int cnt6=0;
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// myChecker.g:
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
					if ( cnt6 >= 1 ) break loop6;
					EarlyExitException eee = new EarlyExitException(6, input);
					throw eee;
				}
				cnt6++;
			}

			match('.'); 
			// myChecker.g:462:33: ( DIGIT )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( ((LA7_0 >= '0' && LA7_0 <= '9')) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// myChecker.g:
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
					break loop7;
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
			// myChecker.g:463:20: ( '.' ( DIGIT )+ )
			// myChecker.g:463:22: '.' ( DIGIT )+
			{
			match('.'); 
			// myChecker.g:463:25: ( DIGIT )+
			int cnt8=0;
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// myChecker.g:
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
					if ( cnt8 >= 1 ) break loop8;
					EarlyExitException eee = new EarlyExitException(8, input);
					throw eee;
				}
				cnt8++;
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
			// myChecker.g:464:20: ( ( DIGIT )+ )
			// myChecker.g:464:22: ( DIGIT )+
			{
			// myChecker.g:464:22: ( DIGIT )+
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
					// myChecker.g:
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
	// $ANTLR end "FLOAT_NUM3"

	// $ANTLR start "COMMENT1"
	public final void mCOMMENT1() throws RecognitionException {
		try {
			int _type = COMMENT1;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:470:10: ( '//' ( . )* '\\n' )
			// myChecker.g:470:12: '//' ( . )* '\\n'
			{
			match("//"); 

			// myChecker.g:470:16: ( . )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0=='\n') ) {
					alt10=2;
				}
				else if ( ((LA10_0 >= '\u0000' && LA10_0 <= '\t')||(LA10_0 >= '\u000B' && LA10_0 <= '\uFFFF')) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// myChecker.g:470:17: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop10;
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
			// myChecker.g:471:10: ( '/*' ( options {greedy=false; } : . )* '*/' )
			// myChecker.g:471:12: '/*' ( options {greedy=false; } : . )* '*/'
			{
			match("/*"); 

			// myChecker.g:471:17: ( options {greedy=false; } : . )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0=='*') ) {
					int LA11_1 = input.LA(2);
					if ( (LA11_1=='/') ) {
						alt11=2;
					}
					else if ( ((LA11_1 >= '\u0000' && LA11_1 <= '.')||(LA11_1 >= '0' && LA11_1 <= '\uFFFF')) ) {
						alt11=1;
					}

				}
				else if ( ((LA11_0 >= '\u0000' && LA11_0 <= ')')||(LA11_0 >= '+' && LA11_0 <= '\uFFFF')) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// myChecker.g:471:42: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop11;
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
			// myChecker.g:475:5: ( ( ' ' | '\\r' | '\\t' )+ )
			// myChecker.g:475:7: ( ' ' | '\\r' | '\\t' )+
			{
			// myChecker.g:475:7: ( ' ' | '\\r' | '\\t' )+
			int cnt12=0;
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0=='\t'||LA12_0=='\r'||LA12_0==' ') ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// myChecker.g:
					{
					if ( input.LA(1)=='\t'||input.LA(1)=='\r'||input.LA(1)==' ' ) {
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
					if ( cnt12 >= 1 ) break loop12;
					EarlyExitException eee = new EarlyExitException(12, input);
					throw eee;
				}
				cnt12++;
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
		// myChecker.g:1:8: ( T__77 | T__78 | INT | CHAR | VOID | SHORT | LONGLONG | FLOAT | DOUBLE | STRUCT | ELSEIF | IF | ELSE | SWITCH | CASE | BREAK | CONTINUE | FOR | WHILE | PRINT | SCANF | RETURN | INCLUDE | EQ | LTEQ | GTEQ | NEQ | PP | MM | LSHIFT | RSHIFT | AND | OR | PLUSEQ | MINUSEQ | TIMEEQ | DIVIDEEQ | MODEQ | NGT | NLT | GT | LT | ASSIGN | MINUS | PLUS | TIME | DIVIDE | NOT | LGAND | LGOR | MOD | DOT_ | COMMA | SEMI | COLON | SHARP | LPAREN | RPAREN | LBRACE | RBRACE | LSQUARE | RSQUARE | STRING | NEW_LINE | DEC_NUM | ID | FLOAT_NUM | COMMENT1 | COMMENT2 | WS )
		int alt13=70;
		alt13 = dfa13.predict(input);
		switch (alt13) {
			case 1 :
				// myChecker.g:1:10: T__77
				{
				mT__77(); 

				}
				break;
			case 2 :
				// myChecker.g:1:16: T__78
				{
				mT__78(); 

				}
				break;
			case 3 :
				// myChecker.g:1:22: INT
				{
				mINT(); 

				}
				break;
			case 4 :
				// myChecker.g:1:26: CHAR
				{
				mCHAR(); 

				}
				break;
			case 5 :
				// myChecker.g:1:31: VOID
				{
				mVOID(); 

				}
				break;
			case 6 :
				// myChecker.g:1:36: SHORT
				{
				mSHORT(); 

				}
				break;
			case 7 :
				// myChecker.g:1:42: LONGLONG
				{
				mLONGLONG(); 

				}
				break;
			case 8 :
				// myChecker.g:1:51: FLOAT
				{
				mFLOAT(); 

				}
				break;
			case 9 :
				// myChecker.g:1:57: DOUBLE
				{
				mDOUBLE(); 

				}
				break;
			case 10 :
				// myChecker.g:1:64: STRUCT
				{
				mSTRUCT(); 

				}
				break;
			case 11 :
				// myChecker.g:1:71: ELSEIF
				{
				mELSEIF(); 

				}
				break;
			case 12 :
				// myChecker.g:1:78: IF
				{
				mIF(); 

				}
				break;
			case 13 :
				// myChecker.g:1:81: ELSE
				{
				mELSE(); 

				}
				break;
			case 14 :
				// myChecker.g:1:86: SWITCH
				{
				mSWITCH(); 

				}
				break;
			case 15 :
				// myChecker.g:1:93: CASE
				{
				mCASE(); 

				}
				break;
			case 16 :
				// myChecker.g:1:98: BREAK
				{
				mBREAK(); 

				}
				break;
			case 17 :
				// myChecker.g:1:104: CONTINUE
				{
				mCONTINUE(); 

				}
				break;
			case 18 :
				// myChecker.g:1:113: FOR
				{
				mFOR(); 

				}
				break;
			case 19 :
				// myChecker.g:1:117: WHILE
				{
				mWHILE(); 

				}
				break;
			case 20 :
				// myChecker.g:1:123: PRINT
				{
				mPRINT(); 

				}
				break;
			case 21 :
				// myChecker.g:1:129: SCANF
				{
				mSCANF(); 

				}
				break;
			case 22 :
				// myChecker.g:1:135: RETURN
				{
				mRETURN(); 

				}
				break;
			case 23 :
				// myChecker.g:1:142: INCLUDE
				{
				mINCLUDE(); 

				}
				break;
			case 24 :
				// myChecker.g:1:150: EQ
				{
				mEQ(); 

				}
				break;
			case 25 :
				// myChecker.g:1:153: LTEQ
				{
				mLTEQ(); 

				}
				break;
			case 26 :
				// myChecker.g:1:158: GTEQ
				{
				mGTEQ(); 

				}
				break;
			case 27 :
				// myChecker.g:1:163: NEQ
				{
				mNEQ(); 

				}
				break;
			case 28 :
				// myChecker.g:1:167: PP
				{
				mPP(); 

				}
				break;
			case 29 :
				// myChecker.g:1:170: MM
				{
				mMM(); 

				}
				break;
			case 30 :
				// myChecker.g:1:173: LSHIFT
				{
				mLSHIFT(); 

				}
				break;
			case 31 :
				// myChecker.g:1:180: RSHIFT
				{
				mRSHIFT(); 

				}
				break;
			case 32 :
				// myChecker.g:1:187: AND
				{
				mAND(); 

				}
				break;
			case 33 :
				// myChecker.g:1:191: OR
				{
				mOR(); 

				}
				break;
			case 34 :
				// myChecker.g:1:194: PLUSEQ
				{
				mPLUSEQ(); 

				}
				break;
			case 35 :
				// myChecker.g:1:201: MINUSEQ
				{
				mMINUSEQ(); 

				}
				break;
			case 36 :
				// myChecker.g:1:209: TIMEEQ
				{
				mTIMEEQ(); 

				}
				break;
			case 37 :
				// myChecker.g:1:216: DIVIDEEQ
				{
				mDIVIDEEQ(); 

				}
				break;
			case 38 :
				// myChecker.g:1:225: MODEQ
				{
				mMODEQ(); 

				}
				break;
			case 39 :
				// myChecker.g:1:231: NGT
				{
				mNGT(); 

				}
				break;
			case 40 :
				// myChecker.g:1:235: NLT
				{
				mNLT(); 

				}
				break;
			case 41 :
				// myChecker.g:1:239: GT
				{
				mGT(); 

				}
				break;
			case 42 :
				// myChecker.g:1:242: LT
				{
				mLT(); 

				}
				break;
			case 43 :
				// myChecker.g:1:245: ASSIGN
				{
				mASSIGN(); 

				}
				break;
			case 44 :
				// myChecker.g:1:252: MINUS
				{
				mMINUS(); 

				}
				break;
			case 45 :
				// myChecker.g:1:258: PLUS
				{
				mPLUS(); 

				}
				break;
			case 46 :
				// myChecker.g:1:263: TIME
				{
				mTIME(); 

				}
				break;
			case 47 :
				// myChecker.g:1:268: DIVIDE
				{
				mDIVIDE(); 

				}
				break;
			case 48 :
				// myChecker.g:1:275: NOT
				{
				mNOT(); 

				}
				break;
			case 49 :
				// myChecker.g:1:279: LGAND
				{
				mLGAND(); 

				}
				break;
			case 50 :
				// myChecker.g:1:285: LGOR
				{
				mLGOR(); 

				}
				break;
			case 51 :
				// myChecker.g:1:290: MOD
				{
				mMOD(); 

				}
				break;
			case 52 :
				// myChecker.g:1:294: DOT_
				{
				mDOT_(); 

				}
				break;
			case 53 :
				// myChecker.g:1:299: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 54 :
				// myChecker.g:1:305: SEMI
				{
				mSEMI(); 

				}
				break;
			case 55 :
				// myChecker.g:1:310: COLON
				{
				mCOLON(); 

				}
				break;
			case 56 :
				// myChecker.g:1:316: SHARP
				{
				mSHARP(); 

				}
				break;
			case 57 :
				// myChecker.g:1:322: LPAREN
				{
				mLPAREN(); 

				}
				break;
			case 58 :
				// myChecker.g:1:329: RPAREN
				{
				mRPAREN(); 

				}
				break;
			case 59 :
				// myChecker.g:1:336: LBRACE
				{
				mLBRACE(); 

				}
				break;
			case 60 :
				// myChecker.g:1:343: RBRACE
				{
				mRBRACE(); 

				}
				break;
			case 61 :
				// myChecker.g:1:350: LSQUARE
				{
				mLSQUARE(); 

				}
				break;
			case 62 :
				// myChecker.g:1:358: RSQUARE
				{
				mRSQUARE(); 

				}
				break;
			case 63 :
				// myChecker.g:1:366: STRING
				{
				mSTRING(); 

				}
				break;
			case 64 :
				// myChecker.g:1:373: NEW_LINE
				{
				mNEW_LINE(); 

				}
				break;
			case 65 :
				// myChecker.g:1:382: DEC_NUM
				{
				mDEC_NUM(); 

				}
				break;
			case 66 :
				// myChecker.g:1:390: ID
				{
				mID(); 

				}
				break;
			case 67 :
				// myChecker.g:1:393: FLOAT_NUM
				{
				mFLOAT_NUM(); 

				}
				break;
			case 68 :
				// myChecker.g:1:403: COMMENT1
				{
				mCOMMENT1(); 

				}
				break;
			case 69 :
				// myChecker.g:1:412: COMMENT2
				{
				mCOMMENT2(); 

				}
				break;
			case 70 :
				// myChecker.g:1:421: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA5 dfa5 = new DFA5(this);
	protected DFA13 dfa13 = new DFA13(this);
	static final String DFA5_eotS =
		"\1\uffff\1\4\3\uffff";
	static final String DFA5_eofS =
		"\5\uffff";
	static final String DFA5_minS =
		"\2\56\3\uffff";
	static final String DFA5_maxS =
		"\2\71\3\uffff";
	static final String DFA5_acceptS =
		"\2\uffff\1\2\1\1\1\3";
	static final String DFA5_specialS =
		"\5\uffff}>";
	static final String[] DFA5_transitionS = {
			"\1\2\1\uffff\12\1",
			"\1\3\1\uffff\12\1",
			"",
			"",
			""
	};

	static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
	static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
	static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
	static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
	static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
	static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
	static final short[][] DFA5_transition;

	static {
		int numStates = DFA5_transitionS.length;
		DFA5_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
		}
	}

	protected class DFA5 extends DFA {

		public DFA5(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 5;
			this.eot = DFA5_eot;
			this.eof = DFA5_eof;
			this.min = DFA5_min;
			this.max = DFA5_max;
			this.accept = DFA5_accept;
			this.special = DFA5_special;
			this.transition = DFA5_transition;
		}
		@Override
		public String getDescription() {
			return "458:1: FLOAT_NUM : ( FLOAT_NUM1 | FLOAT_NUM2 | FLOAT_NUM3 );";
		}
	}

	static final String DFA13_eotS =
		"\1\uffff\1\53\15\50\1\102\1\104\1\107\1\112\1\116\1\121\1\124\1\126\1"+
		"\130\1\132\1\136\1\140\13\uffff\2\141\5\uffff\2\50\1\145\21\50\41\uffff"+
		"\1\141\1\50\1\170\1\uffff\12\50\1\u0083\6\50\1\u008a\1\uffff\1\u008b\1"+
		"\u008c\1\50\1\u008e\6\50\1\uffff\1\50\1\u0097\4\50\3\uffff\1\50\1\uffff"+
		"\1\u009d\2\50\1\u00a0\1\uffff\1\u00a1\1\50\2\uffff\1\u00a3\1\u00a4\3\50"+
		"\1\uffff\1\u00a8\1\u00a9\2\uffff\1\u00aa\2\uffff\1\u00ab\1\u00ac\1\50"+
		"\5\uffff\1\u00ae\1\uffff";
	static final String DFA13_eofS =
		"\u00af\uffff";
	static final String DFA13_minS =
		"\1\11\1\60\1\141\1\146\1\141\1\157\1\143\1\157\1\154\1\157\1\154\1\162"+
		"\1\150\1\162\1\145\1\151\1\75\1\74\1\75\1\74\1\53\1\55\1\46\1\174\1\75"+
		"\1\52\1\75\13\uffff\2\56\5\uffff\1\151\1\164\1\60\1\141\1\163\1\156\1"+
		"\151\1\157\1\162\1\151\1\141\1\156\1\157\1\162\1\165\1\163\1\145\2\151"+
		"\1\164\41\uffff\1\56\1\156\1\60\1\uffff\1\162\1\145\1\164\1\144\1\162"+
		"\1\165\1\164\1\156\1\147\1\141\1\60\1\142\1\145\1\141\1\154\1\156\1\165"+
		"\1\60\1\uffff\2\60\1\151\1\60\1\164\2\143\1\146\1\40\1\164\1\uffff\1\154"+
		"\1\40\1\153\1\145\1\164\1\162\3\uffff\1\156\1\uffff\1\60\1\164\1\150\1"+
		"\60\1\uffff\1\60\1\145\2\uffff\2\60\1\146\1\156\1\165\1\uffff\2\60\2\uffff"+
		"\1\60\2\uffff\2\60\1\145\5\uffff\1\60\1\uffff";
	static final String DFA13_maxS =
		"\1\175\1\150\1\141\1\156\2\157\1\167\3\157\1\154\1\162\1\150\1\162\1\145"+
		"\1\151\2\75\2\76\2\75\1\46\1\174\3\75\13\uffff\2\71\5\uffff\1\151\1\164"+
		"\1\172\1\141\1\163\1\156\1\151\1\157\1\162\1\151\1\141\1\156\1\157\1\162"+
		"\1\165\1\163\1\145\2\151\1\164\41\uffff\1\71\1\156\1\172\1\uffff\1\162"+
		"\1\145\1\164\1\144\1\162\1\165\1\164\1\156\1\147\1\141\1\172\1\142\1\145"+
		"\1\141\1\154\1\156\1\165\1\172\1\uffff\2\172\1\151\1\172\1\164\2\143\1"+
		"\146\1\40\1\164\1\uffff\1\154\1\172\1\153\1\145\1\164\1\162\3\uffff\1"+
		"\156\1\uffff\1\172\1\164\1\150\1\172\1\uffff\1\172\1\145\2\uffff\2\172"+
		"\1\146\1\156\1\165\1\uffff\2\172\2\uffff\1\172\2\uffff\2\172\1\145\5\uffff"+
		"\1\172\1\uffff";
	static final String DFA13_acceptS =
		"\33\uffff\1\65\1\66\1\67\1\71\1\72\1\73\1\74\1\75\1\76\1\77\1\100\2\uffff"+
		"\1\102\1\106\1\1\1\64\1\103\24\uffff\1\27\1\70\1\30\1\53\1\31\1\36\1\52"+
		"\1\32\1\37\1\51\1\33\1\47\1\50\1\60\1\34\1\42\1\55\1\35\1\43\1\54\1\40"+
		"\1\61\1\41\1\62\1\44\1\56\1\45\1\104\1\105\1\57\1\46\1\63\1\101\3\uffff"+
		"\1\14\22\uffff\1\3\12\uffff\1\22\6\uffff\1\2\1\4\1\17\1\uffff\1\5\4\uffff"+
		"\1\7\2\uffff\1\13\1\15\5\uffff\1\6\2\uffff\1\25\1\10\1\uffff\1\20\1\23"+
		"\3\uffff\1\12\1\16\1\11\1\24\1\26\1\uffff\1\21";
	static final String DFA13_specialS =
		"\u00af\uffff}>";
	static final String[] DFA13_transitionS = {
			"\1\51\1\45\2\uffff\1\51\22\uffff\1\51\1\23\1\44\1\17\1\uffff\1\32\1\26"+
			"\1\uffff\1\36\1\37\1\30\1\24\1\33\1\25\1\1\1\31\1\46\11\47\1\35\1\34"+
			"\1\21\1\20\1\22\2\uffff\32\50\1\42\1\uffff\1\43\1\uffff\1\50\1\uffff"+
			"\1\50\1\13\1\4\1\11\1\12\1\10\2\50\1\3\2\50\1\7\1\2\2\50\1\15\1\50\1"+
			"\16\1\6\2\50\1\5\1\14\3\50\1\40\1\27\1\41",
			"\12\54\56\uffff\1\52",
			"\1\55",
			"\1\57\7\uffff\1\56",
			"\1\61\6\uffff\1\60\6\uffff\1\62",
			"\1\63",
			"\1\67\4\uffff\1\64\13\uffff\1\65\2\uffff\1\66",
			"\1\70",
			"\1\71\2\uffff\1\72",
			"\1\73",
			"\1\74",
			"\1\75",
			"\1\76",
			"\1\77",
			"\1\100",
			"\1\101",
			"\1\103",
			"\1\106\1\105",
			"\1\110\1\111",
			"\1\115\1\113\1\114",
			"\1\117\21\uffff\1\120",
			"\1\122\17\uffff\1\123",
			"\1\125",
			"\1\127",
			"\1\131",
			"\1\135\4\uffff\1\134\15\uffff\1\133",
			"\1\137",
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
			"\1\54\1\uffff\12\54",
			"\1\54\1\uffff\12\142",
			"",
			"",
			"",
			"",
			"",
			"\1\143",
			"\1\144",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
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
			"\1\163",
			"\1\164",
			"\1\165",
			"\1\166",
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
			"\1\54\1\uffff\12\142",
			"\1\167",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"",
			"\1\171",
			"\1\172",
			"\1\173",
			"\1\174",
			"\1\175",
			"\1\176",
			"\1\177",
			"\1\u0080",
			"\1\u0081",
			"\1\u0082",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\u0084",
			"\1\u0085",
			"\1\u0086",
			"\1\u0087",
			"\1\u0088",
			"\1\u0089",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\u008d",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\u008f",
			"\1\u0090",
			"\1\u0091",
			"\1\u0092",
			"\1\u0093",
			"\1\u0094",
			"",
			"\1\u0095",
			"\1\u0096\17\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\u0098",
			"\1\u0099",
			"\1\u009a",
			"\1\u009b",
			"",
			"",
			"",
			"\1\u009c",
			"",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\u009e",
			"\1\u009f",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\u00a2",
			"",
			"",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\u00a5",
			"\1\u00a6",
			"\1\u00a7",
			"",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"",
			"",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"",
			"",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			"\1\u00ad",
			"",
			"",
			"",
			"",
			"",
			"\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
			""
	};

	static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
	static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
	static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
	static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
	static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
	static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
	static final short[][] DFA13_transition;

	static {
		int numStates = DFA13_transitionS.length;
		DFA13_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
		}
	}

	protected class DFA13 extends DFA {

		public DFA13(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 13;
			this.eot = DFA13_eot;
			this.eof = DFA13_eof;
			this.min = DFA13_min;
			this.max = DFA13_max;
			this.accept = DFA13_accept;
			this.special = DFA13_special;
			this.transition = DFA13_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__77 | T__78 | INT | CHAR | VOID | SHORT | LONGLONG | FLOAT | DOUBLE | STRUCT | ELSEIF | IF | ELSE | SWITCH | CASE | BREAK | CONTINUE | FOR | WHILE | PRINT | SCANF | RETURN | INCLUDE | EQ | LTEQ | GTEQ | NEQ | PP | MM | LSHIFT | RSHIFT | AND | OR | PLUSEQ | MINUSEQ | TIMEEQ | DIVIDEEQ | MODEQ | NGT | NLT | GT | LT | ASSIGN | MINUS | PLUS | TIME | DIVIDE | NOT | LGAND | LGOR | MOD | DOT_ | COMMA | SEMI | COLON | SHARP | LPAREN | RPAREN | LBRACE | RBRACE | LSQUARE | RSQUARE | STRING | NEW_LINE | DEC_NUM | ID | FLOAT_NUM | COMMENT1 | COMMENT2 | WS );";
		}
	}

}
