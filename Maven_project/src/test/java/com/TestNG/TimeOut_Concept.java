package com.TestNG;

import org.testng.annotations.Test;

public class TimeOut_Concept {

	@Test(timeOut=6000)
	public void project() throws InterruptedException {
		Thread.sleep(1000);
		System.out.println("setproperty");
		
		Thread.sleep(2000);
		System.out.println("browserLaunch");
		
		Thread.sleep(1000);
		System.out.println("getUrl");
	}
	
	
	
	
	
}
