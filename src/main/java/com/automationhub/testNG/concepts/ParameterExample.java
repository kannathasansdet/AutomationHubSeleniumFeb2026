package com.automationhub.testNG.concepts;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterExample {

    @Test
    @Parameters({"username", "age"})
    public void parameterTest(String username, int age) {
        System.out.println("Username: " + username);
        System.out.println("Age: " + age);
    }
}
