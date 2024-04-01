package orengeHRM.TestCases;

import static org.testng.Assert.*;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import orengeHRM.library.LoginPage;
import utils.AppUtils;

public class AdminLoginWithInValidCredentials extends AppUtils{
    
	@Parameters({"adminUID" , "adminPWD"})
	@Test(groups = {"Functional"})
	public void adminLogin(String adminUID, String adminPWD) {
		LoginPage lp = new LoginPage();
		lp.login(adminUID, adminPWD);
		boolean expRes = lp.inValidCred();
		assertTrue(expRes);
	}
}
