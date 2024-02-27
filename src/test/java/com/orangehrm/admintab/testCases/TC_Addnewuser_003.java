package com.orangehrm.admintab.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.orangehrm.pageObjects.AdminPage;
import com.orangehrm.pageObjects.LoginPage;
import com.orangehrm.testCases.BaseClass;

public class TC_Addnewuser_003 extends BaseClass{

	
	@Test
	public void AddnewSystemUser() throws IOException 
	{
		
		logger.info("URL is opened");
		
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Entered username");
		
		lp.setPassword(password);
		logger.info("Entered password");
		lp.clickSubmit();
		
		AdminPage ap=new AdminPage(driver);
		ap.AdminTab();
		ap.adduser();
		
		
		
		
		
	}
	
	
	
	
}
