package com.StepDefinitions;

import com.Pages.HotelsPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HotelsStep {
	HotelsPage hotelsPage;
	
	@Given("^user is on hotels page$")
	public void user_is_on_hotels_page() {
		hotelsPage = new HotelsPage();
	}

	
	@Then("^click on search$")
	public void click_on_search(){
		
		hotelsPage.clickonSubmit();
	}
}
