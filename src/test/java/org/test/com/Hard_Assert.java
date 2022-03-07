package org.test.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Hard_Assert {
	@Test
private void testAssert() {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\Akash Blaze\\eclipse-workspace\\TestNgProject\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	String actualTitle= driver.getTitle();
	System.out.println(actualTitle);
	
	String ExceptedTitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
	
	
	System.out.println(ExceptedTitle);
	Assert.assertTrue(1==1);
	
	//Different Methods
	//Assert.assertSame(actualTitle, ExceptedTitle);
		//Assert.assertNull(actualTitle, ExceptedTitle);
		//Assert.assertNotNull(actualTitle, ExceptedTitle);
	  //ect
		
}
}
