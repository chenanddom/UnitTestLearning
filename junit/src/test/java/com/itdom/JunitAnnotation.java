package com.itdom;

import org.junit.*;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class JunitAnnotation {
    @BeforeClass
    public static void beforeClass(){
        System.out.println("in before class");
    }
    @Before
    public void before(){
        System.out.println("in before");
    }
    @Test
    public void test(){
        System.out.println("in test");
    }
    @After
    public void after(){
        System.out.println("in after");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("in after class");
    }

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(JunitAnnotation.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }
}
