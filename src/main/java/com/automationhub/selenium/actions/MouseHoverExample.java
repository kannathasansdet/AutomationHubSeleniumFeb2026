package com.automationhub.selenium.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverExample {
    public static void main(String[] args) throws InterruptedException {
    	
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.ajio.com/");
        
        driver.manage().window().maximize();
        
        // Create Actions object
        Actions actions = new Actions(driver);
                
        // Find the menu element
        WebElement menu = driver.findElement(By.xpath("//span[text()='MEN']"));
        
        // Hover over the element
        actions.moveToElement(menu).perform();
        
        Thread.sleep(2000);
        
        // Now click on submenu that appeared after hover
        WebElement subMenu = driver.findElement(By.xpath("//div[@class='column column-2']//a[@aria-label='Jackets & Coats'][normalize-space()='Jackets & Coats']"));
        actions.moveToElement(subMenu).click().perform();
        
        Thread.sleep(7000);
        
        driver.quit();
    }
}