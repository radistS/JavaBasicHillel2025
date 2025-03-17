package com.pass.gen.task;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringLimitTest {

    @Test
    void stringUpdate_value_null() {
        assertThrows(IllegalArgumentException.class, () -> new StringLimit().stringUpdate(null, 4));
    }

    @Test
    void stringUpdate_limit_less_0() {
        assertThrows(IllegalArgumentException.class, () -> new StringLimit().stringUpdate("null", -1));
    }

    @Test
    void stringUpdate_limit_eq_0() {
        assertEquals("...", new StringLimit().stringUpdate("null", 0));
    }

    @Test
    void stringUpdate_str_less_limit() {
        assertEquals("str", new StringLimit().stringUpdate("str", 4));
    }

    @Test
    void stringUpdate_str_more_limit() {
        assertEquals("st...", new StringLimit().stringUpdate("str", 2));
    }

}