package com.automationhub.selenium.windowHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;
import java.util.Set;
import java.util.Iterator;

public class WindowHandlingExample {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            driver.manage().window().maximize();
            driver.get("https://the-internet.herokuapp.com/windows");

            // Save the parent window handle
            String parentHandle = driver.getWindowHandle();
            System.out.println("Parent handle: " + parentHandle);

            // Click the link that opens a new window
            WebElement clickHere = driver.findElement(By.linkText("Click Here"));
            clickHere.click();

            // Wait for the new window (total windows = 2)
            wait.until(ExpectedConditions.numberOfWindowsToBe(2));

            // Get all handles and switch to the one that is not parent
            Set<String> allHandles = driver.getWindowHandles();
            String childHandle = null;
            for (String handle : allHandles) {
                if (!handle.equals(parentHandle)) {
                    childHandle = handle;
                    break;
                }
            }

            // Switch to child window and interact
            driver.switchTo().window(childHandle);
            System.out.println("Switched to child window: " + childHandle);
            String heading = driver.findElement(By.tagName("h3")).getText();
            System.out.println("Child window heading: " + heading);

            // Close child
            driver.close();

            // Switch back to parent
            driver.switchTo().window(parentHandle);
            System.out.println("Back to parent. Title: " + driver.getTitle());

        } finally {
            // Clean up
            driver.quit();
        }
    }
}
