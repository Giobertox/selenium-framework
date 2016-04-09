package com.giobertox.test.automation.sample.pages;

import org.openqa.selenium.By;

import com.giobertox.test.automation.sample.utils.Driver;

public class ContactPage extends BasicPage {

	private static final String MEGANEXUS_CONTACT_URL = getBaseAddress() + "contact/";

	public static void goTo() {
		Driver.getInstance().navigate().to(MEGANEXUS_CONTACT_URL);
	}

	public static void fillNameField() {
		Driver.getInstance().findElement(By.name("contact-name")).sendKeys("Name");
	}

	public static void fillOrganisationField() {
		Driver.getInstance().findElement(By.name("contact-organisation")).sendKeys("Organisation");
	}

	public static void fillEmail() {
		Driver.getInstance().findElement(By.name("contact-email")).sendKeys("Email@Address.com");
	}

	public static void fillTelephoneNumber() {
		Driver.getInstance().findElement(By.name("contact-tel")).sendKeys("07776994531");
	}

	public static void fillAreaOfInterest() {
		Driver.getInstance().findElement(By.name("contact-interest")).sendKeys("07776994531");
	}

	public static void fillMessage() {
		Driver.getInstance().findElement(By.name("contact-message")).sendKeys("Message");
	}

	public static void sendForm() {
		Driver.getInstance().findElement(By.className("wpcf7-form-control")).submit();
	}

	public static String getErrorMessage() {
		return Driver.getInstance().findElement(By.className("wpcf7-not-valid-tip")).getText();
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
