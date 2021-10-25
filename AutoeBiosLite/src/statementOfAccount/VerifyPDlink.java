package statementOfAccount;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import pom.LogInPage;
import pom.StatementofAccountPage;
import pom.UserProfileOption;

public class VerifyPDlink extends BaseTest
{
	@Test
	public void testVerifyPDlink()
	{
		String un = Excel.getCellData(INPUT, "Validinput", 1, 0);
		String pwd = Excel.getCellData(INPUT, "Validinput", 1, 1);
		String UHID = Excel.getCellData(INPUT, "SOA", 1, 1);
		
		LogInPage logIn = new LogInPage(driver);
		logIn.setUsername(un);
		logIn.setPassword(pwd);
		logIn.clickChooseModule();
		logIn.clickStatementOfAccount();
		logIn.clickLogin();
		
		StatementofAccountPage SOA = new StatementofAccountPage(driver);
		SOA.clickSearch();
		SOA.setUHID(UHID);
		SOA.selectUHID();
		SOA.clickOKbtn();
		SOA.clickClosebtn();
		SOA.VerifyPatientDemographiclink();
		
//		UserProfileOption up = new UserProfileOption(driver);
//		up.ClickOnUserName();
//		up.ClickLogout();
	}
}
