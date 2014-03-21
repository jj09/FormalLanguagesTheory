/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

grammar RegEx;

options { language = Java; }

tokens
{
	CLOSURE_EXP,
	UNION_EXP,
	CONCAT_EXP,
	LIST
}


exp
	:	(closure | union)*
	;

closure  
	:	'(' union ')' '*' //-> ^(CLOSURE_EXP union) | LIT '*' -> ^(CLOSURE_EXP LIT)
	;


union 	
	:	concat ('+' concat)* //-> ^(UNION_EXP concat*) 
	;

concat
	:	LIT+ //-> ^(CONCAT_EXP LIT+) // ('*' | LIT*)
	;

LIT	
	:	'0' | '1' | '2'
	;

// Whitespace -- ignored
WS : [ \t\r\n]+ -> skip ; // Define whitespace rule, toss it out