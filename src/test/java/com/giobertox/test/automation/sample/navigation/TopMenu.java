package com.giobertox.test.automation.sample.navigation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.giobertox.test.automation.sample.selenium.Driver;

public class TopMenu {

  private static final String CONTACT__MENU_ITEM = "menu-item-88";
  private static final String ABOUT_US__MENU_ITEM = "menu-item-166";
  private static final String NEWS_MENU_ITEM = "menu-item-89";
  private static final String SERVICES_MENU_ITEM = "menu-item-622";
  private static final String NEO__MENU_ITEM = "menu-item-164";
  private static final String CLIENTS__MENU_ITEM = "menu-item-91";
  private static final String SOLUTION_MENU_ITEM = "menu-item-105";
  

  public static void goToSolutions() {
    WebElement solutionMenuItem = Driver.getInstance().findElement(By.id(SOLUTION_MENU_ITEM));
    solutionMenuItem.click();
  }

  public static void goToClients() {
    WebElement clientsMenuItem = Driver.getInstance().findElement(By.id(CLIENTS__MENU_ITEM));
    clientsMenuItem.click();
  }

  public static void goToNeo() {
    WebElement neoMenuItem = Driver.getInstance().findElement(By.id(NEO__MENU_ITEM));
    neoMenuItem.click();
  }

  public static void goToServices() {
    WebElement servicesMenuItem = Driver.getInstance().findElement(By.id(SERVICES_MENU_ITEM));
    servicesMenuItem.click();
  }

  public static void goToNews() {
    WebElement newsMenuItem = Driver.getInstance().findElement(By.id(NEWS_MENU_ITEM));
    newsMenuItem.click();
  }

  public static void goToAboutUs() {
    WebElement aboutUsMenuItem = Driver.getInstance().findElement(By.id(ABOUT_US__MENU_ITEM));
    aboutUsMenuItem.click();
  }

  public static void goToContact() {
    WebElement contactMenuItem = Driver.getInstance().findElement(By.id(CONTACT__MENU_ITEM));
    contactMenuItem.click();
  }

}
