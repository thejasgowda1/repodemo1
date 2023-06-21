package tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Base;
import pages.LandingPage;
import pages.LoginPage;

public class LoginPageTest extends Base{
	
	public static LandingPage landpage;
	public static LoginPage loginpage; 

	public LoginPageTest() {
		super();
		
	}
	@BeforeMethod
	public void setUp() throws Exception {
		launchBrowser();
		 landpage = new LandingPage();
		 loginpage = new LoginPage();
		 loginpage=landpage.login();
		 
	}
	@Test
	public void loginTest() {
		loginpage.login();
		
		String exppageTitle="My Account";
		
		String actTitle=driver.getTitle();
		System.out.println(actTitle);
		Assert.assertEquals(exppageTitle, actTitle);
}
	@AfterMethod
	public void tearDown() {
		driver.close();
		
	}
}
