package com.automationhub.selenium.alert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowAuthenticationPopup {

	public static void main(String[] args) throws InterruptedException {

		//To launch the chrome driver

		/*
		 * https://the-internet.herokuapp.com/basic_auth
		 * driver.get("http://admin:admin@yoururl.com");
		 * 
		 * username:password@URL
		 */

		WebDriver driver = new ChromeDriver();

		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

		Thread.sleep(5000);

	}

}
