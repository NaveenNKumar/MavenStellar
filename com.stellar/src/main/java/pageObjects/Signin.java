package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Signin {

	public WebElement txt_Authentication(WebDriver driver) {
		WebElement element = driver.findElement(By.xpath("//div[@id='center_column']/h1"));
		return element;
	}

}
