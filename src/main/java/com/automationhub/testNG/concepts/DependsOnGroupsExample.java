package com.automationhub.testNG.concepts;


import org.testng.annotations.Test;
import org.testng.TestNG;

public class DependsOnGroupsExample {
    @Test(groups = "smoketest")
    public void testA() {
        System.out.println("smoke test A");
    }

    @Test(groups = "smoketest")
    public void testB() {
        System.out.println("smoke test B");
    }

    @Test(dependsOnGroups = "smoketest")
    public void afterSmoke() {
        System.out.println("runs after all smoke group tests");
    }

  
}
