package billingPackage;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import pom.BillingPage;
import pom.LogInPage;

public class AddPhysicianforServices extends BaseTest
{
	@Test
	public void testAddPhysicianforServices() throws InterruptedException 
	{
		String un = Excel.getCellData(INPUT, "Validinput", 1, 0);
		String pwd = Excel.getCellData(INPUT, "Validinput", 1, 1);
		String UHID = Excel.getCellData(INPUT, "Billing", 20, 3);
		String services = Excel.getCellData(INPUT, "Billing", 21, 3);
		
		LogInPage logIn = new LogInPage(driver);
		logIn.setUsername(un); // enter the User name
		logIn.setPassword(pwd); // enter the password
		logIn.clickChooseModule(); //click on choose module
		logIn.clickBilling(); //Click on Receipts Module
		logIn.clickLogin();   // click on login button
		
		BillingPage bp = new BillingPage(driver);
		bp.setUHIDNo(UHID);
		bp.AddServices(services);
		bp.verifySelectPhysician();
		bp.clickPhysicianDropdown();
		bp.clickPhysicianAdamosAdamou();
		bp.clickOKinPhysicianPopup();
		bp.ScrolltoPayment();
		bp.selectCash();
		bp.clickSave(); 
		bp.clickSummary();
		bp.clickA5();
		bp.clickPrintYes();
		Thread.sleep(2000);
		bp.closeInvoicePopup();
		bp.closeReceiptPopup();
		
	}

}
