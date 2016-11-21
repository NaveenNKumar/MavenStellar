package com.stellar.general;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBrowserAndLaunchURL {
	WebDriver driver;
	String browser = "firefox";
	
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
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.navigate().to("http://automationpractice.com/index.php");
			
		}
	}
	}

}
