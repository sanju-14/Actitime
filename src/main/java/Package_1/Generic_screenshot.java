package Package_1;

import java.io.File;
import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;


public class Generic_screenshot {
	
	public static String photo(WebDriver driver , String tcname) throws Exception 
	{
		String photo="./screenshots/";
		Date d=new Date();
		String d1 = d.toString();
		String date = d1.replaceAll(":", "-");
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		  File src = ts.getScreenshotAs(OutputType.FILE);
		  File dst=new File(photo+date+tcname+".jpeg");
		  
		  	 String path = dst.getAbsolutePath();
		  	 FileHandler.copy(src, dst);
		
		return path;
	}

}
