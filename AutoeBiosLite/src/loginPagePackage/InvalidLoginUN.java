package loginPagePackage;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import pom.LogInPage;

public class InvalidLoginUN extends BaseTest
{
	@Test
	public void testInvalidLoginUN() {
		String un = Excel.getCellData(INPUT, "LoginCredentials", 4, 0);
		String pwd = Excel.getCellData(INPUT, "LoginCredentials", 5, 0);
		
		LogInPage logIn = new LogInPage(driver);
				logIn.VerifyLoginPageTitle();
				logIn.setUsername(un);
				logIn.setPassword(pwd);
				logIn.clickLogin();
				logIn.VerifyLoginPageTitle();
				
	}

}
