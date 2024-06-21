package com.actitime.scripts;


import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.jsoup.helper.HttpConnection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrokenLinks {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","./exefiles/geckodriver.exe" );
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://secure.qu.devfarm.ariasystems.net/ui/app.php/AccountSearch");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@class='user_pass_input' and @type='text']")).sendKeys("sankumar");
		driver.findElement(By.xpath("//input[@class='user_pass_input' and @type='password']")).sendKeys("Asdfgh@789");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//maximize
		driver.manage().window().maximize();
		
		//implicitly wait 10 seconds
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
			List <WebElement>	tag  =	driver.findElements(By.tagName("a"));
			
			System.out.println("Link Size =" + tag.size());
			
			for (WebElement e : tag) {
				
				String	url=e.getAttribute("href");
				
				verifyBrokenLink(url);
			}
	}
	
	public static void verifyBrokenLink(String linkUrl) {
		
		try {
			URL url = new URL(linkUrl);
			
		HttpURLConnection	httpCon=(HttpURLConnection) url.openConnection();
				httpCon.setConnectTimeout(3000);
				httpCon.connect();
				
			if (httpCon.getResponseCode()>=400) {
				
			System.out.println(linkUrl + "--->" + httpCon.getResponseCode() +" " + httpCon.getResponseMessage() + "  Link is Broken");
			}	
			 else {
				
			System.out.println(linkUrl + "--->" + httpCon.getResponseCode() +" " + httpCon.getResponseMessage() + "  Link is not Broken");

			}	
								
		} catch (Exception e) {
			// TODO: handle exception
		}								
		
	}
	
}
