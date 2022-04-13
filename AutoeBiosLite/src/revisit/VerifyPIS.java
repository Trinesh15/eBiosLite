package revisit;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import pom.LogInPage;
import pom.RevisitPage;

public class VerifyPIS extends BaseTest
{
	@Test
	private void testVerifyPIS() throws InterruptedException 
	{
		String un = Excel.getCellData(INPUT, "Validinput", 1, 0);
		String pwd = Excel.getCellData(INPUT, "Validinput", 1, 1);
		String PIS = Excel.getCellData(INPUT, "Re-visit", 9, 7);
		
		LogInPage logIn = new LogInPage(driver);
		logIn.setUsername(un); // enter the User name
		logIn.setPassword(pwd); // enter the password
		logIn.clickChooseModule(); //click on choose module
		logIn.clickRevisit(); //Click on revisit Module
		logIn.clickLogin();   // click on login button
		
		RevisitPage rp = new RevisitPage(driver);
		rp.clickprimaryIntrodropdown();
		rp.setPrimaryIntro(PIS);
		rp.verifyIntroducingSource();	


	}

}
