package com.giobertox.test.automation.sample.pages;

import org.openqa.selenium.By;
import com.giobertox.test.automation.sample.selenium.Driver;

public class NeoPage {
	private static final String MEGANEXUS_ABOUT_URL =
			Driver.getRootUrlAddress() + "/neo/";

	//public static final String PARAGRAPH_TITLE  = "Why NEO?";//  "//div[contains(@class, 'col-xs-6')]/h3"
	public static final String PARAGRAPH = "Rather than any one service provider working in isolation and "
			+ "distributing information through a series of repetitive or manual measures, a solution is "
			+ "to use a system that securely shares information and maintains networks across sectors.";
	
	public static final By pt = By.xpath("//div[contains(@class, 'col-xs-6')]/h3");
	public static final By p = By.xpath("//div[contains(@class, 'col-xs-6')]/p");

	public static void load() {
		Driver.getInstance().navigate().to(MEGANEXUS_ABOUT_URL);
	}
	
	public static String getParagraph(){
		String para = Driver.getInstance().findElement(p).getText();
		return para;
		
	}
	
	public static String getParagraphTitle(){
		String title = Driver.getInstance().findElement(pt).getText();
		return title;
		
	}
	
}
