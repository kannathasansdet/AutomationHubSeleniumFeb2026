package com.automationhub.selenium.javascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSTextInputExample {
    public static void main(String[] args) {

    	WebDriver driver = new ChromeDriver();
    	
        driver.manage().window().maximize();        

        driver.get("https://www.facebook.com");

        WebElement emailField = driver.findElement(By.name("email"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        
        js.executeScript("arguments[0].value='kannathasane@gmail.com';", emailField);
        
        try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        System.out.println("✅ Email entered using JavaScript!");

        driver.quit();
    }
}
