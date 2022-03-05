package com.TestNG;

import org.testng.annotations.Test;

public class Priority_InnovationCount_Concept {
	//priority will be -ve , 0, +ve
	//didnot give priority value means it ill print alphabetic order
	//test behave like main method
	//invocation count- if u assign invocation count to method, multiple times print the method
	@Test(priority = -1)
	public void login() {
		System.out.println("login the hotel");

	}
	
	@Test(priority = 0)
	public void contiueSearch() {
		System.out.println("Search Next Hotel");

	}
	@Test(invocationCount = 3)
	public void saerchHotel() {
		System.out.println("search the hotel ");

	}

	@Test
	public void bookNow() {
		System.out.println("Now Book the Hotel");
	}


}
