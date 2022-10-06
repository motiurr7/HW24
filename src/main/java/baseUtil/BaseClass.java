package baseUtil;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.HomePage;

public class BaseClass {
	protected WebDriver driver;
	protected HomePage homePage;
	
	@BeforeMethod
	public void setUp() {
	
		//System.setProperty("webdriver.chrome.driver", "/Users/motiur/eclipse-workspace/HomeWork24/driver/chromedriver");
		//System.setProperty("webdriver.chrome.driver","‪‪/src/chromedriver‬‬");
		WebDriverManager.chromedriver().setup();
		//WebDriverManager.chromedriver().driverVersion("106.0.5249.61").setup();
		driver = new ChromeDriver(); 
		driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies();
		//driver.get("https://www.facebook.com/");		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); 
		
		
		driver.get("https://www.amazon.com/");		
		homePage = new HomePage(driver);
	}

	
	
	@AfterMethod
	public void tearUp() {
		driver.quit();
	}
	
}
