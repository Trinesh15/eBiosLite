package registrationPackage;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import pom.LogInPage;
import pom.RegistrationPage;

public class ValidRegistrationPhysicianVisit extends BaseTest {
	
	@Test
	public void testValidRegistrationPV() throws InterruptedException {
		// Read Data From Excel
		String Fname = Excel.getCellData(INPUT, "Registration", 1, 0);
		String Lname = Excel.getCellData(INPUT, "Registration", 2, 0);
		String Age = Excel.getCellData(INPUT, "Registration", 3, 0);
		String IDArc = Excel.getCellData(INPUT, "Registration", 4, 0);
		String PassportID = Excel.getCellData(INPUT, "Registration", 5, 0);
		String Mobile = Excel.getCellData(INPUT, "Registration", 6, 0);
		String Addrs = Excel.getCellData(INPUT, "Registration", 7, 0);
		String NokFname = Excel.getCellData(INPUT, "Registration", 8, 0);
		String NokLname = Excel.getCellData(INPUT, "Registration", 9, 0);
		String NokAdrs = Excel.getCellData(INPUT, "Registration", 10, 0);
		String NokMobNo = Excel.getCellData(INPUT, "Registration", 11, 0);
		String Nokppno = Excel.getCellData(INPUT, "Registration", 12, 0);
		String PolicyHolder = Excel.getCellData(INPUT, "Registration", 13, 0);
		String PolicyNo = Excel.getCellData(INPUT, "Registration", 14, 0);
		String GroupNo = Excel.getCellData(INPUT, "Registration", 15, 0);
		String Guarantor = Excel.getCellData(INPUT, "Registration", 16, 0);
		String Adrs1 = Excel.getCellData(INPUT, "Registration", 17, 0);
		String Adrs2 = Excel.getCellData(INPUT, "Registration", 18, 0);
		String PhNo1 = Excel.getCellData(INPUT, "Registration", 19, 0);
		String PhNo2 = Excel.getCellData(INPUT, "Registration", 20, 0);
		String InsRamarks = Excel.getCellData(INPUT, "Registration", 21, 0);
		String LinkUHID = Excel.getCellData(INPUT, "Registration", 22, 0);
		String LinkPatRmrk = Excel.getCellData(INPUT, "Registration", 23, 0);
		
		

		// lOGIN USER NAME AND PASSWORD
		String un = Excel.getCellData(INPUT, "Validinput", 1, 0);
		String pwd = Excel.getCellData(INPUT, "Validinput", 1, 1);

		LogInPage logIn = new LogInPage(driver);
		logIn.setUsername(un);
		logIn.setPassword(pwd);
		logIn.clickLogin();

		RegistrationPage RegPage = new RegistrationPage(driver);
		RegPage.navigativeToRegistration();
		RegPage.clickpicdropdown();
		RegPage.clickGesy();
		RegPage.clickTitle();
		RegPage.clickMiss();
		RegPage.setFirstName(Fname);
		RegPage.setLastNmae(Lname);
		RegPage.clickAgeRadioBtn();
		RegPage.setAgeTextBox(Age);
		RegPage.clickChooseContainerDrodown();
		RegPage.clickYear();
		// RegPage.clickSexDropDown();
		RegPage.setIDArcno(IDArc);
		RegPage.setIntIDPassport(PassportID);
		RegPage.setMobileno(Mobile);
        // RegPage.clickDatPtotectionBox();
		RegPage.setAddress(Addrs);
		scrollpage("//div[@id='cpBody_cmbDepartment_chosen']//a");
		RegPage.clickPhyradiobutton();
		RegPage.clickPhysiciandropdown();
		RegPage.clickAgamemnonArgirou();
		RegPage.clickReferralSource();
		RegPage.clickAdamosAdamou_Ref();
		RegPage.ClickMembershipScheme();
		RegPage.ClickMembershipschemedropdown();
		RegPage.ClickUKCAMembership();
		RegPage.ClickNextOfKin();
		RegPage.ClickAddNextOfKin();
		RegPage.ClickNokTitle();
		RegPage.ClickTitleBaby();
		RegPage.setNokfirstname(NokFname);
		RegPage.setNokLastName(NokLname);
		RegPage.setNokAddress(NokAdrs);
		RegPage.ClickNokRelationship();
		RegPage.ClickNokWife();
		RegPage.setNokMobileNumber(NokMobNo);
		RegPage.setNokPassportNo(Nokppno);
		RegPage.ClickSaveNok();
		scrollpage("//div[@id='divtbInsurance']");
		RegPage.ClickInsuranceDetailsTab();
		RegPage.ClickAddInsurance();
		RegPage.ClickSelectInsuranceDropdown();
		RegPage.ClickAdacInsurance();
		RegPage.setPolicyHolderTxtBox(PolicyHolder);
		RegPage.setPolicyNumberTxtBox(PolicyNo);
		RegPage.setGroupNumberTxtBox(GroupNo);
		RegPage.setGuarantorTxtBox(Guarantor);
		scrollpage("//div//textarea[@id='cpBody_usrOpIpInsur_txtAddress']");
		scrollpage("//div//input[@id='cpBody_usrOpIpInsur_txtMobileNo']");
		scrollpage("//div//textarea[@id='cpBody_usrOpIpInsur_txtRemarks']");

		RegPage.ClickRelationDropDown();
		RegPage.ClickrelBrother();
		
		
		
		RegPage.setAddress1(Adrs1);
		RegPage.setAddress2(Adrs2);
		RegPage.setPhone1(PhNo1);
		RegPage.setPhone2(PhNo2);
		RegPage.setNewPatInsRemarks(InsRamarks);
		RegPage.ClickCoveredFor();
		RegPage.ClickInPatient();
		
		RegPage.ClickPatientInsuranceSave();
		scrollpage("//div//a[@id='cpBody_usrPatientLinks_lnkAdd']");
		RegPage.ClickLinkDetailsTab();
		RegPage.ClickAddLinkDetails();
		RegPage.setLinkUHIDTxtBox(LinkUHID);
		RegPage.setPatientLinkRemarks(LinkPatRmrk);
		RegPage.ClickNewPatientLinkSave();
		scrollpage("//div//button[@id='btnSaveRegistration']");
		RegPage.clickSave();
		RegPage.RegSaveConfirmpopup();
	}
	
}
