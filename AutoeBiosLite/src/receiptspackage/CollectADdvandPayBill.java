package receiptspackage;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import pom.BillingPage;
import pom.LogInPage;
import pom.NavigateToPages;
import pom.ReceiptsPage;

public class CollectADdvandPayBill extends BaseTest
{
	@Test
	public void testCollectADdvandPayBill() throws InterruptedException
	{
		//reading data from the excel
		String un = Excel.getCellData(INPUT, "Validinput", 1, 0);
		String pwd = Excel.getCellData(INPUT, "Validinput", 1, 1);
		String UHID = Excel.getCellData(INPUT, "Receipts",1, 1);
		String Amt = Excel.getCellData(INPUT, "Receipts", 3, 1);
		String code = Excel.getCellData(INPUT, "Billing", 3, 1);
		
		//creating object of login page and access the required methods.
				LogInPage logIn = new LogInPage(driver);
				logIn.setUsername(un); // enter the Username
				logIn.setPassword(pwd); // enter the password
				logIn.clickChooseModule(); //click on choose module
				logIn.clickReceipts(); //Click on Receipts Module
				logIn.clickLogin();   // click on login button
				
				ReceiptsPage rp = new ReceiptsPage(driver);
				rp.setUHID(UHID);
				rp.clickOkinAlert();
				rp.clickSearch();
				rp.clickAdvance();
				driver.switchTo().alert().accept();
				rp.clickonCashButton();
				rp.clickAmt();
				rp.setAmount(Amt);
				rp.clickonSaveButton();
				rp.clickCloseReceipt();
				
				BillingPage bp = new BillingPage(driver);
				NavigateToPages  navigate = new NavigateToPages(driver);
				navigate.NaviagetToBilling();
				bp.setUHIDNo(UHID);
				bp.AlertClose();				
				bp.AddServices(code);
				bp.clickIntroducingSource();
				bp.setPrimaryIntroSource();
				bp.clickSave(); 
				bp.clickPrintYes();
				bp.verifyInvoicePagePopup();
				bp.closeInvoicePopup();
	}

}
