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

public class ReceiptsPage extends BasePage {
	

	// Patient Button
	@FindBy(xpath = "//a[text()='Patient']")
	private WebElement Patient;

	// Insurance Button
	@FindBy(xpath = "//a[text()='Insurance']")
	private WebElement Insurance;

	// UHID field
	@FindBy(xpath = "//input[@id='cpBody_txtUHID']")
	private WebElement UHID;

	// Search Button
	@FindBy(xpath = "//button[@title='Advanced Search']")
	private WebElement SearchButton;

	// Admitted Patient PopUp
	@FindBy(xpath = "//a[text()='Admitted Patients']")
	private WebElement AdmittedPatient;

	// Admitted Patient search
	@FindBy(xpath = "//input[@id='txtAdSearch']")
	private WebElement AdSearch;

	// Select Patient in Admitted Patient Pop up
	@FindBy(xpath = "//input[@name='AdmitCode']")
	private List<WebElement> SelectAdPatient;

	// Select OK button in Admitted Patient pop up
	@FindBy(xpath = "//button[@id='cpBody_btnPatSearchOk']")
	private WebElement AdmPatientOk;

	// Select Close Button in Admitted PAtient Pop Up
	@FindBy(xpath = "@class='btn btn-secondary btn-sm' and ")
	private WebElement AdmPatientClose;

	// Outstanding Radio Button
	@FindBy(xpath = "//input[@id='rdOSND']")
	private WebElement Outstanding;

	// Advance radio Button
	@FindBy(xpath = "//input[@id='rdADV']")
	private WebElement Advance;

	// Select all Check Box Button
	@FindBy(xpath = "//input[@id='chbAll']")
	private WebElement SelectAll;

	// list of OS standing bills of the patient
	@FindBy(xpath = "//table[@id='tblOSBills']//td[2]")
	private List<WebElement> billCodes;

	// list of bill checkbox
	@FindBy(xpath = "//table[@id='tblOSBills']//td[1]")
	private List<WebElement> listofCheckbox;

	// Select Cash Payment
	@FindBy(xpath = "//label[@for='cpBody_usrctrlBillRcpts_rdPaymenyType_0']")
	private WebElement Cash;

	// Select Visa / Credit Card Payment
	@FindBy(xpath = "//label[@for='cpBody_usrctrlBillRcpts_rdPaymenyType_1']")
	private WebElement VisaorCreditcard;

	// Select Insurance Payment
	@FindBy(xpath = "//label[text()='Insurance Payment']")
	private WebElement InsurancePayment;

	// Select Bank Tranfer Button
	@FindBy(xpath = "//label[text()='Bank Transfer']")
	private WebElement BankTransfer;

	// Select Cheque Button
	@FindBy(xpath = "//label[@for='cpBody_usrctrlBillRcpts_rdPaymenyType_4']")
	private WebElement Cheque;

	// Select Multiple Payment
	@FindBy(xpath = "//label[@for='cpBody_usrctrlBillRcpts_rdPaymenyType_5']")
	private WebElement MultiplePayment;

	// Enter the Amount
	@FindBy(xpath = "//input[@id='cpBody_usrctrlBillRcpts_txtPAmt']")
	private WebElement Amount;

	// Enter the Reference Number
	@FindBy(xpath = "//input[@id='cpBody_usrctrlBillRcpts_txtPRefNo']")
	private WebElement ReferenceNumber;

	// Select Bank Options
	@FindBy(xpath = "(//span[text()='Select an Option'])[6]")
	private WebElement BankOption;

	// Select Alpha Bank
	@FindBy(xpath = "//li[text()='Alpha Bank']")
	private WebElement AlphaBank;

	// Select Bank of Cyprus
	@FindBy(xpath = "//li[text()='Bank of Cyprus']")
	private WebElement BankofCyprus;

	// Select USB Bank
	@FindBy(xpath = "//li[text()='USB Bank']")
	private WebElement USBBank;

