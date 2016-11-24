package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home {

	public WebElement btn_getSavings(WebDriver driver) {
		WebElement element = driver.findElement(By.xpath("//div/a[@title='']"));
		return element;

	}

	public WebElement txt_logo(WebDriver driver) {
		WebElement element = driver.findElement(By.xpath("//a[@title='My Store']"));
		return element;
	}

	public WebElement lnk_signin(WebDriver driver) {
		WebElement element = driver.findElement(By.partialLinkText("Sign in"));
		return element;
	}
}