package com.itdom;

import junit.framework.TestCase;

public class JavaTest extends TestCase {
    private int v1;
    private int v2;

    @Override
    protected void setUp() throws Exception {
        v1=3;
        v2=4;
    }
    public void test1(){
        int s1 = v1+v2;
        assertTrue(s1==7);
    }

    @Override
    protected void tearDown() throws Exception {
        System.out.println("tearDown");
    }
}
