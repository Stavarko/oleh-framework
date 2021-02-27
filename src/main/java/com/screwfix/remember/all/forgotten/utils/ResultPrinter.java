package com.screwfix.remember.all.forgotten.utils;

import com.screwfix.remember.all.forgotten.Printer;
import com.screwfix.remember.all.forgotten.TestCase;
import com.screwfix.remember.all.forgotten.TestResult;

public class ResultPrinter implements Printer {
    @Override
    public void print(TestCase testcase,TestResult testResult) {
        System.out.printf("testcase: %s, result: %b%n",testcase.getClass().getSimpleName(),testResult.check());
    }
}
