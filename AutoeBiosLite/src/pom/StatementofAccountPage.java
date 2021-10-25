package pom;

import java.util.List;

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
import pom.BillingPage;

import generic.BaseTest;

public class StatementofAccountPage extends BasePage
{
	//UHID
	@FindBy(xpath = "//input[@id='cpBody_txtUHID']")
	private WebElement UHID;
	
	//Search Button
	@FindBy(xpath = "//span[@class='fa fa-search pr-2']")
	private WebElement Advsearch;
	
	//Advance Search Page
	@FindBy(xpath = "//li//a[text()='Admitted Patients']")
	private WebElement AdvSearchPage;
	
	// Search through Result
	@FindBy(xpath = "//input[@id='txtAdSearch']")
	private WebElement SearchthroughResult;
	
	//Select first patient
	@FindBy(xpath = "//input[@value='EVAN000145829 ']")
	private WebElement SelectPatient;
	
	//Ok Button
	@FindBy(xpath = "//button[@onclick='fn_GetActiveSearchApp()']")
	private WebElement Ok;
	////button[@class='btn btn-sm btn-primary' and @aria-label='Ok']
	
	//Close Button
	@FindBy(xpath = "(//button[@class='btn btn-sm btn-secondary'])[1]")
	private WebElement close;
	
	//Statement of Account
    @FindBy(xpath = "//a[@id='pills-home-SOA']")
    private WebElement StatementofAccount;
    
    //Credit notes print
    @FindBy (xpath = "//label[.='CreditNote']/../..//td//button")
    private List<WebElement> CreditNotes;
    
    //Outstanding Bills
    @FindBy(xpath = "//a[@id='pills-profile-OB']")
    private WebElement OutstandingBills;
    
    //oS amount
    @FindBy(id = "cpBody_lblOtsdingAmt")
    private WebElement OSBillAmt;
    
    //Bills and receipt code
    @FindBy (xpath = "//div[@id='pills-tabContentSOA']//tr//td[3]//label")
    private List<WebElement> BillsAndReceiptCodes;
    
    
    //Refresh Button
    @FindBy(xpath = "//a[@id='cpBody_btnSOARefresh']")
    private WebElement Refresh;
    
    //Clear Button
    @FindBy(xpath = "//a[@id='cpBody_btnSOAClear']")
    private WebElement Clear;
    
    //Print Button
    @FindBy(xpath = "//a[@class='btn btn-block btn-primary']")
    private WebElement Print;
    
    //Summary 
    @FindBy(xpath = "(//button[@class='btn btn-sm btn-block btn-warning'])[1]")
    private WebElement Summary;
    
    //Summary Invoice Pop Up
    @FindBy(xpath = "//span[text()='Do you wish to print?']")
    private WebElement InvoicePopup;
    
    //Detailed
    @FindBy(xpath = "(//button[@class='btn btn-sm btn-block btn-primary'])[1]")
    private WebElement Detailed;
    
    //latest Summary Invoice Print
    @FindBy(xpath = "//label[text()='Invoice']/../..//td[11]")
    private List<WebElement> InvoiceSummary;
    
    //latest Detailed Invoice Print
    @FindBy(xpath = "//label[text()='Invoice']/../..//td[12]")
    private List<WebElement> InvoiceDetailed;
    
    //Transfer Out detailed Print
    @FindBy(xpath = "//label[contains(text(),'Transfer Out')]/../../td[11]")
    private List<WebElement> TransferoutDetailed;
    
    //Transfer out Paid Detailed Print
    @FindBy(xpath = "//label[contains(text(),'Transfer Out [Paid')]")
    private List<WebElement> TransferOutPaid;
    
    //Transfer Out Paid receipt Close Button
    @FindBy(xpath = "//div[@class='modal-content reportSize']//button[@class='close']")
    private WebElement TNReceiptClose;
    
