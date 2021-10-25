package loginPagePackage;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import pom.LogInPage;

public class ValidloginForUser extends BaseTest {
	
	@Test
	public void testValidloginForUser() throws InterruptedException {
		String un = Excel.getCellData(INPUT, "validloginforUser", 0, 0);
		String pwd = Excel.getCellData(INPUT, "validloginforUser", 1, 0);
		
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
