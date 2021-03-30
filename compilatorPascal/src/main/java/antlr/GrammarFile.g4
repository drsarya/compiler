grammar GrammarFile;

import   LexerFile ;

prog: stat+;

stat
:
     expr SEMI NEWLINE     # printExpr
     | ID ':='       expr     SEMI NEWLINE  # assign
     | NEWLINE # blank
;

expr:
      NUM # num
     | ID # id
     |op = ('inc'|'dec'|'abs') '(' expr (','expr)? ')'   # IncDecAbs
;

