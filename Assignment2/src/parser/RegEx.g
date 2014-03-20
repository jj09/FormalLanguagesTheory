grammar RegEx;

options { output = AST; }

tokens
{
	CLOSURE_EXP;
	UNION_EXP;
	CONCAT_EXP;
	LIST;

}

@lexer::header {
  package parser;
}

@parser::header {
  package parser;
}


exp
	:	(closure | union)*
	;

closure  
	:	'(' union ')' '*' -> ^(CLOSURE_EXP union) | LIT '*' -> ^(CLOSURE_EXP LIT)
	;


union 	
	:	concat ('+' concat)* -> ^(UNION_EXP concat*) 
	;

concat
	:	LIT+ -> ^(CONCAT_EXP LIT+) // ('*' | LIT*)
	;

LIT	
	:	'0' | '1' | '2'
	;

// Whitespace -- ignored
WS
	: (' '|'\r'|'\t'|'\u000C'|'\n') { $channel=HIDDEN; }
	; 