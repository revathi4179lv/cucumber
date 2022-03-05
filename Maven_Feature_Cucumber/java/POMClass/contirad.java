package POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class contirad {
	public WebDriver driver;
	@FindBy(xpath="//input[@type='radio']")
	private WebElement radc;
	public contirad(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getRadc() {
		return radc;
	}
	@FindBy(id="continue")
	private WebElement cont;
	public WebElement getCont() {
		return cont;
	}
	
	
	
	
	
	
	
	
	
	
}
