package com.giobertox.test.automation.sample.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.giobertox.test.automation.sample.pages.ContactPage;

public class SendContactForm extends BasicTests {

	@Test
	public void testFormFilledCorrectlyButNoCaptcha() {
		ContactPage.goTo();
		ContactPage.fillNameField();
		ContactPage.fillOrganisationField();
		ContactPage.fillEmail();
		ContactPage.fillTelephoneNumber();
		ContactPage.fillAreaOfInterest();

		ContactPage.fillMessage();
		ContactPage.sendMessageForm();

		Assert.assertEquals(ContactPage.getErrorMessage(), "ERROR: Please fill in the reCAPTCHA form.",
				"The header title does not match the selected menu item");

	}

}
