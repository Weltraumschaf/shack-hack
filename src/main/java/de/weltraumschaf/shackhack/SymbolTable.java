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

import com.google.common.base.Objects;
import com.google.common.collect.Maps;
import de.weltraumschaf.shackhack.ShackHackException.Code;
import java.util.Map;

/**
 *
 * @author Sven Strittmatter <weltraumschaf@googlemail.com>
 */
class SymbolTable {

    static class Entry {
        final int id;
        final String name;

        public Entry(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        @Override
        public int hashCode() {
            return Objects.hashCode(name, id);
        }

        @Override
        public boolean equals(final Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }

            final Entry other = (Entry) obj;
            return Objects.equal(name, other.name) && Objects.equal(id, other.id);
        }



    }

    private final Map<String, Entry> table = Maps.newHashMap();
    private int currentSlot;

    public Entry lookup(final String name) {
        if (table.containsKey(name)) {
            return table.get(name);
        }

        return null;
    }

    public Entry enter(final String name) {
        if (null != lookup(name)) {
            throw new ShackHackException(String.format("Symbal with name '%s' already entered in table!", name), Code.SYNTAX_ERROR);
        }

        final Entry symbol = new Entry(currentSlot, name);
        table.put(name, symbol);
        currentSlot++;
        return symbol;
    }

}
