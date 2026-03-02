package com.automationhub.testNG.concepts;


import org.testng.annotations.Test;

public class PriorityExampleDemo {

    @Test(priority = -1)
    public void testNegative() {
        System.out.println("testNegative (priority = -1)");
    }

    @Test
    public void testDefault1() {
        System.out.println("testDefault1 (priority = 0 default)");
    }

    @Test
    public void testDefault2() {
        System.out.println("testDefault2 (priority = 0 default)");
    }

    @Test(priority = 0)
    public void testZero() {
        System.out.println("testZero (priority = 0 explicitly)");
    }

    @Test(priority = 2)
    public void testTwo() {
        System.out.println("testTwo (priority = 2)");
    }

    @Test(priority = 1)
    public void testOne() {
        System.out.println("testOne (priority = 1)");
    }

    @Test(priority = 1)
    public void testAlpha() {
        System.out.println("testAlpha (priority = 1)");
    }
}
