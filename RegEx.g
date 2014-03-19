grammar RegEx;

options { output = AST; }



exp
	:	(closure | orExp)*
	;

closure  
	:	'(' orExp ')' '*'
	;


orExp 	
	:	LIT* ('+' LIT*)*
	;

LIT	
	:	'0' | '1' | '2'
	;

// Whitespace -- ignored
WS
	: (' '|'\r'|'\t'|'\u000C'|'\n') { $channel=HIDDEN; }
	; 