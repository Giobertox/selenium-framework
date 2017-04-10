package com.giobertox.test.automation.sample.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.giobertox.test.automation.sample.navigation.SectorPageNavi;
//import com.giobertox.test.automation.sample.pages.AboutUsPage;
import com.giobertox.test.automation.sample.pages.HeaderPage;
import com.giobertox.test.automation.sample.pages.TopMenu;

public class AboutUsSectorsTest extends BasicTestAbstract {


	@Test
	public void testHealthcareNavigationWorks() {
		TopMenu.AboutUs.select();
		SectorPageNavi.goToHealthcare();
		Assert.assertEquals(HeaderPage.getTitle().getText(), "Healthcare",
				"The header title does not match the selected menu item");
	}

	@Test
	public void testEducationNavigationWorks() {
		TopMenu.AboutUs.select();
		SectorPageNavi.goToEducation();
		Assert.assertEquals(HeaderPage.getTitle().getText(), "Education",
				"The header title does not match the selected menu item"); 	
	}
	
	@Test
	public void testEmploymentNavigationWorks() {
		TopMenu.AboutUs.select();
		SectorPageNavi.goToEmployment();
		Assert.assertEquals(HeaderPage.getTitle().getText(), "Employment",
				"The header title does not match the selected menu item");
	}

	@Test
	public void testJusticeNavigationWorks() {
		TopMenu.AboutUs.select();
		SectorPageNavi.goToJustice();
		Assert.assertEquals(HeaderPage.getTitle().getText(), "Justice\nReducing Re-Offending and Improving Rehabilitation",
				"The header title does not match the selected menu item");
	}

	@Test
	public void testCommunityNavigationWorks() {
		TopMenu.AboutUs.select();
		SectorPageNavi.goToCommunity();
		Assert.assertEquals(HeaderPage.getTitle().getText(), "Community",
				"The header title does not match the selected menu item");
	}

}
