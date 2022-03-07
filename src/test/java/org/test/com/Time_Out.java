package org.test.com;

import org.testng.annotations.Test;

public class Time_Out {
	@Test
	private void login() {
		System.out.println("Login the page");

	}
	@Test(timeOut=3000)
	private void logout() throws InterruptedException {
		//Thread.sleep(5000);                                 //syso should less than time out
		System.out.println("Logout the page");

	}
}
