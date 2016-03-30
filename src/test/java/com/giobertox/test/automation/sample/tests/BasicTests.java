package com.giobertox.test.automation.sample.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.giobertox.test.automation.sample.pages.SolutionsPage;
import com.giobertox.test.automation.sample.utils.Driver;

public class BasicTests {

	@BeforeClass(alwaysRun = true)
	public void setUp() {
		Driver.getInstance();
	}

	@AfterClass(alwaysRun = true)
	public void tearDown() {
		Driver.instance.quit();
	}

	@BeforeMethod(alwaysRun = true)
	public void beforeMethod() {
		SolutionsPage.goTo();
	}

}
