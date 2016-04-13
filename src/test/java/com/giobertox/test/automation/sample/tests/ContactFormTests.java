package com.giobertox.test.automation.sample.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.giobertox.test.automation.sample.pages.ContactPage;
import com.giobertox.test.automation.sample.pages.HomePage;
import com.giobertox.test.automation.sample.pages.TopMenu;

public class ContactFormTests extends  BasicTest {

//	@Autowired
//	WebDriver webDriver;

	@Test
	public void testContactPageLoads(){
		ContactPage.goTo();
		Assert.assertTrue(ContactPage.isLoaded(), "The 'Contact' page has not loaded as expected");
	}

	@Test
	public void testNoCaptcha() {
		ContactPage.goTo();
		ContactPage.fillContactForm();
		ContactPage.sendForm();
		Assert.assertEquals(ContactPage.getErrorMessage(), "ERROR: Please fill in the reCAPTCHA form.",
				"The header title does not match the selected menu item");
	}

	@Test
	public void testNavigationFromHomePageToContactPage(){
		HomePage.goTo();
		TopMenu.goToContact();
		Assert.assertTrue(ContactPage.isLoaded(), "ContactPage is not loaded as expected");

	}
}
