package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserPage {
	
	@FindBy(xpath="/html/body/app-root/app-profile/div/main/div/app-add-user/div/div[1]/button")
	private WebElement adduser;
	@FindBy(xpath="/html/body/app-root/app-profile/div/main/div/app-add-user/div/div[2]/div/form/div/div[1]/div[1]/input")
	private WebElement Username;
	@FindBy(id="email")
	private WebElement emaiL;
	@FindBy(id="firstname")
	private WebElement Firstname;
	@FindBy(id="middlename")
	private WebElement Middlename;
	@FindBy(id="lastname")
	private WebElement Lastname;
	@FindBy(id="dob")
	private WebElement Birthdate;
	@FindBy(id="password")
	private WebElement Password;
	@FindBy(id="confirm_password")
	private WebElement Confirmpassword;
	@FindBy(name="gender")
	private WebElement Gender;
	@FindBy(id="phoneNumber")
	private WebElement Phonenumber;
	@FindBy(xpath="/html/body/app-root/app-profile/div/main/div/app-add-user/div/div[2]/div/form/div/div[6]/div[1]/select")
	private WebElement Department;
	@FindBy(name="role")
	private WebElement Role;
	@FindBy(name="jobCategoryId")
	private WebElement Jobcategoryid;
	@FindBy(name="employmentStatusId")
	private WebElement Employmentstatusid;
	@FindBy(name="jobId")
	private WebElement Jobid;
	@FindBy(id="address")
	private WebElement Address;
	@FindBy(name="subRole")
	private WebElement SubRole;
	@FindBy(id="sub")
	private WebElement AddSubmit;
	
	public UserPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void AddUser() 
	{
		adduser.click();
	}
	public void EnterUserName(String UserName) 
	{
		Username.sendKeys(UserName);
	}
	public void EnterEmail(String EmaiL) 
	{
		emaiL.sendKeys(EmaiL);
	}
	public void Enterfirstname(String FirstName) 
	{
		Firstname.sendKeys(FirstName);
	}
	public void Entermiddlename(String MiddleName) 
	{
		Middlename.sendKeys(MiddleName);
	}
	public void Enterlastname(String LastName) 
	{
		Lastname.sendKeys(LastName);
	}
	public void EnterBirthdate(String date) 
	{
		Birthdate.sendKeys(date);
	}
	public void EnterPassword(String PASSWORD) 
	{
		Password.sendKeys(PASSWORD);
	}
	public void Enterconfirmpassword(String Cpassword) 
	{
		Confirmpassword.sendKeys(Cpassword);
	}
	public void EnterGender(String G) 
	{
		Gender.sendKeys(G);
	}
	public void EnterPhonenumber(String PhoneNumber) 
	{
		Phonenumber.sendKeys(PhoneNumber);
	}
	public void Enterdepartment(String DePartment) 
	{
		Department.sendKeys(DePartment);
	}
	public void Enterrole(String ROLE) 
	{
		Role.sendKeys(ROLE);
	}
	public void EnterJobcategoryid(String JobcategoryId) 
	{
		Jobcategoryid.sendKeys(JobcategoryId);
	}
	public void EnteremploymentStatusId(String EmploymentStatusId) 
	{
		Employmentstatusid.sendKeys(EmploymentStatusId);
	}
	public void EnterjobId(String JobId) 
	{
		Jobid.sendKeys(JobId);
	}
	public void Enteraddress(String ADDRESS) 
	{
		Address.sendKeys(ADDRESS);
	}
	public void Entersubrole(String SUBROLE)
	{
		SubRole.sendKeys(SUBROLE);
	}
	public void EnterSubmitButton()
	{
		AddSubmit.click();
	}
}