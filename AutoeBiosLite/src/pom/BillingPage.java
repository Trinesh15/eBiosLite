package pom;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class BillingPage extends BasePage {

	// Enter UHID
	@FindBy(id = "cpBody_txtUHID")
	private WebElement UHIDNo;

	
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

	@FindBy(xpath = "//label[.='Visa / Credit Card']")
	private WebElement VisaCreditCard;

	@FindBy(xpath = "//label[.='Insurance Payment']")
	private WebElement Insurance;

	@FindBy(xpath = "//label[.='Bank Transfer']")
	private WebElement BankTransfer;

	@FindBy(xpath = "//label[.='Cheque']")
	private WebElement Cheque;

	@FindBy(xpath = "//label[.='Multiple Payment']")
	private WebElement MultiplePayment;

	// Drop down in multiple payment
	@FindBy(xpath = "//div[@id='tbBillPayment_Row1_Col0_chosen']")
	private WebElement MultiplePaymentdropdown;

	// Cash in multi payment section
	@FindBy(xpath = "//div[@id='tbBillPayment_Row1_Col0_chosen']//li[.='Cash']")
	private WebElement CashinMultippayment;

	// Visa and Credit card in multi payment section
	@FindBy(xpath = "//div[@id='tbBillPayment_Row1_Col0_chosen']//li[.='Visa / Credit Card']")
	private WebElement VisaCreditinMultippayment;

	// Visa and Credit card in multi payment section
	@FindBy(xpath = "//div[@id='tbBillPayment_Row1_Col0_chosen']//li[.='Insurance Payment']")
	private WebElement InsurancePymtinMultippayment;

	// Visa and Credit card in multi payment section
	@FindBy(xpath = "//div[@id='tbBillPayment_Row1_Col0_chosen']//li[.='Bank Transfer']")
	private WebElement BankPymtinMultippayment;

	// Visa and Credit card in multi payment section
	@FindBy(xpath = "//div[@id='tbBillPayment_Row1_Col0_chosen']//li[.='Cheque']")
	private WebElement ChequePymtinMultippayment;

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
	@FindBy(xpath = "(//button[@id='btnmodalClose'])[2]")
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
	@FindBy(id = "cpBody_btnBillClose")
	private WebElement Clearbtn;

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

	// Initialize web element
	public BillingPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	public void setUHIDNo(String UHID) {
		UHIDNo.sendKeys(UHID, Keys.ENTER);
		// UHIDNo.sendKeys(Keys.ENTER);
	}

	public void VerifyAlertPopup() {
		String Actual = Alertpopup.getText();
		String Expected = "Alerts";
		Assert.assertEquals(Expected, Actual);
	}

	public void AlertClose() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(AlertClose)).click();

	}

	public void SelectHospRadio() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(HospVisitRadioBtn)).click();

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

	// Add services
	public void AddServices(String code) {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Service)).sendKeys(code,
				Keys.ENTER);
		// Service.sendKeys(code, Keys.ENTER);

	}

	// accept okay in receipt amount zero pop up
	public void SaveBillForZero() {
		driver.switchTo().alert().accept();
	}

	// Scroll to payment section
	public void ScrolltoPayment() {
		int x = Clearbtn.getLocation().getX();
		int y = Clearbtn.getLocation().getY();
		JavascriptExecutor js = (JavascriptExecutor) driver; // Type casting

		js.executeScript("window.scrollBy(" + 400 + ", " + 400 + ");");

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
		int Acount = DisabledColumns.size();
		int ECount = 6;
		Assert.assertEquals(ECount, Acount-1);

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

	// Select cash in Multiple payment section
	public void SelectCashInMultiplePytSection() {
		CashinMultippayment.click();
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

}
