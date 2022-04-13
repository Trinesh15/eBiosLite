package billingPackage;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import pom.BillingPage;
import pom.LogInPage;

public class DeleteMedications extends BaseTest
{
	@Test
	public void testDeleteMedications() throws InterruptedException 
	{
		String un = Excel.getCellData(INPUT, "Validinput", 1, 0);
		String pwd = Excel.getCellData(INPUT, "Validinput", 1, 1);
		String UHID = Excel.getCellData(INPUT, "Billing", 2,5);
		String medication1 = Excel.getCellData(INPUT, "Billing", 5, 5);
		String medication2 = Excel.getCellData(INPUT, "Billing", 6, 5);
		
		LogInPage logIn = new LogInPage(driver);
		logIn.setUsername(un); // enter the User name
		logIn.setPassword(pwd); // enter the password
		logIn.clickChooseModule(); //click on choose module
		logIn.clickBilling(); //Click on Receipts Module
		logIn.clickLogin();   // click on login button
		
		BillingPage bp = new BillingPage(driver);
		bp.setUHIDNo(UHID);
		for(int n= 3; n<=4; n++)
		{
			String services = Excel.getCellData(INPUT, "Billing", n, 5);
			bp.AddServices(services);
		}
		bp.clickServiceSlider();
		bp.verifySelectDept();
		bp.clickDepartmentDD();
		bp.clickHospitalmainstores();
		bp.clickOKinSelectDept();
		bp.AddMedications(medication1);
		bp.AddMedications(medication2);
		bp.clickDeleteMedic();
		bp.verifyDeleteAlertpopup();
		
	}

}
