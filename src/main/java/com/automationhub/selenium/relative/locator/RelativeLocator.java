package com.automationhub.selenium.relative.locator;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RelativeLocator {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.linkedin.com/signup");

		// 1.above()

		WebElement linkedInPwd = driver.findElement(By.id("password"));

		WebElement linkedInEmail = driver.findElement(with(By.tagName("input")).above(linkedInPwd));

		linkedInEmail.sendKeys("Kannathasan@gmail.com");

		Thread.sleep(8000);



		// 2. below()

		WebElement linkedInEmailID = driver.findElement(By.name("email-or-phone"));

		WebElement linkedInPwdField = driver.findElement(with(By.tagName("input")).below(linkedInEmailID));


		linkedInPwdField.sendKeys("1234");



		Thread.sleep(8000);

		// 3. toLeftOf()

		WebElement rememberMetext =driver.findElement(By.xpath("//label[text()='Remember me']"));

		WebElement rememberMetextCheckBox = driver.findElement(with(By.tagName("input")).toLeftOf(rememberMetext));

		rememberMetextCheckBox.click();
		
		Thread.sleep(8000);



		// 4. toRightOf()

		WebElement alreadyOnLinkedInLabel1 = driver.findElement(By.xpath("//p[contains(text(),'Already on LinkedIn?')]"));

		WebElement signInLink1 =
				driver.findElement(with(By.tagName("a")).toRightOf(alreadyOnLinkedInLabel1));
		signInLink1.click();

		Thread.sleep(8000);


		//5. near()
	WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(50));
	
	WebElement checkBoxField = w.until(ExpectedConditions.visibilityOfElementLocated(By.id("remember-me-checkbox")));

	WebElement rememberMeLabel = driver.findElement(with(By.tagName("label")).near(checkBoxField));

	String rememberMetextValue = rememberMeLabel.getText();
		System.out.println(rememberMetextValue);  

		Thread.sleep(8000);

		
	


	}



}