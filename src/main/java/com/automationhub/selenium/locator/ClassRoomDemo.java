package com.automationhub.selenium.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassRoomDemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("#email")).sendKeys("kannathasansdet@gmail.com");
		
		Thread.sleep(4000);
		
		driver.findElement(By.cssSelector(".inputtext._55r1._6luy._9npi")).sendKeys("123");
		
		Thread.sleep(4000);
		
		driver.findElement(By.cssSelector("button[data-testid=\"royal-login-button\"]")).click();
		
		driver.close();
	

		
	
	}

}
