package com.giobertox.test.automation.sample.tests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.giobertox.test.automation.sample.pages.DashboardPage;
import com.giobertox.test.automation.sample.pages.LoginPage;
import com.giobertox.test.automation.sample.utils.Driver;

public class LoginTests {

	@BeforeClass(alwaysRun = true)
	public void setUp() {
		Driver.getInstance();
	}

	@AfterClass(alwaysRun = true)
	public void tearDown() {
		Driver.instance.quit();
	}

	@BeforeMethod(alwaysRun = true)
	public void openHomePage() {
		LoginPage.goTo();
	}

	@Test
	public void testWrongPasswordCantLogin() {
		LoginPage.loginAs("username").withPassword("password").login();
		Assert.assertTrue(!DashboardPage.isLoaded(), "Dashboard reached when it should have not.");
		Assert.assertTrue(LoginPage.hasErrorMessage(), "Login error message was expected but not found.");
		Assert.assertEquals(LoginPage.getErrorMessage(), ("Incorrect login."), "Error message expected not displayed.");
	}

	@Test
	public void testGoodPasswordCanLogin() {
		LoginPage.loginAs("username").withPassword("password").login();
		Assert.assertTrue(DashboardPage.isLoaded(), "Dashboard reached when it should have not.");
	}

}