	// Select Insurance Carrier
	@FindBy(xpath = "(//span[text()='Select an Option'])[7]")
	private WebElement InsuranceCarrier;

	// Select A.M. STUDIO OZZ LTD (SHARE)
	@FindBy(xpath = "//li[text()='A.M. STUDIO OZZ LTD (SHARE)']")
	private WebElement AmStudioLtd;

	// Select BUPA INTERNATIONAL
	@FindBy(xpath = "//li[text()='BUPA INTERNATIONAL']")
	private WebElement BupaInternational;

	// Select CLASS ASSISTANCE
	@FindBy(xpath = "//li[text()='CLASS ASSISTANCE']")
	private WebElement ClassAssistance;

	// Enter the Remarks
	@FindBy(xpath = "//input[@id='cpBody_usrctrlBillRcpts_txtPRemarsk']")
	private WebElement Remarks;

	// Select Clear Button
	@FindBy(xpath = "//a[@id='cpBody_btnClearReceiptScreen']")
	private WebElement Clear;

	// Select Save Button
	@FindBy(xpath = "//button[@id='btnSave']")
	private WebElement Save;

	// Alert Pop Up
	@FindBy(xpath = "//h5[text()='Alert ']")
	private WebElement Alert;

	// Select Ok on Alert Pop Up
	@FindBy(xpath = "(//button[@class='btn btn-primary btn-sm'])[3]")
	private WebElement AlertOK;

	// Select the Recent Bill
	@FindBy(xpath = "//input[@onclick='fn_VerifyAllCheck(); this.checked = !this.checked;']")
	private List<WebElement> RecentBill;

	// Select the Bill Code
	@FindBy(xpath = "//table[@id='tblOSBills']//tr//td[2]")
	private List<WebElement> BillCode;
	
	//Select OS Balance 
	@FindBy(xpath = "//table[@id='tblOSBills']//tr//td[9]")
	private List<WebElement> OSBalance;

	// Search Insurance Name or Code
	@FindBy(xpath = "//input[@id='cpBody_txtINCCode']")
	private WebElement InsuranceNameorCode;

	// Select the Search Button
	@FindBy(xpath = "//button[@id='btnINCSearch']")
	private WebElement InsuranceSearch;

	// Select BankTransfer in Insurance Page
	@FindBy(xpath = "//label[@for='cpBody_UsrTransReceipts_rdPaymenyType_0']")
	private WebElement InsuranceBankTransfer;

	// Select Cash In Insurance Page
	@FindBy(xpath = "//label[@for='cpBody_UsrTransReceipts_rdPaymenyType_1']")
	private WebElement InsuranceCash;

	// Select Visa or Credit Card In Insurance Page
	@FindBy(xpath = "//label[@for='cpBody_UsrTransReceipts_rdPaymenyType_2']")
	private WebElement InsuranceVisaorCredit;

	// Select Cheque in Insurance Page
	@FindBy(xpath = "//label[@for='cpBody_UsrTransReceipts_rdPaymenyType_3']")
	private WebElement InsuranceCheque;

	// Select Multiple Payment in Insurance Page
	@FindBy(xpath = "//label[@for='cpBody_UsrTransReceipts_rdPaymenyType_4']")
	private WebElement InsuranceMultiplePayment;

	// Select Amount in Insurance Page
	@FindBy(xpath = "//input[@id='cpBody_UsrTransReceipts_txtPAmt']")
	private WebElement InsuranceAmount;

	// Select Reference Number in Insurance Page
	@FindBy(xpath = "//input[@id='cpBody_UsrTransReceipts_txtPRefNo']")
	private WebElement InsuranceReferenceNumber;

	// Select Bank Drop Down in Insurance Page
	@FindBy(xpath = "(//span[text()='Select an Option'])[9]")
	private WebElement InsuranceBankDd;

	// Select Alpha Bank in INsurance Page
	@FindBy(xpath = "//li[text()='Alpha Bank']")
	private WebElement InsuranceAlphaBank;

