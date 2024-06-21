package com.actitime.scripts;
import org.testng.annotations.Test;
import com.actitime.features.LoginFeatures;
import com.actitime.features.TaskFeatures;
import com.actitime.generic.Baselib;
import com.actitime.generic.ExcelUtilities;

public class TaskTest extends Baselib {
	
	@Test(priority=1)
	public void createCustomer(){
		
		ExcelUtilities eu=new ExcelUtilities("./testdata/testdata.xlsx");
		String username = eu.readData("sheet1", 3, 1);
	     String password = eu.readData("sheet1", 3, 2);
	     
	     LoginFeatures lf=new LoginFeatures(driver);
	     lf.login(username, password);
	     
	     String customerName = eu.readData("sheet1", 3, 3);
	     TaskFeatures tf=new TaskFeatures(driver);
	     tf.clickonTask();
	     tf.clickOnprojcustLink();
	     tf.createCustomer(customerName);
	     tf.verifyCreateCustomer(customerName);
	
		
	}
	
	@Test(dependsOnMethods={"createCustomer"}, priority=6)
		public void deleteCustomer(){
			ExcelUtilities eu=new ExcelUtilities("./testdata/testdata.xlsx");
			String username = eu.readData("sheet1", 4, 1);
			String password = eu.readData("sheet1", 4, 2);
			String customerName = eu.readData("sheet1", 4, 3);
			LoginFeatures lf=new LoginFeatures(driver);
			lf.login(username, password);
	     
		TaskFeatures tf=new TaskFeatures(driver);
		tf.clickonTask();
		tf.clickOnprojcustLink();
		tf.clickOnShow();
		tf.deleteCustomer(customerName);
		tf.verifyDeleteCustomer(customerName);
	
	}	
	@Test(dependsOnMethods={"createCustomer"}, priority=2)
	public void createNewProject(){
		ExcelUtilities eu=new ExcelUtilities("./testdata/testdata.xlsx");
		String username = eu.readData("sheet1", 5, 1);
		String password = eu.readData("sheet1", 5, 2);
		String customerName = eu.readData("sheet1", 5, 3);
		String ProjectName= eu.readData("sheet1", 5, 4);
		LoginFeatures lf=new LoginFeatures(driver);
		lf.login(username, password);
		
		TaskFeatures tf=new TaskFeatures(driver);	
		
		tf.clickonTask();
		tf.clickOnprojcustLink();
		tf.createNewProject(ProjectName, customerName);
		tf.verifyCreateProject(ProjectName);
		
}
	@Test(dependsOnMethods={"createNewProject"}, priority=5)
	public void deleteNewProject(){
		ExcelUtilities eu=new ExcelUtilities("./testdata/testdata.xlsx");
		String username = eu.readData("sheet1", 6, 1);
		String password = eu.readData("sheet1", 6, 2);
		
		LoginFeatures lf=new LoginFeatures(driver);
		lf.login(username, password);
		
		TaskFeatures tf=new TaskFeatures(driver);
		tf.clickonTask();
		tf.clickOnprojcustLink();
		tf.deleteProject();
		tf.verifyDeleteProject();
}
	@Test(dependsOnMethods={"createNewProject"}, priority=3)
		public void createNewTask(){
			ExcelUtilities eu=new ExcelUtilities("./testdata/testdata.xlsx");
			String username = eu.readData("sheet1", 7, 1);
			String password = eu.readData("sheet1", 7, 2);
			LoginFeatures lf=new LoginFeatures(driver);
			lf.login(username, password);
			
			String customerName = eu.readData("sheet1", 7, 3);
			String projectName= eu.readData("sheet1", 7, 4);
			String taskName= eu.readData("sheet1", 7, 5);
			TaskFeatures tf=new TaskFeatures(driver);
			tf.clickonTask();
			tf.createNewTask(customerName, projectName, taskName);
			tf.verifyCreateTask(projectName, customerName);
	
}
	@Test(dependsOnMethods={"createNewTask"}, priority=4)
	public void deleteNewTask(){
		ExcelUtilities eu=new ExcelUtilities("./testdata/testdata.xlsx");
		String username = eu.readData("sheet1", 7, 1);
		String password = eu.readData("sheet1", 7, 2);
		
		LoginFeatures lf=new LoginFeatures(driver);
		lf.login(username, password);
		
		TaskFeatures tf=new TaskFeatures(driver);
		tf.clickonTask();
		tf.deleteTask();
		tf.verifyDeleteTask();
}
}