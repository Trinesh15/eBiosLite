package revisit;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import pom.LogInPage;
import pom.RevisitPage;

public class VerifyInsuranceinGrid extends BaseTest
{
	
	@Test
	private void testverifyInsurancetab() throws InterruptedException 
	{
		String un = Excel.getCellData(INPUT, "Validinput", 1, 0);
		String pwd = Excel.getCellData(INPUT, "Validinput", 1, 1);
		String uhid = Excel.getCellData(INPUT, "Re-visit", 2, 12);
		String Holdername = Excel.getCellData(INPUT, "Re-visit", 12, 12);
		String Holdernum = Excel.getCellData(INPUT, "Re-visit", 13, 12);
		
		LogInPage logIn = new LogInPage(driver);
		logIn.setUsername(un); // enter the User name
		logIn.setPassword(pwd); // enter the password
		logIn.clickChooseModule(); //click on choose module
		logIn.clickRevisit(); //Click on revisit Module
		logIn.clickLogin();   // click on login button
		
		RevisitPage rp = new RevisitPage(driver);
		rp.setUHIDno(uhid);
		rp.clickInsdetails();
		rp.clickAddNewIns();
		rp.verifyNewPatInsurance();
		rp.clickonInsuranceDD();
		rp.clicAMStudioinINSDD();
		rp.setPolicyHolderName(Holdername);
		rp.setPolicyNumber(Holdernum);
		rp.clickRelationDD();
		rp.selectMother();
		rp.clickOKinINSpoup();
		rp.verifyInsNameinInsDetails();
		
	}

}
