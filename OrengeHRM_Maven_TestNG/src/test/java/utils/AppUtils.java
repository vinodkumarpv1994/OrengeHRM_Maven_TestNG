package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class AppUtils {
   
	public static WebDriver myDriver;
	public static String url = "http://orangehrm.qedgetech.com";
	   
	   
	   @BeforeSuite
	   public static void launchApp()
	   {
		   System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		   
		   myDriver = new ChromeDriver();
		   myDriver.manage().deleteAllCookies();
		   myDriver.manage().window().maximize();
		   myDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   myDriver.get(url);
	   }
	   
	   
	   
	   @AfterSuite
	   public static void closeApp()
	   {
	      myDriver.close();
	   }
	 
}
