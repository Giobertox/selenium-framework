package com.giobertox.test.automation.sample.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.giobertox.test.automation.sample.components.TopMenu;
import com.giobertox.test.automation.sample.pages.HeaderPage;

public class NavigateTopMenuTests extends BasicTests {

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