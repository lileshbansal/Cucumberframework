package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.TestBase.TestBase;

public class HomePage extends TestBase{

	@FindBy(id = "header_tab_hotels")
	WebElement hotelsLink;

	@FindBy(id = "header_tab_holidays")
	WebElement holidaysLink;
	
public HomePage() {
		
		PageFactory.initElements(driver, this);
	}

	public void navigate_to_url(String url) {

		switch (url) {
			case "Hotels": {
				hotelsLink.click();
				break;
			}
			case "Holidays": {
				holidaysLink.click();
				break;
			}
		}
	}
}
