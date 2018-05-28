lexer grammar myLexer;

options {
  language = Java;
}

/*----------------------*/
/*   Reserved Keywords  */
/*----------------------*/
INT_TYPE  : 'int';
CHAR_TYPE : 'char';
VOID_TYPE : 'void';
LONG_TYPE: 'long';
SHORT_TYPE: 'short';
LONG_LONG_TYPE: 'long long';
FLOAT_TYPE: 'float';
DOUBLE_TYPE: 'double';
STRUCT_: 'struct';
IF_: 'if';
ELSE_: 'else';
ELSE_IF_: 'else if';
SWITCH_: 'switch';
CASE_: 'case';
BREAK_: 'break';
FOR_: 'for';
WHILE_    : 'while';
PRINT_: 'printf';
SCANF_: 'scanf';
INCLUDE_: 'include';
RETURN_: 'return';

/*----------------------*/
/*  Compound Operators  */
/*----------------------*/

EQ_OP : '==';
LE_OP : '<=';
GE_OP : '>=';
NE_OP : '!=';
PP_OP : '++';
MM_OP : '--'; 
RSHIFT_OP : '<<';
LSHIFT_OP : '>>';
AND_OP: '&&';
OR_OP: '||';
PLUS_EQ_: '+=';
MINUS_EQ_: '-=';
TIME_EQ_: '*=';
DIVIDE_EQ_: '/=';
MOD_EQ_: '%=';
NOT_GT_: '!>';
NOT_LT: '!<';



/*----------------------*/
/*       Operator       */  
/*----------------------*/
GT_OP: '>';
LT_OP: '<';
ASIGN_OP: '=';
MINUS_OP: '-';
PLUS_OP: '+';
TIME_OP: '*';
DIVIDE_OP: '/';
NOT_OP: '!';
LAND_OP: '&';
LOR_OP: '|';
MOD_OP: '%';

/*----------------------*/
/*      Apostrophe      */  
/*----------------------*/
DOT_: '.';
COMMON_: ',';
SEMI_: ';';
COLON: ':';
SHARP: '#';
LPAREN: '(';
RPAREN: ')';
LBRACE: '{';
RBRACE: '}';
LSQUARE: '[';
RSQUARE: ']';

/*----------------------*/
/*        Symbols       */  
/*----------------------*/
STRING : ('"' (~'"')* '"');
NEW_LINE: '\n';




DEC_NUM : ('0' | ('1'..'9')(DIGIT)*);

ID : (LETTER)(LETTER | DIGIT)*;

FLOAT_NUM: FLOAT_NUM1 | FLOAT_NUM2 | FLOAT_NUM3;
fragment FLOAT_NUM1: (DIGIT)+'.'(DIGIT)*;
fragment FLOAT_NUM2: '.'(DIGIT)+;
fragment FLOAT_NUM3: (DIGIT)+;
 

/* Comments */
COMMENT1 : '//'(.)*'\n';
COMMENT2 : '/*' (options{greedy=false;}: .)* '*/';




fragment LETTER : 'a'..'z' | 'A'..'Z' | '_';
fragment DIGIT : '0'..'9';


WS  : (' '|'\r'|'\t')+;
