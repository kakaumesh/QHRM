package utility;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class base {
	
	public static WebDriver driver;
	
	@BeforeTest
	@Parameters({"Browser"})
	public void browserlaunch(String browser) throws InterruptedException 
	{
		
		if(browser.equalsIgnoreCase("chrome")) 
		{
			driver = new ChromeDriver();
			Thread.sleep(3000);
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		}
		
		driver.get("https://qdtas-hrm-front-end.vercel.app/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	
	@AfterMethod
	public void failedScreenshot(ITestResult result) throws IOException
	{
	if(ITestResult.FAILURE ==result.getStatus()) 
	{
	   screenshot.getScreenshot(driver);
	}
	else if(ITestResult.SUCCESS==result.getStatus())
	{
	   screenshot.getScreenshot(driver);
	}
	
	}
	
}