package org.test.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel_Test {
	@Test
private void amazonTest() {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\Akash Blaze\\eclipse-workspace\\TestNgProject\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");

}
	@Test
	private void flipKartTest() {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Akash Blaze\\eclipse-workspace\\TestNgProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
	}
}
