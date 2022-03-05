package com.TestNG;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterized_concept {

	@Test
	@Parameters({"username", "password"})
	public void login(@Optional("honey")String username,String password  ) {
		System.out.println("....................................");
		System.out.println("parameterized_Concept");
		System.out.println(username);
		System.out.println(password);
		System.out.println("......................................");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
