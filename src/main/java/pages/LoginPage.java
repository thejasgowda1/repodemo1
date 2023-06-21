package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class LoginPage extends Base{
	@FindBy(id = "input-email")
	WebElement username;
	
	@FindBy(id = "input-password")
	WebElement password;
	
	@FindBy(xpath = "//input[@type=\"submit\"]")
	WebElement loginbtn;
	

	
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	public void login() {
		username.sendKeys(prop.getProperty("username"));
		password.sendKeys(prop.getProperty("password"));
		loginbtn.click();
	
			
	
		
	}

}
