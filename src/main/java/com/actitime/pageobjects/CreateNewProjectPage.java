package com.actitime.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateNewProjectPage {

	@FindBy(css="select[name='customerId']")
	private WebElement crtNewProjDrpDown;
	@FindBy(css="input[name='name']")
	private WebElement projNameTxtBx;
	@FindBy(css="input[name='createProjectSubmit']")
	private WebElement crtProjSubmitBtn;
	
	public CreateNewProjectPage(WebDriver driver){
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getCrtNewProjDrpDown(String customername) {
		Select sel=new Select(crtNewProjDrpDown);
		sel.selectByVisibleText(customername);
		return crtNewProjDrpDown;
		}

		public WebElement getProjNameTxtBx() {
				return projNameTxtBx;
			}

		public WebElement getCrtProjSubmitBtn() {
			return crtProjSubmitBtn;
		}

		
		
		

}