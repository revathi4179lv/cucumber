package com.TestNG;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IretryAnalayzer_Concept {
	//if testcase is failed becz of server problem so re-execute the process by using IretryAnalayzer 
	//here create new class for that class implements the IretryAnalayzer. re-run the methods.  
	@Test
	public void login() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/autoComplete.html");
		driver.manage().window().maximize();
		WebElement text = driver.findElement(By.id("tags"));
		text.sendKeys("s");
		Thread.sleep(2000);
		List<WebElement> orderopt = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"));
		int size = orderopt.size();
	
		System.out.println(size);
		for (WebElement elem : orderopt) {
			if (elem.getText().equalsIgnoreCase("selenium")) {
				elem.click();
				System.out.println("element is clicked");
				break;
			}
		}	
	}
	@Test
	public void login2() {
		String actual="revathi";
		String expect="revathi1";
				Assert.assertEquals(actual, expect);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
