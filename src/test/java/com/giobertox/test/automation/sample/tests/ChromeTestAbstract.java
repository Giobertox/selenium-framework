package com.giobertox.test.automation.sample.tests;

import org.openqa.selenium.WebDriver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.giobertox.test.automation.sample.selenium.DriverC;

public abstract class ChromeTestAbstract {
	
	public WebDriver driver;

	@BeforeClass(alwaysRun = true)
	public void setUp() {
		driver = DriverC.getInstance();

	}
	
	@BeforeMethod(alwaysRun = true)
	public void beforeMethod() {
		driver.get("http://www.meganexus.com");
	}
	
	
	@AfterClass(alwaysRun = true)
	public void tearDown() {
		driver.quit();
		// Browser.close();
	}



}
