package pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import generic.BaseTest;

public class AppointmentPage extends BasePage {

	// Resource Appointment switch
	@FindBy(xpath = "//a[@id='cpBody_btnResource']")
	private WebElement swtichToResource;

	// Consultant Appointment switch
	@FindBy(xpath = "//a[@id='cpBody_btnConsultant']")
	private WebElement swtichToConsultant;

	// Available appointment
	@FindBy(xpath = "//a[@id='cpBody_btnAvailApp']")
	private WebElement AvailableAppmnt;

	// consultant or resource which user is booking
	@FindBy(xpath = "//h5[@id='cpBody_usrAppAvailable_H1']")
	private WebElement BookingFor;

	// search physician in Available Appointment
	@FindBy(id = "cpBody_usrAppAvailable_txtAppAvailPhy")
	private WebElement AvailApp_Physearch;

	// search physician in Available Appointment
	@FindBy(id = "cpBody_usrAppAvailable_txtAppAvailRes")
	private WebElement AvailApp_Ressearch;

	// All Availabel slot radio button
	@FindBy(id = "cpBody_usrAppAvailable_rdAppAvAll")
	private WebElement AllAvailSltRadiobtn;

	// Morning Available slot radio button
	@FindBy(id = "cpBody_usrAppAvailable_rdAppAvMor")
	private WebElement MorAvailSltRadiobtn;

	// Afternoon Available slot radio button
	@FindBy(id = "cpBody_usrAppAvailable_rdAppAvAft")
	private WebElement AftAvailSltRadiobtn;

	// Evening Available slot radio button
	@FindBy(id = "cpBody_usrAppAvailable_rdAppAvEve")
	private WebElement EveAvailSltRadiobtn;

	// Duration list
	@FindBy(xpath = "//div[@id='drpAppDuration_chosen']")
	private WebElement Durationdropdown;

	// Duration list - 15min , 30min , 45min , 1Hr , All
	@FindBy(xpath = "//div[@id='drpAppDuration_chosen']//li")
	private List<WebElement> DurationList;

	// go to slot link
	@FindBy(xpath = "//button[@class='btn btn-sm btn-outline-info']")
	private List<WebElement> GotoSlot;

	// Next 5 available appointment
	@FindBy(id = "btnNext5AvAp")
	private WebElement nxt5Apps;

	// Refresh appointment
	@FindBy(xpath = "//a[@id='cpBody_btnRefresh']")
	private WebElement RefreshAppmnt;

	// Menu with list of appointment report , waiting patient , search appointment ,
	// Change view to horizontal or vertical
	@FindBy(xpath = "//a[@id='navbarDropdownMenuLink']")
	private WebElement DropdownMenu;

	// Selected month days from 1 to 31 / 1 to 28 / 1 to 30 - need user inputs. -
	// index '0' for date 1st in month
	// month last day - may be '30' for 31st date ,
	// '27' for 28th date
	// index always starts from 0 in List of web element
	// input range must be between month days.
	@FindBy(xpath = "//table[@class='ui-datepicker-calendar']//tbody//td[@data-handler='selectDay']")
	private List<WebElement> MonthDays;

	// previous month in the calendar
	@FindBy(xpath = "(//span[.='Prev'])[1]")
	private WebElement PrevsMntInCal;

	// Next month in the calendar
	@FindBy(xpath = "(//span[.='Next'])[1]")
	private WebElement NextMntInCal;

	// Next month in the calendar
	@FindBy(xpath = "(//select[@class='ui-datepicker-month chzn-select'])[1]")
	private WebElement MonthsInCal;

	// Next month in the calendar
	@FindBy(xpath = "(//select[@class='ui-datepicker-year'])[1]")
	private WebElement YearssInCal;

	// Today button in calendar
	@FindBy(xpath = "//button[text()='Today']")
	private WebElement TodayInCal;

	// set default check box 1
	@FindBy(xpath = "//input[@id='chkhVR4']")
	private WebElement setDefault_1;

	// set default check box 2
	@FindBy(xpath = "//input[@id='chkhVR5']")
	private WebElement setDefault_2;

	// set default check box 3
	@FindBy(xpath = "//input[@id='chkhVR6']")
	private WebElement setDefault_3;

	// Physician Search text box 1
	@FindBy(xpath = "//input[@id='cpBody_txtSrchHrPhyRes1']")
	private WebElement searchPhy_slot1;

	// Physician Search text box 2
	@FindBy(xpath = "//input[@id='cpBody_txtSrchHrPhyRes2']")
	private WebElement searchPhy_slot2;

	// Physician Search text box 3
	@FindBy(xpath = "//input[@id='cpBody_txtSrchHrPhyRes3']")
	private WebElement searchPhy_slot3;

	// Resource Search text box 1
	@FindBy(xpath = "//input[@id='cpBody_txtSrchHrRes1']")
	private WebElement searchResource_slot1;

	// Resource Search text box 2
	@FindBy(xpath = "//input[@id='cpBody_txtSrchHrRes2']")
	private WebElement searchResource_slot2;

	// Resource Search text box 3
	@FindBy(xpath = "//input[@id='cpBody_txtSrchHrRes3']")
	private WebElement searchResource_slot3;

	// Selected Physician / Resource in Slots 1
	@FindBy(id = "btnDivide4")
	private WebElement selectedPhyRes_slt1;

	// Selected Physician / Resource in Slots 2
	@FindBy(id = "btnDivide5")
	private WebElement selectedPhyRes_slt2;

	// Selected Physician / Resource in Slots 2
	@FindBy(id = "btnDivide6")
	private WebElement selectedPhyRes_slt3;

	// Appointment booking slots
	// 34th index means 8:00 slot
	// 35th index means 8:15 slot .... etc
	// 42th index means 10:00 slot
	// 43th index means 10:15 slot
	@FindBy(xpath = "//div[@id='divAppView4']//table//th[@class='fc-agenda-axis fc-widget-header']")
	private List<WebElement> First_AppBookSlots;

	// Appointment booking slots
	@FindBy(xpath = "//div[@id='appHorDiv3']//table//th[@class='fc-agenda-axis fc-widget-header']")
	private List<WebElement> Second_AppBookSlots;

