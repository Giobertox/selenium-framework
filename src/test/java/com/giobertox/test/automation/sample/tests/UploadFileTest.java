package com.giobertox.test.automation.sample.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.giobertox.test.automation.sample.pages.FileUploadPage;

public class UploadFileTest  extends BasicTest{



	@Test
	public void testSettingFileToBeUploaded() throws IOException {
		FileUploadPage.goTo();
		FileUploadPage.fillUploadFileField();
		Assert.assertEquals(FileUploadPage.getFileDisplayedToBeUploaded(), FileUploadPage.IMAGE_FILENAME );
	}
}

