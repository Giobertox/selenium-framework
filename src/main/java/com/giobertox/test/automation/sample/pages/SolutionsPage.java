package com.giobertox.test.automation.sample.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.giobertox.test.automation.sample.selenium.Driver;

public class SolutionsPage implements BasicPage {

  private static final String MEGANEXUS_SOLUTIONS_URL =
      Driver.getRootUrlAddress() + "/solutions-sectors/";

  public static final String COMMUNITY = "Community";
  public static final String JUSTICE = "Justice";
  public static final String EMPLOYMENT = "Employment";
  public static final String EDUCATION = "Education";
  public static final String ALL = "All";
  public static final String HEALTHCARE = "Healthcare";

  public void load() {
    Driver.getInstance().navigate().to(MEGANEXUS_SOLUTIONS_URL);
  }

  public static void selectSolution(final String solutionValue) {
    Select select = new Select(Driver.getInstance().findElement(By.id("sector-change-select")));
    select.selectByVisibleText(solutionValue);
  }

  public static String getSelectedSolution() {
    WebElement title = Driver.getInstance().findElement(
        By.cssSelector("#carousel-solution > div >	div.item.active > div > div.col-xs-4 > h2"));
    if (title != null) {
      return title.getText();
    }
    return "";
  }

  public static List<WebElement> getDropdownSolutionOptions() {
    Select select = new Select(Driver.getInstance().findElement(By.id("sector-change-select")));
    List<WebElement> dropdownOptions = select.getOptions();
    return dropdownOptions;
  }

}
