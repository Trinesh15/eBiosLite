package loginPagePackage;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import pom.LogInPage;

public class InvalidLoginPWD extends BaseTest
{
	@Test
	public void testInvalidLoginPWD() {
		String un = Excel.getCellData(INPUT, "LoginCredentials", 8, 0);
		String pwd = Excel.getCellData(INPUT, "LoginCredentials", 9, 0);
		
		LogInPage logIn = new LogInPage(driver);
				logIn.VerifyLoginPageTitle();
				logIn.setUsername(un);
				logIn.setPassword(pwd);
				logIn.clickLogin();
				logIn.VerifyLoginPageTitle();
				
	}

}
