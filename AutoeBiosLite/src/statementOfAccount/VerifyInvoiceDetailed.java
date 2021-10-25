package statementOfAccount;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import pom.BillingPage;
import pom.LogInPage;
import pom.StatementofAccountPage;
import pom.UserProfileOption;

public class VerifyInvoiceDetailed extends BaseTest
{
	@Test
	public void testVerifyInvoiceDetailed() throws InterruptedException
	{
		//reading data from the excel
		String un = Excel.getCellData(INPUT, "Validinput", 1, 0);
		String pwd = Excel.getCellData(INPUT, "Validinput", 1, 1);
		String UHID = Excel.getCellData(INPUT, "SOA",16, 1);
		
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
		//bp.clickOkay();
		//bp.AlertClose();
		// reading data from excel using for loop
		for(int n=7;n<=10;n++) 
		{
		String code = Excel.getCellData(INPUT, "SOA", n, 1);	
		bp.AddServices(code);
		}
		bp.clickIntroducingSource();
		bp.setPrimaryIntroSource();
		String netAmt = bp.checkTotalNetAmt();
		String invcode = bp.getInvoiceCode();
		System.out.println(netAmt);
		bp.clickSave();
		bp.SaveBillForZero();
		bp.clickPrintNo();
		
		StatementofAccountPage SOA = new StatementofAccountPage(driver);
		
		SOA.setUHID(UHID);
		SOA.GetBillandReceiptCodes(invcode);
		SOA.clickDetailed();
		SOA.VerifyInvoicePopup();
		SOA.clickNo();
		UserProfileOption up = new UserProfileOption(driver);
		up.ClickOnUserName();
		up.ClickLogout();
	}


}
