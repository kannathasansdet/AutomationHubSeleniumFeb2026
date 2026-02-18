package com.automationhub.selenium.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDemo {
    public static void main(String[] args) throws InterruptedException {

        // Step 1: Launch the browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Step 2: Navigate to Amazon
        driver.get("https://www.amazon.in");

        // Step 3: Locate search box using XPath by attribute
        // Syntax: //tagname[@attribute='value']
        WebElement searchBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        searchBox.sendKeys("iPhone 15");

        // Step 4: Locate search button using XPath by contains()
        // Syntax: //tagname[contains(@attribute, 'value')]
        WebElement searchButton = driver.findElement(By.xpath("//input[contains(@id,'nav-search-submit-button')]"));
        searchButton.click();

        // Step 5: Wait for results to load
        Thread.sleep(3000);

        // Step 6: Locate a specific product using text()
        // Syntax: //tagname[text()='visible text']
        WebElement product = driver.findElement(By.xpath("//span[text()='Apple iPhone 15 (128 GB) - Blue']"));
        System.out.println("Product found: " + product.getText());

        // Step 7: Example of OR condition in XPath
        // Syntax: //tagname[@attr1='val1' or @attr2='val2']
        WebElement logo = driver.findElement(By.xpath("//a[@id='nav-logo-sprites' or @aria-label='Amazon']"));
        System.out.println("Logo displayed: " + logo.isDisplayed());

        // Step 8: Example of XPath with hierarchy (Parent → Child)
        // Syntax: //parentTag/childTag
        WebElement parentChildExample = driver.findElement(By.xpath("//div[@id='nav-search']//input[@type='text']"));
        parentChildExample.clear();
        parentChildExample.sendKeys("Samsung Galaxy S24");

        Thread.sleep(2000);
        driver.quit();
    }
}
