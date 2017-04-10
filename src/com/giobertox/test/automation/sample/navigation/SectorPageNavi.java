package com.giobertox.test.automation.sample.navigation;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.giobertox.test.automation.sample.selenium.Driver;

//To test the links for services/solutions work (Testing page)
public class SectorPageNavi {
//	
//	public static final String HEALTHCARE = "Healthcare";
//	public static final String EDUCATION = "Education";
//	public static final String EMPLOYMENT = "Employment";
//	public static final String JUSTICE = "Justice";
//	public static final String COMMUNITY = "Community";
	
	public static void goToHealthcare() {
		WebElement healthcareItem = Driver.getInstance().findElement(By.className("healthcare"));
		healthcareItem.click();
	}

	public static void goToEducation() {
		WebElement educationItem = Driver.getInstance().findElement(By.className("education"));
		educationItem.click();
	}
	public static void goToEmployment() {
		WebElement employmentItem = Driver.getInstance().findElement(By.className("employment"));
		employmentItem.click();
	}
	public static void goToJustice() {
		WebElement justiceItem = Driver.getInstance().findElement(By.className("justice"));
		justiceItem.click();
	}
	public static void goToCommunity() {
		WebElement communityItem = Driver.getInstance().findElement(By.className("community"));
		communityItem.click();
	}
	
}
