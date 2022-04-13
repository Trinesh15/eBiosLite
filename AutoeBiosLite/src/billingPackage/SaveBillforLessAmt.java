package billingPackage;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import pom.BillingPage;
import pom.LogInPage;

public class SaveBillforLessAmt extends BaseTest
{
	@Test
	public void testSaveBillforLessAmt() throws InterruptedException 
	{
		String un = Excel.getCellData(INPUT, "Validinput", 1, 0);
		String pwd = Excel.getCellData(INPUT, "Validinput", 1, 1);
		String UHID = Excel.getCellData(INPUT, "BillingFields", 2, 13);
		String Amt =  Excel.getCellData(INPUT, "BillingFields", 11, 13);
		
		LogInPage logIn = new LogInPage(driver);
		logIn.setUsername(un); // enter the User name
		logIn.setPassword(pwd); // enter the password
		logIn.clickChooseModule(); //click on choose module
		logIn.clickBilling(); //Click on Billing Module
		logIn.clickLogin();   // click on login button
		
		BillingPage bp = new BillingPage(driver);
		bp.setUHIDNo(UHID);
		// reading data from excel using for loop
		for(int n=8;n<=9;n++) 
		{
			String code = Excel.getCellData(INPUT, "BillingFields", n, 13);	
			bp.AddServices(code);
		}
		bp.ScrolltoPayment();
		bp.selectCash();
		bp.setAmttextfield(Amt);
		bp.clickSave();
		bp.clickSummary();
		bp.clickA4();
		bp.clickPrintYes();
		Thread.sleep(2000);
		bp.closeInvoicePopup();
		bp.closeReceiptPopup();
	}

}