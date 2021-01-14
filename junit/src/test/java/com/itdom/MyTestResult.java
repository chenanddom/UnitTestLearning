package com.itdom;

import junit.framework.AssertionFailedError;
import junit.framework.Test;
import junit.framework.TestResult;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class MyTestResult  extends TestResult {

    @Override
    public synchronized void addError(Test test, Throwable e) {
        super.addError((junit.framework.Test)test, e);
    }

    @Override
    public synchronized void addFailure(Test test, AssertionFailedError e) {
        super.addFailure((junit.framework.Test)test, e);
    }
    @org.junit.Test
    public void myTest(){
        System.out.println(this.runCount());
    }
    @org.junit.Test
    public void testAdd(){
        System.out.println(this.runCount());
    }

    @Override
    public synchronized void stop() {
        System.out.println(this.runCount());

    }

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(MyTestResult.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }
}
