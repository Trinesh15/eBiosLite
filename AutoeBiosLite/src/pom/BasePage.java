package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
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

	WebDriver driver;

	public BasePage(WebDriver driver) {
		this.driver = driver;
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
