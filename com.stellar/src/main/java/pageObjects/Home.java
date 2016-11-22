package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home {
	WebDriver driver;

	public WebElement btn_getSavings() {
		WebElement element = driver.findElement(By.xpath("//div/a[@title='']"));
		return element;

	}

	public WebElement txt_logo() {
		WebElement element = driver.findElement(By.xpath("//a[@title='My Store']"));
		return element;
	}
}
