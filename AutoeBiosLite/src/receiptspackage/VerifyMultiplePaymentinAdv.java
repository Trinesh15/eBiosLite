package receiptspackage;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import pom.LogInPage;
import pom.ReceiptsPage;

public class VerifyMultiplePaymentinAdv extends BaseTest
{
	@Test
	public void testVerifyMultiplePaymentinAdv() throws InterruptedException
	{
		//reading data from the excel
		String un = Excel.getCellData(INPUT, "Validinput", 1, 0);
		String pwd = Excel.getCellData(INPUT, "Validinput", 1, 1);
		String UHID = Excel.getCellData(INPUT, "Receipts",1, 1);
		String Amount = Excel.getCellData(INPUT, "Receipts", 3, 1);
		//String MpOptions = Excel.getCellData(INPUT, "Receipts", 1, 5);
		String Refnum = Excel.getCellData(INPUT, "Receipts", 14, 1);
		
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
				rp.clickAdvance();
				rp.Outstandingbill();
				rp.scrollpagetoCash();
				rp.clickonMultiplePaymentButton();
				rp.clickPaymenttypeDd();
				rp.ClickChequein1st();
				rp.clickAmountinPatient();
				rp.setAmountinPatient(Amount);
				rp.setReferenceNumberin1st(Refnum);
				rp.clickBankDd();
				rp.clickonAlphaBank();
				rp.clickNew();
				rp.ClickAmountin2nd();
				rp.setAmountin2nd(Amount);
				rp.clickonSaveButton();
				rp.clickCloseReceipt();
	}

}
