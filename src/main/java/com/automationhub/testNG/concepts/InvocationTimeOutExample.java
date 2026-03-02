package com.automationhub.testNG.concepts;


import org.testng.annotations.Test;
import org.testng.TestNG;

public class InvocationTimeOutExample {
    // This will run 10 times. If total time for all invocations exceeds 2000 ms, test fails.
    @Test(invocationCount = 10, invocationTimeOut = 2000)
    public void repeatedAction() throws InterruptedException {
        // short sleep so combined may or may not exceed timeout depending on value
        Thread.sleep(150);
        System.out.println("one invocation");
    }

}
