package seleniumFunctions;

import org.openqa.selenium.WebElement;

public class GetText {

	public String getText(WebElement element) {
		String ele = element.getText();
		System.out.println("Text :" +ele);
		return ele;

	}
}
