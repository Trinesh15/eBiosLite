package billingPackage;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import pom.BillingPage;
import pom.LogInPage;

public class ApplyDiscountinCash extends BaseTest
{
	@Test
	public void testApplyDiscountinPercent() throws InterruptedException 
	{
		String un = Excel.getCellData(INPUT, "Validinput", 1, 0);
		String pwd = Excel.getCellData(INPUT, "Validinput", 1, 1);
		String UHID = Excel.getCellData(INPUT, "Billing", 32, 3);
		String DrDisc = Excel.getCellData(INPUT, "Billing", 36, 3);
		String HospDisc = Excel.getCellData(INPUT, "Billing", 37, 3);
		
		LogInPage logIn = new LogInPage(driver);
		logIn.setUsername(un); // enter the User name
		logIn.setPassword(pwd); // enter the password
		logIn.clickChooseModule(); //click on choose module
		logIn.clickBilling(); //Click on Receipts Module
		logIn.clickLogin();   // click on login button
		
		BillingPage bp = new BillingPage(driver);
		bp.setUHIDNo(UHID);
		for(int n=33; n<=34; n++) 
		{
			String services = Excel.getCellData(INPUT, "Billing", n, 3);
			bp.AddServices(services);
		}
		bp.ScrolltoPayment();
		bp.clickDrDiscSlider();
		bp.setDrDiscount(DrDisc);
		bp.clickHospDiscSlider();
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
