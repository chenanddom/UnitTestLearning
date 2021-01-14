package com.itdom;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestUnit2 {
    String message = "test2";

    @Test
    public void testValue() {
        System.out.println("test value2");
        assertEquals(message, "test2");
    }
}