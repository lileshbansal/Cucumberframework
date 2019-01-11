package com.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.TestBase.TestBase;


public class LoginPage extends TestBase{
	
	@FindBy(name = "username")
	WebElement username;
	
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(xpath = "//input[@type='submit']")
	WebElement btnlogin;
	
	public LoginPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public void login(String username1 , String pass)  {
		try {
			Thread.sleep(3000);
			username.sendKeys(username1);
			password.sendKeys(pass);
			
			//btnlogin.click();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void submit() {
		try {
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
			 js.executeScript("arguments[0].click();", btnlogin);
			 Thread.sleep(10000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void loginPageTitleCheck() {
		String title = driver.getTitle();
		Assert.assertEquals("#1 Free CRM software in the cloud for sales and service", title);
	}
	public void homePageTitleCheck() {
		String title = driver.getTitle();
		Assert.assertEquals("CRMPRO", title);
	}
}
