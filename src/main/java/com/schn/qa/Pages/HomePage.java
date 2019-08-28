package com.schn.qa.Pages;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.schn.qa.base.TestBase;

public class HomePage extends TestBase{
	//Page Factory or Object Repository
	
	@FindBy(xpath="//*[@id='searchHomeLocation']")
	WebElement SearchHomeLocation;
	
	@FindBy(xpath="//*[@id='SeniorLivingOption']")
	WebElement SeniorLivingOption;
	
	@FindBy(xpath="//input[@type='button']")
	WebElement SearchButton;
	@FindBy(className="img-responsive img-thumbnail")
	WebElement ShnLogo;
	public HomePage() 
	{
		PageFactory.initElements(driver, this);
	}
	//actions
	public String ValidateHomePageTitle() {
		return driver.getTitle();
	}
	public boolean ValidateShnlogo() {
		return ShnLogo.isDisplayed();
	}
}