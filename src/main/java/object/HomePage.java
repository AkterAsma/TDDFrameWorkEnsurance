package object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonAction.CommonMethods;

public class HomePage {
	
	CommonMethods commonMethods;
	public HomePage(WebDriver driver, CommonMethods commonMethods) {
		PageFactory.initElements(driver, this);
		this.commonMethods = commonMethods;
	}
	@FindBy(id = "txtZipCode")
	WebElement zip;
	
	public void getQuote(CommonMethods common ) {
		common.sendKeysEnter(zip, "11219");
		//common.sendKeys(zip, "11219");
		}

}

//line 12,23 in nasir vais's homepage??'1:03