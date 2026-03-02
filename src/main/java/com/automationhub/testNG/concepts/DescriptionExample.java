package com.automationhub.testNG.concepts;


import org.testng.annotations.Test;
import org.testng.TestNG;

public class DescriptionExample {
    @Test(description = "Verify that user can register successfully")
    public void registrationTest() {
        System.out.println("registrationTest executed");
    }


}
