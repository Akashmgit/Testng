package org.test.com;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider {
	@Test(dataProvider = "testData")
	private void credential(String empName , int empId) {
		System.out.println("Employee Name is : " +empName);
		System.out.println("Employee Id is : "+empId);

	}
	
	@DataProvider
	private Object[][] testData() {
		return  new Object[][] {{"akash",7689},
			                   {"sagi",4897},
		                       {"blaze",6543 }
			
			
			
		};
		

	}
}
