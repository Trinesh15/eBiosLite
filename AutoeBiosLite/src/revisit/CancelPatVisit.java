package revisit;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import pom.LogInPage;
import pom.RevisitPage;

public class CancelPatVisit extends BaseTest
{
	@Test
	private void testverifyInsurancetab() throws InterruptedException 
	{
		String un = Excel.getCellData(INPUT, "Validinput", 1, 0);
		String pwd = Excel.getCellData(INPUT, "Validinput", 1, 1);
		String uhid = Excel.getCellData(INPUT, "Re-visit", 2, 13);

		LogInPage logIn = new LogInPage(driver);
		logIn.setUsername(un); // enter the User name
		logIn.setPassword(pwd); // enter the password
		logIn.clickChooseModule(); //click on choose module
		logIn.clickRevisit(); //Click on revisit Module
		logIn.clickLogin();   // click on login button

		RevisitPage rp = new RevisitPage(driver);
		rp.setUHIDno(uhid);
		rp.ClickPICDropdown();
		rp.SelectLocalpatient();
		rp.setPhysicianVisit();
		rp.clickPhyDropdown();
		rp.setNestorasMichael();
		rp.clickSave();
		rp.clickokinRecSavpopup();
		Thread.sleep(2000);
		rp.clickAdvBtn();
		rp.clickFirstPatinWaiting();
		rp.clickCancelinAdvSearch();
		rp.clickokinPopup();
		Thread.sleep(2000);
		rp.ClickOKinSucessfulpoup();

	}

}
