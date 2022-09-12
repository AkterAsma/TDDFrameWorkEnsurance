package object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;import com.github.dockerjava.api.model.Driver;

import commonAction.Commons;

public class HomePlusAuto4 {
	
	Commons commons;
	
	public HomePlusAuto4(WebDriver driver , Commons commons) {
		PageFactory.initElements(driver, this);
		this.commons = commons;
	}
	@FindBy(xpath = "//span[@class='fancy-checkbox__circle' and contains(.,'auto')]")
	WebElement autoElement;
	@FindBy(xpath = "//button[@id='btnStart']")
	WebElement startMyQuot;	
	
	private void clickAuto() {
		commons.click(autoElement);
	}
	
	private void clickQuote() {
		commons.click(startMyQuot);
	}
	
	public void HomePlusAutoSteps() throws InterruptedException {
		Thread.sleep(5000);
		clickAuto();
		Thread.sleep(5000);
		clickQuote();
	}

}
