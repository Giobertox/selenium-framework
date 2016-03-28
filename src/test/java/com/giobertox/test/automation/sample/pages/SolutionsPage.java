package com.giobertox.test.automation.sample.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.giobertox.test.automation.sample.utils.Driver;

public class SolutionsPage {

	private static final String MEGANEXUS_SOLUTIONS_URL = "http://www.meganexus.com/solutions-sectors/";

	public static void goTo() {
		Driver.instance.navigate().to(MEGANEXUS_SOLUTIONS_URL);
	}

	public static void selectSolution(final String solutionValue) {
		Select select = new Select(Driver.instance.findElement(By.id("sector-change-select")));
		select.selectByVisibleText(solutionValue);
	}

	public static WebElement getSelectedSolution() {
		return Driver.instance
				.findElement(By.cssSelector("#carousel-solution > div > div.item.active > div > div.col-xs-4 > h2"));
	}

}
