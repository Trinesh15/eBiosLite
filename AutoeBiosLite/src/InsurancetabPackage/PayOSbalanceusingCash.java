package InsurancetabPackage;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import pom.BillingPage;
import pom.LogInPage;
import pom.NavigateToPages;
import pom.ReceiptsPage;

public class PayOSbalanceusingCash extends BaseTest
{
	@Test
	public void testPayOSbalanceusingCash() throws InterruptedException
	{
		//reading data from the excel
		String un = Excel.getCellData(INPUT, "Validinput", 1, 0);
		String pwd = Excel.getCellData(INPUT, "Validinput", 1, 1);
		String UHID = Excel.getCellData(INPUT, "SOA",12, 1);
		String service = Excel.getCellData(INPUT, "Billing", 3, 1);
		String Inscode = Excel.getCellData(INPUT, "Insurancetab", 3, 1);
		String Amt = Excel.getCellData(INPUT, "Receipts", 3, 1);
		
		//creating object of login page and access the required methods.
		LogInPage logIn = new LogInPage(driver);
		logIn.setUsername(un); // enter the Username
		logIn.setPassword(pwd); // enter the password
		logIn.clickChooseModule(); //click on choose module
		logIn.clickBilling();//click on Billing module
		logIn.clickLogin();   // click on login button
		
		
		//creating object of login page and access the required methods.
		BillingPage bp = new BillingPage(driver);
		bp.setUHIDNo(UHID);
		bp.AlertClose();
		bp.AddServices(service);
		bp.ScrolltoPayment();
		bp.selectInsurance();
		bp.SelectInsuranceCarrier();
		bp.SelectAMStudioOzz();
		bp.clearAmtTextbox();
		bp.clickSave();
		bp.SaveBillForZero();
		//bp.InusrancepaymentAlert();
		bp.clickPrintNo();
		
		ReceiptsPage rp = new ReceiptsPage(driver);
		NavigateToPages  navigate = new NavigateToPages(driver);
		navigate.NaviagetToReceipts();
		rp.setUHID(UHID);
		rp.clickOkinAlert();
		rp.clickRecentPatient();
		rp.scrollpagetoCash();
		rp.clickInsurancePayemnt();
		rp.clickonInsuranceCarrier();
		rp.clickonAMStudio();
		rp.clickonSaveButton();
		rp.clickCloseReceipt();
		rp.clickInsurance();
		rp.verfiyInsuranceCode();
		rp.setInsuranceNameorCode(Inscode);
		rp.verifyInsuranceTab();
		rp.clickRecentPatdetails();
		rp.clickCashinInsurace();
		rp.clickSaveButtoninIns();
		rp.closeReceiptinIns();
	}

}
