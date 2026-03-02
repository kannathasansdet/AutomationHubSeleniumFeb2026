package com.automationhub.selenium.waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class FacebookWaitExample {
    public static void main(String[] args) {
       
        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        // Open Facebook
        driver.get("https://www.facebook.com");

        // Maximize the window
        driver.manage().window().maximize();

        // Create an Explicit Wait (max 15 seconds)
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        // Wait until the email field is visible
        WebElement emailField = wait.until(
            ExpectedConditions.visibilityOfElementLocated(By.name("email"))
        );
        emailField.sendKeys("testuser@example.com");

        // Wait until the password field is visible
        WebElement passwordField = wait.until(
            ExpectedConditions.visibilityOfElementLocated(By.id("pass"))
        );
        passwordField.sendKeys("fakepassword123");

        // Wait until the login button is clickable
        WebElement loginButton = wait.until(
            ExpectedConditions.elementToBeClickable(By.name("login"))
        );
        loginButton.click();

        // Close the browser
        driver.quit();
    }
}
