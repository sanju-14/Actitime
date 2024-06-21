package com.actitime.scripts;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import com.flipkart.pages.flipkartLoginPage;
import com.flipkart.testdata.FlipkartTestDataObject;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart {
	
	static flipkartLoginPage flp;
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
				
		driver.navigate().to("https://google.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.name("q")).sendKeys("https://www.flipkart.com");
		
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
		driver.findElement(flipkartLoginPage.slturl).click();
		
		driver.findElement(flipkartLoginPage.userName).sendKeys(FlipkartTestDataObject.username);
	
		driver.findElement(flipkartLoginPage.Password).sendKeys(FlipkartTestDataObject.password);
		
		driver.findElement(flipkartLoginPage.Login).click();
		
		
		driver.findElement(flipkartLoginPage.searchMobile).sendKeys(FlipkartTestDataObject.SearchMobile);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(flipkartLoginPage.searchMobile).sendKeys(Keys.ENTER);
		      
		
	}

	
	
}
