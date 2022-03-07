package org.test.com;

import org.testng.annotations.Test;

public class Exception_Test {
	@Test	
	private void add() {
	int i=10;
	int j=20;
	System.out.println("add:"+(i+j));
	
}
		@Test(expectedExceptions = ArithmeticException.class)  //if you dont know what exception simply use Exception.class
private void divide() {
	int i=10;
	int j=0;
	System.out.println("div :"+(i/j));
}
}
