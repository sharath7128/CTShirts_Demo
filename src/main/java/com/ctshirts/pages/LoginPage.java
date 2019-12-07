package com.ctshirts.pages;

import com.ctshirts.base.Page;

public class LoginPage  extends Page{

	
	
	public void Login(String username,String password){
		
		type("email_CSS",username);
		type("password_CSS",password);
		click("signbtn_CSS");
				
	}
	
	
	public void gotoMyAccountPage(){
		
		
	}
	
	public void gotoFinance(){
		
		
	}
	
}
