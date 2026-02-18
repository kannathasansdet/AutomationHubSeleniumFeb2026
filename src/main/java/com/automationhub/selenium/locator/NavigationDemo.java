package com.automationhub.selenium.locator;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationDemo {
	
    public static void main(String[] args) throws InterruptedException {

        // Step 1: Launch the browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Step 2: Open the first website (Amazon)
        driver.get("https://www.amazon.in");
        System.out.println("Opened: " + driver.getTitle());
        System.out.println("The Current URL" + driver.getCurrentUrl());
        Thread.sleep(8000);

        // Step 3: Navigate to another website (Flipkart)
        driver.navigate().to("https://www.flipkart.com");
        System.out.println("Navigated to: " + driver.getTitle());
        System.out.println("The Current URL" + driver.getCurrentUrl());
        Thread.sleep(8000);

        // Step 4: Navigate back to Amazon
        driver.navigate().back();
        System.out.println("Back to: " + driver.getTitle());
        Thread.sleep(8000);

        // Step 5: Navigate forward to Flipkart again
        driver.navigate().forward();
        System.out.println("Forward to: " + driver.getTitle());
        Thread.sleep(8000);

        // Step 6: Refresh the current page
        driver.navigate().refresh();
        System.out.println("Page refreshed: " + driver.getTitle());
        Thread.sleep(8000);

        // Step 7: Close the browser
        driver.quit();
        System.out.println("Browser closed successfully!");
    }
}
