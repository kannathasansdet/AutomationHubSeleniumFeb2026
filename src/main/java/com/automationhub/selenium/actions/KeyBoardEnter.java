package com.automationhub.selenium.actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyBoardEnter {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.google.com");
		
		driver.findElement(By.name("q")).sendKeys("phone",Keys.ENTER);

	}

}
