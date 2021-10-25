package loginPagePackage;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import pom.LogInPage;

public class MultiuserLogin extends BaseTest {
	String url;

	@Test
	public void testMultiuserLogin() {
		String un = Excel.getCellData(INPUT, "Validinput", 1, 0);
		String pwd = Excel.getCellData(INPUT, "Validinput", 1, 1);

		LogInPage logIn = new LogInPage(driver);
		logIn.VerifyLoginPageTitle();
		logIn.setUsername(un);
		logIn.setPassword(pwd);
		logIn.clickLogin();
		logIn.VerifyHomeTitle();
		url = driver.getCurrentUrl();
		//driver.close();
		driver.get(url);
		logIn.setUsername(un);
		logIn.setPassword(pwd);
		logIn.clickLogin();
		logIn.VerifyMultiUserValidation();
		

	}

}
