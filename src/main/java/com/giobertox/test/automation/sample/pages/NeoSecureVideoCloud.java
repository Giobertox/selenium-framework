package com.giobertox.test.automation.sample.pages;

import org.openqa.selenium.By;

import com.giobertox.test.automation.sample.selenium.Driver;

public class NeoSecureVideoCloud implements BasicPage {
	
	
/* navigate to the desired page */
	
	private static final String MEGANEXUS_NEOSECURE_URL = Driver.getRootUrlAddress() + "/solutions/neo-secure-video-cloud/";
	
/* lets create a paragraph to test */
	
	
    private static final String SENTANCE = "NEO Secure Video Cloud can be added to other NEO applications";
 
	
/* lets find some xml to test */
    
    private static final By SECURE_PIC = By.xpath("//*[@id=\"main\"]/div/div/div/div[2]/p[1]/a/img");
    		
	
    public static void goTo() {
        Driver.getInstance().navigate().to(MEGANEXUS_NEOSECURE_URL);
      }
    
    public static String getSECURE_PIC(){
		String pick = Driver.getInstance().findElement(SECURE_PIC).getText();
		return pick;
		
	}

	public static String getSentance() {
		return SENTANCE;
	}
    
    
   


	

	
	
	
	

}
