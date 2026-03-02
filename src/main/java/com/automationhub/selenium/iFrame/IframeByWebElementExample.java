package com.automationhub.selenium.iFrame;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeByWebElementExample {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/frames");

        driver.manage().window().maximize();

        // Locate the iframe using WebElement
       WebElement frameElement = driver.findElement(By.id("frame1"));

        // Switch to iframe
        driver.switchTo().frame(frameElement);

        // Get text inside iframe
        WebElement heading = driver.findElement(By.id("sampleHeading"));
        System.out.println("Text inside iframe: " + heading.getText());

        Thread.sleep(3000);
        
        // Switch back
        driver.switchTo().defaultContent();
        
        // Get text inside iframe
        WebElement maintxt = driver.findElement(By.xpath("//*[@id=\"framesWrapper\"]/h1"));
        System.out.println("Text inside main page: " + maintxt.getText());

        Thread.sleep(3000);

        driver.quit();
    }
}
