package com.TestNG;

import org.testng.annotations.Test;

public class Dependency_Concept {
	@Test
	public void divide() {
		int a=10, b=2;
		int c=a/b;
		System.out.println(c);
		
	}
	@Test(dependsOnMethods = "divide")
	public void sub() {
		int a=10, b=3;
		int c=a-b;
		System.out.println(c);
			}
	
	@Test(dependsOnMethods ="add" )
	public void multi() {
		int a=5, b=5;
		int c=a*b;
		System.out.println(c);
	}
	
	@Test
	public void add() {
		int a=2, b=4;
		int c=a+b;
		System.out.println(c);
	}
	
	
	
}
