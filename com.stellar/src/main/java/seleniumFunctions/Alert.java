package seleniumFunctions;

import org.openqa.selenium.WebDriver;

public class Alert {

	public void alertAccept(WebDriver driver) {
		org.openqa.selenium.Alert alert = driver.switchTo().alert();
		System.out.println("Alert message is : " + alert.getText());
		alert.accept();

	}

	public void alertDismiss(WebDriver driver) {
		org.openqa.selenium.Alert alert = driver.switchTo().alert();
		System.out.println("Alert message is : " + alert.getText());
		alert.dismiss();

	}

}
