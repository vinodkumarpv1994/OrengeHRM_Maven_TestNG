package orengeHRM.TestCases;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import orengeHRM.library.Admin;
import orengeHRM.library.User;

public class NewUserRegistration extends Admin{
    
	@Parameters({"Role","empName","userName","userPWD"})
	@Test(groups = {"Smoke","Sanity"})
	public void userReg(String Role, String empName, String userName, String userPWD) throws InterruptedException
	{
		User us = new User();
		boolean expRes = us.userRegistration(Role, empName, userName, userPWD);
		assertTrue(expRes);
		
	}
}
