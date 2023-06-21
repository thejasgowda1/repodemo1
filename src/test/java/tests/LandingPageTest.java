package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Base;
import pages.LandingPage;

public class LandingPageTest extends Base{
	public static LandingPage land;
	
	public LandingPageTest() {
		super();
			
			
		}
	@BeforeMethod
	public void setUp() {
		launchBrowser();
		 land  = new LandingPage();
	}
	@Test
	public void landpage() throws Exception {
		land.register();
	}
	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}
