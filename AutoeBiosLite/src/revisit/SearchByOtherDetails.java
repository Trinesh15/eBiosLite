package revisit;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import pom.LogInPage;
import pom.RevisitPage;

public class SearchByOtherDetails extends BaseTest
{
	@Test
	private void testSearchUHID() throws InterruptedException 
	{
		String un = Excel.getCellData(INPUT, "Validinput", 1, 0);
		String pwd = Excel.getCellData(INPUT, "Validinput", 1, 1);
		String PhoneNumber = Excel.getCellData(INPUT, "Re-visit", 5, 5);
		String IDno = Excel.getCellData(INPUT, "Re-visit", 6, 5);
		String DOB = Excel.getCellData(INPUT, "Re-visit", 7, 5);
		
		LogInPage logIn = new LogInPage(driver);
		logIn.setUsername(un); // enter the User name
		logIn.setPassword(pwd); // enter the password
		logIn.clickChooseModule(); //click on choose module
		logIn.clickRevisit(); //Click on revisit Module
		logIn.clickLogin();   // click on login button
		
		RevisitPage rp = new RevisitPage(driver);
		rp.setUHIDno(PhoneNumber);
		rp.clickclear();
		rp.setUHIDno(IDno);
		rp.clickclear();
		rp.setUHIDno(DOB);
		rp.clickclear();
	}

}
