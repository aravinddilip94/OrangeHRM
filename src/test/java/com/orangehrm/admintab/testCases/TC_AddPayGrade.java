package com.orangehrm.admintab.testCases;

import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.orangehrm.pageObjects.AdminPage;
import com.orangehrm.pageObjects.JobTitlesPage;
import com.orangehrm.pageObjects.LoginPage;
import com.orangehrm.pageObjects.PayGrades;
import com.orangehrm.testCases.BaseClass;

import junit.framework.Assert;

public class TC_AddPayGrade extends BaseClass {

	//File uploadFile;
	
	@Test
	public void AddPayGrade() throws IOException, InterruptedException 
	{
		
		intilization();
		
		AdminPage ap=new AdminPage(driver);
		ap.AdminTab();
		
		JobTitlesPage jt=new JobTitlesPage(driver);
		jt.JobTab();
		
		PayGrades pg = new PayGrades(driver);
		pg.paygradetab();
		
		pg.addpaygrage();
		
		pg.paygradeName("Grade 6");
		pg.paygradeSave();
		Thread.sleep(3000);
			
		pg.addcurrency();
		
		Thread.sleep(1000);
		pg.selectAED();
		
		Thread.sleep(1000);
		
		//pg.MinSal("100");
		pg.MaxSal("1000");
		
		Thread.sleep(1000);
		
		pg.save();
		
		Thread.sleep(3000);
		
		
		
		
		
		String actualMessage1=pg.SaveSuccessfully();
		
		System.out.print("actualMessage1");
		System.out.print(actualMessage1);
		
		if(pg.SaveSuccessfullyMSG())
		{
			String actualMessage=pg.SaveSuccessfully();
			Assert.assertTrue(actualMessage.contains("Success"));
			
		}
		else
		{
			Assert.assertTrue(false);
			captureScreen(driver,"AddPayGrade");
		}
		
		
		
		
		
		
	}
		
}
