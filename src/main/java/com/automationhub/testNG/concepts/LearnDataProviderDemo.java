package com.automationhub.testNG.concepts;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LearnDataProviderDemo {


	@Test(dataProvider = "logintestdata")
	public void login(String emailId,String password) throws InterruptedException {

		//To launch the chrome driver
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys(emailId);
		driver.findElement(By.id("pass")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click(); 
		System.out.println("Logged in successfully");
		driver.quit();

	}
	 
	@DataProvider(name="logintestdata") 

	public String[][] getLoginData() {

		String[][] data1 = new String[4][2]; 

		data1[0][0]="kanna350@gmail.com";
		data1[0][1]="Pass123$";

		data1[1][0]="hari1@gmail.com"; 
		data1[1][1]="Pass123$";

		data1[2][0]="koushik1@gmail.com"; 
		data1[2][1]="6789";

		data1[3][0]="testing"; 
		data1[3][1]="Pass123$";

		return data1 ; 
	}





}