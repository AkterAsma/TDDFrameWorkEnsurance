package homeOwners;

import org.testng.annotations.Test;

import base.BaseClass;

public class HomeTestClass extends BaseClass{
	
	@Test
	public void  homeTest() throws InterruptedException {
		homePage.homepageHomeSteps("Homeowners", "11418");
		Thread.sleep(10000);
		homeStartQuote3.HomeQuoteSteps();
		Thread.sleep(15000);

		
	}

}
