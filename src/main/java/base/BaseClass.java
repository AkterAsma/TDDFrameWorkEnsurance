package base;

import java.security.PublicKey;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import commonAction.CommonMethods;
import configPackage.Config;
import io.github.bonigarcia.wdm.WebDriverManager;
import object.AddVehicle;
import object.HomePage;


public class BaseClass {
	public static WebDriver driver;
	public HomePage home;
	public AddVehicle vehicle;
	public CommonMethods common;
	
	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(Config.getObject().getUrl());
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Integer.parseInt(Config.getObject().getImplicitlywait())));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Integer.parseInt(Config.getObject().getPageLoadTimeOut())));
		initiatingClases();
	}
	
	public void initiatingClases() {
		home = new HomePage(driver);
		common = new CommonMethods();
		vehicle=new AddVehicle();
	}
	@AfterMethod
	public void closingBrowser() {
		driver.quit();
		
	}

}
