
grammar GrammarFile;

// Monoline comment about a parser rule
myStartingRule : program+ ;

/*
 A multi-line Java-like comment
 */

program : PROGRAM ID';' block DOT #progrm;

block : vardeclpart? procdeclpart? statementpart? #blockProgrm ;

// VARIABLE DECLARATION
vardeclpart : (VAR (vardecl SMCOLON)+)? #blockVar;
vardecl : variable (',' variable)* ':' type #varDeclaration;
type : simpletype #simpleVar| arraytype #arrayVarType;
arraytype : ARRAY '['indexrange']' OF simpletype #arrayVar;
indexrange : DIGIT'..'DIGIT #rangeIndexVar;
simpletype : (INTEGER|STRING|FLOAT|BOOLEAN) #idVar;

// PROCEDURE DECLARATION
procdeclpart : (procdecl)*;
procdecl : PROCEDURE ID (formalParameterList)? ';' block ';'#procDeclFunc;
formalParameterList: OP parameterGroup (',' parameterGroup)* CP #procVarDeclFunc;
parameterGroup : identifierList COLON simpletype ;
identifierList: ID (COMMA ID)*;

// STATEMENT DECLARATION
statementpart : (cmpstatement)* #stmt;
cmpstatement : BEGIN statement';' (statement';')* END #mainStmt;
statement : smpstatement #smpStmt| stcstatement #stcStmt;
smpstatement: assstatement #attribStmt| procstatement #stmtID| readstatement #resultReadStmt| writestatement #resultWriteStmt;
assstatement : variable ':=' expression #stmtAttrib;

procstatement : ID (OP parameterList CP)?#idStmt ;
parameterList : expression (COMMA expression)*;

readstatement : READ '('variable (',' variable)*')' #readStmt;
writestatement : WRITE '('expression (',' expression)*')' #writeStmt;

// EXPRESSION
expression : simpleExpression #resultSimpleExp | simpleExpression relationop=('=' | '<' | '>' | '<>' | '<=' | '>=') simpleExpression #resultExp;
simpleExpression :   term (addop term)* #smplExpression;
term : factor (multop factor)* #termExpression;
factor: variable #varExpr |( MINUS )? constant #constantExpr| '('expression')' #multExpr | NOT factor #notExpression;
constant : DIGIT ('.' DIGIT)* | STR | ID | TRUE | FALSE;
addop : PLUS | MINUS | OR;
multop : DIV | MULT | AND;
variable : ID #varID | ID '['expression']' #indexedVar;

// STRUCTURED STATEMENT
stcstatement : cmpstatement #cmpStatementFunc | ifStatement #ifStatementFunc| whilestatement #whileStatementFunc | forstatement #forStatementFunc;
ifStatement : IF expression THEN statement #ifStmt | IF expression THEN b1=statement ELSE b2=statement #ifElseStmt;
whilestatement : WHILE expression DO b1=cmpstatement #whileStmt;
forstatement : FOR '(' (simpleExpression)? ';' expression ';' counter=assstatement? ')' b1=cmpstatement #forStmt;

// LEXER RULES
//letdig  : LETTER | DIGIT;
specsym :  	'+' | '-' | '*' | '=' | '<>' | '<' | '>' | '<=' | '>=' |
                '(' | ')' | '[' | ']' | ':=' | '.' | ',' | ';' | ':' | '..' | DIV | OR |
                AND | NOT | IF | THEN | ELSE | OF | WHILE | DO |
                BEGIN | END | READ | WRITE | VAR | ARRAY |
                PROCEDURE | PROGRAM;

predid : INTEGER | BOOLEAN | TRUE | FALSE;

fragment A:('a'|'A');
fragment B:('b'|'B');
fragment C:('c'|'C');
fragment D:('d'|'D');
fragment E:('e'|'E');
fragment F:('f'|'F');
fragment G:('g'|'G');
fragment H:('h'|'H');
fragment I:('i'|'I');
fragment J:('j'|'J');
fragment K:('k'|'K');
fragment L:('l'|'L');
fragment M:('m'|'M');
fragment N:('n'|'N');
fragment O:('o'|'O');
fragment P:('p'|'P');
fragment Q:('q'|'Q');
fragment R:('r'|'R');
fragment S:('s'|'S');
fragment T:('t'|'T');
fragment U:('u'|'U');
fragment V:('v'|'V');
fragment W:('w'|'W');
fragment X:('x'|'X');
fragment Y:('y'|'Y');
fragment Z:('z'|'Z');

FOR : F O R;
OR  : O R ;
AND : A N D ;
NOT : N O T ;
IF  : I F ;
THEN : T H E N ;
ELSE : E L S E ;
OF : O F ;
WHILE : W H I L E;
DO : D O ;
BEGIN : B E G I N ;
END : E N D ;
READ : R E A D ;
WRITE : W R I T E ;
VAR : V A R ;
ARRAY : A R R A Y;
PROCEDURE : P R O C E D U R E;
PROGRAM : P R O G R A M;

DIV: '/';
PLUS : '+';
MINUS : '-';
MULT : '*';
EQUALS : '=';
RT : '>';
LT : '<';
LE : '<=';
RE : '>=';
LR : '<>';
OP : '(';
CP : ')';
OC : '[';
CC : ']';
ATTRIB : ':=';
DOT : '.';
COMMA : ',';
SMCOLON : ';';
COLON : ':';
DBDOT : '..';
INTEGER : I N T E G E R;
BOOLEAN : B O O L E A N ;
FLOAT : F L O A T ;
STRING : S T R I N G ;
TRUE : T R U E ;
FALSE : F A L S E;
ID      : ('a' .. 'z' | 'A' .. 'Z') ('a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_')*;
STR     : '"'[a-zA-Z0-9\t ]*'"';
WS     : [ \t\r\n] -> skip  ;
DIGIT  : [0-9]+;