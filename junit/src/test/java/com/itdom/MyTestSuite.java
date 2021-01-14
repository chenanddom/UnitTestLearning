package com.itdom;

import junit.framework.TestResult;
import junit.framework.TestSuite;

public class MyTestSuite {

    public static void main(String[] args) {
        TestSuite testSuite = new TestSuite(TestUnit1.class,TestUnit2.class);
        TestResult testResult = new TestResult();
        testSuite.run(testResult);
        System.out.println("Number of test cases = "+testResult.runCount());
    }
}
