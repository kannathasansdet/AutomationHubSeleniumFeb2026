package com.automationhub.selenium.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorDemo {

    public static void main(String[] args) throws InterruptedException {

        // 1️⃣ Launch Chrome browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 2️⃣ Open Facebook login page
        driver.get("https://www.facebook.com/");

        // 3️⃣ Locate Email field using CSS Selector by ID
        // Syntax: tagname#id OR #id
        WebElement emailField = driver.findElement(By.cssSelector("input#email"));
        emailField.sendKeys("testuser@example.com");

        // 4️⃣ Locate Password field using CSS Selector by attribute
        // Syntax: tagname[attribute='value']
        WebElement passwordField = driver.findElement(By.cssSelector("input[name='pass']"));
        passwordField.sendKeys("Test@123");

        // 5️⃣ Locate Login button using CSS Selector by class name
        // Syntax: tagname.classname OR .classname
        WebElement loginButton = driver.findElement(By.cssSelector("button[name='login']"));
        loginButton.click();

        // 6️⃣ Wait for few seconds to observe result
        Thread.sleep(3000);

        // 7️⃣ Print title after login attempt
        System.out.println("Page Title after login attempt: " + driver.getTitle());

        // 8️⃣ Close browser
        driver.quit();
    }
}
