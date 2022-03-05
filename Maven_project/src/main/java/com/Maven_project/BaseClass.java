package com.Maven_project;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	public static WebDriver driver;
	public static WebDriver browserLaunch(String name) {
		if (name.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\eclipse-workspace\\Maven_project\\driver1\\chromedriver.exe");
			 driver=new ChromeDriver();
			driver.manage().window().maximize();
		}
		else if (name.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\lenovo\\eclipse-workspace\\Maven_project\\Driver\\chromedriver.exe");
			 driver=new ChromeDriver();
			driver.manage().window().maximize();
		}
		else if (name.equalsIgnoreCase("InternetExplorer")) {
			System.setProperty("webdriver.internetexplorer.driver", "C:\\Users\\lenovo\\eclipse-workspace\\Maven_project\\Driver\\chromedriver.exe");
			 driver=new ChromeDriver();
			driver.manage().window().maximize();
		}
		return driver;
		}
	//close
	public static void closeTab() {
		driver.close();
	}
	//quit
	public static void quitBrowser() {
		driver.quit();
	}
	//navigate to
	public static void navigateNextPageTo(String url) {
		driver.navigate().to(url);
	}
	//navigateBack
	public static void navigateBackPage() {
		driver.navigate().back();
	}
	//navigateForward
	public static void navigateNextPage() {
		driver.navigate().forward();
	}
	//navigate refresh
	public static void navigateIsRefresh() {
		driver.navigate().refresh();
	}
	//get
	public static void getUrl(String url) {
		driver.get(url);
	}
	//Alert
	public static void alertPage(WebElement element, String type, String input) {
		if (type.equalsIgnoreCase("accept")) {
			Alert simpleAlert = driver.switchTo().alert();
			simpleAlert.accept();
		}
		else if (type.equalsIgnoreCase("dismiss")) {
			Alert simpleAlert = driver.switchTo().alert();
			simpleAlert.dismiss();
		}
		else if (type.equalsIgnoreCase("sendkeys")) {
			Alert prompt = driver.switchTo().alert();
			prompt.sendKeys(input);
		}
		else if (type.equalsIgnoreCase("gettext")) {
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			System.out.println(text);
		}
		}
	
	public static void isTextEnable(WebElement element) {
		boolean enabled = element.isEnabled();
		System.out.println(enabled);
	}
	public static void isCheckSelected(WebElement element) {
		boolean selected = element.isSelected();
		System.out.println(selected);
	}
	public static void istextDisplayed(WebElement element) {
		boolean displayed = element.isDisplayed();
		System.out.println(displayed);
	}
	//Action
	public static void keyMouseEvent(WebElement element, String type) {
		
		Actions ac=new Actions(driver);
		if (type.equalsIgnoreCase("click")) {
			ac.click(element).build().perform();
		}
		else if (type.equalsIgnoreCase("Movetoelement")) {
			ac.moveToElement(element).build().perform();
		}
		else if (type.equalsIgnoreCase("rightclick")) {
			ac.contextClick(element).build().perform();
		}
		else if (type.equalsIgnoreCase("doubleclick")) {
			ac.doubleClick(element).build().perform();
		}
	}
	public static void keyMouseEvent(WebElement element, WebElement element1) {
		Actions ac=new Actions(driver);
			ac.dragAndDrop(element, element1).build().perform();
		}
	
	//Robot
	public static void robotKeyEventDown() throws AWTException {
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	}
	public static void robotKeyEventEnter() throws AWTException {
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	//DropDown
	public static void dropDownSelectMethod(WebElement element, String type, String name) {
		Select s=new Select(element);
		if (type.equalsIgnoreCase("value")) {
			s.selectByValue(name);
		}
		else if (type.equalsIgnoreCase("visibleText")) {
			s.selectByVisibleText(name);
		}
		else if (type.equalsIgnoreCase("index")) {
			s.selectByIndex(Integer.parseInt(name));
		}
	}
	public static void dropDownDeselectMethod(WebElement element, String type, String name) {
		Select s=new Select(element);
		if (type.equalsIgnoreCase("Value")) {
			s.deselectByValue(name);
		}
		else if (type.equalsIgnoreCase("visibletext")) {
			s.deselectByVisibleText(name);
		}
		else if (type.equalsIgnoreCase("index")) {
			s.deselectByIndex(Integer.parseInt(name));
		}

	}
	//ismultiple Method=MultiDropDown
	public static void isMultiDropMethod(WebElement element) {
		Select s=new Select(element);
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
	}
	//getOptions
	public static void getOptionMethod(WebElement element) {
		Select s=new Select(element);
		List<WebElement> options = s.getOptions();
		for (WebElement alloptions : options) {
			String text = alloptions.getText();
			System.out.println(text);
		}
	}
	//getfirstSelectedOption
	public static void getTheFirstSelectedOption(WebElement element) {
		Select s=new Select(element);
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		String text = firstSelectedOption.getText();
		System.out.println(text);
	}
	//getallSelected options
	public static void getAllTheSelectedOptions(WebElement element) {
		Select s=new Select(element);
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for (WebElement allselectOptions : allSelectedOptions) {
			String text = allselectOptions.getText();
			System.out.println(text);
		}
	}
	
	//gettitle
	public static void getTheTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	//getCurrent Url
	public static void getTheCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}
	//checkbox
		public static void checkboxMethod(WebElement element) {
			element.click();
		}
	//radiobutton
		public static void RadioButtonMethod(WebElement element) {
			element.click();
		}
	//sendkeys
		public static void sendKeysMethod(WebElement element, String input) {
			element.sendKeys(input);
		}
		//gettext
		public static void getTheText(WebElement element) {
			String text = element.getText();
			System.out.println(text);
		}
		//getAttribute
		public static void getTheAttribute(WebElement element, String type, String name) {
			if (type.equalsIgnoreCase("name")) {
				String attriname = element.getAttribute(name);
				System.out.println(attriname);
			}
			else if (type.equalsIgnoreCase("value")) {
				String attrivalue = element.getAttribute(name);
				System.out.println(attrivalue);
			}

		}
	//ScrollDown-ScrollUp
		public static void scrollUpDown() {
			JavascriptExecutor js=(JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,3000);");
			}
		public static void scrollIntoView(WebElement element) {
			JavascriptExecutor js=(JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", element);

		}
		public static void scrollUpDownClick(WebElement element) {
			JavascriptExecutor js=(JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", element);

		}
	//takesScreenShot
		public static void TakeTheScreenshot(String path) throws IOException {
			TakesScreenshot ts=(TakesScreenshot) driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File des=new File(path);
			FileUtils.copyFile(src, des);
			
		}
	//implicit wait
		public static void waitMethod() {
			try {
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			} catch (Exception e) {
				
			}
			
		}
	//explicit wait
		public static void expWaitMethod(WebElement element,String type) {
			WebDriverWait wait=new WebDriverWait(driver, 20);
			if (type.equalsIgnoreCase("visibleOfelement")) {
				wait.until(ExpectedConditions.invisibilityOf(element));	
			}
			else if (type.equalsIgnoreCase("elementtobeclickable")) {
				wait.until(ExpectedConditions.elementToBeClickable(element));
			}
				}
		//click
		public static void clickMethod(WebElement element) {
			element.click();
		}
		//frames
		public static void switchtoframeMethod(int index) {
			driver.switchTo().frame(index);

		}
		public static void switchtoinnerframe(String inorname) {
			driver.switchTo().frame(inorname);
		}
		public static void switchtoinframe(WebElement element) {
			driver.switchTo().frame(element);
		}
		public static void switchdefalut() {
			driver.switchTo().defaultContent();
		}
		public static void parentoutframe() {
			driver.switchTo().parentFrame();
		}
		//windowhandling
		public static void windowHandleMethod() {
			Set<String> windowHandles = driver.getWindowHandles();
			for (String multitab : windowHandles) {
				String title = driver.switchTo().window(multitab).getTitle();
				System.out.println(title);
			}

		}
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}