package Pom_Dress;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class printed {
	public WebDriver driver;
	@FindBy(xpath="(//img[@title='Printed Dress'])")
	private WebElement pdress;

	public printed(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

	public WebElement getPdress() {
		return pdress;
	}

	
}