    //Transfer Payment Detailed Print
    @FindBy(xpath = "//label[text()='Transfer Payment']/../..//td[10]")
    private List<WebElement> TransferPayment;
    
    
    //Receipt Detailed Print
    @FindBy(xpath = "//label[text()='Receipt']/../../td[11]")
    private List<WebElement> ReceiptDetailed;
    
    //Refund Detailed Print
    @FindBy(xpath = "//label[text()='Refund']/../../td[11]")
    private List<WebElement> RefundDetailed;
    
    //Debit Invoice Detailed Print
    @FindBy(xpath = "//label[text()='Debit Invoice']/../../td[11]")
    private List<WebElement> DebitInvoice;
    
    // A4
    @FindBy(xpath = "//label[text()='Print A4']")
    private WebElement PrintA4;
    
    // A5
    @FindBy(xpath = "//label[text()='Print A5']")
    private WebElement PrintA5;
    
    // Yes Button
    @FindBy(xpath = "//button[@id='btnDialogYes']")
    private WebElement Yes;
    
    //No Button
    @FindBy(xpath = "//button[@id='btnDialogNo']")
    private WebElement No;
    
    //Alert PopUp
    @FindBy(xpath = "//h5[text()='Alerts']")
    private WebElement Alertpopup;
    
    //Alert Close Button
    @FindBy(xpath = "//button[@class='close closeChild']")
    private WebElement AlertClose;
    
    
    
    //Patient Demographic
    @FindBy(xpath = "//a[@id='cpBody_lnklblPatHeader']")
    private WebElement PatientDemographic;
    
    //Select Title
//    @FindBy(xpath = "(//span[text()='Select an Option'])[1]")
//    private WebElement SelectTitle;
    
    // Select title option
    @FindBy(xpath = "//div[@id='cpBody_usrPatDemo_cmbFirstName_chosen']")
    private WebElement Selectoption;
    
    // Select Baby
    @FindBy(xpath = "//li[text()='Baby']")
    private WebElement Baby;
    
    //Select Dr
    @FindBy(xpath = "//li[text()='Dr']")
    private WebElement Dr;
    
    //Select Master
    @FindBy(xpath = "//li[text()='Master']")
    private WebElement Master;
    
    //Select Miss
    @FindBy(xpath = "//li[text()='Miss']")
    private WebElement Miss;
    
    //Select Mr
    @FindBy(xpath = "//li[text()='Mr']")
    private WebElement Mr;
    //Okay
    
    //Select Mrs
    @FindBy(xpath = "//li[text()='Mrs']")
    private WebElement Mrs;
    
    //Select Prof
    @FindBy(xpath = "//li[text()='Prof']")
    private WebElement Prof;
    
    //First Name
    @FindBy(xpath = "//input[@id='cpBody_usrPatDemo_txtFirstName']")
    private WebElement FirstName;
    
    //Last Name
    @FindBy(xpath = "//input[@id='cpBody_usrPatDemo_txtLastName']")
    private WebElement LastName;
    
    // Date Of Birth
    @FindBy(xpath = "//input[@id='cpBody_usrPatDemo_dtpBirthDate']")
    private WebElement DateofBirth;
    
    //Sex Option
    @FindBy(xpath = "(//a[@class='chosen-single chosen-single-with-deselect chosen-default'])[2]")
    private WebElement Sex;
    
    //Either
    @FindBy(xpath = "//li[text()='Either']")
    private WebElement Either;
    
    //female
    @FindBy(xpath = "//li[text()='Female']")
    private WebElement Female;
    
    //Male
    @FindBy(xpath = "//li[text()='Male']")
    private WebElement Male;
    
    //Blood Group Option
    @FindBy(xpath = "(//a[@class='chosen-single chosen-default'])[1]")
    private WebElement BloodGroup;
    
    //Blood Group A+
    @FindBy(xpath = "//li[@data-option-array-index='2']")
    private WebElement A;
    
    //Blood Group B+
    @FindBy(xpath = "//li[@data-option-array-index='6']")
    private WebElement B;
    
