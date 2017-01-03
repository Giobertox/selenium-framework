package com.giobertox.test.automation.sample.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginCommand {
  private String userName;
  private String password;

  public LoginCommand(final String userName) {
    this.userName = userName;
  }

  public LoginCommand withPassword(final String password) {
    this.password = password;
    return this;
  }

  public void login() {
    WebElement loginInput = Driver.getInstance().findElement(By.id("user_login"));
    loginInput.sendKeys("userName");

    WebElement passwordInput = Driver.getInstance().findElement(By.id("user_pass"));
    passwordInput.sendKeys("password");

    WebElement submitButton = Driver.getInstance().findElement(By.id("wp-submit"));
    submitButton.click();
  }

}
