package com.automationhub.selenium.fileUpload;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadExample {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Open a test page (you can use your actual upload page)
        driver.get("https://the-internet.herokuapp.com/upload");

        // Locate the file input element
        WebElement uploadElement = driver.findElement(By.id("file-upload"));

        // Provide the full file path to upload
        uploadElement.sendKeys("C:\\Users\\priya\\eclipse-workspace\\UIAutomationSeleniumOct2025\\QED_Full_Page_Screenshot.png");

        // Click the submit button
        driver.findElement(By.id("file-submit")).click();

        Thread.sleep(7000);

        // Verify upload success
        String uploadedFileName = driver.findElement(By.id("uploaded-files")).getText();
        
        Thread.sleep(7000);
        System.out.println("Uploaded file: " + uploadedFileName);

        driver.quit();
    }
}
