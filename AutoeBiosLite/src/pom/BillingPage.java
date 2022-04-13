package pom;

import java.util.List;

import org.apache.commons.math3.analysis.function.Exp;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class BillingPage extends BasePage {

	// Enter UHID
	@FindBy(id = "cpBody_txtUHID")
	private WebElement UHIDNo;
	
	//UHID label
	@FindBy(xpath = "//label[text()='UHID No.']")
	private WebElement UHIDName;

	// AlertPopup
	@FindBy(xpath = "//h5[text()='Alerts']")
	private WebElement Alertpopup;

	// Alert Close Button
	@FindBy(xpath = "//button[@class='btn btn-secondary btn-sm closeChild']")
	private WebElement AlertClose;

	// Select Hospital visit radio button
	@FindBy(xpath = "//input[@id='cpBody_usrPatVisit_rdVisitToHosp']")
	private WebElement HospVisitRadioBtn;

	// Click on Department dropdown
	@FindBy(xpath = "//div[@id='cpBody_usrPatVisit_cmbDepartment_chosen']")
	private WebElement DeptDropDown;

	// Select Clinical laboratory department
	@FindBy(xpath = "//div[@class='chosen-drop']//li[.='CLINICAL LABORATORY']")
	private WebElement ClinicalLaboratory;

	// Select Clinical laboratory polis department
	@FindBy(xpath = "//div[@class='chosen-drop']//li[.='CLINICAL LABORATORY (POLIS)']")
	private WebElement ClinicalLaboratoryPolis;

	// Select Physician visit radio button
	@FindBy(xpath = "//input[@id='cpBody_usrPatVisit_rdVisitToPhy']")
	private WebElement PhyVisitRadioBtn;

	// click on physician list dropdown
	@FindBy(xpath = "//div[@id='cpBody_usrPatVisit_drpDr_chosen']")
	private WebElement PhyDropdown;

	// Select Physician
	@FindBy(xpath = "//div[@class='chosen-drop']//li[.='ADAMANTIA TSOMPANELI MAVROU|Dentistry']")
	private WebElement AdamantiaTsompaneliMovrou;

	@FindBy(xpath = "//div[@class='chosen-drop']//li[.='ADAMOS ADAMOU|Oncology")
	private WebElement AdamosAdamou;

	// Click introducing source
	@FindBy(xpath = "//div[@id='cpBody_usrPatVisit_drpPRef_chosen']")
	private WebElement clickIntroudcingSourceinVisit;

	// Click introducing source
	@FindBy(xpath = "// div[@id='cpBody_usrPatVisit_drpPRef_chosen']//li[text()='A.M. STUDIO OZZ LTD']")
	private WebElement SelectAMSTUDIOOZZLTDinVisit;
	// div[@id='cpBody_usrPatVisit_drpPRef_chosen']//li[text()='A.M. STUDIO OZZ
	// LTD']

	// Click okay button in visit pop up
	@FindBy(xpath = "//button[@onclick='fn_SpinnerShow(); fn_ValidateVisit();']")
	private WebElement OkayBtn;
	
	//Advance Search Button 
	@FindBy(xpath = "//button[@id='btnPatSearch']")
	private WebElement AdvSearch;
	
	//Seen Patient Button
	@FindBy(xpath = "//a[text()='Seen Patients']")
	private WebElement SeenPatient;
	
	//Admitted Patients Button
	@FindBy(xpath = "//a[text()='Admitted Patients']")
	private WebElement AdmittedButton;
	
	//NHS Button
	@FindBy(xpath = "//a[text()='NHS']")
	private WebElement NHS;
	
	//Select Local Patient from admitted patient list
	@FindBy(xpath = "//td[text()='LOCAL PATIENT']")
	private List<WebElement> localPatient;
	
	//Select Ok button in Admitted patient tab
	@FindBy(xpath = "//button[@id='cpBody_btnPatSearchOk']")
	private WebElement OKinAdmittedtab;
	
	//Select Service and Product Slider
	@FindBy(xpath = "(//span[@class='slider round'])[1]")
	private WebElement ServiceSlider;
	
	//Select Department Drop Down
	@FindBy(xpath = "//h5[text()='Select Department']")
	private WebElement SelectDept;
	
	//Select Change button for Department
	@FindBy(xpath = "//i[@id='iconChangeDept']")
	private WebElement Changedepartment;
	
	//Select Department drop down in Select Department pop up
	@FindBy(xpath = "//div[@id='drpModel']//a")
	private WebElement DepartmentDD;
	
	//Select Accounts Dept in Department Drop Down
	@FindBy(xpath = "//li[text()='ACCOUNTS DEPT']")
	private WebElement AccountsDept;
	
	//Select Day Procedure Unit in Department Drop down
	@FindBy(xpath = "//li[text()='DAY PROCEDURE UNIT']")
	private WebElement DayProcedureUnit;
	
	//Select HOSPITAL MAIN STORES in Department Drop down
	@FindBy(xpath = "//li[text()='HOSPITAL MAIN STORES']")
	private WebElement Hospitalmainstores;
	
	//Select OK in Select Department drop down
	@FindBy(xpath = "//button[@id='btnCloseDept']")
	private WebElement OkinDepartmentDD;
	
	//Select Expiry date Drop down
	@FindBy(xpath = "//span[text()='BATCH | QOH | EXPIRY DATE']")
	private WebElement ExpiryDateDD;
	
	//Select Date from Expiry date Drop Down
	@FindBy(xpath = "(//ul[@class='chosen-results']//li[2])[1]")
	private WebElement ExpiryDate;
	
	//Select Add button for adding product
	@FindBy(xpath = "//button[@id='btnAddProducts']")
	private WebElement AddProducts;
	
	//Select Add text field 
	@FindBy(xpath = "//input[@id='cpBody_txtIssueQty']")
	private WebElement AddProductfield;
	
	// Primary introducing sources
	@FindBy(xpath = "//div[@id='cpBody_drpPSource_chosen']")
	private WebElement PrimaryIntroSource;

	// Select Introducing source from the list
	@FindBy(xpath = "//div[@id='cpBody_drpPSource_chosen']//li[.='A.M. STUDIO OZZ LTD']")
	private WebElement AM_STUDIOOZZ_LTD;

	@FindBy(xpath = "//div[@id='cpBody_drpPSource_chosen']//li[.='ADAMANTIA TSOMPANELI MAVROU']")
	private WebElement ADAMANTIA_TSOMPANELI_MAVROU;

	// service textbox
	@FindBy(xpath = "//input[@id='cpBody_txtService']")
	private WebElement Service;

	// Service Grid
	@FindBy(xpath = "//table[@id='tblServiceDetails']//h6")
	private List<WebElement> ServiceGridColumnNames;
	
	//Select Quantity from Service grid
	@FindBy(xpath = "//input[@id='tblServiceDetails_Row1_Col3']")
	private WebElement ServiceQuantity;
	
	//Select Doctor Amount from Service Grid
	@FindBy(xpath = "//input[@id='tblServiceDetails_Row1_Col5']")
	private WebElement DoctorAmount;
	
	//Select Hospital Amount from Service Grid
	@FindBy(xpath = "//input[@id='tblServiceDetails_Row1_Col7']")
	private WebElement HospitalAmount;
	
	//Select Gross value Amount from Service Grid
	@FindBy(xpath = "//input[@id='tblServiceDetails_Row1_Col9']")
	private WebElement GrossValue;
	
	//Select Amount text field 
	@FindBy(xpath = "//input[@id='cpBody_usrctrlBillRcpts_txtPAmt']")
	private WebElement AmtTextfield;
	 

	@FindBy(id = "cpBody_txtRecptNo")
	private WebElement InvoiceCode;

	// doctor discount
	@FindBy(id = "cpBody_txtDrDisc")
	private WebElement DrDiscInPercent;

	// hospital discount
	@FindBy(id = "cpBody_txtHospDisc")
	private WebElement HospDiscInPercent;

	// Apply discount
	@FindBy(id = " btnApply")
	private WebElement ApplyDisc;

	// Discount Approved by
	@FindBy(xpath = "cpBody_drpDiscApprovingEmployee_chosen")
	private WebElement DiscApprvDropdown;

	// Approvers
	@FindBy(xpath = "div[@id='cpBody_drpDiscApprovingEmployee_chosen']//ul/li[1]")
	private WebElement ADAMOSADAMOU;

	@FindBy(xpath = "div[@id='cpBody_drpDiscApprovingEmployee_chosen']//ul/li[2]")
	private WebElement AFROULAKARAMANI;

	// MEDICATION AMOUNT
	@FindBy(id = "lblMedicationAmt")
	private WebElement MedicationAmt;

	// Total Amount
	@FindBy(id = "lblBillAMT")
	private WebElement TotalBillAmt;

	// Total Discount amount
	@FindBy(id = "lblDiscount")
	private WebElement DiscAmt;

	// Total Discount amount
	@FindBy(id = "lblNetVal")
	private WebElement TotalNetAmt;

	// Click on Out standing bills pop up link
	@FindBy(id = "cpBody_lblOutStandingBills")
	private WebElement OSBillsPopUp;

	// select bill on Out standing bills pop up link
	@FindBy(xpath = "//input[@id='tbOSB_Row1_Col13']")
	private WebElement OSBill_1;

	// select bill on Out standing bills pop up link
	@FindBy(xpath = "//input[@id='tbOSB_Row2_Col13']")
	private WebElement OSBill_2;

	// okay button in OS balance pop up
	@FindBy(id = "btnOkOutStandingBills")
	private WebElement OkayOSBills;

	// First Bill OS Balanace amount
	@FindBy(id = "tbOSB_Row1_Col8")
	private WebElement bill1OsAmt;

	// First Bill OS Balanace amount
	@FindBy(id = "tbOSB_Row2_Col8")
	private WebElement bill2OsAmt;

	// Selected OS Balance amount

	@FindBy(id = "lblSelOSAmt")
	private WebElement SelectedOSAmt;

	// Payment section
	@FindBy(id = "cpBody_usrctrlBillRcpts_txtPAmt")
	private WebElement amtTxtBox;

	// Cash payment
	@FindBy(xpath = "//label[.='Cash']")
	private WebElement Cash;

	//Visa or Credit Payment
	@FindBy(xpath = "//label[.='Visa / Credit Card']")
	private WebElement VisaCreditCard;
	
	//Isnurance Payment
	@FindBy(xpath = "//label[.='Insurance Payment']")
	private WebElement Insurance;

	//Bank Transfer
	@FindBy(xpath = "//label[.='Bank Transfer']")
	private WebElement BankTransfer;

	//Cheque
	@FindBy(xpath = "//label[.='Cheque']")
	private WebElement Cheque;

	//Multiple Payment
	@FindBy(xpath = "//label[.='Multiple Payment']")
	private WebElement MultiplePayment;
	
	//Select Reference Number Text Field
	@FindBy(xpath = "//input[@id='cpBody_usrctrlBillRcpts_txtPRefNo']")
	private WebElement ReferenceNumber;

	// Drop down in multiple payment
	@FindBy(xpath = "//div[@id='tbBillPayment_Row1_Col0_chosen']")
	private WebElement MultiplePaymentdropdown;

	// Cash in multi payment section
	@FindBy(xpath = "//div[@id='tbBillPayment_Row1_Col0_chosen']//li[.='Cash']")
	private WebElement CashinMultippayment;
	
	//Select Payment Section Drop down in Multipayment
	@FindBy(xpath = "//div[@id='tbBillPayment_Row1_Col0_chosen']")
	private WebElement MultipayDropDown;

	// Visa and Credit card in multi payment section
	@FindBy(xpath = "//div[@id='tbBillPayment_Row1_Col0_chosen']//li[.='Visa / Credit Card']")
	private WebElement VisaCreditinMultippayment;

	//Insurance in multi payment section
	@FindBy(xpath = "//div[@id='tbBillPayment_Row1_Col0_chosen']//li[.='Insurance Payment']")
	private WebElement InsurancePymtinMultippayment;

	//Bank Transfer in multi payment section
	@FindBy(xpath = "//div[@id='tbBillPayment_Row1_Col0_chosen']//li[.='Bank Transfer']")
	private WebElement BankPymtinMultippayment;

	// Cheque in multi payment section
	@FindBy(xpath = "//div[@id='tbBillPayment_Row1_Col0_chosen']//li[.='Cheque']")
	private WebElement ChequePymtinMultippayment;
	
	//Click on New Button in Multiple Payment
	@FindBy(xpath = "//button[@class='btn btn-info']")
	private WebElement NewinMultiPay;

	// Dropdown in Insurance Carrier
	@FindBy(xpath = "//div[@id='cpBody_usrctrlBillRcpts_drpPInsu_chosen']")
	private WebElement InsuranceCarrier;

	// Select A.M. STUDIO OZZ LTD (SHARE)
	@FindBy(xpath = "//li[text()='A.M. STUDIO OZZ LTD (SHARE)']")
	private WebElement AMStudioOzz;

	// Select GESY (SHARE)
	@FindBy(xpath = "//li[text()='GESY (SHARE)']")
	private WebElement Gesy;

	// Select BLUE CROSS INSURANCE
	@FindBy(xpath = "//li[text()='BLUE CROSS INSURANCE']")
	private WebElement BLUECROSSINSURANCE;

	// Invoice Page
	@FindBy(xpath = "//h4[text()='Invoice']")
	private WebElement InvoicePage;

	// Invoice Close Button
	@FindBy(xpath = "(//button[@onclick='fn_CloseRegForm();'])[3]")
	private WebElement InvoiceClose;

	// Receipt Page
	@FindBy(xpath = "//h4[text()='Receipt']")
	private WebElement Receiptpage;

	// Receipt Close Button
	@FindBy(xpath = "(//button[@id='btnmodalClose'])[1]")
	private WebElement ReceiptClose;

	// Save button
	@FindBy(id = "btnSave")
	private WebElement Save;
	
	//Select Clear Button
	@FindBy(xpath = "//a[@id='cpBody_btnBillClose']")
	private WebElement clear;
	
	//Zero Amount paid Invoice
	@FindBy(xpath = "//button[@id='btnmodalClose']")
	private WebElement ZeropaidInvoice;

	// detailed radio button
	@FindBy(id = "rdDetailed")
	private WebElement Detailed;

	// detailed radio button
	@FindBy(id = "rdSummary")
	private WebElement summary;

	// A4 Print
	@FindBy(id = "rdA4")
	private WebElement PrintA4;

	// A5 Print
	@FindBy(id = "rdA5")
	private WebElement PrintA5;

	// Print Yes
	@FindBy(id = "btnDialogYes")
	private WebElement PrintYes;

	// Print No
	@FindBy(id = "btnDialogNo")
	private WebElement PrintNo;

	// Clear button
	@FindBy(xpath = "//div[@id='dvAmt']")
	private WebElement Scrollpayment;

	// disabled columns in service grid
	@FindBy(xpath = "//table[@id='tblServiceDetails']//th[@class='d-none']")
	private List<WebElement> DisabledColumns;

	// Print invoice icon
	@FindBy(id = "aPrintReport")
	private WebElement PrintInvIcon;

	// Search for invoice
	@FindBy(id = "txtPrintSearch")
	private WebElement searchInvoice;

	// Print Summary invoice
	@FindBy(xpath = "//button[@class='btn btn-sm btn-block btn-warning']")
	private WebElement SummaryInvPrint;

	// Print Detailed Invoice
	@FindBy(xpath = "//button[@class='btn btn-sm btn-block btn-primary']")
	private WebElement DetailedInvPrint;
	
	//Close the invoice print pop up
	@FindBy (xpath = "//h5[.='Print Invoice']/../button[@class='close']")
	private WebElement CloseprintInvoicePOpup;
	
	//balance amount fetch
	@FindBy (xpath = "//div[@id='dvSub']//label[@id='lblBal']")
	private WebElement BalanceAmt;
	
	//Select Amount 
	@FindBy(xpath = "//input[@id='tbBillPayment_Row1_Col2']")
	private WebElement Amount;
	
	//Select Physician pop up 
	@FindBy(xpath = "//h5[contains(text(),'Select Physician for')]")
	private WebElement SelectPhysician;
	
	//Select Physician drop down
	@FindBy(xpath = "//div[@id='cpBody_drpPhysician_chosen']")
	private WebElement PhysicianDropdown;
	
	//Select ADAMOS ADAMOU from Physician Drop down
	@FindBy(xpath = "//li[text()='ADAMOS ADAMOU']")
	private WebElement PhysicianAdamosAdamou;
	
	//Select Nestoras Michael from Physician Drop down
	@FindBy(xpath = "//li[text()='NESTORAS MICHAEL']")
	private WebElement PhysicianNestorasMichael;
	
	//Select OK button Select Physician drop down
	@FindBy(xpath = "//button[@id='btnClosePhy']")
	private WebElement OKinPhysicianPopup;
	
	//Select Dr Dicount text field
	@FindBy(xpath = "//input[@id='cpBody_txtDrDisc']")
	private WebElement DrDiscount;
	
	//Select Dr Disc Slider 
	@FindBy(xpath = "(//div[@class='input-group-text'])[1]")
	private WebElement DrDiscSlider;
	
	//Select Hospital Discount text field
	@FindBy(xpath = "//input[@id='cpBody_txtHospDisc']")
	private WebElement HospDiscount;
	
	//Select Hospital Discount Slider
	@FindBy(xpath = "(//div[@class='input-group-text'])[2]")
	private WebElement HospDiscSlider;
	
	//Select Apply button for Dr and Hosp Disc
	@FindBy(xpath = "//button[@id='btnApply']")
	private WebElement ApplyDiscount;
	
	//Select Discount Approved by Drop Down
	@FindBy(xpath = "//div[@id='cpBody_drpDiscApprovingEmployee_chosen']")
	private WebElement DiscApprovedByDD;
	
	//Select Adamos Adamou in Discount Approved by Drop Down
	@FindBy(xpath = "//li[text()='ADAMOS ADAMOU']")
	private WebElement DiscApprovedbyAA;
	
	//Select Nestoras Michael
	@FindBy(xpath = "//li[text()='NESTORAS MICHAEL']")
	private WebElement DiscApprovedbyNM;
	
	//Select Delete in Medication Grid
	@FindBy(xpath = "//i[@id='tblServiceDetails_Row1Delete']")
	private WebElement DeleteMedic;
	
	//Select extended service search in the grid
	@FindBy(xpath = "//th[@id='thServiceName']")
	private WebElement ServiceSearch;
	
	@FindBy(id="idService")
	private WebElement extendedserivcesearch;
	
	//Select Physician Drop Down in Service Grid
	@FindBy(xpath = "//div[@id='tblServiceDetails_Row1_Col4_chosen']")
	private WebElement PhysicianGrid;
	
	//Select Doctor Discount in grid 1
	//@FindBy(xpath = "//input[@id='tblServiceDetails_Row1DrPerc']")
	@FindBy(id="tblServiceDetails_Row1DrPerc")
	private WebElement DrDiscinGrid1;
	
	//Select Hospital Discount in grid 1
	@FindBy(xpath = "//input[@id='tblServiceDetails_Row1HospPerc']")
	private WebElement HospDiscinGrid1;
	
	//Select Doctor Discount in grid 2
	@FindBy(xpath = "//input[@id='tblServiceDetails_Row2DrPerc']")
	private WebElement DrDiscinGrid2;
	
	//Select Hospital Discount in grid 2
	@FindBy(xpath = "//input[@id='tblServiceDetails_Row2HospPerc']")
	private WebElement HospDiscinGrid2;
	
	//Select Bank drop down in Payment Section
	@FindBy(xpath = "//div[@id='cpBody_usrctrlBillRcpts_drpPBank_chosen']")
	private WebElement BankDropDown;
	
	//Select Alpha Bank from Bank Drop down
	@FindBy(xpath = "//li[text()='Alpha Bank']")
	private WebElement AlphaBank;
	
	//Select Bank of cyprus from Bank Drop Down
	@FindBy(xpath = "//li[text()='Bank of Cyprus']")
	private WebElement BankofCyprus;
	
	//Select Rcb Bank from Bank Drop Down
	@FindBy(xpath = "//li[text()='RCB Bank']")
	private WebElement RcbBank;
	
	//Select Delete option in Grid to Delete medication
	@FindBy(xpath = "//i[@id='tblServiceDetails_Row1Delete']")
	private WebElement DeleteMedication;
	
	//Select Amount text field in 1st row of Multiple Payment Section
	@FindBy(xpath = "//input[@id='tbBillPayment_Row1_Col2']")
	private WebElement AmtTextFieldin1stRow;
	
	//Select Bank Drop dowm in 1st row of Multiple Payment Section
	@FindBy(xpath = "//div[@id='tbBillPayment_Row1_Col4_chosen']")
	private WebElement BankDDin1strowMP;
	
	//Select Alpha bank in Bank Drop down in 1st row of Multiple Section
	@FindBy(xpath = "//div[@id='tbBillPayment_Row1_Col4_chosen']//li[text()='Alpha Bank']")
	private WebElement AlphaBankinBankDD1strow;
	
	//Select Cheque in Payment type drop down in 1st row of Multiple payment 
	@FindBy(xpath = "//div[@id='tbBillPayment_Row1_Col0_chosen']//li[text()='Cheque']")
	private WebElement Chqeuein1strowMP;
	
	//Select Bank Transfer in Paymeny type drop down in 1st row of Multiple payment 
	@FindBy(xpath = "//div[@id='tbBillPayment_Row1_Col0_chosen']//li[text()='Bank Transfer']")
	private WebElement BankTransferin1strow;
	
	//Click on Payment drop down in 2nd Row of Multiple Payment 
	@FindBy(xpath = "//div[@id='tbBillPayment_Row2_Col0_chosen']")
	private WebElement PaymentDDin2ndrow;
	
	//Select Cheque in Payment type drop down in 2nd row of Multiple Payment 
	@FindBy(xpath = "//div[@id='tbBillPayment_Row2_Col0_chosen']//li[text()='Cheque']")
	private WebElement Chequein2ndrowMP;
	
	//Select Bank Transfer in Payment type drop down in 2nd row of Multiple Payment
	@FindBy(xpath = "//div[@id='tbBillPayment_Row2_Col0_chosen']//li[text()='Bank Transfer']")
	private WebElement BankTransferin2ndrowMP;
	
	//Select Amount text field in 2nd row of Multiple Payment section
	@FindBy(xpath = "//input[@id='tbBillPayment_Row2_Col2']")
	private WebElement Amtin2ndRowMP;
	
	//Invoice pop up
	@FindBy(xpath = "//span[text()='Select']")
	private WebElement InvoicePopup;
	
	
	
	
	// Initialize web element
	public BillingPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	
	//Verify UHID Text Field
	public void VerifyUHIDName() throws InterruptedException 
	{
		Thread.sleep(2000);
		String Actual = UHIDName.getText();
		String Expected = "UHID No.";
		Assert.assertEquals(Expected, Actual);
		
		
		
	}
	
	
	//Verify Zero Alert Pop up
	public void VerifyZeroAlertPopup() throws InterruptedException 
	{
		Thread.sleep(2000);
		String Actual = driver.switchTo().alert().getText();
		String Expected = "The Receipt Amount is Zero. Do you need to continue?";
		Assert.assertEquals(Actual, Expected);
	}
	
	//Click Ok in Save Bill for Zero Alert pop up
	public void ClickOKinZeroAlert() 
	{
		driver.switchTo().alert().accept();
		
	}
	
	public void setUHIDNo(String UHID) {
		UHIDNo.sendKeys(UHID, Keys.ENTER);
		// UHIDNo.sendKeys(Keys.ENTER);
	}
	
	//Search Name
	public void setName(String Name) throws InterruptedException 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(UHIDNo)).sendKeys(Name);
		Thread.sleep(1000);
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(UHIDNo)).sendKeys(Keys.ARROW_DOWN, Keys.RETURN);
		
	}

	public void VerifyAlertPopup() throws InterruptedException {
		Thread.sleep(2000);
		String Actual = Alertpopup.getText();
		String Expected = "Alerts";
		Assert.assertEquals(Expected, Actual);
	}

	public void AlertClose() throws InterruptedException 
	{
		Thread.sleep(2000);
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(AlertClose)).click();

	}

	public void SelectHospRadio() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(HospVisitRadioBtn)).click();

	}
	
	//Click on Clear Button
	public void clickClear() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(clear)).click();
		
	}

	// Select Dept Drop Down
	public void clickDeptDropdown() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(DeptDropDown)).click();
		// DeptDropDown.click();
	}

	// Select Clinical Laboratory
	public void setClinicalLab() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(ClinicalLaboratory)).click();
		// ClinicalLaboratory.click();
	}

	// select Clinical Laboratory Polis department
	public void setClinicalLabPolis() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(ClinicalLaboratoryPolis)).click();
		// ClinicalLaboratoryPolis.click();
	}

	// set primary introducing source in visit
	public void ClickIntroducingSource() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(ClinicalLaboratoryPolis)).click();
		// ClinicalLaboratoryPolis.click();
	}

	public void clickIntroducingSourceinVisit() {
		clickIntroudcingSourceinVisit.click();
	}

	public void SelectPrimaryIntroinVisit() {
		SelectAMSTUDIOOZZLTDinVisit.click();
	}

	// Click on Okay button on Visit pop up
	public void clickOkay() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(OkayBtn)).click();
		// OkayBtn.click();
	}
	
	//Click on Advance Search
	public void clickAdvSearch() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(AdvSearch)).click();
		
	}
	
	//Click on Seen Patient Button
	public void clickSeenPatient() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(SeenPatient)).click();
		
	}
	
	//Click on Admitted Patient Button
	public void clickAdmittedButton() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(AdmittedButton)).click();
		
	}
	
	//Click on NHS Button
	public void clickNHS() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(NHS)).click();
		
	}
	
	//Click on latest local patient in Admitted Patient
	public void clicklocalPatient() 
	{
		int x = localPatient.get(localPatient.size()-1).getLocation().getX();
		int y = localPatient.get(localPatient.size()-1).getLocation().getY();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(" + x + ", " + y + ");");
		localPatient.get(localPatient.size()-1).click();
	}
	
	//Click OK in Admitted patient Tab
	public void clickOKinAdmittedtab() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(OKinAdmittedtab)).click();
		
	}
	
	//Verify Receipt amount is zero Alert pop up
	public void clickOKinalert() throws InterruptedException 
	{
		Thread.sleep(2000);
		String Expected = driver.switchTo().alert().getText();
		String Actual = "The Receipt Amount is Zero. Do you need to continue?";
		Assert.assertEquals(Expected, Actual);
		driver.switchTo().alert().accept();
		
	}
	
	//Click close button in zero paid Invoice Bill
	public void closeZeropaidInvoice() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(ZeropaidInvoice)).click();
		
	}
	
	//Click on Service and Product Slider
	public void clickServiceSlider() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(ServiceSlider)).click();
		
	}
	
	//Verify Select Department pop up
	public void verifySelectDept() throws InterruptedException 
	{	
		Thread.sleep(2000);
		String Expected = SelectDept.getText();
		String Actual = "Select Department";
		Assert.assertEquals(Expected, Actual);	
	}
	
	//Click on Department Drop Down in Select Department pop up
	public void clickDepartmentDD() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(DepartmentDD)).click();
		
	}
	
	//Click on Change button in Select Department 
	public void clickChangeDepartment() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Changedepartment)).click();
		
	}
	
	//Click on Accounts Dept
	public void clickAccountsDept() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(AccountsDept)).click();
		
	}
	
	//Click on Day Procedure Unit
	public void clickDayProcedureUnit() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(DayProcedureUnit)).click();
		
	}
	
	//Click on Hospital main stores
	public void clickHospitalmainstores() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Hospitalmainstores)).click();
		
	}
	
	//Click on OK in Select Department Drop Down
	public void clickOKinSelectDept() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(OkinDepartmentDD)).click();
		
	}
	
	//Click on Expiry date Drop Down
	public void clickExpiryDateDD() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(ExpiryDateDD)).click();
		
	}
	
	//Click on Expiry date in Expiry date drop down
	public void clickExpiryDate() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(ExpiryDate)).click();
		
	}
	
	//Click on Add Button
	public void clickAddProducts() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(AddProducts)).click();
		
	}
	
	//Clear Add product text field
	public void clearAddProductfield() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(AddProductfield)).clear();
		
	}

	// Click on introducing source dropdown
	public void clickIntroducingSource() {
		PrimaryIntroSource.click();
	}

	// select primary introducing source
	public void setPrimaryIntroSource() {
		AM_STUDIOOZZ_LTD.click();
	}

	// Read Medication amt
	public String checkMedicationAmt() {
		String mAmt = MedicationAmt.getText();
		return mAmt;
	}

	// Read Total amt
	public String checkTotalBillAmt() {
		String TotalBAmt = TotalBillAmt.getText();
		return TotalBAmt;
	}

	// Read Total amt
	public String checkTotalNetAmt() {
		String TotalnAmt = TotalNetAmt.getText();
		System.out.println(TotalnAmt);
		return TotalnAmt;
	}

	// click on OS balance
	public void selectOSBill() {
		OSBillsPopUp.click();
	}

	// select bill 1 from OS balance pop up
	public void SelectOSBill1() {
		OSBill_1.click();
	}

	// select bill 1 from OS balance pop up
	public void SelectOSBill2() {
		OSBill_2.click();
	}

	// Add services textfield
	public void AddServices(String code) throws InterruptedException {
		Thread.sleep(1000);
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Service)).sendKeys(code,Keys.RETURN);
		

	}

	//Add Medications in product text field
	public void AddMedications(String code) throws InterruptedException 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Service)).sendKeys(code);
		Thread.sleep(2000);
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Service)).sendKeys(Keys.ARROW_DOWN,Keys.RETURN);
		
	}
	
	// Click Service Quantity in Service Grid
	public void clickServiceQuantity() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(ServiceQuantity)).click();
		
	}
	
	//Send data To Service Quantity in Service Grid
	public void setServiceQuantity(String Quantity) throws InterruptedException 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(ServiceQuantity)).sendKeys(Quantity);
		
	}
	
	//Get Service Quantity
	String Quantity;
	int Qty;
	public void getQuantity() throws InterruptedException 
	{
		Quantity=new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(ServiceQuantity)).getText();
		Thread.sleep(1000);
		System.out.println(Quantity);
		Qty = Integer.parseInt(Quantity);
		
	}
	
	
	//Click Doctor Amount in Service grid
	int DrAmt;
	public void getDoctorAmount() 
	{
		String da=new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(DoctorAmount)).getText();
		DrAmt=Integer.parseInt(da);
	}
	
	//Click on Hospital Amount in Service Grid
	String ha;
	int HopsAmt;
	public void getHospitalAmount() 
	{
		ha=new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(HospitalAmount)).getText();
		HopsAmt = Integer.parseInt(ha);
	}
	
	//Click on Gross Value in Service Grid
	String GrossAmt;
	public void getGrossValue() 
	{
		GrossAmt=new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(GrossValue)).getText();
		
	}
	
	//Verify Gross Value Amount from grid
	int Amt;
	public void VerifyGrossAmt() 
	{
		Amt = DrAmt*Qty + HopsAmt*Qty ;
		String Actual = String.valueOf(Amt);
		String Expected = GrossAmt;
		Assert.assertEquals(Expected, Actual);
	}
	
	//Click on Amount text field 
	public void setAmttextfield(String Amt) throws InterruptedException 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(AmtTextfield)).click();
		Thread.sleep(2000);
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(AmtTextfield)).sendKeys(Amt);
				
	}
	
	// accept okay in receipt amount zero pop up
	public void SaveBillForZero() {
		driver.switchTo().alert().accept();
	}

	// Scroll to payment section
	public void ScrolltoPayment() {
		int x = Scrollpayment.getLocation().getX();
		int y = Scrollpayment.getLocation().getY();
		JavascriptExecutor js = (JavascriptExecutor) driver; // Type casting
		js.executeScript("window.scrollBy(" + x + ", " + y + ");");
		Actions action = new Actions(driver);
		action.moveToElement(Scrollpayment).perform();
		
		

	}

	// Select cash
	public void selectCash() {
		Cash.click();
	}

	// //Check service grid column name
	// public void VerifyServiceGridColumnNames() {
	// for(WebElement srvGrid : ServiceGridColumnNames) {
	// srvGrid.getText();
	// }
	// }

	// Service grid disabled columns
	public void disabledServicegridColumns() {

	}

	// Select Visa and credit card
	public void selectVisaCredit() {
		VisaCreditCard.click();
	}

	// Select insurance
	public void selectInsurance() {
		Insurance.click();
	}

	// Click on Insurance Carrier
	public void SelectInsuranceCarrier() {
		InsuranceCarrier.click();
	}

	// Click on AMStudioOzz
	public void SelectAMStudioOzz() {
		AMStudioOzz.click();
	}

	// Click on Gesy
	public void SelectGesy() {
		Gesy.click();
	}

	// Click on BLUECROSSINSURANCE
	public void SelectBLUECROSSINSURANCE() {
		BLUECROSSINSURANCE.click();
	}

	// select Bank transfer
	public void selectBankTransfer() {
		BankTransfer.click();
	}

	// select cheque payment
	public void selectCheque() {
		Cheque.click();
	}

	// Select multiple payments section
	public void selectMultiplePayment() {
		MultiplePayment.click();
	}
	
	//Reference Number Text field
	public void setReferenceNumber(String RefNum) 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(ReferenceNumber)).sendKeys(RefNum);
		
	}

	// Select cash in Multiple payment section
	public void SelectCashInMultiplePytSection() {
		CashinMultippayment.click();
	}
	
	//Click on Payment Drop Down in Multiple Payment
	public void ClickMultipayDropDown() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(MultipayDropDown)).click();
		
	}
	
	//Select Visa or credit card in Multiple payment Section
	public void SelectVisaInMultiplePytSection() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(VisaCreditinMultippayment)).click();
		
	}


	// Select Insurance in Multiple payment section
	public void SelectInsuranceInMultiplePytSection() {
		InsurancePymtinMultippayment.click();
	}

	// Select Bank in Multiple payment section
	public void SelectBankInMultiplePytSection() {
		BankPymtinMultippayment.click();
	}

	// Select Cheque in Multiple payment section
	public void SelectChequeInMultiplePytSection() {
		ChequePymtinMultippayment.click();
	}
	
	//Click on New in Multiple payment
	public void clickNewinMultiPay() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(NewinMultiPay)).click();
		
	}

	// click on save
	public void clickSave() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Save)).click();
		// Save.click();
	}

	// select detailed print radio button
	public void clickDetailed() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Detailed)).click();
		// OkayBtn.click();
	}

	// select summary print radio button
	public void clickSummary() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(summary)).click();
		// OkayBtn.click();
	}

	// click on A4
	public void clickA4() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(PrintA4)).click();
		// OkayBtn.click();
	}

	// click on A5
	public void clickA5() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(PrintA5)).click();
		// OkayBtn.click();
	}

	public void SelectedOSBillAmtMatch() {
		String actual1 = bill1OsAmt.getText();
		String actual2 = bill2OsAmt.getText();

		// String exp[] = SelectedOSAmt.getText().split(" ");
		// Assert.assertEquals(ExpectedTitle, ActualTitle);

	}

	public void clickPrintYes() {
		PrintYes.click();
	}

	public void clickPrintNo() {
		PrintNo.click();
	}

	public void verifyZeroBillConfirmationPOpup() {
		String actualmsg = driver.switchTo().alert().getText();
		String expectedmsg = "The Receipt Amount is Zero. Do you need to continue?";
		Assert.assertEquals(expectedmsg, actualmsg);
	}

	// Returns Invoice Code
	public String getInvoiceCode() {
		String invcode[] = InvoiceCode.getText().split(" ");
		return invcode[2];
	}

	public void AcceptInsuranceChangePopup() {
		String actualmsg = driver.switchTo().alert().getText();
		String expectedmsg = "Selected Insurance Carrier does not match insurance details set for the patient. Would you like to continue?";
		Assert.assertEquals(expectedmsg, actualmsg);
		driver.switchTo().alert().accept();
	}

	public void verifyInvoicePagePopup() {
		String actualmsg = InvoicePage.getText();
		String expectedmsg = "Invoice";
		Assert.assertEquals(expectedmsg, actualmsg);
		// SelectInvoiceClose;
	}

	public void closeInvoicePopup() {
		
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(InvoiceClose)).click();
		// InvoiceClose.click();
	}

	public void verifyReceiptPagePopup() {
		String actualmsg = Receiptpage.getText();
		String expectedmsg = "Receipt";
		Assert.assertEquals(expectedmsg, actualmsg);

	}

	public void closeReceiptPopup() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(ReceiptClose)).click();
		// ReceiptClose.click();
	}

	// match disabled columns count
	public void disabledColumnCount(int disabledCount) {
		int Actualcount = DisabledColumns.size();
		disabledCount = disabledCount + 1;
		Assert.assertEquals(disabledCount, Actualcount);

	}

	// Search and add invoice record to grid
	public void searchInvoice() throws InterruptedException {
		searchInvoice.sendKeys(InvoiceCode.getText());
		Thread.sleep(2000);
		searchInvoice.sendKeys(Keys.ARROW_DOWN, Keys.RETURN);
	}

	// print summary invoice from the print invoice pop up
	public void printSummaryInvoice() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(SummaryInvPrint)).click();
	}

	// print summary invoice from the print invoice pop up
	public void printDetailedInvoice() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(DetailedInvPrint)).click();
	}
	
	//close the invoice print pop up
	public void closePrintInvoicePopup() {
		CloseprintInvoicePOpup.click();
	}
	
	//Get the Balance amount from the billing screen
	public String getBalanceAmt() {
		return BalanceAmt.getText();
	}
	
	//clear the amount text box.
	public void clearAmtTextbox() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(amtTxtBox)).clear();
	}
	
	//Enter half of the bill amount in amount text field
	public void EnterBillAmount(String amt) {
		double bAmt =Double.parseDouble(amt);
		double halfAmt = bAmt/2;
		amt = Double.toString(halfAmt);
		System.out.println(amt);
//		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(amtTxtBox)).click();
//		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(amtTxtBox)).clear();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('cpBody_usrctrlBillRcpts_txtPAmt').value=''");
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(amtTxtBox)).sendKeys(amt);
				
	}
	
	//Fetch the Amount
	
	 
	public void selectAmount() 
	{
		String advamt = driver.findElement(By.id("tbBillPayment_Row1_Col2")).getAttribute("value");
	}
	
	//Click ok in alert pop up for insurance carrier payment option
	public void InusrancepaymentAlert() throws InterruptedException 
	{
		Thread.sleep(2000);
		String Actual = driver.switchTo().alert().getText();
		String Expected = "Selected Insurance Carrier does not match insurance details set for the patient. Would you like to continue?";
		Assert.assertEquals(Actual, Expected);
		driver.switchTo().alert().accept();
		
	}
	
	public void BillingUHIDSave() {
		String billUHID = driver.findElement(By.id("cpBody_txtUHID")).getAttribute("value");
	}

	//Fetch the Service name from the grid
	String ServiceinBilling ;
	
	public void getServicename() 
	{
		ServiceinBilling = driver.findElement(By.id("tblServiceDetails_Row1_Col2")).getAttribute("value");
	}
	//Verify the service name
	public void verifyServicename() 
	{
		
		//Assert.assertEquals(ServiceinBilling, ServiceinChargeSheet);
		
	}
	
	//Verify Select Physician pop UP
	public void verifySelectPhysician() throws InterruptedException 
	{	
		Thread.sleep(2000);
		String Expected = SelectPhysician.getText();
		String Actual = "Select Physician for CONDR009";
		System.out.println("Actual is" + Actual);
		System.out.println("Expected is " + Expected);
		Assert.assertEquals(Expected , Actual );
		
	}
	
	//Click on Physician drop down
	public void clickPhysicianDropdown() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(PhysicianDropdown)).click();
		
	}
	
	//click Adamos Adamou from Physician drop down
	public void clickPhysicianAdamosAdamou() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(PhysicianAdamosAdamou)).click();
		
	}
	
	//Click Nestoras Michael from Physician Drop down
	public void clickPhysicianNestorasMichael() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(PhysicianNestorasMichael)).click();
		
	}
	
	//Click on in Physician Pop up
	public void clickOKinPhysicianPopup() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(OKinPhysicianPopup)).click();
		
	}
	
	//Click on Dr Discount text field
	public void setDrDiscount(String DrDisc) 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(DrDiscount)).sendKeys(DrDisc);
		
	}
	
	//Click on Dr Disc Service Slider
	public void clickDrDiscSlider() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(DrDiscSlider)).click();
		
	}
	
	//Click on Hospital Discount text field
	public void setHospDiscount(String hospdisc) 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(HospDiscount)).sendKeys(hospdisc);
		
	}
	
	//Click on Hosptial Discount slider
	public void clickHospDiscSlider() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(HospDiscSlider)).click();
		
	}
	
	//Click on Apply button for Discount
	public void clickApplyDiscount() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(ApplyDiscount)).click();
		
	}
	
	//Click on Discount Approved By Drop Down
	public void clickDiscApprovedByDD() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(DiscApprovedByDD)).click();
		
	}
	
	//Click on Adamos Adamou in Discount approved by drop down
	public void clickDiscApprovedbyAA() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(DiscApprovedbyAA)).click();
		
	}
	
	//Click on Nestoras Michael in Discount approved by Drop Down
	public void clickDiscApprovedbyNM() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(DiscApprovedbyNM)).click();
		
	}
	
	//Click on Delete button in Medication Grid
	public void clickDeleteMedic() 
	{
		int x = DeleteMedic.getLocation().getX();
		int y = DeleteMedic.getLocation().getY();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(" + x + ", " + y + ");");
		DeleteMedic.click();
		
	}
	
	//Verify delete Alert pop up
	public void verifyDeleteAlertpopup() throws InterruptedException 
	{
		Thread.sleep(2000);
		String Actual = driver.switchTo().alert().getText();
		String Expected = "Are you sure want to delete?";
		Assert.assertEquals(Expected, Actual);
		driver.switchTo().alert().accept();
		
	}
	
	//Click on extended service search
	public void clickServiceSearch()  
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(ServiceSearch)).click();
	}
	
	//Click Send data on Extended Service Search
	public void setextendedserivcesearch(String extendedservice) 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(extendedserivcesearch)).sendKeys(extendedservice);
		
	}
	
	//Click Physician Drop down in Grid
	public void clickPhysicianGrid() throws InterruptedException 
	{
		Thread.sleep(2000);
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(PhysicianGrid)).click();
		
	}
	
	//Click on Doctor Discount in Grid1
	public void setDrDiscinGrid1(String DociscinGrid1) throws InterruptedException 
	{	
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(DrDiscinGrid1)).click();
		Thread.sleep(1000);
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(DrDiscinGrid1)).sendKeys(DociscinGrid1);
		
	}
	
	//Click on Hospital Discount in Grid 1
	public void setHospDiscinGrid1(String HosDiscinGrid1) throws InterruptedException 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(HospDiscinGrid1)).click();
		Thread.sleep(1000);
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(HospDiscinGrid1)).sendKeys(HosDiscinGrid1);
		
	}
	
	//Click on Doctor Discount in Grid 2
	public void setDrDiscinGrid2(String DocDiscinGrid2) throws InterruptedException 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(DrDiscinGrid2)).click();
		Thread.sleep(1000);
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(DrDiscinGrid2)).sendKeys(DocDiscinGrid2);
		
	}
	
	//Click on Hospital Discount in Grid 2
	public void setHospDiscinGrid2(String HosDiscinGrid2) throws InterruptedException 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(HospDiscinGrid2)).click();
		Thread.sleep(1000);
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(HospDiscinGrid2)).sendKeys(HosDiscinGrid2);
		
	}
	
	//Verify Doctor Discount Amount in grid 1
	public void VerifyDrDiscinGrid1() throws InterruptedException 
	{
		Thread.sleep(2000);
		String Actual = DrDiscinGrid1.getText();
		String Expected = "0.00";
		System.out.println("Expected : "+Expected);
		System.out.println("Actual : "+Actual);
		Assert.assertEquals(Expected, Actual);
		
	}
	
	//Verify Hospital Discount Amount in grid 1
	public void VerifyHospDiscinGrid1() 
	{
		String Actual =  HospDiscinGrid1.getText();
		String Expected = "0.00";
		Assert.assertEquals(Expected, Actual);
		
	}
	
	//Verify Doctor Discount Amount in Grid 2
	public void VerifyDrDiscinGrid2() 
	{
		String Actual = DrDiscinGrid2.getText();
		String Expected = "0.00";
		Assert.assertEquals(Expected, Actual);
	}
	
	//Verify Hospital Discount Amount in Grid 2
	public void VerifyHospDiscinGrid2() 
	{
		String Actual = HospDiscinGrid2.getText();
		String Expected = "0.00";
		Assert.assertEquals(Expected, Actual);
		
	}
	
	
	//Click on Bank Drop Down in Payment Section
	public void clickBankDropDown() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(BankDropDown)).click();
		
	}
	
	//Click on Alpha Bank in bank Drop down 
	public void clickAlphaBank() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(AlphaBank)).click();
		
	}
	
	//Click on Bank of Cyprus in Bank Drop Down
	public void clickBankofCyprus() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(BankofCyprus)).click();
		
	}
	
	//Click on RCB Bank in Bank Drop Down
	public void clickRcbBank() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(RcbBank)).click();
		
	}
	
	//click on delete button in Medication Grid
	public void clickDeleteMedication() 
	{
		int x = DeleteMedication.getLocation().getX();
		int y = DeleteMedication.getLocation().getY();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(2000,0)");
		js.executeScript("window.scrollBy(" + x + ", " + y + ");");
		DeleteMedication.click();
		
	}
	
	//Click Amount text field in 1st row of Multiple payment Section
	public void clickAmtTextFieldin1stRow() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(AmtTextFieldin1stRow)).click();
	}
	
	//send Amount text field in 1st row of Multiple payment Section
	public void SetAmtTextFieldin1stRow(String Amtin1strow) throws InterruptedException 
	{
		Thread.sleep(2000);
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(AmtTextFieldin1stRow)).sendKeys(Amtin1strow);
		
	}
	
	//Click on Bank Drop down in 1st row of Multiple payment Section
	public void clickBankDDin1strowMP() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(BankDDin1strowMP)).click();
		
	}
	
	//Click on Alpha bank in Bank Drop down in 1st row of Multiple payment Section
	public void clickAlphaBankinBankDD1strow() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(AlphaBankinBankDD1strow)).click();
		
	}
	

	//Click on Cheque in Payment type in 1st row of Multiple Payment
	public void clickChqeuein1strowMP() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Chqeuein1strowMP)).click();
		
	}
	
	//Click on Bank Transfer in payment type in 1st row of Multiple payment 
	public void clickBankTransferin1strow() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(BankTransferin1strow)).click();
		
	}
	
	//Scroll to new button NewinMultiPay
	public void scrollNewinMultiPay() 
	{
		int x = NewinMultiPay.getLocation().getX();
		int y = NewinMultiPay.getLocation().getY();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(2000,0)");
		js.executeScript("window.scrollBy(" + x + ", " + y + ");");
		
	}
	
	//Click on Payment type drop dowm in 2nd row of Multiple Payment
	public void clickPaymentDDin2ndrow() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(PaymentDDin2ndrow)).click();
		
	}
	
	//Click on cheque in Payment type drop down in 2nd row of Multiple Payment
	public void clickChequein2ndrowMP() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Chequein2ndrowMP)).click();
		
	}
	
	//Click on Bank Transfer in Payment type in drop down in 2nd row of Multiple payment
	public void clickBankTransferin2ndrowMP() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(BankTransferin2ndrowMP)).click();
		
	}
	
	//Click on Amount text field in 2nd row Multiple Payment Section
	public void clickAmtin2ndRowMP() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Amtin2ndRowMP)).click();
		
	}
	
	//Send data to amount text field in 2nd row Multiple Payment Section
	public void setAmtin2ndRowMP(String Amtin2nd) 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Amtin2ndRowMP)).sendKeys(Amtin2nd);
			
	}
	
	//Verify Invoice Pop Up
	public void verifyInvoicePopup() 
	{
		String Actual = InvoicePopup.getText();
		String Expected = "Select";
		Assert.assertEquals(Actual, Expected);
		
	}
		
	

}
