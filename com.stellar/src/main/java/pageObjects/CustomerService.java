package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CustomerService {

	public WebElement txt_CustomerService(WebDriver driver) {
		WebElement element1 = driver.findElement(By.xpath("//div[@id='center_column']/h1"));
		return element1;
	}

	public WebElement dropdown_SubjectHeading(WebDriver driver) {
		WebElement element = driver.findElement(By.id("id_contact"));
		return element;
	}

}
