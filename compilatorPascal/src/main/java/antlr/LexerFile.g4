lexer grammar LexerFile;


INC: 'inc';
DEC: 'dec';
ABS: 'abs';
ID: [a-zA-Z]+;
NUM:  [+-]?[0-9]+ '.'? [0-9]*;
NEWLINE:    '\r'? '\n';

SEMI: ';';
WS: [ \t]+ ->skip;