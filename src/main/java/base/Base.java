package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
public static Properties prop;
public static WebDriver driver;
	
	public Base() {
		
	    prop = new Properties();
		FileInputStream file = null;
		try {
			file=new FileInputStream("C:\\Users\\Thejas gowda\\eclipse-workspace\\ninjapractice\\src\\main\\java\\config\\data.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}try {
			prop.load(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
  public static void launchBrowser() {
	  String browserName = prop.getProperty("browser");
	  if(browserName.equals("chrome")) {
		  WebDriverManager.chromedriver().setup();
		  ChromeOptions ops = new ChromeOptions();
		  ops.addArguments("--remote-allow-origins=*");
		  driver = new ChromeDriver(ops);
	  }else if(browserName.equals("Firefox")) {
		  WebDriverManager.firefoxdriver().setup();
		  driver = new FirefoxDriver();
		  
	  }else if(browserName.equals("Edge")) {
		  WebDriverManager.edgedriver().setup();
		  driver = new ChromeDriver();
		  
	  }else {
		  System.out.println("invalid browserName"+browserName);
	  }
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(prop.getProperty("url"));
	  }
  }

