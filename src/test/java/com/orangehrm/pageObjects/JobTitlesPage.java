package com.orangehrm.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JobTitlesPage {

	WebDriver ldriver;
	
	public JobTitlesPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
	
	@FindBy(xpath="//span[normalize-space()='Job']")
	@CacheLookup
	WebElement Jobbtn;
	
	@FindBy(xpath="//a[normalize-space()='Job Titles']")
	@CacheLookup
	WebElement JobTitlesbtn;
	
	@FindBy(xpath="//button[normalize-space()='Add']")
	@CacheLookup
	WebElement Addbtn;
	
	@FindBy(xpath="//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")
	@CacheLookup
	WebElement JobTitletxt;
	
	@FindBy(xpath="//textarea[@placeholder='Type description here']")
	@CacheLookup
	WebElement Typedescriptionhere;
	
	@FindBy(xpath="//div[@class='oxd-file-button']")
	@CacheLookup
	WebElement BrowseNofilechosen;
	
	@FindBy(xpath="//textarea[@placeholder='Add note']")
	@CacheLookup
	WebElement Addnote;
	
	@FindBy(xpath="//button[normalize-space()='Cancel']")
	@CacheLookup
	WebElement Cancel;
	
	@FindBy(xpath="//button[normalize-space()='Save']")
	@CacheLookup
	WebElement Save;
	
	@FindBy(xpath="//div[@class='oxd-toast oxd-toast--success oxd-toast-container--toast']")
	@CacheLookup
	WebElement SaveSuccessfullyEle;
	
	@FindBy(xpath="//div[contains(text(),'Softawre Tester QA')]/following::div[4]//button[2]")
	@CacheLookup
	WebElement jobtitleeditbutton;
	
	@FindBy(xpath="//div[contains(text(),'Softawre Tester QA')]/following::div[4]//button[1]")
	@CacheLookup
	WebElement jobtitledeletebutton;
	
	@FindBy(xpath="//button[normalize-space()='Yes, Delete']")
	@CacheLookup
	WebElement deleteyesbtn;
	
	
	
	
	
	
	
	public void JobTab()
	{
		Jobbtn.click();
	}
	
	public void JobTitle()
	{
		JobTitlesbtn.click();
	}
	
	public void Add()
	{
		Addbtn.click();
	}
	
	public void JobTitle(String JobTitlename)
	{
		JobTitletxt.sendKeys(JobTitlename);
	}
	
	public void Typedescription(String jobdescription)
	{
		Typedescriptionhere.sendKeys(jobdescription);
	}
	
	
	public void BrowseNofile(String Browsefile)
	{
		BrowseNofilechosen.sendKeys(Browsefile);
	}
	
	public void browse()
	{
		BrowseNofilechosen.click();
	}
	
	public void Addnotetxt(String notes)
	{
		Addnote.sendKeys(notes);
	}
	
	public void JObCancelbtn()
	{
		Cancel.click();
	}
	
	public void  Jobsavebtn()
	{
		Save.click();
	}
	
	public String SaveSuccessfully()
	{
		return SaveSuccessfullyEle.getText();
	}
	
	public boolean SaveSuccessfullyMSG()
	{
		return SaveSuccessfullyEle.isDisplayed();
	}

	public void  Jobedit()
	{
		jobtitleeditbutton.click();
	}
	
	
	public String getjobtiltevalue()
	{
		return JobTitletxt.getAttribute("value");
	}

	public void Jobdelete()
	{
		jobtitledeletebutton.click();
	}
	
	public void Jobdeleteyes()
	{
		deleteyesbtn.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
