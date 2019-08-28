package com.schn.qa.Pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.Test;

import com.schn.qa.base.TestBase;

public class filter extends TestBase{
	@FindBy(how=How.XPATH,using="//*[@id='searchHomeLocation']")
	WebElement SearchBoxCity;
  @Test
  public void f() {
	  
  }
}
