package pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RevisitPage extends BasePage{
	
	//UHID Field
	@FindBy (id = "cpBody_txtHospIdNo")
	private WebElement UHIDno;
	
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
	@FindBy (id= "cpBody_drpRefList_chosen")
	private WebElement primaryIntrodropdown;
	
	@FindBy (xpath = "//div[@id='cpBody_drpRefList_chosen']//input")
	private WebElement SearchPrimaryIntro;
	
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
	
	public RevisitPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		//Initialize the current page web elements using FindBy annotation
		PageFactory.initElements(driver, this);
	}
	
	//Set patient
	public void setUHIDno(String UHID) {
		UHIDno.sendKeys(UHID, Keys.ENTER);
		
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
	
	//Clci on hospital visit radio button
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
	
	//
	public void setPrimaryIntro(String primaryIntro) {
		SearchPrimaryIntro.sendKeys(primaryIntro,Keys.ENTER);
	}
	
	
	
}
