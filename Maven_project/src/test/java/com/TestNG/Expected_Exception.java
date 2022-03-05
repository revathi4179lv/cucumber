package com.TestNG;

import org.testng.annotations.Test;

public class Expected_Exception {
	
	@Test(expectedExceptions = NullPointerException.class)
	public void nullecept() {
		String s=null;
		System.out.println(s.length());

	}
	
	
	
	
	

}
