package pom;

import static org.testng.Assert.expectThrows;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
	

}
