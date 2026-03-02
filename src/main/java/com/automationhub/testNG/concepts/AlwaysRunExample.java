package com.automationhub.testNG.concepts;
import org.testng.annotations.Test;
import org.testng.TestNG;

public class AlwaysRunExample {
    @Test
    public void init() {
        System.out.println("init - will fail to demonstrate alwaysRun");
        throw new RuntimeException("Simulated init failure");
    }

    @Test(dependsOnMethods = "init", alwaysRun = true)
    public void cleanup() {
        System.out.println("cleanup - should run even if init fails (because alwaysRun=true)");
    }


}
