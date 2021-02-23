package com.screwfix.remember.all.forgotten.testcases;

import com.screwfix.remember.all.forgotten.TestCase;
import com.screwfix.remember.all.forgotten.TestResult;

public class IntegerTestCase implements TestCase,Printable {


    public TestResult run() {
        System.out.println("Integer test case, without integer");
        return new TestResult() {
            @Override
            public boolean check() {
                return true;
            }
        };
    }
}
