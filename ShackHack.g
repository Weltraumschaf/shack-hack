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

package de.weltraumschaf.shackhack;    
}

start       : ausdruck ;
ausdruck    : left=ausdruck operator='*' right=ausdruck #mult
            | left=ausdruck operator='/' right=ausdruck #div
            | left=ausdruck operator='-' right=ausdruck #sub
            | left=ausdruck operator='+' right=ausdruck #add
            | '(' inBrace=ausdruck ')' #brace
            | number=NUMBER #number
            ;

NUMBER      : [0-9]+ ;
WS          : [\r\n\t ]+ -> skip ;
