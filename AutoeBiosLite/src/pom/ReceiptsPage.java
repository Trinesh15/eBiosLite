package pom;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ReceiptsPage extends BasePage
{
	public ReceiptsPage(WebDriver driver) {
		super(driver);
		
	}

	//Patient Button
	@FindBy(xpath = "//a[text()='Patient']")
	private WebElement Patient;
	
	//Insurance Button
	@FindBy(xpath = "//a[text()='Insurance']")
	private WebElement Insurance;
	
	//UHID field
	@FindBy(xpath = "//input[@id='cpBody_txtUHID']")
	private WebElement UHID;
	
	//Search Button
	@FindBy(xpath = "//button[@title='Advanced Search']")
	private WebElement SearchButton;
	
	//Admitted Patient PopUp
	@FindBy(xpath = "//a[text()='Admitted Patients']")
	private WebElement AdmittedPatient;
	
	//Admitted Patient search
	@FindBy(xpath = "//input[@id='txtAdSearch']")
	private WebElement AdSearch;
	
	//Select Patient in Admitted Patient Pop up
	@FindBy(xpath = "//input[@name='AdmitCode']")
	private List<WebElement> SelectAdPatient;
	
	//Select OK button in Admitted Patient pop up
	@FindBy(xpath = "//button[@id='cpBody_btnPatSearchOk']")
	private WebElement AdPatientOk;
	
	//Select Close Button in Admitted PAtient Pop Up
	@FindBy(xpath = "@class='btn btn-secondary btn-sm' and ")
	private WebElement AdPatientClose;
	
	//Outstanding Radio Button
	@FindBy(xpath = "//input[@id='rdOSND']")
	private WebElement Outstanding;
	
	//Advance radio Button
	@FindBy(xpath = "//input[@id='rdADV']")
	private WebElement Advance;
	
	//Select all Check Box Button
	@FindBy(xpath = "//input[@id='chbAll']")
	private WebElement SelectAll;
	
	//Select Cash Payment
	@FindBy(xpath = "//label[@for='cpBody_usrctrlBillRcpts_rdPaymenyType_0']")
	private WebElement Cash;
	
	//Select Visa / Credit Card Payment
	@FindBy(xpath = "//label[@for='cpBody_usrctrlBillRcpts_rdPaymenyType_1']")
	private WebElement VisaorCreditcard;
	
	//Select Insurance Payment
	@FindBy(xpath = "//label[text()='Insurance Payment']")
	private WebElement InsurancePayment;
	
	//Select Bank Tranfer Button
	@FindBy(xpath = "//label[text()='Bank Transfer']")
	private WebElement BankTransfer;
	
	//Select Cheque Button
	@FindBy(xpath = "//label[@for='cpBody_usrctrlBillRcpts_rdPaymenyType_4']")
	private WebElement Cheque;
	
	//Select Multiple Payment
	@FindBy(xpath = "//label[@for='cpBody_usrctrlBillRcpts_rdPaymenyType_5']")
	private WebElement MultiplePayment;
	
	//Enter the  Amount
	@FindBy(xpath = "//input[@id='cpBody_usrctrlBillRcpts_txtPAmt']")
	private WebElement Amount;
	
	//Enter the Reference Number
	@FindBy(xpath = "//input[@id='cpBody_usrctrlBillRcpts_txtPRefNo']")
	private WebElement ReferenceNumber;
	
	//Select Bank Options
	@FindBy(xpath = "(//span[text()='Select an Option'])[6]")
	private WebElement BankOption;
	
	//Select Alpha Bank
	@FindBy(xpath = "//li[text()='Alpha Bank']")
	private WebElement AlphaBank;
	
	//Select Bank of Cyprus
	@FindBy(xpath = "//li[text()='Bank of Cyprus']")
	private WebElement BankofCyprus;
	
	//Select USB Bank
	@FindBy(xpath = "//li[text()='USB Bank']")
	private WebElement USBBank;
	
	//Select Insurance Carrier
	@FindBy(xpath = "(//span[text()='Select an Option'])[7]")
	private WebElement InsuranceCarrier;
	
	//Select A.M. STUDIO OZZ LTD (SHARE)
	@FindBy(xpath = "//li[text()='A.M. STUDIO OZZ LTD (SHARE)']")
	private WebElement AmStudioLtd;
	
	//Select BUPA INTERNATIONAL
	@FindBy(xpath = "//li[text()='BUPA INTERNATIONAL']")
	private WebElement BupaInternational;
	
	//Select CLASS ASSISTANCE
	@FindBy(xpath = "//li[text()='CLASS ASSISTANCE']")
	private WebElement ClassAssistance;
	
	//Enter the Remarks 
	@FindBy(xpath = "//input[@id='cpBody_usrctrlBillRcpts_txtPRemarsk']")
	private WebElement Remarks;
	
	//Select Clear Button
	@FindBy(xpath = "//a[@id='cpBody_btnClearReceiptScreen']")
	private WebElement Clear;
	
	//Select Save Button
	@FindBy(xpath = "//button[@id='btnSave']")
	private WebElement Save;
	
	//Alert Pop Up
	@FindBy(xpath = "//h5[text()='Alert ']")
	private WebElement Alert;
	
	//Select Ok on Alert Pop Up
	@FindBy(xpath = "(//button[@class='btn btn-primary btn-sm'])[3]")
	private WebElement AlertOK;
	
	//Select the Recent Bill
	@FindBy(xpath = "//input[@onclick='fn_VerifyAllCheck(); this.checked = !this.checked;']")
	private List<WebElement> RecentBill;
	
	//Select the Bill Code
	@FindBy(xpath = "//table[@id='tblOSBills']//tr//td[2]")
	private List<WebElement> BillCode;
	
	// Search Insurance Name or Code
	@FindBy(xpath = "//input[@id='cpBody_txtINCCode']")
	private WebElement InsuranceNameorCode;
	
	//Select the Search Button
	@FindBy(xpath = "//button[@id='btnINCSearch']")
	private WebElement InsuranceSearch;
	
	//Select BankTransfer in Insurance Page
	@FindBy(xpath = "//label[@for='cpBody_UsrTransReceipts_rdPaymenyType_0']")
	private WebElement  InsuranceBankTransfer;
	
	// Select Cash In Insurance Page
	@FindBy(xpath = "//label[@for='cpBody_UsrTransReceipts_rdPaymenyType_1']")
	private WebElement InsuranceCash;
	
	//Select Visa or Credit Card In Insurance Page
	@FindBy(xpath = "//label[@for='cpBody_UsrTransReceipts_rdPaymenyType_2']")
	private WebElement InsuranceVisaorCredit;
	
	//Select Cheque in Inusurance Page
	@FindBy(xpath = "//label[@for='cpBody_UsrTransReceipts_rdPaymenyType_3']")
	private WebElement InsuranceCheque;
	
	// Select Multiple Payment in Insurance Page
	@FindBy(xpath = "cpBody_UsrTransReceipts_rdPaymenyType_4")
	private WebElement InsuranceMultiplePayment;
	
	//Select Insurance Search Pop Up
	@FindBy(xpath = "//h5[text()='Insurance Search']")
	private WebElement InsuranceSearchPopup;
	
	// Select Search in Insurance Search pop up
	@FindBy(xpath = "//input[@id='txtSearch']")
	private WebElement InsuranceSearchfield;
	
	//Select first Insurance Name in Insurance Search popup
	@FindBy(xpath = "//tbody[@id='tbyIncDet']//tr[@style='display: table-row;']")
	private WebElement SelectInsurance;	
	
	// Select Ok in Insurance Popup
	@FindBy(xpath = "//button[@onclick='return fn_SetInsurance();']")
	private WebElement InsuranceOk;
	
	//Click on patient Button
	public void clickPatient() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Patient)).click();
		
	}
	
	//Click on Insurance Button
	public void clickInsurance() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Insurance)).click();
		
	}
	
	//Enter UHID
	public void setUHID(String Uhid) 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(UHID)).sendKeys(Uhid);
		
	}
	
	//Click on Search Button
	public void clickSearch() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(SearchButton)).click();
		
	}
	
	//Verify Admitted Patient Page
	public void VerifyAdmittedPatientlist() 
	{
		String Actual = AdmittedPatient.getText();
		String Expected = "Admitted Patients";
		Assert.assertEquals(Expected, Actual);
	}	
	
	//Click on Search in Admitted Patient Pop Up
	public void clickAdmittedPatientSearch(String PatientId) 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(AdSearch)).sendKeys(PatientId);
		
	}
	
	//Click on Patient radio button in Admitted Patient Pop Up
	public void clickRecentAdPatient() 
	{
		int x = SelectAdPatient.get(SelectAdPatient.size()-1).getLocation().getX();
		int y = SelectAdPatient.get(SelectAdPatient.size()-1).getLocation().getY();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(" + x + ", " + y + ");");
		SelectAdPatient.get(SelectAdPatient.size()-1).click();
	}
	
	
	//Click on OK in Admitted Patient Pop Up
	public void clickAdOk() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(AdPatientOk)).click();
		
	}
	
	//Click on Close in Admitted Patient Pop up
	public void clickAdClose() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(AdPatientClose)).click();
		
	}
	
	//Click on Outstanding
	public void clickOutstanding() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Outstanding)).click();
		
	}
	
	//Click on Advance
	public void clickAdvance() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Advance)).click();
		
	}
	
	//Click On Select All
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(SelectAll)).click();
		
	}
	
	//Click On Cash Button
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Cash)).click();
		
	}
	
	//Click on Visa or Credit Card Button
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(VisaorCreditcard)).click();
			
	}
	
	//Click on Insurance Payment Button
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(InsurancePayment)).click();
			
	}
	
	//Click On Bank Transfer Button
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(BankTransfer)).click();
			
	}
	
	//Click On Cheque Button
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Cheque)).click();
			
	}
	
	//Click on Multiple Payment
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(MultiplePayment)).click();
			
	}
	
	
	//Enter the cash
	public void setCash(String cash) 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Amount)).sendKeys(cash);
			
	}
		
	//Enter the Reference Number
	public void setReferencenumber(String RN) 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(ReferenceNumber)).sendKeys(RN);
			
	}
	
	// Click on Bank DropDown
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(BankOption)).click();
	}
	
	//Click on Aplha Bank
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(AlphaBank)).click();
	}
	
	//Click on Bank of Cyprus
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(BankofCyprus)).click();
	}
	
	//Click on USB Bank
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(USBBank)).click();
	}
	
	//Click on Select Insurance Carrier
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(InsuranceCarrier)).click();
	}
	
	//Click on A.M. STUDIO OZZ LTD (SHARE)
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(AmStudioLtd)).click();
	}
	
	//Click on BupaInternational
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(BupaInternational)).click();
	}
	
	//Click on ClassAssistance
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(ClassAssistance)).click();
	}

	
	//Enter Remarks
	public void setRemarks(String remarks) 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Remarks)).sendKeys(remarks);
			
	}
		
		
	//Click on Clear Button
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Clear)).click();
	}
	
	//Click on Save Button
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Save)).click();
	}
	
	//Verify Patient Demographic Link
	public void VerifyAlertPopup() 
	{
		String Actual = Alert.getText();
		String Expected = "Alert ";
		Assert.assertEquals(Expected, Actual);
	}	
	
	//Click Ok on Alert Pop Up  
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(AlertOK)).click();
	}
	
	//To click on Recent Bill
	public void clickRecentBill() 
	{
		int x = RecentBill.get(RecentBill.size()-1).getLocation().getX();
		int y = RecentBill.get(RecentBill.size()-1).getLocation().getY();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(" + x + ", " + y + ");");
		RecentBill.get(RecentBill.size()-1).click();
	}
	
	//To verify recent Bill Code
	public void VerifyRecentBillCode(String ActualBillCode) 
	{
		int x = BillCode.get(BillCode.size()-1).getLocation().getX();
		int y = BillCode.get(BillCode.size()-1).getLocation().getY();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(" + x + ", " + y + ");");
		String ExpectedBillcode = BillCode.get(BillCode.size()-1).getText();
		Assert.assertEquals(ExpectedBillcode, ActualBillCode);
	} 	
	
	//Enter Insurance Name or code
	public void setInsuranceNameorCode(String INsuranceNC) 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(UHID)).sendKeys(INsuranceNC);
			
	}
	
	//Click on Insurance Search
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(InsuranceSearch)).click();
	}
	
	// Click On Bank Transfer in Insurance Page
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(InsuranceBankTransfer)).click();
	}
	
	//Click on Cash in Insurance Page
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(InsuranceCash)).click();
	}
	
	//Click on Visa or Credit Card in Insurance Page
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(InsuranceVisaorCredit)).click();
	}
	
	//Click on Cheque in Insurance Page
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(InsuranceCheque)).click();
	}
	
	//Click on Multiple Payment in Insurance Page
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(InsuranceMultiplePayment)).click();
	}
	
	//Verify Insurance Search page
	public void InsuranceSearchPage()
	{
		String ActualPopup = InsuranceSearchPopup.getText();
		String ExpectedPopup = "Insurance Search";
		Assert.assertEquals(ExpectedPopup, ActualPopup);
	}
	
	//Click on Search Text field in Insurance Search Pop Up
	public void setSearchInsurance(String InsuranceNameorCode)
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(InsuranceSearchfield)).sendKeys(InsuranceNameorCode);
	}
	
	//Click on first Insurance in Insurance Search pop up
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(SelectInsurance)).click();
	}
	
	//Click on OK in Insurance Search Pop Up
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(InsuranceOk)).click();
	}
	
}
