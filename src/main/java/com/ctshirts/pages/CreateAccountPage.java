package com.ctshirts.pages;

import java.util.Hashtable;

import com.ctshirts.base.Page;

public class CreateAccountPage extends Page {
	
	public void createAccount(Hashtable<String,String> data){
		click("myAccountLink_xpath");
		click("creataccountnowbtn_xpath");
		click("titleMr_xpath");
		type("firstname_id",data.get("FirstName"));
		type("lastname_id", data.get("LastName"));
		type("email_id",data.get("email"));
		type("password_id",data.get("pwd"));
	}
}
