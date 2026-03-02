package com.automationhub.testNG.concepts;
import org.testng.annotations.Test;
import org.testng.TestNG;

public class DependsOnMethodsExample {
    @Test
    public void init() {
        System.out.println("init");
    }

    @Test(dependsOnMethods = "init")
    public void process() {
        System.out.println("process (runs after init)");
    }

    @Test(dependsOnMethods = {"init", "process"})
    public void finalizeStep() {
        System.out.println("finalize (runs after init and process)");
    }

  
}
