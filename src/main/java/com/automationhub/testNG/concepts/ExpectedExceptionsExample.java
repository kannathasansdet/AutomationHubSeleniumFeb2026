package com.automationhub.testNG.concepts;


import org.testng.annotations.Test;
import org.testng.TestNG;

public class ExpectedExceptionsExample {
    @Test(expectedExceptions = ArithmeticException.class)
    public void divideByZero() {
        int x = 10 / 0; // throws ArithmeticException
        System.out.println(x);
    }

    // If another exception or no exception is thrown, the test fails.


}
