package com.automationhub.selenium.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class MultiSelectExample {

	public static void main(String[] args) throws InterruptedException {

		// Creating instance of Chrome driver
		WebDriver driver = new ChromeDriver();

		// Step#2- Launching URL
		driver.get("https://www.selenium.dev/selenium/web/formPage.html");
    
        WebElement selectElement = driver.findElement(By.name("multi"));
        Select select = new Select(selectElement);

        WebElement hamElement = driver.findElement(By.cssSelector("option[value=ham]"));
        WebElement gravyElement = driver.findElement(By.cssSelector("option[value='onion gravy']"));
        WebElement eggElement = driver.findElement(By.cssSelector("option[value=eggs]"));
        WebElement sausageElement = driver.findElement(By.cssSelector("option[value='sausages']"));

        List<WebElement> optionElements = selectElement.findElements(By.tagName("option"));
        List<WebElement> optionList = select.getOptions();

        List<WebElement> selectedOptionList = select.getAllSelectedOptions();
        List<WebElement> expectedSelection = new ArrayList<WebElement>() {{
            add(eggElement);
            add(sausageElement);
        }};

        select.selectByValue("ham");
        select.selectByValue("onion gravy");

        select.deselectByValue("eggs");
        select.deselectByValue("sausages");
    }

    }

