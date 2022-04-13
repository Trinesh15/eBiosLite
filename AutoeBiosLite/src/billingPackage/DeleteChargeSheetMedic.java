package billingPackage;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import pom.BillingPage;
import pom.LogInPage;

public class DeleteChargeSheetMedic extends BaseTest
{
	@Test
	public void testAddMedforIP() throws InterruptedException 
	{
		String un = Excel.getCellData(INPUT, "Validinput", 1, 0);
		String pwd = Excel.getCellData(INPUT, "Validinput", 1, 1);
		String medication1 = Excel.getCellData(INPUT, "Billing", 31, 1);
		String medication2 = Excel.getCellData(INPUT, "Billing", 32, 1);
		String medication3 = Excel.getCellData(INPUT, "Billing", 33, 1);
		
		LogInPage logIn = new LogInPage(driver);
		logIn.setUsername(un); // enter the User name
		logIn.setPassword(pwd); // enter the password
		logIn.clickChooseModule(); //click on choose module
		logIn.clickBilling(); //Click on Receipts Module
		logIn.clickLogin();   // click on login button
		
		BillingPage bp = new BillingPage(driver);
		bp.clickAdvSearch();
		bp.clickAdmittedButton();
		bp.clicklocalPatient();
		bp.clickOKinAdmittedtab();
		bp.clickDeleteMedication();
	}

}