    //Blood Group AB+
    @FindBy(xpath = "//li[@data-option-array-index='4']")
    private WebElement ABPlus;
    
    //Blood Group O+
    @FindBy(xpath = "//li[@data-option-array-index='8']")
    private WebElement O;
    
    
    //Registration Date
    @FindBy(xpath = "//input[@id='cpBody_usrPatDemo_dtpRegDate']")
    private WebElement RegistrationDate;
    
    //ID No./ ARC No.
    @FindBy(xpath = "//input[@id='cpBody_usrPatDemo_txtPassportNo']")
    private WebElement Idno;
    
    //Int. Id/Passport Id
    @FindBy(xpath = "//input[@id='cpBody_usrPatDemo_txtIntId']")
    private WebElement PassportId;
    
    //Adress
    @FindBy(xpath = "//input[@id='cpBody_usrPatDemo_txtAdress']")
    private WebElement Address;
    
    //Area
    @FindBy(xpath = "//a[@class='chosen-single chosen-default']")
    private WebElement Area;
    
    //Area Name
    @FindBy(xpath = "//li[text()='Acheleia']")
    private WebElement Acheleia;
    
    //Area Name 
    @FindBy(xpath = "//li[text()='Agia']")
    private WebElement Agia;
    
    //Area Name
    @FindBy(xpath = "//li[text()='Agia Eirini Lefkosias']")
    private WebElement AgiaEiriniLefkosias;
    
    //City
    @FindBy(xpath = "(//a[@class='chosen-single chosen-single-with-deselect chosen-default'])[3]")
    private WebElement City;
    
    //City Name
    @FindBy(xpath = "//li[text()='Aberdeen']")
    private WebElement Aberdeen;
    
    //City Name
    @FindBy(xpath = "//li[text()='Amsterdam']")
    private WebElement Amsterdam;
    
    //City Name
    @FindBy(xpath = "//li[text()='Athens']")
    private WebElement Athens;
    
    //Nationality
    @FindBy(xpath = "(//a[@class='chosen-single chosen-single-with-deselect chosen-default'])[4]")
    private WebElement Nationality;
    
    //Nationality Name
    @FindBy(xpath = "//li[text()='American']")
    private WebElement America;
    
    //Nationality Name
    @FindBy(xpath = "//li[text()='Austrian']")
    private WebElement Austrian;
    
    //Nationality Name
    @FindBy(xpath = "//li[text()='Belarus']")
    private WebElement Belarus;
    
    //Phone Number
    @FindBy(xpath = "//input[@id='cpBody_usrPatDemo_txtPhNO']")
    private WebElement Phoneno;
    
    //Landline Number
    @FindBy(xpath = "//input[@id='cpBody_usrPatDemo_txtLandLine']")
    private WebElement Landline;
    
    //Email
    @FindBy(xpath = "//input[@id='cpBody_usrPatDemo_txtEmail']")
    private WebElement Email;
    
    //Gesy Code
    @FindBy(xpath = "//input[@id='cpBody_usrPatDemo_txtNhsCode']")
    private WebElement GesyCode;
    
    //Payment Source
    @FindBy(xpath = "//a[@class='chosen-single chosen-single-with-deselect chosen-default']")
    private WebElement PIC;
    
    //Payment Options
    @FindBy(xpath = "//li[text()='GESY']")
    private WebElement GESY;
    
    //Payment Options
    @FindBy(xpath = "//li[text()='LOCAL PATIENT']")
    private WebElement LocalPatient;
    
    //Payment Options
    @FindBy(xpath = "//li[text()='AHK']")
    private WebElement AHK;
    
    
    //JavascriptExecutor js = (JavascriptExecutor) driver;
    
    //UHID No
    @FindBy(xpath = "//input[@id='cpBody_usrPatDemo_txtHospIdNo']")
    private WebElement UHIDno;
    
