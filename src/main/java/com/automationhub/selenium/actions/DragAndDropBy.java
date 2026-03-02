package com.automationhub.selenium.actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragAndDropBy {

    public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        // Implicit wait (still present, but explicit wait is preferred for specific elements)
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.globalsqa.com/demo-site/draggableboxes/");

        // Explicit wait for the iframe to be present
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement iframe = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//iframe[@class='demo-frame']")));

        // Switch the driver's context to the iframe
        driver.switchTo().frame(iframe);

        // Explicit wait for the draggable element to be visible within the iframe
        WebElement draggable = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("draggable")));

        Actions op = new Actions(driver);

        // Perform the drag and drop action
        op.dragAndDropBy(draggable, 100, 0).perform();

        Thread.sleep(7000); // Just to see the result

        driver.quit();
    }
}