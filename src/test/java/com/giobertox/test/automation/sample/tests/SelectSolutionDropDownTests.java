package com.giobertox.test.automation.sample.tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.giobertox.test.automation.sample.pages.SolutionsPage;
import com.giobertox.test.automation.sample.utils.Driver;

public class SelectSolutionDropDownTests extends BasicTests {

	@Test
	public void allSolutionsAreListed() {
		List<WebElement> dropdownOptions = SolutionsPage.getSDropdownSolutionsMenuItems();
		Assert.assertEquals(dropdownOptions.get(0).getText(), SolutionsPage.ALL);
		Assert.assertEquals(dropdownOptions.get(1).getText(), SolutionsPage.HEALTHCARE);
		Assert.assertEquals(dropdownOptions.get(2).getText(), SolutionsPage.EDUCATION);
		Assert.assertEquals(dropdownOptions.get(3).getText(), SolutionsPage.EMPLOYMENT);
		Assert.assertEquals(dropdownOptions.get(4).getText(), SolutionsPage.JUSTICE);
		Assert.assertEquals(dropdownOptions.get(5).getText(), SolutionsPage.COMMUNITY);
	}

	@Test
	public void solutionsSelectionsWork() throws InterruptedException {
		ArrayList<String> solutionList = new ArrayList<String>(Arrays.asList(SolutionsPage.HEALTHCARE,
				SolutionsPage.EDUCATION, SolutionsPage.EMPLOYMENT, SolutionsPage.JUSTICE, SolutionsPage.COMMUNITY));
		for (String solution : solutionList) {
			SolutionsPage.selectSolution(solution);
			Driver.wait(1000);
			Assert.assertEquals(SolutionsPage.getSelectedSolution(), solution,
					"Element displayed is not the expected one");
		}
	}

}