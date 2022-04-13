package pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class RevisitPage extends BasePage{
	
	//UHID Field
	@FindBy (xpath = "//input[@id='cpBody_txtHospIdNo']")
	private WebElement UHIDno;
	
	//UHID as first element in Revisit
	@FindBy(xpath = "//label[text()='UHID No.']")
	private WebElement UHID;
	
	//PIC Dropdown
	@FindBy (id="cpBody_cmbPatType_chosen")
	private WebElement PICDropdown;
	
	//Search PIC by input
	@FindBy (xpath = "//div[@id='cpBody_cmbPatType_chosen']//input")
	private WebElement SearchPIC;
	//PIC
	@FindBy (xpath = "//li[.='LOCAL PATIENT']")
	private WebElement LOCALPATINT;
	
	@FindBy (xpath = "//li[.='GESY']")
	private WebElement GESY;
    
	//physician visit type
	@FindBy (id = "cpBody_rdVisitToPhy")
	private WebElement Phyvisit;
	
	//Physician dropdown
	@FindBy (id = "cpBody_drpPrimaryConsultant_chosen")
	private WebElement PhyDropdown;
	
	//Search Physician by input
	@FindBy (xpath = "//div[@id='cpBody_drpPrimaryConsultant_chosen']//input")
	private WebElement SearchPhy;
	
	//Consultants
	@FindBy (xpath = "//li[.='ADAMOS ADAMOU|Oncology']")
	private WebElement AdamosAdamou;
	
	@FindBy (xpath = "//li[.='NESTORAS MICHAEL|Gynaecology and Obstetrics']")
	private WebElement NestorasMichael;
	
	//Hospital visit type
	@FindBy (id = "cpBody_rdVisitToHosp")    
	private WebElement Hospvisit;
	
	//hospital dropdown
	@FindBy (id = "cpBody_cmbDepartment_chosen")
	private WebElement HospDropdown;
	
	//Department list
	@FindBy (xpath = "//li[.='CLINICAL LABORATORY']")
	private WebElement ClinicalLaboratory;
	
	@FindBy (xpath = "//li[.='RADIOLOGY DEPT']")
	private WebElement RadiologyDept;
	
	//Primary introducing sources
	@FindBy (xpath = "/html/body/form/div[3]/div/div[2]/div[2]/div[6]/div/div[2]/div/a/span")
	private WebElement primaryIntrodropdown;
	
	@FindBy (xpath = "//div[@id='cpBody_drpRefList_chosen']//input")
	private WebElement SearchPrimaryIntro;
	
	//Select Secondary Introducing Source
	@FindBy(xpath = "/html/body/form/div[3]/div/div[2]/div[2]/div[7]/div/div[2]/div/a/span")
	private WebElement SecondaryIntroSource;
	
	//Introducing sources
	@FindBy (xpath = "//li[.='AEOLOS (TUI)']")
	private WebElement AEOLOS;
	
	@FindBy (xpath = "//li[.='AGAMEMNON ARGIROU']")
	private WebElement AGAMEMNONARGIROU;
	
	//Insurance details
	@FindBy (id = "cpBody_LblInsurance")
	private WebElement clickInsurancedetails;
	
	//Add insurance
	@FindBy (id = "cpBody_usrOpIpInsur_lnkAdd")
	private WebElement ClickAddInsurance;
	
	//Click Insurance dropdown
	@FindBy (id = "cpBody_usrOpIpInsur_cmbInsurance_chosen")
	private WebElement insuranceDropdown;
	
	//Insurance list
	@FindBy (xpath = "//li[.='ADAC INSURANCE']" )
	private WebElement AdacInsurance;
	
	@FindBy (xpath = "//li[.='OAY (SHARE)']" )
	private WebElement OAYShare;
	
	//Nextmonth
	@FindBy (xpath = "//a[@class='ui-datepicker-next ui-corner-all']")
	private WebElement NextMonth;
	
	//Select Next month 15th date
	@FindBy (xpath = "//a[.='15']")
	private WebElement Date15th;
	
	//Save Insurance details
	@FindBy (id = "btnSave")
	private WebElement SaveInsurnce;
	
	//Select Data Protection form
	@FindBy (id = "cpBody_ChkDatafrm")
	private WebElement DataprotectionForm;
	
	//Clear screen button
	@FindBy (xpath = "//button[@class='btn btn-danger']")
	private WebElement clear;
	
	//Save button
	@FindBy (xpath = "//button[@class='btn btn-success']")
	private WebElement Save;
	
	//Select Insurance Details tab 
	@FindBy(xpath = "//button[@id='cpBody_LblInsurance']")
	private WebElement Insdetails;
	
	//Select Add button in Insurance Details tab
	@FindBy(xpath = "(//i[@class='fa fa-plus'])[1]")
	private WebElement AddNewIns;
	
	//New Patient Insurance Popup
	@FindBy(xpath = "//h5[text()='New Patient Insurance']")
	private WebElement NewPatInsurance;
	
	//Insurance in drop down in New patient Insurance pop up
	@FindBy(xpath = "//div[@id='cpBody_usrOpIpInsur_cmbInsurance_chosen']")
	private WebElement InsuranceDD;
	
	//Select AM Studio in Insurance drop down
	@FindBy(xpath = "//li[text()='A.M. STUDIO OZZ LTD (SHARE)']")
	private WebElement AMStudioinINSDD;
	
	//Select Adac Insurance in Insurance Drop Down
	@FindBy(xpath = "//li[text()='ADAC INSURANCE']")
	private WebElement AdacInsuranceinINSDD;
	
	//Select Policy Holder text field in New Patient Insurance pop up
	@FindBy(xpath = "//input[@id='cpBody_usrOpIpInsur_txtPolicyHolder']")
	private WebElement PolicyHolderinINSpopup;
	
	//Select Policy Holder name text field in New Patient INsurance Pop up
	@FindBy(xpath = "//input[@id='cpBody_usrOpIpInsur_txtPolicyNumber']")
	private WebElement PolicyNumberinInsPopup;
	
	
	//Select Group Number text field in New Patient Insurance Pop up
	@FindBy(xpath = "//input[@id='cpBody_usrOpIpInsur_txtGroupNumber']")
	private WebElement GroupNuminINSpopup;
	
    //Select Guarantor text field in New patient Insurance Pop up
	@FindBy(xpath = "//input[@id='cpBody_usrOpIpInsur_txtGuarantor']")
	private WebElement GuarantorinINSpopup;
	
	//Select Relation drop down in New Patient Insurance Pop up
	@FindBy(xpath = "//div[@id='cpBody_usrOpIpInsur_cmbRelation_chosen']")
	private WebElement RelationDDinINSpopup;
	
	//Select Mother from Relation drop down in New Patient Insurance Pop up
	@FindBy(xpath = "//li[text()='Mother']")
	private WebElement MotherinRelDD;
	
	//Select father from Relation drop down in New Patient Insurance Pop up
	@FindBy(xpath = "//li[text()='Father']")
	private WebElement FatherinRelDD;
	
	//Select wife from Relation Drop down in New Patient Insurance Pop up
	@FindBy(xpath = "//li[text()='Wife']")
	private WebElement WifeinRelDD;
	
	//Select Covered for in New Patient Insurance Pop up
	@FindBy(xpath = "//div[@id='cpBody_usrOpIpInsur_cmbCoveredFor_chosen']")
	private WebElement CoveredforinINSpopup;
	
	//Select Address1 text field in New Patient Insurance Pop up
	@FindBy(xpath = "//textarea[@id='cpBody_usrOpIpInsur_txtAddress']")
	private WebElement Address1inInspopup;
	
	//Select Address 2 text field in New Patient Insurance Pop  up
	@FindBy(xpath = "//textarea[@id='cpBody_usrOpIpInsur_txtAddress2']")
	private WebElement Address2inInspopup;
	
	//Select Phone 1 text field in New Patient Insurance Pop up
	@FindBy(xpath = "//input[@id='cpBody_usrOpIpInsur_txtMobileNo']")
	private WebElement Phone1inINSpopup;
	
	//Select Remarks text field in New Patient Insurance Pop up
	@FindBy(xpath = "//textarea[@id='cpBody_usrOpIpInsur_txtRemarks']")
	private WebElement RemarksinINSpopup;
	
	//Select ok Button in New Patient Insurance Pop up
	@FindBy(xpath = "//button[@id='btnSave']")
	private WebElement OKinINSpopup;
	
	//Select Close Button in New Patient Insurance Pop up
	@FindBy(xpath = "//button[@id='btnInsuranceClose']")
	private WebElement CloseinINSPopup;
	
	//Select Physician radio button
	@FindBy(xpath = "//*[@id=\"cpBody_rdVisitToPhy\"]")
	private WebElement PhysicianRB;
	
	//Select Attending Physician
	@FindBy(xpath = "//label[text()='Attending Physician']")
	private WebElement AttendingPhsician;
	
	//Select Hospital radio button
	@FindBy(xpath = "//*[@id=\"cpBody_rdVisitToHosp\"]")
	private WebElement HospitalRB;
	
	//Select Department
	@FindBy(xpath = "//label[text()='Department']")
	private WebElement Department;
	
	//Select Patient Demographic link 
	@FindBy(xpath = "//a[@id='cpBody_lnklblPatHeader']")
	private WebElement PatDemoLink;
	
	//Select Patient UHID from Patient Demographic link
	@FindBy(xpath = "//input[@id='cpBody_usrPatDemo_txtHospIdNo']")
	private WebElement UHIDPatDemo;
	
	//Select Close button in Paitent Demographic Link
	@FindBy(xpath = "/html/body/form/div[3]/div/div[7]/div/div/div[3]/button[2]")
	private WebElement ClosePatDemo;
	
	//Select Advance Search Button
	@FindBy(xpath = "//a[@id='btnRevisitPatientSearch']")
	private WebElement AdvSearchBtn;
	
	//Select Advance Search Window
	@FindBy(xpath = "//h5[@id='h3PatientSearch']")
	private WebElement AdvSearchwindow;
	
	//Select First Patient UHID in Advance Search Grid
	@FindBy(xpath = "//table[@id='tbWaiting']//tr[1]//td[4]")
	private WebElement FirstPatientinGrid;
	
	//Select Insurance Name from Insurance Grid
	@FindBy(xpath = "//tbody[@id='cpBody_usrOpIpInsur_tbdyInsurance']//td[3]")
	private WebElement InsuranceNameinGrid;
	
	//Select Cancel button in Advance Search
	@FindBy(xpath = "//button[@id='btn_CancellVisit']")
	private WebElement CancelinAdvSearch;
	
	//Select Filter drop down in Advance Search
	@FindBy(xpath = "//div[@id='drpSrchFilter_chosen']")
	private WebElement FilterinAdvSearch;
	
	//Select Today in filter by drop down in Advance Search Window
	@FindBy(xpath = "//li[text()='Today']")
	private WebElement TodayinFilter;
	
	//Select Last One Week in Filter drop down in Advance Search 
	@FindBy(xpath = "//li[text()='Last One Week']")
	private WebElement LOWinFilter;
	
	//Select Last One Month in Filter drop down in Advance Search
	@FindBy(xpath = "//li[text()='Last One Month']")
	private WebElement LOMinFilter;
	
	//Select Last Three Month in Filter drop down in Advance Search
	@FindBy(xpath = "//li[text()='Last Three Month']")
	private WebElement LTMinFilter;
	
	//Select Waiting Patient tab in Advance Search
	@FindBy(xpath = "//a[text()='Waiting Patient']")
	private WebElement WaitingPatientinAdv;
	
	//Select Visit Id in Waiting Patient Window
	@FindBy(xpath = "//th[text()='Visit ID']")
	private WebElement VisitIDinAdv;
	
	//Select Seen Patient tab in Advance Search
	@FindBy(xpath = "//a[text()='Seen Patient']")
	private WebElement SeenPatientinAdv;
	
	//Select Last Visit Date in Seen Patient window
	@FindBy(xpath = "//th[text()='Last Visit Date']")
	private WebElement LastVisitDateinAdv;
	
	//Select Visit Cancelled tab in Advance Search
	@FindBy(xpath = "//a[text()='Visit Cancelled']")
	private WebElement VisitCancelledinAdv;
	
	//Select Cancelled Date in Visit Cancelled tab
	@FindBy(xpath = "//th[text()='Cancelled Date']")
	private WebElement CancelledDateinAdv;
	
	
	
	
	
	
	
	public RevisitPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		//Initialize the current page web elements using FindBy annotation
		PageFactory.initElements(driver, this);
	}
	
	
	
	//verify UHID field
	public void verifyUHIDfield() throws InterruptedException 
	{
		Thread.sleep(2000);
		String actualmsg = UHID.getText();
		String expectedmsg = "UHID No.";
		System.out.println("Actual is = "+actualmsg);
		System.out.println("Expected is = "+expectedmsg);
		Assert.assertEquals(expectedmsg, actualmsg);
		
	}
	
	//Set patient
	public void setUHIDno(String UHID) throws InterruptedException 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(UHIDno)).sendKeys(UHID);
		Thread.sleep(2000);
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(UHIDno)).sendKeys(Keys.ARROW_DOWN, Keys.RETURN);
				
	}
	
	//Click on Clear button
	public void clickclear() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(clear)).click();
		
	}
	
	//Click on Save Button
	public void clickSave() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Save)).click();
		
	}
	
	//Click patient PIC dropdown
	public void ClickPICDropdown() {
		PICDropdown.click();
	} 
	
	//Search and set PIC
	public void SearchPIC(String PIC) {
		UHIDno.sendKeys(PIC, Keys.ENTER);
		
	}
	
    //Select PIC localpatient
	public void SelectLocalpatient() {
		LOCALPATINT.click();
	}
	
	//Select PIC GESY
	public void SelectGesy() {
		GESY.click();
	}
	
	//Physician visit radio button
	public void setPhysicianVisit() {
		Phyvisit.click();
	}
	
	//Click on Physician list dropdown
	public void clickPhyDropdown() {
		PhyDropdown.click();
	}
	
	//search and set physician
	public void setPhysician(String phy) {
		SearchPhy.sendKeys(phy,Keys.ENTER);
	}
	
	//set adamous physician
	public void setAdamosAdamou() {
		AdamosAdamou.click();
	}
	
	//Set nestoras physician
	public void setNestorasMichael() {
		NestorasMichael.click();
	}
	
	//Click on hospital visit radio button
	public void setHospvisit() {
		Hospvisit.click();
	}
	
	//Click on department list dropdown
	public void setHospDropdown() {
		HospDropdown.click();
	}
 	
	//Set Clinical Laboratory department
	public void setClinicalLaboratory() {
		ClinicalLaboratory.click();
	}
	
	//Set Radiology  department
	public void setRadiology() {
		RadiologyDept.click();
	}
	
	//Click on Primary Introducing Source
	public void clickprimaryIntrodropdown() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(primaryIntrodropdown)).click();
		
	}
	
	//Search Primary Intro
	public void setPrimaryIntro(String primaryIntro) {
		SearchPrimaryIntro.sendKeys(primaryIntro,Keys.ENTER);
	}
	
	//Verify Introducing Source
	public void verifyIntroducingSource() 
	{
		String actualmsg = primaryIntrodropdown.getText();
		String expectedmsg = SecondaryIntroSource.getText();
		Assert.assertEquals(expectedmsg, actualmsg);
		
	}
	
	//Click on Insurance Details
	public void clickInsdetails() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Insdetails)).click();
		
	}
	
	//Click on Add Button in Insurance Details
	public void clickAddNewIns() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(AddNewIns)).click();
		
	}
	
	//Verify New Patient Insurance Popup
	public void verifyNewPatInsurance() throws InterruptedException {
		Thread.sleep(2000);
		String actualmsg = NewPatInsurance.getText();
		String expectedmsg = "New Patient Insurance";
		Assert.assertEquals(expectedmsg, actualmsg);
	}
	
	//Click on Insurance Drop down in New Patient Insurance Drop down
	public void clickonInsuranceDD() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(InsuranceDD)).click();
		
	}
	
	
	//Click on AM Studio in Insurance Drop Down in New Patient Insurance Drop Down
	public void clicAMStudioinINSDD() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(AMStudioinINSDD)).click();
		
	}
	
	//Click on Adac Insurance Drop Down in New Patient Insurance Drop Down
	public void clickAdacInsuranceinINSDD() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(AdacInsuranceinINSDD)).click();
		
	}
	
	//Send data to policy holder text field in New Patient Insurance Pop up
	public void setPolicyHolderName(String PolicyName) throws InterruptedException 
	{
		Thread.sleep(2000);
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(PolicyHolderinINSpopup)).sendKeys(PolicyName);
		
	}
	
	//Send data to Policy Number text field in New Patient Insurance Pop up
	public void setPolicyNumber(String PolicyNumber) throws InterruptedException 
	{
		Thread.sleep(2000);
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(PolicyNumberinInsPopup)).sendKeys(PolicyNumber);
	}
	
	//Send data to Group Number text field in New Patient Insurance Pop up
	public void setGroupNum(String GroupNum) throws InterruptedException 
	{
		Thread.sleep(2000);
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(GroupNuminINSpopup)).sendKeys(GroupNum);
		
	}
	
	//Send data to Guarantor Text field in New Patient Insurance Pop up
	public void setGuarantor(String GuarantorNum) throws InterruptedException 
	{
		Thread.sleep(2000);
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(GuarantorinINSpopup)).sendKeys(GuarantorNum);
		
	}
	
	//Click on Relation drop down in New Patient Insurance Pop up
	public void clickRelationDD() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(RelationDDinINSpopup)).click();
		
	}
	
	//Click on Mother in Relation drop down in New Patient Insurance Pop up
	public void selectMother() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(MotherinRelDD)).click();
		
	}
	
	//Click on Father in Relation drop down in New Patient Insurance Pop up
	public void selectFather() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(FatherinRelDD)).click();
		
	}
	
	//Click on Wife in Relation drop down in New Patient Insurance Pop up
	public void selectWife() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(WifeinRelDD)).click();
		
	}
	
	//Click on Covered for Drop down in New Patient Insurance Pop up
	public void clickCoveredfor() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(CoveredforinINSpopup)).click();
		
	}
	
	//Send data to Address1 text field in New Patient Insurance Pop up
	public void setAddress1inINS(String Address1) 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Address1inInspopup)).sendKeys(Address1);
		
	}
	
	//Send Data to Address 2 text field in New Patient Insurance Pop up
	public void setAddress2(String Address2) 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Address2inInspopup)).sendKeys(Address2);
		
	}
	
	// Send data to Phone 1 text field in New Patient Insurance Pop up
	public void setPhone1(String Phone1) 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Phone1inINSpopup)).sendKeys(Phone1);
		
	}
	
	//Send data to remarks text field in New Patient Insurance Pop up
	public void setRemarks(String Remarks) 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(RemarksinINSpopup)).sendKeys(Remarks);
		
	}
	
	//Click ok in New Patient Insurance Pop up
	public void clickOKinINSpoup() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(OKinINSpopup)).click();
		
	}
	
	//Click close in New Patient Insurance Pop up
	public void clickCloseinINSpopup() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(CloseinINSPopup)).click();
		
	}
	
	//Click on Physician radio button
	public void clickPhysicianRB() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(PhysicianRB)).click();
		
	}
	
	//Verify Attending Physician field
	public void verifyAttendingPhsician() 
	{
		String actualmsg = AttendingPhsician.getText();
		String expectedmsg = "Attending Physician";
		Assert.assertEquals(expectedmsg, actualmsg);
	}
	
	//Click on Hospital radio button
	public void clickHospitalRB() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(HospitalRB)).click();
		
	}
	
	//Verify Department field
	public void verifyDepartment() 
	{
		String actualmsg = Department.getText();
		String expectedmsg = "Department";
		Assert.assertEquals(expectedmsg, actualmsg);
	}
		
	//Verify Patient is admitted pop up
	public void verifyPatAdalertpopup() 
	{
		String actualmsg = driver.switchTo().alert().getText();
		String expectedmsg = "Patient is admitted.";
		Assert.assertEquals(actualmsg, expectedmsg);
		
	}
	
	//Verify Patient Demographic link
	public void verifyPatDemolink() 
	{
		String actualmsg = PatDemoLink.getText();
		String expectedmsg = "Miss ALEKSANDRA BALIKTSIS, Female, 39 Years 1 Months 22 Days, Out Patient, Local Residence";
		Assert.assertEquals(actualmsg, expectedmsg);
		
	}
	
	// Click Patient Demographic link
	public void clickPatDemolink() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(PatDemoLink)).click();
		
	}
	
	//Verify UHID in Patient Demographic Link
	
	//Close Patient DemoGraphic link
	public void clickClosePatDemo() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(ClosePatDemo)).click();
		
	}
	
	
	//Click on Advance Search Button
	public void clickAdvBtn() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(AdvSearchBtn)).click();
		
	}
	
	//Verify Advance Search Window
	public void verifyAdvSearchwindow() throws InterruptedException 
	{
		Thread.sleep(2000);
		String actual = AdvSearchwindow.getText();
		String expected = "Advanced Search";
		Assert.assertEquals(actual, expected);
		
	}
	
	
	//Click on First Patient in waiting patient grid
	public void clickFirstPatinWaiting() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(FirstPatientinGrid)).click();
		
	}
	
	//Verify First Patient UHID in Waiting Patient Grid
	public void verifyPatientinWaiting() throws InterruptedException 
	{
		Thread.sleep(2000);
		String actual = FirstPatientinGrid.getText();
		String expected = "MARIA LOIZIDOU";
		System.out.println("Actual msg is = "+actual);
		System.out.println("Expected msg is = "+expected);
		Assert.assertEquals(actual, expected);
		
	}
	 
    //Click OK in Record Saved Successfully pop up
	public void clickokinRecSavpopup() 
	{
		driver.switchTo().alert().accept();
		
	}
	
	//Verify Insurance Name in Insurance Detail Grid
	public void verifyInsNameinInsDetails() throws InterruptedException 
	{
		Thread.sleep(2000);
		String actual = InsuranceNameinGrid.getText();
		String expected = "A.M. STUDIO OZZ LTD (SHARE)";
		Assert.assertEquals(actual, expected);
		
	}
	
	//Click on Cancel button in Advance Search
	public void clickCancelinAdvSearch() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(CancelinAdvSearch)).click();
		
	}
	
	//Click okay Do you want to Cancel the Visit ? pop up
	public void clickokinPopup() 
	{
		driver.switchTo().alert().accept();
		
	}
	
	//Click OK in Visit Sucessfully Cancelled Pop up
	public void ClickOKinSucessfulpoup() 
	{
		driver.switchTo().alert().accept();
		
	}
	
	//Click Filter Drop down in Advance search 
	public void clickFilterinAdvSearch() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(FilterinAdvSearch)).click();
		
	}
	
	//Click Today in Filter drop down in Advance Search
	public void clickTodayinFilter() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(TodayinFilter)).click();
	}
	
	//Click Last One Week in filter drop down in Advance Search
	public void clickLOWinFilter() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(LOWinFilter)).click();
		
	}
	
	//Click Last One Month in Filter drop down in Advance Search
	public void clickLOMinFilter() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(LOMinFilter)).click();
	}
	
	//Click on Last Three Month in Filter Drop down in Advance Search
	public void clickLTMinFilter() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(LTMinFilter)).click();
		
	}
	
	//Click on Waiting Patient tab in Advance Search window
	public void clickWaitingPatientinAdv() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(WaitingPatientinAdv)).click();
		
	}
	
	//Verify Waiting patient tab in Advance Search window
	public void verifyWaitingPatTab() throws InterruptedException {
		
		Thread.sleep(2000);
		String actual = VisitIDinAdv.getText();
		String expected = "Visit ID";
		Assert.assertEquals(actual, expected);
			
	}
	
	//Click on Seen Patient tab in Advance Search window
	public void clickSeenPatientinAdv() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(SeenPatientinAdv)).click();
		
	}
	
	//Verify Seen Patient tab in Advance Search window
	public void verifySeenPatientinAdv() throws InterruptedException 
	{
		Thread.sleep(2000);
		String actual = LastVisitDateinAdv.getText();
		String expected = "Last Visit Date";
		Assert.assertEquals(actual, expected);
	}
	
	//Click on Visit Cancelled tab in Advance Search window
	public void clickVisitCancelledinAdv() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(VisitCancelledinAdv)).click();
		
	}
	
	//Verify Visit Cancelled tab in Advance Search window
	public void verifyVisitCancelledinAdv() throws InterruptedException 
	{
		Thread.sleep(2000);
		String actual = CancelledDateinAdv.getText();
		String expected = "Cancelled Date";
		Assert.assertEquals(actual, expected);
		
	}
		
}
