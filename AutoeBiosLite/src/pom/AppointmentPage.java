package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
	private WebElement DropdownMent;

	// Current date in Calendar
	@FindBy(xpath = "//a[@class='ui-state-default ui-state-highlight ui-state-active']")
	private WebElement TodayinCal;

	// Selected date in the calendar
	@FindBy(xpath = "//table//a[@class='ui-state-default ui-state-active']")
	private WebElement SelectedDate;

	// Selected month days from 1 to 31 / 1 to 28 / 1 to 30 - need user inputs. -
	// input range must be between month days.
	@FindBy(xpath = "//table//a[@class='ui-state-default']")
	private List<WebElement> MonthDays;

	// previous month in the calendar
	@FindBy(xpath = "(//span[.='Prev'])[1]")
	private WebElement PrevsInCal;

	// Next month in the calendar
	@FindBy(xpath = "(//span[.='Next'])[1]")
	private WebElement NextInCal;

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
	
	//Appointment booking slots
	@FindBy()

	public AppointmentPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

}
