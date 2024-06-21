package com.actitime.pageobjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditProjectInfoPage {
		@FindBy(css="input[value='Delete This Project']")
		private WebElement delThisProBtn;
		@FindBy(css="input[value='Delete Project']")
		private WebElement delprojConfBtn;
	
	public EditProjectInfoPage(WebDriver driver){
		
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getDelThisProBtn() {
		return delThisProBtn;
	}

	public WebElement getDelprojConfBtn() {
		return delprojConfBtn;
	}
	
	
}
