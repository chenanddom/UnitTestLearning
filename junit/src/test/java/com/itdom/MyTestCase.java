package com.itdom;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class MyTestCase extends TestCase {
    private double v1;
    private double v2;

    @Override
    protected void setUp() throws Exception {
        v1=2.0;
        v2=3.0;
    }

    @Test
    public void testAdd(){
        System.out.println("No of Test Case = "+this.countTestCases());
        System.out.println("Test Case Name="+this.getName());

        this.setName("Custom name");

        System.out.println("New test Case Name="+this.getName());
    }

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(MyTestCase.class);
        Result result2 = JUnitCore.runClasses(MyTestCase.class);
    }

    @Override
    protected void tearDown() throws Exception {

    }
}
