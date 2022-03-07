import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simple_Annotation {
	
	@BeforeSuite
	private void setUp() {
     System.out.println("setUp");
	}
	@BeforeTest
	private void browserLaunch() {
		System.out.println("browserLaunch");

	}
	@BeforeClass
	private void enterUrl() {
		System.out.println("enterUrl");
	}
	@BeforeMethod
	private void login() {
		System.out.println("login");
		

	}
	@Test
	private void serchLaptop() {
		System.out.println("searchLaptop");
	   

	}
	@Test
	private void searchWatch() {
		System.out.println("searchWatch");

	}
	@AfterMethod
	private void verifyHomepage() {
		System.out.println("verifyHomepage");

	}
	@AfterClass
	private void logOut() {
		System.out.println("logOut");
		
	}
	@AfterTest
	private void closeBrower() {
		System.out.println("closeBrowser");

	}
	@AfterSuite
	private void deleteCookies() {
		System.out.println("Delete all cookies");
	}
	
	
	
	
	
	

}