	// Select RCB Bank in Insurance Page
	@FindBy(xpath = "//li[text()='RCB Bank']")
	private WebElement InsuranceRCBBank;

	// Select UCB Bank in Insurance Page
	@FindBy(xpath = "//li[text()='USB Bank']")
	private WebElement InsuranceUCBBank;

	// Select Remarks in Insurance Page
	@FindBy(xpath = "//input[@id='cpBody_UsrTransReceipts_txtPRemarsk']")
	private WebElement InsuranceRemarks;

	// Select Payment Type in Multiple Payment Insurance Page
	@FindBy(xpath = "(//span[text()='Cash'])[2]")
	private WebElement MultiplePaymentCash;

	// Select Payment Type Visa or Credit in Multiple Payment Insurance Page
	@FindBy(xpath = "//li[text()='Visa / Credit Card']")
	private WebElement MultiplePaymentVisaorCredit;

	// Select Payment type Bank Transfer in MUltiple Payment Insurance Page
	@FindBy(xpath = "//li[text()='Bank Transfer']")
	private WebElement MultiplePaymentBankTransfer;

	// Select Payment Type Cheque in Multiple Payment Insurance Page
	@FindBy(xpath = "//li[text()='Cheque']")
	private WebElement MultiplePaymentCheque;

	// Select Amount in Multiple Payment Insurance Page
	@FindBy(xpath = "(//input[@id='tbTrnsPayment_Row1_Col2'])[2]")
	private WebElement MultiplePaymentAmount;

	// Select Remarks in Multiple Payment Insurance Page
	@FindBy(xpath = "(//input[@id='tbTrnsPayment_Row1_Col5'])[2]")
	private WebElement MultiplePaymentRemarks;

	// Select Delete in Multiple Payment Insurance Page
	@FindBy(xpath = "(//i[@id='tbTrnsPayment_Row1_Col6'])[2]")
	private WebElement MultiplePaymentDelete;

	// Select New in Multiple Payment Insurance Page
	@FindBy(xpath = "(//button[@class='btn btn-info'])[2]")
	private WebElement MultiplePaymentNew;

	// Select Insurance Search Pop Up
	@FindBy(xpath = "//h5[text()='Insurance Search']")
	private WebElement InsuranceSearchPopup;

	// Select Search in Insurance Search pop up
	@FindBy(xpath = "//input[@id='txtSearch']")
	private WebElement InsuranceSearchfield;

	// Select first Insurance Name in Insurance Search popup
	@FindBy(xpath = "//tbody[@id='tbyIncDet']//tr[@style='display: table-row;']")
	private WebElement SelectInsurance;

	// Select Ok in Insurance Popup
	@FindBy(xpath = "//button[@onclick='return fn_SetInsurance();']")
	private WebElement InsuranceOk;

	// Select Close button in Insurance Pop Up
	@FindBy(xpath = "(//button[@class='btn btn-secondary btn-sm'])[3]")
	private WebElement InsuranceClose;

	// Select ATHK IP in Insurance Search PopUp
	@FindBy(xpath = "//td[text()=' ATHK IP']")
	private WebElement ATHKIP;

	// Select ATHKOP in Insurance Search Popup
	@FindBy(xpath = "//td[text()=' ATHK OP']")
	private WebElement ATHKOP;

	// Select Oay(Share) in Insurance Search Popup
	@FindBy(xpath = "//td[text()=' OAY (SHARE)']")
	private WebElement Oayshare;

	// Select All button in Insurance search Pop up
	@FindBy(xpath = "//input[@id='chbAllTrns']")
	private WebElement InsuranceSelectAll;

	// Select UHID in Insurance Page
	@FindBy(xpath = "//th[text()='UHID No ']")
	private WebElement InsuranceUHID;

	// Select Search in Inusrance UHID
	@FindBy(xpath = "(//input[@placeholder='Type to search'])[1]")
	private WebElement SearchUHID;

