package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class RegisterPage extends Base{
	@FindBy(xpath = "//input[@name=\"firstname\"]")
	WebElement fisrtname;
	
	@FindBy(xpath = "//input[@name=\"lastname\"]")
	WebElement lasttname;
	
	@FindBy(id = "input-email")
	WebElement email;
	
	@FindBy(id = "input-telephone")
	WebElement telephone;
	
	@FindBy(id = "input-password")
	WebElement password;
	
	@FindBy(id = "input-confirm")
	WebElement cnfpassword;
	
	@FindBy(xpath = "//input[@name=\"agree\"]")
	WebElement checkbox;
	
	@FindBy(xpath = "//input[@class=\"btn btn-primary\"]")
	WebElement contbtn;
	
	@FindBy(xpath = "//a[text()=\"Continue\"]")
	WebElement nextcnt;
	
	public RegisterPage() {
		PageFactory.initElements(driver, this);
	}
public HomePage new_registration() {
	fisrtname.sendKeys("Ram");
	lasttname.sendKeys("M");
	email.sendKeys("ram02982@gmail.com");
	JavascriptExecutor js= (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView();", contbtn);
	
	telephone.sendKeys("8123708739");
	password.sendKeys("Ramesh@99022");
	cnfpassword.sendKeys("Ramesh@99022");
	checkbox.click();
	contbtn.click();
	nextcnt.click();
	return new HomePage();
}
}
