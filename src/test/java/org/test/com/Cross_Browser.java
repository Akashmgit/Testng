package org.test.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Cross_Browser {
@Test
private void amazon() {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\Akash Blaze\\eclipse-workspace\\TestNgProject\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
}
@Test
private void flipKart() {
	System.setProperty("webdriver.edge.driver", 
			"C:\\Users\\Akash Blaze\\eclipse-workspace\\TestNgProject\\driver\\msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	driver.get("https://www.flipkart.com/");
	
}
}
