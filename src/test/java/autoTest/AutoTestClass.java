package autoTest;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import base.BaseClass;
import object.HomePage1;

public class AutoTestClass extends BaseClass{
	@Test(enabled = true)
	public void test() throws InterruptedException {
		homePage.homepageAutoSteps("Auto","11418");
		Thread.sleep(5000);
		aboutMe.aboutMeSteps("Rachel", "Galler", "Green", "01/01/2000", "1454 43rd street");
		Thread.sleep(5000);
	}

}