package com.giobertox.test.automation.sample.tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.giobertox.test.automation.sample.pages.SolutionsPage;
import com.giobertox.test.automation.sample.utils.Driver;

public class CheckSolutionsTests {

	private static final String COMMUNITY = "Community";
	private static final String JUSTICE = "Justice";
	private static final String EMPLOYMENT = "Employment";
	private static final String EDUCATION = "Education";
	private static final String ALL = "All";
	private static final String HEALTHCARE = "Healthcare";

	@BeforeClass(alwaysRun = true)
	public void setUp() {
		Driver.getInstance();
	}

	@AfterClass(alwaysRun = true)
	public void tearDown() {
		Driver.instance.quit();
	}

	@BeforeMethod(alwaysRun = true)
	public void openHomePage() {
		SolutionsPage.goTo();
	}

	@Test
	public void allSolutionsAreListed() {
		Select select = new Select(Driver.instance.findElement(By.id("sector-change-select")));

		List<WebElement> dropdownOptions = select.getOptions();
		Assert.assertEquals(dropdownOptions.get(0).getText(), ALL);
		Assert.assertEquals(dropdownOptions.get(1).getText(), HEALTHCARE);
		Assert.assertEquals(dropdownOptions.get(2).getText(), EDUCATION);
		Assert.assertEquals(dropdownOptions.get(3).getText(), EMPLOYMENT);
		Assert.assertEquals(dropdownOptions.get(4).getText(), JUSTICE);
		Assert.assertEquals(dropdownOptions.get(5).getText(), COMMUNITY);
	}

	@Test
	public void solutionsSelectionsWork() throws InterruptedException {
		ArrayList<String> solutionList = new ArrayList<String>(
				Arrays.asList(HEALTHCARE, EDUCATION, EMPLOYMENT, JUSTICE, COMMUNITY));
		for (String solution : solutionList) {
			SolutionsPage.selectSolution(solution);
			Thread.sleep(2000);
			Assert.assertEquals(SolutionsPage.getSelectedSolution().getText(), solution,
					"Element displayed is not the expected one");
		}
	}

}
