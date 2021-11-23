package receiptspackage;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import pom.BillingPage;
import pom.LogInPage;
import pom.NavigateToPages;
import pom.ReceiptsPage;

public class PayOSBalanceByCheque extends BaseTest
{
	@Test
	public void testPayOSBalanceByCheque() throws InterruptedException
	{
		//reading data from the excel
		String un = Excel.getCellData(INPUT, "Validinput", 1, 0);
		String pwd = Excel.getCellData(INPUT, "Validinput", 1, 1);
		String UHID = Excel.getCellData(INPUT, "Receipts",1, 1);
		String Amt = Excel.getCellData(INPUT, "Receipts", 3, 1);
		
		//creating object of login page and access the required methods.
				LogInPage logIn = new LogInPage(driver);
				logIn.setUsername(un); // enter the Username
				logIn.setPassword(pwd); // enter the password
				logIn.clickChooseModule(); //click on choose module
				logIn.clickBilling(); //Click on Receipts Module
				logIn.clickLogin();   // click on login button
				
				BillingPage bp = new BillingPage(driver);
				bp.setUHIDNo(UHID);
				bp.AlertClose();
				Thread.sleep(2000);
				for(int n=3;n<=6;n++) {
	 				String code = Excel.getCellData(INPUT, "Billing", n, 1);	
	 			    bp.AddServices(code);
	 			}
				bp.clickIntroducingSource();
				bp.setPrimaryIntroSource();
				bp.clickSave();  	
				driver.switchTo().alert().accept();
				bp.clickPrintYes();
				//bp.verifyInvoicePagePopup();
				bp.closeInvoicePopup();
				
				ReceiptsPage rp = new ReceiptsPage(driver);
				NavigateToPages  navigate = new NavigateToPages(driver);
				navigate.NaviagetToReceipts();
				rp.setUHID(UHID);
				rp.clickOkinAlert(); 
				rp.clickRecentBill();
				rp.scrollpagetoCash();
				rp.clickonChequeButton();
				rp.clickonBankDropDown();
				rp.clickonAlphaBank();
				rp.clickAmt();
				rp.setAmount(Amt);
				rp.clickonSaveButton();
				rp.clickCloseReceipt();

	}


}
