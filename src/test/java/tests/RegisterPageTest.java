package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Base;
import pages.LandingPage;
import pages.RegisterPage;

public class RegisterPageTest extends Base{
	
	public static LandingPage landpage;
	public static RegisterPage regpage;
	
	public RegisterPageTest() {
		super();
	}
@BeforeMethod
public void setUp() throws Exception {
	launchBrowser();
	landpage = new LandingPage();
	regpage=new RegisterPage();
	regpage=landpage.register();
}
@Test
public void registrationTest() {
	regpage.new_registration();
	System.out.println("Registration successfull");
}
@AfterMethod
public void tearDown() {
	driver.close();
}
}
