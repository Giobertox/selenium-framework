package com.giobertox.test.automation.sample.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.giobertox.test.automation.sample.navigation.SectorPageNavi;
import com.giobertox.test.automation.sample.pages.HeaderPage;

import com.giobertox.test.automation.sample.pages.NeoSecureVideoCloud;
import com.giobertox.test.automation.sample.pages.TopMenu;


public class NeoSecureVideoCloudTest extends BasicTestAbstract {
	
	
	@Test
	public void testNeoSecureLoads() {
		NeoSecureVideoCloud.goTo();
		Assert.assertEquals(HeaderPage.getTitle().getText(), "NEO Secure Video Cloud",
				"The header title does not match the selected menu item");
	}
	
	
	@Test
	public void testGetSECURE_PIC() {
		NeoSecureVideoCloud.goTo();
		Assert.assertEquals(NeoSecureVideoCloud.getSECURE_PIC(), "" ,
				"The picture does not match the title specified");
	}



   @Test
   public void testGetSentance(){
	   NeoSecureVideoCloud.goTo();
	   Assert.assertEquals(NeoSecureVideoCloud.getSentance(), "NEO Secure Video Cloud can be added to other NEO applications", 
			   "The paragraph does not match the one required");
   }
   
   
   /* this is where the click error comes in */
   
   @Test
	public void testHealthcareNavigationWorks(){
		NeoSecureVideoCloud.goTo();
		NeoSecureVideoCloud.commitClick();
		Assert.assertEquals(HeaderPage.getTitle().getText(), "NEO COMMIT\nClinical Outcome Monitoring Management Information Technology",
				"The header title does not match the selected item");
	}
   
   
  

   
}


