package pom;

import java.security.Key;
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

public class ChargeSheetPage extends BasePage
{
	
	//Select UHID
	@FindBy(xpath = "//input[@id='cpBody_txtPChartCode']")
	private WebElement UHIDNO;
	
	//Select Search button
	@FindBy(xpath = "//button[@id='btnPatSearch']")
	private WebElement Search;
	
	//Select Services
	@FindBy(xpath = "//input[@id='cpBody_txtService']")
	private WebElement Services;
	
	//Select Service Slider
	@FindBy(xpath = "//span[@class='slider round']")
	private WebElement ServiceSlider;
	
	//Select Store Department pop up
	@FindBy(xpath = "//h5[text()='Select Store Department']")
	private WebElement SelectStoreDept;
	
	//Select Drop Down
	@FindBy(xpath = "//a[@class='chosen-single chosen-single-with-deselect chosen-default']")
	private WebElement SelectDD;
	
	//Select General Ward in Store Dept
	@FindBy(xpath = "//li[text()='GENERAL WARD']")
	private WebElement GeneralWard;
	
	//Select Gynaecological Ward
	@FindBy(xpath = "//li[text()='GYNAECOLOGICAL WARD']")
	private WebElement GynaecologicalWard;
	
	//Select Hospital Main Store in Select Store Department
	@FindBy(xpath = "//li[text()='HOSPITAL MAIN STORES']")
	private WebElement HospitalMainStore;
	
	//Select ok in Select Store Department Popup
	@FindBy(xpath = "//button[@id='btnCloseDept']")
	private WebElement OkinStoreDeptpopup;
	
	//Select Close Store Department POpup
	@FindBy(xpath = "//button[@onclick='return fn_returnToService();']//i[@class='fa fa-times-circle redClose']")
	private WebElement CloseinStoreDeptpopup;
	
	//Select Product text field 
	@FindBy(xpath = "//input[@id='cpBody_txtService']")
	private WebElement Productname;
	
	//Select Batch Expiry Date Drop Down
	@FindBy(xpath = "//span[text()='BATCH | QOH | EXPIRY DATE']")
	private WebElement BatchExpiry;
	
	//Select Expiry Date of a Product
	@FindBy(xpath = "//li[@class='active-result']")
	private WebElement Expirydate;
	
	//Select Add quantity
	@FindBy(xpath = "//input[@id='cpBody_txtIssueQty']")
	private WebElement Addproduct;
	
	//Select Add Button
	@FindBy(xpath = "//button[@id='btnAddProducts']")
	private WebElement AddButton;
	
	//Select Refresh Button
	@FindBy(xpath = "//i[@id='iconChangeDept']")
	private WebElement RefreshDept;
	
	
	//Select Patient Indent Search
	@FindBy(xpath = "//i[@class='fas fa-user-injured pr-1']")
	private WebElement PatientIndentSearch;
	
	//Patient Indent Search Pop Up
	@FindBy(xpath = "//h5[text()='Patient Indent Search']")
	private WebElement PatientIndentPopup;
	
	//Select Status Drop Down
	@FindBy(xpath = "(//a[@class='chosen-single'])[1]")
	private WebElement StatusDropDown;
	
	// Select Indent Partially Completed
	@FindBy(xpath = "//li[text()='Indent Partially Completed']")
	private WebElement IndentPartially;
	
	// Select Indent Product Pending
	@FindBy(xpath = "//li[text()='Indent Product Pending']")
	private WebElement IndentProduct;
	
	//Select department
	@FindBy(xpath = "(//a[@class='chosen-single chosen-default'])[1]")
	private WebElement SelectDepartment;
	
	//Select Account department in Select Deparment Drop Down
	@FindBy(xpath = "//li[text()='ACCOUNTS DEPT']")
	private WebElement AccountDepartment;
	
	//Select Day Procedure Unit in Select Department Drop Down
	@FindBy(xpath = "//li[text()='DAY PROCEDURE UNIT']")
	private WebElement DayProcedureUnit;
	
	//Select Reception Department in Patient Indent Search
	@FindBy(xpath = "//li[text()='RECEPTION DEPT']")
	private WebElement ReceptionDepartment;
	
	//Select Indent Code text field in Patient Indent Search
	@FindBy(xpath = "//input[@id='txtCode']")
	private WebElement Indentcode;
	
	//Select From Department text field
	@FindBy(xpath = "//input[@id='txtFDept']")
	private WebElement FromDepartment;
	
	//Select To Department text field in Patient Indent Search
	@FindBy(xpath = "//input[@id='txtToDept']")
	private WebElement ToDepartment;
	
	//Select Date text field in Patient Indent search
	@FindBy(xpath = "//input[@id='txtDate']")
	private WebElement Date;
	
