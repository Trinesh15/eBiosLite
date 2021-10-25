package scripts;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import pom.LogInPage;

public class Validlogin extends BaseTest {
	
	@Test
	public void testValidLogin() {
		String un = Excel.getCellData(INPUT, "Validinput", 1, 0);
		String pwd = Excel.getCellData(INPUT, "Validinput", 1, 1);
		
		LogInPage logIn = new LogInPage(driver);
				logIn.setUsername(un);
				logIn.setPassword(pwd);
				logIn.clickChooseModule();
				logIn.clickRegistration();
				logIn.clickLogin();
				logIn.VerifyRegistrationTitle();	
				
	}

}
