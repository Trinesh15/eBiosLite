package receiptspackage;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import pom.LogInPage;
import pom.NavigateToPages;
import pom.ReceiptsPage;
import pom.StatementofAccountPage;

public class VerifyPatientinSOA extends BaseTest
{
	@Test
	public void testVerifyTotalOSAmount() throws InterruptedException
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
				
				StatementofAccountPage SOA = new StatementofAccountPage(driver);
				NavigateToPages  navigate = new NavigateToPages(driver);
				navigate.NaviagetToStatementofAccount();
				SOA.setUHID(UHID);
				SOA.Alertclose();
				
	}


}
