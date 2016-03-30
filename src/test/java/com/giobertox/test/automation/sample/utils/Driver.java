package com.giobertox.test.automation.sample.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public final class Driver {
	private static final WebDriver INSTANCE = new FirefoxDriver();
	private static final String BASE_ADDRESS = "http://www.meganexus.com/";

	public static String getBaseAddress() {
		return BASE_ADDRESS;
	}

	private Driver() {
	}

	public static WebDriver getInstance() {
		return INSTANCE;
	}

	public static void wait(final int milliseconds) throws InterruptedException {
		Thread.sleep(milliseconds);
	}
}
