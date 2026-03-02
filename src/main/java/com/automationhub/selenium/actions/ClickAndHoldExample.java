package com.automationhub.selenium.actions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.time.Duration;

public class ClickAndHoldExample {
    public static void main(String[] args) {
        // Initialize browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        try {
            // Open test page
            driver.get("https://demoqa.com/droppable");

            // Identify source and target elements
            WebElement source = driver.findElement(By.id("draggable"));
            WebElement target = driver.findElement(By.id("droppable"));

            // Create Actions instance
            Actions actions = new Actions(driver);

            // Perform drag & drop using clickAndHold + moveToElement + release
            actions.clickAndHold(source)
                   .pause(Duration.ofMillis(500))     // optional, for realism
                   .moveToElement(target)
                   .pause(Duration.ofMillis(500))
                   .release()
                   .build()
                   .perform();

            System.out.println("Drag and drop performed using clickAndHold!");

        } finally {
            driver.quit();
        }
    }
}
