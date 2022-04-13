package chargesheetPackage;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import pom.ChargeSheetPage;
import pom.LogInPage;

public class CancelDeleteService extends BaseTest
{
	@Test
	public void testCancelDeleteService() throws InterruptedException
	{
		//reading data from the excel
		String un = Excel.getCellData(INPUT, "Validinput", 1, 0);
		String pwd = Excel.getCellData(INPUT, "Validinput", 1, 1);
		String UHID = Excel.getCellData(INPUT, "ChargeSheet", 7, 1);
		String services = Excel.getCellData(INPUT, "ChargeSheet", 13, 1);
		
		//creating object of login page and access the required methods.
		LogInPage logIn = new LogInPage(driver);
		logIn.setUsername(un); // enter the Username
		logIn.setPassword(pwd); // enter the password
		logIn.clickChooseModule(); //click on choose module
		logIn.clickChargesheet();//click on Charge sheet module
		logIn.clickLogin();   // click on login button
				
		//creating object of login page and access the required methods.
		ChargeSheetPage cs = new ChargeSheetPage(driver);
		cs.clickonSearch();
		cs.VerifyAdvSearchPage();
		cs.setSearchResult(UHID);
		cs.VerifyPatientDetailsinAdv();
		cs.clickPatientDetailsinAdv();
		cs.clickOkAdvSearch();
		cs.clickokinBillgenerated();
		cs.VerifyPatientDemographiclink();
		cs.addservices(services);
		cs.clickDeleteServices();
		cs.Verifyservicedeletepopup();
		cs.clickcancelinservicedeletepopup();
	}

}
