package statementOfAccount;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import pom.LogInPage;
import pom.UserProfileOption;

public class CheckSOA extends BaseTest
{
	@Test
	public void testChechkSOAmodule()
	{
		String un = Excel.getCellData(INPUT, "Validinput", 1, 0);
		String pwd = Excel.getCellData(INPUT, "Validinput", 1, 1);
		
		LogInPage logIn = new LogInPage(driver);
		logIn.setUsername(un);
		logIn.setPassword(pwd);
		logIn.clickChooseModule();
		logIn.clickStatementOfAccount();
		logIn.clickLogin();
		logIn.VerifyStatementOfAccountTitle();
		
		UserProfileOption up = new UserProfileOption(driver);
		up.ClickOnUserName();
		up.ClickLogout();
	}
	

}
