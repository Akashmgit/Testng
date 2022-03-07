package org.test.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert {
	@Test
private void data() {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Akash Blaze\\eclipse-workspace\\TestNgProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		String actualTitle= driver.getTitle();
		System.out.println(actualTitle);
		
		String ExceptedTitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		System.out.println(ExceptedTitle);
		
		SoftAssert s= new SoftAssert();
		s.assertEquals(actualTitle, ExceptedTitle);
}
}

//it will pass the method even if the Excepted title is wrong
