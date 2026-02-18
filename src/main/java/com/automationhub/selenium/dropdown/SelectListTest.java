package com.automationhub.selenium.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class SelectListTest {

	public static void main(String[] args) throws InterruptedException {

		// Creating instance of Chrome driver
		WebDriver driver = new ChromeDriver();

		// Step#2- Launching URL
		driver.get("https://www.selenium.dev/selenium/web/formPage.html");
    
        WebElement selectElement = driver.findElement(By.name("selectomatic"));
        Select select = new Select(selectElement);

        WebElement twoElement = driver.findElement(By.cssSelector("option[value=two]"));
        WebElement fourElement = driver.findElement(By.cssSelector("option[value=four]"));
        WebElement countElement = driver.findElement(By.cssSelector("option[value='still learning how to count, apparently']"));

        select.selectByVisibleText("Four");
        System.out.println(fourElement.isSelected());

        select.selectByValue("two");
        System.out.println(twoElement.isSelected());

        select.selectByIndex(3);
        System.out.println(countElement.isSelected());
    }


    }

