package com.giobertox.test.automation.sample.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public final class Driver {

	private static final String SELENIUM_SERVER_URL = "http://127.0.0.1:5555/wd/hub";

	private Driver() {
	}

	private static final WebDriver instance;

	static {
		try {
			//			 If launched with Local Eclipse Selenium , the one in the project uncomment the following...
			instance = new FirefoxDriver();
			// ...instead if launched with remote Selenium Server otherwise, uncomment the following line
			//			instance = new RemoteWebDriver(new URL(SELENIUM_SERVER_URL), DesiredCapabilities.firefox());
			FirefoxProfile profile = new FirefoxProfile();
			profile.setPreference("network.proxy.type", 0);
			profile.setPreference("security.ssl3.dhe_rsa_aes_128_sha",false);
			profile.setPreference("security.ssl3.dhe_rsa_aes_256_sha",false);
			instance.manage().window().maximize();
			instance.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}
		catch (Exception e) {
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
