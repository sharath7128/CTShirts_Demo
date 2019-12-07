package com.ctshirts.myaccount;

import java.util.Hashtable;

import org.testng.annotations.Test;

import com.ctshirts.pages.CreateAccountPage;
import com.ctshirts.uitils.Utilities;

public class CreateAccount {
	
	@Test(dataProviderClass=Utilities.class,dataProvider="dp")
	public void createAccountTest(Hashtable<String,String> data){
		
		CreateAccountPage cap = new CreateAccountPage();
		cap.createAccount(data);
		
		
	}

}
