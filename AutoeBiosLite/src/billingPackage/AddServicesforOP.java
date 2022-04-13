package billingPackage;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import pom.BillingPage;
import pom.LogInPage;

public class AddServicesforOP extends BaseTest
{
	@Test
	public void testAddServicesforOP() throws InterruptedException 
	{
		String un = Excel.getCellData(INPUT, "Validinput", 1, 0);
		String pwd = Excel.getCellData(INPUT, "Validinput", 1, 1);
		String UHID = Excel.getCellData(INPUT, "Billing", 11, 1);
		
		LogInPage logIn = new LogInPage(driver);
		logIn.setUsername(un); // enter the Username
		logIn.setPassword(pwd); // enter the password
		logIn.clickChooseModule(); //click on choose module
		logIn.clickBilling(); //Click on Receipts Module
		logIn.clickLogin();   // click on login button
		
		BillingPage bp = new BillingPage(driver);
		bp.setUHIDNo(UHID);
		// reading data from excel using for loop
		for(int n=13;n<=14;n++) 
		{
			String code = Excel.getCellData(INPUT, "Billing", n, 1);	
			bp.AddServices(code);
		}
		bp.clickServiceQuantity();
		bp.setServiceQuantity(UHID);
		bp.ScrolltoPayment();
		bp.selectCash();
		bp.clickSave();
		bp.clickDetailed();
		bp.clickA4();
		bp.clickPrintYes();
		Thread.sleep(2000);
		bp.closeInvoicePopup();
		bp.closeReceiptPopup();
	}

}
