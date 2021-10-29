package generalPrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import generic.BaseTest;
import generic.Excel;

public class Sample extends BaseTest{
	
	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.get("http://localhost:8085/eBiosLite/(S())/eBiosFiles/CommonForms/frmLogin.aspx");
//		driver.findElement(By.id("inputUser")).sendKeys("bios");
//		driver.findElement(By.id("inputPassword")).sendKeys("satclt");
//		driver.findElement(By.id("btnLogIn")).click();
//		driver.findElement(By.xpath("//i[@class='fa fa-bars']")).click();
//		driver.findElement(By.xpath("//a[text()='Appointments']")).click();	
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("(//div[@id='divAppView4']//div[@class='fc-event-inner-Invoiced'])[1]")).click();
//		driver.findElement(By.id("cpBody_btnGotoBill")).click();
//		driver.switchTo().frame("iframe_app");
//		driver.findElement(By.id("cpBody_txtService")).sendKeys("LAB00840");
//		Actions act = new Actions(driver);
//		act.doubleClick(ele).perform();
//		
//		String time = "10:30";
//		double t = 10.30;
//		time = time.replace(":", ".");
//		double d = Double.parseDouble(time);
//		System.out.println(d);
//		if(t==d) {
//			System.out.println("matching");
//		}
		
		String date = Excel.getCellData(INPUT, "date", 0, 1);
		System.out.println(date);
		
		
		
	}
}
