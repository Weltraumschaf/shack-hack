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

start       : expression ;
expression  : left=expression operator='*' right=expression #mult
            | left=expression operator='/' right=expression #div
            | left=expression operator='-' right=expression #sub
            | left=expression operator='+' right=expression #add
            | '(' inBrace=expression ')' #brace
            | number=NUMBER #number
            ;

NUMBER      : [0-9]+ ;
WS          : [\r\n\t ]+ -> skip ;
