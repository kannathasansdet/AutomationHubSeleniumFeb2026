package com.automationhub.selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(4000);
		
		driver.manage().window().minimize();
		
		Thread.sleep(4000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		driver.manage().window().fullscreen();
		
		Thread.sleep(4000);
		
		WebElement emailTextbox = driver.findElement(By.id("email"));
		
		emailTextbox.sendKeys("Kannathasan");
		
		Thread.sleep(4000);

		emailTextbox.clear();
		
		Thread.sleep(4000);

		WebElement forgotPassowrdtext = driver.findElement(By.linkText("Forgotten password?"));
		
		System.out.println(forgotPassowrdtext.getText());
		
		Thread.sleep(4000);
		
		String pageSourceValue = driver.getPageSource();
		
		System.out.println(pageSourceValue);

		
		
		driver.close();
		

	}

}
