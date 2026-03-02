package com.automationhub.testNG.concepts;
import org.testng.annotations.Test;
import org.testng.TestNG;

public class EnabledExample {
    @Test
    public void readyFeature() {
        System.out.println("This runs.");
    }

    @Test(enabled = false)
    public void featureNotReady() {
        System.out.println("This will NOT run.");
    }

   
}
