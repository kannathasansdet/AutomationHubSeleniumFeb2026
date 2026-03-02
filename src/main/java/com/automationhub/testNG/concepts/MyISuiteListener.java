package com.automationhub.testNG.concepts;


import org.testng.ISuite;
import org.testng.ISuiteListener;

public class MyISuiteListener implements ISuiteListener {

    @Override
    public void onStart(ISuite suite) {
        System.out.println("Suite Started: " + suite.getName());
        // Example: Initialize report
    }

    @Override
    public void onFinish(ISuite suite) {
        System.out.println("Suite Finished: " + suite.getName());
        // Example: Flush report
    }
}
