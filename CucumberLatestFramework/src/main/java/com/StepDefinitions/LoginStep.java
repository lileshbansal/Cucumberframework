package com.StepDefinitions;

import com.Pages.LoginPage;
import com.TestBase.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class LoginStep{
	LoginPage loginpage;
	TestBase testBase;
	
	
	@Given("^user is on login page$")
	public void user_is_on_login_page() {
		loginpage = new LoginPage();
		loginpage.loginPageTitleCheck();
	}

	@When("^user enters username and password$")
	public void user_enters_username_and_password(){
		
		loginpage.login("lilesh","12345");
	}

	@When("^user clicks submit button$")
	public void user_clicks_submit_button() {
		loginpage.submit();
	}

	@When("^user is on home page$")
	public void user_is_on_home_page()  {
		loginpage.homePageTitleCheck();
	}
}
