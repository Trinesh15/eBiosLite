package statementOfAccount;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import pom.BillingPage;
import pom.LogInPage;

public class RefundAmount extends BaseTest
{
	@Test
	public void testVerifyInvoiceDetailed() throws InterruptedException
	{
		//reading data from the excel
		String un = Excel.getCellData(INPUT, "Validinput", 1, 0);
		String pwd = Excel.getCellData(INPUT, "Validinput", 1, 1);
		String UHID = Excel.getCellData(INPUT, "SOA",12, 1);
		
		//creating object of login page and access the required methods.
		LogInPage logIn = new LogInPage(driver);
		logIn.setUsername(un); // enter the Username
		logIn.setPassword(pwd); // enter the password
		logIn.clickChooseModule(); //click on choose module
		logIn.clickBilling();  // click on billing module
		logIn.clickLogin();   // click on login button
		
		//creating object of login page and access the required methods.
		BillingPage bp = new BillingPage(driver);
		bp.setUHIDNo(UHID);
		// reading data from excel using for loop
		for(int n=7;n<=10;n++) 
		{
		String code = Excel.getCellData(INPUT, "SOA", n, 1);	
		bp.AddServices(code);
		}
		bp.clickIntroducingSource();
		bp.setPrimaryIntroSource();
		String netAmt = bp.checkTotalNetAmt();
		System.out.println(netAmt);
		bp.selectCash();
		bp.clickSave();
		bp.clickPrintNo();
		
		//Refund Module
	}

}
