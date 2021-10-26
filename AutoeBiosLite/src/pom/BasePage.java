package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class BasePage {

	// Menu bar
	@FindBy(id = "sidebarCollapse")
	private WebElement Menu;

	// Home in Menu
	@FindBy(xpath = "//a[.='Home ']")
	private WebElement Home;

	// Appointment in Menu
	@FindBy(xpath = "//a[.='Appointments']")
	private WebElement Appointments;

	// Billing in Menu
	@FindBy(xpath = "//a[.='Billing']")
	private WebElement Billing;

	// Chargesheet in Menu
	@FindBy(xpath = "//a[.='Chargesheet']")
	private WebElement Chargesheet;

	// Debit Invoice in Menu
	@FindBy(xpath = "//a[.='Debit Invoice']")
	private WebElement DebitInvoice;

	// Edit NHS Claim in Menu
	@FindBy(xpath = "//a[.='Edit NHS Claim']")
	private WebElement EditNHSClaim;

	// Laboratory Results in Menu
	@FindBy(xpath = "//a[.='Laboratory Results']")
	private WebElement LaboratoryResults;

	// Revisit in Menu
	@FindBy(xpath = "//a[.='Re-Visit']")
	private WebElement Revisit;

	// Receipts in Menu
	@FindBy(xpath = "//a[.='Receipts']")
	private WebElement Receipts;

	// Registration in menu
	@FindBy(xpath = "//a[.='Registration']")
	private WebElement Registration;

	// Statement of Account in menu
	@FindBy(xpath = "//a[.='Statement of Account']")
	private WebElement StatementofAccount;

	WebDriver driver;

	public BasePage(WebDriver driver) {

		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	// Navigate to Home
	public void NaviagetToHome() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Menu)).click();
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Home)).click();
	}

	// Navigate to Appointments
	public void NaviagetToAppointments() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Menu)).click();
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Appointments)).click();
	}

	// Navigate to Billing
	public void NaviagetToBilling() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Menu)).click();
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Billing)).click();
	}

	// Navigate to Chargesheet
	public void NaviagetToChargesheet() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Menu)).click();
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Chargesheet)).click();
	}

	// Navigate to Debit Invoice
	public void NaviagetToDebitInvoice() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Menu)).click();
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(DebitInvoice)).click();
	}

	// Navigate to EditNHSClaim
	public void NaviagetToEditNHSClaim() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Menu)).click();
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(EditNHSClaim)).click();
	}

	// Navigate to Laboratory
	public void NaviagetToLaboratory() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Menu)).click();
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(LaboratoryResults)).click();
	}

	// Navigate to Revisit
	public void NaviagetToRevisit() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Menu)).click();
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Revisit)).click();
	}

	// Navigate to Receipts
	public void NaviagetToReceipts() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Menu)).click();
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Receipts)).click();
	}

	// Navigate to Registration
	public void NaviagetToRegistration() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Menu)).click();
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Registration)).click();
	}

	// Navigate to Statement of account
	public void NaviagetToStatementofAccount() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Menu)).click();
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(StatementofAccount)).click();
	}

	public void verifyTitle(String eTitle) {
		WebDriverWait wait = new WebDriverWait(driver, 010);

		try {
			wait.until(ExpectedConditions.titleContains(eTitle));
			Reporter.log("Title is matching : PASS", true);
		} catch (Exception e) {
			Reporter.log("Title is not  matching : PASS", true);
			Assert.fail();
		}
	}
}
