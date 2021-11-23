package InsurancetabPackage;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import pom.LogInPage;
import pom.ReceiptsPage;

public class SearchbyInsuranceCode extends BaseTest
{
	@Test
	public void testVerfiycompletelyPaidBill() throws InterruptedException
	{
		//reading data from the excel
		String un = Excel.getCellData(INPUT, "Validinput", 1, 0);
		String pwd = Excel.getCellData(INPUT, "Validinput", 1, 1);
		String UHID = Excel.getCellData(INPUT, "SOA",12, 1);
		String Inscode = Excel.getCellData(INPUT, "Insurancetab", 1, 1);
		
		
		//creating object of login page and access the required methods.
		LogInPage logIn = new LogInPage(driver);
		logIn.setUsername(un); // enter the Username
		logIn.setPassword(pwd); // enter the password
		logIn.clickChooseModule(); //click on choose module
		logIn.clickReceipts();//click on receipts module
		logIn.clickLogin();   // click on login button
		
		
		//creating object of login page and access the required methods.
		ReceiptsPage rp = new ReceiptsPage(driver);
		rp.clickInsurance();
		rp.verfiyInsuranceCode();
		rp.setInsuranceNameorCode(Inscode);
		rp.verifyInsuranceTab();
	}

}
