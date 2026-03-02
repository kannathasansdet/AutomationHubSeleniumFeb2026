package com.automationhub.testNG.concepts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionExample {

    @Test
    public void loginTest() {
        String expectedTitle = "Home - MyApp";
        String actualTitle = "Home - MyApp";

        System.out.println("Step 1: Launch App");
        System.out.println("Step 2: Enter username and password");
        
        // Hard assertion – test stops here if it fails
        Assert.assertEquals(actualTitle, expectedTitle, "Page title mismatch!");

        System.out.println("Step 3: Verify profile picture"); // This will NOT execute
    }
}
