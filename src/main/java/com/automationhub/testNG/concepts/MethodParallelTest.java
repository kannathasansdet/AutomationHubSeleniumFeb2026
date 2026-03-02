package com.automationhub.testNG.concepts;
import org.testng.annotations.Test;

public class MethodParallelTest {

    @Test
    public void test1() {
        System.out.println("Test1 → " + Thread.currentThread().getId());
    }

    @Test
    public void test2() {
        System.out.println("Test2 → " + Thread.currentThread().getId());
    }

    @Test
    public void test3() {
        System.out.println("Test3 → " + Thread.currentThread().getId());
    }
}
