package billingPackage;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import pom.BillingPage;

public class ValidBilling extends BaseTest{
	
	@Test
	public void testValidBillingsave() throws InterruptedException {
		String UHIDNo = Excel.getCellData(INPUT, "Billing", 0, 0);
		
		BillingPage billing = new BillingPage(driver);
		            
		            
		 			billing.setUHIDNo(UHIDNo);
		 			Thread.sleep(10);
//		 			billing.SelectHospRadio();
//		 			billing.clickDeptDropdown();
//		 			billing.setClinicalLab();
//		 			billing.clickOkay();
		 			for(int n=1;n<=4;n++) {
		 				String code = Excel.getCellData(INPUT, "Billing", n, 0);	
		 			    billing.AddServices(code);
		 			}
		 			billing.clickSave();
		 			
		 			
	}

}
