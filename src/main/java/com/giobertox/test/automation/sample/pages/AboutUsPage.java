package com.giobertox.test.automation.sample.pages;

import com.giobertox.test.automation.sample.selenium.Driver;

//To test the links for services/solutions work (Testing page)
public class AboutUsPage implements BasicPage {

	private static final String MEGANEXUS_ABOUT_URL =
			Driver.getRootUrlAddress() + "/about-us/";

	public static void load() {
		Driver.getInstance().navigate().to(MEGANEXUS_ABOUT_URL);
	}
}
