package Pom_Dress;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class proceedto {
	public WebDriver driver;
	@FindBy(xpath="//a[@class='btn btn-default button button-medium']")
	private WebElement proceed;

	public proceedto(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
		
		// TODO Auto-generated constructor stub
	}

	public WebElement getProceed() {
		return proceed;
	}
	
}
