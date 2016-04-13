package com.giobertox.test.automation.sample.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.giobertox.test.automation.sample.pages.DashboardPage;
import com.giobertox.test.automation.sample.pages.LoginPage;

public class LoginTests extends BasicTest{



	@Test
	public void testWrongPasswordCantLogin() {
		LoginPage.goTo();
		LoginPage.loginAs("username").withPassword("password").login();
		Assert.assertTrue(!DashboardPage.isLoaded(), "Dashboard reached when it should have not.");
		Assert.assertTrue(LoginPage.hasErrorMessage(), "Login error message was expected but not found.");
		Assert.assertEquals(LoginPage.getErrorMessage(), ("Incorrect login."), "Error message expected not displayed.");
	}

	@Test
	public void testGoodPasswordCanLogin() {
		LoginPage.goTo();
		LoginPage.loginAs("username").withPassword("password").login();
		Assert.assertFalse(DashboardPage.isLoaded(), "Dashboard reached when it should have not.");
	}

}
