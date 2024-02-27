package com.orangehrm.admintab.testCases;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.orangehrm.pageObjects.AdminPage;
import com.orangehrm.pageObjects.JobTitlesPage;
import com.orangehrm.pageObjects.LoginPage;
import com.orangehrm.testCases.BaseClass;

import junit.framework.Assert;

public class TC_AddnewJobTitles extends BaseClass {

	//File uploadFile;
	
	@Test
	public void AddJobTitle() throws IOException, InterruptedException 
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
		jt.Add();
		logger.info("Clicked on Add");
		
		Thread.sleep(1500);
		
		jt.JobTitle("Softawre Tester QA");
		jt.Typedescription("Testing job");
		
		// uploadFile = new File("/Files/dummy.pdf");
		//jt.BrowseNofile(uploadFile.getAbsolutePath());
		 
		 
	//	jt.browse();
	//	jt.BrowseNofile("C:/Users/HP/git/repository/OrangeHRM_Automation/Files/dummy.pdf");
		
		
		jt.Addnotetxt("Software testing fresher");
		jt.Jobsavebtn();
		logger.info("Clicked on save buttone");
		
		String actualMessage1=jt.SaveSuccessfully();
		
		System.out.print(actualMessage1);
		
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
