package statementOfAccount;

import org.junit.Test;

import generic.BaseTest;
import generic.Excel;
import pom.LogInPage;

public class AdmittedpatientSearch extends BaseTest
{
	@Test
	public void testAdmittedpatientSearch()
	{
		String un = Excel.getCellData(INPUT, "Validinput", 1, 0);
		String pwd = Excel.getCellData(INPUT, "Validinput", 1, 1);
		
		LogInPage logIn = new LogInPage(driver);
		logIn.setUsername(un); 
		logIn.setPassword(pwd);
//		logIn.clickChooseModule();
//		logIn.clickAdmission();
		logIn.clickLogin();
//		Enter the patient UHID
//		Select the Ward and bed
//		Enter reason for admission
//		Click on save
//		Navigate to SOA
//		click on advance search
//		search for the admitted patient
		
		
	}

}
