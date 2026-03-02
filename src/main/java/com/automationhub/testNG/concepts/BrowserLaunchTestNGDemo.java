package com.automationhub.testNG.concepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class BrowserLaunchTestNGDemo {

	@Test
	public void BrowserLaunch() {

		// 1️⃣ Create a new instance of ChromeDriver
		//    This automatically launches a new Chrome browser window
		WebDriver driver = new ChromeDriver();

		// 2️⃣ Maximize the browser window
		driver.manage().window().maximize();

		// 3️⃣ Open a website (navigate to URL)
		driver.get("https://www.facebook.com");

		// 4️⃣ Print the title of the current page
		System.out.println("Page Title: " + driver.getTitle());

		String ExpectedTitle = "Faceboo – log in or sign up";
		String ActualTitle = driver.getTitle();

		if(ExpectedTitle.equalsIgnoreCase(ActualTitle)) {
			
			System.out.println("TestCase Passed");

		} else {
			System.out.println("TestCase Failed");

		}

		// 5️⃣ Close the browser window
		driver.quit();
	}
}
