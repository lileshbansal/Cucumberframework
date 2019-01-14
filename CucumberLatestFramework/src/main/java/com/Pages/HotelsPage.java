package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.TestBase.TestBase;

public class HotelsPage extends TestBase{

	@FindBy(id = "hp-widget__sDest")
	WebElement city_dropdown;
	
	@FindBy(id = "hp-widget__chkIn")
	WebElement checkin;
	
	@FindBy(id = "hp-widget__chkOut")
	WebElement checkout;
	
	
	@FindBy(id = "hp-widget__paxCounter")
	WebElement rooms;
	
	@FindBy(id = "searchBtn")
	WebElement searchBtn;
	
	public HotelsPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public void enter_city() {
		city_dropdown.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.id("//ul[@id='ui-id-1']//span[text()='Mumbai, India']")).click();
		
	}
	
	public void clickonSubmit() {
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		searchBtn.click();
		
	}
	
	
}
