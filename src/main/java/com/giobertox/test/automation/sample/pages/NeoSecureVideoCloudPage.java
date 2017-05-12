package com.giobertox.test.automation.sample.pages;

import org.openqa.selenium.By;

import com.giobertox.test.automation.sample.selenium.Driver;

public class NeoSecureVideoCloudPage implements BasicPage {




	private static final String MEGANEXUS_NEOSECURE_URL = Driver.getRootUrlAddress() + "/solutions/neo-secure-video-cloud/";
	/* features */
    private static final String SENTENCE = "NEO Secure Video Cloud can be added to other NEO applications";
    private static final By SECURE_PIC = By.xpath("//*[@id=\"main\"]/div/div/div/div[2]/p[1]/a/img");
  private static final By NEO_COMMIT = By.id("menu-item-372");


    public static void goTo() {
        Driver.getInstance().navigate().to(MEGANEXUS_NEOSECURE_URL);

      }

    public static String getSECURE_PIC(){
		String pick = Driver.getInstance().findElement(SECURE_PIC).getText();
		return pick;

	}

	public static String getSentance() {
		return SENTENCE;
	}



}
