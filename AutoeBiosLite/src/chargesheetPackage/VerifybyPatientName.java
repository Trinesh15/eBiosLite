package chargesheetPackage;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import pom.LogInPage;
import pom.ChargeSheetPage;

public class VerifybyPatientName extends BaseTest
{
	@Test
	public void testVerifybyPatientName() throws InterruptedException
	{
		//reading data from the excel
		String un = Excel.getCellData(INPUT, "Validinput", 1, 0);
		String pwd = Excel.getCellData(INPUT, "Validinput", 1, 1);
		String name = Excel.getCellData(INPUT, "ChargeSheet", 1, 1);
		
		//creating object of login page and access the required methods.
		LogInPage logIn = new LogInPage(driver);
		logIn.setUsername(un); // enter the Username
		logIn.setPassword(pwd); // enter the password
		logIn.clickChooseModule(); //click on choose module
		logIn.clickChargesheet();//click on Charge sheet module
		logIn.clickLogin();   // click on login button
				
		//creating object of login page and access the required methods.
		ChargeSheetPage cs = new ChargeSheetPage(driver);
		cs.setName(name);
		
	}

}
