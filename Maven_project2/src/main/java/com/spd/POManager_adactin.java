package com.spd;

import org.openqa.selenium.WebDriver;

import POMClass.book;
import POMClass.login_Page;
import POMClass.mylit;
import POMClass.radioConti;
import POMClass.searchHotel;

public class POManager_adactin {
	public WebDriver driver;
	
	private login_Page log;
	
	public POManager_adactin(WebDriver driver2) {
		this.driver=driver2;
		
	}

	public login_Page getInstancelog() {
		if (log==null) {
			log=new login_Page(driver);
		}
		return log;
	}
	
	
	 private searchHotel sh;
	
	public searchHotel getInstancesh() {
		if(sh==null) {
			sh=new searchHotel(driver);
		}
		return sh;
	}
	
	
	private  radioConti rc;
	
	public radioConti getInstancerc() {
		if(rc==null) {
			rc=new radioConti(driver);
		}
		return rc;
	}
	
	
	private  book b;
	
	public book  getInstanceb() {
		if(b==null) {
			b=new book(driver);
		}
		return b;
	}
	
	
	private mylit my;
	
	public mylit  getInstancemy() {
		if(my==null) {
			my=new mylit(driver);
		}
		return my;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
