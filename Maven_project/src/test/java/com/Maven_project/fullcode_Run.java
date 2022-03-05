package com.Maven_project;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import POMClass.login_Page;

public class fullcode_Run extends BaseClass {
	public static void main(String[] args) throws IOException {
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\lenovo\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		driver.get("http://adactinhotelapp.com/");
//		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//waitMethod();
		browserLaunch("chrome");
		getUrl("http://adactinhotelapp.com/");
		//WebElement username = driver.findElement(By.id("username"));
		//username.sendKeys("revathimuthu");
		login_Page log=new login_Page(driver);
		sendKeysMethod(log.getUsername(), "revathimuthu");
				
		//WebElement password = driver.findElement(By.id("password"));
		//password.sendKeys("revathi7");
		sendKeysMethod(log.getPassword(), "revathi7");
		
		WebElement login = driver.findElement(By.id("login"));
		//login.click();
		clickMethod(login);
		
		WebElement location = driver.findElement(By.id("location"));
		//Select s=new Select(location);
		//s.selectByValue("London");
		dropDownSelectMethod(location, "value", "London");
		
		WebElement hotel = driver.findElement(By.id("hotels"));
		//Select sel=new Select(hotel);
		//sel.selectByValue("Hotel Cornice");
		dropDownSelectMethod(hotel, "value", "Hotel Cornice");
		
		WebElement roomtype = driver.findElement(By.id("room_type"));
		//Select se=new Select(roomtype);
		//se.selectByValue("Double");
		dropDownSelectMethod(roomtype, "value", "Double");
				
		WebElement nos = driver.findElement(By.id("room_nos"));
		//Select st=new Select(nos);
		//st.selectByValue("2");
		dropDownSelectMethod(nos, "value", "2");
		
		WebElement from = driver.findElement(By.xpath("//input[@value='08/02/2022']"));
		//from.sendKeys("03/02/2022");
		sendKeysMethod(from, "08/02/2022");
		
		WebElement to = driver.findElement(By.xpath("//input[@value='09/02/2022']"));
		//to.sendKeys("04/02/2022");
		sendKeysMethod(to, "09/02/2022");
		
		WebElement adltroom = driver.findElement(By.id("adult_room"));
		//Select sl=new Select(adltroom);
		//sl.selectByValue("2");
		dropDownSelectMethod(adltroom, "value", "2");
		
		WebElement childroom = driver.findElement(By.id("child_room"));
		//Select sele =new Select(childroom);
		//sele.selectByValue("1");
		 dropDownSelectMethod(childroom, "value", "1");
		
		WebElement submit = driver.findElement(By.id("Submit"));
		//submit.click();
		clickMethod(submit);
		
		WebElement radiobut = driver.findElement(By.xpath("//input[@type='radio']"));
		//radiobut.click();
		clickMethod(radiobut);
		
		WebElement conti = driver.findElement(By.id("continue"));
		//conti.click();
		clickMethod(conti);
		
		WebElement firstname = driver.findElement(By.id("first_name"));
		//firstname.sendKeys("revathi");
		sendKeysMethod(firstname, "revathi");
		
		WebElement lastname = driver.findElement(By.id("last_name"));
		//lastname.sendKeys("muthu");
		sendKeysMethod(lastname, "muthu");
		
		WebElement address = driver.findElement(By.id("address"));
		//address.sendKeys("1, bigstrret,london");
		sendKeysMethod(address, "1, bigstrret,london");
		
		WebElement crditcrd = driver.findElement(By.xpath("(//input[@type='text'])[13]"));
		//crditcrd.sendKeys("1234567812345678");
		sendKeysMethod(crditcrd, "1234567812345678");
		
		WebElement cctype = driver.findElement(By.id("cc_type"));
		//Select sc=new Select(cctype);
		//sc.selectByValue("VISA");
		dropDownSelectMethod(cctype, "value", "VISA");
		
		WebElement expmonth = driver.findElement(By.id("cc_exp_month"));
		//Select sd=new Select(expmonth);
		//sd.selectByValue("3");
		dropDownSelectMethod(expmonth, "value", "3");
		
		WebElement ccyear = driver.findElement(By.id("cc_exp_year"));
		//Select sr=new Select(ccyear);
		//sr.selectByValue("2022");
		dropDownSelectMethod(ccyear, "value", "2022");
		
		WebElement cvv = driver.findElement(By.id("cc_cvv"));
		//cvv.sendKeys("1234");
		sendKeysMethod(cvv, "1234");
		
		WebElement book = driver.findElement(By.id("book_now"));
		//book.click();
		clickMethod(book);
		
		
		WebElement myiti = driver.findElement(By.xpath("(//input[@type='button'])[2]"));
		//myiti.click();
		scrollIntoView(myiti);
		clickMethod(myiti);
		
//		TakesScreenshot ts=(TakesScreenshot) driver;
//		File screen = ts.getScreenshotAs(OutputType.FILE);
//		File des=new File("C:\\Users\\lenovo\\eclipse-workspace\\Selenium_Testing\\screenshot\\hotel.png");
//		FileUtils.copyFile(screen, des);
		TakeTheScreenshot("C:\\Users\\lenovo\\eclipse-workspace\\Maven_project\\screenshot\\app.png");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
