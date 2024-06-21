package com.actitime.features;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import com.actitime.pageobjects.ActiveProjCustPage;
import com.actitime.pageobjects.CreateNewCustPage;
import com.actitime.pageobjects.CreateNewProjectPage;
import com.actitime.pageobjects.CreateNewTaskPage;
import com.actitime.pageobjects.EditCustomerInfo;
import com.actitime.pageobjects.EditProjectInfoPage;
import com.actitime.pageobjects.EnterTimeTrackPage;
import com.actitime.pageobjects.OpenTaskPage;
import com.actitime.pageobjects.ViewOpenTaskPage;

public class TaskFeatures {
		WebDriver driver;
		OpenTaskPage otp;
		EnterTimeTrackPage ettp;
		ActiveProjCustPage apcp;
		CreateNewCustPage cncp;
		EditCustomerInfo eci;
		CreateNewProjectPage cnpp;
		EditProjectInfoPage epip;
		CreateNewTaskPage cntp;
		ViewOpenTaskPage votp;
		public TaskFeatures (WebDriver driver)
		{
			this.driver=driver;
			ettp=new EnterTimeTrackPage(driver);
			otp=new OpenTaskPage(driver);
			apcp=new ActiveProjCustPage(driver);
			cncp=new CreateNewCustPage(driver);
			eci=new EditCustomerInfo(driver);
			cnpp=new CreateNewProjectPage(driver);
			epip=new EditProjectInfoPage(driver);
			cntp=new CreateNewTaskPage(driver);
			votp=new ViewOpenTaskPage(driver);
		}
		
		public void clickonTask(){
			
			ettp.getTaskEle().click();
		}
		
		
		public void  clickOnprojcustLink(){
			
			otp.getprojcustLink().click();
		}
		
		public void clickOnShow(){
			
			apcp.getShowBtn().click();
		}
		 
		 public void deleteCustomer(String customername){
			 Select sel=new Select(apcp.getCustDrpDown());
			sel.selectByVisibleText(customername);
			 apcp.getCustLink().click();
			 eci.getDelthisCustBtn().click();
			 eci.getDelCust().click();
		 }
		 
		public void createCustomer(String customername){
			
			apcp.getCreateNewCustBtn().click();
			cncp.getCustNameTxtBx().sendKeys(customername);
			cncp.getCreatecustBtn().click();
		}
		
		public void createNewProject(String projectname, String customername){
			apcp.getCrtNewPrjBtn().click();
			cnpp.getCrtNewProjDrpDown(customername).click();
			cnpp.getProjNameTxtBx().sendKeys(projectname);
			cnpp.getCrtProjSubmitBtn().click();
			}
		
		public void deleteProject(){
			apcp.getProjLink().click();
			epip.getDelThisProBtn().click();
			epip.getDelprojConfBtn().click();
		}
		
		public void createNewTask(String customername, String projectname, String taskname){
			
			otp.getCrtNewTaskBtn().click();
			cntp.getCustDrpDownBox(customername).click();
			cntp.getProjDrpDownBox(projectname).click();
			cntp.getTaskNameTxtBx().sendKeys(taskname);
			cntp.getDeadlineDateTxtBx().sendKeys("Mar 14, 2020");
			cntp.getBillingtypeDrpDownBx().click();
			cntp.getAddtoMyTimeTrackChkBx().click();
			cntp.getCrtTaskSubmitBtn().click();
			
		}
		
		public void deleteTask(){		
			otp.getTaskLink().click();
			votp.getDelThisTaskBtn().click();
			votp.getDelTaskconfBtn().click();
		}
		
		
		public void verifyCreateCustomer(String customerName){
			String actualText = apcp.getSuccessMsgEle().getText();
			String expectedText = "Customer \""+customerName+"\" has been successfully created.";
			Assert.assertEquals(actualText, expectedText);
			Reporter.log("Create Customer is Verified", true);		
			
		}
		public void verifyDeleteCustomer(String expectedCustName){
			String actualText = apcp.getSuccessMsgEle().getText();
			String expectedText = "Customer has been successfully deleted.";
			Assert.assertEquals(actualText, expectedText);
			
			Select sel=new Select(apcp.getCustDrpDown());
			     List<WebElement> options = sel.getOptions();
			     
			     for (int i = 0; i < options.size(); i++) {
			    	 	 	
			    	String actualCustName = options.get(i).getText();
			    	Assert.assertNotEquals(actualCustName, expectedCustName);
					
				}
			Reporter.log(expectedText, true);		
		
	}
		public void verifyCreateProject(String projectName){
			String actualText = apcp.getSuccessMsgEle().getText();
			String expectedText = "Project \""+projectName+"\" has been successfully created.";
			Assert.assertEquals(actualText, expectedText);
			Reporter.log("Create Project is Verified", true);		
			
		}
		public void verifyDeleteProject(){
			String actualText = apcp.getSuccessMsgEle().getText();
			String expectedText = "Project has been successfully deleted.";
			Assert.assertEquals(actualText, expectedText);
			Reporter.log("Delete Project is Verified", true);		
		
	}
		public void verifyCreateTask(String projectName, String customerName){
			String actualText = otp.getCrtTaskSuccessMsgEle().getText();
			String expectedText = "1 new task was added to the customer \""+customerName+"\", project \""+projectName+"\".";
			Assert.assertEquals(actualText, expectedText);
			Reporter.log("Create Task is Verified", true);		
			
		}
		public void verifyDeleteTask(){
			String actualText = otp.getDelSuccessMsgTxt().getText();
			String expectedText = "Task has been successfully deleted.";
			Assert.assertEquals(actualText, expectedText);
			Reporter.log("Delete Task is Verified", true);		
		
	}
}
