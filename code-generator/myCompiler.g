grammar myCompiler;

options {
  language = Java;
  // backtrack = true; // 要註解掉, 不然會吃屎
  memoize = true;
  k = 4;
}


@header {
    // import packages here.
    import java.util.HashMap;

    // final edition here 
    import java.util.ArrayList;
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
}


program
    : 
        // 初始化 register map
        {initRegMappings();}
        declarations functions
    ;


functions
    : 
        function functions
        |
    ;
				  
function
    : type Identifier LPAREN RPAREN LBRACE
      {
         /* output function prologue */
         prologue($Identifier.text);
      }
      l_declarations statements RBRACE
      {
        if (TRACEON)
        {
            System.out.println("type Identifier () {declarations statements}");
        }
        /* output function epilogue */	  
        epilogue();
	  }
	;


/* global declaraction */
declarations
    : 
        type Identifier SEMI declarations
        { 
            if (TRACEON) 
            {
                System.out.println("declarations: type Identifier : declarations");
            }
            // 檢查變數是否已經宣告過
            if (symtab.containsKey($Identifier.text)) 
            {
                System.out.println("Type Error: " + $Identifier.getLine() + ": Redeclared identifier.");
            } 
            else 
            {
                /* Add ID and its attr_type into the symbol table. */
                symtab.put($Identifier.text, $type.attr_type);	   
            }
            
            /* code generation */
            switch($type.attr_type) 
            {
                case 1: /* Type: integer, size=> 4 bytes, alignment=> 4 byte boundary. */
                        DataCode.add("\t .common " + $Identifier.text + ",4,4\n");
                        break;
                case 2: /* Type: float, size=> 4 bytes, alignment=> 4 byte boundary. */
                        DataCode.add("\t .common " + $Identifier.text + ",4,4\n");
                        break;
                default:
            }
        }
    | 
        //{ if (TRACEON) System.out.println("declarations: ");}
    ;


l_declarations
    :
        type Identifier SEMI l_declarations
        {
        /* If you want to handle local variables, fix it. */ 
        }
    | //...
    ;

// 定義變數型態與數字代碼的對應關係
type returns [int attr_type]
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

statements
    : 
        statement statements
        | //...
    ;
		
statement returns [int attr_type]
    : 
        Identifier ASSIGN a = arith_expression SEMI
        {
            // 檢查是否存在
            if (symtab.containsKey($Identifier.text))
            {
                $attr_type = symtab.get($Identifier.text);
            } 
            else 
            {
                /* Add codes to report and handle this error */
                System.out.println("Type Error: " + $Identifier.getLine() + ": undeclared identifier " + $Identifier.text );
                $attr_type = -2;
                return $attr_type;
            }
            // 檢查兩者型態 (vartypes) 是否一致
            if ($attr_type != $arith_expression.attr_type) 
            {
                System.out.println("Type Error: " + $arith_expression.start.getLine() + ": types of leftside operand differs from the rightside operand");
                $attr_type = -2;
            }
            // Code Generation
            TextCode.add("\t movl " + "\%" + regMap.get($a.reg_num) + "," + $Identifier.text + "(\%rip)");
        }
    |
        IF LPAREN arith_expression RPAREN //
        {
            String label = newLabel();
            TextCode.add("\t cmpl " + "$0, " + "\%" + regMap.get($arith_expression.reg_num));
            TextCode.add("\t je " + label);
        } 
        if_then_statements 
        {
            TextCode.add(label + ":");
        }
    | 
        printf_statement
    ;

arith_expression returns [int attr_type, int reg_num, String str]
	: a = multExpr
	      {
              $attr_type = $a.attr_type;
              $reg_num = $a.reg_num;
              $str = $a.str;
	      }
    ( PLUS b = multExpr
	      {
            // 檢查型態是否相同
            if ($a.attr_type != $b.attr_type) 
            {
                System.out.println("Type Error: " + $a.start.getLine() + ": types of the operands in the addition-expressions are different");
                $attr_type = -2;
            }
            // Code generation
            TextCode.add("\t addl " + "\%" + regMap.get($b.reg_num) + ", \%" + regMap.get($reg_num));
	      }
	  | MINUS c = multExpr
	      { 
            if ($a.attr_type != $c.attr_type) 
            {
                System.out.println("Type Error: " + $a.start.getLine() + ": types of the operands in the substract-expressions are different");
                $attr_type = -2;
            }
	        TextCode.add("\t subl " + "\%" + regMap.get($c.reg_num) + ", \%" + regMap.get($reg_num));
	      }
	  )*
	;

	
