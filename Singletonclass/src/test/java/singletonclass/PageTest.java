package singletonclass;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PageTest {

	// Difference btw normal class and singleton class:
	// for regular class we use constructor where for singleton class we use
	// getInstance() method for instance object.

	WebDriver driver;

	@BeforeMethod
	public void setup() {
		DriverInit instancDriver = DriverInit.getInstance();
		driver = instancDriver.openBrowsser();

	}

	@Test
	public void testMethod(){
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
