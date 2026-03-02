package com.automationhub.testNG.concepts;


import org.testng.annotations.Test;
import org.testng.TestNG;

public class TimeOutExample {
    @Test(timeOut = 1000) // milliseconds
    public void fastMethod() throws InterruptedException {
        // if sleep > 1000, test will fail by timeout
        Thread.sleep(1000);
        System.out.println("completed within timeout");
    }

   
}
