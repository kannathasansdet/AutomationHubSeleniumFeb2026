package com.automationhub.testNG.concepts;
import org.testng.annotations.Test;
import org.testng.TestNG;

public class PriorityExample {
	
    @Test(priority=1) //It will be considered as priority = 0
    public void loginBcenario() {
        System.out.println("1 - loginBcenario-Priority");
    }
    
    @Test(priority=1)
    public void loginAestCase() {
        System.out.println("1 - loginAestCase-Priority");
    }

   

}
