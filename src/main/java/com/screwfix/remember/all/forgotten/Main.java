package com.screwfix.remember.all.forgotten;

import com.screwfix.remember.all.forgotten.testcases.IntegerTestCase;
import com.screwfix.remember.all.forgotten.testcases.Printable;
import com.screwfix.remember.all.forgotten.testcases.StringTestCase;
import com.screwfix.remember.all.forgotten.testrunners.ConsoleTestRunner;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       // System.out.println("Hello world!!");
        TestCase [] testcases = new TestCase[] {new StringTestCase(),new IntegerTestCase()};
        TestRunner runner = new ConsoleTestRunner();
        runner.execute(Arrays.asList(testcases));
    }


}
