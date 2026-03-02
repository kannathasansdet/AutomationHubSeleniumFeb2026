package com.automationhub.selenium.windowHandling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingUsingIteratorDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();

		driver.get("http://omayo.blogspot.com/");

		driver.manage().window().maximize();

		String parentWindowHandle = driver.getWindowHandle();

		System.out.println("first Window: " + parentWindowHandle);

		driver.findElement(By.linkText("Open a popup window")).click();

		Thread.sleep(3000);

		Set<String> childwindows = driver.getWindowHandles();

		Iterator<String> itr = childwindows.iterator();

		while (itr.hasNext()) {

			String childwindow = itr.next();

			driver.switchTo().window(childwindow);

			if (driver.getTitle().equals("New Window")) {

				System.out.println("Title are Equal so test cases Passed");
				
				Thread.sleep(3000);
				
				String value = driver.findElement(By.xpath("//h3[text()='New Window']")).getText();

				System.out.println(value);

				driver.switchTo().window(parentWindowHandle);

				Thread.sleep(7000);

				driver.findElement(By.id("ta1")).sendKeys("Kannathasansdet");

				Thread.sleep(7000);

				driver.quit();
				
			} else {
				
				System.out.println("The Title were not equals so test case failed");

			}
		}
	}
}
