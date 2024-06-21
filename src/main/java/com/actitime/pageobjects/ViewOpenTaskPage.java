package com.actitime.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewOpenTaskPage {
	
	@FindBy(css="input[value='Delete This Task']")
	private WebElement delThisTaskBtn;
	@FindBy(css="input[value='Delete Task']")
	private WebElement delTaskconfBtn;
	
	public ViewOpenTaskPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	public WebElement getDelThisTaskBtn() {
		return delThisTaskBtn;
	}

	public WebElement getDelTaskconfBtn() {
		return delTaskconfBtn;
	}
	
	

}
