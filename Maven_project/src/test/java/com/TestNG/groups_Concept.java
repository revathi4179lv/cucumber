package com.TestNG;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class groups_Concept {
	@Test(groups="dress")
	public void saree() {
		System.out.println("saree");

	}
	@Test(groups="dress")
	public void chudi() {
		System.out.println("Chudi");

	}
	@Test(groups="fruits")
	public void apple() {
		System.out.println("Apple");
		
	}
	@Test(groups="fruits")
	public void mango() {
		System.out.println("Mango");
	}
	@Test(groups="sweet")
	public void laddu() {
		System.out.println("Laddu");
	}
	@Test(groups="sweet")
	public void gulab() {
		System.out.println("gulab");
		
	}


}