	//Select Remarks text field in patient Indent Search
	@FindBy(xpath = "//input[@id='txtRks']")
	private WebElement Remarks;
	
	//Select Record Status in patient Indent Search
	@FindBy(xpath = "//input[@id='txtRST']c")
	private WebElement RecordStatus;
	
	//Select Created By in Patient Indent Search
	@FindBy(xpath = "//input[@id='txtCBy']")
	private WebElement CreatedBy;
	
	//Select Indent Type in Patient Indent Search
	@FindBy(xpath = "//input[@id='txtIndBy']")
	private WebElement IndentType;
	
	// Select Ok buttom in Patient Indent Search
	@FindBy(xpath = "//button[@id='cpBody_btnOkay']")
	private WebElement OK;
	
	//Select Refresh Button in Patient Indent Search
	@FindBy(xpath = "(//button[@class='btn  btn-dark btn-sm'])[2]")
	private WebElement Refresh;
	
	//Select Close Button in Patient Indent Search
	@FindBy(xpath = "(//button[@class='btn btn-secondary btn-sm'])[2]")
	private WebElement Close;
	
	//Select Stock Balance 
	@FindBy(xpath = "//i[@title='Stock Balance']")
	private WebElement StockBalance;
	
	//Select Stock Balance Pop Up
	@FindBy(xpath = "//h5[text()='HOSPITAL MAIN STORES Stock Balance']")
	private WebElement StockBalancePopUp;
	
	//Select Product Name in Stock Balance
	@FindBy(xpath = "//input[@id='inpt1']]")
	private WebElement ProductName;
	
	//Select Batch No in Stock Balance
	@FindBy(xpath = "//input[@id='inpt2']")
	private WebElement BatchNo;
	
	//Select Expiry Date in Stock Balance
	@FindBy(xpath = "//input[@id='inpt3']")
	private WebElement ExpiryDate;
	
	//Select QOH in Stock Balance
	@FindBy(xpath = "//input[@id='inpt4']")
	private WebElement QOH;
	
	//Select Selling Price in Stock Balance
	@FindBy(xpath = "//input[@id='inpt5']")
	private WebElement SellingPrice;
	
	//Select Category in Stock Balance
	@FindBy(xpath = "//input[@id='inpt6']")
	private WebElement Category;
	
	//Select Refresh in Stock Balance
	@FindBy(xpath = "(//button[@onclick='fn_RefreshStock();'])[1]")
	private WebElement RefreshStockBalance;
	
	//Select Close in Stock Balance
	@FindBy(xpath = "(//button[@class='btn btn-secondary btn-sm'])[1]")
	private WebElement CloseStockBalance;
	
	//Select Change
	@FindBy(xpath = "//i[@onclick='fn_ChangeBill();']")
	private WebElement Change;
	
	//Select Clear
	@FindBy(xpath = "//a[@id='cpBody_btnBillClose']")
	private WebElement Clear;
	 
	//Select Save
	@FindBy(xpath = "//button[@id='btnSave']")
	private WebElement Save;
	
	//Select Remarks text Area
	@FindBy(xpath = "//textarea[@id='cpBody_txtRemarks']")
	private WebElement RemarksChargeSheet;
	
	//Select Advance Search Page
	@FindBy(xpath = "//h5[@id='h3PatientSearch']")
	private WebElement AdvSearchpage;
	
	//Select Search Through Result
	@FindBy(xpath = "//input[@id='txtAdSearch']")
	private WebElement SearchResult;
	
	//Select Admit Code in Advance Search
	@FindBy(xpath = "//table[@id='tbAdmssions']//td[4]")
	private List<WebElement> AdmitCode;
	
	//Select Ok in Advance Search Page
	@FindBy(xpath = "//button[@id='cpBody_btnPatSearchOk']")
	private WebElement OkAdvSearch;
	
	//Select Close in Advance Search Page
	@FindBy(xpath = "(//button[@class='btn btn-secondary btn-sm'])[4]")
	private WebElement CloseAdvSearch;
	
	//Select Admitted patient list in Advance search page
	@FindBy(xpath = "//td[text()=' EVAN000101020']")
	private WebElement PatientDetailsinAdv;
	
