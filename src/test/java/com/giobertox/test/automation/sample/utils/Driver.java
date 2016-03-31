package com.giobertox.test.automation.sample.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public final class Driver {
	// private static final WebDriver INSTANCE = new FirefoxDriver();
	private static final String BASE_ADDRESS = "http://www.meganexus.com/";

	public static String getBaseAddress() {
		return BASE_ADDRESS;
	}

	private Driver() {
	}

	private static final WebDriver instance;

	static {
		try {
			instance = new FirefoxDriver();
		} catch (Exception e) {
			throw new RuntimeException("Darn, an error occurred!", e);
		}
	}

	public static WebDriver getInstance() {
		return instance;
	}

	public static void wait(final int milliseconds) throws InterruptedException {
		Thread.sleep(milliseconds);
	}
}
