package com.automationhub.testNG.concepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionExample {

    @Test
    public void loginTest() {
        String expectedTitle = "Home - MyApp";
        String actualTitle = "Home - MyApp";

        System.out.println("Step 1: Launch App");
        System.out.println("Step 2: Enter username and password");
        
        // Hard assertion – test stops here if it fails
        Assert.assertEquals(actualTitle, expectedTitle, "Page title mismatch!");

        System.out.println("Step 3: Verify profile picture"); // This will NOT execute
    }
    
    @Test
    public void faceBookLaunchPage() {
    	
    	WebDriver driver = new ChromeDriver();

		// 2️⃣ Maximize the browser window
		driver.manage().window().maximize();

		// 3️⃣ Open a website (navigate to URL)
		driver.get("https://www.facebook.com");

		// 4️⃣ Print the title of the current page
		System.out.println("Page Title: " + driver.getTitle());

		String ExpectedTitle = "Facebook";
		String ActualTitle = driver.getTitle();

		Assert.assertEquals(ActualTitle, ExpectedTitle);

		// 5️⃣ Close the browser window
		driver.quit();
	
}    		
}
