package com.giobertox.test.automation.sample.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.giobertox.test.automation.sample.navigation.TopMenu;
import com.giobertox.test.automation.sample.pages.HeaderPage;


public class HorizontalNavigationTest extends BasicTestAbstract {

	@Test
	public void testJobsMenuItemWorks() {
		TopMenu.goToJobs();
		Assert.assertEquals(HeaderPage.getTitle().getText(), "Jobs",
				"The header title does not match the selected menu item");   
	}

	@Test
	public void testSolutionMenuItemWorks() {
		TopMenu.goToSolutions();
		Assert.assertEquals(HeaderPage.getTitle().getText(), "Solutions",
				"The header title does not match the selected menu item");   
	}

	@Test
	public void testClientMenuItemWorks(){
		TopMenu.goToClients();
		Assert.assertEquals(HeaderPage.getTitle().getText(), "Clients",
				"The header title does not match the selected menu item");
	}

	@Test
	public void testNeoMenuItemWorks(){
		TopMenu.goToNeo();
		Assert.assertTrue(
				HeaderPage.getTitle().getText().contains(
						"NEO is a secure data sharing platform consisting of a portal, MIS and reporting system"),
				"The header title does not match the selected menu item");
	}

	@Test
	public void testSerivesMenuItemWoks(){
		TopMenu.goToServices();
		Assert.assertEquals(HeaderPage.getTitle().getText(), "Services",
				"The header title does not match the selected menu item");
	}

	@Test
	public void testNewsMenuItemWorks(){
		TopMenu.goToNews();
		Assert.assertEquals(HeaderPage.getTitle().getText(), "News & Events",
				"The header title does not match the selected menu item");
	}

	@Test
	public void testAboutUsMenuItemWorks(){
		TopMenu.goToAboutUs();
		Assert.assertEquals(HeaderPage.getTitle().getText(), "About us",
				"The header title does not match the selected menu item");
	}

	@Test
	public void testContactMenuItemWorks(){
		TopMenu.goToContact();
		Assert.assertEquals(HeaderPage.getTitle().getText(), "Contact",
				"The header title does not match the selected menu item");
	}

}
