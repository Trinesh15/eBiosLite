package billingPackage;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import pom.BillingPage;
import pom.LogInPage;

public class SearchServicesinGrid extends BaseTest
{
	@Test
	public void testSearchServicesinGrid() throws InterruptedException 
	{
		String un = Excel.getCellData(INPUT, "Validinput", 1, 0);
		String pwd = Excel.getCellData(INPUT, "Validinput", 1, 1);
		String UHID = Excel.getCellData(INPUT, "Billing", 37,5);
		String service = Excel.getCellData(INPUT, "Billing", 40, 5);
		
		
		LogInPage logIn = new LogInPage(driver);
		logIn.setUsername(un); // enter the User name
		logIn.setPassword(pwd); // enter the password
		logIn.clickChooseModule(); //click on choose module
		logIn.clickBilling(); //Click on Receipts Module
		logIn.clickLogin();   // click on login button
		
		BillingPage bp = new BillingPage(driver);
		bp.setUHIDNo(UHID);
		for(int n= 38; n<=39; n++)
		{
			String services = Excel.getCellData(INPUT, "Billing", n, 5);
			bp.AddServices(services);
		}
		bp.clickServiceSearch();
		bp.setextendedserivcesearch(service);
	}

}
