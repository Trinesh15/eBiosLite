package revisit;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import pom.LogInPage;
import pom.RevisitPage;

public class SearchLastName extends BaseTest
{
	@Test
	private void testSearchLastName() throws InterruptedException 
	{
		String un = Excel.getCellData(INPUT, "Validinput", 1, 0);
		String pwd = Excel.getCellData(INPUT, "Validinput", 1, 1);
		String Fname = Excel.getCellData(INPUT, "Re-visit", 4,4);
		
		LogInPage logIn = new LogInPage(driver);
		logIn.setUsername(un); // enter the User name
		logIn.setPassword(pwd); // enter the password
		logIn.clickChooseModule(); //click on choose module
		logIn.clickRevisit(); //Click on revisit Module
		logIn.clickLogin();   // click on login button
		
		RevisitPage rp = new RevisitPage(driver);
		rp.setUHIDno(Fname);

	}

}
