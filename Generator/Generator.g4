/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

grammar Generator;

LEXID: [A-Z]+;
NTERMID : [a-z]+;


WS: [ \t\r\n] -> skip; 
STRING : '"'.*?'"';


prog : '@lexer' '{' lexems  '}'  '@define' '{' nterms '}'  '@rules' '{' prules '}';

prules : prule*;
prule : NTERMID '->' prulepart;
prulepart : (CODE? (NTERMID|LEXID))* (CODE)? ';' ;
CODE : '${'(STRING|.)*?'}$';            
            

lexems : lexem*;
lexem : LEXID ':' STRING ('->' 'skip')? ';';



nterms : nterm+;
nterm : NTERMID (params)? ';' ;
params: PARAMS;
PARAMS : '$[' .*? ']$';