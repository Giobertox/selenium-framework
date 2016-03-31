package com.giobertox.test.automation.sample.pages;

import com.giobertox.test.automation.sample.utils.Driver;

public class ServicesPage {

	private static final String MEGANEXUS_SERVICES_URL = Driver.getBaseAddress() + "/services/";

	public static void open() {
		Driver.getInstance().navigate().to(MEGANEXUS_SERVICES_URL);
	}

}
