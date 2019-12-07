package com.ctshirts.pages;

import org.openqa.selenium.By;

import com.ctshirts.base.Page;

public class HomePage extends Page {
	
	

	
	public void goToMyAccount(){
		
//		driver.findElement(By.cssSelector("//span[text()='My account']")).click();
		
		click("myAccountLink_xpath");
		
	}
	
	public void goToSignIn(){
		
		driver.findElement(By.cssSelector(".signup")).click();
	}
	
}
