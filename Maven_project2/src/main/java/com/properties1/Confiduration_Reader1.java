package com.properties1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Confiduration_Reader1 {
	public static Properties p;
	public Confiduration_Reader1() throws IOException {
		File f=new File("C:\\Users\\lenovo\\eclipse-workspace\\Maven_project\\src\\main\\java\\com\\properties1\\confriguration.properties");
		FileInputStream fis=new FileInputStream(f);
		 p=new Properties();
		p.load(fis);
	}
	public String geturl() throws IOException {
		
		String url = p.getProperty("url");
		return url;
	}
	public String getusername() {
		String username = p.getProperty("username");
		return username;

	}
	public String getpassword() {
		String password = p.getProperty("password");
		return password;

	}
	public String getcmove() {
		String cmove = p.getProperty("causalmove");
		return cmove;

	}
	public String getcclick() {
		String cclick = p.getProperty("causalbut");
		return cclick;

	}
	public String getpmove() {
		String pmove = p.getProperty("pmove");
		return pmove;

	}
	public String getpclick() {
		String pclick = p.getProperty("pclick");
		return pclick;

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
