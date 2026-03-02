package com.automationhub.selenium.javascriptExecutor;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollExample {
    public static void main(String[] args) throws InterruptedException {

    	WebDriver driver = new ChromeDriver();
    	
        driver.manage().window().maximize();

        driver.get("https://www.w3schools.com/");

        // Create JavascriptExecutor instance
        JavascriptExecutor js = (JavascriptExecutor) driver;

        Thread.sleep(7000);

        // Scroll down by 1000 pixels
        js.executeScript("window.scrollBy(0,1000)");
        
        Thread.sleep(8000);
        
        // Scroll back up
        js.executeScript("window.scrollBy(0,-500)");

        Thread.sleep(9000);
        
        driver.quit();
    }
}
