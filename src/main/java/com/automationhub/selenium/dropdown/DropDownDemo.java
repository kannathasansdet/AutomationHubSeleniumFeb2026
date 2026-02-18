package com.automationhub.selenium.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/dropdowns");
		
		driver.manage().window().maximize();
		
		WebElement selectDropDown = driver.findElement(By.id("fruits"));
		
		Select s = new Select(selectDropDown);
		
		//s.selectByIndex(1);
		
		//s.selectByVisibleText("Pine Apple");
		
		//s.selectByValue("3");
		
		Thread.sleep(8000);
		
		driver.close();
		
		
	}

}
