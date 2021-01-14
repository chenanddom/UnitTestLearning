package com.itdom;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * 测试套件意味捆绑几个测试案例并且同时运行。在 JUnit 中，@RunWith 和 @Suite 都被用作运行测试套件。以下为使用 TestJunit1 和 TestJunit2
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({TestUnit1.class,TestUnit2.class})
public class JunitTestSuiteTest {
}
