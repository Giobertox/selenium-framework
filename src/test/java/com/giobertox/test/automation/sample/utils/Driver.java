package com.giobertox.test.automation.sample.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public final class Driver {


	private Driver() {
	}

	private static final WebDriver instance;

	static {
		try {
			instance = new FirefoxDriver();
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
