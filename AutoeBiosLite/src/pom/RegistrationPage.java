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
	
	//UHID Field
	@FindBy (id = "cpBody_txtHospIdNo")
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

	// Title
	@FindBy(id = "cpBody_cmbFirstName_chosen")
	private WebElement titledropdown;

	@FindBy(xpath = "//div[@id='cpBody_cmbFirstName_chosen']//ul/li[1]")
	private WebElement Baby;

	@FindBy(xpath = "//li[@data-option-array-index='2']")
	private WebElement Dr;

	@FindBy(xpath = "//li[@data-option-array-index='3']")
	private WebElement Master;

	@FindBy(xpath = "//li[@data-option-array-index='4']")
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
	@FindBy(id = " cpBody_rdVisitToPhy")
	private WebElement Phyradiobutton;

	@FindBy(id = "cpBody_drpTratingConsultant_chosen")
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

	// Save
	@FindBy(id = "btnSaveRegistration")
	private WebElement Save;

	// Clear
	@FindBy(id = "cpBody_btnClose")
	private WebElement Clear;

	//Confirmation pop up (Data protection form)
	@FindBy(xpath = "//span[@id='spntext']")
	private WebElement ConfirmRegText;
	
	// Print Yes in confirmation pop up
	@FindBy (id = "btnDialogYes")
	private WebElement ConfirmYes;
	
	// Print No in confirmation pop up
	@FindBy (id = "btnDialogNo")
	private WebElement ConfirmNo;
	
	//Intialize
	public RegistrationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	//Clear the UHID field and enter UHID
	public void editPatientRecord(String UHID) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor)driver;
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
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Phyradiobutton)).click();
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
		//None.click();
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

	public void clickSave() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Save)).click();
		// Save.click();
	}

	public void clickClear() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Clear)).click();
		// Clear.click();
	}

	//Save confirmation with data protection checked
	public void confirmPopUpwithDataProtection() {
		String ActualResult = ConfirmRegText.getText();
		String ExpectedResult = "Patient Registered succesfully. Do you wish to print the GDPR form ?";
		Assert.assertEquals(ExpectedResult, ActualResult);
		
	}
	
	//Save confirmation without data protection checked
	public void confirmpopUpWithoutDataprotection() throws InterruptedException {
		Thread.sleep(10000);
		String ActualResult =driver.switchTo().alert().getText();
		String ExpectedResult = "Patient registered successfully";
		Assert.assertEquals(ExpectedResult, ActualResult);
		driver.switchTo().alert().accept();
	}
	
	
	String bfrUHID;
	public void UHIDbeforeSave() {
		bfrUHID=driver.findElement(By.id("cpBody_txtHospIdNo")).getAttribute("value");
	}
	
	String afrUHID;
	public void UHIDAfterSave() {
		afrUHID=driver.findElement(By.id("cpBody_txtHospIdNo")).getAttribute("value");
	}

	public void SaveConfirm() {
		bfrUHID = bfrUHID+1;
		Assert.assertEquals(bfrUHID, afrUHID);
	}
	
	public void CheckIDARCValidationPopUp() {
		String actualResult = driver.switchTo().alert().getText();
		String ExpectedResult = "ID No./ ARC No.already exist for the UHID : "+bfrUHID+" Would you like to retain the same number again ?";
		Assert.assertEquals(ExpectedResult, actualResult);
		driver.switchTo().alert().accept();
	}
	
	
	
}
