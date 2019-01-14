package com.StepDefinitions;

import java.util.List;
import java.util.Map;

import com.Pages.HomePage;
import com.Pages.LoginPage;
import com.TestBase.TestBase;
import com.utils.utilities;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStep{
	LoginPage loginpage;
	TestBase testBase;
	HomePage homePage;
	List<Map<String, String>> data;
	
	
	
	@Given("^user is on login page$")
	public void user_is_on_login_page() {
		loginpage = new LoginPage();
		homePage = new HomePage();
		loginpage.loginPageTitleCheck();
	}

	@When("^user enters username and password$")
	public void user_enters_username_and_password(DataTable cred){
		data = utilities.getDataTableInfo(cred);
		loginpage.login(data.get(0).get("username"),data.get(0).get("password"));
	}

	@Then("^user clicks submit button$")
	public void user_clicks_submit_button() {
		loginpage.submit();
	}

		
	@Then("^click on Hotels icon$")
	public void click_on_Hotels_icon() {
		homePage.navigate_to_url("Hotels");
	}
	
	@Then("^click on Holidays icon$")
	public void click_on_Holidays_icon() {
		homePage.navigate_to_url("Holidays");
	}
}
