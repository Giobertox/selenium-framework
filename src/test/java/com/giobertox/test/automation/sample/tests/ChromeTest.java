package com.giobertox.test.automation.sample.tests;


import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.giobertox.test.automation.sample.pages.HeaderPage;


public class ChromeTest extends ChromeTestAbstract{

	@Test
	public void jobsNavigate() {
		WebElement jobsMenuItem = driver.findElement(By.id("menu-item-2292"));
		jobsMenuItem.click();
		Assert.assertEquals(HeaderPage.getTitleChrome().getText(), "Jobs",
				"The header title does not match the selected menu item");
	}

	@Test
	public void solutionsNavigate() {
		WebElement solutionMenuItem = driver.findElement(By.id("menu-item-105"));
		solutionMenuItem.click();
		Assert.assertEquals(HeaderPage.getTitleChrome().getText(), "Solutions",
				"The header title does not match the selected menu item");
	}

	@Test
	public void clientsNavigate() {
		WebElement clientsMenuItem = driver.findElement(By.id("menu-item-91"));
		clientsMenuItem.click();
		Assert.assertEquals(HeaderPage.getTitleChrome().getText(), "Clients",
				"The header title does not match the selected menu item");
	}

}
