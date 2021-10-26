package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest implements AutoConst {
	public WebDriver driver;
	
	//open the browser in chrome
	@BeforeMethod
	public void openChrome() {
		System.setProperty(CHROME_KEY,CHROME_VALUE);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://192.168.1.13:8085/eBiosLite/(S())/eBiosFiles/CommonForms/frmLogin.aspx");
	}
	
//	//open the browser in Firefox
//	@BeforeMethod
//	public void openFirefox() {
//		System.setProperty(GECKO_KEY,GECKO_VALUE);
//		driver = new FirefoxDriver(); //Upcasting
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.get("http://192.168.1.18:8081/ebioslite/(S())/eBiosFiles/CommonForms/frmLogin.aspx");
//	}
	
//	//Close the current browser
//	@AfterMethod
//	public void closeApp() {
//		driver.close();
//		
//	}
	

	

	
	public void scrollpage(String element) {
		int x =driver.findElement(By.xpath(element)).getLocation().getX();
		int y = driver.findElement(By.xpath(element)).getLocation().getY();
		JavascriptExecutor js = (JavascriptExecutor) driver; //Type casting
		js.executeScript("window.scrollBy(" + x + ", " + y + ");");    }
	
	
}
