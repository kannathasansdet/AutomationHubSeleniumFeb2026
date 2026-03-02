package com.automationhub.selenium.waits;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertExample {
    public static void main(String[] args) {
       
        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Open test site
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        // Locate the button that triggers an alert
        WebElement jsAlertButton = driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));

        // Click the button to trigger alert
        jsAlertButton.click();

        // Create an Explicit Wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Wait until alert is present
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        
        // Once alert appears, switch to it
        System.out.println("Alert text: " + alert.getText());

        // Accept (OK) the alert
        alert.accept();

        System.out.println("✅ Alert accepted successfully!");

        // Close browser
        driver.quit();
    }
}
