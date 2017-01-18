package com.giobertox.test.automation.sample.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.giobertox.test.automation.sample.pages.HomePage;
import com.giobertox.test.automation.sample.selenium.Driver;

public abstract class BasicTestAbstract {

  /*
   * (non-Javadoc)
   *
   * @see com.giobertox.test.automation.sample.tests.TestInterface#setUp()
   */
  @BeforeClass(alwaysRun = true)
  public void setUp() {
    Driver.getInstance();
  }

  /*
   * (non-Javadoc)
   *
   * @see com.giobertox.test.automation.sample.tests.TestInterface#tearDown()
   */
  @AfterClass(alwaysRun = true)
  public void tearDown() {
    Driver.getInstance().quit();
    // Browser.close();
  }

  /*
   * (non-Javadoc)
   *
   * @see com.giobertox.test.automation.sample.tests.TestInterface#beforeMethod()
   */
  @BeforeMethod(alwaysRun = true)
  public void beforeMethod() {
    HomePage.load();
  }
}
