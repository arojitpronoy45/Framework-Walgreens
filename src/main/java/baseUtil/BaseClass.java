package baseUtil;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.HomePage;

public class BaseClass {
	public WebDriver driver;

	public HomePage homePage;

	@BeforeMethod
	public void setUP() {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/driver/geckodriver.exe");
		//WebDriverManager.chromedriver().setup();
		driver = new FirefoxDriver();
		//driver = new EdgeDriver();
		//driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies();
		driver.get("https://www.walgreens.com/login.jsp?ru=%2F");

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		homePage = new HomePage(driver);

	}  

	@AfterMethod
	public void tearUp() {
		driver.quit();
	}

}
