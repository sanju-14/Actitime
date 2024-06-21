package com.actitime.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewUserPage {

	@FindBy(name="username")
	private WebElement UsrNamTxtBx;
	@FindBy(name="passwordText")
	private WebElement UsrNamPwdBx;
	@FindBy(name="passwordTextRetype")
	private WebElement UsrNamPwdRetype;
	@FindBy(name="firstName")
	private WebElement UsrNamFstNam;
	@FindBy(name="lastName")
	private WebElement UsrNamLstNam;
	@FindBy(name="email")
	private WebElement UsrNamEmlBx;
	@FindBy(css="input[value='   Create User   ']")
	private WebElement CreateUsrBtn;
	
	
	public CreateNewUserPage(WebDriver driver){
		
		PageFactory.initElements(driver, this);
	}


	public WebElement getUsrNamTxtBx() {
		return UsrNamTxtBx;
	}


	public WebElement getUsrNamPwdBx() {
		return UsrNamPwdBx;
	}


	public WebElement getUsrNamPwdRetype() {
		return UsrNamPwdRetype;
	}


	public WebElement getUsrNamFstNam() {
		return UsrNamFstNam;
	}


	public WebElement getUsrNamLstNam() {
		return UsrNamLstNam;
	}


	public WebElement getUsrNamEmlBx() {
		return UsrNamEmlBx;
	}


	public WebElement getCreateUsrBtn() {
		return CreateUsrBtn;
	}
	
	
}
