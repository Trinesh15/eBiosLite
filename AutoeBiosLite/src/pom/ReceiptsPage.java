package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReceiptsPage 
{
	//Patient Button
	@FindBy(xpath = "//a[text()='Patient']")
	private WebElement Patient;
	
	//Insurance Button
	@FindBy(xpath = "//a[text()='Insurance']")
	private WebElement Insurance;
	
	//UHID field
	@FindBy(xpath = "//input[@id='cpBody_txtUHID']")
	private WebElement UHID;
	
	//Search Button
	@FindBy(xpath = "//button[@title='Advanced Search']")
	private WebElement SearchButton;
	
	//Outstanding Radio Button
	@FindBy(xpath = "//input[@id='rdOSND']")
	private WebElement Outstanding;

}