	//Select Patient Demographic link 
	@FindBy(xpath = "//a[@id='cpBody_lnklblPatHeader']")
	private WebElement PatientDemographiclink;
	
	
	
	
	public ChargeSheetPage(WebDriver driver) 
	{
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	// Enter UHID
	public void setUHID(String UHIDno) 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(UHIDNO)).sendKeys(UHIDno,Keys.ENTER);

	}
	
	//Enter Name
	public void setName(String name) 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(UHIDNO)).sendKeys(name);
		
	}
	
	//Click Search Button
	public void clickonSearch()
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Search)).click();
	}
	
	//Add Services
	public void setServices(String services)
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Services)).sendKeys(services);
	}
	
	//Add and Select Services and packages
	public void addservices(String services) 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Services)).sendKeys(services, Keys.ENTER);
		
	}
	
	//Click Service Slider
	public void clickServiceSlider() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(ServiceSlider)).click();
		
	}
	
	//Verify Select Store Department Pop Up
	public void verifySelectStoreDept() throws InterruptedException 
	{
		Thread.sleep(2000);
		String Actual = SelectStoreDept.getText();
		String Expected = "Select Store Department";
		Assert.assertEquals(Expected, Actual);
		
	}
	
	// Click Select Department Drop Down
	public void clickSelectStoreDept() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(SelectDD)).click();
		
	}
	
	//Click on General Ward in Select Store Dept
	public void clickGeneralWard() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(GeneralWard)).click();
		
	}
	
	//Click on Gynaecological Ward in Select Store Dept
	public void clickGynaecologicalWard() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(GynaecologicalWard)).click();
		
	}
	
	//Click on Hosptial Main Store in Select Store Dept
	public void clickHosptialMainStoreDept() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(HospitalMainStore)).click();
		
	}
	
	//Click ok Select Store Department Popup
	public void clickOkinStoreDeptpopup() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(OkinStoreDeptpopup)).click();
		
	}
	
	//Click Close in Store Dept Pop up
	public void clickCloseinStoreDeptPopup() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(CloseinStoreDeptpopup)).click();
		
	}
	
	//Click on Product text Field
	public void setProductNameorCode(String Productnameorcode) 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Productname)).sendKeys(Productnameorcode);
		
	}
	
	//Click on Batch Expiry Date Drop down
	public void clickBatchExpiryDate() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(BatchExpiry)).click();
		
	}
	
	//Click on Expiry date of A Product
	public void clickExpirydate() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Expirydate)).click();
		
	}
	
	//Click on Add Product 
	public void clickAddProduct() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Addproduct)).clear();
		
	}
	
	//Add Product Quantity
	public void setAddProduct(String Productquantity) 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Addproduct)).sendKeys(Productquantity);
		
	}
	
	//Click On Add Button'
	public void clickAddButton() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(AddButton)).click();
		
	}
	
	//Click on Department Refresh Button
	public void clickRefreshDept() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(RefreshDept)).click();
		
	}
	
	
	//Click on Patient Indent Search
	public void clickPatientIndent() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(PatientIndentSearch)).click();
		
	}
	
	//Verify Patient Indent Search PopUp
	public void VerifyPatientIndentPopup() throws InterruptedException {
		Thread.sleep(2000);
		String Actual = PatientIndentPopup.getText();
		String Expected = "Patient Indent Search";
		Assert.assertEquals(Expected, Actual);
	}
	
	//Click on Status Drop Down
	public void clickStatusDropDown()
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(StatusDropDown)).click();
	}
	
	//Click on IndentPartially Completed status
	public void clickIndentPartiallyCompleted() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(IndentPartially)).click();
		
	}
	
	//Click on Indent Product Pending status
	public void clickIndentProductPending() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(IndentProduct)).click();
		
	}
	
	//Click Select Department Drop Down
	public void clickSelectDepartment() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(SelectDepartment)).click();
		
	}
	
	//Click on Account Department in Select Department Drop Down
	public void clickAccountDepartment() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(AccountDepartment)).click();
		
	}
	
	//Click on Day Procedure Unit in Select Department drop Down
	public void clickDayProcedureDepartment() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(DayProcedureUnit)).click();
		
	}
	
	//Click on Reception Department in Select Department Drop Dwon
	public void clickReceptionDepartment() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(ReceptionDepartment)).click();
		
	}
	
	//Click on Indent Code in Patient Indent Search
	public void setIndentCode(String indentcode) 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Indentcode)).sendKeys(indentcode);
		
	}
	
	//Click on From Department in Patient Indent Search
	public void setFromDepartment(String fromdepartment) 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(FromDepartment)).sendKeys(fromdepartment);
		
	}
	
	//Click on To Department in Patient Indent Search
	public void setToDepartment(String todepartment) 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(ToDepartment)).sendKeys(todepartment);
		
	}
	
	//Click on Date in PAtient Indent Search
	public void setDate(String date) 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Date)).sendKeys(date);
		
	}
	
	//Click on Remarks in Patient Indent Search
	public void setRemarks(String remarks) 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Remarks)).sendKeys(remarks);
		
	}
	
	//Click on Record Status in Patient Indent Search
	public void setRecordStatus(String recordstatus) 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(RecordStatus)).sendKeys(recordstatus);
		
	}
	
	//Click on Indent Type in Patient Indent Search
	public void setIndentType(String indenttype) 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(IndentType)).sendKeys(indenttype);
		
	}
	
	//Click on Ok Button in Patient Indent Search
	public void clickOk() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(OK)).click();
		
	}
	
	//Click on Refresh Button in Patient Indent Search
	public void clickRefresh() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Refresh)).click();
		
	}
	
	//click on Close Button in Patient Indent Search
	public void clickClose() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Close)).click();
		
	}
	
	//Click on Stock Balance in Patient Indent Search
	public void clickStockBalance() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(StockBalance)).click();
		
	}
	
	//Verify Stock Balance Pop UP
	public void VerifyStockBalancePopup() throws InterruptedException 
	{
		Thread.sleep(2000);
		String Actual = StockBalancePopUp.getText();
		String Expected = "HOSPITAL MAIN STORES Stock Balance";
		Assert.assertEquals(Expected, Actual);
	}
	
	//Click on Product Name in Stock Balance
	public void setProductName(String productname) 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(ProductName)).sendKeys(productname);
		
	}
	
	//Click on BatchNo in Stock Balance
	public void setBatchNo(String batchno) 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(BatchNo)).sendKeys(batchno);
		
	}
	
	//Click on Expirydate in Stock Balance
	public void setExpiryDate(String expirydate) 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(ExpiryDate)).sendKeys(expirydate);
		
	}
	
	//Click on QOH in Stock Balance
	public void setQOH(String Qoh) 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(QOH)).sendKeys(Qoh);
		
	}
	
	//Click on Selling Price in Stock Balance
	public void setSellingPrice(String sellingprice) 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(SellingPrice)).sendKeys(sellingprice);
		
	}
	
	//Click on Category in Stock Balance
	public void setCategory(String category) 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Category)).sendKeys(category);
		
	}
	
	//Click on Refresh in Stock Balance
	public void clickRefreshStockBalance() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(RefreshStockBalance)).click();
		
	}
	
	//Click on Close in Stock Balance
	public void clickCloseStockBalance() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(CloseStockBalance)).click();
		
	}
	
	//Click on Change 
	public void clickChange() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Change)).click();
		
	}
	
	//Click on Clear Button
	public void clickClear() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Clear)).click();
		
	}
	
	//Click on Save Button
	public void clickSave() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Save)).click();
		
	}
	
	//Click on Remarks Text Filed
	public void setChargeSheetRemarks(String remarks) 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(RemarksChargeSheet)).sendKeys(remarks);
		
	}
	
	//Verify Advance Search Page
	public void VerifyAdvSearchPage() throws InterruptedException 
	{
		Thread.sleep(2000);
		String Actual = AdvSearchpage.getText();
		String Expected = "Advanced Search";
		Assert.assertEquals(Expected, Actual);
	}
	
	//Click on Search through Result
	public void setSearchResult(String searchresult) 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(SearchResult)).sendKeys(searchresult);
		
	}
	
	//Click on Admit Code in Advance Search
	public void clickAdmitCode() 
	{
		int x = AdmitCode.get(AdmitCode.size() - 1).getLocation().getX();
		int y = AdmitCode.get(AdmitCode.size() - 1).getLocation().getY();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(" + x + ", " + y + ");");
		AdmitCode.get(AdmitCode.size() - 1).click();
	}
		
	//Click on OK in Advance Search Page
	public void clickOkAdvSearch() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(OkAdvSearch)).click();
		
	}
	
	//Click on Close in Advance Search
	public void clickcloseinAdv() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(CloseAdvSearch)).click();
		
	}
	
	//Click Admitted Patient in Advance page
	public void clickPatientDetailsinAdv() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(PatientDetailsinAdv)).click();
		
	}
	
	//Verify patient details in Advance search
	public void VerifyPatientDetailsinAdv() throws InterruptedException 
	{
		Thread.sleep(2000);
		String Actual = PatientDetailsinAdv.getText();
		String Expected = "EVAN000101020";
		Assert.assertEquals(Expected, Actual);
		System.out.println(Actual);
		System.out.println(Expected);
	}
	
	//Click patient Demographic link
	public void clickPatientDemographiclink() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(PatientDemographiclink)).click();
		
	}
	
	//verify patient demographic link
	public void VerifyPatientDemographiclink() throws InterruptedException 
	{
		Thread.sleep(2000);
		String Expected = PatientDemographiclink.getText();
		String Actual = "Mr ROBERT EVANS, Male, 71 Years 0 Months 23 Days, In Patient, LOCAL PATIENT";
		Assert.assertEquals(Expected, Actual);
		
	}
	
}
