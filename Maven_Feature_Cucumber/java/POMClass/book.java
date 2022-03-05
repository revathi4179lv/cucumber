package POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class book {
	public WebDriver driver;
	@FindBy(id="first_name")
	private WebElement fname;
	public book(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getFname() {
		return fname;
	}
	public void setFname(WebElement fname) {
		this.fname = fname;
	}
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getLname() {
		return lname;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCredit() {
		return credit;
	}
	public WebElement getCctype() {
		return cctype;
	}
	public WebElement getMonth() {
		return month;
	}
	public WebElement getYear() {
		return year;
	}
	public WebElement getCvv() {
		return cvv;
	}
	public WebElement getBookn() {
		return bookn;
	}
	@FindBy(id="last_name")
	private WebElement lname;
	@FindBy(id="address")
private	WebElement address;
	@FindBy(xpath="(//input[@type='text'])[13]")
	private WebElement credit;
	@FindBy(id="cc_type")
	private WebElement cctype;
	@FindBy(id="cc_exp_month")
private WebElement month;
	@FindBy(id="cc_exp_year")
	private WebElement year;
	@FindBy(id="cc_cvv")
	private WebElement cvv;
	@FindBy(id="book_now")
	private WebElement bookn;
	

































}
