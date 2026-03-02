package com.automationhub.testNG.concepts;


import org.testng.annotations.Test;
import org.testng.TestNG;

public class GroupsExample {
    @Test(groups = {"regression"})
    public void updateProfile() {
        System.out.println("regression: updateProfile");
    }

    @Test(groups = {"sanity", "fast"})
    public void quickCheck() {
        System.out.println("sanity & fast: quickCheck");
    }

}
