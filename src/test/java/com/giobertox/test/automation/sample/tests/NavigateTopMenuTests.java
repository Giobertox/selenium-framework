package com.giobertox.test.automation.sample.tests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.giobertox.test.automation.sample.pages.HeaderPage;
import com.giobertox.test.automation.sample.pages.TopMenu;
import com.giobertox.test.automation.sample.utils.Driver;

public class NavigateTopMenuTests {

	private static final String HTTP_WWW_MEGANEXUS_COM =
			"http://www.meganexus.com/";

	@BeforeClass(alwaysRun = true)
	public void setUp() {
		Driver.getInstance();
	}

	@AfterClass(alwaysRun = true)
	public void tearDown() {
		Driver.instance.quit();
	}

	@BeforeMethod(alwaysRun = true)
	public void beforeEveryMethod() {
		Driver.instance.navigate().to(HTTP_WWW_MEGANEXUS_COM);
	}

	@Test
	public void testAllMenuItemsWork() {
		TopMenu.goToSolutions();
		Assert.assertEquals(HeaderPage.getTitle().getText(), "Solutions",
				"The header title does not match the selected menu item");
		TopMenu.goToClients();
		Assert.assertEquals(HeaderPage.getTitle().getText(), "Clients",
				"The header title does not match the selected menu item");
		// TopMenu.goToNeo();
		// Assert.assertEquals(HeaderPage.getTitle().getText(),
		// "NEO/nNEO is a secure data sharing platform consisting of a portal,
		// MIS and reporting system",
		// "The header title does not match the selected menu item");
		TopMenu.goToServices();
		Assert.assertEquals(HeaderPage.getTitle().getText(), "Services",
				"The header title does not match the selected menu item");
		TopMenu.goToNews();
		Assert.assertEquals(HeaderPage.getTitle().getText(), "News & Events",
				"The header title does not match the selected menu item");
		TopMenu.goToAboutUs();
		Assert.assertEquals(HeaderPage.getTitle().getText(), "About us",
				"The header title does not match the selected menu item");
		TopMenu.goToContact();
		Assert.assertEquals(HeaderPage.getTitle().getText(), "Contact",
				"The header title does not match the selected menu item");

	}

}