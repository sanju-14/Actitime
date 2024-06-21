package com.actitime.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiveProjCustPage {
	
	@FindBy(css="input[value='Create New Customer']")
	private WebElement createNewCustBtn;
	@FindBy(xpath="//table[@id='SuccessMessages']//span")
	private WebElement SuccessMsgEle;
	@FindBy(name="selectedCustomer")
	private WebElement custDrpDown;
	@FindBy(css="input[value*='Show']")
	private WebElement showBtn;
	@FindBy(xpath="//td[starts-with(@id,'customerNameCell')]//a[contains(@href, 'customerId')]")
	private WebElement custLink;
	@FindBy(css="input[value='Create New Project']")
	private WebElement crtNewPrjBtn;
	@FindBy(linkText="Medical Software")
	private WebElement ProjLink;
	
	public ActiveProjCustPage(WebDriver driver){
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getCreateNewCustBtn() {
		return createNewCustBtn;
	}
	
	public WebElement getCustLink() {
		return custLink;
	}

	public WebElement getSuccessMsgEle() {
		return SuccessMsgEle;
	}

	public WebElement getCustDrpDown() {
		
		return custDrpDown;
	}

	public WebElement getShowBtn() {
		return showBtn;
	}

	public WebElement getCrtNewPrjBtn() {
		return crtNewPrjBtn;
	}

	public WebElement getProjLink() {
		return ProjLink;
	}

	
	
		
}


