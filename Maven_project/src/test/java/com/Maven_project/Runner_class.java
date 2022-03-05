package com.Maven_project;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.properties.Configuration_Reader;
import com.properties.File_Reader_Manager;
import com.spd.POManager_adactin;

import POMClass.book;
import POMClass.login_Page;
import POMClass.mylit;
import POMClass.radioConti;
import POMClass.searchHotel;


public class Runner_class extends BaseClass {
	public static WebDriver driver=browserLaunch("chrome");
	public static POManager_adactin pom=new POManager_adactin(driver);
	 
	public static void main(String[] args) throws IOException {

		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		waitMethod();
		
		
		String url = File_Reader_Manager.getInstanceFRM().getInstanceCr().getUrl();
		getUrl(url);
		
		String username = File_Reader_Manager.getInstanceFRM().getInstanceCr().getUsername();  
		sendKeysMethod(pom.getInstancelog().getUsername(), username);
		
		String password = File_Reader_Manager.getInstanceFRM().getInstanceCr().getPassword();
		sendKeysMethod(pom.getInstancelog().getPassword(), password);
		
		clickMethod(pom.getInstancelog().getClick());
		
		  
		 String location = File_Reader_Manager.getInstanceFRM().getInstanceCr().getLocation();
		dropDownSelectMethod(pom.getInstancesh().getLocation(), "value", location);
		
		String hotel = File_Reader_Manager.getInstanceFRM().getInstanceCr().getHotel();
		dropDownSelectMethod(pom.getInstancesh().getHotel(), "value", hotel);
		
		
		String room = File_Reader_Manager.getInstanceFRM().getInstanceCr().getroom();
		dropDownSelectMethod(pom.getInstancesh().getRoom(), "value", room);
		
		
		String nos = File_Reader_Manager.getInstanceFRM().getInstanceCr().getnos();	
		dropDownSelectMethod(pom.getInstancesh().getNos(), "value", nos);
		
		String from = File_Reader_Manager.getInstanceFRM().getInstanceCr().getfrom();
		sendKeysMethod(pom.getInstancesh().getFrom(), from);
		
		String to = File_Reader_Manager.getInstanceFRM().getInstanceCr().getto();
		sendKeysMethod(pom.getInstancesh().getTo(), to);
		
		String adultroom = File_Reader_Manager.getInstanceFRM().getInstanceCr().getadultroom();
		dropDownSelectMethod(pom.getInstancesh().getAdultroom(), "value", adultroom);
	
		String childroom = File_Reader_Manager.getInstanceFRM().getInstanceCr().getchildroom();
		 dropDownSelectMethod(pom.getInstancesh().getChildroom(), "value", childroom);
		
		clickMethod(pom.getInstancesh().getSubmit());
		
		 
		
		clickMethod(pom.getInstancerc().getRadiobut());
		
		clickMethod(pom.getInstancerc().getConti());
		
		 
		String firstname = File_Reader_Manager.getInstanceFRM().getInstanceCr().getFirstname();
		sendKeysMethod(pom.getInstanceb().getFname(), firstname);
		
		
		String lastname = File_Reader_Manager.getInstanceFRM().getInstanceCr().getLastname();
		sendKeysMethod(pom.getInstanceb().getLname(), lastname);
		
		
		String address = File_Reader_Manager.getInstanceFRM().getInstanceCr().getAddress();
		sendKeysMethod(pom.getInstanceb().getAddress(), address);
		
		String credit = File_Reader_Manager.getInstanceFRM().getInstanceCr().getcrdit();	
		sendKeysMethod(pom.getInstanceb().getCredit(), credit);
		
		String ctype = File_Reader_Manager.getInstanceFRM().getInstanceCr().getCredittype();		
		dropDownSelectMethod(pom.getInstanceb().getCctype(), "value", ctype);
	
		String month = File_Reader_Manager.getInstanceFRM().getInstanceCr().getmonth();
		dropDownSelectMethod(pom.getInstanceb().getMonth(), "value", month);
		
		String year = File_Reader_Manager.getInstanceFRM().getInstanceCr().getyear();
		dropDownSelectMethod(pom.getInstanceb().getYear(), "value", year);

		
		String cvv = File_Reader_Manager.getInstanceFRM().getInstanceCr().getcvv();
		sendKeysMethod(pom.getInstanceb().getCvv(), cvv);
	
		clickMethod(pom.getInstanceb().getBookn());
		
			
		
		
	//scrollIntoView(my.getItiner());
		//WebElement myiti = driver.findElement(By.xpath("(//input[@type='button'])[2]"));
	//clickMethod(my.getItiner());	
		clickMethod(pom.getInstancemy().getItiner());
	
		
		
//		TakesScreenshot ts=(TakesScreenshot) driver;
//		File screen = ts.getScreenshotAs(OutputType.FILE);
//		File des=new File("C:\\Users\\lenovo\\eclipse-workspace\\Selenium_Testing\\screenshot\\hotel.png");
//		FileUtils.copyFile(screen, des);
		TakeTheScreenshot("C:\\Users\\lenovo\\eclipse-workspace\\Maven_project\\screenshot\\app.png");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}