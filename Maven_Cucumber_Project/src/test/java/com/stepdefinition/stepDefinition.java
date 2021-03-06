package com.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.Maven_project.BaseClass;
import com.adactin.runner.Test_Runner;
import com.properties.File_Reader_Manager;
import com.spd.POManager_adactin;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDefinition extends BaseClass {
	
	
	public static WebDriver driver=Test_Runner.driver;
	
	public static POManager_adactin pom=new POManager_adactin(driver);
	            
	
	@Given("^user Enter The Url$")
	public void user_Enter_The_Url() throws Throwable {
		
		getUrl("http://adactinhotelapp.com/index.php");
	    
	}
	
	@When("^user Enter The \"([^\"]*)\" In Username Field$")
	public void user_Enter_The_In_Username_Field(String username) throws Throwable {
		sendKeysMethod(pom.getInstancelog().getUsername(), username);
	}


//	@When("^user Enter The Username In Username Field$")
//	public void user_Enter_The_Username_In_Username_Field() throws Throwable {
//		
//		sendKeysMethod(pom.getInstancelog().getUsername(), "revathimuthu");
//	    
//	}

	
	@When("^user Enter The \"([^\"]*)\" In The Password Field$")
	public void user_Enter_The_In_The_Password_Field(String password) throws Throwable {
		
		sendKeysMethod(pom.getInstancelog().getPassword(), password);
		
	}

//	
//	@When("^user Enter The Password In The Password Field$")
//	public void user_Enter_The_Password_In_The_Password_Field() throws Throwable {
//		
//		sendKeysMethod(pom.getInstancelog().getPassword(), "revathi7");
//	    
//	}

	@Then("^Click The Login And Navigates To Search Hotel Page$")
	public void click_The_Login_And_Navigates_To_Search_Hotel_Page() throws Throwable {
	    
		clickMethod(pom.getInstancelog().getClick());
		
	}

	
	@When("^user select the Loction In the Location Field$")
	public void user_select_the_Loction_In_the_Location_Field() throws Throwable {
	    
		dropDownSelectMethod(pom.getInstancesh().getLocation(), "value", "Brisbane");
		
	}

	@When("^User Select The Hotels In The Hotel Field$")
	public void user_Select_The_Hotels_In_The_Hotel_Field() throws Throwable {
	   
		dropDownSelectMethod(pom.getInstancesh().getHotel(), "value", "Hotel Cornice");
		
	}

	@When("^User Select The RoomType In Roomtype Field$")
	public void user_Select_The_RoomType_In_Roomtype_Field() throws Throwable {
		
		dropDownSelectMethod(pom.getInstancesh().getRoom(), "value", "Double");
		
	}

	
	@When("^User Select The No of Room In This Field$")
	public void user_Select_The_No_of_Room_In_This_Field() throws Throwable {
		
		dropDownSelectMethod(pom.getInstancesh().getNos(), "value", "2");		
		
	}

		
	@When("^user Select The Adult Per Room In AdaultperRoom Field$")
	public void user_Select_The_Adult_Per_Room_In_AdaultperRoom_Field() throws Throwable {
		
		dropDownSelectMethod(pom.getInstancesh().getAdultroom(), "value", "2");
	}
	
	@When("^user Select The Children Per Room In ChildrenPerRoom Field$")
	public void user_Select_The_Children_Per_Room_In_ChildrenPerRoom_Field() throws Throwable {
	  
		 dropDownSelectMethod(pom.getInstancesh().getChildroom(), "value", "1");
	}

	@Then("^user Click The Search Button And Its Navigates To Select Hotel Page$")
	public void user_Click_The_Search_Button_And_Its_Navigates_To_Select_Hotel_Page() throws Throwable {
	    
		clickMethod(pom.getInstancesh().getSubmit());
		
	}

	@When("^User Click The Radio Button In The Select Field$")
	public void user_Click_The_Radio_Button_In_The_Select_Field() throws Throwable {
	    
		clickMethod(pom.getInstancerc().getRadiobut());
		
	}

	@Then("^User Click The Continue Button And Navigates To Book A Hotel Page$")
	public void user_Click_The_Continue_Button_And_Navigates_To_Book_A_Hotel_Page() throws Throwable {
	    
		clickMethod(pom.getInstancerc().getConti());
		
	}

	@When("^user Must Enter The FirstName In The Name Field$")
	public void user_Must_Enter_The_FirstName_In_The_Name_Field() throws Throwable {
	    
		String firstname = File_Reader_Manager.getInstanceFRM().getInstanceCr().getFirstname();
		sendKeysMethod(pom.getInstanceb().getFname(), firstname);
			
	}

	@When("^user Must Enter The LastName In The LastName Field$")
	public void user_Must_Enter_The_LastName_In_The_LastName_Field() throws Throwable {
	    
		String lastname = File_Reader_Manager.getInstanceFRM().getInstanceCr().getLastname();
		sendKeysMethod(pom.getInstanceb().getLname(), lastname);
	}

	@When("^User Must Enter The Billing Address In Address Field$")
	public void user_Must_Enter_The_Billing_Address_In_Address_Field() throws Throwable {
	    
		String address = File_Reader_Manager.getInstanceFRM().getInstanceCr().getAddress();
		sendKeysMethod(pom.getInstanceb().getAddress(), address);
	}

	@When("^User Must CreditCard Number In The CreditCard Field$")
	public void user_Must_CreditCard_Number_In_The_CreditCard_Field() throws Throwable {
	    
		String credit = File_Reader_Manager.getInstanceFRM().getInstanceCr().getcrdit();	
		sendKeysMethod(pom.getInstanceb().getCredit(), credit);
		
	}

	@When("^user Select CreditCard Type In The Creditcardtype Field$")
	public void user_Select_CreditCard_Type_In_The_Creditcardtype_Field() throws Throwable {
	    
		String ctype = File_Reader_Manager.getInstanceFRM().getInstanceCr().getCredittype();		
		dropDownSelectMethod(pom.getInstanceb().getCctype(), "value", ctype);	
		
	}

	@When("^user Select Year And Month In The ExpiryDate Field$")
	public void user_Select_Year_And_Month_In_The_ExpiryDate_Field() throws Throwable {

		String month = File_Reader_Manager.getInstanceFRM().getInstanceCr().getmonth();
		dropDownSelectMethod(pom.getInstanceb().getMonth(), "value", month);
		
		String year = File_Reader_Manager.getInstanceFRM().getInstanceCr().getyear();
		dropDownSelectMethod(pom.getInstanceb().getYear(), "value", year);
	}

	@When("^user Enter cvvNumber In The Cvv Number Field$")
	public void user_Enter_cvvNumber_In_The_Cvv_Number_Field() throws Throwable {
	    
		String cvv = File_Reader_Manager.getInstanceFRM().getInstanceCr().getcvv();
		sendKeysMethod(pom.getInstanceb().getCvv(), cvv);		
		
	}

	@Then("^User Click The Book Button And Navigates to Booking Confirmaion Page$")
	public void user_Click_The_Book_Button_And_Navigates_to_Booking_Confirmaion_Page() throws Throwable {
	    
		clickMethod(pom.getInstanceb().getBookn());
		
	}

	@Then("^User Click The MyItinary In MyInTinary Button$")
	public void user_Click_The_MyItinary_In_MyInTinary_Button() throws Throwable {
	    
		clickMethod(pom.getInstancemy().getItiner());
		
		
	}



}
