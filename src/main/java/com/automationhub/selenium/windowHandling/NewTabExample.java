package com.automationhub.selenium.windowHandling;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTabExample {
	
    public static void main(String[] args) throws InterruptedException {

        // Launch browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Open first site in main tab
        driver.get("https://www.google.com");
        System.out.println("Opened first tab: " + driver.getTitle());

        // Open new tab using Selenium 4 feature
        driver.switchTo().newWindow(WindowType.TAB);

        // Navigate to another site
        driver.get("https://www.selenium.dev");
        System.out.println("Opened second tab: " + driver.getTitle());

        // Pause to see the action
        Thread.sleep(3000);

        // Switch back to the first tab
        for (String windowHandle : driver.getWindowHandles()) {
            driver.switchTo().window(windowHandle);
            if (driver.getTitle().contains("Google")) {
                System.out.println("Switched back to Google tab");
                break;
            }
        }

        Thread.sleep(2000);
        driver.quit();
    }
}
