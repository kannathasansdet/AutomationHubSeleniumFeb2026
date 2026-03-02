package com.automationhub.testNG.concepts;

import org.testng.annotations.Test;
import org.testng.TestNG;

public class InvocationCountExample {
    @Test(invocationCount = 5)
    public void repeated() {
        System.out.println("Invocation of repeated()");
    }

}
