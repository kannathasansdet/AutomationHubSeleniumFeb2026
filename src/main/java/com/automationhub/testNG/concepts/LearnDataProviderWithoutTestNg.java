package com.automationhub.testNG.concepts;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class LearnDataProviderWithoutTestNg {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys("koushik350@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Pass123$");
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click(); 
		System.out.println("Logged in successfully");
		driver.quit();
	}
}




