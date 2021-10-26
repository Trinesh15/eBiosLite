package statementOfAccount;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import pom.BasePage;
import pom.BillingPage;
import pom.LogInPage;
import pom.StatementofAccountPage;

public class VerifyInvoiceSummary extends BaseTest
{
	@Test
	public void testVerifyInvoiceSummary() throws InterruptedException
	{
		//reading data from the excel
		String un = Excel.getCellData(INPUT, "Validinput", 1, 0);
		String pwd = Excel.getCellData(INPUT, "Validinput", 1, 1);
		String UHID = Excel.getCellData(INPUT, "SOA",13, 1);
		
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
		for(int n=6;n<=9;n++) 
		{
		String code = Excel.getCellData(INPUT, "SOA", n, 0);	
		bp.AddServices(code);
		}
		bp.clickIntroducingSource();
		bp.setPrimaryIntroSource();
		String netAmt = bp.checkTotalNetAmt();
		String invcode = bp.getInvoiceCode();
		bp.clickSave();
		bp.SaveBillForZero();
		bp.clickPrintNo();
		
		StatementofAccountPage SOA = new StatementofAccountPage(driver);
		BasePage basepage = new BasePage(driver);
		basepage.NaviagetToStatementofAccount();
		SOA.setUHID(UHID);
		SOA.GetBillandReceiptCodes(invcode);
		SOA.clickSummary();
		SOA.VerifyInvoicePopup();
	}

}
