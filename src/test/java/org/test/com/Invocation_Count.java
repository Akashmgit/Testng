package org.test.com;

import org.testng.annotations.Test;

public class Invocation_Count {
	@Test
	private void search_Earphone() {
	System.out.println("Earphone_search");
}	@Test
	private void search_Dress() {
		System.out.println("Dress");

	}
	@Test
	private void search_Toys() {
		System.out.println("Toys");

	}
	@Test(invocationCount = 5)
	private void search_Mobiles() {
		System.out.println("Mobiles");

	}

}
