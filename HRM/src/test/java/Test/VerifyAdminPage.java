package Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import Pom.AdminloginPage;
import utility.base;
import utility.exceldataprovider;

public class VerifyAdminPage extends base 
{

	@Test(priority = 1)
	public void loginpage() throws IOException, InterruptedException {

		AdminloginPage lp = new AdminloginPage(driver);
		
		exceldataprovider e = new exceldataprovider(); 
	    e.getData();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		  String EmailId = e.getStringData("Sheet1", 0, 0); 
		  lp.EnterEmailID(EmailId);
		  String PassWord = e.getStringData("Sheet1", 1, 0);
		  lp.EnterPassword(PassWord); 
		  Thread.sleep(1000); 

		  
		  lp.ClickonSubmit();
		  Thread.sleep(1000);

		
	}	
	

}
