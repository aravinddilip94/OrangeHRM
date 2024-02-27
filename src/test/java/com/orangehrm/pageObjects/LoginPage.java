package com.orangehrm.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
		
	@FindBy(xpath="//input[@placeholder='Username']")
	@CacheLookup
	WebElement txtUserName;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(xpath="//button[normalize-space()='Login']")
	@CacheLookup
	WebElement btnLogin;
	
	
	@FindBy(xpath="/html/body/div[3]/div/ul/li[15]/a")
	@CacheLookup
	WebElement lnkLogout;
	
	@FindBy(xpath="//div[@class='oxd-alert-content oxd-alert-content--error']")
	@CacheLookup
	WebElement invalid;	
	
	
	
	public void setUserName(String uname)
	{
		txtUserName.sendKeys(uname);
	}
	
	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	
	
	public void clickSubmit()
	{
		btnLogin.click();
	}	
	
	public void clickLogout()
	{
		lnkLogout.click();
	}	
	public String invaliduser() 
	{
		
		return invalid.getText();
	}
	
}
		

	

	









