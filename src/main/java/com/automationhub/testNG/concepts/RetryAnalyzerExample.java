package com.automationhub.testNG.concepts;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.Test;
import org.testng.TestNG;

// A simple retry analyzer that retries a failing test up to 2 times.
class Retry implements IRetryAnalyzer {
    private int retryCount = 0;
    private final int maxRetry = 2;

    @Override
    public boolean retry(ITestResult result) {
        if (retryCount < maxRetry) {
            retryCount++;
            System.out.println("Retrying " + result.getName() + " - attempt " + (retryCount + 1));
            return true;
        }
        return false;
    }
}

public class RetryAnalyzerExample {
    private static int attempts = 0;

    @Test(retryAnalyzer = Retry.class)
    public void flakyTest() {
        attempts++;
        System.out.println("flakyTest run #" + attempts);
        if (attempts < 3) { // fail first two times
            throw new RuntimeException("Simulated flaky failure");
        }
        System.out.println("flakyTest finally passed on attempt " + attempts);
    }

  
}
