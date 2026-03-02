package com.automationhub.selenium.javascriptExecutor;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSClickExample {
    public static void main(String[] args) {
    	
        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/buttons");

        WebElement doubleClickBtn = driver.findElement(By.id("doubleClickBtn"));

        // Create JavaScript Executor
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Perform click using JS
        js.executeScript("arguments[0].click();", doubleClickBtn);

        System.out.println("✅ Button clicked using JavaScript!");

        driver.quit();
    }
}
