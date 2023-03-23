lexer grammar Lexicon;

INT_CONSTANT
	: [0-9]+
	;

FLOAT_CONSTANT
	: [0-9]+ '.' [0-9]+
	;

CHAR_CONSTANT
	: '\'' '\\'? (~[\n\t\r]) '\''
	;

IDENT 
	: [a-zA-Z_][0-9a-zA-Z_]*
	;

LINE_COMMENT
	: '//' .*? ('\n' | EOF) -> skip
	;

MULTILINE_COMMENT
	: '/*' .*? '*/' -> skip
	;

WHITESPACE
	: [ \t\r\n]+ -> skip
	;