package Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;
import Pom.UserPage;
import utility.base;
import utility.exceldataprovider;

public class VerifyAddUser extends base 
{
	@Test(priority = 2)
	public void addinguser() throws IOException, InterruptedException {
		
		UserPage user = new UserPage(driver);
		
		exceldataprovider e = new exceldataprovider();
		e.getData();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		user.AddUser();
		Thread.sleep(1000);
		String data = e.getStringData("Sheet1", 2, 0);//Niranjan
		user.EnterUserName(data);
		Thread.sleep(1000);
		String data1 = e.getStringData("Sheet1", 3, 0);//S
		user.EnterEmail(data1);
		Thread.sleep(1000);
		String data2 = e.getStringData("Sheet1", 4, 0);//Hiremath
		user.Enterfirstname(data2);
		Thread.sleep(1000);
		String data3 = e.getStringData("Sheet1", 5, 0);//
		user.Entermiddlename(data3);
		Thread.sleep(1000);
		String data4 = e.getStringData("Sheet1", 6, 0);
		user.Enterlastname(data4);
		Thread.sleep(2000);
		String data5 = e.getDateData("Sheet1", 7, 0);
		user.EnterBirthdate(data5);
		Thread.sleep(1000);
		String data6 = e.getStringData("Sheet1", 8, 0);
		user.EnterPassword(data6);
		Thread.sleep(1000);
		String data7 = e.getStringData("Sheet1", 9, 0);
		user.Enterconfirmpassword(data7);
		Thread.sleep(2000);
		String data8 = e.getStringData("Sheet1", 10, 0);
		user.EnterGender(data8);
		Thread.sleep(1000);
		String data9 = e.getNumericData("Sheet1", 11, 0);
		user.EnterPhonenumber(data9);
		Thread.sleep(1000);
		String data10 = e.getStringData("Sheet1", 12, 0);
		user.Enterdepartment(data10);
		Thread.sleep(2000);
		String data11 = e.getStringData("Sheet1", 13, 0);
		user.Enterrole(data11);
		Thread.sleep(2000);
		String data12 = e.getStringData("Sheet1", 14, 0);
		user.EnterJobcategoryid(data12);
		Thread.sleep(2000);
		String data13 = e.getStringData("Sheet1", 15, 0);
		user.EnteremploymentStatusId(data13);
		Thread.sleep(2000);
		String data14 = e.getStringData("Sheet1", 16, 0);
		user.EnterjobId(data14);
		Thread.sleep(2000);
		String data15 = e.getStringData("Sheet1", 17, 0);
		user.Enteraddress(data15);
		Thread.sleep(2000);
		String data16 = e.getStringData("Sheet1", 18, 0);
		user.Entersubrole(data16);
		Thread.sleep(4000);
	
		user.EnterSubmitButton();
			
	}
}