package orengeHRM.library;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import utils.AppUtils;

public class Admin extends AppUtils{
    
	LoginPage lp;
	
	@Parameters({"adminUID","adminPWD"})
	@BeforeTest
	public void adminLogin(String adminUID, String adminPWD) 
	{
		lp = new LoginPage();
		lp.login(adminUID, adminPWD);
	}
	
	@AfterTest
	public void adminlogout() 
	{
		lp.logout();
	}
}
