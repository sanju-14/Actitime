package com.actitime.scripts;

import org.testng.annotations.Test;

import com.actitime.features.LoginFeatures;
import com.actitime.features.TimeTrackFeatures;
import com.actitime.features.UserFeatures;
import com.actitime.generic.Baselib;
import com.actitime.generic.ExcelUtilities;

public class UserTest extends Baselib {
	
	@Test(priority=1)
	public void createUser(){
		
		ExcelUtilities eu=new ExcelUtilities("./testdata/testdata.xlsx");
		String username = eu.readData("sheet1", 8, 1);
	     String password = eu.readData("sheet1", 8, 2);
	     
	     LoginFeatures lf=new LoginFeatures(driver);
	     lf.login(username, password);
	     
	     String userName = eu.readData("sheet1", 8, 3);
	     String passWord = eu.readData("sheet1", 8, 4);
	     String firstName = eu.readData("sheet1", 8, 5);
	     String lastName = eu.readData("sheet1", 8, 6);
	     String emailId = eu.readData("sheet1", 8, 7);
	     
	     
	     UserFeatures uf=new UserFeatures(driver);
	     uf.clickOnusers();
	     uf.clickOncreateNewuser(userName, passWord, firstName, lastName, emailId);
	     uf.verifyCreateNewUser();
	
		
	}
	@Test(dependsOnMethods={"createUser"}, priority=2)
	public void loginNewUser(){
		
		ExcelUtilities eu=new ExcelUtilities("./testdata/testdata.xlsx");
		String username = eu.readData("sheet1", 9, 1);
	     String password = eu.readData("sheet1", 9, 2);
	     
	     LoginFeatures lf=new LoginFeatures(driver);
	     lf.login(username, password);   
	     TimeTrackFeatures ttf=new TimeTrackFeatures(driver);
	     	ttf.verifyNewUserPage();

	}
		@Test(dependsOnMethods={"loginNewUser"}, priority=3)
		public void deleteNewUser(){
			ExcelUtilities eu=new ExcelUtilities("./testdata/testdata.xlsx");
			String username = eu.readData("sheet1", 10, 1);
			String password = eu.readData("sheet1", 10, 2);
	     
			LoginFeatures lf=new LoginFeatures(driver);
			lf.login(username, password); 
	     
	     UserFeatures uf=new UserFeatures(driver);
	     	  uf.clickOnusers();
	          uf.deleteNewUSer();
	          uf.verifydeleteNewUser();
	     
	}
}
