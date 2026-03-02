package com.automationhub.selenium.actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) {
		
		ChromeDriver driver= new ChromeDriver();

		driver.manage().window().maximize();

	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	    driver.get("https://www.ajio.com/");

		WebElement mouseOver = driver.findElement(By.xpath("//span[text()='MEN']"));

		WebElement mouseOverWomen = driver.findElement(By.xpath("//span[text()='WOMEN']"));

		//syntax
		
		Actions builder= new Actions(driver);
		
		//actions class important thing obj.method().perfrom()
		builder.moveToElement(mouseOver).perform();
		
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		builder.moveToElement(mouseOverWomen).perform();
		
		
		
	}

}
