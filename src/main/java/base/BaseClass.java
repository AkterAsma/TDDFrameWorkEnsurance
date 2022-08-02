package base;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import commonAction.Commons;
import io.github.bonigarcia.wdm.WebDriverManager;
import object.AboutMe2;
import object.HomePage1;
import object.HomeStartQuote3;
import utils.Configaration;

public class BaseClass {
	public Configaration configaration = new Configaration(null);
	WebDriver driver;

	protected Commons commons;
	protected HomePage1 homePage;
	protected AboutMe2 aboutMe;
	protected HomeStartQuote3 homeStartQuote3;
	
	
	@BeforeMethod
	public void setUP() {
		driver = localDriver("chrome");
		driver.manage().window().maximize();
		driver.get(configaration.getConfigaration("url"));
		driver.manage().timeouts().pageLoadTimeout(
				Duration.ofSeconds(Integer.parseInt(configaration.getConfigaration("pageLoadTimeOut"))));
		driver.manage().timeouts()
				.implicitlyWait(Duration.ofSeconds(Integer.parseInt(configaration.getConfigaration("implicitlywait"))));
		initClasses();

	}

	private WebDriver localDriver(String browsername) {
		if (browsername.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browsername.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else if (browsername.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browsername.equalsIgnoreCase("safari")) {
			WebDriverManager.safaridriver().setup();
			driver = new SafariDriver();

		}
		return driver;
}
	
	private void initClasses() {
		commons = new Commons();
		homePage = new HomePage1(driver, commons);
		aboutMe = new AboutMe2(driver, commons);
		homeStartQuote3 = new HomeStartQuote3(driver, commons);
		
	}

	protected WebDriver getDriver() {
		return driver;

	}

	@AfterMethod
	public void terminate() {
		driver.quit();
	}
}