package com.giobertox.test.automation.sample.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

	public static WebDriver instance = null; // new FirefoxDriver();

	private Driver() {
	}

	public static WebDriver getInstance() {
		if (instance == null) {
			instance = new FirefoxDriver();
			instance.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}
		return instance;
	}

}
