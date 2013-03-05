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

import de.weltraumschaf.shackhack.SymbolTable.Entry;
import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.core.IsNull.nullValue;
import static org.hamcrest.core.IsNull.notNullValue;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

/**
 *
 * @author Sven Strittmatter <weltraumschaf@googlemail.com>
 */
public class SymbolTableTest {

    @Rule public ExpectedException thrown = ExpectedException.none();
    private final SymbolTable sut = new SymbolTable();

    @Test
    public void equalsOfEntry() {
        final Entry sut1 = new SymbolTable.Entry(1, "foo");
        final Entry sut2 = new SymbolTable.Entry(1, "foo");
        final Entry sut3 = new SymbolTable.Entry(3, "foo");
        final Entry sut4 = new SymbolTable.Entry(1, "bar");

        assertThat(sut1, is(sut1));
        assertThat(sut2, is(sut1));
        assertThat(sut1, is(sut2));
        assertThat(sut2, is(sut2));

        assertThat(sut3, is(sut3));
        assertThat(sut4, is(sut4));

        assertThat(sut3, is(not(sut1)));
        assertThat(sut3, is(not(sut2)));
        assertThat(sut3, is(not(sut4)));

        assertThat(sut4, is(not(sut1)));
        assertThat(sut4, is(not(sut2)));
        assertThat(sut4, is(not(sut3)));
    }

    @Test
    public void lookup_returnsNullIfNotEntered() {
        assertThat(sut.lookup("foo"), nullValue());
    }

    @Test
    public void lookup_returnsEntryIfEntered() {
        sut.enter("foo");
        final SymbolTable.Entry symbol = sut.lookup("foo");
        assertThat(symbol, notNullValue());
        assertThat(symbol.getName(), is("foo"));
        assertThat(symbol.getId(), is("0"));
    }

    @Test
    public void enter_throwsExceptionOnEnteringNameTwice() {
        sut.enter("foo");
        thrown.expect(ShackHackException.class);
        thrown.expectMessage("Symbal with name 'foo' already entered in table!");
        sut.enter("foo");
    }

    @Test
    public void enter_eachEntryIncrementsSlot() {
        assertThat(sut.enter("foo").getId(), is("0"));
        assertThat(sut.enter("bar").getId(), is("1"));
        assertThat(sut.enter("baz").getId(), is("2"));
    }

}
