package com.automationhub.testNG.concepts;


//SingleThreadedExample.java
import org.testng.annotations.Test;

@Test(singleThreaded = true) // class-level annotation — ensures this class runs on a single thread
public class SingleThreadedExample {

 @Test
 public void stepOne() throws InterruptedException {
     System.out.printf("stepOne  -> thread=%s (id=%d)%n",
             Thread.currentThread().getName(), Thread.currentThread().getId());
     // simulate work that must NOT be concurrent with other methods in this class
     Thread.sleep(500);
 }

 @Test
 public void stepTwo() throws InterruptedException {
     System.out.printf("stepTwo  -> thread=%s (id=%d)%n",
             Thread.currentThread().getName(), Thread.currentThread().getId());
     // simulate work that must NOT be concurrent with other methods in this class
     Thread.sleep(300);
 }

 @Test
 public void stepThree() throws InterruptedException {
     System.out.printf("stepThree-> thread=%s (id=%d)%n",
             Thread.currentThread().getName(), Thread.currentThread().getId());
     Thread.sleep(200);
 }
}
