package Pom_Dress;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class causal {
	public WebDriver driver;
	@FindBy(xpath="(//img[@class='replace-2x'])[1]")
	private WebElement causaldres;

	public causal(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

	public WebElement getCausaldres() {
		return causaldres;
	}
	
}
