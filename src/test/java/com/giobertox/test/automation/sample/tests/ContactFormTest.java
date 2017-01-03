package com.giobertox.test.automation.sample.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.giobertox.test.automation.sample.pages.ContactPage;
import com.giobertox.test.automation.sample.pages.TopMenu;

public class ContactFormTest extends BasicTestAbstract {

  @Test
  public void testContactPageLoads() {
    TopMenu.ContactUs.select();
    Assert.assertTrue(ContactPage.isLoaded(), "The 'Contact' page does not loaded as expected");
  }

  @Test
  public void testNoCaptcha() {
    TopMenu.ContactUs.select();
    ContactPage.fillContactForm();
    ContactPage.sendForm();
    Assert.assertEquals(ContactPage.getErrorMessage(), "ERROR: Please fill in the reCAPTCHA form.",
        "The header title does not match the selected menu item");
  }

}
