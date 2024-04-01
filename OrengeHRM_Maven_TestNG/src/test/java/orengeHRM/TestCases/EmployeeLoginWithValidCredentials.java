package orengeHRM.TestCases;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import orengeHRM.library.LoginPage;
import utils.AppUtils;

public class EmployeeLoginWithValidCredentials extends AppUtils{
  
	@Parameters({"employeeUID","employeePWD"})
	@Test(groups = {"Smoke","Regression"})
	public void empLogin(String employeeUID, String employeePWD) 
	{
		LoginPage lp = new LoginPage();
		lp.login(employeeUID, employeePWD);
		boolean expRes = lp.isEmployeeModuleDisplayed();
		assertTrue(expRes);
		lp.logout();
	}
}