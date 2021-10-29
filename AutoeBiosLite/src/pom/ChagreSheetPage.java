package pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ChagreSheetPage extends BasePage
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
	

	
	
	
	public ChagreSheetPage(WebDriver driver) 
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
	
	//Click Service Slider
	public void clickServiceSlider() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(ServiceSlider)).click();
		
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
	
	//Click on IndentPartially Completed
	public void clickIndentPartiallyCompleted() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(IndentPartially)).click();
		
	}
	
	//Click on Indent Product Pending
	public void clickIndentProductPending() 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(IndentProduct)).click();
		
	}
}
