package com.automationhub.selenium.waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class FacebookImplicitWaitExample {
	
    public static void main(String[] args) {
        
        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        // Open Facebook
        driver.get("https://www.facebook.com");
        
        driver.manage().window().maximize();
        
        // Set Implicit Wait - applies to all elements
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Locate elements (Selenium waits up to 10 seconds for each)
        WebElement emailField = driver.findElement(By.name("email"));
        emailField.sendKeys("testuser@example.com");

        WebElement passwordField = driver.findElement(By.name("pass"));
        passwordField.sendKeys("fakepassword123");

        WebElement loginButton = driver.findElement(By.xpath("//div[@class='x1ja2u2z x78zum5 x2lah0s x1n2onr6 xl56j7k x6s0dn4 xozqiw3 x1q0g3np x972fbf x10w94by x1qhh985 x14e42zd x9f619 xtvsq51 xqbgfmv xbe3n85 x7a1id4 x1d9i5bo x1xila8y x1bumbmr xc8cyl1']//div[@class='html-div xdj266r xat24cr xexx8yu xyri2b x18d9i69 x1c1uobl x6s0dn4 x78zum5 xl56j7k x1e0frkt xf0ucvx xx2axb6']"));
        loginButton.click();

      

        // Close the browser
        driver.quit();
    }
}