	// Select Name in Insurance Page
	@FindBy(xpath = "//th[text()='Name ']")
	private WebElement InsuranceName;

	// Select Search in Insurance Name
	@FindBy(xpath = "(//input[@placeholder='Type to search'])[2]")
	private WebElement SearchName;

	// Select Last Name in Insurance Page
	@FindBy(xpath = "//th[text()='Last Name ']")
	private WebElement InsuranceLastName;

	// Select Search in Insurance Last Name
	@FindBy(xpath = "(//input[@placeholder='Type to search'])[3]")
	private WebElement SearchLastName;

	// Select Bill Code in Insurance Page
	@FindBy(xpath = "//th[text()='Bill Code ']")
	private WebElement InsuranceBillCode;

	// Select Search in Insurance Bill Code
	@FindBy(xpath = "(//input[@placeholder='Type to search'])[4]")
	private WebElement SearchBillCode;

	// Select Alert Popup in Insurance Page
	@FindBy(xpath = "//h5[@id='mdlAlertTitle']")
	private WebElement InsuranceAlert;

	// Select ok in Alert Pop up Insurance Page
	@FindBy(xpath = "(//button[@class='btn btn-primary btn-sm'])[3]")
	private WebElement AlertOk;
	
	//Select Receipt Page 
	@FindBy(xpath = "//h4[text()='Receipt']")
	private WebElement ReceiptPage;
	
	//constructor to initialize the web elements
	public ReceiptsPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}


	// Click on patient Button
	public void clickPatient() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Patient)).click();

	}

	// Click on Insurance Button
	public void clickInsurance() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Insurance)).click();

	}

	// Enter UHID
	public void setUHID(String UHIDno) {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(UHID)).sendKeys(UHIDno,Keys.ENTER);

	}

	// Click on Search Button
	public void clickSearch() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(SearchButton)).click();

	}

	// Verify Admitted Patient Page
	public void VerifyAdmittedPatientlist() {
		String Actual = AdmittedPatient.getText();
		String Expected = "Admitted Patients";
		Assert.assertEquals(Expected, Actual);
	}

	// Click on Search in Admitted Patient Pop Up
	public void clickAdmittedPatientSearch(String PatientId) {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(AdSearch)).sendKeys(PatientId);

	}

	// Click on Patient radio button in Admitted Patient Pop Up
	public void clickRecentAdPatient() {
		int x = SelectAdPatient.get(SelectAdPatient.size() - 1).getLocation().getX();
		int y = SelectAdPatient.get(SelectAdPatient.size() - 1).getLocation().getY();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(" + x + ", " + y + ");");
		SelectAdPatient.get(SelectAdPatient.size() - 1).click();
	}

	// Click on OK in Admitted Patient Pop Up
	public void clickAdOk() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(AdmPatientOk)).click();

	}

	// Click on Close in Admitted Patient Pop up
	public void clickAdClose() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(AdmPatientClose)).click();

	}

	// Click on Outstanding
	public void clickOutstanding() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Outstanding)).click();

	}

	// Click on Advance
	public void clickAdvance() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Advance)).click();

	}

	// Click On Select All
	public void clickOnSelectAllCheckBox() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(SelectAll)).click();

	}
	
	//Verify , Select and Pay the bill
	public void selectAndPayBill(String billcode){
		for(WebElement bc : billCodes) {
			if(bc.getText().equals(billcode)){
				int index = billCodes.indexOf(bc);
				listofCheckbox.get(index).click();
			}
		}
	}

	//Verify , Select and Pay the bill
		public void verifyPaidBillisnotDisplayed(String billcode){
			for(WebElement bc : billCodes) {
				String ActualbillCode = bc.getText();
				Assert.assertNotEquals(billcode, ActualbillCode);
//				if(bc.getText().equals(billcode)){
//					int index = billCodes.indexOf(bc);
//					listofCheckbox.get(index).click();
				}
			}
