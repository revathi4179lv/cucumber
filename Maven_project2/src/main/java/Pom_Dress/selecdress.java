package Pom_Dress;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class selecdress {
	public WebDriver driver;
	
	@FindBy(xpath="(//a[text()='Dresses'])[2]")
	private WebElement dresssele;

	public selecdress(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getDresssele() {
		return dresssele;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
