package com.automationhub.selenium.windowHandling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class NewWindowExample {
    public static void main(String[] args) throws InterruptedException {

        // Step 1: Launch the browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Step 2: Open the first website (Main window)
        driver.get("https://www.google.com");
        System.out.println("Main window title: " + driver.getTitle());

        // Store main window handle
        String parentWindow = driver.getWindowHandle();

        // Step 3: Open a new window (Selenium 4 feature)
        driver.switchTo().newWindow(WindowType.WINDOW);

        // Step 4: Navigate to another website in the new window
        driver.get("https://www.selenium.dev/");
        System.out.println("New window title: " + driver.getTitle());

        Thread.sleep(3000);

        // Step 5: Get all window handles
        Set<String> allWindows = driver.getWindowHandles();

        // Step 6: Switch back to parent window
        for (String windowHandle : allWindows) {
            if (!windowHandle.equals(parentWindow)) {
                // We are currently in new window
                driver.close(); // Close new window
                System.out.println("Closed new window");
            }
        }

        // Step 7: Switch back to parent window
        driver.switchTo().window(parentWindow);
        System.out.println("Back to main window: " + driver.getTitle());

        Thread.sleep(2000);
        driver.quit();
    }
}
