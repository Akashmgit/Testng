package org.test.com;

import org.testng.annotations.Test;

public class Grouping_Test {
	@Test(groups = "Company Details")
	private void empId() {
	System.out.println("12345");
}
	@Test(groups = "Company Details")
	private void empName() {
		System.out.println("akash");
	}
	@Test(groups = "Personal Details")
	private void personalAdd() {
		System.out.println("chennai");
	}
	@Test(groups = "Personal Details")
	private void personalNo() {
		System.out.println("8248866577");
	}
	@Test(groups = "Bank Details")
	private void bankaccNo() {
		System.out.println("45356787654897");

	}
	@Test(groups = "Bank Details")
	private void bankPass() {
		System.out.println("26468342874");
	}
	
}



//After test add this in groups.xml

//<groups>
//<run>
//<include name="Company Details"></include>
//<include name="Personal Details"></include>
//<exclude name="Bank Details"></exclude>
//</run>
//</groups>