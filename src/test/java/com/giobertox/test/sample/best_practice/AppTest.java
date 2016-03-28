package com.giobertox.test.sample.best_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
extends TestCase
{
	/**
	 * Create the test case
	 *
	 * @param testName name of the test case
	 */
	public AppTest( String testName )
	{
		super( testName );
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static TestSuite suite()
	{
		return new TestSuite( AppTest.class );
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testApp()
	{
		assertTrue( true );
	}

	private WebDriver driver;

	@BeforeClass
	public void setUp() {
		driver = new FirefoxDriver();
	}

	@BeforeMethod
	public void openHomePage(){
		driver.get("http://www.amazon.com");
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void testAddingItemToCard() {
		//Select 'Books' from search category dropdown
		new Select(driver.findElement(By.id("searchDropdownBox")))
		.selectByVisibleText("Books");

		//Enter search key: 'Selenium'
		driver.findElement(By.id("twotabsearchtextbox"))
		.sendKeys("Selenium");
		driver.findElement(By.xpath("//*[@value='Go']"))
		.click();

		//Click the first search result item title
		WebElement firstItemTitleElement = driver.findElement(By.className("s-access-title"));
		String firstItemTitle = firstItemTitleElement.getText();
		firstItemTitleElement.click();

		//Verify product title
		assert (driver.findElement(By.id("productTitle"))
				.getText()
				.equals(firstItemTitle));

		//Click 'Add to cart' button
		driver.findElement(By.id("add-to-cart-button"))
		.click();

		//Verify confirmation text appears
		assert (driver.findElement(By.id("confirm-text"))
				.getText()
				.equals("1 item added to Cart"));

		//Navigate to 'Cart' page
		driver.findElement(By.id("nav-cart"))
		.click();

		//Verify item is displayed on Shopping Cart list
		assert (driver.findElement(By.className("a-list-item"))
				.getText()
				.contains(firstItemTitle));
	}


}
