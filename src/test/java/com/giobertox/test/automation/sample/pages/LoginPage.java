package com.giobertox.test.automation.sample.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.giobertox.test.automation.sample.utils.Driver;
import com.giobertox.test.automation.sample.utils.LoginCommand;

public class LoginPage extends BasicPage{
	private static final String LOGIN_ERROR_ID = "login_error";

	private static final String MEGANEXUS_LOGIN_URL = Driver.getRootAddress() + "wp-login.php";

	public static void goTo() {
		Driver.getInstance().navigate().to(MEGANEXUS_LOGIN_URL);
	}

	public static LoginCommand loginAs(final String username) {
		return new LoginCommand(username);
	}

	public static boolean hasErrorMessage() {
		WebElement loginErrorMessage = Driver.getInstance().findElement(By.id(LOGIN_ERROR_ID));
		if (loginErrorMessage != null) {
			return true;
		}
		return false;
	}

	public static String getErrorMessage() {
		WebElement loginErrorMessage = Driver.getInstance().findElement(By.id(LOGIN_ERROR_ID));
		if (loginErrorMessage != null) {
			return loginErrorMessage.getText();
		}
		return null;
	}

}
