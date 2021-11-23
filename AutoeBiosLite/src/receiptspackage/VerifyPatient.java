package receiptspackage;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import loginPagePackage.ReceiptsModule;
import pom.LogInPage;
import pom.NavigateToPages;
import pom.ReceiptsPage;
import pom.RegistrationPage;
import pom.StatementofAccountPage;

public class VerifyPatient extends BaseTest
{
	@Test
	public void testverifyPatient() throws InterruptedException
	{
		//reading data from the excel
		String un = Excel.getCellData(INPUT, "Validinput", 1, 0);
		String pwd = Excel.getCellData(INPUT, "Validinput", 1, 1);
		String Fname = Excel.getCellData(INPUT, "Registration", 1, 0);
		String Lname = Excel.getCellData(INPUT, "Registration", 2, 0);
		String Age = Excel.getCellData(INPUT, "Registration", 3, 0);
		String IDArc = Excel.getCellData(INPUT, "Registration", 4, 0);
		String PassportID = Excel.getCellData(INPUT, "Registration", 5, 0);
		String Mobile = Excel.getCellData(INPUT, "Registration", 6, 0);
		String UHID = Excel.getCellData(INPUT, "SOA",12, 1);
		
		
		LogInPage logIn = new LogInPage(driver);
		logIn.setUsername(un); // enter the Username
		logIn.setPassword(pwd); // enter the password
		logIn.clickChooseModule(); //click on choose module
		logIn.clickRegistration();  // click on billing module
		logIn.clickLogin();   // click on login button
		
		RegistrationPage rp = new RegistrationPage(driver);
		rp.clickTitle();
		rp.clickMr();
		rp.setFirstName(Fname);
		String bfrUHID = driver.findElement(By.id("cpBody_txtHospIdNo")).getAttribute("value");
		rp.UHIDbeforeSave();
		rp.setLastNmae(Lname);
		rp.clickAgeRadioBtn();
		rp.setAgeTextBox(Age);
		rp.clickpicdropdown();
		rp.clickLocalPatient();
		rp.setMobileno(Mobile);
		scrollpage("//div[@id='cpBody_cmbDepartment_chosen']//a");
		rp.clickdepartment();
		rp.clickClinicalLaboratory();
		rp.clickReferralSource();
		rp.clickAdamosAdamou_Ref();
		rp.clickSave();
		rp.RegSaveConfirmpopup();
		
		
		ReceiptsPage rc = new ReceiptsPage(driver);
		NavigateToPages  navigate = new NavigateToPages(driver);
		navigate.NaviagetToReceipts();
		rc.setUHID(bfrUHID);
		Thread.sleep(2000);

	}	

}
