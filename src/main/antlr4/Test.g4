grammar Test;

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

prog    : stat+ ;

stat    : expr NL                                   # printExpr
        | ID '=' expr NL                            # assign
        | NL                                        # blank
        ;

expr    : left=expr op=( MUL | DIV ) right=expr     # MulDiv
        | left=expr op=( ADD | SUB ) right=expr     # AddSub
        | INT                                       # int
        | ID                                        # id
        | '(' expr ')'                              # parens
        ;

ID      : [a-zA-Z]+ ;
INT     : [0-9]+ ;
NL      :'\r'? '\n' ;
WS      : [ \t]+ -> skip ;

MUL     : '*' ;
DIV     : '/' ;
ADD     : '+' ;
SUB     : '-' ;