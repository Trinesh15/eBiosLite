package scripts;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import pom.LogInPage;
import pom.RegistrationPage;

public class ValidRegistrationHospVisit extends BaseTest {
	

	
	@Test
	public void testValidRegistrationHV() throws InterruptedException {
		//Read Data From Excel
		String Fname = Excel.getCellData(INPUT, "Registration", 0, 0);
		String Lname = Excel.getCellData(INPUT, "Registration", 1, 0);
		String Age = Excel.getCellData(INPUT, "Registration", 2, 0);
		String IDArc = Excel.getCellData(INPUT, "Registration", 3, 0);
		String PassportID = Excel.getCellData(INPUT, "Registration", 4, 0);
		String Mobile = Excel.getCellData(INPUT, "Registration", 5, 0);
		String Addrs = Excel.getCellData(INPUT, "Registration", 6, 0);
		
		//lOGIN USER NAME AND PASSWORD
		String un = Excel.getCellData(INPUT, "Validinput", 1, 0);
	    String pwd = Excel.getCellData(INPUT, "Validinput", 1, 1);
	
        LogInPage logIn = new LogInPage(driver);
			      logIn.setUsername(un);
			      logIn.setPassword(pwd);
			      logIn.clickLogin();
		
	    RegistrationPage RegPage = new RegistrationPage(driver);
	    		//	 navigativeToRegistration();
				     RegPage.clickpicdropdown();
				     RegPage.clickGesy();
	                 RegPage.clickTitle();
	                 RegPage.clickBaby();
	          	     RegPage.setFirstName(Fname);
	                 RegPage.setLastNmae(Lname);
				     RegPage.setDOB(Age);
				     RegPage.clickSexDropDown();
				     RegPage.clickMale();
				     RegPage.setIDArcno(IDArc);
				     RegPage.setIntIDPassport(PassportID);
				     RegPage.setMobileno(Mobile);
//				     RegPage.clickDatPtotectionBox();
				     RegPage.setAddress(Addrs);
				     scrollpage("//div[@id='cpBody_cmbDepartment_chosen']//a");
				     RegPage.clickdepartment();
				     RegPage.clickClinicalLaboratory();
				     RegPage.clickReferralSource();
				     RegPage.clickAdamosAdamou_Ref();
				     RegPage.clickSave();
				     
				     
     }
	
}
