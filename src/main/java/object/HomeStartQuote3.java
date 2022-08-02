package object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonAction.Commons;

public class HomeStartQuote3 {
	
	Commons commons;
	
	public HomeStartQuote3(WebDriver driver , Commons commons) {
		PageFactory.initElements(driver, this);
		this.commons = commons;
		}
	
	@FindBy(xpath = "//button[@id='btnStart']")
	WebElement startMyQuot;
	

	private void clickQuote() {
		commons.click(startMyQuot);
	}
	
	public void HomeQuoteSteps() {
		clickQuote();
	}
}
