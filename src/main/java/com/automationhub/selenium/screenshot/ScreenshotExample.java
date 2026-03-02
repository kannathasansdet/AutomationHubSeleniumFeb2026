package com.automationhub.selenium.screenshot;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotExample {
    public static void main(String[] args) throws IOException {

        // Step 1: Launch browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Step 2: Open a website
        driver.get("https://www.google.com");

        // Step 3: Take screenshot and store it as a file
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        // Step 4: Define target location to save the screenshot
        File target = new File("C:\\Users\\priya\\eclipse-workspace\\UIAutomationSeleniumOct2025\\SeleniumScreenshots\\google_homepage.png");

        // Step 5: Copy file to destination
        FileHandler.copy(src, target);

        System.out.println("Screenshot captured successfully!");
        driver.quit();
    }
}
