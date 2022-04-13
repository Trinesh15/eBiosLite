package pom;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;

public class ApplyDiscountinPercent extends BaseTest
{
	@Test
	public void testApplyDiscountinPercent() throws InterruptedException 
	{
		String un = Excel.getCellData(INPUT, "Validinput", 1, 0);
		String pwd = Excel.getCellData(INPUT, "Validinput", 1, 1);
		String UHID = Excel.getCellData(INPUT, "Billing", 24, 3);
		String DrDisc = Excel.getCellData(INPUT, "Billing", 27, 3);
		String HospDisc = Excel.getCellData(INPUT, "Billing", 28, 3);
		
		LogInPage logIn = new LogInPage(driver);
		logIn.setUsername(un); // enter the User name
		logIn.setPassword(pwd); // enter the password
		logIn.clickChooseModule(); //click on choose module
		logIn.clickBilling(); //Click on Receipts Module
		logIn.clickLogin();   // click on login button
		
		BillingPage bp = new BillingPage(driver);
		bp.setUHIDNo(UHID);
		for(int n=25; n<=26; n++) 
		{
			String services = Excel.getCellData(INPUT, "Billing", n, 3);
			bp.AddServices(services);
		}
		bp.ScrolltoPayment();
		bp.setDrDiscount(DrDisc);
		bp.setHospDiscount(HospDisc);
		bp.clickApplyDiscount();
		bp.clickDiscApprovedByDD();
		bp.clickDiscApprovedbyAA();
		bp.selectCash();
		bp.clickSave();
		bp.clickSummary();
		bp.clickA4();
		bp.clickPrintYes();
		Thread.sleep(2000);
		bp.closeInvoicePopup();
		bp.closeReceiptPopup();
	}

}