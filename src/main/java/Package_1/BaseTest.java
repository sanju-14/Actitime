package Package_1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus; 

public class BaseTest {
	
	public WebDriver driver;
	public ExtentReports reports;
	public ExtentTest test;
	
	@BeforeMethod
	public void OpenAppIn()
	{
		
	 System.setProperty("webdriver.gecko.driver","./exefiles/geckodriver.exe" );	
	 			driver=new FirefoxDriver();
	 			driver.get("https://www.facebook.com/");
	 			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 			
	 			reports=new ExtentReports("./reports/extentreports.html", true);
	 			test= reports.startTest("Regression test cases");
	 		
	 					
	}
	
	@AfterMethod
	public void CloseAppIn(ITestResult res) throws Exception
	{
			int status = res.getStatus();
			
			String tcname = res.getName();
			
			
			if (status==2) {
				
			 String path = Generic_screenshot.photo(driver, tcname);
			 test.log(LogStatus.FAIL, test.addScreenCapture(path));
				
			}
			
			reports.endTest(test);
			reports.flush();
			driver.quit();
	}
	
}
