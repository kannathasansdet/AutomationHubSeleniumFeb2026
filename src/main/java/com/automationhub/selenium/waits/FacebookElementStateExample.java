package com.automationhub.selenium.waits;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookElementStateExample {
    public static void main(String[] args) {
        
        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

     // Step 1: Open the W3Schools form page
        driver.get("https://www.w3schools.com/html/html_forms.asp");

        // Step 2: Switch into the iframe containing the form example
        driver.switchTo().frame(driver.findElement(By.id("iframeResult")));

        // Step 3: Locate elements
        WebElement firstName = driver.findElement(By.id("fname"));
        WebElement lastName = driver.findElement(By.id("lname"));
        WebElement submitBtn = driver.findElement(By.xpath("//input[@type='submit']"));

        // Step 4: Check element states
        System.out.println("=== isDisplayed() ===");
        System.out.println("First name field displayed? " + firstName.isDisplayed());
        System.out.println("Last name field displayed? " + lastName.isDisplayed());
        System.out.println("Submit button displayed? " + submitBtn.isDisplayed());

        System.out.println("\n=== isEnabled() ===");
        System.out.println("First name field enabled? " + firstName.isEnabled());
        System.out.println("Submit button enabled? " + submitBtn.isEnabled());

        // Step 5: Interact if enabled
        if (firstName.isEnabled()) {
            firstName.sendKeys("Kannathasan");
        }

        if (lastName.isEnabled()) {
            lastName.sendKeys("E");
        }

        // Step 6: Submit the form
        submitBtn.click();

        // Close browser
        driver.quit();
    }
}
