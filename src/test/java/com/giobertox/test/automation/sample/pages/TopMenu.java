package com.giobertox.test.automation.sample.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.giobertox.test.automation.sample.utils.Driver;

public class TopMenu {

	public static class ContactUs {

		private static final By CONTACT_US_MENU_ITEM = By.id("menu-item-88");

		public static void select() {
			WebElement contactMenuItem = Driver.getInstance().findElement(CONTACT_US_MENU_ITEM);
			contactMenuItem.click();
		}
	}

	public static class Solutions {

		private static final By SOLUTIONS_MENU_ITEM = By.id("menu-item-105");

		public static void select() {
			WebElement solutionMenuItem = Driver.getInstance().findElement(SOLUTIONS_MENU_ITEM);
			solutionMenuItem.click();
		}
	}

	public static class Clients {

		private static final By CLIENTS_MENU_ITEM = By.id("menu-item-91");

		public static void select() {
			WebElement clientsMenuItem = Driver.getInstance().findElement(CLIENTS_MENU_ITEM);
			clientsMenuItem.click();
		}
	}

	public static class Neo {

		private static final By NEO_MENU_ITEM = By.id("menu-item-164");

		public static void select() {
			WebElement neoMenuItem = Driver.getInstance().findElement(NEO_MENU_ITEM);
			neoMenuItem.click();
		}
	}

	public static class Services {
		private static final By SERVICES_MENU_ITEM = By.id("menu-item-622");

		public static void select() {
			WebElement servicesMenuItem = Driver.getInstance().findElement(SERVICES_MENU_ITEM);
			servicesMenuItem.click();
		}
	}

	public static class News {
		private static final By NEWS_MENU_ITEM = By.id("menu-item-89");

		public static void select() {
			WebElement newsMenuItem = Driver.getInstance().findElement(NEWS_MENU_ITEM);
			newsMenuItem.click();
		}
	}

	public static class AboutUs {
		private static final By ABOUT_US_MENU_ITEM = By.id("menu-item-166");

		public static void select() {
			WebElement aboutUsMenuItem = Driver.getInstance().findElement(ABOUT_US_MENU_ITEM);
			aboutUsMenuItem.click();
		}

	}
}
