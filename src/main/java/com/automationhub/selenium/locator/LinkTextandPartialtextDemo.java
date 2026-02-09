package com.automationhub.selenium.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextandPartialtextDemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://omayo.blogspot.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Open a popup window")).click();
		
		Thread.sleep(4000);
		
		driver.findElement(By.partialLinkText("wisely")).click();

		Thread.sleep(4000);
		
		driver.quit();
		
	}

}
