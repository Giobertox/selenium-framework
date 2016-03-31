package com.giobertox.test.automation.sample.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.giobertox.test.automation.sample.utils.Driver;

public class TopMenu {

	public static void goToSolutions() {
		WebElement solutionMenuItem =
				Driver.getInstance().findElement(By.id("menu-item-105"));
		solutionMenuItem.click();
	}

	public static void goToClients() {
		WebElement clientsMenuItem = Driver.getInstance().findElement(By.id("menu-item-91"));
		clientsMenuItem.click();
	}

	public static void goToNeo() {
		WebElement neoMenuItem = Driver.getInstance().findElement(By.id("menu-item-164"));
		neoMenuItem.click();
	}

	public static void goToServices() {
		WebElement servicesMenuItem =
				Driver.getInstance().findElement(By.id("menu-item-622"));
		servicesMenuItem.click();
	}

	public static void goToNews() {
		WebElement newsMenuItem = Driver.getInstance().findElement(By.id("menu-item-89"));
		newsMenuItem.click();
	}

	public static void goToAboutUs() {
		WebElement aboutUsMenuItem =
				Driver.getInstance().findElement(By.id("menu-item-166"));
		aboutUsMenuItem.click();
	}

	public static void goToContact() {
		WebElement contactMenuItem = Driver.getInstance().findElement(By.id("menu-item-88"));
		contactMenuItem.click();
	}


}
