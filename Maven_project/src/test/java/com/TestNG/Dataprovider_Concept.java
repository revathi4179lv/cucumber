package com.TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider_Concept {
	
	@Test(dataProvider="inputData")
	public void studentdet(String student, int mark) {
	
		System.out.println("enter name:"+student);
		System.out.println("enter mark:"+mark);
		
	}
	@DataProvider
	public Object[][] inputData() {
		return new Object[][] {
			{"suja",98},
			{"dheja",89},
			{"dheshana",78}
		};
	}

}