    //Referral Source
    @FindBy(xpath = "//input[@id='cpBody_usrPatDemo_txtRefSource']")
    private WebElement ReferralSource;
    
    //Save Button
    @FindBy(xpath = "//button[@class='btn btn-success btn-sm']")
    private WebElement Save;
    
    //Close Button
    @FindBy(xpath = "//button[@class='btn btn-secondary btn-sm']")
    private WebElement Close;
    //Patient Demographic
    
  
    //Intialize Elements
	public StatementofAccountPage(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	//Verify Statment Of Account of Page
	public void VerifyStatementofAccountPageTitle() 
	{
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Statement of Account";
		Assert.assertEquals(ExpectedTitle, ActualTitle);
	}
	
	//Enter UHID
	public void setUHID(String UHIDno) 
	{	
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(UHID)).sendKeys(UHIDno,Keys.ENTER);
		//UHID.sendKeys(UHIDno,Keys.ENTER);
	}
	
	//click on Search Button
	public void clickSearch() 
	{	
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Advsearch)).click();
		//Advsearch.click();	
	}
	
	//click on Statement of Account
	public void clickStatementofAccount() 
	{	
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(StatementofAccount)).click();
		//StatementofAccount.click();	
	}
	
	//Click on Outstanding Bills
	public void clickOutstandingBills() 
	{	
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(OutstandingBills)).click();
		//OutstandingBills.click();
	}
	
	public String checkOutstandingBillAmt() throws InterruptedException 
	{	
		String amt="";
		Thread.sleep(2000);
		if(OSBillAmt.isDisplayed()) {
			amt = OSBillAmt.getText();
		}
		//String amt = new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated((By) OSBillAmt)).getText();
		//		
		//OutstandingBills.click();
				return amt;
				}
	
	//Click on Refresh Button
	public void clickRefresh() 
	{	
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Refresh)).click();
		//Refresh.click();
	}
	
	//Click on Clear Button
	public void clickClear() 
	{	
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Clear)).click();
		//Clear.click();
	}
	
	//Click on Print Button
	public void clickPrint() 
	{	
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Print)).click();
		//Print.click();
	}
	
	//Click on Summary
	public void clickSummary() 
	{	
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Summary)).click();
		//Summary.click();
	}
	
	//Click on Detailed
	public void clickDetailed() 
	{	
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Detailed)).click();
		//Detailed.click();
	}
	
	//Click on PrintA4
	public void clickA4() 
	{	
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(PrintA4)).click();
		//PrintA4.click();
	}
	
	//Click on PrintA5
	public void clickA5() 
	{	
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(PrintA5)).click();
		//PrintA5.click();
	}
	
	//Click on Yes
	public void clickYes() 
	{	
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Yes)).click();
		//Yes.click();
	}
	
	//Click on No
	public void clickNo() 
	{	
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(No)).click();
		//No.click();
	}
	
	//Verify Alert pop up
	public void VerifyAlertPopup()
	{
		String Actual = Alertpopup.getText();
		//System.out.println(Actual);
 		String Expected = "Alerts";
 		//System.out.println(Expected);
		Assert.assertEquals(Expected, Actual);
	}
	
	// Alert Close Button
	public void Alertclose() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(AlertClose)).click();
		//AlertClose.click();
	}
	//Verify Patient Demographic Link
		public void VerifyPatientDemographiclink() 
		{
			String Actual = PatientDemographic.getText();
			System.out.println(Actual);
	 		String Expected = "Mr BARRY JOHN CLARK, Male, 75 Years 4 Months 12 Days, In Patient, GESY";
	 		System.out.println(Expected);
			Assert.assertEquals(Expected, Actual);
		}
		
		
	//Click on Patient Demographic
	public void clickPatientdemographic() 
	{	
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(PatientDemographic)).click();
		//PatientDemographic.click();
	}
	
	//Click on Select Option
	public void clickSelectoption() 
	{	
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Selectoption)).click();
		//Selectoption.click();
	}
	
	//Click on Baby
	public void clickbaby() 
	{	
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Baby)).click();
		//Baby.click();
	}
	
	//Click on Dr
	public void clickdr() 
	{	
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Dr)).click();
		//Dr.click();
	}
	
	//click on Master
	public void Clickmaster() 
	{	
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Master)).click();
		//Master.click();
	}
	
	//Click on Miss
	public void Miss() 
	{	
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Miss)).click();
		//Miss.click();
	}
	
	//Click on Mr
	public void clickmr() 
	{	
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Mr)).click();
		//Mr.click();
	}
	
	//Click on Mrs
	public void Mrs() 
	{	
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Mrs)).click();
		//Mrs.click();
	}
	
	//Click on Prof
	public void clickprof() 
	{	
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Prof)).click();
		//Prof.click();
	}
	
	//Enter First Name
	public void setFirstname(String Firstname) 
	{	
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(FirstName)).sendKeys(Firstname);
		//FirstName.sendKeys(Firstname);
	}
	
	//Enter Last Name
	public void setLastname(String Lastname) 
	{	
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(LastName)).sendKeys(Lastname);
		//LastName.sendKeys(Lastname);
	}
	
	//Enter Date Of Birth
	public void setDateofbirth(String Dateofbirth) 
	{	
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(DateofBirth)).sendKeys(Dateofbirth);
		//DateofBirth.sendKeys(Dateofbirth);
	}
	
	//Click on Sex
	public void clicksex() 
	{	
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Sex)).click();
		//Sex.click();
	}
	
	//Click on Either
	public void clickeither() 
	{	
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Either)).click();
		//Either.click();
	}
	
	//Click on Female
	public void clickfemale() 
	{	
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Female)).click();
		//Female.click();
	}
	
	//Click on Male
	public void clickmale() 
	{	
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Male)).click();
		//Male.click();	
	}
	
	//Click on Blood Group
	public void clickBloodgroup() 
	{	
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(BloodGroup)).click();
		//BloodGroup.click();
	}
	
	//Click on A+
	public void clickA() 
	{	
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(A)).click();
		//A.click();	
	}
	
	//Click on B+
	public void clickB() 
	{	
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(B)).click();
		//B.click();
	}
	
	//Click on AB+
	public void clickAB()
	{	
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(ABPlus)).click();
		//ABPlus.click();
	}
	
	//Click on O+
	public void clickO() 
	{	
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(O)).click();
		//O.click();
	}
	
	//Enter id no
	public void setIdno(String IdNo) 
	{	
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Idno)).sendKeys(IdNo);
		//Idno.sendKeys(IdNo);
	}
	
	//Enter Passport Id
	public void setPassportid(String Passportid) 
	{	
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(PassportId)).sendKeys(Passportid);
		//PassportId.sendKeys(Passportid);
	}
	
	//Enter Address
	public void setaddress(String address) 
	{	
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Address)).sendKeys(address);
		//Address.sendKeys(address);
	}
	
	//Click on Area
	public void clickarea() 
	{	
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Area)).click();
		//Area.click();
	}
	
	//Click Acheleia
	public void clickacheleia() 
	{	
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Acheleia)).click();
		//Acheleia.click();	
	}
	
	//Click Agia
	public void clickagia() 
	{	
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Agia)).click();
		//Agia.click();
	}
	
	//Click AgiaEiriniLefkosias
	public void clickagiaeirinilefkosias() 
	{	
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(AgiaEiriniLefkosias)).click();
		//AgiaEiriniLefkosias.click();
	}
	
	//Click City
	public void clickcity() 
	{	
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(City)).click();
		//City.click();
	}
	
	//Click Aberdeen
	public void clickAberdeen() 
	{	
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Aberdeen)).click();
		//Aberdeen.click();
	}
	
	//Click Amsterdam
	public void clickamsterdam() 
	{	
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Amsterdam)).click();
		//Amsterdam.click();
	}
	
	//Click Athens
	public void clickathens() 
	{	
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Athens)).click();
		//Athens.click();
	}
	
	//Click Nationality
	public void clicknationality() 
	{	
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Nationality)).click();
		//Nationality.click();
	}
	
	//Click America
	public void clickamerica() 
	{	
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(America)).click();
		//America.click();
	}
	
	//Click Austrian
	public void clickaustrian() 
	{	
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Austrian)).click();
		//Austrian.click();
	}
	
	//Click Belarus
	public void clickbelarus() 
	{	
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Belarus)).click();
		//Belarus.click();
	}
	
	//Enter Phone No
	public void setphoneno(String phoneno) 
	{	
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Phoneno)).sendKeys(phoneno);
		//Phoneno.sendKeys(phoneno);
	}
	
	//Enter Land Lineno
	public void setlandlineno(String Landlineno) 
	{	
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Landline)).sendKeys(Landlineno);
		//Landline.sendKeys(Landlineno);
	}
	
	//Enter Mail
	public void setemail(String email) 
	{	
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Email)).sendKeys(email);
		//Email.sendKeys(email);
	}
	
	//Enter GESY Code
	public void setgesycode(String Gesycode) 
	{	
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(GesyCode)).sendKeys(Gesycode);
		//GesyCode.sendKeys(Gesycode);
	}
	
	//Click Payment Source
	public void clickPayment() 
	{	
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(PIC)).click();
		//PIC.click();
	}
	
	//Click Gesy
	public void clickGesy() 
	{	
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(GESY)).click();
		//GESY.click();
	}
	
	//Click Local Patient
	public void clickLocalpatient() 
	{	
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(LocalPatient)).click();
		//LocalPatient.click();
	}
	
	//Click AHK
	public void clickAhk() 
	{	
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(AHK)).click();
		//AHK.click();
	}
	
	//Click Save
	public void clicksave() 
	{	
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Save)).click();
		//Save.click();
	}
	
	//Click Close
	public void clickclose() 
	{	
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Close)).click();
		//Close.click();
	}
	
	//Verify Advance Search Page Title
	public void VerifyAdvSearchPage() 
	{
		String Actual = AdvSearchPage.getText();
		System.out.println(Actual);
 		String Expected = "";
 		System.out.println(Expected);
		Assert.assertEquals(Expected, Actual);
	}
	
	//Enter patient UHID
	public void setUhidinPD(String Uhid) 
	{	
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(SearchthroughResult)).sendKeys(Uhid);	
		//SearchthroughResult.sendKeys(Uhid);	
	}
	
	//Select First Patient
	public void selectUHID()
	{	
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(SelectPatient)).click();
		//SelectPatient.click();
	}
	
	//Click on Ok
	public void clickOKbtn() 
	{	
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Ok)).click();
		//Ok.click();
	}
	
	//Click on Close
	public void clickClosebtn() 
	{	
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(close)).click();
		close.click();
	}
	
	public void VerifyOutstandingBillAmt(String BillNetamt , String SOAOSAmt ) 
	{
		String Actual = BillNetamt;
		String Expected = SOAOSAmt;
		Assert.assertEquals(Expected, Actual);
	}
	
	//Verify Patient Demographic Link
	public void VerifyInvoicePopup() 
	{
	String Actual = InvoicePopup.getText();
	String Expected = "Do you wish to print?";
	Assert.assertEquals(Expected, Actual);
	}
	
	public void GetBillandReceiptCodes(String expctedInvCode) {
		String ActualInvCode="";
		for(WebElement inv:BillsAndReceiptCodes) {
			 expctedInvCode = inv.getText();
			if(ActualInvCode.contains(expctedInvCode)) {
				Assert.assertEquals(expctedInvCode, ActualInvCode);
			}
		}
	}
	
	public void PrintCreditNoteSlip() {
		//for(int i = 0; i<= CreditNotes.size()-1; i++) {
		
			 int x = CreditNotes.get(CreditNotes.size()-1).getLocation().getX();
			 int y = CreditNotes.get(CreditNotes.size()-1).getLocation().getY();
			 JavascriptExecutor js = (JavascriptExecutor)driver;
			 js.executeScript("window.scrollBy(" + x + ", " + y + ");");
			 CreditNotes.get(CreditNotes.size()-1).click();
			 
			 
	//	}
	}
	
	// To Click Invoice Summary Print
	public void PrintInvoiceSummary() 
	{
		 int x = InvoiceSummary.get(InvoiceSummary.size()-1).getLocation().getX();
		 int y = InvoiceSummary.get(InvoiceSummary.size()-1).getLocation().getY();
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy(" + x + ", " + y + ");");
		 InvoiceSummary.get(InvoiceSummary.size()-1).click();
		
	}
	
	//To Click Invoice Detailed Print
	public void PrintInvoiceDetailed() 
	{
		 int x = InvoiceDetailed.get(InvoiceDetailed.size()-1).getLocation().getX();
		 int y = InvoiceDetailed.get(InvoiceDetailed.size()-1).getLocation().getY();
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy(" + x + ", " + y + ");");
		 InvoiceDetailed.get(InvoiceDetailed.size()-1).click();
	}
	
	//To Click on Detailed TransferOut Print
	public void PrintTransferOutDetailed() 
	{
		int x = TransferoutDetailed.get(TransferoutDetailed.size()-1).getLocation().getX();
		 int y = TransferoutDetailed.get(TransferoutDetailed.size()-1).getLocation().getY();
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy(" + x + ", " + y + ");");
		 TransferoutDetailed.get(TransferoutDetailed.size()-1).click();
	}
	
	//Transfer Out Paid Receipt Close 
	public void ClickTNReceiptClose() 
	{	
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(TNReceiptClose)).click();
		//TNReceiptClose.click();
	}
	
	
	//To click on Detailed Receipt Print
	public void PrintReceiptDetailed() 
	{
		int x = ReceiptDetailed.get(ReceiptDetailed.size()-1).getLocation().getX();
		 int y = ReceiptDetailed.get(ReceiptDetailed.size()-1).getLocation().getY();
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy(" + x + ", " + y + ");");
		 ReceiptDetailed.get(ReceiptDetailed.size()-1).click();
	}
	
	
	//To Click on Refund Detailed Print RefundDetailed
	public void PrintRefundDetailed() 
	{
		int x = RefundDetailed.get(RefundDetailed.size()-1).getLocation().getX();
		 int y = RefundDetailed.get(RefundDetailed.size()-1).getLocation().getY();
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy(" + x + ", " + y + ");");
		 RefundDetailed.get(RefundDetailed.size()-1).click();
	}
	
	//To Click on Debit Invoice Detailed Print DebitInvoice
	public void PrintDebitInvoice() 
	{
		int x = DebitInvoice.get(DebitInvoice.size()-1).getLocation().getX();
		 int y = DebitInvoice.get(DebitInvoice.size()-1).getLocation().getY();
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy(" + x + ", " + y + ");");
		 DebitInvoice.get(DebitInvoice.size()-1).click();
	}
	
	// To Click on transfer Out Paid 
	public void PrintTransferOutPaid() 
	{
		int x = TransferOutPaid.get(TransferOutPaid.size()-1).getLocation().getX();
		 int y = TransferOutPaid.get(TransferOutPaid.size()-1).getLocation().getY();
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy(" + x + ", " + y + ");");
		 TransferOutPaid.get(TransferOutPaid.size()-1).click();
	}
	
	//To Click on Transfer Payment Detailed Print
	public void PrintTransferPayment() 
	{
		int x = TransferPayment.get(TransferPayment.size()-1).getLocation().getX();
		 int y = TransferPayment.get(TransferPayment.size()-1).getLocation().getY();
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy(" + x + ", " + y + ");");
		 TransferPayment.get(TransferPayment.size()-1).click();
	}
	

}
