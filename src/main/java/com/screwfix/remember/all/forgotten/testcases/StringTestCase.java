package com.screwfix.remember.all.forgotten.testcases;

import com.screwfix.remember.all.forgotten.TestCase;
import com.screwfix.remember.all.forgotten.TestResult;

public class StringTestCase implements TestCase,Printable {
    public TestResult run() {
        System.out.println("Just string test case");
        return new TestResult() {
            @Override
            public boolean check() {
                return false;
            }
        };
    }

    public void print() {
        System.out.println("this is printable");
    }
}
