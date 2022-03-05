package com.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Assert_Concept {
	
@Test
	public void hardAssert() {
	
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\lenovo\\eclipse-workspace\\Maven_project\\driver1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		String Title="W3Schools Online Web Tutorials";
		String title2 = driver.getTitle();
		System.out.println("HardAssert");
		Assert.assertEquals(Title, title2);
		System.out.println("Validation");
	
	}

	@Test
	public void softAssertConcept() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\lenovo\\eclipse-workspace\\Maven_project\\driver1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		String Title="W3Schools Online Web Tutorials";
		String title2 = driver.getTitle();
		System.out.println("SoftAssert");
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(Title, title2);
		System.out.println("Verification");
	
}

}
