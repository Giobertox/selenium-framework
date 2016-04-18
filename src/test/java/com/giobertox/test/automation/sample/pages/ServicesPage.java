package com.giobertox.test.automation.sample.pages;

import com.giobertox.test.automation.sample.selenium.Driver;

public class ServicesPage implements BasicPage {

	private static final String MEGANEXUS_SERVICES_URL = Driver.getRootUrlAddress() + "/services/";

	public static void goTo() {
		Driver.getInstance().navigate().to(MEGANEXUS_SERVICES_URL);
	}

}
