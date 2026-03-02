package com.automationhub.selenium.windowHandling;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.WebElement;


public class WindowHandlingDemo {
    public static void main(String[] args) throws InterruptedException {

        // Step 1: Launch the browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Step 2: Open main page
        driver.get("https://opensource-demo.orangehrmlive.com/");
        System.out.println("Main window title: " + driver.getTitle());

        // Store the main window handle
        String parentWindow = driver.getWindowHandle();

     // ✅ Use Explicit Wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement orangeHrmLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@href,'orangehrm.com')]")));

        orangeHrmLink.click();

        // Step 4: Get all window handles
        Set<String> allWindows = driver.getWindowHandles();

        // Step 5: Switch to the new window
        for (String windowHandle : allWindows) {
            if (!windowHandle.equals(parentWindow)) {
                driver.switchTo().window(windowHandle);
                System.out.println("Switched to new window: " + driver.getTitle());
                Thread.sleep(2000);

                // Perform actions in the new window
                driver.findElement(By.xpath("//button[text()='Contact Sales']")).click();
                Thread.sleep(2000);

                // Close the child window
                driver.close();
                System.out.println("Closed child window");
            }
        }

        // Step 6: Switch back to parent window
        driver.switchTo().window(parentWindow);
        System.out.println("Back to main window: " + driver.getTitle());

        // Step 7: Close the main window
        driver.quit();
    }
}
