package seleniumFunctions;

import org.openqa.selenium.WebElement;

public class EnterTextBox {

	public void enterTextinTextBox(WebElement element, String args1) {
		element.clear();
		element.sendKeys(args1);

	}

}
