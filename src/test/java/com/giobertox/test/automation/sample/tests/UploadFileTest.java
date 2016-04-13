package com.giobertox.test.automation.sample.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.giobertox.test.automation.sample.pages.HomeTabPage;

public class UploadFileTest  extends BasicTest{



	@Test
	public void testSettingFileToBeUploaded() throws IOException {
		HomeTabPage.goTo();
		HomeTabPage.fillUploadFileField();
		Assert.assertEquals(HomeTabPage.getFileDisplayedToBeUploaded(), HomeTabPage.IMAGE_FILENAME );
	}
}

