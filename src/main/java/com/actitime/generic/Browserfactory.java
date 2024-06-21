package com.actitime.generic;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Reporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browserfactory {

	
		public static WebDriver launchBrowser(String browsername) {
			
				WebDriver driver = null;
			  if(browsername.equalsIgnoreCase("chrome")) {
				  
				  System.setProperty("webdriver.chrome.driver","./exefiles/chromedriver.exe" );
				  
				  	 driver = new ChromeDriver();
				  	 
				  	 Reporter.log("Chrome Browser Launched", true);
				 
			  }
			  else if(browsername.equalsIgnoreCase("internetexplorer")){
				  
				  System.setProperty("webdriver.ie.driver", "./exefiles/IEDriverServer.exe");
				
				  driver = new InternetExplorerDriver();
				  
				  Reporter.log("Chrome Browser Launched", true);

			  }
			return driver;
		}
}
