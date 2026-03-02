package com.automationhub.testNG.concepts;

//ThreadPoolSizeExample.java
import org.testng.annotations.Test;

public class ThreadPoolSizeExample {

 /**
  * invocationCount = 12 => run the method 12 times
  * threadPoolSize = 4  => run those invocations using 4 threads concurrently
  */
 @Test(invocationCount = 12, threadPoolSize = 4)
 public void parallelInvocationTest() throws InterruptedException {
     long threadId = Thread.currentThread().getId();
     String threadName = Thread.currentThread().getName();

     System.out.printf("START parallelInvocationTest -> thread=%s (id=%d)%n", threadName, threadId);

     // Simulate variable work time
     long sleep = 200 + (long)(Math.random() * 400);
     Thread.sleep(sleep);

     System.out.printf("END   parallelInvocationTest -> thread=%s (id=%d) (slept=%dms)%n",
             threadName, threadId, sleep);
 }
}
