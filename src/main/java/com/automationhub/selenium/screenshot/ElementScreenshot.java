package com.automationhub.selenium.screenshot;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
public class ElementScreenshot {
    public static void main(String[] args) throws IOException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/");

        // ✅ Explicit wait for logo to be visible
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement logo = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//img[@alt=\"company-branding\"]")));

        // Take element screenshot

        File src = logo.getScreenshotAs(OutputType.FILE);
        File dest = new File("C:\\Users\\priya\\eclipse-workspace\\UIAutomationSeleniumOct2025\\SeleniumScreenshots\\orangehrm_logo.png");
        FileHandler.copy(src, dest);

        System.out.println("Element screenshot captured successfully!");
        driver.quit();
    }
}
