import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class IgnoreTest {
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
	private void searchPhone() {
		System.out.println("searchPhone");

	}
	@Ignore
	@Test
	private void serchSpeaker() {
		System.out.println("searchSpeaker");
	   

	}
	@Test(enabled=false)
	private void searchWatch() {
		System.out.println("searchWatch");

	}
	@Test
	private void searchBags() {
		System.out.println("searchBags");
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




//after class create method

//<method>
//<exclude>="method name"</exclude>
//</method>
