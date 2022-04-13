package billingPackage;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import pom.BillingPage;
import pom.LogInPage;

public class SaveMedandSerOPBillforZero extends BaseTest
{
	@Test
	public void testSaveMedandSerOPBillforZero() throws InterruptedException 
	{
		String un = Excel.getCellData(INPUT, "Validinput", 1, 0);
		String pwd = Excel.getCellData(INPUT, "Validinput", 1, 1);
		String UHID = Excel.getCellData(INPUT, "Billing", 6, 3);
		String medication1 = Excel.getCellData(INPUT, "Billing", 7, 3);
		String medication2 = Excel.getCellData(INPUT, "Billing", 8, 3);
		
		LogInPage logIn = new LogInPage(driver);
		logIn.setUsername(un); // enter the User name
		logIn.setPassword(pwd); // enter the password
		logIn.clickChooseModule(); //click on choose module
		logIn.clickBilling(); //Click on Receipts Module
		logIn.clickLogin();   // click on login button
		
		BillingPage bp = new BillingPage(driver);
		bp.setUHIDNo(UHID);
		for(int n=13;n<=14;n++) 
		{
			String code = Excel.getCellData(INPUT, "Billing", n, 1);	
			bp.AddServices(code);
		}
		bp.clickServiceSlider();
		bp.clickDepartmentDD();
		bp.clickHospitalmainstores();
		bp.clickOKinSelectDept();
		bp.AddMedications(medication1);
		bp.clickExpiryDateDD();
		bp.clickExpiryDate();
		bp.clickAddProducts();
		bp.AddMedications(medication2);
		bp.clickExpiryDateDD();
		bp.clickExpiryDate();
		bp.clickAddProducts();
		bp.ScrolltoPayment();
		bp.clickSave(); 
		bp.clickOKinalert();
		bp.clickSummary();
		bp.clickA5();
		bp.clickPrintYes();
		Thread.sleep(2000);
		bp.closeZeropaidInvoice();
	}
}
