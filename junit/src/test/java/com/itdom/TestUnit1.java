package com.itdom;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestUnit1{
    String message="test";
    @Test
    public void testValue(){
        System.out.println("test value");
        assertEquals(message,"test1");
    }
}