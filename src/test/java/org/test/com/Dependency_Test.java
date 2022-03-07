package org.test.com;

import org.testng.annotations.Test;

public class Dependency_Test {
	@Test
private void school() {
	System.out.println("dhanish");

}
	@Test
	private void collage() {
		System.out.println("SRM");

	}
	@Test(dependsOnMethods = "school")
	private void highSec() {
		System.out.println("+2");

	}
}
