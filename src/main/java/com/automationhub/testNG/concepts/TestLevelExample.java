package com.automationhub.testNG.concepts;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestLevelExample {

    @Test
    @Parameters("browser")
    public void testBrowser(String browser) {
        System.out.println("Running on browser: " + browser);
    }
}