	// Appointment booking slots
	@FindBy(xpath = "//div[@id='appHorDiv4']//table//th[@class='fc-agenda-axis fc-widget-header']")
	private List<WebElement> Third_AppBookSlots;

	// Appointment booking pop up element

	// Registered patient radio button
	@FindBy(id = "cpBody_usrAppAvailable_usrOTBooking_rdRegstrd")
	private WebElement RegPatRedioBtn;

	// Registered patient radio button
	@FindBy(id = "cpBody_usrAppAvailable_usrOTBooking_rdNonRegstrd")
	private WebElement NonRegPatRedioBtn;

	// UHID field on Booking Appointment pop up
	@FindBy(id = "cpBody_usrAppAvailable_usrOTBooking_txtAppUhid")
	private WebElement UHIDNo;

	// Title drop down of Non Reg patient
	@FindBy(id = "cpBody_usrAppAvailable_usrOTBooking_cmbAppPTitle_chosen")
	private WebElement titleDropdown;

	// List of Titles
	@FindBy(xpath = "//div[@id='cpBody_usrAppAvailable_usrOTBooking_cmbAppPTitle_chosen']//li")
	private List<WebElement> titles;

	// First name of Non Reg patient
	@FindBy(id = "cpBody_usrAppAvailable_usrOTBooking_txtAppPFname")
	private WebElement Fname;

	// Last name of Non Reg patient
	@FindBy(id = "cpBody_usrAppAvailable_usrOTBooking_txtAppPLname")
	private WebElement Lname;

	// ID ARC No. of Non Reg patient
	@FindBy(id = "cpBody_usrAppAvailable_usrOTBooking_txtAppPassportNo")
	private WebElement IdArcNo;

	// ID ARC No. of Non Reg patient
	@FindBy(id = "cpBody_usrAppAvailable_usrOTBooking_txtAppIntId")
	private WebElement IntID_PassportId;

	// DOB of Non Reg patient
	@FindBy(id = "cpBody_usrAppAvailable_usrOTBooking_dtpAppPDOB")
	private WebElement DOB;

	// Contact number of Non Reg patient
	@FindBy(id = "cpBody_usrAppAvailable_usrOTBooking_txtAppPPhone")
	private WebElement ContactNo;

	// Email field of Non Reg Patient
	@FindBy(id = "cpBody_usrAppAvailable_usrOTBooking_txtAppPEmail")
	private WebElement eMail;

	// city drop down of Non Reg Patient
	@FindBy(id = "cpBody_usrAppAvailable_usrOTBooking_cmbAppPCity_chosen")
	private WebElement CityDropdown;

	// search City
	@FindBy(xpath = "//div[@id='cpBody_usrAppAvailable_usrOTBooking_cmbAppPCity_chosen']//input")
	private WebElement searchCity;

	// search City
	@FindBy(xpath = "//div[@id='cpBody_usrAppAvailable_usrOTBooking_cmbAppPCity_chosen']//li")
	private List<WebElement> ListOfCity;

	// Reason list drop down
	@FindBy(id = "cpBody_usrAppAvailable_usrOTBooking_cmbAppReason_chosen")
	private WebElement ReasonListdropdown;

	// Search text box in reason list
	@FindBy(xpath = "//div[@id='cpBody_usrAppAvailable_usrOTBooking_cmbAppReason_chosen']//input")
	private WebElement searchReasons;

	// list of Reason
	@FindBy(xpath = "//div[@id='cpBody_usrAppAvailable_usrOTBooking_cmbAppReason_chosen']//li")
	private List<WebElement> ListOfReasons;

	// set default of Reasons
	@FindBy(id = "chkhOTVR3")
	private WebElement setdef_Reason;

	// selected Reason
	@FindBy(xpath = "//div[@id='cpBody_usrAppAvailable_usrOTBooking_cmbAppReason_chosen']//span")
	private WebElement selectedReason;

	// Resource list dropdown
	@FindBy(id = "cpBody_usrAppAvailable_usrOTBooking_cmbAppResource_chosen")
	private WebElement ResourceListdropdown;

	// search resource from the resource list
	@FindBy(xpath = "//div[@id='cpBody_usrAppAvailable_usrOTBooking_cmbAppResource_chosen']//input")
	private WebElement searchResource;

	// List of Resource
	@FindBy(xpath = "//div[@id='cpBody_usrAppAvailable_usrOTBooking_cmbAppResource_chosen']//li")
	private List<WebElement> ListOfResource;

	// set default of Resource
	@FindBy(id = "chkhOTVR2")
	private WebElement setdef_Resource;

	// selected Reason
	@FindBy(xpath = "//div[@id='cpBody_usrAppAvailable_usrOTBooking_cmbAppResource_chosen']//span")
	private WebElement selectedResource;

	// Instruction text field
	@FindBy(id = "cpBody_usrAppAvailable_usrOTBooking_txtAppInstruction")
	private WebElement InstructionTxtBox;

	// Length field
	@FindBy(id = "cpBody_usrAppAvailable_usrOTBooking_points1")
	private WebElement length;

	// Remarks field
	@FindBy(id = "cpBody_usrAppAvailable_usrOTBooking_txtAppRemarks")
	private WebElement Remarks;

	// Save button in Appointment booking pop up
	@FindBy(id = "cpBody_usrAppAvailable_btnAppointmentSave1")
	private WebElement SaveApp;

	// Register and save button
	@FindBy(id = "cpBody_usrAppAvailable_btnRegisterAndAppointmentSave1")
	private WebElement RegSaveApp;

	// Appointment slip
	@FindBy(xpath = "//h4[text()='Appointment Slip']")
	private WebElement AppSlip;

	// close button
	@FindBy(xpath = "//div[@id='divUsrOTBooking']//button[@class='btn btn-sm btn-secondary']")
	private WebElement CloseApp;

	// Clear the appointment booing screen
	@FindBy(id = "btnclrAppdet")
	private WebElement ClearApp;

	// Quick Registration
	@FindBy(id = "cpBody_btnAddRegister")
	private WebElement quickRegistration;

