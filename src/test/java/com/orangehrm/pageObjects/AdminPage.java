package com.orangehrm.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage {

WebDriver ldriver;
	
	public AdminPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(linkText="Admin")
	@CacheLookup
	WebElement adminbtn;
	
	@FindBy(xpath="//button[normalize-space()='Add']")
	@CacheLookup
	WebElement addbtn;
	
	
	public void AdminTab()
	{
		adminbtn.click();	
	}
	
	
	
	public void adduser()
	{
		addbtn.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
