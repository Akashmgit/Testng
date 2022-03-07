package org.test.com;

import org.testng.annotations.Test;

public class Priority_Test {
	
	@Test(priority = 2)
	private void search_Laptop() {
	System.out.println("Laptop");
	}	
	@Test(priority = -2)
	private void search_Tv() {
		System.out.println("TV");
	}
	@Test
	private void search_Speaker() {
		System.out.println("Speakers");
	}
	@Test(priority = -1)
	private void search_Games() {
		System.out.println("Games");

	}
	@Test(priority = 1)
	private void search_Phone() {
		System.out.println("Phones");

	}
	
}
