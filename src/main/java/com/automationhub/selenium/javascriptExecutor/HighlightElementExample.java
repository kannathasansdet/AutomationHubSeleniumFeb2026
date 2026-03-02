package com.automationhub.selenium.javascriptExecutor;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HighlightElementExample {
	
    public static void main(String[] args) throws InterruptedException {

    	WebDriver driver = new ChromeDriver();
    	
        driver.manage().window().maximize();

        driver.get("https://www.google.com");

        WebElement searchBox = driver.findElement(By.name("q"));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Highlight the search box with red border
        js.executeScript("arguments[0].style.border='4px solid red'", searchBox);

        Thread.sleep(6000);
        
        String title = (String) js.executeScript("return document.title;");
        String url = (String) js.executeScript("return document.URL;");
        System.out.println("Title: " + title);
        System.out.println("URL: " + url);

        
        driver.quit();
    }
}
