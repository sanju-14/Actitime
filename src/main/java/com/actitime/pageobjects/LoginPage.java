package com.actitime.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{	
	
		   @FindBy(name ="username")
		   private WebElement Untxtbx;
		   @FindBy(name = "pwd")
		   private WebElement Pwdtxt;
		   @FindBy(id = "loginButton")
		   private WebElement loginBtn;
		   @FindBy(xpath="//div[@id='ServerSideErrorMessage']//span")
			private WebElement inlog;
		   
		   public LoginPage(WebDriver driver)
		   {
			   PageFactory.initElements(driver, this);
			   
			    }

		public WebElement getUntxtbx() {
			return Untxtbx;
		}


		public WebElement getPwdtxt() {
			return Pwdtxt;
		}

		public WebElement getLoginBtn() {
			return loginBtn;
		}

		public WebElement getInlog() {
			return inlog;
		}
		  	
	
}
