package org.test.com;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Iretry_Test {
	@Test
private void userNameValidation() {
	
		Assert.assertEquals('a', 'A');
		
}
	@Test
	private void userPasswordValidation() {
		
		Assert.assertEquals('B', 'B');
	
	}
}
