package com.actitime.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditCustomerInfo {
	
	@FindBy(css="input[value='Delete This Customer']")
	private WebElement DelthisCustBtn;
	@FindBy(css="input[value='Delete Customer']")
	private WebElement delCust;



public EditCustomerInfo(WebDriver driver){
	
	PageFactory.initElements(driver, this);
}

public WebElement getDelthisCustBtn() {
	return DelthisCustBtn;
}

public WebElement getDelCust() {
	return delCust;
}


}