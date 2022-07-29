package commonAction;

import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import reporting.Loggers;

public class CommonMethods {

	public void sendKeys(WebElement element, String value) {
		try {
			element.sendKeys(value);

			Loggers.getLog(value + " : value pass into --->" + element);

		} catch (NullPointerException | NoSuchElementException e) {
			e.printStackTrace();
			Loggers.getLog(element + " : This element not Found");
			Assert.fail();
		}

	}

	public void sendKeysEnter(WebElement element, String value) {
		element.sendKeys(value, Keys.ENTER);

	}
	
	

	public void sleep() {
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}