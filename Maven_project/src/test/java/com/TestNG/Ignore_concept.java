package com.TestNG;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_concept {
	@Test
	public void saree() {
		System.out.println("saree");

	}
	@Ignore
	@Test
	public void chudi() {
		System.out.println("Chudi");

	}
	@Test
	public void apple() {
		System.out.println("Apple");
		
	}
	@Test(enabled=false)
	public void mango() {
		System.out.println("Mango");
	}
	@Test
	public void laddu() {
		System.out.println("Laddu");
	}
	@Test
	public void gulab() {
		System.out.println("gulab");
		
	}
}
