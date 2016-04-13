package com.giobertox.test.automation.sample.pages;

import com.giobertox.test.automation.sample.utils.Driver;

public class HomePage extends BasicPage{

	public static void goTo() {
		Driver.getInstance().navigate().to( Driver.getRootAddress());
	}

}