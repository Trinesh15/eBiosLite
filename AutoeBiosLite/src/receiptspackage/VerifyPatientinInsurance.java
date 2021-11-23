package receiptspackage;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import pom.LogInPage;
import pom.ReceiptsPage;

public class VerifyPatientinInsurance extends BaseTest
{
	@Test
	public void testVerifyPatientinInsurance() throws InterruptedException
	{
		//reading data from the excel
		String un = Excel.getCellData(INPUT, "Validinput", 1, 0);
		String pwd = Excel.getCellData(INPUT, "Validinput", 1, 1);
		String UHID = Excel.getCellData(INPUT, "Receipts",1, 1);
		String Amount = Excel.getCellData(INPUT, "Receipts", 3, 1);
		
		//creating object of login page and access the required methods.
				LogInPage logIn = new LogInPage(driver);
				logIn.setUsername(un); // enter the Username
				logIn.setPassword(pwd); // enter the password
				logIn.clickChooseModule(); //click on choose module
				logIn.clickReceipts(); //Click on Receipts Module
				logIn.clickLogin();   // click on login button
				
				ReceiptsPage rp = new ReceiptsPage(driver);
				rp.setUHID(UHID);
				rp.clickOkinAlert();
				rp.clickRecentBill();
				rp.clickInsurancePayemnt();
				rp.clickonInsuranceCarrier();
				rp.clickonAMStudio();
				rp.clickonSaveButton();
				rp.clickCloseReceipt();
				//rp.clickOkinAlert();
				rp.clickInsurance();
				rp.clickonInsuranceSearch();
				rp.ClickAmStudioinInsuranceSearch();
				rp.clickOkinInsuranceSearch();
				rp.VerifyFirstPatient();
				
	}

}
