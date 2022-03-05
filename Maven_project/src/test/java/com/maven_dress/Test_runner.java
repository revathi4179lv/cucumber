package com.maven_dress;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.Maven_project.BaseClass;
import com.properties1.File_Reader_Manager1;
import com.spd.Po_Manager;


public class Test_runner extends BaseClass {
	public static WebDriver driver=browserLaunch("chrome");
	public static Po_Manager po=new Po_Manager(driver);
	
	public static void main(String[] args) throws InterruptedException, IOException   {
		String url = File_Reader_Manager1.getInstanceFRM().getInstanceCr().geturl();
		getUrl(url);
		waitMethod();
		
		clickMethod(po.getInstancelg().getSignin());
		
		String username = File_Reader_Manager1.getInstanceFRM().getInstanceCr().getusername();
		sendKeysMethod(po.getInstancest().getUsername(), username);
			
		String pass = File_Reader_Manager1.getInstanceFRM().getInstanceCr().getpassword();
		sendKeysMethod(po.getInstancest().getPassword(), pass);
			
		clickMethod(po.getInstancest().getSubmit());
		
		
		clickMethod(po.getInstancesl().getDresssele());
		
		String cmove = File_Reader_Manager1.getInstanceFRM().getInstanceCr().getcmove();
		
		keyMouseEvent(po.getInstancecs().getCausaldres(), cmove);
		String cclick = File_Reader_Manager1.getInstanceFRM().getInstanceCr().getcclick();
		keyMouseEvent(po.getInstancecs().getCausaldres(), cclick);
		
		
		String pmove = File_Reader_Manager1.getInstanceFRM().getInstanceCr().getpmove();
		keyMouseEvent(po.getInstanceps().getPdress(), pmove);
		String pclick = File_Reader_Manager1.getInstanceFRM().getInstanceCr().getpclick();
		keyMouseEvent(po.getInstanceps().getPdress(), pclick);
		
		
		driver.switchTo().frame(0);
		WebElement addtocart = driver.findElement(By.xpath("(//button[@class='exclusive'])"));
		JavascriptExecutor j=(JavascriptExecutor) driver;
		j.executeScript("arguments[0].click();",addtocart);
		driver.switchTo().defaultContent();
		
			
		scrollUpDownClick(po.getInstancept().getProceed());
		
			
		scrollUpDownClick(po.getInstances().getSumm());
		
		
		//j.executeScript("window.scrollBy(0,2000);");
		scrollUpDown();
		scrollUpDownClick(po.getInstances().getAddresss());
		
	
		clickMethod(po.getInstances().getCheck());
		
		//j.executeScript("window.scrollBy(0,2000);");
		scrollUpDown();
		scrollUpDownClick(po.getInstances().getAgree());
		
		clickMethod(po.getInstances().getBankwire());
		
		clickMethod(po.getInstances().getConfirm());


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
}