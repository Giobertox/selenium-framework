package com.giobertox.test.automation.sample.tests;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.giobertox.test.automation.sample.pages.TopMenu;

public class TestTopMenuItemsLinks {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

//  @Before
//  public void setUp() throws Exception {
//    driver = new FirefoxDriver();
//    baseUrl = "http://www.meganexus.com/";
//    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//  }

  @Test
  public void testTopMenuItemsLinks() throws Exception {
    // open | / |
    driver.get(baseUrl + "/");
    // click | link=Solutions |
    driver.findElement(By.linkText("Solutions")).click();
    // click | link=Clients |
    driver.findElement(By.linkText("Clients")).click();
    // click | link=NEO |
    driver.findElement(By.linkText("NEO")).click();
    // click | link=Services |
    driver.findElement(By.linkText("Services")).click();
    // click | link=News & Events |
    driver.findElement(By.linkText("News & Events")).click();
    // click | link=About us |
    TopMenu.goToAboutUs();
    driver.findElement(By.linkText("About us")).click();
    // click | link=Contact |
//    TopMenu.newClickOnContact();
  }

//  @After
//  public void tearDown() throws Exception {
//    driver.quit();
//    String verificationErrorString = verificationErrors.toString();
//    if (!"".equals(verificationErrorString)) {
//      fail(verificationErrorString);
//    }
//  }

  private boolean isElementPresent(By by) {
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
