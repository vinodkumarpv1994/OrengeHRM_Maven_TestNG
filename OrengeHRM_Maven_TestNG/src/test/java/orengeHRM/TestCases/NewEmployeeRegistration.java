package orengeHRM.TestCases;

import static org.testng.Assert.assertTrue;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import orengeHRM.library.Admin;
import orengeHRM.library.Employee;


public class NewEmployeeRegistration extends Admin{
    
	@Parameters({"firstName","lastName"})
	@Test(groups = {"Smoke"})
	public void newEmpReg(String firstName, String lastName)
	{
		Employee emp = new Employee();
		boolean expRes = emp.addEmployee(firstName, lastName);
		assertTrue(expRes);
	}
	
}
