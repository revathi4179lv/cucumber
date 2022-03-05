package POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_Page {
	public WebDriver driver;
	@FindBy(id="username")
	private WebElement username;

	public login_Page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="password")
	private WebElement password;
	
	
	public WebDriver getDriver() {
		return driver;
	}


	public WebElement getPassword() {
		return password;
	}


	public WebElement getUsername() {
		return username;
	}
	@FindBy(id="login")
	private WebElement click;

	public WebElement getClick() {
		return click;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
