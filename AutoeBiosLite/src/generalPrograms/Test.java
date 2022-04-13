package generalPrograms;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test 
{
	public static void  main() {
		
	

	 String KEY = "webdriver.gecko.driver";
	 String VALUE = "./driver/geckodriver.exe";
	 System.setProperty(KEY, VALUE);
	 WebDriver driver = new FirefoxDriver();
	 driver.getCurrentUrl();
	 
	}


}