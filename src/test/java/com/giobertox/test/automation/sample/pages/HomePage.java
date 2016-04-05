package com.giobertox.test.automation.sample.pages;

import com.giobertox.test.automation.sample.utils.Driver;

public class HomePage extends BasicPage{
	private static final String MEGANEXUS_HOME_PAGE_URL = getBaseAddress();

	public static void open() {
		Driver.getInstance().navigate().to(MEGANEXUS_HOME_PAGE_URL);
	}

}