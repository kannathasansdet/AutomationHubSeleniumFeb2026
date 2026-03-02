package com.automationhub.selenium.screenshot;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetScreenshotsSpecificElement {

	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();
		// Maximize the window
		driver.manage().window().maximize();

		driver.get("https://www.qed42.com/");


		WebElement elementLogo = driver.findElement(By.xpath("//a[@aria-label='home']//img[@title='QED42 Logo']"));

		File source = elementLogo.getScreenshotAs(OutputType.FILE);
		File dest = new File(System.getProperty("user.dir") +    "/screenshots/elementLogo.png");


		FileUtils.copyFile(source, dest);

		// close the current browser
		driver.quit();
	}

}
