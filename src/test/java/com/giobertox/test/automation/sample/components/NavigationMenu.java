package com.giobertox.test.automation.sample.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.giobertox.test.automation.sample.pages.CartPage;
import com.giobertox.test.automation.sample.pages.SearchResultsPage;

public class NavigationMenu {
	private static final By SEARCH_DROPDOWN_BOX = By.id("searchDropdownBox");
	private static final By SEARCH_INPUT = By.id("twotabsearchtextbox");
	private static final By SEARCH_GO_BUTTON = By.xpath("//*[@value='Go']");
	private static final By NAVIGATION_ITEM_CART = By.id("nav-cart");
	private WebDriver driver;

	public NavigationMenu(final WebDriver driver) {
		this.driver = driver;
	}

	public SearchResultsPage searchFor(final String category, final String searchKey) {

		new Select(driver.findElement(SEARCH_DROPDOWN_BOX)).selectByVisibleText(category);
		driver.findElement(SEARCH_INPUT).sendKeys(searchKey);
		driver.findElement(SEARCH_GO_BUTTON).click();
		return new SearchResultsPage(driver);
	}

	public CartPage navigateToCartPage() {
		driver.findElement(NAVIGATION_ITEM_CART).click();
		System.out.println("ciao");
		return new CartPage(driver);

		//
	}
}
