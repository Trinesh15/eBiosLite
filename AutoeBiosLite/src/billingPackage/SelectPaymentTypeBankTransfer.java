package billingPackage;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import pom.BillingPage;
import pom.LogInPage;

public class SelectPaymentTypeBankTransfer extends BaseTest
{
	@Test
	public void testSelectPaymentTypeBankTransfer() throws InterruptedException 
	{
		String un = Excel.getCellData(INPUT, "Validinput", 1, 0);
		String pwd = Excel.getCellData(INPUT, "Validinput", 1, 1);
		String UHID = Excel.getCellData(INPUT, "BillingFields", 2, 9);
		String RefNum = Excel.getCellData(INPUT, "BillingFields", 10, 9);
		
		LogInPage logIn = new LogInPage(driver);
		logIn.setUsername(un); // enter the User name
		logIn.setPassword(pwd); // enter the password
		logIn.clickChooseModule(); //click on choose module
		logIn.clickBilling(); //Click on Receipts Module
		logIn.clickLogin();   // click on login button
		
		BillingPage bp = new BillingPage(driver);
		bp.setUHIDNo(UHID);
		// reading data from excel using for loop
		for(int n=8;n<=9;n++) 
		{
			String code = Excel.getCellData(INPUT, "BillingFields", n, 9);	
			bp.AddServices(code);
		}
		bp.ScrolltoPayment();
		bp.selectBankTransfer();
		bp.setReferenceNumber(RefNum);
		bp.clickBankDropDown();
		bp.clickAlphaBank();
		bp.clickSave();
		bp.clickDetailed();
		bp.clickA4();
		bp.clickPrintYes();
		Thread.sleep(2000);
		bp.closeInvoicePopup();
		bp.closeReceiptPopup();
	}

}