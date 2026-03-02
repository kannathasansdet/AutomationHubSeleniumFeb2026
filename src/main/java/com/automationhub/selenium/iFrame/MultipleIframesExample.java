package com.automationhub.selenium.iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleIframesExample {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Frames.html");

        driver.manage().window().maximize();

        // Click the "Iframe with in an Iframe" tab
        driver.findElement(By.xpath("//a[contains(text(),'Iframe with in an Iframe')]")).click();

        // Switch to outer iframe
        WebElement outerFrame = driver.findElement(By.xpath("//*[@id='Multiple']/iframe"));
        driver.switchTo().frame(outerFrame);

        // Switch to inner iframe
        WebElement innerFrame = driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
        driver.switchTo().frame(innerFrame);

        // Type text inside the inner iframe input box
        WebElement inputBox = driver.findElement(By.xpath("//input[@type='text']"));
        inputBox.sendKeys("Nested iframe test!");
        
        Thread.sleep(7000);
        
        driver.switchTo().parentFrame();
        
        String value = driver.findElement(By.xpath("/html/body/section/div/div/h5")).getText();

        System.out.println(value);
       
        // Switch back to default content
        driver.switchTo().defaultContent();
        
        Thread.sleep(7000);
        
        driver.findElement(By.linkText("Home")).click();
        
        Thread.sleep(7000);

        System.out.println("Successfully handled multiple nested iframes.");

        driver.quit();
    }
}
