package org.test.com;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Paramaterized_Test {
	@Test
	@Parameters({"empName" , "empId"})
private void credential(String empName , int empId) {
	System.out.println("Employee Name is : " +empName);
	System.out.println("Employee Id is : "+empId);

}
}


//if given empname is wrong we can use @ optional
//example
//private void credential(@optional("Akib")String empName , int empId)