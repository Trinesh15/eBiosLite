package statementOfAccount;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import pom.LogInPage;
import pom.StatementofAccountPage;

public class VerifySummaryA5 extends BaseTest
{
	@Test
	public void testVerifySummaryA5()
	{
		//reading data from the excel
		String un = Excel.getCellData(INPUT, "Validinput", 1, 0);
		String pwd = Excel.getCellData(INPUT, "Validinput", 1, 1);
		String UHID = Excel.getCellData(INPUT, "SOA", 1, 1);
		
		//creating object of login page and access the required methods.
		LogInPage logIn = new LogInPage(driver);
		logIn.setUsername(un); // enter the Username
		logIn.setPassword(pwd); // enter the password
		logIn.clickChooseModule(); //click on choose module
		logIn.clickStatementOfAccount();  // click on billing module
		logIn.clickLogin();   // click on login button
		
		//Creating object of Statement of Account Page
		StatementofAccountPage SOA = new StatementofAccountPage(driver);
		SOA.setUHID(UHID); //enter the UHID
		SOA.clickSummary(); //Click on Summary Button
		SOA.clickA5();; //Click on PrintA5 radio button
		SOA.clickYes(); //Click on Yes Button
		//print
	}

}
