package com.giobertox.test.automation.sample.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.giobertox.test.automation.sample.navigation.SectorPageNavi;
import com.giobertox.test.automation.sample.pages.HeaderPage;
import com.giobertox.test.automation.sample.pages.NeoPage;
import com.giobertox.test.automation.sample.pages.TopMenu;

public class NeoTest extends BasicTestAbstract {

	@Test
	public void testNeoLoads() {
		NeoPage.load();
		Assert.assertEquals(HeaderPage.getTitle().getText(), "NEO\nNEO is a secure data sharing platform consisting "
				+ "of a portal, MIS and reporting system",
				"The header title does not match the selected menu item");
	}
	
	@Test
	public void testNeoParaTitle() {
		NeoPage.load();
		Assert.assertEquals(NeoPage.getParagraphTitle(), "Why NEO?",
				"The paragrpah title does not match the title specified");
	}
	
	@Test
	public void testNeoParagraph() {
		NeoPage.load();
		Assert.assertEquals(NeoPage.getParagraph(), NeoPage.PARAGRAPH,
				"The paragrpah does not match the one specified");
	}
	
	// TEST SECTORS FROM EOPAGE
	@Test
	public void testHealthcareNavigationWorks() {
		TopMenu.Neo.select();
		SectorPageNavi.goToHealthcare();
		Assert.assertEquals(HeaderPage.getTitle().getText(), "Healthcare",
				"The header title does not match the selected item");
	}

	@Test
	public void testEducationNavigationWorks() {
		TopMenu.Neo.select();
		SectorPageNavi.goToEducation();
		Assert.assertEquals(HeaderPage.getTitle().getText(), "Education",
				"The header title does not match the selected item"); 	
	}
	
	@Test
	public void testEmploymentNavigationWorks() {
		TopMenu.Neo.select();
		SectorPageNavi.goToEmployment();
		Assert.assertEquals(HeaderPage.getTitle().getText(), "Employment",
				"The header title does not match the selected item");
	}

	@Test
	public void testJusticeNavigationWorks() {
		TopMenu.Neo.select();
		SectorPageNavi.goToJustice();
		Assert.assertEquals(HeaderPage.getTitle().getText(), "Justice\nReducing Re-Offending and Improving Rehabilitation",
				"The header title does not match the selected item");
	}

	@Test
	public void testCommunityNavigationWorks() {
		TopMenu.Neo.select();
		SectorPageNavi.goToCommunity();
		Assert.assertEquals(HeaderPage.getTitle().getText(), "Community",
				"The header title does not match the selected item");
	}
	
	
	
	
}
