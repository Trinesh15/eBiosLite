package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class UserProfileOption extends BasePage {

	// Logged in user
	@FindBy(id = "divUsername")
	private WebElement UserName;

	// View profile
	@FindBy(id = "aProfile")
	private WebElement MyProfile;

	// View profile
	@FindBy(id = "aMyReport")
	private WebElement MyReport;

	// adminn view
	@FindBy(id = "aAdmin")
	private WebElement AdminView;

	// logout button
	@FindBy(id = "btnlog")
	private WebElement Logout;

	public UserProfileOption(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	// Click on User name
	public void ClickOnUserName() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(UserName)).click();
	}

	// Click on myProfile
	public void ClickOnMyProfile() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(MyProfile)).click();
	}

	// Click on myProfile
	public void ClickOnMyReport() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(MyReport)).click();
	}

	// Click on Admin view
	public void ClickOnAdminView() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(AdminView)).click();
	}

	// Click on logout
	public void ClickLogout() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(Logout)).click();
	}

	public void VerifyLoginUserName(String un) {
		String ActualUserName = un;
		String ExpectedUserName = UserName.getText();
		
		//Assert.assertEquals(ExpectedUserName, ActualUserName);
	}

}
