package com.giobertox.test.automation.sample.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.giobertox.test.automation.sample.navigation.SectorPageNavi;
import com.giobertox.test.automation.sample.pages.HeaderPage;
import com.giobertox.test.automation.sample.pages.NeoSecureVideoCloudPage;
import com.giobertox.test.automation.sample.pages.TopMenu;;




public class NeoSecureVideoCloudTest extends BasicTestAbstract {


  @Test
  public void testNeoSecureLoads() {
    NeoSecureVideoCloudPage.goTo();
    Assert.assertEquals(HeaderPage.getTitle().getText(), "NEO Secure Video Cloud", "The header title does not match the selected menu item");
  }


  @Test
  public void testGetSECURE_PIC() {
    NeoSecureVideoCloudPage.goTo();
    Assert.assertEquals(NeoSecureVideoCloudPage.getSECURE_PIC(), "", "The picture does not match the title specified");
  }



  @Test
  public void testGetSentance() {
    NeoSecureVideoCloudPage.goTo();
    Assert.assertEquals(NeoSecureVideoCloudPage.getSentance(), "NEO Secure Video Cloud can be added to other NEO applications",
        "The paragraph does not match the one required");
  }



  @Test
  public void testHealthcareNavigationWorks() {
    TopMenu.Solutions.select();
    SectorPageNavi.goToHealthcare();
    Assert.assertEquals(HeaderPage.getTitle().getText(), "Healthcare", "The header title does not match the selected item");
  }



}


