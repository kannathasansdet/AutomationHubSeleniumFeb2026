package com.automationhub.selenium.screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

//https://www.qed42.com/insights/how-to-take-screenshots-in-selenium-4#:~:text=in%20Selenium%204%3F-,Element%20Screenshot,taking%20a%20screenshot%20of%20it.

public class FullPageScreenshot {

	public static void main(String[] args) throws IOException {

		WebDriver driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https:\\www.qed42.com");
		
		//QED_Full_Page_Screenshot.png takes a normal screenshot of the entire page from top to bottom and does not include the browser address bar.

		File source = ((FirefoxDriver) driver).getFullPageScreenshotAs(OutputType.FILE);
		
		FileHandler.copy(source, new File("QED_Full_Page_Screenshot.png"));

		////QED_Page_Screenshot.png consists of only visible parts of the web page.


		File source1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(source1, new File("QED_Page_Screenshot.png"));
	}
}

