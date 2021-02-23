package com.screwfix.remember.all.forgotten.testrunners;

import com.screwfix.remember.all.forgotten.TestCase;
import com.screwfix.remember.all.forgotten.TestResult;
import com.screwfix.remember.all.forgotten.TestRunner;

import java.util.Collection;

public class ConsoleTestRunner implements TestRunner {
    private final ResultPrinter printer;
    // TODO implement ResultPrinter class with interface: testcase: class com.screwfix.remember.all.forgotten.testcases.IntegerTestCase result: true
    ConsoleTestRunner(ResultPrinter printer){
       this.printer = printer;
    }
    @Override
    public void execute(Collection<TestCase> coreSuit) {
        for(TestCase test :coreSuit){
            TestResult result = test.run();
            //System.out.println("testcase: " + test.getClass() + " result: " + result);
            printer.print(result);
        }
    }

}
