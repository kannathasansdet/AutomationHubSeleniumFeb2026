package com.automationhub.selenium.iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeExample {
    public static void main(String[] args) {
        
        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        try {
            // Open a webpage containing an iframe
            driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");

            // Maximize browser window
            driver.manage().window().maximize();

            // Switch to iframe using name or ID
            driver.switchTo().frame("iframeResult");

            // Locate the inner iframe element and switch again (nested iframe example)
            WebElement innerFrame = driver.findElement(By.tagName("iframe"));
            driver.switchTo().frame(innerFrame);

            // Interact with an element inside iframe (for example, get some text)
            WebElement heading = driver.findElement(By.tagName("h1"));
            System.out.println("Text inside iframe: " + heading.getText());

            // Switch back to parent frame
            driver.switchTo().parentFrame();

            // Or switch completely back to main page
            driver.switchTo().defaultContent();

            System.out.println("Switched back to main page successfully.");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
