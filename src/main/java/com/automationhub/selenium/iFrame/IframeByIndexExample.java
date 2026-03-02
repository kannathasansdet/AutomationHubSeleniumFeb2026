package com.automationhub.selenium.iFrame;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;

public class IframeByIndexExample {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/iframe");

        driver.manage().window().maximize();

        // The iframe on this page has no name or ID, so switch using index
        driver.switchTo().frame(0);

        // Interact with element inside iframe
        WebElement textArea = driver.findElement(By.id("tinymce"));
        textArea.clear();
        
        Thread.sleep(7000);
        
        textArea.sendKeys("Hello from Selenium inside iframe!");

        // Switch back to main page
        driver.switchTo().defaultContent();

        System.out.println("Text entered inside iframe successfully.");

        driver.quit();
    }
}
