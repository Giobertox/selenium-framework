package com.giobertox.test.automation.sample.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.giobertox.test.automation.sample.utils.Driver;

public class DashboardPage {

	private static final By PAGE_TITLES = By.tagName("h2");

	public static boolean isLoaded() {
		List<WebElement> pageTitles = Driver.getInstance().findElements(PAGE_TITLES);
		if (pageTitles.size() > 0) {
			return pageTitles.get(0).getText().equals("Dashboard");
		}
		return false;
	}

}
