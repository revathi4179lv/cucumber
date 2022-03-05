package Pom_Dress;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class summary {
	public WebDriver driver;
	
	@FindBy(xpath="//a[@class='button btn btn-default standard-checkout button-medium']")
	private WebElement summ;

	public summary(WebDriver driver2) {

	this.driver=driver2;
	PageFactory.initElements(driver, this);
	}

	public WebElement getSumm() {
		return summ;
	}
	
	@FindBy(xpath="//button[@name='processAddress']")
	private WebElement addresss;
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getAddresss() {
		return addresss;
	}

	public WebElement getAgree() {
		return agree;
	}

	public WebElement getCheck() {
		return check;
	}

	public WebElement getBankwire() {
		return bankwire;
	}

	public WebElement getConfirm() {
		return confirm;
	}

	@FindBy(xpath="//button[@name='processCarrier']")
	private WebElement agree;
	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement check;
	@FindBy(xpath="//a[@class='bankwire']")
	private WebElement bankwire;
	@FindBy(xpath="//button[@class='button btn btn-default button-medium']")
	private WebElement confirm;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
