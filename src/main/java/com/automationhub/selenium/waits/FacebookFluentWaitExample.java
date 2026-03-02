package com.automationhub.selenium.waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

public class FacebookFluentWaitExample {
    public static void main(String[] args) {
      
        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        // Open Facebook
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();

        // Configure Fluent Wait
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(20))       // Max wait time
                .pollingEvery(Duration.ofSeconds(2))       // Check every 2 seconds
                .ignoring(NoSuchElementException.class);   // Ignore missing element exceptions

        
        // Wait for the email field using custom condition
        WebElement emailField = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                WebElement element = driver.findElement(By.id("email"));
                if (element.isDisplayed()) {
                    System.out.println("Email field is visible!");
                    return element;
                } else {
                    return null;
                }
            }
        });
        emailField.sendKeys("testuser@example.com");

        // Wait for the password field
        WebElement passwordField = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                WebElement element = driver.findElement(By.id("pass"));
                if (element.isDisplayed()) {
                    return element;
                } else {
                    return null;
                }
            }
        });
        passwordField.sendKeys("fakepassword123");

        // Wait for login button
        WebElement loginButton = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                WebElement element = driver.findElement(By.name("login"));
                if (element.isEnabled()) {
                    return element;
                } else {
                    return null;
                }
            }
        });
        loginButton.click();

        // Pause to see result (optional)
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Close browser
        driver.quit();
    }
}
