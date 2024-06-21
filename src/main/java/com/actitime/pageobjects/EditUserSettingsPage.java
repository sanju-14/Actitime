package com.actitime.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditUserSettingsPage {
	@FindBy(css="input[value='Delete This User']")
	private WebElement delThisUserBtnBx;
		
	public EditUserSettingsPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	public WebElement getDelThisUserBtnBx() {
		return delThisUserBtnBx;
	}
	
}
