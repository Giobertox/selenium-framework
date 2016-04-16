package com.giobertox.test.automation.sample.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.giobertox.test.automation.sample.pages.TopMenu;
import com.giobertox.test.automation.sample.utils.Driver;

public class TopMenuItemsLinksTests extends BasicTest {
	private WebDriver driver = Driver.getInstance();
	private String baseUrl;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();

	@Test
	public void testTopMenuItemsLinks() throws Exception {

		TopMenu.Solutions.select();
		isElementPresent(By.linkText("Solutions"));
		// click | link=Clients |
		isElementPresent(By.linkText("Clients"));
		// click | link=NEO |
		isElementPresent(By.linkText("NEO"));
		// click | link=Services |
		isElementPresent(By.linkText("Services"));
		// click | link=News & Events |
		isElementPresent(By.linkText("News & Events"));
		// click | link=About us |
		TopMenu.AboutUs.select();
		isElementPresent(By.linkText("About us"));
		// click | link=Contact |
		// TopMenu.newClickOnContact();
	}

	private boolean isElementPresent(final By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	private boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
	}

	private String closeAlertAndGetItsText() {
		try {
			Alert alert = driver.switchTo().alert();
			String alertText = alert.getText();
			if (acceptNextAlert) {
				alert.accept();
			} else {
				alert.dismiss();
			}
			return alertText;
		} finally {
			acceptNextAlert = true;
		}
	}
}
