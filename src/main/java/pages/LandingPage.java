package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class LandingPage extends Base{
	
	@FindBy(xpath = "//span[text()=\"My Account\"]")
	WebElement myaccount;
	
	@FindBy(xpath = "//a[text()=\"Register\"]")
	WebElement registr;
	
	@FindBy(xpath = "//a[text()=\"Login\"]")
	WebElement lgn;
	
	public LandingPage() {
		PageFactory.initElements(driver, this);
	}
public  RegisterPage register() throws Exception {
	myaccount.click();
	Thread.sleep(3000);
	registr.click();
	Thread.sleep(2000);
	return new RegisterPage();
	
}
public LoginPage login() throws Exception {
	myaccount.click();
	Thread.sleep(3000);
	lgn.click();
	Thread.sleep(3000);
	return new LoginPage();
}
}