package com.automationhub.testNG.concepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class LearnDataProvider {

	//	@Parameters({"emailId"})
	@Test(dataProvider = "logintestdata", 
			dataProviderClass = DataUtils.class)
	public void login(String emailId,String password) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys(emailId);
		driver.findElement(By.id("pass")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click(); 
		System.out.println("Logged in successfully");
		String title =
				driver.getTitle();
		System.out.println("Title is "+title) ;

		driver.quit();

	}

}
