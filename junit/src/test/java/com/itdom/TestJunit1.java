package com.itdom;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import static org.junit.Assert.*;

public class TestJunit1 {
    @Test
    public void testAdd(){
        int num=5;
        String temp=null;
        String str = "Junit is work fine";
        assertEquals("Junit is work fine",str);
        assertFalse(num>6);
        assertNotNull(str);

    }

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(TestJunit1.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }

}