multExpr returns [int attr_type, int reg_num, String str]
	: 
        a = signExpr 
        { 
            $attr_type = $a.attr_type;
            $reg_num = $a.reg_num;
            $str = $a.str;
        }
    ( 
        TIME b = signExpr
        {
            // 檢查型態是否符合
            if ($a.attr_type != $b.attr_type) 
            {
                System.out.println("Type Error: " + $a.start.getLine() + ": types of the operands in the (mul/div)-expressions are different");
                $attr_type = -2;
            }
            // Code generation
            TextCode.add("\t imul " + "\%" + regMap.get($b.reg_num) + ", \%" + regMap.get($a.reg_num));
        }
    | 
        DIVIDE c = signExpr
        { 
            // 檢查型態是否符合
            if ($a.attr_type != $c.attr_type) 
            {
                System.out.println("Type Error: " + $a.start.getLine() + ": types of the operands in the (mul/div)-expressions are different");
                $attr_type = -2;
            }
            // Code generation
            TextCode.add("\t movl " + "\%" + regMap.get($a.reg_num) + ", \%eax");
            TextCode.add("\t movl " + "$0" + ", \%edx");
            TextCode.add("\t idivl " + "\%" + regMap.get($c.reg_num));
            TextCode.add("\t movl "  + "\%eax" + ", \%" + regMap.get($a.reg_num));
        }
    )*
	;


signExpr returns [int attr_type, int reg_num, String str]
	: 
        primaryExpr
        { 
            $attr_type = $primaryExpr.attr_type;
            $reg_num = $primaryExpr.reg_num;
            $str = $primaryExpr.str;
        }
	| 
        MINUS primaryExpr
        {
            $attr_type = $primaryExpr.attr_type;
            $reg_num = $primaryExpr.reg_num;
            $str = $primaryExpr.str;
            // code generation
            TextCode.add("\t negl " + "\%" + regMap.get($primaryExpr.reg_num));
        }
	;


primaryExpr returns [int attr_type, int reg_num, String str]
    : 
        Integer_constant
        { 
            $attr_type = 1;
            $str = null;
            // code generation
            $reg_num = reg.get();  /* get an register */
            TextCode.add("\t movl " + "\$" + $Integer_constant.text + ", \%" + regMap.get($reg_num)); 
        }
    | 
        Floating_point_constant 
        { 
            $attr_type = 2; 
        }
    | 
        STRING_LITERAL 
        {
            $attr_type = 3; $str = $STRING_LITERAL.text; 
        }
    | 
        Identifier
        {
            if (symtab.containsKey($Identifier.text)) 
            {
                $attr_type = symtab.get($Identifier.text);
            } 
            else 
            {
                System.out.println("Type Error: " + $Identifier.getLine() + ": undeclared identifier " + $Identifier.text);
                $attr_type = -2;
                // return $attr_type;
            }
            $str = null;
            $reg_num = reg.get(); /* get an register */
            // code generation
            TextCode.add("\t movl " + $Identifier.text + "(\%rip), \%" + regMap.get($reg_num));
        }
	| 
        LPAREN arith_expression RPAREN 
        { 
            $attr_type = $arith_expression.attr_type; 
        }
    ;

	
if_then_statements
	: 
        statement
	|   
        LBRACE statements RBRACE
	;

printf_statement
    : 'printf' '(' a=STRING_LITERAL ',' Identifier  ')' ';'
    {
     String label = newLabel();
     DataCode.add(label + ":");
     DataCode.add("\t .string " + $a.text);
     TextCode.add("\t movl " + $Identifier.text + "(\%rip), " + "\%esi");
     TextCode.add("\t movl " + "$" + label + ", " + "\%edi");
     TextCode.add("\t call printf");
    }
    ;
	
/* description of the tokens */
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

/////////////////////////////////////
//         設定一些 keyword        //
/////////////////////////////////////

Identifier:(LETTER)(LETTER | DIGIT)*;
Integer_constant: ('0' | ('1'..'9')(DIGIT)*);
Floating_point_constant:FLOAT_NUM1 | FLOAT_NUM2 | FLOAT_NUM3;
STRING_LITERAL:  '"' ( EscapeSequence | ~('\\'|'"') )* '"';
// final edition
PREPROCESSOR : '#'(.)*'\n'{$channel=HIDDEN;}; 


/////////////////////////////////////
//         設定一些 fragment        //
/////////////////////////////////////
// final edition 
fragment EscapeSequence: '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\');
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
WS  : (' '|'\r'|'\t'|'\n')+ {skip();};