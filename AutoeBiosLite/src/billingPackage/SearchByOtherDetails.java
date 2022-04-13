package billingPackage;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import pom.BillingPage;
import pom.LogInPage;

public class SearchByOtherDetails extends BaseTest
{
	@Test
	public void testSearchByOtherDetails() throws InterruptedException 
	{
		String un = Excel.getCellData(INPUT, "Validinput", 1, 0);
		String pwd = Excel.getCellData(INPUT, "Validinput", 1, 1);
		String PhoneNumber = Excel.getCellData(INPUT, "BillingFields", 5, 5);
		String IDno = Excel.getCellData(INPUT, "BillingFields", 6, 5);
		String DOB = Excel.getCellData(INPUT, "BillingFields", 7, 5);
		
		LogInPage logIn = new LogInPage(driver);
		logIn.setUsername(un); // enter the User name
		logIn.setPassword(pwd); // enter the password
		logIn.clickChooseModule(); //click on choose module
		logIn.clickBilling(); //Click on Receipts Module
		logIn.clickLogin();   // click on login button
		
		BillingPage bp = new BillingPage(driver);
		bp.VerifyUHIDName();
		bp.setName(PhoneNumber);
		bp.clickClear();
		bp.setName(IDno);
		bp.clickClear();
		bp.setName(DOB);
		bp.clickClear();
	}


}
