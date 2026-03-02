package com.automationhub.testNG.concepts;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SuiteLevelExample {

    @Test
    @Parameters("env")
    public void testEnvironment(String env) {
        System.out.println("Running in environment: " + env);
    }
}
