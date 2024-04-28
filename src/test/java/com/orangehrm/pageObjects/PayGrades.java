package com.orangehrm.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PayGrades {

	
	WebDriver ldriver; 
	private WebDriverWait wait;
	Actions actions;
	
	
	
	public PayGrades(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);	
		wait = new WebDriverWait(ldriver, 10);
		actions = new Actions(ldriver);
	}
	
	@FindBy(xpath="//a[contains(text(),'Pay Grades')]")
	@CacheLookup
	WebElement mpaygradetab;
	
	public void paygradetab() 
	{
		mpaygradetab.click();
	}
	
	@FindBy(xpath="//button[normalize-space()='Add']")
	@CacheLookup
	WebElement addbtn;
	
	public void addpaygrage()
	{
		addbtn.click();
	}
	
	@FindBy(xpath="//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")
	@CacheLookup
	WebElement nametext;
	
	public void paygradeName(String name)
	{
		nametext.sendKeys(name);
	}
	
	@FindBy(xpath="//button[normalize-space()='Save']")
	@CacheLookup
	WebElement savebtn;
	
	public void paygradeSave()
	{
		savebtn.click();
	}
	
	
	
	@FindBy(xpath="//p[@class='oxd-text oxd-text--p oxd-text--toast-title oxd-toast-content-text']")
	@CacheLookup
	WebElement SaveSuccessfullyEle;
	
	public String SaveSuccessfully()
	{
		wait.until(ExpectedConditions.visibilityOf(SaveSuccessfullyEle));
		return SaveSuccessfullyEle.getText();
	}
	
	public boolean SaveSuccessfullyMSG()
	{
	
		return SaveSuccessfullyEle.isDisplayed();
	       
	}
	
	
	
	@FindBy(xpath="//i[@class='oxd-icon bi-plus oxd-button-icon']")
	@CacheLookup
	WebElement addcurrencybtn;
	
	public void addcurrency()
	{
		addcurrencybtn.click();
	}
	
	
	@FindBy(xpath="//div[@class='oxd-select-text oxd-select-text--active']")
	@CacheLookup
	WebElement Currencydrp;
	
	public void selectcurrency()
	{
		Currencydrp.click();
	}
	
	public void selectAED() {
        // Click the dropdown to show options
		selectcurrency();
		actions.sendKeys(Keys.ARROW_DOWN).perform();
		actions.sendKeys(Keys.ENTER).perform();
	      
	}
    

	@FindBy(xpath="//body/div[@id='app']/div[1]/div[2]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]")
	@CacheLookup
	WebElement minsal;
	
	public void MinSal(String min)
	{
		minsal.sendKeys(min);
	}
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[2]/div[2]/div[2]/form[1]/div[2]/div[1]/div[2]/div[1]/div[2]/input[1]")
	@CacheLookup
	WebElement max;
	
	public void MaxSal(String max)
	{
		minsal.sendKeys(max);
	}
	
	
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[2]/div[2]/div[2]/form[1]/div[3]/button[2]")
	@CacheLookup
	WebElement sav;
	
	public void save()
	{
		sav.click();
	}
	

	
	//body/div[@id='app']/div[1]/div[2]/div[2]/div[2]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]
	//body/div[@id='app']/div[1]/div[2]/div[2]/div[2]/form[1]/div[2]/div[1]/div[2]/div[1]/div[2]/input[1]
	
	//div[@class='oxd-form-row']//div[2]//div[1]//div[2]//input[1]

	//button[normalize-space()='Add']
	
	//div[@class='oxd-form-row']//div[2]//div[1]//div[2]//input[1]

	//body/div[@id='app']/div[1]/div[2]/div[2]/div[2]/form[1]/div[2]/div[1]/div[2]/div[1]/div[2]/input[1]

	//input[@class='oxd-input oxd-input--focus']
	//input[@class='oxd-input oxd-input--focus']
	
	
	//button[normalize-space()='Save']
	//button[normalize-space()='Save']
	//div[@class='oxd-toast oxd-toast--success oxd-toast-container--toast']
	//button[normalize-space()='Save']
	//div[@class='oxd-toast oxd-toast--success oxd-toast-container--toast']
	//div[@class='oxd-toast oxd-toast--success oxd-toast-container--toast']
	//p[@class='oxd-text oxd-text--p oxd-text--toast-title oxd-toast-content-text']
	
	//div[@class='oxd-toast oxd-toast--success oxd-toast-container--toast']
	//div[@class='oxd-toast oxd-toast--success oxd-toast-container--toast']
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
