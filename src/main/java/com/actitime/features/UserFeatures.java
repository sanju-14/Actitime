package com.actitime.features;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

import com.actitime.pageobjects.CreateNewUserPage;
import com.actitime.pageobjects.EditUserSettingsPage;
import com.actitime.pageobjects.EnterTimeTrackPage;
import com.actitime.pageobjects.UserListPage;

public class UserFeatures {

	WebDriver driver;
	EnterTimeTrackPage ettp;
	UserListPage ulp;
	CreateNewUserPage cnup;
	EditUserSettingsPage eusp;
	
	public UserFeatures(WebDriver driver){
		this.driver=driver;
		ettp=new EnterTimeTrackPage(driver);
		ulp=new UserListPage(driver);
		cnup=new CreateNewUserPage(driver);
		eusp=new EditUserSettingsPage(driver);
	}
	
	public void clickOnusers(){
		ettp.getUserEle().click();
		
	}
	
	public void clickOncreateNewuser
	(String username, String password, String firstname, String lastname, String emailid)
	{
		
		ulp.getCnUser().click();
		cnup.getUsrNamTxtBx().sendKeys(username);
		cnup.getUsrNamPwdBx().sendKeys(password);
		cnup.getUsrNamPwdRetype().sendKeys(password);
		cnup.getUsrNamFstNam().sendKeys(firstname);
		cnup.getUsrNamLstNam().sendKeys(lastname);
		cnup.getUsrNamEmlBx().sendKeys(emailid);
		cnup.getCreateUsrBtn().click();
	}
	public void deleteNewUSer(){
		
		ulp.getNewUserNameLink().click();
		eusp.getDelThisUserBtnBx().click();
		Alert alt = driver.switchTo().alert();
		alt.accept();
	}
	
	public void verifyCreateNewUser(){
			String actualTxtMsg = ulp.getCrtUsrSuccessMsgEle().getText();
			String expectedTxtMsg ="User account has been successfully created.";
			Assert.assertEquals(actualTxtMsg, expectedTxtMsg);
			Reporter.log("Create User is verified", true);
		
	}
	public void verifydeleteNewUser(){
		String actualTxtMsg = ulp.getDelNewUserSuccessMsgEle().getText();
		String expectedTxtMsg ="User account has been successfully deleted.";
		Assert.assertEquals(actualTxtMsg, expectedTxtMsg);
		Reporter.log("Delete User is verified", true);
	
}
	
}
