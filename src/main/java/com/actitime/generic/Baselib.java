package com.actitime.generic;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Baselib {
	
	public static WebDriver driver;
	
	@BeforeMethod
	@Parameters({"browser","baseurl"})
	public void preCondition(String browserName, String url)
	{
		driver=Browserfactory.launchBrowser(browserName);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get(url);
	}
	
	@AfterMethod
	public void postCondition()
	{	
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@id='logoutLink']")).click();
		driver.close();
		Reporter.log("Browser Closed", true);
	}

}
