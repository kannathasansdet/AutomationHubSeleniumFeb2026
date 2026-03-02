// SuccessPercentageExample.java
package com.automationhub.testNG.concepts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SuccessPercentageExample {

    private int runCount = 0;

    @Test(invocationCount = 5, successPercentage = 60)
    public void flakyTest() {
        runCount++;
        System.out.println("Running test invocation: " + runCount);

        // Fail the first two runs intentionally
        if (runCount <= 2) {
            Assert.fail("Intentional failure on run " + runCount);
        }
    }
}
