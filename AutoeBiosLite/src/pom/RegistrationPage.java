package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class RegistrationPage extends BasePage {

	// UHID Field
	@FindBy(id = "cpBody_txtHospIdNo")
	private WebElement UHIDno;

	
	// PIC drop down
	@FindBy(id = "cpBody_cmbStatus_chosen")
	private WebElement picdropdown;

	@FindBy(xpath = "//div[@id='cpBody_cmbStatus_chosen']//ul/li[1]")
	private WebElement Gesy;

	@FindBy(xpath = "//div[@id='cpBody_cmbStatus_chosen']//ul/li[2]")
	private WebElement LocalPatient;

	@FindBy(xpath = "//div[@id='cpBody_cmbStatus_chosen']//ul/li[3]")
	private WebElement AHK;

	@FindBy(xpath = "//div[@id='cpBody_cmbStatus_chosen']//ul/li[4]")
	private WebElement EvangelismosPiceList;

	// Age Radio Button
	@FindBy(id = "cpBody_chkAge")
	private WebElement AgeRadioBtn;

	// Age Text Box
	@FindBy(id = "cpBody_txtAge")
	private WebElement AgeTextBox;

	// Choose Container drop down
	@FindBy(id = "cpBody_cmbAge_chosen")
	private WebElement ChooseContainerDrodown;

	// Select Days
	@FindBy(xpath = "//li[@data-option-array-index='0']")
	private WebElement Days;

	// Select Month
	@FindBy(xpath = "//li[@data-option-array-index='1']")
	private WebElement Month;

	// Select Year
	@FindBy(xpath = "//div[@id='cpBody_cmbAge_chosen']//li[.='Years']")
	private WebElement Year;

	// Title
	@FindBy(id = "cpBody_cmbFirstName_chosen")
	private WebElement titledropdown;

	@FindBy(xpath = "//div[@id='cpBody_cmbFirstName_chosen']//ul/li[1]")
	private WebElement Baby;

	@FindBy(xpath = "//li[@data-option-array-index='2']")
	private WebElement Dr;

	@FindBy(xpath = "//li[@data-option-array-index='3']")
	private WebElement Master;

	@FindBy(xpath = "//div[@id='cpBody_cmbFirstName_chosen']//ul/li[4]")
	private WebElement Miss;

	@FindBy(xpath = "//li[@data-option-array-index='5']")
	private WebElement Mr;

	@FindBy(xpath = "//li[@data-option-array-index='6']")
	private WebElement Mrs;

	@FindBy(xpath = "//li[@data-option-array-index='7']")
	private WebElement Profs;

	@FindBy(id = "cpBody_txtFirstName")
	private WebElement FirstName;

	@FindBy(id = "cpBody_txtSurName")
	private WebElement LastNmae;

	@FindBy(id = "cpBody_txtPassportNo")
	private WebElement IDArcno;

	@FindBy(id = "cpBody_txtIntId")
	private WebElement IntIDPassport;

	@FindBy(id = "cpBody_dtpBirthDate")
	private WebElement DOB;

	@FindBy(id = "cpBody_txtPhone")
	private WebElement MobileNo;

	// Gender
	@FindBy(id = "cpBody_cmbSex_chosen")
	private WebElement SexDropdown;

	@FindBy(xpath = "//div[@id='cpBody_cmbSex_chosen']//ul/li[1]")
	private WebElement Either;

	@FindBy(xpath = "//div[@id='cpBody_cmbSex_chosen']//ul/li[2]")
	private WebElement Female;

	@FindBy(xpath = "//div[@id='cpBody_cmbSex_chosen']//ul/li[3]")
	private WebElement Male;

	@FindBy(id = "cpBody_ChkDatafrm")
	private WebElement DatPtotectionBox;

	@FindBy(id = "cpBody_txtAddress")
	private WebElement Address;

	// Company Name
	@FindBy(id = "cpBody_cmbCompany_chosen")
	private WebElement CompanyName;

	@FindBy(xpath = "//div//ul//li[.='ALTIUS INSURANCE LTD']")
	private WebElement ALTIUSINSURANCELTD;

	@FindBy(xpath = "//div//ul//li[.='CYTA']")
	private WebElement CYTA;

	// Hospital Visit
	@FindBy(id = "cpBody_cmbDepartment_chosen")
	private WebElement department;

	@FindBy(xpath = "//div[@id='cpBody_cmbDepartment_chosen']//ul/li[1]")
	private WebElement ClinicalLaboratory;

	@FindBy(xpath = "//div[@id='cpBody_cmbDepartment_chosen']//ul/li[2]")
	private WebElement ClinicalLaboratory_polis;

	@FindBy(xpath = "//div[@id='cpBody_cmbDepartment_chosen']//ul/li[3]")
	private WebElement DayProcedureUnit;

	@FindBy(xpath = "//div[@id='cpBody_cmbDepartment_chosen']//ul/li[4]")
	private WebElement Radiology;

	// Physician Visit
	@FindBy(id="cpBody_rdVisitToPhy")
	private WebElement Phyradiobutton;

	@FindBy(id="cpBody_drpTratingConsultant_chosen")
	private WebElement Physiciandropdown;

	@FindBy(xpath = "//div[@id='cpBody_drpTratingConsultant_chosen']//ul/li[1]")
	private WebElement AdamosAdamou;

	@FindBy(xpath = "//div[@id='cpBody_drpTratingConsultant_chosen']//ul/li[2]")
	private WebElement AfroulaKamaran;

	@FindBy(xpath = "//div[@id='cpBody_drpTratingConsultant_chosen']//ul/li[3]")
	private WebElement AgamemnonArgirou;

	// None
	@FindBy(id = "cpBody_rdVisitNone")
	private WebElement None;

	// Referral Sources
	@FindBy(id = "cpBody_drpRefList_chosen")
	private WebElement ReferralSource;

	@FindBy(xpath = "//div[@id='cpBody_drpRefList_chosen']//ul/li[1]")
	private WebElement AdamosAdamou_Ref;

	@FindBy(xpath = "//div[@id='cpBody_drpRefList_chosen']//ul/li[2]")
	private WebElement AfroulaKamaran_Ref;

	@FindBy(xpath = "//div[@id='cpBody_drpRefList_chosen']//ul/li[3]")
	private WebElement AgamemnonArgirou_Ref;

	// Membership Scheme
	@FindBy(id = "cpBody_Button1")
	private WebElement Membershipscheme;

	@FindBy(id = "cpBody_cmbMemScheme_chosen")
	private WebElement Membershipschemedropdown;

	@FindBy(xpath = "//div[@id='cpBody_cmbMemScheme_chosen']//li[.='NONE']")
	private WebElement NONE;

	@FindBy(xpath = "//div[@id='cpBody_cmbMemScheme_chosen']//li[.='UKCA Membership']")
	private WebElement UKCAMembership;

	@FindBy(xpath = "//div[@id='cpBody_cmbMemScheme_chosen']//li[.='TUI STAFF (APH)']")
	private WebElement TUISTAFF;

	@FindBy(xpath = "//div[@id='cpBody_cmbMemScheme_chosen']//li[.='JAMES VILLA HOLIDAYS REP']")
	private WebElement JAMESVILLAHOLIDAYSREP;

	// Membership Expire Date
	@FindBy(id = "cpBody_dtpMembershipExpire")
	private WebElement MembershipExpireDate;

	// Next Of Kin
	@FindBy(id = "btnNokCollapse")
	private WebElement NextOfKin;

	// Add Next Of Kin
	@FindBy(id = "cpBody_usrNokContent_lnkAdd")
	private WebElement AddNextOfKin;

	// Add NOK Title
	@FindBy(id = "cpBody_usrNokContent_cmbNOKTitle_chosen")
	private WebElement NokTitle;

	// Title Baby
	@FindBy(xpath = "//div[@id='cpBody_usrNokContent_cmbNOKTitle_chosen']//ul/li[1]")
	private WebElement TitleBaby;

	// Title Dr
	@FindBy(xpath = "//div//ul[@class='active-result']//li[.='Dr']")
	private WebElement TitleDr;

	// Title Master
	@FindBy(xpath = "//ul[@class='chosen-results']//li[.='Master']")
	private WebElement TitleMaster;

	// Title Miss
	@FindBy(xpath = "//ul[@class='chosen-results']//li[.='Miss']")
	private WebElement TitleMiss;

	// Title Mr
	@FindBy(xpath = "//ul[@class='chosen-results']//li[.='Mr']")
	private WebElement TitleMr;

	// Title Mrs
	@FindBy(xpath = "//ul[@class='chosen-results']//li[.='Mrs']")
	private WebElement TitleMrs;

	// Title Prof
	@FindBy(xpath = "//ul[@class='chosen-results']//li[.='Prof']")
	private WebElement TitleProf;

	// Add NOK First Name
	@FindBy(id = "cpBody_usrNokContent_txtNOKFname")
	private WebElement Nokfirstname;

	// Add NOK Last Name
	@FindBy(id = "cpBody_usrNokContent_txtNokSurName")
	private WebElement NokLastName;

	// Add NOK Address
	@FindBy(id = "cpBody_usrNokContent_txtNOKStreet")
	private WebElement NokAddress;

	// Select Relationship
	@FindBy(id = "cpBody_usrNokContent_cmbReleationship_chosen")
	private WebElement NokRelationship;

	// Brother
	@FindBy(xpath = "//ul[@class='chosen-results']//li[.='Brother']")
	private WebElement NokBrother;

	// Child
	@FindBy(xpath = "//ul[@class='chosen-results']//li[.='Child']")
	private WebElement NokChild;

	// Father
	@FindBy(xpath = "//ul[@class='chosen-results']//li[.='Father']")
	private WebElement NokFather;

	// Friend
	@FindBy(xpath = "//ul[@class='chosen-results']//li[.='Friend']")
	private WebElement NokFriend;

	// Husband
	@FindBy(xpath = "//ul[@class='chosen-results']//li[.='Husband']")
	private WebElement NokHusband;

	// Mother
	@FindBy(xpath = "//ul[@class='chosen-results']//li[.='Mother']")
	private WebElement NokMother;

	// Sister
	@FindBy(xpath = "//ul[@class='chosen-results']//li[.='Sister']")
	private WebElement NokSister;

	// Wife
	@FindBy(xpath = "//ul[@class='chosen-results']//li[.='Wife']")
	private WebElement NokWife;

	// PostCode Text Box
	@FindBy(id = "cpBody_usrNokContent_txtNOKPostalCode")
	private WebElement PostCode;

	// NOK Mobile Number
	@FindBy(id = "cpBody_usrNokContent_txtNOKMobileNo")
	private WebElement NokMobileNumber;

	// NOK Land Line
	@FindBy(id = "cpBody_usrNokContent_txtNOKWork")
	private WebElement NokLandline;

	// NOK Work
	@FindBy(id = "cpBody_usrNokContent_txtNOKHome")
	private WebElement NokWork;

	// NOK Area
	@FindBy(id = "cpBody_usrNokContent_cmbNOKArea_chosen")
	private WebElement Area;

	// Agia
	@FindBy(xpath = "//ul[@class='chosen-results']//li[.='Agia']")
	private WebElement Agia;

	// Agia Eirini Lefkosias
	@FindBy(xpath = "//ul[@class='chosen-results']//li[.='Agia Eirini Lefkosias']")
	private WebElement AgiaEiriniLefkosias;

	// Koilineia
	@FindBy(xpath = "//ul[@class='chosen-results']//li[.='Koilineia']")
	private WebElement Koilineia;

	// NOK City
	@FindBy(id = "cpBody_usrNokContent_cmbNOKCity_chosen")
	private WebElement NokCity;

	// Amsterdam
	@FindBy(xpath = "//ul[@class='chosen-results']//li[.='Amsterdam']")
	private WebElement Amsterdam;

	// Barcelona
	@FindBy(xpath = "//ul[@class='chosen-results']//li[.='Barcelona']")
	private WebElement Barcelona;

	// Paphos
	@FindBy(xpath = "//ul[@class='chosen-results']//li[.='Paphos']")
	private WebElement Paphos;

	// Country
	@FindBy(id = "cpBody_usrNokContent_cmbNOKActualCountry_chosen")
	private WebElement NokCountry;

	// Austria
	@FindBy(xpath = "//ul[@class='chosen-results']//li[.='Austria']")
	private WebElement Austria;

	// Belgium
	@FindBy(xpath = "//ul[@class='chosen-results']//li[.='Belgium']")
	private WebElement Belgium;

	// Cyprus
	@FindBy(xpath = "//ul[@class='chosen-results']//li[.='Cyprus']")
	private WebElement Cyprus;

	// Nationality
	@FindBy(id = "cpBody_usrNokContent_cmbNOKCountry_chosen")
	private WebElement NokNationality;

	// American
	@FindBy(xpath = "//ul[@class='chosen-results']//li[.='American']")
	private WebElement American;

	// Austrian
	@FindBy(xpath = "//ul[@class='chosen-results']//li[.='Austrian']")
	private WebElement Austrian;

	// Canadian
	@FindBy(xpath = "//ul[@class='chosen-results']//li[.='Canadian']")
	private WebElement Canadian;

	// Passport No/Id No
	@FindBy(id = "cpBody_usrNokContent_txtNokpassportId")
	private WebElement NokPassportNo;

	// Save NOK Details
	@FindBy(id = "btnNokSave")
	private WebElement SaveNok;

	// Close NOK Window
	@FindBy(id = "btnNokClose")
	private WebElement CloseNok;

	// Insurance Details Tab
	@FindBy(id = "cpBody_LblInsurance")
	private WebElement InsuranceDetailsTab;

	// Add Insurance
	@FindBy(id = "cpBody_usrOpIpInsur_lnkAdd")
	private WebElement AddInsurance;

	// Select Insurance Dropdown
	@FindBy(id = "cpBody_usrOpIpInsur_cmbInsurance_chosen")
	private WebElement SelectInsuranceDropdown;

	// ADAC INSURANCE
	@FindBy(xpath = "//ul[@class='chosen-results']//li[.='ADAC INSURANCE']")
	private WebElement AdacInsurance;

	// AHK IP
	@FindBy(xpath = "//ul[@class='chosen-results']//li[.='AHK IP']")
	private WebElement AHKIP;

	// AHK OP
	@FindBy(xpath = "//ul[@class='chosen-results']//li[.='AHK OP']")
	private WebElement AHKOP;

	// Policy Holder Text Box
	@FindBy(id = "cpBody_usrOpIpInsur_txtPolicyHolder")
	private WebElement PolicyHolderTxtBox;

	// Policy Number Text Box
	@FindBy(id = "cpBody_usrOpIpInsur_txtPolicyNumber")
	private WebElement PolicyNumberTxtBox;

	// Group Number Text Box
	@FindBy(id = "cpBody_usrOpIpInsur_txtGroupNumber")
	private WebElement GroupNumberTxtBox;

	// Policy Start Date
	@FindBy(id = "cpBody_usrOpIpInsur_dtpPolicyStartDate")
	private WebElement PolicyStartDate;

	// Policy End Date
	@FindBy(id = "cpBody_usrOpIpInsur_dtpPolicyEndDate")
	private WebElement PolicyEndDate;

	// Guarantor
	@FindBy(id = "cpBody_usrOpIpInsur_txtGuarantor")
	private WebElement GuarantorTxtBox;

	// Relation
	@FindBy(id = "cpBody_usrOpIpInsur_cmbRelation_chosen")
	private WebElement RelationDropDown;

	// RelBrother
	@FindBy(xpath = "//ul[@class='chosen-results']//li[.='Brother']")
	private WebElement relBrother;

	// Covered For Dropdown
	@FindBy(id = "cpBody_usrOpIpInsur_cmbCoveredFor_chosen")
	private WebElement CoveredFor;

	// Covered For Both OP IP
	@FindBy(xpath = "//ul[@class='chosen-results']//li[.='Both OP IP']")
	private WebElement BothOpIp;

	// Covered For InPatient
	@FindBy(xpath = "//ul[@class='chosen-results']//li[.='InPatient']")
	private WebElement InPatient;

	// Covered For OutPatient
	@FindBy(xpath = "//ul[@class='chosen-results']//li[.='OutPatient']")
	private WebElement OutPatient;

	// Address 1
	@FindBy(id = "cpBody_usrOpIpInsur_txtAddress")
	private WebElement Address1;

	// Address 2
	@FindBy(id = "cpBody_usrOpIpInsur_txtAddress2")
	private WebElement Address2;

	// Phone 1
	@FindBy(id = "cpBody_usrOpIpInsur_txtMobileNo")
	private WebElement Phone1;

	// Phone 2
	@FindBy(id = "cpBody_usrOpIpInsur_txtPhone")
	private WebElement Phone2;

	// New Patient insurance Remarks
	@FindBy(id = "cpBody_usrOpIpInsur_txtRemarks")
	private WebElement NewPatInsRemarks;

	// New Patient Insurance Save
	@FindBy(id = "btnSave")
	private WebElement PatientInsuranceSave;

	// Close New Patient Insurance window
	@FindBy(id = "btnInsuranceClose")
	private WebElement InsuranceClose;

	// link Details Tab
	@FindBy(id = "cpBody_LblLinkDetails")
	private WebElement LinkDetailsTab;

	// Add Link Details
	@FindBy(id = "cpBody_usrPatientLinks_lnkAdd")
	private WebElement AddLinkDetails;

	// Enter UHID No
	@FindBy(id = "cpBody_usrPatientLinks_txtHospIdNo")
	private WebElement LinkUHIDTxtBox;

	// How this patient related
	@FindBy(id = "cpBody_usrPatientLinks_cmbRelation_chosen")
	private WebElement PatientRelationdropdown;

	// Father
	@FindBy(xpath = "//ul[@class='chosen-results']//li[.='Father']")
	private WebElement PatRelFather;

	// Friend
	@FindBy(xpath = "//ul[@class='chosen-results']//li[.='Friend']")
	private WebElement PatRelFriend;

	// New Patient Link Remarks
	@FindBy(id = "cpBody_usrPatientLinks_txtRemarks")
	private WebElement PatientLinkRemarks;

	// New Patient Link Save
	@FindBy(id = "btnSaveInsurance")
	private WebElement NewPatientLinkSave;

	// New Patient Link Close
	@FindBy(id = "btnPatientLinkClose")
	private WebElement NewPatientLinkClose;

	// Save
	@FindBy(id = "btnSaveRegistration")
	private WebElement Save;

	// Clear
	@FindBy(id = "cpBody_btnClose")
	private WebElement Clear;

	// Confirmation pop up (Data protection form)
	@FindBy(xpath = "//span[@id='spntext']")
	private WebElement ConfirmRegText;

	// Print Yes in confirmation pop up
	@FindBy(id = "btnDialogYes")
	private WebElement ConfirmYes;

	// Print No in confirmation pop up
	@FindBy(id = "btnDialogNo")
	private WebElement ConfirmNo;

	// Intialize
	public RegistrationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	// Navigate to Registration
	public void navigativeToRegistration() {
		driver.findElement(By.xpath("//i[@class='fa fa-bars']")).click();
		driver.findElement(By.xpath("//a[text()='Registration']")).click();
	}

	// Clear the UHID field and enter UHID
	public void editPatientRecord(String UHID) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('cpBody_txtHospIdNo').value=''");
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(UHIDno)).sendKeys(UHID, Keys.ENTER);
		Thread.sleep(10000);
		String ActualTitle = driver.switchTo().alert().getText();
		String ExpectedTitle = "Do you want to edit the patient";
		Assert.assertEquals(ExpectedTitle, ActualTitle);
		driver.switchTo().alert().accept();
		Thread.sleep(10000);
	}
	

	// Set values to the text box and drop downs
	public void clickpicdropdown() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(picdropdown)).click();
		// picdropdown.click();
	}

	public void clickGesy() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Gesy)).click();
		// Gesy.click();
	}

	public void clickLocalPatient() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(LocalPatient)).click();
		// LocalPatient.click();
	}

	public void clickAHK() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(AHK)).click();
		// AHK.click();
	}

	public void clickEvangelismosPiceList() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(EvangelismosPiceList)).click();
		// EvangelismosPiceList.click();
	}

	public void clickTitle() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(titledropdown)).click();
		// titledropdown.click();
	}

	public void clickBaby() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Baby)).click();
		// Baby.click();
	}

	public void clickMaster() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Master)).click();
		// Master.click();
	}

	public void clickMiss() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Miss)).click();
		// Miss.click();
	}

	public void clickMr() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Mr)).click();
		// Mr.click();
	}

	public void clickMrs() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Mrs)).click();
		// Mrs.click();
	}

	public void clickProfs() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Profs)).click();
		// Profs.click();
	}

	public void setFirstName(String Fname) {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(FirstName)).sendKeys(Fname);
		// FirstName.sendKeys(Fname);
	}

	public void setLastNmae(String Lname) {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(LastNmae)).sendKeys(Lname);
		// LastNmae.sendKeys(Lname);
	}

	public void setIDArcno(String IDArc) {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(IDArcno)).sendKeys(IDArc);
		// IDArcno.sendKeys(IDArc);
	}

	public void setIntIDPassport(String PassportID) {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(IntIDPassport))
				.sendKeys(PassportID);
		// IntIDPassport.sendKeys(PassportID);
	}

	public void clickAgeRadioBtn() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(AgeRadioBtn)).click();
		// AgeRadioBtn.click();
	}

	public void setAgeTextBox(String Age) {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(AgeTextBox)).sendKeys(Age);
		// AgeTextbox.sendKeys(Age);
	}

	public void clickChooseContainerDrodown() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(ChooseContainerDrodown)).click();
		// ChooseContainerDrodown.click();
	}

	public void clickDays() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Days)).click();
		// Days.click();
	}

	public void clickMonth() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Month)).click();
		// Month.click();
	}

	public void clickYear() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Year)).click();
		// Year.click();
	}

	public void setDOB(String Age) {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(DOB)).sendKeys(Age);
		// DOB.sendKeys(Age);
	}

	public void setMobileno(String Mobile) {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(MobileNo)).sendKeys(Mobile);
		// MobileNo.sendKeys(Mobile);
	}

	public void clickSexDropDown() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(SexDropdown)).click();
		// SexDropdown.click();
	}

	public void clickEither() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Either)).click();
		// Either.click();
	}

	public void clickfemale() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Female)).click();
		// Female.click();
	}

	public void clickMale() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Male)).click();
		// Male.click();
	}

	public void clickDatPtotectionBox() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(DatPtotectionBox)).click();
		// DatPtotectionBox.click();
	}

	public void setAddress(String Addrs) {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Address)).sendKeys(Addrs);
		// Address.sendKeys(Addrs);
	}

	public void ClickCompanyName() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(CompanyName)).click();
		// CompanyName.click();
	}

	public void ClickALTIUSINSURANCELTD() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(ALTIUSINSURANCELTD)).click();
		// ALTIUSINSURANCELTD.click();
	}

	public void ClickCYTA() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(CYTA)).click();
		// CYTA.click();
	}

	public void clickdepartment() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(department)).click();
		// department.click();
	}

	public void clickClinicalLaboratory() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(ClinicalLaboratory)).click();
		// ClinicalLaboratory.click();
	}

	public void clickClinicalLaboratory_polis() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(ClinicalLaboratory_polis)).click();
		// ClinicalLaboratory_polis.click();
	}

	public void clickDayProcedureUnit() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(DayProcedureUnit)).click();
		// DayProcedureUnit.click();
	}

	public void clickRadiology() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(DayProcedureUnit)).click();
		Radiology.click();
	}

	public void clickPhyradiobutton() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Phyradiobutton)).click();
		// Phyradiobutton.click();

	}

	public void clickPhysiciandropdown() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Physiciandropdown)).click();
		// Physiciandropdown.click();
	}

	public void clickAdamosAdamou() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(AdamosAdamou)).click();
		// AdamosAdamou.click();
	}

	public void clickAfroulaKamaran() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(AfroulaKamaran)).click();
		// AfroulaKamaran.click();
	}

	public void clickAgamemnonArgirou() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(AgamemnonArgirou)).click();
		// AgamemnonArgirou.click();
	}

	public void clickNone() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(None)).click();
		None.click();
	}

	public void clickReferralSource() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(ReferralSource)).click();
		// ReferralSource.click();
	}

	public void clickAdamosAdamou_Ref() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(AdamosAdamou_Ref)).click();
		// AdamosAdamou_Ref.click();
	}

	public void clickAfroulaKamaran_ref() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(AfroulaKamaran_Ref)).click();
		// AfroulaKamaran_Ref.click();
	}

	public void clickAgamemnonArgirou_Ref() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(AgamemnonArgirou_Ref)).click();
		// AgamemnonArgirou_Ref.click();
	}

	public void ClickMembershipScheme() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Membershipscheme)).click();
		// Membershipscheme.click();
	}

	public void ClickMembershipschemedropdown() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Membershipschemedropdown)).click();
		// Membershipschemedropdown.click();
	}

	public void ClickNONE() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(NONE)).click();
		// NONE.click();
	}

	public void ClickUKCAMembership() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(UKCAMembership)).click();
		// UKCAMembership.click();
	}

	public void ClickTUISTAFF() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(TUISTAFF)).click();
		// TUISTAFF.click();
	}

	public void ClickJAMESVILLAHOLIDAYSREP() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(JAMESVILLAHOLIDAYSREP)).click();
		// JAMESVILLAHOLIDAYSREP.click();
	}

	public void ClickNextOfKin() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(NextOfKin)).click();
		// NextOfKin.click();
	}

	public void ClickAddNextOfKin() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(AddNextOfKin)).click();
		// AddNextOfKin.click();
	}

	public void ClickNokTitle() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(NokTitle)).click();
		// NokTitle.click();
	}

	public void ClickTitleBaby() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(TitleBaby)).click();
		// TitleBaby.click();
	}

	public void ClickNokRelationship() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(NokRelationship)).click();
		// NokRelationship.click();
	}

	public void ClickNokWife() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(NokWife)).click();
		// NokWife.click();
	}

	public void setNokfirstname(String NokFname) {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Nokfirstname)).sendKeys(NokFname);
		// Nokfirstname.sendKeys(NokFname);
	}

	public void setNokLastName(String NokLname) {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(NokLastName)).sendKeys(NokLname);
		// NokLastName.sendKeys(NokLname);
	}

	public void setNokAddress(String NokAdrs) {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(NokAddress)).sendKeys(NokAdrs);
		// NokAddress.sendKeys(NokAdrs);
	}

	public void setNokMobileNumber(String NokMobNo) {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(NokMobileNumber))
				.sendKeys(NokMobNo);
		// NokMobileNumber.sendKeys(NokMobNo);
	}

	public void ClickNokCountry() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(NokCountry)).click();
		// NokCountry.click();
	}

	public void ClickAustria() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Austria)).click();
		// Austria.click();
	}

	public void setNokPassportNo(String Nokppno) {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(NokPassportNo)).sendKeys(Nokppno);
		// NokPassportNo.sendKeys(Nokppno);
	}

	public void ClickSaveNok() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(SaveNok)).click();
		// SaveNok.click();
	}

	public void ClickInsuranceDetailsTab() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(InsuranceDetailsTab)).click();
		// InsuranceDetailsTab.click();
	}

	public void ClickAddInsurance() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(AddInsurance)).click();
		// AddInsurance.click();
	}

	public void ClickSelectInsuranceDropdown() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(SelectInsuranceDropdown)).click();
		// SelectInsuranceDropdown.click();
	}

	public void ClickAdacInsurance() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(AdacInsurance)).click();
		// AdacInsurance.click();
	}

	public void setPolicyHolderTxtBox(String PolicyHolder) {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(PolicyHolderTxtBox))
				.sendKeys(PolicyHolder);
		// PolicyHolderTxtBox.sendKeys(PolicyHolder);
	}

	public void setPolicyNumberTxtBox(String PolicyNo) {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(PolicyNumberTxtBox))
				.sendKeys(PolicyNo);
		// PolicyNumberTxtBox.sendKeys(PolicyNo);
	}

	public void setGroupNumberTxtBox(String GroupNo) {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(GroupNumberTxtBox))
				.sendKeys(GroupNo);
		// GroupNumberTxtBox.sendKeys(GroupNo);
	}

	public void ClickPolicyStartDate() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(PolicyStartDate)).click();
		// PolicyStartDate.click();
	}

	public void ClickPolicyEndDate() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(PolicyEndDate)).click();
		// PolicyEndDate.click();
	}

	public void setGuarantorTxtBox(String Guarantor) {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(GuarantorTxtBox))
				.sendKeys(Guarantor);
		// GuarantorTxtBox.sendKeys(Guarantor);
	}

	public void ClickRelationDropDown() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(RelationDropDown)).click();
		// RelationDropDown.click();
	}

	public void ClickrelBrother() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(relBrother)).click();
		// relBrother.click();
	}

	public void ClickCoveredFor() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(CoveredFor)).click();
		// CoveredFor.click();
	}

	public void ClickInPatient() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(InPatient)).click();
		// InPatient.click();
	}

	public void ClickBothOpIp() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(BothOpIp)).click();
		// BothOpIp.click();
	}

	public void ClickOutPatient() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(OutPatient)).click();
		// OutPatient.click();
	}

	public void setAddress1(String Adrs1) {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Address1)).sendKeys(Adrs1);
		// Address1.sendKeys(Adrs1);
	}

	public void setAddress2(String Adrs2) {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Address2)).sendKeys(Adrs2);
		// Address2.sendKeys(Adrs2);
	}

	public void setPhone1(String PhNo1) {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Phone1)).sendKeys(PhNo1);
		// Phone1.sendKeys(PhNo1);
	}

	public void setPhone2(String PhNo2) {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Phone2)).sendKeys(PhNo2);
		// Phone2.sendKeys(PhNo2);
	}

	public void setNewPatInsRemarks(String InsRamarks) {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(NewPatInsRemarks))
				.sendKeys(InsRamarks);
		// NewPatInsRemarks.sendKeys(InsRamarks);
	}

	public void ClickPatientInsuranceSave() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(PatientInsuranceSave)).click();
		// PatientInsuranceSave.click();
	}

	public void ClickInsuranceClose() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(InsuranceClose)).click();
		// InsuranceClose.click();
	}

	public void ClickLinkDetailsTab() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(LinkDetailsTab)).click();
		// LinkDetailsTab.click();
	}

	public void ClickAddLinkDetails() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(AddLinkDetails)).click();
		// AddLinkDetails.click();
	}

	public void setLinkUHIDTxtBox(String LinkUHID) {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(LinkUHIDTxtBox)).sendKeys(LinkUHID,
				Keys.ENTER);
		// LinkUHIDTxtBox.sendKeys(LinkUHID);
	}

	public void ClickPatientRelationdropdown() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(PatientRelationdropdown)).click();
		// PatientRelationdropdown.click();
	}

	public void ClickPatRelFather() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(PatRelFather)).click();
		// PatRelFather.click();
	}

	public void ClickPatRelFriend() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(PatRelFriend)).click();
		// PatRelFriend.click();
	}

	public void setPatientLinkRemarks(String LinkPatRmrk) {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(PatientLinkRemarks))
				.sendKeys(LinkPatRmrk);
		// PatientLinkRemarks.sendKeys(LinkPatRmrk);
	}

	public void ClickNewPatientLinkSave() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(NewPatientLinkSave)).click();
		// NewPatientLinkSave.click();
	}

	public void ClickNewPatientLinkClose() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(NewPatientLinkClose)).click();
		// NewPatientLinkClose.click();
	}

	public void clickSave() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Save)).click();
		// Save.click();
	}

	public void clickClear() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Clear)).click();
		// Clear.click();
	}

	// Save confirmation with data protection checked
	public void confirmPopUpwithDataProtection() {
		String ActualResult = ConfirmRegText.getText();
		String ExpectedResult = "Patient Registered succesfully. Do you wish to print the GDPR form ?";
		Assert.assertEquals(ExpectedResult, ActualResult);

	}

	// Save confirmation without data protection checked
	public void confirmpopUpWithoutDataprotection() throws InterruptedException {
		Thread.sleep(10000);
		String ActualResult = driver.switchTo().alert().getText();
		String ExpectedResult = "Patient registered successfully";
		Assert.assertEquals(ExpectedResult, ActualResult);
		driver.switchTo().alert().accept();
	}

	String bfrUHID;

	public void UHIDbeforeSave() {
		bfrUHID = driver.findElement(By.id("cpBody_txtHospIdNo")).getAttribute("value");
	}

	String afrUHID;

	public void UHIDAfterSave() {
		afrUHID = driver.findElement(By.id("cpBody_txtHospIdNo")).getAttribute("value");
	}

	public void SaveConfirm() {
		bfrUHID = bfrUHID + 1;
		Assert.assertEquals(bfrUHID, afrUHID);
	}

	public void CheckIDARCValidationPopUp() {
		String actualResult = driver.switchTo().alert().getText();
		String ExpectedResult = "ID No./ ARC No.already exist for the UHID : " + bfrUHID
				+ " Would you like to retain the same number again ?";
		Assert.assertEquals(ExpectedResult, actualResult);
		driver.switchTo().alert().accept();
	}
	
	public void RegSaveConfirmpopup() throws InterruptedException {
		Thread.sleep(10000);
		String ActualResult = driver.switchTo().alert().getText();
		String ExpectedResult = "Patient registered successfully";
		Assert.assertEquals(ActualResult, ExpectedResult);
		driver.switchTo().alert().accept();
	}

}
