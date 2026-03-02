package com.automationhub.selenium.fileUpload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class FileUploadRobotExample {
    public static void main(String[] args) throws AWTException, InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/howto/howto_html_file_upload_button.asp");

        // Click the custom upload button
        driver.findElement(By.cssSelector("input[type='file']")).click();

        // Prepare file path
        StringSelection filePath = new StringSelection("C:\\\\Users\\\\priya\\\\eclipse-workspace\\\\UIAutomationSeleniumOct2025\\\\Software Testing.png");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filePath, null);

        // Use Robot to paste and hit Enter
        Robot robot = new Robot();
        robot.delay(1000);

        // Press Ctrl + V
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        // Press Enter
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        System.out.println("File uploaded successfully!");
        driver.quit();
    }
}
