package com.actitime.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewCustPage {

	
	@FindBy(name="name")
	private WebElement custNameTxtBx;
	@FindBy(name="createCustomerSubmit")
	private WebElement createcustBtn;
	
	public CreateNewCustPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	public WebElement getCustNameTxtBx() {
		return custNameTxtBx;
	}

	public WebElement getCreatecustBtn() {
		return createcustBtn;
	}
	
	
}
