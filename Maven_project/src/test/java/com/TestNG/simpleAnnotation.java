package com.TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class simpleAnnotation {
	//simple Annotation-@Before(Suite,Test, class, Method), @Test, @After(Method, class, Test, Suite)
	//@AfterSuite is print Separately bcz TestNG is works within AfterTest only
	@BeforeSuite
	public void propertsetting() {
		System.out.println("set the property");
	}
	@BeforeTest
	public void gettingurl() {
		System.out.println("get the url");

	}
	@BeforeClass
	@Parameters({"username", "password"})
	public void login(String username, String password) {
		System.out.println("parameterized cocept");
		System.out.println("login the hotel");
		System.out.println(username);
		System.out.println(password);
		System.out.println("..................................");

	}
	@BeforeMethod
	public void saerchHotel() {
		System.out.println("search the hotel ");

	}
	
	@Test
	public void bookNow() {
		System.out.println("Now Book the Hotel");
	}
	@AfterMethod
	public void contiueSearch() {
		System.out.println("Search Next Hotel");

	}
	@AfterClass
	public void logout() {
		System.out.println("logout");

	}
	@AfterTest
	public void homePage() {
		System.out.println("go to HomePage");

	}
	@AfterSuite
	public void quitBrowser() {
		System.out.println("Quit The Browser");

	}
	

}
