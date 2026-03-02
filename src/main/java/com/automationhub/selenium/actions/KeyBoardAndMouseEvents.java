package com.automationhub.selenium.actions;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardAndMouseEvents {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://jqueryui.com/slider/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		 Actions action = new Actions(driver); 
		  
		  driver.switchTo().frame(0); 
		  
		  WebElement elem_slider = driver.findElement(By.cssSelector(".ui-slider-handle"));
		  
		  Thread.sleep(2000);
		  
		  action.clickAndHold(elem_slider).moveByOffset(40,0).release().perform();
		  
		  System.out.println("Drag & Drop test case successful\n"); Thread.sleep(3000);
	
		
		/*
		 * create an object for the Actions class and pass the driver argument Actions
		 * driver.navigate().to("https://jqueryui.com/slider/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		 * action = new Actions(driver); driver.switchTo().frame(0); WebElement
		 * elem_slider = driver.findElement(By.cssSelector(".ui-slider-handle"));
		 * Thread.sleep(2000);
		 * action.clickAndHold(elem_slider).moveByOffset(40,0).release().perform();
		 * 
		 * System.out.println("Drag & Drop test case successful\n"); Thread.sleep(3000);
		 */

		/*
		 * move to the element
		 * 
		 * driver.navigate().to("https://www.amazon.in/");
		 * driver.manage().window().maximize();
		 * 
		 * create an object for the Actions class and pass the driver argument Actions
		 * act = new Actions(driver);
		 * 
		 * WebElement menuSignIn = driver.findElement(By.id("icp-nav-flyout"));
		 * 
		 * act.moveToElement(menuSignIn).build().perform(); Thread.sleep(3000);
		 * 
		 * driver.close();
		 */

		// contextClick() Command - Example 2

		/*
		 * driver.get("https://play.letcode.in/contextmenu");
		 * driver.manage().window().maximize();
		 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); WebElement
		 * ele = driver.findElementByClassName("mat-list-item-content"); Actions builder
		 * = new Actions(driver); builder.contextClick(ele).perform(); // Right click
		 * driver.findElementByXPath("//button[.='Click me']").click(); Alert alt =
		 * driver.switchTo().alert(); System.out.println(alt.getText()); alt.accept();
		 * driver.quit();
		 */

		// doubleClick() Command (Two type any where we can Double click from specific
		// web element we can Double click)

		/*
		 * driver.navigate().to("https://unixpapa.com/js/testmouse.html");
		 * Thread.sleep(3000);
		 * 
		 * 
		 * create an object for the Actions class and pass the driver argument Actions
		 * action = new Actions(driver);
		 * 
		 * WebElement elem_clear =
		 * driver.findElement(By.xpath("//a[.='click here to clear']"));
		 * Thread.sleep(2000); elem_clear.click();
		 * 
		 * WebElement elem_test_btn =
		 * driver.findElement(By.xpath("//a[.='click here to test']"));
		 * Thread.sleep(2000); action.doubleClick(elem_test_btn).build().perform();
		 */

		// dragAndDrop() Command - Example 1

		/*
		 * driver.get(
		 * "http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		 * 
		 * WebElement source = driver.findElement(By.id("box1")); WebElement target =
		 * driver.findElement(By.id("box101"));
		 * 
		 * Actions actions = new Actions(driver);
		 * actions.dragAndDrop(source,target).build().perform();
		 */

		// dragAndDrop() Command - Example 2

		/*
		 * driver.get("https://jqueryui.com/droppable/");
		 * driver.manage().window().maximize();
		 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 * driver.switchTo().frame(0); WebElement source =
		 * driver.findElementById("draggable"); WebElement target =
		 * driver.findElementById("droppable"); Actions builder = new Actions(driver);
		 * // builder.dragAndDrop(source, target).perform();
		 * builder.clickAndHold(source).moveToElement(target).release().build().perform(
		 * );
		 */

		// dragAndDropBy() Command - Example 1

		/*
		 * 
		 * 
		 * driver.get("http://omayo.blogspot.com/p/page3.html");
		 * 
		 * WebElement minimumPriceOption =
		 * driver.findElement(By.xpath("//a[@aria-labelledby='price-min-label']"));
		 * 
		 * Actions actions = new Actions(driver);
		 * 
		 * actions.dragAndDropBy( minimumPriceOption, 150, 0).build().perform();
		 */

		// dragAndDropBy() Command - Example 2

		/*
		 * driver.get("https://jqueryui.com/draggable/");
		 * driver.manage().window().maximize();
		 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 * driver.switchTo().frame(0); WebElement ele =
		 * driver.findElement(By.id("draggable")); Actions builder = new
		 * Actions(driver); int x = ele.getLocation().getX(); int y =
		 * ele.getLocation().getY(); builder.dragAndDropBy(ele, x+70, y+90).perform();
		 */

		// keyDown() and keyUp() Commands

		/*
		 * WebElement compediumDevLink =
		 * driver.findElement(By.linkText("compendiumdev"));
		 * 
		 * Actions actions = new Actions(driver);
		 * 
		 * actions.moveToElement(compediumDevLink).keyDown(Keys.CONTROL).click().keyUp(
		 * Keys.CONTROL).build().perform();
		 * 
		 * 
		 */

		// sendKeys() Command of Actions Class -> (General SendKeys() command belongs to
		// webElement)

		/*
		 * driver.findElement(By.name("userid")).sendKeys("Kannathasan");
		 * 
		 * Actions actions = new Actions(driver);
		 * 
		 * actions.sendKeys(Keys.TAB).build().perform();
		 * 
		 * driver.findElement(By.name("pswrd")).sendKeys("SDETQA");
		 * 
		 * actions.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();
		 * 
		 */

		// build() and perform() Commands - When you are using single action use
		// perform() or build().perform() but when you are trying to perfom multiple
		// action u should use build().perform() not perform() alone.

		/*
		 * WebElement searchTextField = driver.findElement(By.name("q"));
		 * 
		 * searchTextField.sendKeys("kannathasan");
		 * 
		 * Actions actions = new Actions(driver);
		 * 
		 * actions.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();
		 */

		/*
		 * chord() Command
		 * 
		 * driver.get("http://omayo.blogspot.com/");
		 * 
		 * WebElement usernameField = driver.findElement(By.name("userid"));
		 * 
		 * usernameField.sendKeys("arun");
		 * 
		 * Thread.sleep(3000);
		 * 
		 * usernameField.sendKeys(Keys.chord(Keys.CONTROL,"z"));
		 * 
		 */

	}

}
