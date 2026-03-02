package com.automationhub.testNG.concepts;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;


public class LearnDataProviderBefore {
	
	public static WebDriver driver;

	@BeforeMethod
	public void browserSetup() {

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();


	}
	@Test
	public void loginPostive() throws InterruptedException {

		driver.findElement(By.name("email")).sendKeys("koushik350@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Pass123$");
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click(); 
		System.out.println("Logged in successfully");

	}

	@Test
	public void loginNegative() throws InterruptedException {

		driver.findElement(By.name("email")).sendKeys("koushik35011@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Pass567$");
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click(); 
		System.out.println("Logged in successfully");

	}

	@BeforeMethod
	public void browserEnds() {
		driver.quit();
	}
}




