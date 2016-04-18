package com.giobertox.test.automation.sample.pages;

import com.giobertox.test.automation.sample.selenium.Driver;

public class HomePage implements BasicPage {

	public static void load() {
		Driver.getInstance().navigate().to( Driver.getRootUrlAddress());
	}

}