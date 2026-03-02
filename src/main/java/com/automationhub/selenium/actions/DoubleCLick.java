package com.automationhub.selenium.actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleCLick {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_ondblclick");

		driver.switchTo().frame("iframeResult");

		WebElement dc = driver.findElement(By.xpath("//p[contains(text(),'paragraph')]"));

		Actions actionRef = new Actions(driver);
		
		actionRef.doubleClick(dc).perform();
		
		Thread.sleep(5000);

		driver.close();

	}

}
