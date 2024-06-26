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

public class TC_EditJobTitles extends BaseClass {

	// File uploadFile;

	@Test
	public void EditJobTitle() throws IOException, InterruptedException {

		logger.info("URL is opened");

		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Entered username");

		lp.setPassword(password);
		logger.info("Entered password");
		lp.clickSubmit();

		AdminPage ap = new AdminPage(driver);
		ap.AdminTab();

		JobTitlesPage jt = new JobTitlesPage(driver);
		jt.JobTab();

		jt.JobTitle();
		logger.info("Clicked on Jobtitle");

		Thread.sleep(1500);

		jt.Jobedit();
		logger.info("Clicked on edit button");

		Thread.sleep(1500);

		String textBoxValue = jt.getjobtiltevalue();

		if ("Softawre Tester QA".equals(textBoxValue)) {

			Assert.assertTrue(true);

		} else {
			Assert.fail("The text box value does not match the expected value.");
		}

	}

}
