package chargesheetPackage;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import pom.ChargeSheetPage;
import pom.LogInPage;

public class VerifybyPatientDOB extends BaseTest
{
	@Test
	public void testVerifybyPatientName() throws InterruptedException
	{
		//reading data from the excel
		String un = Excel.getCellData(INPUT, "Validinput", 1, 0);
		String pwd = Excel.getCellData(INPUT, "Validinput", 1, 1);
		String dob = Excel.getCellData(INPUT, "ChargeSheet", 3, 1);
		
		//creating object of login page and access the required methods.
		LogInPage logIn = new LogInPage(driver);
		logIn.setUsername(un); // enter the Username
		logIn.setPassword(pwd); // enter the password
		logIn.clickChooseModule(); //click on choose module
		logIn.clickChargesheet();//click on Charge sheet module
		logIn.clickLogin();   // click on login button
				
		//creating object of login page and access the required methods.
		ChargeSheetPage cs = new ChargeSheetPage(driver);
		cs.setName(dob);
		
	}

}