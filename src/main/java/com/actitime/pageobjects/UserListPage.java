package com.actitime.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserListPage {

	
	@FindBy(xpath="//div[@id='ext-comp-1002']//span")
	private WebElement cnUser;
	@FindBy(xpath="//span[@class='successmsg']")
	private WebElement crtUsrSuccessMsgEle;
	@FindBy(linkText="Devgan, Ajay (Ajay_Dev)")
	private WebElement newUserNameLink;
	@FindBy(xpath="//span[@class='successmsg']")
	private WebElement delNewUserSuccessMsgEle;
	
	public UserListPage(WebDriver driver){
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getCnUser() {
		return cnUser;
	}
	public WebElement getCrtUsrSuccessMsgEle() {
		return crtUsrSuccessMsgEle;
	}
	public WebElement getNewUserNameLink() {
		return newUserNameLink;
	}
	public WebElement getDelNewUserSuccessMsgEle() {
		return delNewUserSuccessMsgEle;
	}
	
	
	
}
