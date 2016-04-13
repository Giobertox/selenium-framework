package com.giobertox.test.automation.sample.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.giobertox.test.automation.sample.pages.ContactPage;

public class ContactFormTests extends BasicTest {

	@Test
	public void testFormFilledCorrectlyButNoCaptcha() {
		ContactPage.goTo();
		ContactPage.fillContactForm();

		ContactPage.sendForm();

		Assert.assertEquals(ContactPage.getErrorMessage(), "ERROR: Please fill in the reCAPTCHA form.",
				"The header title does not match the selected menu item");
	}

}
