package com.giobertox.test.automation.sample.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.giobertox.test.automation.sample.selenium.Driver;
import com.giobertox.test.automation.sample.selenium.DriverC;

public class HeaderPage {

  public static WebElement getTitle() {
    WebElement headerTitle =
        Driver.getInstance().findElement(By.xpath("//*[@id=\"main\"]/header/div/div/div/h1"));

    return headerTitle;
  }
  
  public static WebElement getTitleChrome() {
	    WebElement headerTitle =
	        DriverC.getInstance().findElement(By.xpath("//*[@id=\"main\"]/header/div/div/div/h1"));

	    return headerTitle;
	  }

}