//		}

	
	//Verify os balance
	public void VerifyOSbalance(String billcode , String expectedOS){
		for(WebElement bc : billCodes) {
			if(bc.getText().equals(billcode)){
				int index = billCodes.indexOf(bc);
				String actualOSamt = OSBalance.get(index).getText();
				//String expectedOSamt = expectedOS;
				Assert.assertEquals(expectedOS, actualOSamt);
				
			}
		}
	}
	
	public void scrollpagetoCash() {
		int x =Cash.getLocation().getX();
		int y = Cash.getLocation().getY();
		JavascriptExecutor js = (JavascriptExecutor) driver; //Type casting
		js.executeScript("window.scrollBy(" + x + ", " + y + ");");  
	}
	
	// Click On Cash Button
	public void clickonCashButton() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Cash)).click();

	}

	// Click on Visa or Credit Card Button
	public void clickonVusaorCreditButton()
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(VisaorCreditcard)).click();

	}

	// Click on Insurance Payment Button
	public void clickonInsuranceButton()
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(InsurancePayment)).click();

	}

	// Click On Bank Transfer Button
	public void clickonTranferButton()
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(BankTransfer)).click();

	}

	// Click On Cheque Button
	public void clickonChequeButton()
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Cheque)).click();

	}

	// Click on Multiple Payment
	public void clickonMultiplePaymentButton()
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(MultiplePayment)).click();

	}

	// Enter the cash
	public void setCash(String cash) {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Amount)).sendKeys(cash);

	}

	// Enter the Reference Number
	public void setReferencenumber(String RN) {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(ReferenceNumber)).sendKeys(RN);

	}

	// Click on Bank DropDown
	public void clickonBankDropDown()
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(BankOption)).click();
	}

	// Click on Aplha Bank
	public void clickonAlphaBank()
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(AlphaBank)).click();
	}

	// Click on Bank of Cyprus
	public void clickonCyprusBank()
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(BankofCyprus)).click();
	}

	// Click on USB Bank
	public void clickonUSBBank()
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(USBBank)).click();
	}

	// Click on Select Insurance Carrier
	public void clickonInsuranceCarrier()
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(InsuranceCarrier)).click();
	}

	// Click on A.M. STUDIO OZZ LTD (SHARE)
	public void clickonAMStudio()
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(AmStudioLtd)).click();
	}

	// Click on BupaInternational
	public void clickonBupaInternational()
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(BupaInternational)).click();
	}

	// Click on ClassAssistance
	public void clickonClassAssistance()
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(ClassAssistance)).click();
	}

	// Enter Remarks
	public void setRemarks(String remarks) {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Remarks)).sendKeys(remarks);

	}

	// Click on Clear Button
	public void clickonClearButton()
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Clear)).click();
	}

	// Click on Save Button
	public void clickonSaveButton()
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Save)).click();
	}

	// Verify Patient Demographic Link
	public void VerifyAlertPopup() {
		String Actual = Alert.getText();
		String Expected = "Alert ";
		Assert.assertEquals(Expected, Actual);
	}

	// Click Ok on Alert Pop Up
	public void clickOkinAlertpopup()
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(AlertOK)).click();
	}

	// To click on Recent Bill
	public void clickRecentBill() {
		int x = RecentBill.get(RecentBill.size() - 1).getLocation().getX();
		int y = RecentBill.get(RecentBill.size() - 1).getLocation().getY();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(" + x + ", " + y + ");");
		RecentBill.get(RecentBill.size() - 1).click();
	}

	// To verify recent Bill Code
	public void VerifyRecentBillCode(String ActualBillCode) {
		int x = BillCode.get(BillCode.size() - 1).getLocation().getX();
		int y = BillCode.get(BillCode.size() - 1).getLocation().getY();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(" + x + ", " + y + ");");
		String ExpectedBillcode = BillCode.get(BillCode.size() - 1).getText();
		Assert.assertEquals(ExpectedBillcode, ActualBillCode);
	}

	// Enter Insurance Name or code
	public void setInsuranceNameorCode(String INsuranceNC) {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(UHID)).sendKeys(INsuranceNC);

	}

	// Click on Insurance Search
	public void clickonInsuranceSearch()
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(InsuranceSearch)).click();
	}

	// Click On Bank Transfer in Insurance Page
	public void clickBankTransferinInsurance()
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(InsuranceBankTransfer)).click();
	}

	// Click on Cash in Insurance Page
	public void clickCashinInsurace()
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(InsuranceCash)).click();
	}

	// Click on Visa or Credit Card in Insurance Page'
	public void clickVisainInsurance()
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(InsuranceVisaorCredit)).click();
	}

	// Click on Cheque in Insurance Page
	public void clickChequeinInsurance()
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(InsuranceCheque)).click();
	}

	// Click on Multiple Payment in Insurance Page
	public void clickMultiplepaymentinINsurance()
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(InsuranceMultiplePayment)).click();
	}

	// Click on Amount in Insurance Page
	public void setInsuranceAmount(String Amount) {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(InsuranceAmount)).sendKeys(Amount);
	}

	// Click on Reference Number in Insurance Page
	public void setInsuranceReferenceNumber(String ReferenceNumber) {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(InsuranceReferenceNumber))
				.sendKeys(ReferenceNumber);

	}

	// Click on BankDrop Down in Insurance Page
	public void clickBankDDinInsurance()
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(InsuranceBankDd)).click();
	}

	// Click on Alpha Bank in Insurance Page
	public void clickAlphaBankinInsurance()
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(InsuranceAlphaBank)).click();
	}

	// Click on RCB Bank in Insurance Page
	public void clickRCBbankinInsurance()
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(InsuranceRCBBank)).click();
	}

	// Click on UCB Bank in Insurance Bank
	public void clickUCBbankinInsurance()
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(InsuranceUCBBank)).click();
	}

	// Click on Remarks in Insurance Page
	public void InsuranceRemarks(String Insuranceremarks) {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(InsuranceRemarks))
				.sendKeys(Insuranceremarks);
	}

	// Click on Cash in Multiple payment Insurance Page
	public void clickcashinMPInsurance()
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(MultiplePaymentCash)).click();
	}

	// Click on Visa Or Credit in Multiple Payment Insurance Page
	public void clickVisainMPInsurance()
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(MultiplePaymentVisaorCredit))
				.click();
	}

	// Click on Bank Transfer in Multiple Payment Isnurance Page
	public void clickBankTransferinMPInsurance()
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(MultiplePaymentBankTransfer))
				.click();
	}

	// Click on Cheque in Multiple Payment Insurance page
	public void clickChequeinMPInsurance()
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(MultiplePaymentCheque)).click();
	}

	// Click on Amount in Multiple Payment Insurance Page
	public void setInsuranceAmt(String InsuranceAmount) {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(MultiplePaymentAmount))
				.sendKeys(InsuranceAmount);

	}

	// Click on Remarks in Multiple Payment Insurance Page
	public void setInsuranceRemarks(String Insuranceremarks) {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(MultiplePaymentRemarks))
				.sendKeys(Insuranceremarks);
	}

	// Click on Delete in Multiple Payment Insurance Page
	public void clickDeleteinMPInsurance()
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(MultiplePaymentDelete)).click();
	}

	// Click on New in Multiple Payment Insurance Page
	public void clickNewinMPInsurance()
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(MultiplePaymentNew)).click();
	}

	// Verify Insurance Search page
	public void InsuranceSearchPage() {
		String ActualPopup = InsuranceSearchPopup.getText();
		String ExpectedPopup = "Insurance Search";
		Assert.assertEquals(ExpectedPopup, ActualPopup);
	}

	// Click on Search Text field in Insurance Search Pop Up
	public void setSearchInsurance(String InsuranceNameorCode) {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(InsuranceSearchfield))
				.sendKeys(InsuranceNameorCode);
	}

	// Click on first Insurance in Insurance Search pop up
	public void clickFirstInsurance()
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(SelectInsurance)).click();
	}

	// Click on OK in Insurance Search Pop Up
	public void clickOkinInsuranceSearch()
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(InsuranceOk)).click();
	}

	// Click on Close button in Insurance Search Popup
	public void clickCloseinInsuranceSearch()
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(InsuranceClose)).click();
	}

	// Click on ATHKIP in Insurance Search PopUp
	public void clickATHKIPinInsuranceSearch()
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(ATHKIP)).click();
	}

	// Click on ATHKOP in Insurance Search PopUp
	public void clickATHKOPinInsuranceSearch()
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(ATHKOP)).click();
	}

	// Click on Oay(Share) in Insurance Search Popup
	public void clickOayinInsuranceSearch()
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Oayshare)).click();
	}

	// Click on Select All in Insurance Search PopUp
	public void clickSelectAllinInsuranceSearch()
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(InsuranceSelectAll)).click();
	}

	// Mouse Hover on UHID in Insurance Page
	public void InsuranceUHIDSearch() {
		Actions actions = new Actions(driver);
		actions.moveToElement(InsuranceUHID).perform();
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(SearchUHID)).click();
	}

	// Mouse Hover on Name in Insurance Page
	public void InsuranceNameSearch() {
		Actions actions = new Actions(driver);
		actions.moveToElement(InsuranceName).perform();
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(SearchName)).click();
	}

	// Mouse Hover on Last Name in Insurance Page
	public void InuranceLastNameSearch() {
		Actions actions = new Actions(driver);
		actions.moveToElement(InsuranceLastName).perform();
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(SearchLastName)).click();
	}

	// Mouse Hover on Bill Code in Insurance Page
	public void InsuranceBillCodeSearch() {
		Actions actions = new Actions(driver);
		actions.moveToElement(InsuranceBillCode).perform();
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(SearchBillCode)).click();
	}

	// Verify Alert Pop up Insurance Page
	public void VerifyInsuranceAlertPopup() {
		String Actual = InsuranceAlert.getText();
		String Expected = "Alert ";
		Assert.assertEquals(Expected, Actual);
	}

	// Click on OK in Alert Pop Up in Insurance Page
	public void clickOkinAlert()
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(AlertOk)).click();
	}

	// Click OK in Delete Pop up
	public void deletePaymenttype() {
		String actualmsg = driver.switchTo().alert().getText();
		String expectedmsg = "Are you sure want to delete?";
		Assert.assertEquals(expectedmsg, actualmsg);
		driver.switchTo().alert().accept();
	}

	// Click Cancel in Delete Pop Up
	public void dontdeletePaymenttype() {
		String actualmsg = driver.switchTo().alert().getText();
		String expectedmsg = "Are you sure want to delete?";
		Assert.assertEquals(expectedmsg, actualmsg);
		driver.switchTo().alert().dismiss();
	}
	
	// Verify Receipt Page
	public void VerifyReceiptPage() throws InterruptedException 
	{	
		Thread.sleep(2000);
		String Actual = ReceiptPage.getText();
		System.out.println(Actual);
		String Expected = "Receipt";
		Assert.assertEquals(Expected, Actual);
	}
	
	// Click Okay 
	public void OutStandingBillNotCleared() {
		String actualmsg = driver.switchTo().alert().getText();
		String expectedmsg = "There are outstanding bills for this patient to be cleared. Do you want to continue Advance collection.?";
		Assert.assertEquals(expectedmsg, actualmsg);
		driver.switchTo().alert().accept();
	}
		
	//Click Cancel
	public void OSbillNotCleard()
	{
		String actualmsg = driver.switchTo().alert().getText();
		String expectedmsg = "There are outstanding bills for this patient to be cleared. Do you want to continue Advance collection.?";
		Assert.assertEquals(expectedmsg, actualmsg);
		driver.switchTo().alert().dismiss();
	}

}
