package com.giobertox.test.automation.sample.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageOld {
	private static final By EMAIL_INPUT = By.id("ap_email");
	private static final By PASSWORD_INPUT = By.id("ap_password");
	private static final By SIGN_IN_BUTTON = By.id("signInSubmit-input");
	private static final By SIGN_IN_FORM = By.name("signIn");
	private WebDriver driver;

	public LoginPageOld(WebDriver driver) {
		this.driver = driver;
	}

	public void loginAs(String username, String password) {
		driver.findElement(EMAIL_INPUT)
				.sendKeys(username);
		driver.findElement(PASSWORD_INPUT)
				.sendKeys(password);
		driver.findElement(SIGN_IN_BUTTON)
				.click();
//		return new HomePage(driver);
	}

	public boolean isLoaded() {
		return driver.findElement(SIGN_IN_FORM)
				.isDisplayed();
	}
}