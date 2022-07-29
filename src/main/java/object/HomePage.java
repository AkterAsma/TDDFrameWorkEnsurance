package object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonAction.CommonMethods;

public class HomePage {
	
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "txtZipCode")
	WebElement zip;
	
	@FindBy(linkText = "//label[text()='First name']")
	WebElement name;
	
	public void getQuote(CommonMethods common ) {
		common.sendKeysEnter(zip, "11219");
		//common.sendKeys(zip, "11219");
		}
	

}




//line 12,23 in nasir vais's homepage??'1:03