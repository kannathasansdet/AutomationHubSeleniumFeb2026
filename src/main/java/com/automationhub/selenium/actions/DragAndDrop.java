package com.automationhub.selenium.actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragAndDrop {

    public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        // Implicit wait (still present, but explicit wait is preferred for specific elements)
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.globalsqa.com/demo-site/draganddrop/");

        // Explicit wait for the iframe to be present
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
       
        WebElement iframe = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//iframe[@class='demo-frame']")));

        // Switch the driver's context to the iframe
        driver.switchTo().frame(iframe);

        // Explicit wait for the source element to be visible
        WebElement source = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt=\"The peaks of High Tatras\"]")));

        // Explicit wait for the target element to be visible
        WebElement targetPlace = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("trash")));

        Actions op = new Actions(driver);

        // Perform the drag and drop action
        op.dragAndDrop(source, targetPlace).perform();

        Thread.sleep(2000); // Just to see the result

        // Switch back to the main content (optional)
        driver.switchTo().defaultContent();

        Thread.sleep(2000);

        driver.quit();
    }
}