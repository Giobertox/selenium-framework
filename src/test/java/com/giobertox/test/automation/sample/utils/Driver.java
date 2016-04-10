package com.giobertox.test.automation.sample.utils;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public final class Driver {

	private static final String SELENIUM_SERVER_URL = "http://127.0.0.1:5555/wd/hub";

	private Driver() {
	}

	private static final WebDriver instance;

	static {
		try {
			// se lanciato in locale
			// instance = new FirefoxDriver();
			instance = new RemoteWebDriver(new URL(SELENIUM_SERVER_URL), DesiredCapabilities.firefox());
			instance.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		} catch (Exception e) {
			throw new RuntimeException("Oh, an error occurred when instantiating the WebDriver!", e);
		}
	}

	public static WebDriver getInstance() {
		return instance;
	}

	public static void wait(final int milliseconds) throws InterruptedException {
		Thread.sleep(milliseconds);
	}
}
