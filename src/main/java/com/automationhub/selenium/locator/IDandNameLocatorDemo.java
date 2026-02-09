package com.automationhub.selenium.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class IDandNameLocatorDemo {

    public static void main(String[] args) throws InterruptedException {

	WebDriver driver = new ChromeDriver();
		
	driver.get("https://www.facebook.com/");
	
	driver.manage().window().maximize();
	
	driver.findElement(By.id("email")).sendKeys("Kannathasan@gmail.com");
	
	Thread.sleep(4000);
	
	driver.findElement(By.id("pass")).sendKeys("Password");
	
	Thread.sleep(4000);

	driver.findElement(By.className("_9lsa")).click();
	
	Thread.sleep(4000);
	
	driver.findElement(By.name("login")).click();
	
	Thread.sleep(4000);
	
	driver.close();
	
	/*
	 * Options op = driver.manage(); Window w = op.window(); w.maximize();
	 */
	
       
	
    }
}
