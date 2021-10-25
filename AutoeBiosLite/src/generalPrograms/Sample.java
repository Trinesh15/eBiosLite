package generalPrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sample {
	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.get("http://localhost:8085/eBiosLite/(S())/eBiosFiles/CommonForms/frmLogin.aspx");
//		driver.findElement(By.id("inputUser")).sendKeys("bios");
//		driver.findElement(By.id("inputPassword")).sendKeys("satclt");
//		driver.findElement(By.id("btnLogIn")).click();
//		driver.findElement(By.xpath("//i[@class='fa fa-bars']")).click();
//		driver.findElement(By.xpath("//a[text()='Registration']")).click();
////		//System.out.println(driver.findElement(By.id("cpBody_txtHospIdNo"))
////		JavascriptExecutor js = (JavascriptExecutor)driver;
////		Object a = js.executeScript("document.getElementById('cpBody_txtHospIdNo').value");
////		System.out.println(a.toString());
////		System.out.println(driver.findElement(By.id("cpBody_txtHospIdNo")).getAttribute("value"));
//		String url = driver.getCurrentUrl();
//		driver.get(url);
//		driver.findElement(By.id("inputUser")).sendKeys("bios");
//		driver.findElement(By.id("inputPassword")).sendKeys("satclt");
//		driver.findElement(By.id("btnLogIn")).click();
		
		String s= "45.00 ()";
		String[] ary = s.split(" ");
		for(String s1: ary) {
			System.out.println(s1);
			System.out.println();
		}
		
	}
}
