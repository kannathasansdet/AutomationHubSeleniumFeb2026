package com.automationhub.testNG.concepts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionExample {

    @Test
    public void softAssertTest() {
        SoftAssert softAssert = new SoftAssert();
        
        System.out.println("Check 1: Title");
        softAssert.assertEquals("Home", "Dashboard", "Title mismatch");

        System.out.println("Check 2: Logo");
        softAssert.assertTrue(false, "Logo not visible");

        System.out.println("Check 3: Username");
        softAssert.assertEquals("John", "John", "Username mismatch");

        // MUST be called at the end
        softAssert.assertAll();
    }
}
