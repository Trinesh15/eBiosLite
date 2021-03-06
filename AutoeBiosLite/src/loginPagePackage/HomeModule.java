package loginPagePackage;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import pom.LogInPage;

public class HomeModule extends BaseTest
{
	@Test
	public void testValidLogin() throws InterruptedException {
		String un = Excel.getCellData(INPUT, "Validinput", 1, 0);
		String pwd = Excel.getCellData(INPUT, "Validinput", 1, 1);
		
		LogInPage logIn = new LogInPage(driver);
				logIn.VerifyLoginPageTitle();
				logIn.setUsername(un);
				logIn.setPassword(pwd);
				logIn.clickChooseModule();
				logIn.clickHome();
				logIn.clickLogin();
				logIn.VerifyHomeTitle();
				
	}

}
