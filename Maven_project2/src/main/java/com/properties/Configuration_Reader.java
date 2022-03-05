package com.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;



public class Configuration_Reader {
	
	public static Properties p;
	
	public Configuration_Reader() throws IOException {
		File f=new File("C:\\Users\\lenovo\\eclipse-workspace\\Maven_project\\src\\main\\java\\com\\properties\\configuration.properties");
		FileInputStream  fis=new FileInputStream(f);
		p=new Properties();
		p.load(fis);
		
	}
	
	public String getUrl() throws IOException {
		
		String url = p.getProperty("url");
		return url;
		
	}
	public String getUsername() {
        String username = p.getProperty("username");
        return username;
	}
	
	public String getPassword() {
		String password = p.getProperty("password");
		return password;
	}
	
	public String getLocation() {
		String location = p.getProperty("location");
		return location;
	}
	
	public String getHotel() {
		String hotel = p.getProperty("hotel");
		return hotel;
	}
	
	public String getroom() {
		String room = p.getProperty("room");
		return room;
	}
	
	
	public String getnos() {
		String nos = p.getProperty("nos");
		return nos;
	}
	
	public String getfrom() {
		String from = p.getProperty("from");
		return from;
	}
	
	public String getto() {
		String to = p.getProperty("to");
		return to;
	}
	
	public String getadultroom() {
		String adultroom = p.getProperty("adultroom");
		return adultroom;
	}
	
	public String getchildroom() {
		String childroom = p.getProperty("childroom");
		return childroom;
	}
	
	public String getFirstname() {
		String firstname = p.getProperty("firstname");
		return firstname;
	}
	
	
	public String getLastname() {
		String lastname = p.getProperty("lastname");
		return lastname;
	}
	
	public String getAddress() {
		String address = p.getProperty("address");
		return address;
	}
	
	public String getcrdit() {
		String credit = p.getProperty("credit");
		return credit;
	}
	
	public String getCredittype() {
		String ctype = p.getProperty("cctype");
		return ctype;
	}
	
	public String getmonth() {
		String month = p.getProperty("month");
		return month;
	}
	
	public String getyear() {
		String year = p.getProperty("year");
		return year;
	}
	
	
	public String getcvv() {
		String cvv = p.getProperty("cvv");
		return cvv;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
