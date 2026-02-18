package com.automationhub.selenium.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmAlertCommand {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://letcode.in/alert");

		driver.manage().window().maximize();

		// To click the alert button

		driver.findElement(By.id("confirm")).click();

	
		Alert alert = driver.switchTo().alert();
		
		
		Thread.sleep(10000);

		
		alert.dismiss();

		// To get the text from alert

		
		Thread.sleep(10000);
		
		driver.close();

	}

}
