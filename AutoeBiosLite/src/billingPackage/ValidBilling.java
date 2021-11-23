package billingPackage;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import pom.BillingPage;
import pom.LogInPage;

public class ValidBilling extends BaseTest{
	
	@Test
	public void testValidBillingsave() throws InterruptedException 
	{
		String un = Excel.getCellData(INPUT, "Validinput", 1, 0);
		String pwd = Excel.getCellData(INPUT, "Validinput", 1, 1);
		//String UHIDNo = Excel.getCellData(INPUT, "Billing", 0, 0);
		String UHID = Excel.getCellData(INPUT, "Receipts",1, 1);
		
		LogInPage logIn = new LogInPage(driver);
		logIn.setUsername(un); // enter the Username
		logIn.setPassword(pwd); // enter the password
		logIn.clickChooseModule(); //click on choose module
		logIn.clickBilling(); //Click on Receipts Module
		logIn.clickLogin();   // click on login button
		
		BillingPage billing = new BillingPage(driver);
		            
		            
		 			billing.setUHIDNo(UHID);
		 			Thread.sleep(10);
		 			billing.AlertClose();
//		 			billing.SelectHospRadio();
//		 			billing.clickDeptDropdown();
//		 			billing.setClinicalLab();
//		 			billing.clickOkay();
		 			for(int n=3;n<=6;n++) {
		 				String code = Excel.getCellData(INPUT, "Billing", n, 1);	
		 			    billing.AddServices(code);
		 			}
		 			billing.clickSave();
		 			
		 			
	}

}
