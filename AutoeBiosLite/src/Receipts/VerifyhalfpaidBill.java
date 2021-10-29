package Receipts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import pom.BillingPage;
import pom.LogInPage;
import pom.NavigateToPages;
import pom.ReceiptsPage;

public class VerifyhalfpaidBill extends BaseTest
{
	@Test
	public void testverifyBillinReceipts() throws InterruptedException
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
		bp.AlertClose();
		String  billcode =  bp.getInvoiceCode();
		for(int n=7;n<=10;n++) 
		{
		String code = Excel.getCellData(INPUT, "SOA", n, 1);	
		bp.AddServices(code);
		}
		bp.clickIntroducingSource();
		bp.setPrimaryIntroSource();
		bp.ScrolltoPayment();
		String netAmt = bp.checkTotalNetAmt();
		bp.selectCash();
//		bp.clearAmtTextbox();
		bp.EnterBillAmount(netAmt);
		bp.clickSave();
		bp.clickPrintNo();
		
		ReceiptsPage rp = new ReceiptsPage(driver);
		NavigateToPages  navigate = new NavigateToPages(driver);
		navigate.NaviagetToReceipts();
		rp.setUHID(UHID); 	
		rp.clickOkinAlert();
		rp.selectAndPayBill(billcode);
		rp.scrollpagetoCash();
		rp.clickonCashButton();
		rp.clickonSaveButton();
		rp.VerifyReceiptPage(); 
		
	}
		

}
