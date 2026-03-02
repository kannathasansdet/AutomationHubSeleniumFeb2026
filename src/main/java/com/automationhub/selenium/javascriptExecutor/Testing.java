package com.automationhub.selenium.javascriptExecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class Testing {
    public static void main(String[] args) {

	
	// Initialize WebDriver
    WebDriver driver = new ChromeDriver();

    // Open Facebook
    driver.get("https://www.hyrtutorials.com/p/basic-controls.html");

    // Maximize the window
    driver.manage().window().maximize();

    WebElement checkbox = driver.findElement(By.id("englishchbx"));
    
    JavascriptExecutor js = (JavascriptExecutor) driver;
  String text =  (String) js.executeScript("return arguments[0].nextSibling.textContent.trim();", checkbox);
    
    
    System.out.println(text);

}}

