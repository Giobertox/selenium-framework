package com.giobertox.test.automation.sample.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.giobertox.test.automation.sample.navigation.TopMenu;
import com.giobertox.test.automation.sample.pages.HeaderPage;

public class NavigateTopMenuTest extends BasicTestAbstract {


	@Test
	public void testSolutionsNavigationWorks() {
		TopMenu.goToSolutions();
		Assert.assertEquals(HeaderPage.getTitle().getText(), "Solutions",
				"The header title does not match the selected menu item");
	}
	
	@Test
	public void testClientNavigationWorks() {
		TopMenu.goToClients();
		Assert.assertEquals(HeaderPage.getTitle().getText(), "Clients",
				"The header title does not match the selected menu item");
	}
	
	@Test
	public void testServicesNavigationWorks() {
		TopMenu.goToServices();
		Assert.assertEquals(HeaderPage.getTitle().getText(), "Services",
				"The header title does not match the selected menu item");
	}
	
	@Test
	public void testNewsNavigationWorks() {
		TopMenu.goToNews();
		Assert.assertEquals(HeaderPage.getTitle().getText(), "News & Events",
				"The header title does not match the selected menu item");
	}
	
	@Test
	public void testAboutUsNavigationWorks() {
		TopMenu.goToAboutUs();
		Assert.assertEquals(HeaderPage.getTitle().getText(), "About us",
				"The header title does not match the selected menu item");
	}
	
	@Test
	public void testContactNavigationWorks() {
		TopMenu.goToContact();
		Assert.assertEquals(HeaderPage.getTitle().getText(), "Contact",
				"The header title does not match the selected menu item");
	}
	
	@Test
	public void testNeoNavigationWorks() {	
		 TopMenu.goToNeo();
		 Assert.assertEquals(HeaderPage.getTitle().getText(),
		 "NEO\nNEO is a secure data sharing platform consisting of a portal, "
		 + "MIS and reporting system",
		 "The header title does not match the selected menu item");	
	}
	
	@Test
	public void testJobsNavigationWorks() {
		TopMenu.goToJobs();
		Assert.assertEquals(HeaderPage.getTitle().getText(), "Jobs",
				"The header title does not match the selected menu item");
	}
	
	

}