	// Detailed Registration
	@FindBy(id = "cpBody_btnFullReg")
	private WebElement DetailedRegistration;

	// Edit Registration
	@FindBy(id = "cpBody_btnEditReg")
	private WebElement editRegistration;

	// Revisit option
	@FindBy(id = "cpBody_btnPatRevisit")
	private WebElement Revisit;

	// Bill option
	@FindBy(id = "cpBody_btnGotoBill")
	private WebElement Billing;

	// print Appointment slip
	@FindBy(id = "cpBody_btnPrintApp")
	private WebElement printAppSlip;

	// Move Appointment - Reschedule
	@FindBy(id = "cpBody_btnMoveApp")
	private WebElement MoveAppointment;

	// cancel appointment
	@FindBy(id = "cpBody_btnCancelApp")
	private WebElement cancelApp;

	// close appointment slip print pop up
	@FindBy(xpath = "//div[@id='myModal']//button[@class='close']")
	private WebElement closeAppPrint;

	// List of Appointments in the Reschedule grid on Non Reg patient Appointment
	// page
	@FindBy(xpath = "//table[@id='tbPatientLinkResd1']//td[2]")
	private WebElement LstOfbookedApps_Reschdl;

	// List of Appointments in the Reschedule grid on Non Reg patient Appointment
	// page
	@FindBy(xpath = "//table[@id='tbPatientLinkResd1']//td[1]")
	private WebElement LstOfbookedApps_ReschdlBtn;

	// ----------------------------------------------------
	// List of Registered patient appointments in First Appointment booking
	@FindBy(xpath = "//div[@id='divAppView4']//div[@class='fc-event-inner-outpatient']")
	private List<WebElement> LstOfOutRegPatApps_slot1;

	// List of non Registered patient appointments in First Appointment booking slot
	// 1
	@FindBy(xpath = "//div[@id='divAppView4']//div[@class='fc-event-inner-NRpatient']")
	private List<WebElement> LstOfNonRegPatApps_slot1;

	// seen patients in appointment slot 1
	@FindBy(xpath = "//div[@id='divAppView4']//div[@class='fc-event-inner-Seen']")
	private List<WebElement> LstOfSeenPatApps_slot1;

	// Re-visited patients appointment in slot 1
	@FindBy(xpath = "//div[@id='divAppView4']//div[@class='fc-event-inner-Revisited']")
	private List<WebElement> LstOfvisitedPatApps_slot1;

	// List of in patients appointments in slot 1
	@FindBy(xpath = "//div[@id='divAppView4']//div[@class='fc-event-inner-inpatient']")
	private List<WebElement> LstOfInPatApps_slot1;

	// List of in patients appointments in slot 1
	@FindBy(xpath = "//div[@id='divAppView4']//div[@class='fc-event-inner-Invoiced']")
	private List<WebElement> LstOfInvoicedPatApps_slot1;

	// ----------------------------------------------------

	// List of Registered patient appointments in second Appointment booking slot 2
	@FindBy(xpath = "//div[@id='appHorDiv3']//div[@class='fc-event-inner-outpatient']")
	private List<WebElement> LstOfRegPatApps_slot2;

	// List of non Registered patient appointments in second Appointment booking
	// slot 2
	@FindBy(xpath = "//div[@id='appHorDiv3']//div[@class='fc-event-inner-NRpatient']")
	private List<WebElement> LstOfNonRegPatApps_slot2;

	// seen patients in appointment slot 1
	@FindBy(xpath = "//div[@id='appHorDiv3']//div[@class='fc-event-inner-Seen']")
	private List<WebElement> LstOfSeenPatApps_slot2;

	// Re-visited patients appointment in slot 1
	@FindBy(xpath = "//div[@id='appHorDiv3']//div[@class='fc-event-inner-Revisited']")
	private List<WebElement> LstOfvisitedPatApps_slot2;

	// List of in patients appointments in slot 1
	@FindBy(xpath = "//div[@id='appHorDiv3']//div[@class='fc-event-inner-inpatient']")
	private List<WebElement> LstOfInPatApps_slot2;

	// List of in patients appointments in slot 1
	@FindBy(xpath = "//div[@id='appHorDiv3']//div[@class='fc-event-inner-Invoiced']")
	private List<WebElement> LstOfInvoicedPatApps_slot2;

	// ----------------------------------------------------

	// List of non Registered patient appointments in Third Appointment booking slot
	// 3
	@FindBy(xpath = "//div[@id='appHorDiv4']//div[@class='fc-event-inner-outpatient']")
	private List<WebElement> LstOfRegPatApps_slot3;

	// List of non Registered patient appointments in Third Appointment booking slot
	// 3
	@FindBy(xpath = "//div[@id='appHorDiv4']//div[@class='fc-event-inner-NRpatient']")
	private List<WebElement> LstOfNonRegPatApps_slot3;

	// seen patients in appointment slot 1
	@FindBy(xpath = "//div[@id='appHorDiv4']//div[@class='fc-event-inner-Seen']")
	private List<WebElement> LstOfSeenPatApps_slot3;

	// Re-visited patients appointment in slot 1
	@FindBy(xpath = "//div[@id='appHorDiv4']//div[@class='fc-event-inner-Revisited']")
	private List<WebElement> LstOfvisitedPatApps_slot3;

	// List of in patients appointments in slot 1
	@FindBy(xpath = "//div[@id='appHorDiv4']//div[@class='fc-event-inner-inpatient']")
	private List<WebElement> LstOfInPatApps_slot3;

	// List of in patients appointments in slot 1
	@FindBy(xpath = "//div[@id='appHorDiv4']//div[@class='fc-event-inner-Invoiced']")
	private List<WebElement> LstOfInvoicedPatApps_slot3;

