package com.giobertox.test.automation.sample.pages;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.giobertox.test.automation.sample.utils.Driver;

public class HomeTabPage {

	private static final String TEST_DATA_SUBFOLDER = "\\TestData\\";
	public static String IMAGE_FILENAME = "Prospects.png";
	static String UPLOAD_FILE_FIELD_ID = "m1384_formElement_139415";

	final static Logger logger = LoggerFactory.getLogger(HomeTabPage.class);
	private static final String UPLOAD_FORM_URL = "www.whereverItis.com/uploadform";

	public static void goTo() {
		Driver.getInstance().navigate().to(UPLOAD_FORM_URL);
	}

	public static void fillUploadFileField() throws IOException {

		File imageFile = new File(System.getProperty("user.dir") + TEST_DATA_SUBFOLDER + IMAGE_FILENAME);
		try {
			Driver.getInstance().findElement(By.name(UPLOAD_FILE_FIELD_ID)).sendKeys(imageFile.getCanonicalPath());
		} catch (IOException e) {
			// Printing logs for my report
			logger.error("Error with canonical pathname string of this abstract pathname.");
			// Taking screenshot for defect reporting
			// Utils.captureScreenShot();//TODO to implement or Selenium might
			// have this utiloity already maybe using some lib
			// After doing my work, now i want to stop my test case
			throw (e);
		}
	}

	public static String getFileDisplayedToBeUploaded() {
		WebElement loginErrorMessage = Driver.getInstance().findElement(By.id("whateverItIs"));// TODO
																								// find
																								// id
																								// for
																								// that
																								// Element
		if (loginErrorMessage != null) {
			return loginErrorMessage.getText();
		}
		return null;
	}

}
