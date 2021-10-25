package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import generic.BaseTest;

public class UserProfileSettingsPageorViewProfile extends BasePage {

	// Module name
	@FindBy(id = "ModuleName")
	private WebElement ModuleName;

	// Logged in user name
	@FindBy(id = "cpBody_txtUserName")
	private WebElement LoggedInUserName;

	// Logged in User password
	@FindBy(id = "cpBody_txtPassword")
	private WebElement LoggedInUserPassword;

	// New password of the user
	@FindBy(id = "cpBody_txtNewPassword")
	private WebElement NewPassword;

	// New password of the user
	@FindBy(id = "cpBody_txtVerifyPassword")
	private WebElement ConfirmNewPassword;

	// Save the Updated Password
	@FindBy(id = "btnSave")
	private WebElement UpdatePwd;

	// Billing module in User Preference
	@FindBy(xpath = "//a[@id='tab_164']")
	private WebElement BillingModule;

	// Doctor amount column off and On button
	@FindBy(xpath = "(//div[@id='pills_Billing']//span[@class='slider round'])[1]")
	private WebElement DocAmtColumnSet;

	// Hospital amount column off and On button
	@FindBy(xpath = "(//div[@id='pills_Billing']//span[@class='slider round'])[2]")
	private WebElement HospAmtColumnSet;

	// Hospital discount column off and On button
	@FindBy(xpath = "(//div[@id='pills_Billing']//span[@class='slider round'])[3]")
	private WebElement HospDiscColumnSet;

	// Hospital discount column off and On button
	@FindBy(xpath = "(//div[@id='pills_Billing']//span[@class='slider round'])[4]")
	private WebElement DocDiscColumnSet;

	// Hospital discount column off and On button
	@FindBy(xpath = "(//div[@id='pills_Billing']//span[@class='slider round'])[5]")
	private WebElement DocDiscPersColumnSet;

	// Hospital discount column off and On button
	@FindBy(xpath = "(//div[@id='pills_Billing']//span[@class='slider round'])[6]")
	private WebElement HospDiscPersColumnSet;

	// Initialize the web element
	public UserProfileSettingsPageorViewProfile(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void VerifyPageTitle() {
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "User Profile Settings";
		Assert.assertEquals(ActualTitle, ExpectedTitle);
	}

	// Verify the Logged in user name
	public void VerifyLoggedInUserName(String Username) {
		String ActualUN = LoggedInUserName.getAttribute("Value");
		String ExpectedUN = Username;
		Assert.assertEquals(ExpectedUN, ActualUN);
	}

	// Enter old Password
	public void setOldpassword(String oldPwd) {
		if (LoggedInUserPassword.isDisplayed()) {
			LoggedInUserPassword.sendKeys(oldPwd);
		}
	}

	// Enter New password
	public void setNewpassword(String newPwd) {
		if (NewPassword.isDisplayed()) {
			NewPassword.sendKeys(newPwd);
		}
	}

	// Enter New Password confirmation
	public void ConfirmNewpassword(String newPwd) {
		if (ConfirmNewPassword.isDisplayed()) {
			ConfirmNewPassword.sendKeys(newPwd);
		}
	}

	// Click on Update button
	public void clickUpdateButton() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(UpdatePwd)).click();
	}
	
	
}
