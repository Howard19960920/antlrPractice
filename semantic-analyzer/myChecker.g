grammar myChecker;

options {
  language = Java;
  backtrack = true;
  memoize = true;
  k = 4;
}


@header {
    // import packages here.
    import java.util.HashMap;
}


@members {
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




/* 定義變數型態 */
vartypes returns [int attr_type]
  : 
      INT { if (TRACEON) System.out.println("type: INT");  $attr_type = 1; }
    | FLOAT { if (TRACEON) System.out.println("type: FLOAT");  $attr_type = 2; }
    | CHAR { if (TRACEON) System.out.println("type: CHAR");  $attr_type = 3; }
    | VOID { if (TRACEON) System.out.println("type: VOID");  $attr_type = 4; }
    | SHORT { if (TRACEON) System.out.println("type: SHORT");  $attr_type = 5; }
    | LONGLONG { if (TRACEON) System.out.println("type: LONGLONG");  $attr_type = 6; }
    | DOUBLE { if (TRACEON) System.out.println("type: DOUBLE");  $attr_type = 7; }
    | STRUCT { if (TRACEON) System.out.println("type: STRUCT");  $attr_type = 8; }
  ;


/* 定義變數的宣告 */
vardeclarations returns [int attr_type]
  :
    // 可以一次宣告多個，如 int x, y, z;
    // 目前不能夠在宣告的時候初始化
    vartypes a = ID (COMMA b = ID)* SEMI
    {
	   if (symtab.containsKey($a.text)) 
     {
	       System.out.println("Type Error: " + $a.getLine() + ": redeclared identifier " + $a.text);
	   }
     else
     {
           symtab.put($a.text, $vartypes.attr_type);
	   }
	   
	   if ($b.text != null)
     {
			if (symtab.containsKey($b.text)) 
      {
			    System.out.println("Type Error: " + $b.getLine() + ": redeclared identifier " + $b.text );
			}
      else 
      {
				symtab.put($b.text, $vartypes.attr_type);
			}
	   }	   
	 }
  ;




// 定義賦值
varassignments returns [int attr_type]
:
    ID ASSIGN expressions SEMI
  // 上面這個應該有包含下面的
  //| ID ASSIGN (DEC_NUM
  //            |FLOAT_NUM
  //            )* SEMI

  {
     // 檢查是否存在此 identifier
	   if (symtab.containsKey($ID.text)) 
     {
	       $attr_type = symtab.get($ID.text);
	   } 
     
     else 
     {
			System.out.println("Type Error: " + $ID.getLine() + ": undeclared identifier " + $ID.text );
			$attr_type = -2;
			return $attr_type;
	   }

     // 檢查兩者型態 (vartypes) 是否一致
	   if (symtab.get($ID.text) != $expressions.attr_type) 
     {
			System.out.println("Type Error: " + $expressions.start.getLine() + ": types of leftside operand differs from the rightside operand");
			$attr_type = -2;
     }
	}
   
;


// 以下定義運算操作 (參考 sample code)
expressions returns [int attr_type]
:
  a = operations {$attr_type = $a.attr_type;} (
      LGAND b = operations
    | LGOR  b = operations
  )*
;

// 
operations returns [int attr_type]
:
  a = addexprs { $attr_type = $a.attr_type; } ((
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
  ) b = addexprs 
    { 		
      if ($a.attr_type != $b.attr_type) {
          System.out.println("Type Error: " + $a.start.getLine() + ": types of the operands in the expressions are different");
            $attr_type = -2;
      }
    }
  )*
;


// 以下定義算術運算 (根據提供的 sample code)
// 後加減
addexprs returns [int attr_type]
:
    a = mulexprs  { $attr_type = $a.attr_type; } 
    (PLUS b = mulexprs
              { 
                if ($a.attr_type != $b.attr_type) 
                {
                  System.out.println("Type Error: " + $a.start.getLine() + ": types of the operands in the addition-expressions are different");
                  $attr_type = -2;
                }
              }
    |MINUS c = mulexprs
              { 
                if ($a.attr_type != $c.attr_type) {
                  System.out.println("Type Error: " + $a.start.getLine() + ": types of the operands in the substract-expressions are different");
                $attr_type = -2;
                }
              }

    )* 
;


// 先乘除
mulexprs returns [int attr_type]
:
    a = atomexprs { $attr_type = $a.attr_type; } 
        ((TIME | DIVIDE) b = atomexprs
                            { 
                              if ($a.attr_type != $b.attr_type) 
                              {
                                System.out.println("Type Error: " + $a.start.getLine() + ": types of the operands in the (mul/div)-expressions are different");
                                $attr_type = -2;
                              }
                            }
        )*
;


// 基本運算單元
atomexprs returns [int attr_type]
:
    ID
    {
      if (symtab.containsKey($ID.text)) 
      {
          $attr_type = symtab.get($ID.text);
      } 
      else 
      {
        System.out.println("Type Error: " + $ID.getLine() + ": undeclared identifier " + $ID.text);
        $attr_type = -2;
        // return $attr_type;
      }
	 }
    | DEC_NUM { $attr_type = 1; }
    | FLOAT_NUM { $attr_type = 2; }
    | LPAREN expressions RPAREN { $attr_type = $expressions.attr_type; }
;


// 定義程式碼
// 每一行可能的程式碼有下列幾種可能
 codelines
 :
      vardeclarations
    | varassignments
    | callfunctions
    | expressions
    | ifconditions
    | forloops
    | whileloops
    | continues
    | breaks
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