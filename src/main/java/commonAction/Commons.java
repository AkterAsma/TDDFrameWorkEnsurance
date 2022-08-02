package commonAction;

import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.fasterxml.jackson.annotation.JacksonInject.Value;

import utils.Loggers;

public class Commons {
	
	
	
	public void dropDown(WebElement element, String value) {
		try {
			Select select = new Select(element);
			select.selectByVisibleText(value);

			Loggers.getLog(value + " : value visible in  --->" + element);

		} catch (NullPointerException | NoSuchElementException e) {
			e.printStackTrace();
			Loggers.getLog(element + " : This element not Found");
			Assert.fail();
		}

	}

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

	public void click (WebElement element) {
		
		try {
			element.click();
			Loggers.getLog(element +"---> This element has been clicked");
		} catch (NullPointerException | NoSuchElementException e) {
			e.printStackTrace();
			Loggers.getLog(element + ": This element Not Found");
			Assert.fail();
		}
	}
	
}