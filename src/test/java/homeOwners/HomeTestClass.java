package homeOwners;

import org.testng.annotations.Test;

import base.BaseClass;

public class HomeTestClass extends BaseClass {

	@Test(enabled = false)
	public void homeTest(){
		homePage.homepageHomeSteps("Homeowners", "11418");
		homeStartQuote3.HomeQuoteSteps();


	}
	
	@Test(enabled = true)
	public void homeTestPlus() throws InterruptedException{
		homePage.homepageHomeSteps("Homeowners", "11418");
		homePlusAuto4.HomePlusAutoSteps();
		Thread.sleep(10000);

	}

}