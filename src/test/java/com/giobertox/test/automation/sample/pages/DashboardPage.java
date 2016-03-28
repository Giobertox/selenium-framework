package com.giobertox.test.automation.sample.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.giobertox.test.automation.sample.utils.Driver;

public class DashboardPage {

	public static boolean isLoaded() {
		List<WebElement> h2List = Driver.instance.findElements(By.tagName("h2"));
		if (h2List.size() > 0) {
			return h2List.get(0).getText().equals("Dashboard");
		}
		return false;
	}

}
