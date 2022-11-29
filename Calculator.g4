grammar Calculator;


expression
   : multiplyingExpression ((PLUS | MINUS) multiplyingExpression)*
   ;

multiplyingExpression
   : powExpression ((TIMES | DIV) powExpression)*
   ;

powExpression
   : INT (POV INT)*
   ;

INT: [0-9]+ ;
DOT: '.';
TIMES: '*' ;
DIV: '/' ;
PLUS: '+' ;
MINUS: '-' ;
POV: '^';
WS : [ \t\r\n]+ -> skip ;