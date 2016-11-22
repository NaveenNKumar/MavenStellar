package com.stellar.general;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBrowserAndLaunchURL {
	public static WebDriver driver;
	String browser = "chrome";
	
	public void openBrowser(){
	if(browser.equals("firefox")){
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/index.php");
	}
	
	else 
	{
		if (browser.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "./src/test/java/TestRequirements/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.navigate().to("http://automationpractice.com/index.php");
			
		}
	}
	}

}
