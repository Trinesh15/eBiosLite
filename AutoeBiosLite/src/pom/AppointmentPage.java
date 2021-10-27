package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AppointmentPage extends BasePage {

	// Resource Appointment switch
	@FindBy(xpath = "//a[@id='cpBody_btnResource']")
	private WebElement ResourceAppmnt;

	// Consultant Appointment switch
	@FindBy(xpath = "//a[@id='cpBody_btnConsultant']")
	private WebElement ConsultantAppmnt;

	// Available appointment
	@FindBy(xpath = "//a[@id='cpBody_btnAvailApp']")
	private WebElement AvailableAppmnt;

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
	private WebElement searchPhy_1;

	// Physician Search text box 2
	@FindBy(xpath = "//input[@id='cpBody_txtSrchHrPhyRes2']")
	private WebElement searchPhy_2;

	// Physician Search text box 3
	@FindBy(xpath = "//input[@id='cpBody_txtSrchHrPhyRes3']")
	private WebElement searchPhy_3;

	// Resource Search text box 1
	@FindBy(xpath = "//input[@id='cpBody_txtSrchHrRes1']")
	private WebElement searchResource_1;

	// Resource Search text box 2
	@FindBy(xpath = "//input[@id='cpBody_txtSrchHrRes2']")
	private WebElement searchResource_2;

	// Resource Search text box 3
	@FindBy(xpath = "//input[@id='cpBody_txtSrchHrRes3']")
	private WebElement searchResource_3;

	// Appointment booking slots
	// 34th index means 8:00 slot
	// 35th index means 8:15 slot .... etc
	// 42th index means 10:00 slot
	// 43th index means 10:15 slot
	@FindBy(xpath = "//div[@id='divAppView4']//table//th[@class='fc-agenda-axis fc-widget-header']")
	private List<WebElement> First_AppBookSlot;

	// Appointment booking slots
	@FindBy(xpath = "//div[@id='appHorDiv3']//table//th[@class='fc-agenda-axis fc-widget-header']")
	private List<WebElement> Second_AppBookSlot;

	// Appointment booking slots
	@FindBy(xpath = "//div[@id='appHorDiv4']//table//th[@class='fc-agenda-axis fc-widget-header']")
	private List<WebElement> Third_AppBookSlot;

	public AppointmentPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	// Click on Resource appointment icon
	public void clickResourceAppointment() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(ResourceAppmnt)).click();
	}

	// Click on Resource appointment icon
	public void clickConsultantAppointment() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(ConsultantAppmnt)).click();
	}

	// Click on Available appointment icon
	public void clickAvailableAppointment() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(AvailableAppmnt)).click();
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

	// Select month from months drop down
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

}
