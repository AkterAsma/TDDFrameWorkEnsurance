package object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import commonAction.Commons;

public class AboutMe2 {
	
	Commons commons;
	
	public AboutMe2(WebDriver driver, Commons commons) {
		PageFactory.initElements(driver, this);
		this.commons = commons;
	}
	
	@FindBy(xpath = "//input[@id='ODI1_FirstName']")
	WebElement firstName;
	@FindBy(xpath = "//input[@id='ODI1_MiddleInitial']")
	WebElement middleName;
	@FindBy(xpath = "//input[@id='ODI1_LastName']")
	WebElement lastName;
	@FindBy(xpath = "//input[@id='ODI1_BirthDate']")
	WebElement dob;
	@FindBy(xpath = "//input[@id='ODI1_StreetAddress']")
	WebElement streetAddress;
	@FindBy(xpath = "(//button[text()='Continue'])[1]")
	WebElement continues;
	
	private void enterFirstName(WebElement element, String value1) {
		commons.sendKeys(firstName, value1);
		
	}
	
	private void enterMiddleName(WebElement element, String value2) {
		commons.sendKeys(middleName, value2);
		
	}
	
	private void enterLastName(WebElement element, String value3) {
		commons.sendKeys(lastName, value3);
		
	}
	
	private void enterDOB(WebElement element, String value4) {
		commons.sendKeys(dob, value4);
		
	}
	
	private void enterStreetAddress(WebElement element, String value5) {
		commons.sendKeys(streetAddress, value5);
		
	}
	
	private void clickContinue(WebElement element) {
		commons.click(continues);
		
	}
	
	
	
	public void aboutMeSteps(String value1, String value2,String value3, String value4, String value5) {
		enterFirstName(firstName, value1);
		enterMiddleName(middleName, value2);
		enterLastName(lastName, value3);
		enterDOB(dob, value4);
		enterStreetAddress(streetAddress, value5);
	    clickContinue(continues);
		
	}
	
}