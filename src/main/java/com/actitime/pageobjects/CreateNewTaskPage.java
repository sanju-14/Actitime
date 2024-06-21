package com.actitime.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateNewTaskPage {
	@FindBy(css="select[name='customerId']")
	private WebElement custDrpDownBox;
	@FindBy(css="select[name='projectId']")
	private WebElement projDrpDownBox;
	@FindBy(css="input[name='task[0].name']")
	private WebElement taskNameTxtBx;
	@FindBy(css="input[name='task[0].deadline']")
	private WebElement deadlineDateTxtBx;
	@FindBy(css="select[name='task[0].billingType']")
	private WebElement billingtypeDrpDownBx;
	@FindBy(css="input[name='task[0].markedToBeAddedToUserTasks']")
	private WebElement addtoMyTimeTrackChkBx;
	@FindBy(css="input[value='Create Tasks']")
	private WebElement crtTaskSubmitBtn;
	
	public CreateNewTaskPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}



	public WebElement getCustDrpDownBox(String customername) {
		Select sel=new Select(custDrpDownBox);
		sel.selectByVisibleText(customername);
		return custDrpDownBox;
	}

	public WebElement getProjDrpDownBox(String projectname) {
		Select sel=new Select(projDrpDownBox);
		sel.selectByVisibleText(projectname);
		return projDrpDownBox;
	}



	public WebElement getTaskNameTxtBx() {
		return taskNameTxtBx;
	}



	public WebElement getDeadlineDateTxtBx() {
		return deadlineDateTxtBx;
	}



	public WebElement getBillingtypeDrpDownBx() {
		Select sel=new Select(billingtypeDrpDownBx);
		sel.selectByVisibleText("Billable");
		return billingtypeDrpDownBx;
	}



	public WebElement getAddtoMyTimeTrackChkBx() {
		return addtoMyTimeTrackChkBx;
	}



	public WebElement getCrtTaskSubmitBtn() {
		return crtTaskSubmitBtn;
	}
	
	
	
}
