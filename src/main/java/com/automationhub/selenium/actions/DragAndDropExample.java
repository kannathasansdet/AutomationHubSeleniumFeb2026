package com.automationhub.selenium.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;

public class DragAndDropExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");
        
        // Switch to frame if element is in iframe
        driver.switchTo().frame(0);
        
        Actions actions = new Actions(driver);
        
        // Find source and target elements
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));
        
        // Method 1: Using dragAndDrop
        actions.dragAndDrop(source, target).perform();
        
        Thread.sleep(9000);
        
        // Method 2: Using clickAndHold, moveToElement, release
		/*
		 * actions.clickAndHold(source) .moveToElement(target) .release() .perform();
		 */
        // Method 3: Drag and drop by offset (x, y coordinates)
       //actions.dragAndDropBy(source, 100, 200).perform();
        
        driver.quit();
    }
}