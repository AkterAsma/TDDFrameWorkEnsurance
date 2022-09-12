package object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import commonAction.Commons;

public class HomePage1 {
	
	Commons commons;
	public HomePage1(WebDriver driver, Commons commons) {
		PageFactory.initElements(driver, this);
		this.commons = commons;
	}
	
	@FindBy(xpath = "//select[@id='ProductList']")
	WebElement dropDown;
	@FindBy(xpath = "//select[@id='ProductList']")
	WebElement dropDown2;
	@FindBy(id = "txtZipCode")
	WebElement zip;
	@FindBy(xpath = "//button[@id='btnGoZip']")
	WebElement getAQuote;
	
	private void autoInsurance(String value1) {
		commons.dropDown(dropDown, value1);
	}
	
	private void homeOwners(String value1) {
		commons.dropDown(dropDown, value1);
	}
	
	
	
	private void inputZipCode(String value2) {
		commons.sendKeys(zip, value2);
		}
	
	private void clickAuto() {
		commons.click(getAQuote);
	}
	
	private void clickHome() {
		commons.click(getAQuote);
	}
	
	public void homepageAutoSteps(String value1,String value2) {
		autoInsurance(value1);
		inputZipCode(value2);
		clickAuto();
		}
	
	public void homepageHomeSteps(String value1,String value2) {
		homeOwners(value1);
		inputZipCode(value2);
		clickHome();
		commons.sleep();

		
		
	}
}//