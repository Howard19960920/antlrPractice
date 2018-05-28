grammar hw3;


@header {
    // import packages here.
    import java.util.HashMap;
}

@members {
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
}



//  程式的進入點
//  program 的部份
entryPoint
:
    // 引入標頭檔
    (INCLUDE  '<' ID '.h' '>')*
    // 可以在 main 前面定義或宣告 subfunctions
    subfunctions* 
    mainfunction
    // 也可以在後面定義、宣告
    subfunctions*
;


// 支持的變數型態
vartypes
:
    INT
  | CHAR
  | VOID
  | SHORT
  | LONGLONG
  | FLOAT
  | DOUBLE
  | STRUCT
;


// 定義變數的宣告
vardeclarations
:
  // 可以一次宣告多個，如 int x, y, z;
  // 目前不能夠在宣告的時候初始化
  vartypes ID (COMMA ID)* SEMI
;


// 定義賦值
varassignments
:
    ID ASSIGN expressions SEMI
  // 上面這個應該有包含下面的
  //| ID ASSIGN (DEC_NUM
  //            |FLOAT_NUM
  //            )* SEMI
   
;


// 以下定義運算操作 (參考 sample code)
expressions
:
  operations(
      LGAND operations
    | LGOR  operations
  )*
;

// 
operations
:
  addexprs ((
    EQ |
    NEQ|
    LT |
    NLT| 
    GT |
    NGT|
    GTEQ|
    LTEQ|
    ASSIGN|
    PLUSEQ|
    MINUSEQ|
    TIMEEQ|
    DIVIDEEQ
  ) addexprs)*
;


// 以下定義算術運算 (根據提供的 sample code)
// 後加減
addexprs
:
    mulexprs (PLUS mulexprs
             |MINUS mulexprs
             )* 
;


// 先乘除
mulexprs
:
    atomexprs (TIME atomexprs
         |DIVIDE atomexprs
         )*
;


// 基本運算單元
atomexprs
:
    ID
  | DEC_NUM
  | FLOAT_NUM
  | LPAREN expressions RPAREN
;


// 定義程式碼
 codelines
 :
    vardeclarations
  | varassignments
  //| expressions
  | ifconditions
  | forloops
  | whileloops
  | continues
  | breaks
  | callfunctions
 ;


// 定義 if 條件結構
ifconditions
:
  IF LPAREN expressions RPAREN
  /* if (a > b) */
  LBRACE
  // {
    codelines*
  RBRACE
  // }


  // else if 
  (ELSEIF LPAREN expressions RPAREN
  LBRACE
    codelines*
  RBRACE
  )*


  // only one else
  (ELSE
  LBRACE
    codelines*
  RBRACE
  )?
;


// 定義 for 迴圈
forloops
:
  // for(i = 0; i < 10 and flag == true; i++)
  FOR LPAREN expressions* SEMI expressions* SEMI expressions*  RPAREN
  LBRACE
    codelines*
  RBRACE
;

// 定義 while 迴圈
whileloops
:
  // while (a && b && c)
  WHILE LPAREN expressions+ RPAREN
  LBRACE
    codelines*
  RBRACE
;

// 定義 continue 
continues
:
  CONTINUE SEMI
;

// 定義 break
breaks
:
  BREAK SEMI
;


// 宣告 function 的place holder
parameters
:
  vartypes ID (COMMA vartypes ID)*
;


// 傳入 function 的參數
argvs
:
  expressions(COMMA expressions)*
;


// 定義回傳值
retvals
: // return 0 return x return;
  RETURN (expressions)? SEMI
  //RETURN (DEC_NUM | FLOAT DEC_NUM | expressions)? SEMI
;


subfunctions
:   // 純宣告
    vartypes ID LPAREN parameters? RPAREN SEMI

    // 宣告＋定義
  | vartypes ID LPAREN parameters? RPAREN 
    LBRACE
      codelines*
      retvals
    RBRACE
;

// 呼叫子函式
callfunctions
:
  ID LPAREN argvs? RPAREN SEMI
;


// c函式進入點
mainfunction
:
  (INT | VOID)? 'main' LPAREN parameters? RPAREN
  LBRACE
    codelines*
    retvals
  RBRACE
;



/*----------------------*/
/*   Reserved Keywords  */
/*----------------------*/
// Datatypes
INT  : 'int';
CHAR : 'char';
VOID : 'void';
SHORT: 'short';
LONGLONG: 'long long';
FLOAT: 'float';
DOUBLE: 'double';
STRUCT: 'struct';

// Flow Controll
ELSEIF: 'else if';
IF: 'if';
ELSE: 'else';
SWITCH: 'switch';
CASE: 'case';
BREAK: 'break';
CONTINUE: 'continue';
FOR: 'for';
WHILE: 'while';
PRINT: 'printf';
SCANF: 'scanf';
RETURN: 'return';
INCLUDE: '#include';

/*----------------------*/
/*  Compound Operators  */
/*----------------------*/

EQ : '==';
LTEQ : '<=';
GTEQ : '>=';
NEQ : '!=';
PP : '++';
MM : '--'; 
LSHIFT : '<<';
RSHIFT : '>>';
AND: '&&';
OR: '||';
PLUSEQ: '+=';
MINUSEQ: '-=';
TIMEEQ: '*=';
DIVIDEEQ: '/=';
MODEQ: '%=';
NGT: '!>';
NLT: '!<';



/*----------------------*/
/*       Operator       */  
/*----------------------*/
GT: '>';
LT: '<';
ASSIGN: '=';
MINUS: '-';
PLUS: '+';
TIME: '*';
DIVIDE: '/';
NOT: '!';
LGAND: '&';
LGOR: '|';
MOD: '%';

/*----------------------*/
/*      Apostrophe      */  
/*----------------------*/
DOT_: '.';
COMMA: ',';
SEMI: ';';
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
NEW_LINE: '\n' {skip();};


DEC_NUM : ('0' | ('1'..'9')(DIGIT)*);

ID : (LETTER)(LETTER | DIGIT)*;

FLOAT_NUM: FLOAT_NUM1 | FLOAT_NUM2 | FLOAT_NUM3;

fragment LETTER : 'a'..'z' | 'A'..'Z' | '_';
fragment DIGIT : '0'..'9';
fragment FLOAT_NUM1: (DIGIT)+'.'(DIGIT)*;
fragment FLOAT_NUM2: '.'(DIGIT)+;
fragment FLOAT_NUM3: (DIGIT)+;
 

/*----------------------*/
/*        Comment       */  
/*----------------------*/
COMMENT1 : '//'(.)*'\n' {skip();};
COMMENT2 : '/*' (options{greedy=false;}: .)* '*/' {skip();};
/*----------------------*/
/*      WhiteSpace      */  
/*----------------------*/
WS  : (' '|'\r'|'\t')+ {skip();};