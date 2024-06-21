package com.actitime.features;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

import com.actitime.pageobjects.EnterTimeTrackPage;

public class TimeTrackFeatures {
		
		WebDriver driver;
		
		EnterTimeTrackPage ettp;
		
		public TimeTrackFeatures(WebDriver driver){
			
			
			this.driver=driver;
			ettp=new EnterTimeTrackPage(driver);
		}
		
		public void verifyEnterTimeTrackPage(){
			
		String actualtext = ettp.getEttptitle().getText();
		String expectedtext= "Enter Time-Track";
		Assert.assertEquals(actualtext, expectedtext);
		
		String actualtitle = driver.getTitle();
		String expectedtitle= "actiTIME - Enter Time-Track";
		Assert.assertEquals(actualtitle, expectedtitle);
		Reporter.log("Verified Login", true);
		  
	}
		public void verifyNewUserPage(){
			String actualtext = ettp.getEttptitle().getText();
			String expectedtext= "Enter Time-Track";
			Assert.assertEquals(actualtext, expectedtext);
			
			String actualtitle = driver.getTitle();
			String expectedtitle= "actiTIME - Enter Time-Track";
			Assert.assertEquals(actualtitle, expectedtitle);
			Reporter.log("Verified Login", true);
			
			String actualuserprofile = ettp.getNewUSerProfLink().getText();
			String expecteduserprofile = "Ajay Devgan";
			Assert.assertEquals(actualuserprofile, expecteduserprofile);
			Reporter.log("UserProfile Name is verified", true);
                                
              
			
			
		}

		}
