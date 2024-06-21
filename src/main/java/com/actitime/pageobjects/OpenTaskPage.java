package com.actitime.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenTaskPage {
	
	@FindBy(linkText="Projects & Customers")
	private WebElement projcustLink;
	@FindBy(css="input[value='Create New Tasks']")
	private WebElement crtNewTaskBtn;
	@FindBy(xpath="//span[@class='successmsg']")
	private WebElement CrtTaskSuccessMsgEle;
	@FindBy(linkText="Testing")
	private WebElement taskLink;
	@FindBy(xpath="//span[@class='successmsg']")
	private WebElement delSuccessMsgTxt;
	
	public OpenTaskPage (WebDriver driver){
		
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getprojcustLink() {
		
		return projcustLink;
	}

	public WebElement getCrtNewTaskBtn() {
		return crtNewTaskBtn;
	}

	public WebElement getCrtTaskSuccessMsgEle() {
		return CrtTaskSuccessMsgEle;
	}

	public WebElement getTaskLink() {
		return taskLink;
	}

	public WebElement getDelSuccessMsgTxt() {
		return delSuccessMsgTxt;
	}
	
	
	
}
