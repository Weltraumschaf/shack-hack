/*
 * LICENSE
 *
 * "THE BEER-WARE LICENSE" (Revision 42):
 * "Sven Strittmatter" <weltraumschaf@googlemail.com> wrote this file.
 * As long as you retain this notice you can do whatever you want with
 * this stuff. If we meet some day, and you think this stuff is worth it,
 * you can buy me a beer in return.
 *
 */

package de.weltraumschaf.shackhack;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

/**
 *
 * @author Sven Strittmatter <weltraumschaf@googlemail.com>
 */
public class MainTest {

    @Test
    public void extractClassName() {
        assertThat(Main.extractClassName(""), is(""));
        assertThat(Main.extractClassName("FooBar"), is("FooBar"));
        assertThat(Main.extractClassName("FooBar.hack"), is("FooBar"));
        assertThat(Main.extractClassName("FooBar.bar"), is("FooBar"));
        assertThat(Main.extractClassName("foo/bar/baz/FooBar.hack"), is("FooBar"));
        assertThat(Main.extractClassName("foo/bar/baz/FooBar.bar"), is("FooBar"));
        assertThat(Main.extractClassName("/foo/bar/baz/FooBar.hack"), is("FooBar"));
        assertThat(Main.extractClassName("/foo/bar/baz/FooBar.bar"), is("FooBar"));
    }

}
