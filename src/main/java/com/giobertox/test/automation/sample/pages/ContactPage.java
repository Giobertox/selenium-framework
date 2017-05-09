package com.giobertox.test.automation.sample.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.giobertox.test.automation.sample.selenium.Driver;

public class ContactPage implements BasicPage {

	private static final By PAGE_TITLE = By.xpath("//div[contains(@class, 'col-xs-12')]/h1");
	// Page elements
	private static final By ERROR_MESSAGE = By.className("wpcf7-not-valid-tip");
	private static final By SEND_BUTTON = By.className("wpcf7-form-control");
	private static final By MESSAGE_FIELD = By.name("contact-message");
	private static final By AREA_OF_INTEREST_FIELD = By.name("contact-interest");
	private static final By PHONE_FIELD = By.name("contact-tel");
	private static final By CONTACT_EMAIL_FIELD = By.name("contact-email");
	private static final By CONTACT_ORTGANISATION_FIELD = By.name("contact-organisation");
	private static final By NAME_FIELD = By.name("contact-name");
	// Parameters

	// public static void goTo() {
	// TopMenu.ContactUs.select();
	// }


	public static boolean isLoaded() {
		logger.info("Checking the Contact Page is loaded");
		String pageTitle = Driver.getInstance().findElement(PAGE_TITLE).getText();
		if (pageTitle != null) {
			return pageTitle.equals("Contact"); //Contact                "
		}
		return false;
	}

	public void load() {
		// TODO Auto-generated method stub
		return;
	}


	public static void fillNameField() {
		Driver.getInstance().findElement(NAME_FIELD).sendKeys("Name");
	}

	public static void fillOrganisationField() {
		Driver.getInstance().findElement(CONTACT_ORTGANISATION_FIELD).sendKeys("Organisation");
	}

	public static void fillEmail() {
		Driver.getInstance().findElement(CONTACT_EMAIL_FIELD).sendKeys("Email@Address.com");
	}

	public static void fillTelephoneNumber() {
		Driver.getInstance().findElement(PHONE_FIELD).sendKeys("07776994531");
	}

	public static void fillAreaOfInterest() {
		Driver.getInstance().findElement(AREA_OF_INTEREST_FIELD).sendKeys("07776994531");
	}

	public static void fillMessage() {
		Driver.getInstance().findElement(MESSAGE_FIELD).sendKeys("Message");
	}

	public static void sendForm() {
		Driver.getInstance().findElement(SEND_BUTTON).submit();
	}

	public static String getErrorMessage() {
		return Driver.getInstance().findElement(ERROR_MESSAGE).getText();

	}

	public static void fillContactForm() {
		fillNameField();
		fillOrganisationField();
		fillEmail();
		fillTelephoneNumber();
		fillAreaOfInterest();
		fillMessage();
	}


}
