package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.TestBase.TestBase;


public class LoginPage extends TestBase{
	
	@FindBy(id = "ch_login_email")
	WebElement username;
	
	@FindBy(id = "ch_login_password")
	WebElement password;
	
	@FindBy(xpath = "//button[@id='ch_login_btn']")
	WebElement btnlogin;
	
	@FindBy(xpath = "//a[@id='ch_login_icon']")
	WebElement login_link;
	
	
	public LoginPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public void login(String username1 , String pass)  {
		try {

			login_link.click();
			username.sendKeys(username1);
			password.sendKeys(pass);

		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	
	public void submit() {
		 btnlogin.click();
		
	}
	
	public void loginPageTitleCheck() {
		String title = driver.getTitle();
		
		Assert.assertEquals("MakeMyTrip - #1 Travel Website 50% OFF on Hotels, Flights & Holiday", title);
	}
	
}
