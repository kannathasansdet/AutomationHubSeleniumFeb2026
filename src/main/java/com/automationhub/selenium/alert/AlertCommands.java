package com.automationhub.selenium.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertCommands {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("http://omayo.blogspot.com/");

		driver.manage().window().maximize();

		// To click the alert button

		WebElement promtButton = driver.findElement(By.id("prompt"));

		promtButton.click();

		Thread.sleep(5000);
		

		// Without handling the alert when you tring to print the current URL so you will be ended up with UnhandledAlertException

		// To move to the alert popup

		Alert alert = driver.switchTo().alert();
		// To get the text from alert
		Thread.sleep(5000);


		String prompttxt = alert.getText();

		System.out.println("The Prompt text is " + prompttxt);

		alert.sendKeys("Kanna");

		alert.accept();
		
		driver.close();

	}

}
