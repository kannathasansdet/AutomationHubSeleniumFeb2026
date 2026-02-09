package com.automationhub.selenium.locator;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLocatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		List<WebElement> allLinks = driver.findElements(By.tagName("a"));

		// Print the total number of links found on the page
		System.out.println("Total number of links on the Facebook page: " + allLinks.size());

		// Print the text of the first 5 links (for demo purpose)
		for (int i = 0; i < allLinks.size(); i++) {
			System.out.println("Link " + (i + 1) + ": " + allLinks.get(i).getText());
		}

	}

}
