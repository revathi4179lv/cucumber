package com.spd;

import org.openqa.selenium.WebDriver;


import Pom_Dress.causal;
import Pom_Dress.login;
import Pom_Dress.printed;
import Pom_Dress.proceedto;
import Pom_Dress.selecdress;
import Pom_Dress.submitt;
import Pom_Dress.summary;

public class Po_Manager {
	public WebDriver driver;
	private login lg;
	private submitt st;
	private selecdress sl;
	private causal cs;
	private summary s;
	private proceedto pt;
	
	private printed ps;
	public printed getInstanceps() {
		if (ps==null) {
			ps=new printed(driver);
		}
		return ps;
	}
	
	
	public Po_Manager(WebDriver driver2) {
		this.driver=driver2;
		// TODO Auto-generated constructor stub
	}

	public login getInstancelg() {
	if (lg==null) {
		lg=new login(driver);
	}
	return lg;
	}
	
	public submitt getInstancest() {
		if (st==null) {
			st=new submitt(driver);
		}
		return st;
		}
	
	public selecdress getInstancesl() {
		if (sl==null) {
			sl=new selecdress(driver);
		}
		return sl;
		}
	
	public causal getInstancecs() {
		if (cs==null) {
			cs=new causal(driver);
		}
	return cs;
	}
	
	public summary getInstances() {
		if (s==null) {
			s=new summary(driver);
			
		}
		return s;
	}
	
	public proceedto getInstancept() {
		if (pt==null) {
			pt=new proceedto(driver);
		}
		return pt;
	}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
