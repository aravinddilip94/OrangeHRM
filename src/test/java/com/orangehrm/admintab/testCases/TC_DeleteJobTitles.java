package com.orangehrm.admintab.testCases;

import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.orangehrm.pageObjects.AdminPage;
import com.orangehrm.pageObjects.JobTitlesPage;
import com.orangehrm.pageObjects.LoginPage;
import com.orangehrm.testCases.BaseClass;

import junit.framework.Assert;

public class TC_DeleteJobTitles extends BaseClass {

	//File uploadFile;
	
	@Test
	public void DeleteJobTitle() throws IOException, InterruptedException 
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
		
		JobTitlesPage jt=new JobTitlesPage(driver);
		jt.JobTab();
		
		jt.JobTitle();
		logger.info("Clicked on Jobtitle");
		
		jt.Jobdelete();
		logger.info("Clicked on delete button");
		
		Thread.sleep(1000);
		
		jt.Jobdeleteyes();
		Thread.sleep(1000);
		
		
		
		
		if(jt.SaveSuccessfullyMSG())
		{
			String actualMessage=jt.SaveSuccessfully();
			Assert.assertTrue(actualMessage.contains("Success"));
			
		}
		else
		{
			Assert.assertTrue(false);
			captureScreen(driver,"AddJobTitle");
		}
		
		
		
		
		
		
	}
		
}
