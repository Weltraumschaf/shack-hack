grammar ShackHack;

@header {
/*
 *  LICENSE
 *
 * "THE BEER-WARE LICENSE" (Revision 43):
 * "Sven Strittmatter" <weltraumschaf@googlemail.com> wrote this file.
 * As long as you retain this notice you can do whatever you want with
 * this stuff. If we meet some day, and you think this stuff is worth it,
 * you can buy me a non alcohol-free beer in return.
 *
 * Copyright (C) 2012 "Sven Strittmatter" <weltraumschaf@googlemail.com>
 */

package de.weltraumschaf.shackhack.antlr;
}

program     : statement? | ( statement NL )* ;
statement   : expression                                  # expressionStatement
            | id=IDENTIFIER OP_EQUAL val=expression       # assignStatement
            ;
expression  : left=expression operator=( OP_STAR | OP_SLASH ) right=expression  # mulDivExpression
            | left=expression operator=( OP_PLUS | OP_MINUS ) right=expression  # addSubExpression
            | val=value                                         # valueExpression
            | id=IDENTIFIER                                     # identiferExpression
            | OP_LPAREN inParens=expression OP_RPAREN           # parenExpression
            ;
value       : INTEGER | FLOAT | BOOLEAN ;

OP_EQUAL    : '=' ;
OP_STAR     : '*' ;
OP_SLASH    : '/' ;
OP_MINUS    : '-' ;
OP_PLUS     : '+' ;
OP_LPAREN   : '(' ;
OP_RPAREN   : ')' ;
OP_LCURLY   : '{' ;
OP_RCURLY   : '}' ;

NL          : ( '\n' | '\r' |'\r\n' ) -> skip ;
WS          : [ \t]+ -> skip ;

IDENTIFIER  : LETTER (LETTER | [0-9])* ;
fragment
LETTER      : [a-zA-Z] ;
INTEGER     : [0-9]+ ;
FLOAT       : ([0-9])+ '.' ([0-9])* EXPONENT?
            | '.' ([0-9])+ EXPONENT?
            | ([0-9])+ EXPONENT ;
fragment
EXPONENT    : ('e'|'E') ('+'|'-')? ([0-9])+ ;

BOOLEAN     : TRUE | FALSE ;
TRUE        : 'true' ;
FALSE       : 'false' ;

COMMENT     : ( SL_COMMENT | ML_COMMENT ) -> skip ;
fragment
ML_COMMENT  : '/*' .*? '*/' ;
SL_COMMENT  : '//' ~[\r\n]* '\r'? '\n' ;