	// Initialize the web element
	public AppointmentPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	// Click on Resource appointment icon
	public void SwtcToResourceAppt() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(swtichToResource)).click();
	}

	// Click on Resource appointment icon
	public void SwtcToConsultantAppt() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(swtichToConsultant)).click();
	}

	// Click on Available appointment icon
	public void clickAvailableAppointment() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(AvailableAppmnt)).click();
	}

	// search for physician in Available Appointment
	public void searchPhyInAvailApps(String Phy) {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(AvailApp_Physearch)).sendKeys(Phy,
				Keys.ARROW_DOWN, Keys.ENTER);
	}

	// search for physician in Available Appointment
	public void searchResurceInAvailApps(String Res) {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(AvailApp_Ressearch)).sendKeys(Res,
				Keys.ARROW_DOWN, Keys.ENTER);
	}

	// Select All slot radio button on Available Appointment pop up
	public void selectAllRadInAvailApps() {
		AllAvailSltRadiobtn.click();
	}

	// Select Morning slot radio button on Available Appointment pop up
	public void selectMorRadInAvailApps() {
		MorAvailSltRadiobtn.click();
	}

	// Select Afternoon slot radio button on Available Appointment pop up
	public void selectAftRadInAvailApps() {
		AftAvailSltRadiobtn.click();
	}

	// Select Evening slot radio button on Available Appointment pop up
	public void selectEveRadInAvailApps() {
		EveAvailSltRadiobtn.click();
	}

	// Click on duration drop down
	public void clickOnDuration() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Durationdropdown)).click();
	}

	// Click on duration drop down - select by value passed
	// pass values like - All , 15 min , 30 min , 45 min , 1 Hour
	public void SelectDurationFrmLstByVal(String timeDur) {
		for (WebElement dl : DurationList) {
			if (dl.getText().contains(timeDur)) {
				dl.click();
			}
		}
	}

	// Click on duration drop down - select by value passed - 0 means All slots ,
	// 1 means 15 min slots , 2 means 30 min slots , 3 means 45 min , 4 means 1 hour
	public void SelectDurationFrmLstbyindx(int i) {
		DurationList.get(i).click();
	}

	// Click on available Slots by index - 0 , 1 , 2 , 3 , 4
	public void clickonAvailSlotsonAvailAppsPopup(int indx) {
		GotoSlot.get(indx).click();
	}

	// Click on Next 5 available Appointments button
	public void clickOnNxt5AvailSlot() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(nxt5Apps)).click();
	}

	// Click on Refresh icon
	public void clickRefreshAppmnt() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(RefreshAppmnt)).click();
	}

	// Click on Drop down menu icon
	public void clickDropdownMenu() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(DropdownMenu)).click();
	}

	// Click on Today's date in calendar
	public void clickOndateInCalendar(int dateIndex) {
		MonthDays.get(dateIndex - 1).click();

	}

	// Click on previous month option
	public void clickPreviousMonthOpt() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(PrevsMntInCal)).click();
	}

	// Click on previous month option
	public void clickNextMonthOpt() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(NextMntInCal)).click();
	}

	// Select month from months drop down - jan , feb , mar , Apr .. to Dec
	public void selectMonth(String month) {
		Select slt = new Select(MonthsInCal);
		slt.selectByVisibleText(month);
	}

	// Select Year from Year drop down
	public void selectYear(String years) {
		Select slt = new Select(YearssInCal);
		slt.selectByVisibleText(years);
	}

	// Click on Today button in calendar
	public void clickOnToday() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(TodayInCal)).click();

	}

	// search physician , add to the screen , and set default
	public void searchAndSetPhysicianAtSlot_1(String Phy) throws InterruptedException {
		searchPhy_slot1.sendKeys(Phy);
		Thread.sleep(2000);
		searchPhy_slot1.sendKeys(Keys.ARROW_DOWN, Keys.RETURN);
		Thread.sleep(5000);
		setDefault_1.click();
	}

	// search physician , add to the screen , and set default
	public void searchAndSetPhysicianAtSlot_2(String Phy) throws InterruptedException {
		searchPhy_slot2.sendKeys(Phy);
		Thread.sleep(2000);
		searchPhy_slot2.sendKeys(Keys.ARROW_DOWN, Keys.RETURN);
		Thread.sleep(5000);
		setDefault_2.click();
	}

	// search physician , add to the screen , and set default
	public void searchAndSetPhysicianAtSlot_3(String Phy) throws InterruptedException {
		searchPhy_slot3.sendKeys(Phy);
		Thread.sleep(2000);
		searchPhy_slot3.sendKeys(Keys.ARROW_DOWN, Keys.RETURN);
		Thread.sleep(5000);
		setDefault_3.click();
	}

	// Verify appointment booked for
	public void VerifyAppBookedFor(String BkFor) {
		String bkf = BookingFor.getText();
		if (bkf.toLowerCase().contains(BkFor.toLowerCase())) {
			System.out.println("Matching : Appointment booked for = " + BkFor);
		}
	}

	// search Resource , add to the screen , and set default
	public void searchAndSetResourceAtSlot_1(String Resource) throws InterruptedException {
		searchResource_slot1.sendKeys(Resource);
		Thread.sleep(2000);
		searchResource_slot1.sendKeys(Keys.ARROW_DOWN, Keys.RETURN);
		Thread.sleep(5000);
		setDefault_1.click();
	}

	// search Resource , add to the screen , and set default
	public void searchAndSetResourceAtSlot_2(String Resource) throws InterruptedException {
		searchResource_slot2.sendKeys(Resource);
		Thread.sleep(2000);
		searchResource_slot2.sendKeys(Keys.ARROW_DOWN, Keys.RETURN);
		Thread.sleep(5000);
		setDefault_2.click();
	}

	// search Resource , add to the screen , and set default
	public void searchAndSetResourceAtSlot_3(String Resource) throws InterruptedException {
		searchResource_slot3.sendKeys(Resource);
		Thread.sleep(2000);
		searchResource_slot3.sendKeys(Keys.ARROW_DOWN, Keys.RETURN);
		Thread.sleep(5000);
		setDefault_3.click();
	}

	// Scroll the page
	public void scrollpage(WebElement element) {
		int x = element.getLocation().getX();
		int y = element.getLocation().getY();
		JavascriptExecutor js = (JavascriptExecutor) driver; // Type casting
		js.executeScript("window.scrollBy(" + x + ", " + y + ");");
	}

	public void doubleTapSlotin_1st(double time) {
		Actions act = new Actions(driver);

		// index 34 is 8:00-o clock slot and scrolls to slot and double tap on the slot.
		if (time >= 8.00 || time <= 8.14) {
			WebElement slt = First_AppBookSlots.get(34);
			scrollpage(slt);
			act.doubleClick(slt).perform();

		} else if (time >= 8.15 || time <= 8.29) { // index 35 is 8:00-o clock slot and scrolls to slot and double tap
													// on the slot.
			WebElement slt = First_AppBookSlots.get(35);
			scrollpage(slt);
			act.doubleClick(slt).perform();

		} else if (time >= 8.30 || time <= 8.44) {
			WebElement slt = First_AppBookSlots.get(36);
			scrollpage(slt);
			act.doubleClick(slt).perform();

		} else if (time >= 8.45 || time <= 8.59) {
			WebElement slt = First_AppBookSlots.get(37);
			scrollpage(slt);
			act.doubleClick(slt).perform();

		} else if (time >= 9.00 || time <= 9.14) {
			WebElement slt = First_AppBookSlots.get(38);
			scrollpage(slt);
			act.doubleClick(slt).perform();

		} else if (time >= 9.15 || time <= 9.29) {
			WebElement slt = First_AppBookSlots.get(39);
			scrollpage(slt);
			act.doubleClick(slt).perform();

		} else if (time >= 9.30 || time <= 9.44) {
			WebElement slt = First_AppBookSlots.get(40);
			scrollpage(slt);
			act.doubleClick(slt).perform();

		} else if (time >= 9.45 || time <= 9.59) {
			WebElement slt = First_AppBookSlots.get(41);
			scrollpage(slt);
			act.doubleClick(slt).perform();

		} else if (time >= 10.00 || time <= 10.14) {
			WebElement slt = First_AppBookSlots.get(42);
			scrollpage(slt);
			act.doubleClick(slt).perform();

		} else if (time >= 10.15 || time <= 10.29) {
			WebElement slt = First_AppBookSlots.get(43);
			scrollpage(slt);
			act.doubleClick(slt).perform();

		} else if (time >= 10.30 || time <= 10.44) {
			WebElement slt = First_AppBookSlots.get(44);
			scrollpage(slt);
			act.doubleClick(slt).perform();

		} else if (time >= 10.45 || time <= 10.59) {
			WebElement slt = First_AppBookSlots.get(45);
			scrollpage(slt);
			act.doubleClick(slt).perform();

		}
	}

	// second slot
	public void doubleTapSlotin_2nd(double time) {
		Actions act = new Actions(driver);

		// index 34 is 8:00-o clock slot and scrolls to slot and double tap on the slot.
		if (time >= 8.00 || time <= 8.14) {
			WebElement slt = Second_AppBookSlots.get(34);
			scrollpage(slt);
			act.doubleClick(slt).perform();

		} else if (time >= 8.15 || time <= 8.29) { // index 35 is 8:00-o clock slot and scrolls to slot and double tap
													// on the slot.
			WebElement slt = Second_AppBookSlots.get(35);
			scrollpage(slt);
			act.doubleClick(slt).perform();

		} else if (time >= 8.30 || time <= 8.44) {
			WebElement slt = Second_AppBookSlots.get(36);
			scrollpage(slt);
			act.doubleClick(slt).perform();

		} else if (time >= 8.45 || time <= 8.59) {
			WebElement slt = Second_AppBookSlots.get(37);
			scrollpage(slt);
			act.doubleClick(slt).perform();

		} else if (time >= 9.00 || time <= 9.14) {
			WebElement slt = Second_AppBookSlots.get(38);
			scrollpage(slt);
			act.doubleClick(slt).perform();

		} else if (time >= 9.15 || time <= 9.29) {
			WebElement slt = Second_AppBookSlots.get(39);
			scrollpage(slt);
			act.doubleClick(slt).perform();

		} else if (time >= 9.30 || time <= 9.44) {
			WebElement slt = Second_AppBookSlots.get(40);
			scrollpage(slt);
			act.doubleClick(slt).perform();

		} else if (time >= 9.45 || time <= 9.59) {
			WebElement slt = Second_AppBookSlots.get(41);
			scrollpage(slt);
			act.doubleClick(slt).perform();

		} else if (time >= 10.00 || time <= 10.14) {
			WebElement slt = Second_AppBookSlots.get(42);
			scrollpage(slt);
			act.doubleClick(slt).perform();

		} else if (time >= 10.15 || time <= 10.29) {
			WebElement slt = Second_AppBookSlots.get(43);
			scrollpage(slt);
			act.doubleClick(slt).perform();

		} else if (time >= 10.30 || time <= 10.44) {
			WebElement slt = Second_AppBookSlots.get(44);
			scrollpage(slt);
			act.doubleClick(slt).perform();

		} else if (time >= 10.45 || time <= 10.59) {
			WebElement slt = Second_AppBookSlots.get(45);
			scrollpage(slt);
			act.doubleClick(slt).perform();

		}
	}

	// second slot
	public void doubleTapSlotin_3rd(double time) {
		Actions act = new Actions(driver);

		// index 34 is 8:00-o clock slot and scrolls to slot and double tap on the slot.
		if (time >= 8.00 || time <= 8.14) {
			WebElement slt = Third_AppBookSlots.get(34);
			scrollpage(slt);
			act.doubleClick(slt).perform();

		} else if (time >= 8.15 || time <= 8.29) { // index 35 is 8:00-o clock slot and scrolls to slot and double tap
													// on the slot.
			WebElement slt = Third_AppBookSlots.get(35);
			scrollpage(slt);
			act.doubleClick(slt).perform();

		} else if (time >= 8.30 || time <= 8.44) {
			WebElement slt = Third_AppBookSlots.get(36);
			scrollpage(slt);
			act.doubleClick(slt).perform();

		} else if (time >= 8.45 || time <= 8.59) {
			WebElement slt = Third_AppBookSlots.get(37);
			scrollpage(slt);
			act.doubleClick(slt).perform();

		} else if (time >= 9.00 || time <= 9.14) {
			WebElement slt = Third_AppBookSlots.get(38);
			scrollpage(slt);
			act.doubleClick(slt).perform();

		} else if (time >= 9.15 || time <= 9.29) {
			WebElement slt = Third_AppBookSlots.get(39);
			scrollpage(slt);
			act.doubleClick(slt).perform();

		} else if (time >= 9.30 || time <= 9.44) {
			WebElement slt = Third_AppBookSlots.get(40);
			scrollpage(slt);
			act.doubleClick(slt).perform();

		} else if (time >= 9.45 || time <= 9.59) {
			WebElement slt = Third_AppBookSlots.get(41);
			scrollpage(slt);
			act.doubleClick(slt).perform();

		} else if (time >= 10.00 || time <= 10.14) {
			WebElement slt = Third_AppBookSlots.get(42);
			scrollpage(slt);
			act.doubleClick(slt).perform();

		} else if (time >= 10.15 || time <= 10.29) {
			WebElement slt = Third_AppBookSlots.get(43);
			scrollpage(slt);
			act.doubleClick(slt).perform();

		} else if (time >= 10.30 || time <= 10.44) {
			WebElement slt = Third_AppBookSlots.get(44);
			scrollpage(slt);
			act.doubleClick(slt).perform();

		} else if (time >= 10.45 || time <= 10.59) {
			WebElement slt = Third_AppBookSlots.get(45);
			scrollpage(slt);
			act.doubleClick(slt).perform();

		}
	}

	// Selected Time Slot having Break. Still you wish to Continue? - Yes
	public void contBookingOnBreak() {
		String actualmsg = driver.switchTo().alert().getText();
		String expectedmsg = "Selected Time Slot having Break. Still you wish to Continue?";
		Assert.assertEquals(expectedmsg, actualmsg);
		driver.switchTo().alert().accept();
	}

	// Selected Time Slot having Break. Still you wish to Continue? - Cancel
	public void cancelBookingOnBreak() {
		String actualmsg = driver.switchTo().alert().getText();
		String expectedmsg = "Selected Time Slot having Break. Still you wish to Continue?";
		Assert.assertEquals(expectedmsg, actualmsg);
		driver.switchTo().alert().dismiss();
	}

	// Hospital Working Time slot is not available. Still you wish to Continue? -
	// Yes
	public void contBookingOnHospNonWorkingHr() {
		String actualmsg = driver.switchTo().alert().getText();
		String expectedmsg = "Hospital Working Time slot is not available. Still you wish to Continue?";
		Assert.assertEquals(expectedmsg, actualmsg);
		driver.switchTo().alert().accept();
	}

	// Hospital Working Time slot is not available. Still you wish to Continue? - No
	public void CancelBookingOnHospNonWorkingHr() {
		String actualmsg = driver.switchTo().alert().getText();
		String expectedmsg = "Hospital Working Time slot is not available. Still you wish to Continue?";
		Assert.assertEquals(expectedmsg, actualmsg);
		driver.switchTo().alert().dismiss();

	}

	// Selected Consultant has Break for this time, Do you wish to continue? - Yes
	public void contBookingOnPhyBreak() {
		String actualmsg = driver.switchTo().alert().getText();
		String expectedmsg = "Selected Consultant has Break for this time,  Do you wish to continue?";
		Assert.assertEquals(expectedmsg, actualmsg);
		driver.switchTo().alert().accept();
	}

	// Selected Consultant has Break for this time, Do you wish to continue? - No
	public void CancelBookingOnPhyBreak() {
		String actualmsg = driver.switchTo().alert().getText();
		String expectedmsg = "Selected Consultant has Break for this time,  Do you wish to continue?";
		Assert.assertEquals(expectedmsg, actualmsg);
		driver.switchTo().alert().dismiss();
	}

	// Selected Resource has Appointment for this time, Do you wish to continue? -
	// Yes
	// Yes
	public void contBookOnResrcHaveAppOnThisTime() {
		String actualmsg = driver.switchTo().alert().getText();
		String expectedmsg = "Selected Resource has Appointment for this time,  Do you wish to continue?";
		Assert.assertEquals(expectedmsg, actualmsg);
		driver.switchTo().alert().accept();
	}

	// Selected Resource has Appointment for this time, Do you wish to continue? -
	// Yes
	public void CancelBookOnResrcHaveAppOnThisTime() {
		String actualmsg = driver.switchTo().alert().getText();
		String expectedmsg = "Selected Resource has Appointment for this time,  Do you wish to continue?";
		Assert.assertEquals(expectedmsg, actualmsg);
		driver.switchTo().alert().dismiss();
	}

	// Selected Resource has Break for this time, Do you wish to continue? - Yes
	public void contBookOnResrcBreak() {
		String actualmsg = driver.switchTo().alert().getText();
		String expectedmsg = "Selected Resource has Break for this time,  Do you wish to continue?";
		Assert.assertEquals(expectedmsg, actualmsg);
		driver.switchTo().alert().accept();
	}

	// Selected Resource has Break for this time, Do you wish to continue? - No
	public void CancelBookOnResrcBreak() {
		String actualmsg = driver.switchTo().alert().getText();
		String expectedmsg = "Selected Resource has Break for this time,  Do you wish to continue?";
		Assert.assertEquals(expectedmsg, actualmsg);
		driver.switchTo().alert().dismiss();
	}

	// Do you want to create a visit for this Patient ? - Yes
	public void doRevisitandAccept() {
		String actualmsg = driver.switchTo().alert().getText();
		String expectedmsg = "Do you want to create a visit for this Patient ?";
		Assert.assertEquals(expectedmsg, actualmsg);
		driver.switchTo().alert().accept();
	}

	// Do you want to create a visit for this Patient ? - No
	public void clickOnRevisitanddisMiss() {
		String actualmsg = driver.switchTo().alert().getText();
		String expectedmsg = "Do you want to create a visit for this Patient ?";
		Assert.assertEquals(expectedmsg, actualmsg);
		driver.switchTo().alert().dismiss();
	}

	// Do you want to Cancel the Appointment for the UHID : EVAN000004411 ? Yes
	public void CancelAppforPatientandAccept() {
		boolean result = driver.switchTo().alert().getText()
				.contains("Do you want to Cancel the Appointment for the UHID");
		if (result == true) {
			driver.switchTo().alert().accept();
		}
	}

	// Do you want to Cancel the Appointment for the UHID : EVAN000004411 ? - No
	public void CancelAppforPatientandDismiss() {
		boolean result = driver.switchTo().alert().getText()
				.contains("Do you want to Cancel the Appointment for the UHID");
		if (result == true) {
			driver.switchTo().alert().dismiss();
		}
	}

	// Click on Edit Registration option
	public void clickOnEditReg() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(editRegistration)).click();
	}

	// do Quick Registration
	public void DoQuickRegistration() throws InterruptedException {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(quickRegistration)).click();
		String actualmsg = driver.switchTo().alert().getText();
		String expectedmsg = "Do you want to register this patient ?";
		Assert.assertEquals(expectedmsg, actualmsg);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		String ActSeccessmsg = driver.switchTo().alert().getText();
		String ExpSeccessmsg = "Patient registered successfully !";
		Assert.assertEquals(ExpSeccessmsg, ActSeccessmsg);
		driver.switchTo().alert().accept();

	}

	// Dismiss Quick Registration
	public void DismissQuickRegistration() throws InterruptedException {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(quickRegistration)).click();
		String actualmsg = driver.switchTo().alert().getText();
		String expectedmsg = "Do you want to register this patient ?";
		Assert.assertEquals(expectedmsg, actualmsg);
		driver.switchTo().alert().dismiss();
	}

	// Book Appointment for Registered patient
	public void enterUHID(String UHID) {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(UHIDNo)).sendKeys(UHID, Keys.ENTER);
	}

	// Click on Reason list
	public void clickOnReason() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(ReasonListdropdown)).click();
	}

	// Search for the reason
	public void searchReasons(String reason) {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(searchReasons)).sendKeys(reason,Keys.ENTER);
	}

	// selected the reason for list
	public void selectReasonFrmList(String reason) {
		for (WebElement list : ListOfReasons) {
			String txt = list.getText();
			if (txt.contains(reason)) {
				list.click();
			}
		}
	}

	// set selected reason default
	public void setReasonAsDefault() {
		setdef_Reason.click();
	}

	// Click on Reason list
	public void clickOnResource() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(ResourceListdropdown)).click();
	}

	// Search for the reason
	public void searchResources(String reason) {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(searchResource)).sendKeys(reason,
				Keys.ENTER);
	}

	// selected the reason for list
	public void selectResourceFrmList(String reason) {
		for (WebElement list : ListOfResource) {
			String txt = list.getText();
			if (txt.contains(reason)) {
				list.click();
			}
		}
	}

	// set selected reason default
	public void setResourceAsDefault() {
		setdef_Resource.click();
	}

	// Enter Instruction
	public void EnterInstruction(String instr) {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(InstructionTxtBox)).sendKeys(instr);

	}

	// Enter Length of the Appointment
	public void EnterLength(String time) {
		length.clear();
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(length)).sendKeys(time);
	}

	// Select Title of Non Reg patient
	public void clickAndSelectTitle(String Ptitles) {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(titleDropdown)).click();
		for (WebElement pts : titles) {
			if (pts.getText().contains(Ptitles)) {
				pts.click();
			}
		}
	}

	// Enter First name of Non Reg patient
	public void EnterFirstName(String FN) {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Fname)).sendKeys(FN);

	}

	// Enter First name of Non Reg patient
	public void EnterLastName(String LN) {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Lname)).sendKeys(LN);

	}

	// Enter ID ARC No of the patient
	public void EnterIDARCNo(String IdArc) {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(IdArcNo)).sendKeys(IdArc);
	}

	// Accept duplicate of ID ARC No. from Alert
	public void AcceptIDARCNoDuplicate(String duplicateUHID) {
		String ActuslMsg = driver.switchTo().alert().getText();
		String ExpectedMsg = "ID No./ ARC No.already exist for the UHID : " + duplicateUHID
				+ " Would you like to retain the same number again ?";
		Assert.assertEquals(ExpectedMsg, ActuslMsg);
	}

	// Enter Int No and passport no
	public void EnterIntNopassport(String IntNo) {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(IntID_PassportId)).sendKeys(IntNo);
	}

	// Enter DOB of the Non Reg Patient
	public void EnterDOB(String Bdate) {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(DOB)).sendKeys(Bdate);

	}

	//Enter mail ID
	public void enterEmail(String mailId) {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(eMail)).sendKeys(mailId);
	}
	
	// Click on Reason list
		public void clickOnCityDropdown() {
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(CityDropdown)).click();
		}

		// Search for the reason
		public void searchCity(String city) {
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(searchCity)).sendKeys(city,
					Keys.ENTER);
		}

		// selected the reason for list
		public void selectCityFrmList(String city) {
			for (WebElement list : ListOfCity) {
				String txt = list.getText();
				if (txt.contains(city)) {
					list.click();
				}
			}
		}
	
	// switch to pop up like Billing , Registration , Detailed Registration
	public void switchToPopUp() {
		driver.switchTo().frame("iframe_app");
	}

	// Save Appointment and Verify Slip is displaying.
	public void SaveAppointment() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(SaveApp)).click();
		String ActuslMsg = driver.switchTo().alert().getText();
		String ExpectedMsg = "Appointment Booked successfully. Do you want to print the slip?";
		Assert.assertEquals(ExpectedMsg, ActuslMsg);
		driver.switchTo().alert().accept();
		String ActualAp = AppSlip.getText();
		String excepctedAp = "Appointment Slip";
		Assert.assertEquals(excepctedAp, ActualAp);

	}

	// Save Appointment and Verify Slip is displaying.
	public void RegAndSaveAppointment() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(RegSaveApp)).click();
		String ActuslMsg = driver.switchTo().alert().getText();
		String ExpectedMsg = "Patient Registered and Appointment Booked successfully. Do you want to print the Appointment slip?";
		Assert.assertEquals(ExpectedMsg, ActuslMsg);
		driver.switchTo().alert().accept();
		String ActualAp = AppSlip.getText();
		String excepctedAp = "Appointment Slip";
		Assert.assertEquals(excepctedAp, ActualAp);

	}

	// ------ Appointments at Slot 1

	// List of Registered patient Appointments
	public void VerifyBookedRegPatApp_slot1(String UHID) {
		for (WebElement RegPatApp : LstOfOutRegPatApps_slot1) {
			if (RegPatApp.getAttribute("title").contains(UHID)) {
				System.out.println("Appointment booked Successfully for the patient");
			}

		}
	}

	// List of Non Registered patient Appointments
	public void VerifyBookedNonRegPatApp_slot1(String name) {
		for (WebElement RegPatApp : LstOfNonRegPatApps_slot1) {
			if (RegPatApp.getAttribute("title").contains(name)) {
				System.out.println("Appointment booked Successfully for the patient");
			}

		}
	}

	// List of seen patient Appointments
	public void VerifyBookedSeenPatApp_slot1(String UHID) {
		for (WebElement RegPatApp : LstOfSeenPatApps_slot1) {
			if (RegPatApp.getAttribute("title").contains(UHID)) {
				System.out.println("Patient has been seen by Physician");
			}

		}
	}

	// List of visited patient Appointments
	public void VerifyVisitedPatApp_slot1(String UHID) {
		for (WebElement RegPatApp : LstOfvisitedPatApps_slot1) {
			if (RegPatApp.getAttribute("title").contains(UHID)) {
				System.out.println("Patient has been Visited to the hospital");
			}

		}
	}

	// List of In patient Appointments
	public void VerifyInPatApp_slot1(String UHID) {
		for (WebElement RegPatApp : LstOfInPatApps_slot1) {
			if (RegPatApp.getAttribute("title").contains(UHID)) {
				System.out.println("Appointment booked Successfully for the patient");
			}

		}
	}

	// List of Invoiced patient Appointments
	public void VerifyInvoicedPatApp_slot1(String UHID) {
		for (WebElement RegPatApp : LstOfInvoicedPatApps_slot1) {
			if (RegPatApp.getAttribute("title").contains(UHID)) {
				System.out.println("Patient has been billed");
			}

		}
	}

	// ------ Appointments at Slot 2

	// List of Registered patient Appointments
	public void VerifyBookedRegPatApp_slot2(String UHID) {
		for (WebElement RegPatApp : LstOfRegPatApps_slot2) {
			if (RegPatApp.getAttribute("title").contains(UHID)) {
				System.out.println("Appointment booked Successfully for the patient");
			}

		}
	}

	// List of Non Registered patient Appointments
	public void VerifyBookedNonRegPatApp_slot2(String name) {
		for (WebElement RegPatApp : LstOfNonRegPatApps_slot2) {
			if (RegPatApp.getAttribute("title").contains(name)) {
				System.out.println("Appointment booked Successfully for the patient");
			}

		}
	}

	// List of seen patient Appointments
	public void VerifyBookedSeenPatApp_slot2(String UHID) {
		for (WebElement RegPatApp : LstOfSeenPatApps_slot2) {
			if (RegPatApp.getAttribute("title").contains(UHID)) {
				System.out.println("Patient has been seen by Physician");
			}

		}
	}

	// List of visited patient Appointments
	public void VerifyVisitedPatApp_slot2(String UHID) {
		for (WebElement RegPatApp : LstOfvisitedPatApps_slot2) {
			if (RegPatApp.getAttribute("title").contains(UHID)) {
				System.out.println("Patient has been Visited to the hospital");
			}

		}
	}

	// List of In patient Appointments
	public void VerifyInPatApp_slot2(String UHID) {
		for (WebElement RegPatApp : LstOfInPatApps_slot2) {
			if (RegPatApp.getAttribute("title").contains(UHID)) {
				System.out.println("Appointment booked Successfully for the patient");
			}

		}
	}

	// List of Invoiced patient Appointments
	public void VerifyInvoicedPatApp_slot2(String UHID) {
		for (WebElement RegPatApp : LstOfInvoicedPatApps_slot2) {
			if (RegPatApp.getAttribute("title").contains(UHID)) {
				System.out.println("Patient has been billed");
			}

		}
	}

	// ------ Appointments at Slot 3

	// List of Registered patient Appointments
	public void VerifyBookedRegPatApp_slot3(String UHID) {
		for (WebElement RegPatApp : LstOfRegPatApps_slot3) {
			if (RegPatApp.getAttribute("title").contains(UHID)) {
				System.out.println("Appointment booked Successfully for the patient");
			}

		}
	}

	// List of Non Registered patient Appointments
	public void VerifyBookedNonRegPatApp_slot3(String name) {
		for (WebElement RegPatApp : LstOfNonRegPatApps_slot3) {
			if (RegPatApp.getAttribute("title").contains(name)) {
				System.out.println("Appointment booked Successfully for the patient");
			}

		}
	}

	// List of seen patient Appointments
	public void VerifyBookedSeenPatApp_slot3(String UHID) {
		for (WebElement RegPatApp : LstOfSeenPatApps_slot3) {
			if (RegPatApp.getAttribute("title").contains(UHID)) {
				System.out.println("Patient has been seen by Physician");
			}

		}
	}

	// List of visited patient Appointments
	public void VerifyVisitedPatApp_slot3(String UHID) {
		for (WebElement RegPatApp : LstOfvisitedPatApps_slot3) {
			if (RegPatApp.getAttribute("title").contains(UHID)) {
				System.out.println("Patient has been Visited to the hospital");
			}

		}
	}

	// List of In patient Appointments
	public void VerifyInPatApp_slot3(String UHID) {
		for (WebElement RegPatApp : LstOfInPatApps_slot3) {
			if (RegPatApp.getAttribute("title").contains(UHID)) {
				System.out.println("Appointment booked Successfully for the patient");
			}

		}
	}

	// List of Invoiced patient Appointments
	public void VerifyInvoicedPatApp_slot3(String UHID) {
		for (WebElement RegPatApp : LstOfInvoicedPatApps_slot3) {
			if (RegPatApp.getAttribute("title").contains(UHID)) {
				System.out.println("Patient has been billed");
			}

		}
	}
}
