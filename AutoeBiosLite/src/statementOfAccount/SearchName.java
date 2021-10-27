package statementOfAccount;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import pom.BasePage;
import pom.LogInPage;
import pom.NavigateToPages;
import pom.StatementofAccountPage;

public class SearchName extends BaseTest
{
	@Test
	public void testSearchName()
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
		NavigateToPages  navigate = new NavigateToPages(driver);
		navigate.NaviagetToStatementofAccount();
		SOA.setUHID(UHID);
		
	}

}
