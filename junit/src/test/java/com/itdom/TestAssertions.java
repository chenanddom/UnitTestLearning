package com.itdom;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import static junit.framework.TestCase.*;
import static org.junit.Assert.assertArrayEquals;

public class TestAssertions {

    @Test
    public void testAssertions() {
        String str1 = new String("abc");
        String str2 = new String("abc");
        String str3 = null;
        String str4 = "abc";
        String str5 = "abc";
        int val1 = 5;
        int val2 = 6;

        String[] expectedArray = {"one", "two", "three"};
        String[] resultArray = {"one", "two", "three"};

        assertEquals(str1,str2);

        assertTrue(val1<val2);

        assertFalse(val1>val2);

        assertNotNull(str1);

        assertNull(str3);

        assertSame(str4,str5);

        assertNotSame(str1,str2);

        assertArrayEquals(expectedArray,resultArray);
    }

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(TestAssertions.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }

}
